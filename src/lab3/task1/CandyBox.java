package lab3.task1;

import lab2.antrenament.Instrument;

import java.util.Objects;

public class CandyBox {

    private String flavor;
    private String origin;

    public CandyBox() {

    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }

    public float getVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

 class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {

    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    public void printLindtDim() {
        System.out.println("Lindt dim - Length: " + length + ", Width: " + width + ", Height: " + height);
    }
    public String toString() {
        return "The " + super.getOrigin() + " flavor has volume " + getVolume();
    }
}

class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {

    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }


    @Override
    public float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    public void printBaravelliDim() {
        System.out.println("Baravelli dim - Radius: " + radius + ", Height: " + height);
    }
    public String toString() {
        return "The " + super.getOrigin() + " flavor has volume " + getVolume();
    }
}

//


class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor() {

    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    public void printChocArmorDim() {
        System.out.println("Choc armor dim - Lenght:" + length);
    }

    public String toString() {
        return  "The " + super.getOrigin() + " flavor has volume " + getVolume();
    }
}
