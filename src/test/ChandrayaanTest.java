package src.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import src.main.Chandrayaan;

public class ChandrayaanTest {

    
    
    @Test
    public void initiateIgnition() {
        Chandrayaan vikram = new Chandrayaan();
        vikram.finalDestination();
    }

}
