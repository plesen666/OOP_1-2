import static java.lang.StringTemplate.STR;

class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int powerOfMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; Griffindor{nobility=\{nobility}, honor=\{honor}, bravery=\{bravery}}".toString();
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Griffindor student) {
        int sum1 = this.nobility + this.honor + this.bravery;
        int sum2 = student.nobility + student.honor + student.bravery;

        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} лучший гриффиндорец, чем \{student.getName()}".toString());
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} лучший гриффиндорец, чем \{this.getName()}".toString());
        } else {
            System.out.println("Студенты равны.");
        }
    }
}

