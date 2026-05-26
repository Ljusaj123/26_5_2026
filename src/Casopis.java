public class Casopis extends Publikacija{
    private int brojIzdanja;

    public Casopis(String naslov, int godinaIzdanja, int brojIzdanja) {
        super(naslov, godinaIzdanja);
        this.brojIzdanja = brojIzdanja;
    }

    @Override
    public String toString() {
         return "Časopis " + naslov + " izdan " + godinaIzdanja + ".godine sa brojem izdanja " + brojIzdanja;
    }
}
