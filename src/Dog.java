public class Dog extends Pet {
    public Dog() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Bark");
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
