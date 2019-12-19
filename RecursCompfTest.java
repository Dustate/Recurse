// Тест для рекурсивного компилятора формул.
import java.util.Scanner;
public class RecursCompfTest {
    public static void main(String[] args) throws Exception {
        RecursCompf c = new RecursCompf();
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("������� �������");
            str = sc.nextLine();
            c.compile(str.toCharArray());
        }
    }
}