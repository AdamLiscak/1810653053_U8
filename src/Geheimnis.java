import java.awt.Component;
import javax.swing.JOptionPane;

public class Geheimnis {
    public Geheimnis() {
    }

    public static void main(String[] args) {
        enterGeheimnis();
    }

    public static void enterGeheimnis() {
        boolean a = true;
        boolean n = JOptionPane.showConfirmDialog((Component)null, "Brauchen sie Registrieren", "Hallo da Neugieriger AtombombenBauer", 0) == 0;
        if (!n) {
            while(a) {
                a = Login.loginvalidate(JOptionPane.showInputDialog("name"), JOptionPane.showInputDialog("passwort"));
            }
        } else {
            Register.write(Register.load(JOptionPane.showInputDialog("name bitte"), JOptionPane.showInputDialog("passwort bitte")));

            while(a) {
                a = Login.loginvalidate(JOptionPane.showInputDialog("name"), JOptionPane.showInputDialog("passwort"));
            }
        }

    }

    public static void geheimnis() {
        System.err.println("Herstellungsanleitung für eine Atombombe");
        System.out.println(" Zuerst nimmt man Uran .... am besten 100% U235, weil er spontaner reagiert...");
        System.out.println("aber wenn man so will kann man auch einen geringen Prozentsatz an U238 verwenden, man erstellt extrem hohen druck über einen Lithiumkopf... ");
        System.out.println("und voila Spontane Explosion... Ooops was ist mit Boston passiert?");
    }
}
