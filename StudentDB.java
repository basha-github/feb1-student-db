import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class StudentDB {
	public static void main(String[] args) throws FileNotFoundException {
	
		ArrayList<Student> stuList = 
				new ArrayList<Student>();
		Student stu=null;
		for(int i=1;i<=500000;i++) {
			
			stu = new Student(
					i,
					"Stu"+i,"StPeters",
					GenerateRandom.getNo(3000, 65000),
					GenerateRandom.getNo(13,100),
					GenerateRandom.getNo(23,89),
					GenerateRandom.getNo(20,78)
					);
			
			stuList.add(stu);
		
		}
		
		
		
		
		PrintStream o = new PrintStream(new File("A.txt"));
		 
        // Store current System.out
        // before assigning a new value
        PrintStream console = System.out;
 
        // Assign o to output stream
        // using setOut() method
        System.setOut(o);
 
        // Display message only
        System.out.println(stuList);
		
        // Use stored value for output stream
        System.setOut(console);
 
        
		
		
		
		
	}

}
