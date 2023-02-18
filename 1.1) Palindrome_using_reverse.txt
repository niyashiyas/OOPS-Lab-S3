import java.util.*;
class Palindrome_using_reverse {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String rev = new String("");
        for(int j=n-1,i=0 ; j>=0;j--){
            rev+=str.charAt(j);
            i++;
        }

	//to print reversed string
	System.out.println("Reverse: "+rev);

        if(str.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
    
}