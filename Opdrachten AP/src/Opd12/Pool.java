package Opd12;

public class Pool {
    private double length, height, depth;

    public Pool(){
    }

    public Pool(double length,double height,double depth){
        this.length = length;
        this.height = height;
        this.depth = depth;
    }

    public String toString() {
        return "Dit zwembad is " +this.length+" meter breed, "+this.height+" meter lang, en "+this.depth+" meter diep";
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public double getVolume() {
        return this.length * this.height * this.depth;
    }
}
