import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/** задача номер 4
 *
 */
public class Transfer {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число в двоичной системе");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String binary = reader.readLine();
        int number = Integer.parseInt(binary,2);
        System.out.println("В десятичной системе оно равно: "+ number);
    }
}
