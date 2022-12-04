import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Number is 0");
        }
        else if(n == 1){
            System.out.println("Number is 1");
        }
        else if(n % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}