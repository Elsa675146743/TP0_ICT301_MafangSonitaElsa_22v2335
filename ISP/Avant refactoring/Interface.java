package ict301.solid.isp;

// 1. L'interface "trop large" (Polluée)
interface Worker {
    void work();
    void eat();
}

// 2. Classe Humain qui utilise toutes les méthodes
class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}

// 3. Classe Robot qui est forcée d'implémenter 'eat' inutilement
class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        // Violation de l'ISP : On force un comportement illogique
        System.out.println("L'on ne doit pas faire manger un robot");
        throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}

// 4. Classe principale (facultative pour tester)
public class MainISP {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        // robot.eat(); // Cela ferait planter le programme !
    }
}