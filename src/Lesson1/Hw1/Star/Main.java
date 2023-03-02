package Lesson1.Hw1.Star;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Stars star1 = new Stars(1,"Moon",true,5678);
        System.out.println(star1);

        Stars star2 = new Stars(2,"Omega",true,568);
        System.out.println(star2);

        Stars star3 = new Stars(3,"Alfa",true,690);
        System.out.println(star3);

        Stars star4 = new Stars(4,"Dude",false,78.4);
        System.out.println(star4);

        Stars star5 = new Stars(5,"Titanium",true,7899);
        System.out.println(star5);


    }
}
