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
    public static Button[] questions = {new Button("5"), new Button("10"), new Button("15"), new Button("20")};
    public static Button start;
    public static Label user_topic;
    public static Label user_ques;

    // MYSQL CREDENTIALS
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/quiz_db_schema";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "2806@mysql";
    public static final String DB_TABLE_NAME = "participants";
}
