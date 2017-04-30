
public class SingletonEnum {
	public static void main(String[] args) {
		SingletonEnum1.INSTANCE.doStuff();
		System.out.println(SingletonEnum1.INSTANCE.hashCode());

		System.out.println(SingletonEnum1.INSTANCE.hashCode());

		System.out.println(SingletonEnum1.INSTANCE.hashCode());
	}
}
