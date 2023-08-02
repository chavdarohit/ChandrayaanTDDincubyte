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


    @Test public void givingOneArgumentForForward()
    {
        char[] seriesOfCommands = new char[] { 'f' };
        String ans = "0";
        assertEquals(ans, vikram.finalDestination(seriesOfCommands));
    }

}
