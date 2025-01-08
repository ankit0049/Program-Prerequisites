import java.util.Scanner;

public class AddTwoNumber { 

    private static int AddTwoNumbers(int num1 , int num2)
    {
        return num1 + num2 ;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int num1 = sc.nextInt();
         int num2 = sc.nextInt(); 

         int Answer = AddTwoNumbers( num1 , num2);  

         System.out.println("Sum of Two Number is:"+ Answer);

         sc.close();

    }
}