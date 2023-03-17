public class Phone extends Electronics{
    private boolean isFlipPhone;

    public Phone(String name, String color, boolean isFlip){
        super(name, color);
        isFlipPhone = isFlip;
    }

    public boolean getIsFlipPhone(){
        return isFlipPhone;
    }

    public void call(){
        System.out.println("Call someone");
    }

}
