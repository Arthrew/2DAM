package proyecto_psp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 *
 * @author lopez
 */
public class Proyecto_PSP {

    private Robot robot;

    private static final int SPEED = 300;

    private void execute(int letter[]) {
        try {
            robot = new Robot();

        } catch (AWTException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < letter.length; i++) {
            robot.delay(SPEED);
            robot.keyPress(letter[i]);

            robot.keyRelease(letter[i]);
        }
    }

    public static void main(String[] args) throws IOException, AWTException {

        Proyecto_PSP t = new Proyecto_PSP();

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(1 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        int[] executeNotepad
                = {KeyEvent.VK_WINDOWS, KeyEvent.VK_N, KeyEvent.VK_O, KeyEvent.VK_T, KeyEvent.VK_ENTER};
        t.execute(executeNotepad);
        int[] messageToPrint
                = {KeyEvent.VK_A, KeyEvent.VK_H, KeyEvent.VK_O, KeyEvent.VK_R, KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_E, KeyEvent.VK_L,
                    KeyEvent.VK_SPACE, KeyEvent.VK_P, KeyEvent.VK_R, KeyEvent.VK_O, KeyEvent.VK_C, KeyEvent.VK_E, KeyEvent.VK_S, KeyEvent.VK_O,
                    KeyEvent.VK_SPACE, KeyEvent.VK_SPACE, KeyEvent.VK_SPACE, KeyEvent.VK_3, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD,
                    KeyEvent.VK_2, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD, KeyEvent.VK_1, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD};
        t.execute(messageToPrint);

        {
            ProcessBuilder pb = new ProcessBuilder("notepad");
            pb.start();

        }

        int[] closeIt
                = {KeyEvent.VK_ALT, KeyEvent.VK_SPACE, KeyEvent.VK_N};
        t.execute(closeIt);
        int[] executeChrome
                = {KeyEvent.VK_WINDOWS, KeyEvent.VK_C, KeyEvent.VK_H, KeyEvent.VK_ENTER};
        t.execute(executeChrome);
        int[] executeYoutube
                = {KeyEvent.VK_Y, KeyEvent.VK_O, KeyEvent.VK_U, KeyEvent.VK_ENTER};
        t.execute(executeYoutube);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(4 * 1000);
        } catch (Exception e) {
            System.out.println(e);

        }
        //instanciamos la clase Robot

        Robot robot3 = new Robot();

        //cambia la posición en pantalla del puntero a las coordenadas
        //X=300 e Y=600.
        robot3.mouseMove(651, 129);

        robot3.mousePress(InputEvent.BUTTON1_MASK);
        robot3.mouseRelease(InputEvent.BUTTON1_MASK);

        int[] messageToPrint2
                = {KeyEvent.VK_R, KeyEvent.VK_O, KeyEvent.VK_O, KeyEvent.VK_M, KeyEvent.VK_B, KeyEvent.VK_A, KeyEvent.VK_ENTER};
        t.execute(messageToPrint2);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        

        robot3.mouseMove(50, 50);
        robot3.mousePress(InputEvent.BUTTON1_MASK);
        robot3.mouseRelease(InputEvent.BUTTON1_MASK);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(4 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        robot3.mouseMove(1802, 18);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        robot3.mousePress(InputEvent.BUTTON1_MASK);
        robot3.mouseRelease(InputEvent.BUTTON1_MASK);

        robot3.mouseMove(748, 869);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        robot3.mousePress(InputEvent.BUTTON1_MASK);
        robot3.mouseRelease(InputEvent.BUTTON1_MASK);

    }
    

    /*private void type(int i) {
        robot.delay(40);
        robot.keyPress(i);
        robot.keyRelease(i);
    }

    private void type(String s) {
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            int code = b;
            // keycode only handles [A-Z] (which is ASCII decimal [65-90])
            if (code > 96 && code < 123) {
                code = code - 32;
            }
            robot.delay(40);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }*/

}
