package timer;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

//Тестирование внутренних классов

public class TimerTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(5000, false);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.beep = beep;
        this.interval = interval;
    }

    public void start() {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String now = new SimpleDateFormat("hh:mm:ss dd.MM.yyyy").format(new Date());
            System.out.println("Сейчас " + now + " г.");
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}