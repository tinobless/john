import java.util.Scanner;

public class house{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int priceOne = sc.nextInt();
        int priceTwo = sc.nextInt();
        System.out.print("This house is $");
        System.out.print(priceOne + ". ");
        System.out.print("The change is $");
        System.out.print(priceOne - priceTwo);
        System.out.print(" since last month.");

    }}
