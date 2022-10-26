package ELIF_HOCA.day7_practice;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {
        String[][] arr = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double toplam = 0;
        for (int i = 0; i < 3; i++) { //length'i 3 oldugu icin 3 yazdik istersek arr.length de yazabilirdik
            for (int j = 0; j < 3; j++) { //icerdeki length ler de 3 oldugu icin 3 yazdik
                if (arr[i][j].contains("$")) {
                    toplam += Double.parseDouble(arr[i][j].replace("$", "")) * 3.2;

                    //parantez icindeki replaceAll method'u ile dolar isaretlerinden kurtulduk, sonra elimizde
                    //String 12 var (data type String).
                    //Double toplam variable ile isleme katmak icin data casting yaomak gerekir
                    //Bu yuzden Double.parseDouble() method'unu kullandik
                    //bu asamada 12 degeri data type'i double oldu, eklerken de 3.2 ile carpmamizi istedigi
                    //icjn carpma islemi yaptik

                } else {
                    toplam += Double.parseDouble(arr[i][j].replace("€", "")) * 4.2;

                }
            }

        }
        System.out.println("toplam= " + toplam); //toplam= 374.6
    }
}
