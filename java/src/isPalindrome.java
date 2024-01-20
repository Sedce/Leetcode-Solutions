
public class isPalindrome {
	
	public boolean isPalindrome(int x) {
	    
        int temp = x;
        int comp = 0; 
        int sum = 0;

        if(x < 0)
            temp = x * -1;


        while (temp > 0){
            comp = temp % 10; 
            sum = (sum*10) + comp;
            temp = temp/10;
        }
        if(sum == x)
            return true;
        else
            return false;
    }

}
