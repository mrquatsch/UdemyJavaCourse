public class NameTest {
	public static void main(String[] args) {
		// instantiation
		Name myName = new Name("Michael", "John", "Sterry");
		Name yourName = new Name("Raymond", "Williams");
		Name aName = new Name("Durr");
		Name someName;
		System.out.println("myName: " + myName.toString());
		System.out.println("yourName: " + yourName.toString());
	}
}
