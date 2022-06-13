package controller.board;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.json.JSONArray;
import org.json.JSONObject;

@ServerEndpoint("/Dm/{mname}") 
public class Dm {
	// 접속자 명단
	public static Map<Session, String> clients = new Hashtable<>(); // 동기화 [한명씩 처리]
	// 1. 소켓 오픈
	@OnOpen
	public void OnOpen(Session session , @PathParam("mname")String mname){
						// @PathParam  : URL 경로상의 변수의 인수로 가져오기
		clients.put(session, mname);
		
		try {
			
			JSONArray array = new JSONArray();
			for(Session s : clients.keySet()) {
				JSONObject object = new JSONObject();
				object.put("type", "2");
				object.put("mname", clients.get(s));
					// Map객체.keyset() : map객체내 모든 키 호출 
					// Map객체.get( 키 )  : map객체내 해당 키 에 해당하는 값 호출 
				array.put(object);
			}
			for( Session s : clients.keySet() ) { // 리스트에 존재하는 세션들에게 메시지 보내기
				// map객체.keyset() : 모든 키 를 호출 
				s.getBasicRemote().sendText( array.toString() );
			}
		} catch (Exception e) {}
	}
		// 2. 소켓 닫기 
		@OnClose
		public void OnClose( Session session ) {
			clients.remove( session );	// 해당 세션 제거 
			
			try {
				// 1. // 모든 세션의 접속된 아이디를 json형으로 변환
				JSONArray array = new JSONArray();
				for( Session s : clients.keySet() ) { 
					JSONObject object = new JSONObject();
					object.put("type", "2" );
					object.put("mname", clients.get( s ) );
								// Map객체.keyset() : map객체내 모든 키 호출 
								// Map객체.get( 키 )  : map객체내 해당 키 에 해당하는 값 호출 
					array.put(object);
				}
				// 2. 전송 
				for( Session s : clients.keySet() ) { // 리스트에 존재하는 세션들에게 메시지 보내기
					// map객체.keyset() : 모든 키 를 호출 
					s.getBasicRemote().sendText( array.toString() );
				}
			}catch (Exception e) { System.out.println(e); }
			
		}
		// 3. 소켓 메시지 받는다 -> 모든 유저에게 보내기
		@OnMessage
		public void OnMessage( String msg , Session session) throws IOException {
				
			for( Session s : clients.keySet() ) { // 리스트에 존재하는 세션들에게 메시지 보내기
							// map객체.keyset() : 모든 키 를 호출 
				s.getBasicRemote().sendText(msg);
			}
			
		}
	
	
	
}
