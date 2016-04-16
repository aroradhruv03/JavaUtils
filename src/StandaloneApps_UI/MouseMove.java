package StandaloneApps_UI;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

/**
 * @author Dhruv
 * @Version - 2.0
 * This small program keeps moving your mouse pointer at definite intervals of time. This prevents the PC from shutting off the screen or from locking you out every 60sec..!
 * Why!?
 *      1. Because sometimes you work and some apps require you to keep the screen open for a session.
 *          What's better is .. You can custom set a timeout, and give a large time-out like 60sec and pixelMove as 1, and this program will run in background without even being noticed.
 *      2. Or can be used as a 'Prank!'. Move the mouse fast enough and tell people it's a ghost in their machine...!
 *
 * Uses Java's Robot class to automate this. More fun with RobotClass coming up..!
 *
 * Possible bugs/problems or Future Upgrades ->
 *      1. *Pointer moves out of screen. (*Fixed in 2.0)
 *      2. No GUI yet !
 *      3. Also the prog doesn't auto-kill after a definite period, you have to manually exit it.
 **/
public class MouseMove
{
    /** Main class to implement it.! **/
    public static void main(String[] args) throws Exception
    {
        /** Enter the delay in ms. Time it takes for the mouse pointer to move. Keep it 100 for the ghost prank and 60000 to get work done **/
        int time = 1000;

        /** Specify how many pixels you want this program to move your mouse. I've kept it at one. You should too.
         * @Warning If you keep this too high and the time too low, you may not be able to control your mouse to even exit this program..!
         **/
        int pixelMove = 1;

        Robot robot = new Robot();

        System.out.println("Starting Mouse Move ... ");
        /** Fair Warning - This is an infinite loop! **/
        for (;;)
        {
            robot.delay(time);
            Point pObj = MouseInfo.getPointerInfo().getLocation();

            robot.mouseMove(pObj.x + pixelMove, pObj.y + pixelMove);
                //System.out.println(pObj.toString() + "x>>" + pObj.x + "  y>>" + pObj.y); // Just for debugging
            robot.mouseMove(pObj.x - pixelMove, pObj.y - pixelMove);
                //pObj = MouseInfo.getPointerInfo().getLocation(); // Just for debugging
                //System.out.println(pObj.toString() + "x>>" + pObj.x + "  y>>" + pObj.y); // Just for debugging
        }
    }
}