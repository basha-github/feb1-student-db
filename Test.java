public class Test {

	public static void main(String[] args) {

		Student stu1 = new Student(100,"Stu1","StPeters",
				98000,88,99,56);
		
		System.out.println(stu1);
		System.out.println("maths marks\n");
		GenerateRandom.showRandom(20,100);
		System.out.println("\n sci marks\n");
		GenerateRandom.showRandom(35,87);
		System.out.println("\n eng marks\n");
		GenerateRandom.showRandom(40,90);
		
	}

}
