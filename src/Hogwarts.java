public class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }
    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public static void compareByMagic(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagic() > student2.getMagic()) {
            System.out.println(student1.getName() + " сильнее в магии, чем " + student2.getName());
        } else if (student2.getMagic() > student1.getMagic()) {
            System.out.println(student2.getName() + " сильнее в магии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны в магии");
        }
    }

    public static void compareBytransgression(Hogwarts student1, Hogwarts student2) {
        if (student1.getTransgression() > student2.getTransgression()) {
            System.out.println(student1.getName() + " сильнее в трангрессии, чем " + student2.getName());
        } else if (student2.getTransgression() > student1.getTransgression()) {
            System.out.println(student2.getName() + " сильнее в трангрессии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны в трангрессии");
        }
    }
}
