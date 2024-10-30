package constants;

import java.awt.*;

public class Constants {
    // AWT FRAME
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 500;

    // AWT FRAME COMPONENTS
    public static Frame frame;
    public static Label heading;
    public static Label info;
    public static Label registerMessage;
    public static Label loginMessage;
    public static Button register;
    public static Button login;
    public static Label name;
    public static Label age;
    public static Label email;
    public static Label password;
    public static Label rePassword;
    public static Label result;
    public static TextField nameInput;
    public static TextField ageInput;
    public static TextField emailInput;
    public static TextField passwordInput;
    public static TextField rePassInput;
    public static Button submit;
    public static Button back;
    public static Label topic;
    public static Label num_questions;
    public static Button tech;
    public static Button general;
    public static Button q5 = new Button("5");
    public static Button q10 = new Button("10");
    public static Button q15 = new Button("15");
    public static Button q20 = new Button("20");
    public static Button[] questions = {q5, q10, q15, q20};

    // MYSQL CREDENTIALS
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/quiz_db_schema";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "2806@mysql";
    public static final String DB_TABLE_NAME = "participants";
}
