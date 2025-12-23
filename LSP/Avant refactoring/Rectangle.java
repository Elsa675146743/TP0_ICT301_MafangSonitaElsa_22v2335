package C.solid.lsp;

// 1. Classe de base
class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

// 2. Sous-classe qui hérite de Rectangle
class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

// 3. Classe principale (Point d'entrée)
public class Mainlsp {
    public static void main(String[] args) {
        // Test avec un Rectangle classique
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire du Rectangle = " + rectangle.getArea()); // Affiche 20

        // Test avec un Carré (utilisant le polymorphisme)
        Rectangle rectangle1 = new Square();
        rectangle1.setWidth(5);
        rectangle1.setHeight(4); 
        
        // Ici on voit le problème du principe de substitution de Liskov (LSP) :
        // On s'attendait à 20 (5x4), mais on obtient 16 car setHeight a écrasé la largeur.
        System.out.println("Aire du Carré = " + rectangle1.getArea()); 
    }
}