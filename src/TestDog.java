import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class TestDog {
    Dog d = new Dog();
    @Test
    public void testMakeSound(){
        assertEquals("Bark", d.makeSound());
    }

    @Test
    public void testMove(){
        assertEquals("I'm running!", d.move());
    }

    @Test
    public void testMisbehave(){
        assertEquals("I chewed up your homework", d.misbehave("homework"));
    }
}
