public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void printSlytherinStudent() {
        System.out.println("Студент - " + getName()
                + ", магия - " + getMagic()
                + ", трансгрессия - " + getTransgression()
                +", хитрость - " + getCunning()
                + ", решительность - " + getDetermination()
                + ", амбициозность - " + getAmbition()
                + ", находчивость - " + getResourcefulness()
                + ", жажда власти - " + getLustForPower()
        );
    }

    public void compareStudentsOfFaculty(Slytherin student) {
        int score1 = this.getMagic() + this.getTransgression() + this.getCunning()
                + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int score2 = student.getMagic() + student.getTransgression() + student.getCunning()
                + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
        if (score1 > score2){
            System.out.println(this.getName() + " лучше, чем " + student.getName());
        } else if (score1 == score2) {
            System.out.println(this.getName() + " and " + student.getName() + " одинаково хороши");

        } else {
            System.out.println(student.getName() + " лучше, чем " + this.getName());
        }
    }
}
