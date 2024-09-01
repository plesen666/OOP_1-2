//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Harry", "Potter", 90, 40, 58, 45, 67);
        Griffindor hermioneGranger = new Griffindor("Hermione", "Granger", 65, 45, 34, 22, 56);
        Griffindor ronWeasley = new Griffindor("Ron", "Weasley", 30, 40, 30, 20, 15);

        Ravenclaw choChang = new Ravenclaw("Cho", "Chang", 20, 25, 12, 54, 12, 12);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", 24, 21, 12, 21, 12, 53);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 43, 15, 45, 14, 34, 43);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias", "Smith", 21, 34, 65, 21, 67);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", 32, 42, 55, 64, 34);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 7, 23, 12, 65, 21);

        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 54, 32, 56, 76, 56, 60, 80);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 34, 21, 34, 42, 15, 12, 43);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 32, 25, 32, 29, 43, 43, 55);


        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        harryPotter.compareStudents(hermioneGranger);
        harryPotter.compareStudents(dracoMalfoy);
        System.out.println(choChang);
    }
}

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