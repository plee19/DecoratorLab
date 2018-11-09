import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwordTest {
    Character basicCharacter;

    @Before
    public void setUp() throws Exception {
        basicCharacter = new Sword(new BasicCharacter("Bilbo Baggins"));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetName() {
        assertEquals("Bilbo Baggins The Sword Handler", basicCharacter.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(10.0, basicCharacter.getHealth(), 0);
    }
}