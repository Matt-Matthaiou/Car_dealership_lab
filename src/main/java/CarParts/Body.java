package CarParts;

public class Body {

    private String material;
    private String color;
    private String design;


    public Body(String material, String color, String design) {
        this.material = material;
        this.color = color;
        this.design = design;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getDesign() {
        return design;
    }
}
