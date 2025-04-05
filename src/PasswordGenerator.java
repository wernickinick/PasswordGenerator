import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGenerator {
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

        JButton HardButton = new JButton("Generate Hard Password");
        HardButton.setBounds(20,180,200,50);
        main.add(HardButton);

        //Easy Generation
        JFrame EasyPopUp = new JFrame("Easy Password Creator");
        EasyPopUp.setBounds(0,0,400,300);
        EasyPopUp.setLocationRelativeTo(null);
        EasyPopUp.setVisible(false);
        EasyPopUp.setLayout(null);
        EasyPopUp.getContentPane().setBackground(new Color(173,235,179));

        JTextField EasyTextField = new JTextField("",SwingConstants.CENTER);
        EasyTextField.setBounds(100,20,200,50);
        EasyTextField.setVisible(true);
        EasyPopUp.add(EasyTextField);

        JButton IncludeInPassword = new JButton("Include In Password");
        IncludeInPassword.setBounds(20,180,150,50);
        EasyPopUp.add(IncludeInPassword);

        JButton GenerateEasyRandom = new JButton("Generate One For Me");
        GenerateEasyRandom.setBounds(230,180,150,50);
        EasyPopUp.add(GenerateEasyRandom);

        //Easy Jframe Generation
        EasyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EasyPopUp.setVisible(true);
            }
        });

        //Generates a Random 8 Character Password
        GenerateEasyRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EasyGenerator EasyGen = new EasyGenerator();
                String RandomLetters = EasyGen.AIPassword();
                String RandomNumbers = EasyGen.GeneratePassword();
                Password.setText(RandomLetters + RandomNumbers + "!");
                EasyPopUp.setVisible(false);
            }
        });

        //Adds whatever is in the text box to the password and 3 numbers with !
        IncludeInPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            EasyGenerator EasyGen = new EasyGenerator();
            String EasyPasswordInclude = EasyTextField.getText();
            String ExtraRandom = EasyGen.GeneratePassword();
            Password.setText(EasyPasswordInclude + ExtraRandom + "!");
            EasyPopUp.setVisible(false);
            }
        });
        //Easy Generation
        main.setVisible(true);
    }
}