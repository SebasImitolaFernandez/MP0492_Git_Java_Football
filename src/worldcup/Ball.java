package worldcup;

public class Ball {
    private String material;

    public Ball(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void move() {
        System.out.println("The ball is moving");
    }
}