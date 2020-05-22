import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "\\3_decorator\\test.txt";
        int c;

        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}