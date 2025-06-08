public class palindrome {
    public static void main(String[] args) {
        int number=-121;
        System.out.println("IS PALINDROME: " + isPalindrome(number));
    }
    public static boolean isPalindrome(int x){
        if(x<0){
            System.out.println("negative is invalid");
        }
        int rev=0;
        int n=x;
        while (n>0) {
            int d=n%10;
            rev=rev*10+d;
            n/=10;  
        }
        if(x==rev){
            return true;
        }
        return false;

    }
}
