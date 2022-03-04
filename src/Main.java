import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = (int) (Math.random() * 100);

        int[] prediction = new int[5];
        int right = 5;


        while (right != 0) {
            System.out.print("Enter a number: ");
            int scanNumber = scan.nextInt();


            if (scanNumber < 0 || scanNumber > 99) {
                System.out.println("Incorrect entry. (Number range is '0 to 100')");
                continue;
            }
            if (scanNumber == number) {
                System.out.println("Perfect :). You guessed the number correctly!");
                break;
            } else {
                prediction[right - 1] = scanNumber;
                right--;
                System.out.println("Wrong number! You have " + right + " more right ! ");
                if (scanNumber < number && right != 0) {
                    System.out.println("Clue: Bigger than " + scanNumber + " :)");
                } else if (scanNumber > number && right != 0) {
                    System.out.println("Clue: Smaller than " + scanNumber + " :)");
                }
            }
        }
        if (right == 0) {
            System.out.println();
            System.out.println("You lost! :( ");
            System.out.println("The number is '" + number + "'");
            System.out.print("Your predictions are : ");
            for (int i = prediction.length - 1; i >= 0; i--) {
                System.out.print(prediction[i] + "  ");
            }
        }

    }
}
