import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javaPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] value=new int[3];
		value[0]=2;
		value[1]=1;
		value[2]=3;
		
		ArrayList<String> myArr = new ArrayList<String>();
		myArr.add("Stupid");
		myArr.add("Moron");
		myArr.add("Rascal");
		myArr.add("Nincompoop");
		
		for (int k=0;k<myArr.size();k++) {
			System.out.println(myArr.get(k));
		}		
			
		for (int i=0;i<value.length;i++) {
			System.out.println("The number is "+value[i]);
		}
		
		String[] name= {"Bhaskar", "Chaddha", "is", "a", "fool", "in", "IT"};
		for (String myName: name) {
			System.out.println(myName);
		}
		
		List<String> name2=Arrays.asList(name);
				
		int[] number= {1,3,15,14,13,17,19,20,28,23,25,26,38,32};
		for (int j=0;j<number.length;j++) {
			if(number[j] %2 ==0) {
			System.out.println(number[j]);
		}

	}
    String s= "Bhaskar Chaddha is a good boy";
    for (int y=0;y<s.length();y++) {
    	System.out.println(s.charAt(y));
    }
    System.out.println("****************");
    for (int b=s.length()-1; b>=0; b--) {
    	System.out.println(s.charAt(b));
    }
	}
}
