import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Publikacija> publikacije = new ArrayList<>();
        while (true) {
            System.out.println("Izaberite vrstu publikacije:\n1 - Knjiga\n2 - Časopis\n3 - Znanstveni rad\n4 - Kraj ");
            int tip = sc.nextInt();
            sc.nextLine(); //ne procita Enter nakon broja pa nextLine u switch pročita prazan red, čišćenje buffera
            String unos = "";
            String[] dijelovi;

            if (tip == 4) {
                break;
            }
            switch (tip) {
                case 1:
                    System.out.println("Unesite naslov, godinu izdanja i autora");
                    unos = sc.nextLine();
                    dijelovi = unos.split(" ");
                    Knjiga knjiga = new Knjiga(dijelovi[0], Integer.parseInt(dijelovi[1]), dijelovi[2]);
                    publikacije.add(knjiga);
                    break;
                case 2:
                    System.out.println("Unesite naslov, godinu izdanja i broj izdanja");
                    unos = sc.nextLine();
                    dijelovi = unos.split(" ");
                    Casopis casopis = new Casopis(dijelovi[0], Integer.parseInt(dijelovi[1]), Integer.parseInt(dijelovi[2]));
                    publikacije.add(casopis);
                    break;
                case 3:
                    System.out.println("Unesite naslov, godinu izdanja i podrucje");
                    unos = sc.nextLine();
                    dijelovi = unos.split(" ");
                    ZnanstveniRad rad = new ZnanstveniRad(dijelovi[0], Integer.parseInt(dijelovi[1]), dijelovi[2]);
                    publikacije.add(rad);
                    break;
                default:
                    System.out.println("Neispravan unos!");
            }
        }

        Collections.sort(publikacije);
        for (Publikacija publikacija : publikacije) {
            System.out.println(publikacija);

        }
    }
}