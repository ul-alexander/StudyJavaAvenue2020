package Lesson8;

public class Main1 {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        tiger1.setName("Bobr");

        Tiger tiger2 = new Tiger();
        tiger2.setName("Volf");

        Monkey monkey1 = new Monkey();
        monkey1.setName("Makak1");

        Monkey monkey2 = new Monkey();
        monkey2.setName("Gaga");

        Animal[] animals = new Animal[4];
        animals[0] = tiger1;
        animals[1] = tiger2;
        animals[2] = monkey1;
        animals[3] = monkey2;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }
    }
}
