public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private String color;

    public Animal(String n, int a, boolean v, String c){
        name = n;
        age = a;
        vaccinated = v;
        color = c;
    }

    public void adopt(){
        System.out.println("Adopted an animal");
    }

    public void feed(){
        System.out.println("Fed an animal");
    }

    public void sleep(){
        System.out.println("Asleep");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public String getColor(){
        return color;
    }



}
