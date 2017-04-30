package Test1;

class KeyValuePair<K, V> {
	K key;
	V value;
	KeyValuePair<K, V> next = null;

	public synchronized K getKey() {
		return key;
	}

	public synchronized void setKey(K key) {
		this.key = key;
	}

	public synchronized V getValue() {
		return value;
	}

	public synchronized void setValue(V value) {
		this.value = value;
	}

	public KeyValuePair<K, V> getNext() {
		return next;
	}

	public void setNext(KeyValuePair<K, V> next) {
		this.next = next;
	}

	public KeyValuePair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}
}

public class myCustomeHashMap<K, V> {
	KeyValuePair<K, V> mapList[] = new KeyValuePair[100];

	public void put(K key, V value) {
		int index = key.hashCode();
		storeData(index, key, value);

	}

	public void storeData(int index, K key, V value) {
		boolean done = false;
		KeyValuePair<K, V> list = mapList[index];
		if (list == null) {
			mapList[index] = new KeyValuePair<K, V>(key, value);
		} else {
			while (list.next != null) {
				if (list.key.equals(key)) {
					list.value = value;
					done = true;
				}
			}
			if (!done) {
				list.next = new KeyValuePair<K, V>(key, value);
			}
		}

	}

	public myCustomeHashMap(KeyValuePair<K, V>[] mapList) {
		super();
		this.mapList = mapList;
	}
}
