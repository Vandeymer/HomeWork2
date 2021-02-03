package Runners;

public class Cat implements Runners {
    private int jumpHeight, runDistance;
    public Cat(int jumpHeight, int runDistance) {

        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run() {

    }

    @Override
    public int jump() {
        return this.jumpHeight;
    }
}
