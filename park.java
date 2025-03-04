public class Park {
    public static class Attraction {
        final String name;
        final String openingTime;
        final int price;

        public Attraction(String name, String openingTime, int price) {
            this.name = name;
            this.openingTime = openingTime;
            this.price = price;

        }
    }

    public static void main(String[] args) {
        Attraction[] attractionArray = new Attraction[3];
        attractionArray[0] = new Attraction("Американские горки", "10:00", 1);
        attractionArray[1] = new Attraction("Колесо обозрения", "10:30", 2);
        attractionArray[2] = new Attraction("Водный дартс", "11:00", 3);
        for (int i = 0; i < attractionArray.length; i++) {
            System.out.println(attractionArray[i].name);
            System.out.println(attractionArray[i].openingTime);
            System.out.println(attractionArray[i].price);
        }
    }
}