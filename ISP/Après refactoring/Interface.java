package ict301.solid.isp;

// 1. Interfaces séparées (Segregation)
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

// 2. Classe Humain qui implémente les deux interfaces
// Note : On peut aussi faire 'interface Eatable extends Workable' 
// ou simplement implémenter les deux comme ceci :
class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}

// 3. Classe Robot qui n'implémente QUE ce dont elle a besoin
class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }
}

// 4. Classe principale
public class MainISP {
    public static void main(String[] args) {
        // Test Humain
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        // Test Robot
        RobotWorker robot = new RobotWorker();
        robot.work();
        // robot.eat(); // Cette ligne ne compilerait même pas, ce qui est correct !
    }
}