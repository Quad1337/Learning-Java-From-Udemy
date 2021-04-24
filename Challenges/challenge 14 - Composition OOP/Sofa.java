public class Sofa {
    private String style;
    private int pillows;
    private int height;

    public Sofa(String style, int pillows, int height) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
    }

    public void clean(){
        System.out.println("Sofa is cleaning");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }
}
