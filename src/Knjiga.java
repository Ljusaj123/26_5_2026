public class Knjiga extends Publikacija{
    private String autor;

    public Knjiga(String naslov, int godinaIzdanja, String autor) {
        super(naslov, godinaIzdanja);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Knjiga " + naslov + " izdana " + godinaIzdanja + ".godine od autora " + autor;
    }
}
