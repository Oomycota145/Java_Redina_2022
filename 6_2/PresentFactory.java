package t6_2;

import java.util.ArrayList;
import java.util.List;

public class PresentFactory {
    private Sweetness[] possibleSweetness;

    public PresentFactory(Sweetness[] possibleSweetness) {
        this.possibleSweetness = possibleSweetness;
    }

    public ChildPresent createChildPresent(int weight){
        int presentWeight = 0;
        List<Sweetness> present = new ArrayList<>();

        for (Sweetness sweetness : possibleSweetness) {
            if (sweetness.getWeight() + presentWeight < weight) {
                presentWeight += sweetness.getWeight();
                present.add(sweetness);
            }
        }

        return new ChildPresent(present.toArray(new Sweetness[present.size()]), presentWeight);
    }
}
