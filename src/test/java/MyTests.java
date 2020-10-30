import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyTests {

    // This test is testing that your two constructors are set up properly
    @Test
    public void testConstructor() {
        assertNotNull(new Dog(), "The no argument constructor did not work; calling new Dog() caused an error");
        assertNotNull(new Dog("Riley", 3, "Golden Retriever"), "The no argument constructor did not work; calling new Dog() caused an error");
    }

    // This test is testing your getters
    @Test
    public void testGetters() {
        assertEquals("Poodle", new Dog("Steve", 1, "Poodle").getBreed(), "Your getBreed method does not work!");
    }

    // This test is testing your setters
    @Test
    public void testSetters() {
        Dog d1 = new Dog("Lily", 1, "Dachshund");
        d1.setBreed("Mixed");
        assertEquals("Mixed", d1.getBreed(), "Your setBreed method does not work!");
    }
    
}
