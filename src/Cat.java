public class Cat extends Pet{
    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Meow");
    }

    public Cat() {
        super(4);
    }
}
