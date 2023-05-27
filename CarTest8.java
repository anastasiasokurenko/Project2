package project2;


    public class CarTest8 {
        public static void main(String[] args) {
            Sedan sedan = new Sedan(25000, "Red", 25);
            System.out.println("Sedan sale price: " + sedan.calculateSalePrice());

            Truck truck = new Truck(50000, "Blue", 3000);
            System.out.println("Truck sale price: " + truck.calculateSalePrice());
        }
    }

