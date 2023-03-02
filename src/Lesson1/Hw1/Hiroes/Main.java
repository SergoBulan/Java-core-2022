package Lesson1.Hw1.Hiroes;

public class Main {


    public static void main(String[] args) {

        Hero hero1 = new Hero(1,"Saitama",true,84.9);
        hero1.addSkill(0,"Power");
        hero1.addSkill(1,"Speed");
        hero1.addSkill(2,"Heroism");
        hero1.addSkill(3,"Invulnerability");
        System.out.println(hero1);

        Hero hero2 = new Hero(2,"Batman",true,95.4);
        hero2.addSkill(0,"Power");
        hero2.addSkill(1,"Heroism");
        hero2.addSkill(2,"Wealth");
        hero2.addSkill(3,"Batmobile");
        hero2.addSkill(4,"Charisma");
        System.out.println(hero2);

        Hero hero3 = new Hero(3,"Sponge Bob",true,5);
        hero3.addSkill(0,"Concoction");
        hero3.addSkill(1,"Dullness");
        hero3.addSkill(2,"Laughter");
        hero3.addSkill(3,"Patrick");
        System.out.println(hero3);

        Hero hero4 = new Hero(4,"Wolverine",true,160.5);
        hero4.addSkill(0,"Claws");
        hero4.addSkill(1,"Regeneration");
        hero4.addSkill(2,"Anticipation");
        hero4.addSkill(3,"Hairdo");
        hero4.addSkill(4,"Smell");
        System.out.println(hero4);

        Hero hero5 = new Hero(5,"Bandera",true,73);
        hero5.addSkill(0,"Ukrainian");
        hero5.addSkill(1,"Mastermind");
        hero5.addSkill(2,"Father");
        hero5.addSkill(3,"Bandero smoothie");
        System.out.println(hero5);

    }


}
