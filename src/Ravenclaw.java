import static java.lang.StringTemplate.STR;

public class Ravenclaw {


    class Ravenclaw extends Hogwarts {
        private int smart;
        private int wise;
        private int witty;
        private int fullOfCreativity;

        public Ravenclaw(String name, String surname, int powerOfMagic, int transgression, int smart, int wise, int witty, int fullOfCreativity) {
            super(name, surname, powerOfMagic, transgression);
            this.smart = smart;
            this.wise = wise;
            this.witty = witty;
            this.fullOfCreativity = fullOfCreativity;
        }

        @Override
        public String toString() {
            return STR."\{super.toString()}; Ravenclaw{smart=\{smart}, wise=\{wise}, witty=\{witty}, fullOfCreativity=\{fullOfCreativity}}".toString();
        }

        @Override
        public void printParameters() {
            System.out.println(this);
        }

        public void compareStudents(Ravenclaw student) {
            int sum1 = this.smart + this.wise + this.witty + this.fullOfCreativity;
            int sum2 = student.smart + student.wise + student.witty + student.fullOfCreativity;

            if (sum1 > sum2) {
                System.out.println(STR."\{this.getName()} лучший когтевранец, чем \{student.getName()}".toString());
            } else if (sum1 < sum2) {
                System.out.println(STR."\{student.getName()} лучший когтевранец, чем \{this.getName()}".toString());
            } else {
                System.out.println("Студенты равны.");
            }
        }
    }
}
