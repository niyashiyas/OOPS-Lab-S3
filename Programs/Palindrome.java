import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int j = n-1, flag=0;
        for (int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(j)){
                flag=1;
                break;
            }
            j--;
        }
        if(flag==1){
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindrome");
        }
        sc.close();
    }
}