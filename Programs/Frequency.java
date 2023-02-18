import java.util.*;
public class Frequency{
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a string: "); 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n =str.length();
        System.out.println("Enter the character to search: "); 
        String ch = sc.nextLine();
        for(int i=0; i<n; i++){
            if(str.charAt(i)==ch.charAt(0)){
                count++;
            }
        }
        System.out.println("Count is:"+count);

        sc.close();

    }
}