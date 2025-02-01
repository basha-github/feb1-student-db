
public class GenerateRandom {
	
	// 500, 1500
	//
	static public void  showRandom(int min,int max) {
		int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
          
            // Output is different everytime this code is executed
            System.out.print(rand+" ");
        }
		
	}

	
	static public int  getNo(int min,int max) {
		int range = max - min + 1;

            int rNo = (int)(Math.random() * range) + min;
          
            return rNo;
		
	}

}
