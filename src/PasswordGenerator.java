import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;

public class PasswordGenerator {
    public static void main(String [ ] args)
    {
        JFrame main = new JFrame("Password Generator");
        main.setSize(300,300);
        main.setResizable(false);
        main.setLayout(null);
        main.setLocationRelativeTo(null);
        main.getContentPane().setBackground(new Color(28,33,48));
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel PanelPasswordGen = new JPanel();
        PanelPasswordGen.setBounds(25,20,250,40);
        PanelPasswordGen.setBackground(new Color(2,143,118));
        main.add(PanelPasswordGen);

        Border WhiteBorder = BorderFactory.createLineBorder(Color.WHITE,1);
        Border DarkBorder = BorderFactory.createLineBorder(new Color(255,209,71),2);
        Border GreenBorder = BorderFactory.createLineBorder(new Color(121,200,75),2);
        PanelPasswordGen.setBorder(WhiteBorder);

        JLabel Password = new JLabel("Password",SwingConstants.CENTER);
        Password.setBounds(50,40,200,50);
        Password.setVisible(true);
        Password.setFont(new Font("Kalam", Font.PLAIN,18));
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

        JFrame MediumPopUp = new JFrame("Medium Password Creator");
        MediumPopUp.setBounds(0,0,400,300);
        MediumPopUp.setLocationRelativeTo(null);
        MediumPopUp.setVisible(false);
        MediumPopUp.setLayout(null);
        MediumPopUp.getContentPane().setBackground(new Color(255,234,173));

        //Medium Generator
        JTextField MediumTextField = new JTextField("",SwingConstants.CENTER);
        MediumTextField.setBounds(100,20,200,50);
        MediumTextField.setBackground(new Color(255,255,224));
        MediumTextField.setVisible(true);
        MediumPopUp.add(MediumTextField);
        MediumTextField.setBorder(DarkBorder);

        JButton MediumIncludeInPassword = new JButton("Include In Password");
        MediumIncludeInPassword.setBounds(20,180,150,50);
        MediumPopUp.add(MediumIncludeInPassword);

        JButton GenerateMediumRandom = new JButton("Generate One For Me");
        GenerateMediumRandom.setBounds(230,180,150,50);
        MediumPopUp.add(GenerateMediumRandom);

        MediumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MediumPopUp.setVisible(true);
            }
        });

        MediumIncludeInPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            MediumGenerator medgen = new MediumGenerator();
            String FiveRandomNumbers = medgen.MediumGen();
            String MediumIncludeIn = MediumTextField.getText();
            if(MediumIncludeIn.isEmpty())
            {
                Password.setText("You Left The Text Box Blank");
            }
            else
                Password.setText("%" + MediumIncludeIn + "#" + FiveRandomNumbers + ">");
                MediumPopUp.setVisible(false);
            }
        });

        GenerateMediumRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MediumGenerator medgen = new MediumGenerator();
                String FiveRandomLetters = medgen.FiveLetterGen();
                String RandomNumbers = medgen.MediumGen();
                Password.setText("<" + FiveRandomLetters + "!" + RandomNumbers + "@");
                MediumPopUp.setVisible(false);
            }
        });
        //Medium Generation

        //Easy Generation
        JFrame EasyPopUp = new JFrame("Easy Password Creator");
        EasyPopUp.setBounds(0,0,400,300);
        EasyPopUp.setLocationRelativeTo(null);
        EasyPopUp.setVisible(false);
        EasyPopUp.setLayout(null);
        EasyPopUp.getContentPane().setBackground(new Color(173,235,179));

        JTextField EasyTextField = new JTextField("",SwingConstants.CENTER);
        EasyTextField.setBounds(100,20,200,50);
        EasyTextField.setBorder(GreenBorder);
        EasyTextField.setBackground(new Color(230,255,204));
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
            if(EasyPasswordInclude.isEmpty())
            {
                Password.setText("You Left The Text Box Blank");
            }
            else
                Password.setText(EasyPasswordInclude + ExtraRandom + "!");
                EasyPopUp.setVisible(false);
            }
        });
        //Easy Generation
        main.setVisible(true);
    }
}