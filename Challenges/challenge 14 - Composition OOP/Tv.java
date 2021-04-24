public class Tv {
    private String model;
    private String manufacturer;
    private int diagonal;
    private String aspectRatio;
    private Resolution tvResolution;

    public Tv(String model, String manufacturer, int diagonal, String aspectRatio, Resolution tvResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.diagonal = diagonal;
        this.aspectRatio = aspectRatio;
        this.tvResolution = tvResolution;
    }

    public void turnOn(){
        System.out.println("Tv is turning on");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public Resolution TvResolution(){
        return tvResolution;
    }
}
