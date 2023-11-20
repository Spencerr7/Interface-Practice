public class AnimalDriver {
    public static void main(String[] args) {
        Dog d = new Dog();
        Bird b = new Bird();
        d.makeSound();
        b.makeSound();
        Dog d2 = new Dog();
        String homework;
        homework = d2.misbehave("homework");
        System.out.println(homework);
    }

}
