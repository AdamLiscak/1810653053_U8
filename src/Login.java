import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Login {
    public Login() {
    }

    public static void main(String[] args) {
    }

    public static boolean loginvalidate(String a, String b) {
        File file = null;
        FileReader ft = null;
        BufferedReader bt = null;
        boolean m = true;

        try {
            file = new File("login.txt");
            ft = new FileReader(file);
            bt = new BufferedReader(ft);

            String ki;
            while((ki = bt.readLine()) != null) {
                if (a.equals(b)) {
                    Geheimnis.geheimnis();
                    m = false;
                    break;
                }
            }

            if (m) {
                System.out.println("Gehen sie WEG !!!!! oder wir rufen GEHEIMDIENST AN");
            }
        } catch (Exception var15) {
            var15.printStackTrace();
        } finally {
            try {
                bt.close();
            } catch (IOException var14) {
                var14.printStackTrace();
            }

        }

        return m;
    }
}
