package HomeWork2;

public class MainApp {
    public static void main(String[] args) {
        Runners[] runners = {
            new Human(), new Cat(), new Robot()
        };
        for (Runners r : runners){
            r.jump();
            r.run();
        }
    }


}


class Human implements Runners {
    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }
};

class Cat implements Runners {
    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }
}

class Robot implements Runners {
    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
}