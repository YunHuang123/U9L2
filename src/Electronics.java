public class Electronics {
    private String name;
    private String color;

    public Electronics(String n, String c){
        name = n;
        color = c;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void search(){
        System.out.println("Searched for something");
    }
}
