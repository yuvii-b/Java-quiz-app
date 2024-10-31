import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static constants.Constants.*;

public class GameWindow {
    GameWindow(String topic, int no_questions) {
        frame = new Frame("GAME!");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
