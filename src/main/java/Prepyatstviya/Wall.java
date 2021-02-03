package Prepyatstviya;

import Runners.Runners;

public class Wall implements Prepyatsviya {
    private int wallHeight; //внутреннее поле (высота стены)
    Wall(int wallHeight) { // конструктор (конфигурируем наш класс)
    this.wallHeight = wallHeight;
    }

    @Override
    public void preodolevat(Runners runners) { // метод
    int runnerJumpHeight =  runners.jump(); // вызов метода
    if (this.wallHeight <= runnerJumpHeight) { //
        System.out.println("Раннер перепрыгнул через стену");
    } else {
        System.out.println("Раннер не перепрыгнул через стену");
    }
    }

}
