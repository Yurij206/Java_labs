package Ex2;

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

    ArrayList<Measurable> largest(){
        ArrayList<Measurable> res = new ArrayList<>();
        res.add(objects.get(0));
        for(int i = 1; i<objects.size(); i++){
            if (objects.get(i).getMeasure() > res.get(0).getMeasure()){
                res.clear();
                res.add(objects.get(i));
                System.out.println("Cleared and added");
                continue;
            }
            if(objects.get(i).getMeasure() == res.get(0).getMeasure()){
                res.add(objects.get(i));
                System.out.println("Added");
            }
        }
        return res;
    }
}
