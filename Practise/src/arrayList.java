import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"John", "Rita", "Maria", "Crohn", "Debbie"};

		ArrayList<String> myArr=new ArrayList<String>();
		myArr.add("This");
		myArr.add("is");
		myArr.add("wonderful");
		myArr.add("evening");
		myArr.add("fellas");
		
		System.out.println(myArr.get(3));
		System.out.println("------------------------");
		
		for (int i=0; i<myArr.size();i++) {
			System.out.println(myArr.get(i));
		}
		System.out.println("-------------------------");
		
		for (String s: myArr) {
			System.out.println(s);
		}
		System.out.println("--------------------------");
		System.out.println(myArr.contains("lyca"));
		System.out.println(myArr.contains("This"));
		
		//converting array to arraylist
	    List<String> nameArrList=Arrays.asList(names);
	    
	}

}
