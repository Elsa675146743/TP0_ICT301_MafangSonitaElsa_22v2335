// Classe BookSaver : persistance
 class BookSaver 
 {
 public void saveToDatabase(BookSRP book)
  {
 System.out.println("\nSauvegarde de '" + book.getTitle() + "' en base de données..."); }

//On peut ajouter d'autres façons de sauvegarder
 public void saveToFile(BookSRP book, String filename)
  {
 System.out.println("\nSauvegarde de '" + book.getTitle() + "' dans " + filename); }
 }

// Classe BookBusinessLogic : Logique métier
 class BookBusinessLogic 
 {
 public void emprunter(BookSRP book, String lecteur) 
 {
 System.out.println("\nEmprunt du livre '" + book.getTitle() + "' par " + lecteur); }

//On peut ajouter d'autres logiques
 public void autreService(BookSRP book)
  {
 System.out.println("\nAutre logique métier sur le livre '" + book.getTitle());}
 }