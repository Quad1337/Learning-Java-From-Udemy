import academy.learnprogramming.Ceiling;
import academy.learnprogramming.Sofa;
import academy.learnprogramming.Tv;
import academy.learnprogramming.Wall;

public class Livingroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Sofa sofa;
    private Tv tv;

    public Livingroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Sofa sofa, Tv tv) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.sofa = sofa;
        this.tv = tv;
    }

    public Tv getTv(){
        return this.tv;
    }

    public void cleanSofa(){
        System.out.println("LivingRoom -> cleaning the sofa");
        sofa.clean();
    }
}
