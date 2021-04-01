package numeronapp.logics;

import java.util.ArrayList;
import java.util.Random;

public class NumeronLogic {
    
    public static void createThreeNumbers(int[] answers) {
        for(;;) {
            for(int i = 0; i < 3; i++) {
                Random rand = new Random();
                answers[i] = rand.nextInt(10);
            }
            //設定した3つの文字に重複が発生してしまった場合はもう一度重複部分の数字を決めなおす。
            if(answers[0] != answers[1] && answers[0] != answers[2] && answers[1] != answers[2]) {
                break;
            }
        } 

    }
}
