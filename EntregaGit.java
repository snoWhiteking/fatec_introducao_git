import javax.swing.JOptionPane;

public class EntregaGit {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, String.format ("Hello, %s!", name));
    }
}