public class ZnanstveniRad extends Publikacija{
    private String podrucje;

    public ZnanstveniRad(String naslov, int godinaIzdanja, String podrucje) {
        super(naslov, godinaIzdanja);
        this.podrucje = podrucje;
    }

    @Override
    public String toString() {
        return "Znanstveni rad " + naslov + " izdan " + godinaIzdanja + ".godine na podrucju " + podrucje;
    }
}
