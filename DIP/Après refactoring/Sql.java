package ict301.solid.dip;

// 1. L'abstraction (Interface)
interface Database {
    void save(String data);
}

// 2. Implémentation de bas niveau : MySQL
class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

// 3. Implémentation de bas niveau : MongoDB
class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}

// 4. Classe de haut niveau (Respect du DIP)
// Elle reçoit sa dépendance par injection (via le constructeur)
class OrderProcessor {
    private Database database;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}

// 5. Classe principale (Configuration et Exécution)
public class Main {
    public static void main(String[] args) {
        // On peut facilement changer d'implémentation ici
        Database database;

        // Utilisation de MySQL
        database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("'Données à sauvegarder via MySQL'");

        // Changement pour MongoDB sans toucher à OrderProcessor
        database = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("'Données à sauvegarder via MongoDB'");
    }
}