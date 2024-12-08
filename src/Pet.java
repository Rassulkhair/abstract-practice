public abstract class Pet {
    private int pawsCount;

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void sleep() {
        System.out.println("Zzzzzzzzz");
    }

    public void play() {
        System.out.println("Play");
    }

    public abstract void giveVoice();
}
