public class Publikacija implements Comparable<Publikacija> {
    protected String naslov;
    protected int godinaIzdanja;

    public Publikacija(String naslov, int godinaIzdanja) {
        this.naslov = naslov;
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public int compareTo(Publikacija o) {
        return Integer.compare(godinaIzdanja, o.godinaIzdanja);
    }
}
