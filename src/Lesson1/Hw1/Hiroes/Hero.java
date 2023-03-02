package Lesson1.Hw1.Hiroes;

import java.util.Arrays;

public class Hero {
    private int id;
    private String name;
    private boolean status;
    private double weight;
    private String skills[] = new String[5];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", weight=" + weight +
                ", skills=" + Arrays.toString(skills) +
                '}';

    }

    public Hero(int id, String name, boolean status, double weight) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.weight = weight;
    }

    public void addSkill(int i, String skill){
        if (i>=0 && i< skills.length){
            skills[i]=skill;
        }
    }
}
