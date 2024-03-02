import java.util.Scanner;
public class Conditional2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=in.nextInt();
        if(age>=18){
            System.out.println("you are eligible for voting:");
        }
        else{
            System.out.println("you are not eligible for voting:");
        }
    }
}
