public class Dog extends Animal{
    private boolean tracker;
    private boolean isVegetarian;

    public Dog(String name, int age, boolean vaccinated, String color, boolean isVege){
        super(name, age, vaccinated, color);
        isVegetarian = isVege;
        tracker = false;
    }

    public void walk(){
        System.out.println("Walked a dog");
        tracker = true;
    }

    public void bark(){
        System.out.println("Woof~ Woof~");
    }

    public boolean hasBeenWalked(){
        if (tracker == true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean getIsVegetarian(){
        return isVegetarian;
    }
}
