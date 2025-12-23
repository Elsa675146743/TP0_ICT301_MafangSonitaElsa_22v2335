package ict301.solid.lsp;

// 1. Définition de l'interface commune
interface Shape {
    int getArea();
}

// 2. Implémentation pour le Carré
class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

// 3. Implémentation pour le Rectangle
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

// 4. Classe principale pour tester
public class Mainlsp2 {
    public static void main(String[] args) {
        // On utilise le type générique Shape
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println("Square Area : " + square.getArea());      // Affiche 9
        System.out.println("Rectangle Area: " + rectangle.getArea()); // Affiche 12
    }
}