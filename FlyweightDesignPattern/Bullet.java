public class Bullet {
    private int speed;
    private String name;
    private int damage;
    private byte[] image;

    private  String color;

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public byte[] getImage() {
        return image;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
