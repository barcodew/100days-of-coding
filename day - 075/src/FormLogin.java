import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

public class FormLogin extends JFrame {

    JLabel labelSignIn;
    JLabel labelUsername;
    JLabel labelPassword;
    CTextField FieldUsername;
    CTextField FieldPassword;
    CButton btnLogin;

    FormLogin() {

        initUI();

        labelSignIn = new JLabel("SIGN IN");
        labelSignIn.setBounds(130, 202, 200, 50);
        labelSignIn.setFont(new Font("Poppins", Font.BOLD, 42));
        labelSignIn.setForeground(Color.decode("#0ea5e9"));

        labelUsername = new JLabel("USERNAME");
        labelUsername.setFont(new Font("Poppins", Font.CENTER_BASELINE, 16));
        labelUsername.setForeground(Color.decode("#0ea5e9"));
        labelUsername.setBounds(45, 310, 200, 50);
        
        FieldUsername = new CTextField();
        FieldUsername.setBounds(25, 350, 370, 60);


        labelPassword = new JLabel("PASSWORD");
        labelPassword.setFont(new Font("Poppins", Font.CENTER_BASELINE, 16));
        labelPassword.setForeground(Color.decode("#0ea5e9"));
        labelPassword.setBounds(45, 410, 200, 50);
        
        FieldPassword = new CTextField();
        FieldPassword.setBounds(25, 450, 370, 60);


        btnLogin = new CButton();
        btnLogin.setText("LOGIN");
        btnLogin.setBounds(25, 600, 370, 60);

        add(btnLogin);
        add(FieldPassword);
        add(labelPassword);
        add(labelUsername);
        add(FieldUsername);
        add(labelSignIn);
    }

    private void initUI() {
        setTitle("Form Login");
        setSize(430, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FormLogin();
            }

        });
    }
}
