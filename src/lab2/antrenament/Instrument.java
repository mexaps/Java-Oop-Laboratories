package lab2.antrenament;

public class Instrument {

    private String titlu;
    private Integer costperactiune;

    public Instrument(String titlu, Integer costperactiune){
        this.titlu=titlu;
        this.costperactiune=costperactiune;
    }

    public Integer getCostperactiune() {
        return costperactiune;
    }

    public void setCostperactiune(Integer costperactiune) {
        this.costperactiune = costperactiune;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "titlu='" + titlu + '\'' +
                ", costperactiune=" + costperactiune +
                '}';
    }


}
