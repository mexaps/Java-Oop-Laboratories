package lab2.antrenament;

import java.util.ArrayList;
import java.util.List;

public class Portofoliu {

    private Integer userId;
    private float randament;

    private List<Instrument> instruments;

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public Portofoliu(Integer userId){
        this.userId=userId;
        randament=0;
        instruments = new ArrayList<>();
    }

    public float getRandament() {
        return randament;
    }

    public void setRandament(float randament) {
        this.randament = randament;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void addInstrument(Instrument instrument){
        instruments.add(instrument);
    }


    @Override
    public String toString() {
        return "Portofoliu{" +
                "userId=" + userId +
                ", randament=" + randament +
                ", instruments=" + instruments +
                '}';
    }
}
