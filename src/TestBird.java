import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class TestBird {
    Bird b = new Bird();
    @Test
    public void testMakeSound(){
        assertEquals("chirp", b.makeSound());
    }

    @Test
    public void testMove(){
        assertEquals("I am flying", b.move());
    }
}
