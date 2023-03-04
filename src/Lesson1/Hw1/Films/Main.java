package Lesson1.Hw1.Films;

public class Main {
//    public static void main(String[] args) {
//        Film film1 = new Film(1,"Ago",2020);
//        film1.addSkill(0,"horror");
//        film1.addSkill(1,"Action");
//        System.out.println(film1);
//    }
//}
// не розумію чому не може відпрацьовувати зтакими аргументами.
// ArrayList тежнесхтів працювати.

    public static void main(String[] args) {
        Film film1 = new Film("Ago", 2020);
        film1.addSkill(0, "horror");
        film1.addSkill(1, "Action");
        System.out.println(film1);
    }
}