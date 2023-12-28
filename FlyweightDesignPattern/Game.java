public class Game {
    public static void main(String[] args) {

        //Intrinsic
        Bullet bullet = new Bullet();
        bullet.setSpeed(10);
        bullet.setName("Bullet");
        bullet.setDamage(100);
        bullet.setImage(new byte[] { 0x00, 0x01, 0x02 });
        bullet.setColor("Red");
        //extrinsic
        FlyingBullet flyingBullet = new FlyingBullet();
        flyingBullet.setDirection("North");
        flyingBullet.setX(10);
        flyingBullet.setY(20);
        flyingBullet.setBullet(bullet);

        System.out.println("Bullet speed: " + flyingBullet.getBullet().getSpeed());
        System.out.println("Bullet name: " + flyingBullet.getBullet().getName());
        System.out.println("Bullet damage: " + flyingBullet.getBullet().getDamage());
        System.out.println("Bullet image: " + flyingBullet.getBullet().getImage());
        System.out.println("Bullet color: " + flyingBullet.getBullet().getColor());
        System.out.println("Flying bullet direction: " + flyingBullet.getDirection());
        System.out.println("Flying bullet x: " + flyingBullet.getX());
        System.out.println("Flying bullet y: " + flyingBullet.getY());
        System.out.println("Flying bullet bullet: " + flyingBullet.getBullet());


    }

}
