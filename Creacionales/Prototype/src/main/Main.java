package main;

public class Main {
    public static void main(String[] args) {
        Enemy enemyBase = new Enemy("Image.png", 0, 100, 2);

    //2 formas de usar prototype
        //1
        Enemy enemy1 = new Enemy(enemyBase);
        Enemy enemy2 = new Enemy(enemyBase);

        enemy1.setPositionX(100);
        enemy2.setPositionY(150);

        //2
        Enemy enemyBase2 = new Enemy("Image.png", 0, 100, 2);
        Enemy enemy3 = enemyBase2.clone();
        Enemy enemy4 = enemyBase2.clone();

        enemy3.setPositionX(200);
        enemy4.setPositionX(250);
    }
}
