package tp4;

public class Article {

	private int id;
	private String code;
	private String libelle;
	private Categorie categorie;

	public Article(String code, String libelle, Categorie categorie) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", code=" + code + ", libelle=" + libelle + ", categorie=" + categorie + "]";
	}
}
