package Lesson1.Hw1.Star;


public class Stars {
    int id;
    String name;
    boolean status;
    double weight;


    public Stars(){

    };


    public Stars(int id, String name, boolean status, double weight) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Stars{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", weight=" + weight +
                '}';
    }
}
