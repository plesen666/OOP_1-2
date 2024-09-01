import static java.lang.StringTemplate.STR;

class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgression, int hardworking, int loyal, int honest) {
        super(name, surname, powerOfMagic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; Hufflepuff{hardworking=\{hardworking}, loyal=\{loyal}, honest=\{honest}}".toString();
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Hufflepuff student) {
        int sum1 = this.hardworking + this.loyal + this.honest;
        int sum2 = student.hardworking + student.loyal + student.honest;

        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} лучший пуффендуец, чем \{student.getName()}".toString());
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} лучший пуффендуец, чем \{this.getName()}".toString());
        } else {
            System.out.println("Студенты равны.");
        }
    }
}
