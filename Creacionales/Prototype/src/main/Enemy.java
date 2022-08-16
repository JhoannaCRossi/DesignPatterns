package main;

public class Enemy {

    private String image;
    private int positionX;
    private int positionY;
    private int contLife;

    public Enemy(String image, int positionX, int positionY, int contLife) {
        this.setImage(image);
        this.setContLife(contLife);
        this.setPositionX(positionX);
        this.setPositionY(positionY);
    }

    //1er caso prototype
    public Enemy(Enemy enemy) {
        this.setImage(enemy.getImage());
        this.setContLife(enemy.getContLife());
        this.setPositionX(enemy.getPositionY());
        this.setPositionY(enemy.getPositionY());
    }

    //2do caso prototype
    public Enemy clone(){
        return new Enemy(this);
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getContLife() {
        return contLife;
    }

    public void setContLife(int contLife) {
        this.contLife = contLife;
    }
}
