import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGenerator {
    String easy = "";
    String Medium = "";
    String Hard = "";
    public static void main(String [ ] args)
    {
        JFrame main = new JFrame("Password Generator");
        main.setSize(300,300);
        main.setResizable(false);
        main.setLayout(null);
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel PanelPasswordGen = new JPanel();
        PanelPasswordGen.setBounds(50,20,200,50);
        PanelPasswordGen.setBackground(Color.PINK);
        main.add(PanelPasswordGen);

        JLabel Password = new JLabel("Password");
        Password.setBounds(50,20,200,50);
        Password.setVisible(true);
        Password.setFont(new Font("Kalam", Font.PLAIN,15));
        PanelPasswordGen.add(Password);
        main.setVisible(true);

    }
}
