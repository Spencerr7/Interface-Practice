public class Bird implements Animal{
    @Override
    public String makeSound() {
        String chirp = "chirp";
        return chirp;
    }

    @Override
    public String move() {
        String fly = "I am flying";
        return fly;
    }
}
