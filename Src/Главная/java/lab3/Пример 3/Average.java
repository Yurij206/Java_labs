package Ex1;

import java.util.ArrayList;

public class Average {

    public ArrayList<Measurable> objects;

    double average(){
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return (sum/ objects.size());
    }


}
