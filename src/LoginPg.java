import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static constants.Constants.*;
import db.JDBC;

public class LoginPg implements ActionListener {
    LoginPg(Frame frame){
        //frame
        frame.setTitle("Login");

        //labels
        heading = new Label("LOGIN");
        heading.setBounds(145, 50, 200, 30);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        name = new Label("NAME: ");
        name.setBounds(40, 110, 100, 30);
        name.setFont(new Font("Brush Script MT", Font.BOLD, 24));
        email = new Label("E-MAIL ID: ");
        email.setBounds(40, 200, 200, 30);
        email.setFont(new Font("Brush Script MT", Font.BOLD, 24));
        password = new Label("PASSWORD: ");
        password.setBounds(40, 290, 200, 30);
        password.setFont(new Font("Brush Script MT", Font.BOLD, 24));
        result = new Label();
        result.setBounds(130, 360, 300, 30);
        result.setFont(new Font("Agency FB", Font.BOLD, 20));

        //TextFields
        nameInput = new TextField();
        nameInput.setBounds(250, 110, 240, 30);
        nameInput.setFont(new Font("Brush Script MT", Font.PLAIN, 20));
        emailInput = new TextField();
        emailInput.setBounds(250, 200, 240, 30);
        emailInput.setFont(new Font("Brush Script MT", Font.PLAIN, 20));
        passwordInput = new TextField();
        passwordInput.setBounds(250, 290, 240, 30);
        passwordInput.setFont(new Font("Brush Script MT", Font.PLAIN, 20));

        //button
        login = new Button("LOGIN");
        login.setBounds(185, 420, 100, 30);
        login.setFocusable(false);
        login.addActionListener(this);
        login.setFont(new Font("Brush Script MT", Font.PLAIN, 15));
        back = new Button("BACK");
        back.setBounds(10, 35, 100, 30);
        back.setFont(new Font("Serif", Font.PLAIN, 15));
        back.addActionListener(this);
        back.setForeground(new Color(0, 100, 100));

        //adding components to the frame
        frame.add(heading);
        frame.add(name);
        frame.add(email);
        frame.add(password);
        frame.add(nameInput);
        frame.add(emailInput);
        frame.add(passwordInput);
        frame.add(login);
        frame.add(result);
        frame.add(back);

        //frame features
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            String name = nameInput.getText();
            String email = emailInput.getText();
            String password = passwordInput.getText();
            if(JDBC.loginUser(name, email, password)){
                result.setText("LOGIN SUCCESSFUL");
                result.setForeground(new Color(0, 255, 0));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                frame.dispose();
                new Intro(name);
            }else{
                result.setText("LOGIN FAILED");
                result.setForeground(new Color(255, 0, 0));
            }
        }

        if(e.getSource() == back){
            frame.dispose();
            new MainContent();
        }
    }
}