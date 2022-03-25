package Day17;

public class Pair< K , V> {
	
	// ÇÊµå
	private K key;
	private V value;
	// »ý¼ºÀÚ
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	// ¸Þ¼Òµå [ get , set ] 
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
	

}