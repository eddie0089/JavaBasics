
public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Two ways of declaring a string
		//First way
		//Lateral creation
		String s="Tom John is learning selenium";
		String s1="Tom John is learning selenium";
		
//In the above case only 1 object would be created as String s already stores the same as s1
		
		//Second way
		String s2=new String("Bhaskar Chaddha is learning selenium");
		String s3=new String("Bhaskar Chaddha is learning selenium");
		
//In the above case 2 objects would be created as we are forcing to create 2 objects explicitely
		
		String[] oper=new String[5];
		oper[0]="Bhaskar";
		oper[1]="Chaddha";
		oper[2]="is";
		oper[3]="learning";
		oper[4]="selenium";
		
		String[] myNames=s.split(" "); //here you need to also declare array to store output
		System.out.println(myNames[0]);
		System.out.println(myNames[1]);
		System.out.println(myNames[2]);
		System.out.println(myNames[3]);
		System.out.println(myNames[4]);
		
		//printing all characters of the string
		for (int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
		}
		//printing the characters in reverse order
		for (int j=s.length()-1;j>=0;j--) {
			System.out.println(s.charAt(j));
		}

	}

}
