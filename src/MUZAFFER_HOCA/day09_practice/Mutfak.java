package MUZAFFER_HOCA.day09_practice;

public class Mutfak {
    public String yemekler = "adana kebab, urfa ciger, kusbasi, kusleme";
    public String araSicak = "yayla corbasi, mercimek, dugun corbasi, corba";
    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecekler = "ayran, salgam, kola";

    public Mutfak(String adana_kebab, String mercimek, String kunefe, String salgam) {
    this.yemekler=adana_kebab;
    this.araSicak=mercimek;
    this.tatlilar=kunefe;
    this.icecekler=salgam;
    }

    public Mutfak() {
        this("adana_kebab", "mercimek", "kunefe", "salgam");
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}