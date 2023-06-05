public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printGryffindorStudent() {
        System.out.println("Студент - " + getName()
                + ", магия - " + getMagic()
                + ", трансгрессия - " + getTransgression()
                +", благородство - " + getNobility()
                + ", честь - " + getHonor()
                + ", храбрость - " + getBravery()
        );
    }

    public void compareStudentsOfFaculty(Gryffindor student) {
        int score1 = this.getMagic() + this.getTransgression() + this.getNobility()
                + this.getHonor() + this.getBravery();
        int score2 = student.getMagic() + student.getTransgression() + student.getNobility()
                + student.getHonor() + student.getBravery();
        if (score1 > score2){
            System.out.println(this.getName() + " лучше, чем " + student.getName());
        } else if (score1 == score2) {
            System.out.println(this.getName() + " and " + student.getName() + " одинаково хороши");

        } else {
            System.out.println(student.getName() + " лучше, чем " + this.getName());
        }
    }
}
