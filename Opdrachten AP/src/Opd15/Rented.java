package Opd15;

public class Rented {
    private int days;
    private Car rentedcar;
    private Customer customer;

    public Rented(){
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setRentedCar(Car rentedcar){
        this.rentedcar = rentedcar;
    }

    public String getRentedcar() {
        return this.rentedcar.getType() + " met prijs per dag "+ this.rentedcar.getPriceperday();
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }


    public double totalPrice(){
        if (rentedcar != null && customer != null)
            return this.days * this.rentedcar.getPriceperday() * (1 - (this.customer.getDiscountpercentage() / 100));
        else
            return 0.0;
    }

    public String toString(){
        String outcome = "";
        if (this.rentedcar == null)
            outcome += "\ter is geen auto bekend\n";
        else
            outcome += "\tautotype: "+this.rentedcar.getType()+" met prijs per dag: "+this.rentedcar.getPriceperday()+"\n";
        if (this.customer == null)
            outcome += "\ter is geen huurder bekend\n";
        else
            outcome += "\top naam van: " + this.customer.getName() + " (korting: " + this.customer.getDiscountpercentage() + "%)\n";
        outcome += "\taantal dagen: "+this.days+" en dat kost "+ totalPrice();
        return outcome;
    }
}

