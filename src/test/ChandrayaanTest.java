package src.test;

import static org.junit.Assert.assertArrayEquals;
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

        Chandrayaan vikramans = new Chandrayaan(0, 1, 0, 'N');
        Chandrayaan test = vikram.finalDestination(seriesOfCommands);

        assertEquals(vikramans.direction, test.direction);
        assertEquals(vikramans.xDirect, test.xDirect);
        assertEquals(vikramans.yDirect, test.yDirect);
        assertEquals(vikramans.zDirect, test.zDirect);

        //comparing every single value so if we are not getting equal in any value we should know
    }

    @Test
    public void givingOneArgumentForRight() {
        char[] seriesOfCommands = new char[] { 'r' };

        Chandrayaan vikramans = new Chandrayaan(0, 0, 0, 'E');
        Chandrayaan test = vikram.finalDestination(seriesOfCommands);

        assertEquals(vikramans.direction, test.direction);
        assertEquals(vikramans.xDirect, test.xDirect);
        assertEquals(vikramans.yDirect, test.yDirect);
        assertEquals(vikramans.zDirect, test.zDirect);

    }

    @Test
    public void givingOneArgumentForUp() {
        char[] seriesOfCommands = new char[] { 'u' };

        Chandrayaan vikramans = new Chandrayaan(0, 0, 0, 'U');
        Chandrayaan test = vikram.finalDestination(seriesOfCommands);

        assertEquals(vikramans.direction, test.direction);
        assertEquals(vikramans.xDirect, test.xDirect);
        assertEquals(vikramans.yDirect, test.yDirect);
        assertEquals(vikramans.zDirect, test.zDirect);

    }

    @Test
    public void givingOneArgumentForBackword() {
        char[] seriesOfCommands = new char[] { 'b' };
        Chandrayaan vikramans = new Chandrayaan(0, -1, 0, 'N');
        Chandrayaan test = vikram.finalDestination(seriesOfCommands);
        
        assertEquals(vikramans.direction, test.direction);
        assertEquals(vikramans.xDirect, test.xDirect);
        assertEquals(vikramans.yDirect, test.yDirect);
        assertEquals(vikramans.zDirect, test.zDirect);
    }

    @Test
    public void givingOneArgumentForLeft() {
        char[] seriesOfCommands = new char[] { 'l' };
        
        Chandrayaan vikramans = new Chandrayaan(0, 0, 0, 'W');
        Chandrayaan test = vikram.finalDestination(seriesOfCommands);
        
        assertEquals(vikramans.direction, test.direction);
        assertEquals(vikramans.xDirect, test.xDirect);
        assertEquals(vikramans.yDirect, test.yDirect);
        assertEquals(vikramans.zDirect, test.zDirect);
    
    }

    @Test
    public void givingOneArgumentForDown() {
        char[] seriesOfCommands = new char[] { 'd' };
        
        Chandrayaan vikramans = new Chandrayaan(0, 0, 0, 'D');
        Chandrayaan test = vikram.finalDestination(seriesOfCommands);
        
        assertEquals(vikramans.direction, test.direction);
        assertEquals(vikramans.xDirect, test.xDirect);
        assertEquals(vikramans.yDirect, test.yDirect);
        assertEquals(vikramans.zDirect, test.zDirect);
    
    }

    @Test
    public void givingSetOfCommands() {
        char[] seriesOfCommands = new char[] { 'f', 'r', 'u', 'b', 'l' };
        String ans = "X=0 Y=1 Z=-1 Direction=W";
        
        Chandrayaan vikramans = new Chandrayaan(0, 1, -1, 'W');
        Chandrayaan test = vikram.finalDestination(seriesOfCommands);
        
        assertEquals(vikramans.direction, test.direction);
        assertEquals(vikramans.xDirect, test.xDirect);
        assertEquals(vikramans.yDirect, test.yDirect);
        assertEquals(vikramans.zDirect, test.zDirect);
    
    }

}
