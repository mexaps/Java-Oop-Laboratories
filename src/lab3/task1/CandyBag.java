package lab3.task1;

import java.util.ArrayList;
import java.util.List;

public class CandyBag {
    private List<CandyBox> candyBoxes =new ArrayList<>();

    public void addInCandyBox(CandyBox candyBox) {
        candyBoxes.add(candyBox);
    }

    public void printCandyBoxes() {
        for (CandyBox candyBox : candyBoxes) {
            System.out.println(candyBox);
        }
    }

}
