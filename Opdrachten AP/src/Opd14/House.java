package Opd14;

public class House {
    private String address;
    private int build;
    private Person landlord;

    public House() {
    }

    public House(String address, int build) {
        this.address = address;
        this.build = build;
    }

    public String to_String(){
        return "Huis "+this.address+" is gebouwd in "+this.build+" en heeft huisbaas "+this.landlord.to_String();
    }

    public void setLandLord(Person landlord) {
        this.landlord = landlord;
    }

    public Person getLandlord() {
        return this.landlord;
    }
}
