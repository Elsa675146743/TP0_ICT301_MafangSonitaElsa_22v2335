package ict301.solid.dip.old;

// 1. Classe de bas niveau (Détail d'implémentation)
class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

// 2. Classe de haut niveau (Logique métier)
class OrderProcessor {
    private MySQLDatabase database;

    public OrderProcessor() {
        // Violation du DIP : Couplage fort
        // OrderProcessor crée lui-même sa dépendance
        this.database = new MySQLDatabase();
    }

    public void processOrder(String order) {
        database.save(order);
    }
}

// 3. Classe principale (Point d'entrée)
public class Main {
    public static void main(String[] args) {
        OrderProcessor order = new OrderProcessor();
        order.processOrder("'Données à sauvegarder'");
    }
}