import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StarvingTest {
    Character basicCharacter;

    @Before
    public void setUp() throws Exception {
        basicCharacter = new Starving(new BasicCharacter("Bilbo Baggins"));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetName() {
        assertEquals("Bilbo Baggins The Hungry", basicCharacter.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(-5.0, basicCharacter.getHealth(), 0);
    }
}