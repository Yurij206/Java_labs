package Ex4;

import java.util.ArrayList;

public interface IntSequence {
    default boolean hasNext() { return true; };
    long next();

    static IntSequence of(ArrayList<Integer> arr){
        long res = 0;
        if(arr.size() > 0){
            for(int i = arr.size(); i > 0; i--){
                res += arr.get(arr.size() - i)*Math.pow(10, i+1);
            }
        }
        long finalRes = res;
        return new IntSequence() {
            private long number = finalRes;
            @Override
            public long next() {
                long a = (long)Math.pow(10L, Long.toString(number).length() - 1);
                long res = number / a;
                number = number - res*a;
                return res;
            }

            public boolean hasNext(){
                return !(Long.toString(number).length() == 1 && number == 0);
            }
        };
    }
}
