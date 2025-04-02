import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.random.*;

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
        PanelPasswordGen.setBounds(50,20,200,30);
        PanelPasswordGen.setBackground(Color.PINK);
        main.add(PanelPasswordGen);

        JLabel Password = new JLabel("Password",SwingConstants.CENTER);
        Password.setBounds(50,40,200,50);
        Password.setVisible(true);
        Password.setFont(new Font("Kalam", Font.PLAIN,15));
        PanelPasswordGen.add(Password);

        JButton EasyButton = new JButton("Generate Easy Password");
        EasyButton.setBounds(20,80,200,50);
        main.add(EasyButton);

        JButton MediumButton = new JButton("Generate Medium Password");
        MediumButton.setBounds(20,130,200,50);
        main.add(MediumButton);

        JButton HardButton = new JButton("Generate Medium Password");
        HardButton.setBounds(20,180,200,50);
        main.add(HardButton);


        //create a random class so the strung will create random characters
        EasyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //this is just random

        main.setVisible(true);
    }
}
