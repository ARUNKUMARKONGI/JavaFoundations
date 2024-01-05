package _5Jan2024;
import java.util.TreeSet;

class Cricketer implements Comparable<Cricketer> {
        private String name;
        private int age;
        private int runsScored;

        // Constructor to initialize data members
        public Cricketer(String name, int age, int runsScored) {
            this.name = name;
            this.age = age;
            this.runsScored = runsScored;
        }

        // compareTo method to compare cricketers based on runs scored
        @Override
        public int compareTo(Cricketer other) {
            // Manually compare runsScored with a custom logic
          /*  if (this.runsScored < other.runsScored) {
                return -1;  // Current cricketer has fewer runs
            } else if (this.runsScored > other.runsScored) {
                return 1;   // Current cricketer has more runs
            } else {
                return 0;   // Runs are equal
            }*/
            return Integer.compare(this.runsScored, other.runsScored);
        }

        public String toString() {
            return "Name= "+name+",  "+"Runs Scored= "+runsScored;
        }

    public String getName() {
        return name;
    }

    public int getRunsScored() {
        return runsScored;
    }
}

    public class TreeSetCricketer {
        public static void main(String[] args) {
            // Create a TreeSet of Cricketer objects (automatically sorted based on runs scored)
            TreeSet<Cricketer> cricketers = new TreeSet<>();
            cricketers.add(new Cricketer("Virat Kohli", 32, 12000));
            cricketers.add(new Cricketer("Rohit Sharma", 34, 7000));
            cricketers.add(new Cricketer("Pujara", 30, 9000));

            System.out.println(cricketers); //values are printed bcz of toString

           /* for (Cricketer cricketer : cricketers) {
                System.out.println(cricketer.getName()+" "+cricketer.getRunsScored());
            }*/
        }
    }
