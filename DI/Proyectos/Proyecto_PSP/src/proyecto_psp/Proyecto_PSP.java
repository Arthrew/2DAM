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
    
    private static final int SPEED = 250;

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

    private void execute2(int letter[]) {
        try {
            robot = new Robot();

        } catch (AWTException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < letter.length; i++) {
            robot.delay(SPEED);
            robot.keyPress(letter[i]);
        }
    }

    private void execute3(int letter[]) {
        try {
            robot = new Robot();

        } catch (AWTException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < letter.length; i++) {
            robot.delay(SPEED);
            robot.keyRelease(letter[i]);
        }
    }

    public static void main(String[] args) throws IOException, AWTException {
         Hilo h = new Hilo();

        Proyecto_PSP t = new Proyecto_PSP();

        int[] executeNotepad = {KeyEvent.VK_WINDOWS, KeyEvent.VK_N, KeyEvent.VK_O, KeyEvent.VK_T, KeyEvent.VK_ENTER};

        t.execute(executeNotepad);

        int[] texto = {KeyEvent.VK_T, KeyEvent.VK_U, KeyEvent.VK_SPACE, KeyEvent.VK_M, KeyEvent.VK_A, KeyEvent.VK_D, KeyEvent.VK_R, KeyEvent.VK_E,
            KeyEvent.VK_SPACE, KeyEvent.VK_E, KeyEvent.VK_S, KeyEvent.VK_SPACE, KeyEvent.VK_U, KeyEvent.VK_N, KeyEvent.VK_A, KeyEvent.VK_SPACE,
            KeyEvent.VK_P, KeyEvent.VK_U, KeyEvent.VK_T, KeyEvent.VK_A, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD,
            KeyEvent.VK_P, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD, KeyEvent.VK_1, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD, KeyEvent.VK_PERIOD};

        t.execute(texto);

        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "start");//type nul > file.txt
        pb.start();

        int[] guardarArchivo = {KeyEvent.VK_I, KeyEvent.VK_P, KeyEvent.VK_C, KeyEvent.VK_O, KeyEvent.VK_N, KeyEvent.VK_F, KeyEvent.VK_I, KeyEvent.VK_G, KeyEvent.VK_SPACE};

        t.execute(guardarArchivo);

        int[] shift = {KeyEvent.VK_SHIFT};
        t.execute2(shift);

        int[] comma = {KeyEvent.VK_LESS};
        t.execute(comma);

        int[] shift2 = {KeyEvent.VK_SHIFT};
        t.execute3(shift2);
        int[] texto2 = {KeyEvent.VK_SPACE, KeyEvent.VK_I, KeyEvent.VK_P, KeyEvent.VK_PERIOD, KeyEvent.VK_T, KeyEvent.VK_X, KeyEvent.VK_T, KeyEvent.VK_ENTER};
        t.execute(texto2);
        
        
        h.start();
        

    }
}
