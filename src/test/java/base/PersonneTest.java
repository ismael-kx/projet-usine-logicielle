package base;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by KX on 29/01/2016.
 */
public class PersonneTest {

    private Personne personne;

    @Test
    public void testAge() throws Exception {
        personne = new Personne("Ismael","Cherif");
        personne.setAge(1988);
        assertTrue(2016-1988==personne.getAge());
        assertEquals(2016-1988,personne.getAge());
    }
}
