public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int magic, int transgression, int intellect, int wisdom, int wit, int creation) {
        super(name, magic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public void printRavenclawStudent() {
        System.out.println("Студент - " + getName()
                + ", магия - " + getMagic()
                + ", трансгрессия - " + getTransgression()
                +", ум - " + getIntellect()
                + ", мудрость - " + getWisdom()
                + ", остроумие - " + getWit()
                + ", творчество - " + getCreation()
        );
    }

    public void compareStudentsOfFaculty(Ravenclaw student) {
        int score1 = this.getMagic() + this.getTransgression() + this.getIntellect()
                + this.getWisdom() + this.getWit() + this.getCreation();
        int score2 = student.getMagic() + student.getTransgression() + student.getIntellect()
                + student.getWisdom() + student.getWit() + student.getCreation();
        if (score1 > score2){
            System.out.println(this.getName() + " лучше, чем " + student.getName());
        } else if (score1 == score2) {
            System.out.println(this.getName() + " and " + student.getName() + " одинаково хороши");

        } else {
            System.out.println(student.getName() + " лучше, чем " + this.getName());
        }
    }
}
