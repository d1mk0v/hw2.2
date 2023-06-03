public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printHufflepuffStudent() {
        System.out.println("Студент - " + getName()
                + ", магия - " + getMagic()
                + ", трансгрессия - " + getTransgression()
                +", трудолюбие - " + getIndustriousness()
                + ", верность - " + getLoyalty()
                + ", чесность - " + getHonesty()
        );
    }
}
