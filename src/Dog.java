public class Dog implements Animal, Devilish{
    @Override
    public String makeSound() {
        String bark = "Bark";
        return bark;
    }

    @Override
    public String move() {
        String run = "I'm running!";
        return run;
    }

    @Override
    public String misbehave(String str) {
        String chew = "I chewed up your " + str;
        return chew;
    }

}
