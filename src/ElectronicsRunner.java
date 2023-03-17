public class ElectronicsRunner {
    public static void main(String[] args) {

        Electronics electronics = new Electronics("something", "black");
        System.out.println(electronics.getName());
        System.out.println(electronics.getColor());
        electronics.search();

        Phone phone = new Phone("Apple", "gold", false);
        System.out.println(phone.getName());
        System.out.println(phone.getColor());
        phone.search();
        System.out.println(phone.getIsFlipPhone());
        phone.call();

        Computer computer = new Computer("Razer", "black", false);
        System.out.println(computer.getName());
        System.out.println(computer.getColor());
        computer.search();
        System.out.println(computer.getIsDeskTop());
        computer.playComputerGames();
    }
}
