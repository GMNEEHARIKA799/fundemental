package gmneeharika;
public class primecom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,count=0,i=1;
		if(n==1) {
			System.out.println("neither composite nor prime.");	
		}
		else if(n%i==0) {
			i++;
			count ++;
		}
		if(count<=2) {
			System.out.println("prime number");
		}
		else if(n%2==0) {
				
			System.out.println("composite number");
			
			
		}
	}

}
