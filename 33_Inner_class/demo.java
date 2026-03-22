class Outer {
	int x = 10;

	class Inner {
		void show() {
			System.out.println(x); // Direct access
		}
	}
}

public class demo {
	public static void main(String[] args) {
		Outer obj = new Outer();
		Outer.Inner innerObj = obj.new Inner();
		innerObj.show();
	}
}
