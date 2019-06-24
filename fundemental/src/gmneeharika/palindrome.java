package gmneeharika;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 121, revIn = 0, rem, orgIn;
        orgIn = n;
        
        while( n != 0 )
        {
            rem = n % 10;
            revIn = revIn * 10 + rem;
            n  /= 10;
        }
       
        if (orgIn == revIn)
            System.out.println(orgIn + " is a palindrome.");
        else
            System.out.println(orgIn + " is not a palindrome.");
    
	}

}
