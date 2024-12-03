public class Main {
    public static void main(String[] args) {
        etudiant[] T = {
                new etudiant("Alice", "Dupont", 14),
                new etudiant("Bob", "Martin", 16),
                new etudiant("Carla", "Lefèvre", 12),
                new etudiant("David", "Dubois", 15),
                new etudiant("Emma", "Lemoine", 18)
        };

        for (etudiant etudiant : T) {
            if (etudiant.getNom().equals("Alice")) {
                if (etudiant.setNote(19)) {
                    System.out.println("Mise à jour de la note de Alice réussie.");
                } else {
                    System.out.println("Mise à jour de la note de Alice échouée.");
                }
                break;
            }
        }

        etudiant e1 = new etudiant("Lucas", "Marc", 17);
        System.out.print("Etudiant e1 : ");
        e1.afficher();

        etudiant e2 = new etudiant("Chloé", "Léa", 10);
        System.out.println("Prénom de l'étudiant e2 : " + e2.getPrenom());

        for (etudiant etudiant : T) {
            etudiant.afficher();
        }
    }
}