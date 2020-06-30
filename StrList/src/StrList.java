
public class StrList {
	
	public static void rectangularFrame(String[] str) {
		int n = str.length;
		int c = 0;
		for(int i=0;i<n;i++) {
			if(str[i].length()>c) {
				c = str.length;
			}
		}
		System.out.println("*******");
		for(int i=0;i<n;i++) {
			int b = c-str[i].length();
			System.out.print("*"+str[i]);
			for(int j= 1;j<=b;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.println("*******");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"hello","World","in","a","frame"};
		rectangularFrame(a);

	}

}
