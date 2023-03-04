package Lesson1.Hw1.Films;


// import java.util.Arrays;

//public class Film {
//    private int id;
//    private String name;
 //   private short age;
//    private String skills[] = new String[2];
//
 //   public Film() {
 //   }
//
 //   @Override
 //   public String toString() {
 //       return "Film{" +
 //               "id=" + id +
 //               ", name='" + name + '\'' +
 //               ", age=" + age +
 //               ", skills=" + Arrays.toString(skills) +
  //              '}';
//    }
 //   public void addSkill(int i, String skill){
  //      if(i >= 0 && i < skills.length){
//            skills[i]=skill;
//        }
 //   }

//    public Film(int id, String name, short age, String[] skills) {
//        this.id = id;
 //       this.name = name;
 //       this.age = age;
 //       this.skills = skills;
//    }

 //   public int getId() {
 //       return id;
 //   }

  //  public void setId(int id) {
//        this.id = id;
 //   }
//
 //   public String getName() {
//        return name;
//    }

 //   public void setName(String name) {
//        this.name = name;
 //   }

 //   public short getAge() {
   //     return age;
 //   }

  //  public void setAge(short age) {
 //       this.age = age;
 //   }
//
  //  public String[] getSkills() {
 //       return skills;
 //   }

 //   public void setSkills(String[] skills) {
 //       this.skills = skills;
 //   }
//}

import java.util.Arrays;

public class Film {
    private String name;
    private int age;
    private String skills[] = new String[2];

    public Film() {
    }

    public Film(String name, int age, String[] skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }


    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}