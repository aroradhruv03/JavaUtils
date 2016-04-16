package StandaloneApps_UI;

import javax.swing.*;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 * @author - Dhruv
 * @Name - Mad Clicker !
 * @Version - 1.0
 * A clicking app! Just makes a lot of clicks per second! You can control the time,hence the no of clicks.!
 * Why!?
 *      1. To test something (mouseClickListeners??) requiring a lot of clicks!
 *      2. To play the clicker games! (Well it's not cheating.. It's just insane no of clicks per sec! :p )
 *
 * Uses Java's Robot class to automate this. More fun with RobotClass coming up..!
 *
 * Possible bugs/problems or Future Upgrades ->
 *      1. Too many clicks per sec for some mouseClickListeners to handle at time. It's not my bug, it's theirs :p
 *      2. Sometimes the prog might hang from overuse of this app.
 **/
public class MadMouseClicker
{
    private JTextField textField1;
    private JTextField textField2;

    /** Main class to implement it.! **/
    public static void main(String[] args) throws Exception
    {
        /** Enter the delay in ms, this is no of clicks per mili sec.!
         * Let this be 100 or 10. else many mouseClickListeners may fail
         **/
        int clicksPerMiliSec = 1;

        int timeOut = 10; // No of seconds after which this prog will start.!
        int duration = 15;  // Set the duration here... 5 here means 5 seconds of clicks!


        System.out.println("Starting in "+timeOut+" sec ... ");
        long start = System.currentTimeMillis();
        long end = start + timeOut*1000; // 60 seconds * 1000 ms/sec

        while (System.currentTimeMillis() < end)
        {
            // run - this is the timeout..
        }

        Robot robot = new Robot();

        System.out.println("Starting Mad Clicker ... for "+duration+" seconds!\nWith "+clicksPerMiliSec+" clicks per ms.!");

        start = System.currentTimeMillis();
        end = start + duration*1000;
        while (System.currentTimeMillis() < end)
        {
            robot.delay(clicksPerMiliSec);

            robot.mousePress(InputEvent.BUTTON1_MASK); // Press mouse button 1
            robot.mouseRelease(InputEvent.BUTTON1_MASK); // Release button 1
        }
        System.exit(1);
    }
}