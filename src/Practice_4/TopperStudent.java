package Practice_4;

public class TopperStudent {
        String name;
        double percentage;
        TopperStudent(String n, Double per){
            name = n;
            percentage = per;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", percentage=" + percentage +
                    '}';
        }
    }
    class Test {
        public static void main(String[] args) {
            TopperStudent s1 = new TopperStudent("john cena", 90.24);
            TopperStudent s2 = new TopperStudent("roman reigns", 93.2);
            TopperStudent s3 = new TopperStudent("brock lesnar", 90.1);
            if (s1.percentage > s2.percentage && s1.percentage > s3.percentage) {
                System.out.println(s1);
            } else if (s2.percentage > s1.percentage && s2.percentage > s3.percentage) {
                System.out.println(s2);
            } else if (s3.percentage > s2.percentage && s3.percentage > s1.percentage) {
                System.out.println(s3);
            }
        }
    }
