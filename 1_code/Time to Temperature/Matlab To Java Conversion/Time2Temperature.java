import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Time2Temperature {

	public static double[] meanAndStdiv(int[] list) {
		
		double[] returnArr = {0.0,0.0};
		 //reutrnArr = [mean,Std]
 		double ans = 0.0;
		for(int i=0; i<list.length; i++) {
			ans+=list[i];   
		}
		returnArr[0] = ans/list.length; // mean
		 
		double sd = 0;
		for (int i = 0; i < list.length; i++)
		{
		 
			sd += (Math.pow((list[i] - returnArr[0]) ,2)/ list.length);
		        
		}
		double standardDeviation = Math.sqrt(sd);
		returnArr[1] = standardDeviation; //std
		return returnArr;
	}
	
	
	public static int[] featureNormalize(int[] currentArr, int[] preferredArr, int[] outisdeArr, int lines, int[] mu ){
		
		
		
		
		
		int [] x = {0,0,0,0};
		return  x;
	}
	
    public static double t2t(int inital, int finalT, int outside) throws FileNotFoundException{
        File file = new File("data.txt");
    	Scanner scanner = new Scanner(file);
		int lines = 0;
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
			lines++;
		}
		int[] currentArr = new int[lines];
		int[] preferredArr = new int[lines];
		int[] outsideArr = new int[lines];
		int[] timeArr = new int[lines];
		scanner.close();
		scanner = new Scanner(file);
		int i = 0;
		System.out.println("current colomn");
		while(scanner.hasNextLine()){
			String[] temp = scanner.nextLine().split(",");
			currentArr[i] = Integer.valueOf(temp[0]);
			preferredArr[i] = Integer.valueOf(temp[1]);
			outsideArr[i] = Integer.valueOf(temp[2]);
			timeArr[i] = Integer.valueOf(temp[3]);
			i++;
		}
    	
    	
		
    	return 0.0;
    }


    public static boolean readFile(){
        return true;
    }

    
    public static void main(String[] args) throws FileNotFoundException{
    	
    	
    	int[] x = {1,2,3,4,5,6};
    	double[] y = meanAndStdiv(x);
    	System.out.println(y[0]);System.out.println(y[1]);
    	
		
    }
    
}