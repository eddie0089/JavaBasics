
public class conditionalStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list= {1,2,3,4,5,6,8,10,12,18,19,22,20,29};
		
		for (int i: list) {
			
			if (i%2 == 0) {
				System.out.println(i);
				break; //if we get the first number in the array to be divisible by 2 then loop will stop with break command
			}
			else {
				System.out.println("Number is not divisible by 2");
			}
		}

	}

}
