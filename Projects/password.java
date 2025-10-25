
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
     System.out.print("Do you want generate a strong password of your email : ");   
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     while ("Yes".equals(str) || "YES".equals(str) || "yes".equals(str)) { 
         System.out.print("Enter your password : ");
         Scanner s = new Scanner(System.in);
         String str1 = s.nextLine();
         int i;
         for(i=0;str1[i]!='\0';i=i+1)
         {
            
         }
     }
    }
}
