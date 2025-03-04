
public class Store {
    String name;
    String date;
    String manufacturer;
    String countryOfOorigin;
    int price;
    Boolean status;


    public Store(String name, String date, String manufacturer, String countryOfOorigin, int price, Boolean status) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.countryOfOorigin = countryOfOorigin;
        this.price = price;
        this.status = status;
    }

    public static void main(String[] args) {
        Store[] productArray = new Store[5];
        productArray[0] = new Store("Samsung UE43DU7100UXRU", "01.02.2025", "Samsung Corp.", "Korea", 37999, true);
        productArray[1] = new Store("LG 75QNED91T6A", "20.04.2024", "LGCorp.", "indonesia", 211990, true);
        productArray[2] = new Store("LG 50NANO80T6A", "20.02.2025", "LGCorp.", "indonesia", 59990, true);
        productArray[3] = new Store("Sony KD-43X75K", "31.12.2024", "SonyCorp.", "Japan", 64790, true);
        productArray[4] = new Store("Sony KD-65X75K", "01.01.2025", "SonyCorp.", "Japan", 108890, false);
        for (int i = 0; i < productArray.length; i++) {
            System.out.println(productArray[i].name);
            System.out.println(productArray[i].date);
            System.out.println(productArray[i].manufacturer);
            System.out.println(productArray[i].countryOfOorigin);
            System.out.println(productArray[i].price);
            System.out.println(productArray[i].status);
        }
    }
}