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
     public void givingOneArgumentForForward()
    {
        char[] seriesOfCommands = new char[] { 'f' };
        String ans = "010N";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

    @Test
     public void givingOneArgumentForRight()
    {
        char[] seriesOfCommands = new char[] { 'r' };
        String ans = "000E";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

     @Test
     public void givingOneArgumentForUp()
    {
        char[] seriesOfCommands = new char[] { 'U' };
        String ans = "000U";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

}
