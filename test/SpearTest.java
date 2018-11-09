import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpearTest {
    Character basicCharacter;

    @Before
    public void setUp() throws Exception {
        basicCharacter = new Spear(new BasicCharacter("Bilbo Baggins"));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetName() {
        assertEquals("Bilbo Baggins The Spear Thrower", basicCharacter.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(5.0, basicCharacter.getHealth(), 0);
    }
}