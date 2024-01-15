
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize integer array that can hold 6 integers
		
		int[] myNumArr=new int[6];
		
		myNumArr[0]=1;
		myNumArr[1]=2;
		myNumArr[2]=3;
		myNumArr[3]=3;
		myNumArr[4]=3;
		myNumArr[5]=6;
		
		int len=myNumArr.length;
		
		for (int i=0; i<myNumArr.length;i++) {
			System.out.println(myNumArr[i]+" "+"is the number");
		}
		
		//Initialize string array
		String myName="It is a wonderful evening";
		String[] splitName=myName.split(" ");
		
		for (int j=0; j<splitName.length;j++) {
			System.out.println(splitName[j]+" "+"splitted");
		}
		
		//Another way to iterate for loop
		String[] names= {"John", "Rita", "Maria", "Crohn", "Debbie"};
		
		for (String newName: names) {
			System.out.println(newName);
		}
	}	
	
}
