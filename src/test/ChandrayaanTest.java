package src.test;

import static org.junit.Assert.assertEquals;
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
    public void givingSetOfCommands()
    {
        char[] commands= new char[]{'f', 'r', 'u', 'b', 'l'};
        vikram.finalDestination(commands);
    }
}
