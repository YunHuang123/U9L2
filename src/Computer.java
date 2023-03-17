public class Computer extends Electronics{
    private boolean isDeskTop;

    public Computer(String name, String color, boolean isDesk){
        super(name, color);
        isDeskTop = isDesk;
    }

    public boolean getIsDeskTop(){
        return isDeskTop;
    }

    public void playComputerGames(){
        System.out.println("Play some computer games");
    }
}
