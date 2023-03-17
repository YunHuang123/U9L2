public class Cat extends Animal{
    private boolean likesRetractClaws;
    private boolean tracker;

    public Cat(String name, int age, boolean vaccinated, String color, boolean likesRe){
        super(name, age, vaccinated, color);
        likesRetractClaws = likesRe;
        tracker = false;
    }

    public void play(){
        System.out.println("Played with a cat");
        tracker = true;
    }

    public void meow(){
        System.out.println("Meow~");
    }

    public boolean hasPlayedWith(){
        if (tracker == true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean getLikeRetractClaws(){
        return likesRetractClaws;
    }
}
