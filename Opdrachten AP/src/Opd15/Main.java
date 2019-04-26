package Opd15;

public class Main {
    public static void main(String[] arg) {
        Rented r1 = new Rented();
        System.out.println("Eerste autoverhuur: \n"+r1.toString());

        Customer c1 = new Customer("Mijnheer de Vries");
        c1.setDiscountpercentage(10.0);
        r1.setCustomer(c1);
        System.out.println("Eerste autoverhuur: \n"+r1.toString());

        Car car1 = new Car("Peugeot 207", 50);
        r1.setRentedCar(car1);
        r1.setDays(4);
        System.out.println("Eerste autoverhuur: \n"+r1.toString());

        Rented r2 = new Rented();
        Car car2 = new Car("Ferrari", 3500);
        r2.setRentedCar(car2);
        r2.setCustomer(c1);
        r2.setDays(1);
        System.out.println("Tweede autoverhuur: \n"+r2.toString());

        System.out.println("\nGehuurd: "+r1.getRentedcar());
        System.out.println("Gehuurd: "+r2.getRentedcar());
    }
}
