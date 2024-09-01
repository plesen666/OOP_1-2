import static java.lang.StringTemplate.STR;

abstract class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgression;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return STR."Hogwarts (name=\{name}, surname=\{surname}, powerOfMagic=\{powerOfMagic}, transgression=\{transgression})".toString();
    }

    public abstract void printParameters();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void compareStudents(Hogwarts student) {
        int sum1 = this.powerOfMagic + this.transgression;
        int sum2 = student.powerOfMagic + student.transgression;

        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} \{this.getSurname()} обладает большей магией, чем \{student.getName()} \{student.getSurname()}".toString());
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} \{student.getSurname()} обладает большей магией, чем \{this.getName()} \{this.getSurname()}".toString());
        } else {
            System.out.println("Силы магии равны.");
        }
    }
}