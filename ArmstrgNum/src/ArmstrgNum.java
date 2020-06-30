import java.util.Scanner;
public class ArmstrgNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		int r, sum =0,temp;
		temp=a;
		while(a>0) {
			r = a%10;
			sum = sum+(r*r*r);
			a = a/10;
		}
		if(sum==temp) {
			System.out.println("the num is an armstrg num");
		}
		else {
			System.out.println("the num is not an armstrg num");
		}

	}

}
