package src.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import src.main.Chandrayaan;

public class ChandrayaanTest {

    Chandrayaan vikram = new Chandrayaan(0, 0, 0, 'N');

    @Test
    public void intialPostion() {
        Chandrayaan vikram = new Chandrayaan(0, 0, 0, 'N');
    }

    @Test
    public void givingOneArgumentForForward() {
        char[] seriesOfCommands = new char[] { 'f' };
        String ans = "X=0 Y=1 Z=0 Direction=N";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

    @Test
    public void givingOneArgumentForRight() {
        char[] seriesOfCommands = new char[] { 'r' };
        String ans = "X=0 Y=0 Z=0 Direction=E";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

    @Test
    public void givingOneArgumentForUp() {
        char[] seriesOfCommands = new char[] { 'u' };
        String ans = "X=0 Y=0 Z=0 Direction=U";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

    @Test
    public void givingOneArgumentForBackword() {
        char[] seriesOfCommands = new char[] { 'b' };
        String ans = "X=0 Y=-1 Z=0 Direction=N";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

    @Test
    public void givingOneArgumentForLeft() {
        char[] seriesOfCommands = new char[] { 'l' };
        String ans = "X=0 Y=0 Z=0 Direction=W";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

    @Test
    public void givingOneArgumentForDown() {
        char[] seriesOfCommands = new char[] { 'd' };
        String ans = "X=0 Y=0 Z=0 Direction=D";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

    @Test
    public void givingSetOfCommands() {
        char[] seriesOfCommands = new char[] { 'f', 'r', 'u', 'b', 'l' };
        String ans = "X=0 Y=1 Z=-1 Direction=W";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

}
