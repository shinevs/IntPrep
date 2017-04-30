package Test1;

class count {
	public volatile Integer counter = 0;

}

public class Print {
	Integer id;

	@Override
	public int hashCode() {
		int prime = 31;
		int result = 0;
		result = prime * result + ((id == 0) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Print newObj = (Print) obj;
		if (id == null) {
			if (newObj.id != null)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
