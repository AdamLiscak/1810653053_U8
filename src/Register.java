import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Register {
    public Register() {
    }

    public static void main(String[] args) {
        write(load(JOptionPane.showInputDialog("name bitte"), JOptionPane.showInputDialog("passwort bitte")));
    }

    public static String load(String a, String b) {
        File file = null;
        FileReader ft = null;
        BufferedReader bt = null;
        String mytxt = "";

        try {
            file = new File("login.txt");
            ft = new FileReader(file);
            bt = new BufferedReader(ft);

            String mystring;
            for(mytxt = System.getProperty("line.separator"); (mystring = bt.readLine()) != null; mytxt = System.getProperty("line.separator")) {
                ;
            }
        } catch (Exception var16) {
            var16.printStackTrace();
        } finally {
            try {
                bt.close();
            } catch (IOException var15) {
                var15.printStackTrace();
            }

        }

        return mytxt;
    }

    public static void write(String a) {
        File file = null;
        FileWriter ft = null;
        BufferedWriter bt = null;

        try {
            file = new File("login.txt");
            ft = new FileWriter(file);
            bt = new BufferedWriter(ft);
            bt.write(a);
        } catch (Exception var13) {
            var13.printStackTrace();
        } finally {
            try {
                bt.close();
            } catch (IOException var12) {
                var12.printStackTrace();
            }

        }

    }
}
