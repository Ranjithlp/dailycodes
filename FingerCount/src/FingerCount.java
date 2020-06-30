
public class FingerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int r =0;
		while(n>0) {
			for(int i=r+1;i<=5;i++) {
				r++;
				n=n-1;
				if(n==0)
					break;
			}
			if(n==0){
				break;
			}
			for(int i=r-1;i>=1;i--) {
				r--;
				n=n-1;
				if(n==0)
					break;
			}
		}
		System.out.println(r);
	}

}
