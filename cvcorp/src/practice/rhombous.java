package practice;

public class rhombous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=8;
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int j=1;j<=n;j++) {
				if(j<=n-i) {
					System.out.print(" ");
				}else {
					c=c+1;
					if(c%4==1 ||c%4==2) {
				System.out.print("*");
					}else{
						System.out.print("_");
					}
				
	
				}
				}
			for(int j=i;j>=1;j--) {
				if(j%4==1 || j%4==2) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			int c=0;
			for(int j=1;j<=n;j++) {
				if(j<=n-i) {
					System.out.print(" ");
				}else {
					c=c+1;
					if(c%4==1 ||c%4==2) {
				System.out.print("*");
					}else{
						System.out.print("_");
					}
				
	
				}
				}
			for(int j=i;j>=1;j--) {
				if(j%4==1 || j%4==2) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println();
		}

	}

}
