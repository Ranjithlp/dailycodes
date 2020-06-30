
public class ThreeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -3;
		int y = 2;
		int z = 4;
		int c = 1;
		while(x!=y) {
			if(x<y) {
				x = x+1;
				c++;
			}
			else {
				x = x-1;
				c++;
			}
			if(x==y)
				break;
		}
		while(y!=z) {
			if(y<z) {
				y = y+1;
				c++;
			}
			else {
				y = y-1;
				c++;
			}
			if(y==z)
				break;
		}
		
		System.out.println(c);
		
	}

}
