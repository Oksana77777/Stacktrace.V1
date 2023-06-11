import java.util.Scanner;

public class TestException extends NumberFormatException {
    public TestException(String[] parts) {

    }

    public static void main(String[] args) {

        int num;
        Scanner in = new Scanner(System.in);
        try {
            num = Integer.parseInt(in.next());
            System.out.println(num);
        } catch (NumberFormatException ex) {
            System.out.println("Введен недопустимый символ");
        }
    }
}
