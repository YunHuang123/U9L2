public class AnimalRunner {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("something", 3, true, "white");
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.isVaccinated());
        System.out.println(myAnimal.getColor());
        myAnimal.adopt();
        myAnimal.feed();
        myAnimal.sleep();
        System.out.println("------------------------------");

        Dog dog = new Dog("Potato", 2, false, "brown", false);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.isVaccinated());
        System.out.println(dog.getColor());
        System.out.println(dog.getIsVegetarian());
        dog.adopt();
        dog.feed();
        dog.sleep();
        dog.bark();
        dog.walk();
        System.out.println(dog.hasBeenWalked());
        System.out.println("------------------------------");

        Cat cat = new Cat("Fluffy", 1, true, "white", true);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.isVaccinated());
        System.out.println(cat.getColor());
        System.out.println(cat.getLikeRetractClaws());
        dog.adopt();
        dog.feed();
        dog.sleep();
        cat.meow();
        cat.play();
        System.out.println(cat.hasPlayedWith());
    }
}
