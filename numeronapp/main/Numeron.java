package numeronapp.main;

import numeronapp.logics.NumeronLogic;
import java.util.ArrayList;

public class Numeron {
    public static void main(String[] args) {
        
        int[] answers = new int[5];
        NumeronLogic.createThreeNumbers(answers);

        //解答となる3つの数字がルール通り決定できているか確認
        for(int n: answers) {
            System.out.println(n);
        }

    }
    
}
