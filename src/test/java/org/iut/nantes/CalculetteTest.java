package org.iut.nantes;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculetteTest {
    @Test
    public void testAdditionner(){
        Calculette c = new Calculette();
        int res = c.additionner(5,3);
        assertEquals(8, res);
    }
}
