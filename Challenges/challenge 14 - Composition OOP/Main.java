public class Main {

    public static void main(String[] args) {
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.
      
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(2,"white");
        Sofa sofa = new Sofa("Lawson",2,1);
        Tv tv = new Tv("Led 55RU7102","Samsung",180,"16:9", new Resolution(3840,2160));
        Livingroom livingroom = new Livingroom("My LivingRoom",wall1, wall2,wall3,wall4,ceiling,sofa,tv);
        livingroom.cleanSofa();
        livingroom.getTv().turnOn();

    }

}
