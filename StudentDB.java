import java.util.ArrayList;

public class StudentDB {
	public static void main(String[] args) {
	
		ArrayList<Student> stuList = 
				new ArrayList<Student>();
		Student stu=null;
		for(int i=1;i<=500000;i++) {
			
			stu = new Student(
					GenerateRandom.getNo(13000, 28000)
					,"Stu"+i,"StPeters",
					GenerateRandom.getNo(3000, 65000),
					GenerateRandom.getNo(13,100),
					GenerateRandom.getNo(23,89),
					GenerateRandom.getNo(20,78)
					);
			
			stuList.add(stu);
		
		}
		
		System.out.println(stuList);
		
		
		
		
		
		
		
	}

}
