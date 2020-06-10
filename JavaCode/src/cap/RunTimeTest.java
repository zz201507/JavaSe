package cap;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class RunTimeTest {
    public static void main(String[] args) throws IOException, ParseException, AWTException, InterruptedException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = df.parse("2020-05-24 23:36:45");
        System.out.println(date);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                    try {

                        Runtime.getRuntime().exec("D:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask,date);
        Robot robot = new Robot();
        Thread.sleep(10000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        timer.cancel();
    }
}
