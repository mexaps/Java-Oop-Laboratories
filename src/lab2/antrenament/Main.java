package lab2.antrenament;

public class Main {


    public static void main(String[] args) {

        Portofoliu p = new Portofoliu(1);
        Instrument inst1= new Instrument("unu", 10);
        Instrument inst2= new Instrument("doi", 15);
        Instrument inst3= new Instrument("trei", 20);
        p.addInstrument(inst1);
        p.addInstrument(inst2);
        p.addInstrument(inst3);

        System.out.println(p);
    }

}
