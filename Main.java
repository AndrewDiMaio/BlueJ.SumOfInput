import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int pickedNumber = number.nextInt();
        System.out.println("User Picked: " + pickedNumber);
        
        int total = 0;
        for (Integer i = 0; i < pickedNumber; i++){
            total+=i+1;
        }
        System.out.println(total);
}
}
