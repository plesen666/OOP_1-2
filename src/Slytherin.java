import static java.lang.StringTemplate.STR;

public class Slytherin {
    class Slytherin extends Hogwarts {
        private int cunning;
        private int determination;
        private int ambition;
        private int resourcefulness;
        private int thirstOfPower;

        public Slytherin(String name, String surname, int powerOfMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstOfPower) {
            super(name, surname, powerOfMagic, transgression);
            this.cunning = cunning;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.thirstOfPower = thirstOfPower;
        }

        @Override
        public String toString() {
            return STR."\{super.toString()}; Slytherin{cunning=\{cunning}, determination=\{determination}, ambition=\{ambition}, resourcefulness=\{resourcefulness}, thirstOfPower=\{thirstOfPower}}".toString();
        }

        @Override
        public void printParameters() {
            System.out.println(this);
        }

        public void compareStudents(Slytherin student) {
            int sum1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstOfPower;
            int sum2 = student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstOfPower;

            if (sum1 > sum2) {
                System.out.println(STR."\{this.getName()} лучший слизеринец, чем \{student.getName()}".toString());
            } else if (sum1 < sum2) {
                System.out.println(STR."\{student.getName()} лучший слизеринец, чем \{this.getName()}".toString());
            } else {
                System.out.println("Студенты равны.");
            }
        }
    }
}
