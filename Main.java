import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    
    //正解となる3文字の組み合わせを決める。
    //正解となる3文字はArrayListのnumbersに代入。
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    for(;;){
        for(int i=0 ; i < 3; i++){
        Random rand = new Random();
        numbers.add(rand.nextInt(10));
        }
        //設定した3つの文字に重複が発生してしまった場合はもう一度重複部分の数字を決めなおす。
        if(numbers.get(0) != numbers.get(1) && numbers.get(0) != numbers.get(2) && numbers.get(1) != numbers.get(2)) {
            break;
        }
    }

    for(int n: numbers) {
        System.out.println(n);
    }


  }
}