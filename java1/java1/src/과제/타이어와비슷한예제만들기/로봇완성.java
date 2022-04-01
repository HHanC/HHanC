package °úÁ¦.Å¸ÀÌ¾î¿Íºñ½ÁÇÑ¿¹Á¦¸¸µé±â;

public class ·Îº¿¿Ï¼º {

	public static void main(String[] args) {
	
		·Îº¿ ÀÌÁ¨·Îº¿ = new ·Îº¿();
		
		for(int i = 1; i<=5; i++) {
			
			int problemLocation = ÀÌÁ¨·Îº¿.run();
			
			switch(problemLocation) {
			
			case 1:
				System.out.println("¸íÈ£Çü ¿ŞÂÊÆÈ ±³Ã¼");
				ÀÌÁ¨·Îº¿.¿ŞÂÊÆÈ = new ¸íÈ£ÇüÆÈ("¿ŞÂÊÆÈ", 15);
				break;		
			case 2:
				System.out.println("¿äÇÑÀÌ ¿À¸¥ÂÊÆÈ ±³Ã¼");
				ÀÌÁ¨·Îº¿.¿ŞÂÊÆÈ = new ¸íÈ£ÇüÆÈ("¿ŞÂÊÆÈ", 13);
				break;	
			case 3:
				System.out.println("°­»ç´Ô ¿ŞÂÊ´Ù¸® ±³Ã¼");
				ÀÌÁ¨·Îº¿.¿ŞÂÊÆÈ = new ¸íÈ£ÇüÆÈ("¿ŞÂÊÆÈ", 14);
				break;	
			case 4:
				System.out.println("¼±±âÇü ¿À¸¥ÂÊ´Ù¸® ±³Ã¼");
				ÀÌÁ¨·Îº¿.¿ŞÂÊÆÈ = new ¸íÈ£ÇüÆÈ("¿ŞÂÊÆÈ", 17);
				break;	
			}
			System.out.println("-----------------------");
		}
	}
}
