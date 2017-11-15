
public class HashNode<K, V> {

	private K key;
	private V value;
	private boolean flag;
	private DNode<K, V> next;

	public HashNode() {
		next = null;
	}

	public void setKey(K newKey) {
		key = newKey;
	}

	public void setValue(V newValue) {
		value = newValue;
	}

	public void setNext(DNode<K, V> node) {
		next = node;
	}

	public void switchFlag() {
		if (flag == true) {
			flag = false;
		} else {
			flag = true;
		}
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public DNode<K, V> getNext() {
		return next;
	}

	public boolean getFlag() {
		return flag;
	}
}
