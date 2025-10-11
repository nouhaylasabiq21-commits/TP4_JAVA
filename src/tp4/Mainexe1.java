package tp4;

public class Mainexe1 {
	public static void main(String[] args) {

		Etudiantexe1 e1 = new Etudiantexe1(81, "Dupont", "Alice", null, 0);
		Etudiantexe1 e2 = new Etudiantexe1(3, "Martin", "Bob", null, 8);

		e1.ajouterNote(14.5);
		e1.ajouterNote(12.0);
		e1.ajouterNote(16.0);

		e2.ajouterNote(10.0);
		e2.ajouterNote(13.5);

		e1.afficherNotes();
		System.out.println(e1);

		e2.afficherNotes();
		System.out.println(e2);
	}
}
