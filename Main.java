import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    //正解となる3文字の組み合わせを決める。
    //正解となる3文字はArrayListのnumbersに代入。
    ArrayList<Integer> ansewrs = new ArrayList<Integer>();
    
    for(;;){
        for(int i=0 ; i < 3; i++){
        Random rand = new Random();
        ansewrs.add(rand.nextInt(10));
        }
        //設定した3つの文字に重複が発生してしまった場合はもう一度重複部分の数字を決めなおす。
        if(ansewrs.get(0) != ansewrs.get(1) && ansewrs.get(0) != ansewrs.get(2) && ansewrs.get(1) != ansewrs.get(2)) {
            break;
        }
    }
    //↓チェック用
    //答えが分かってしまうため後で削除
    for(int n: ansewrs) {
        System.out.println(n);
    }

    //3桁の文字の入力を受け付ける部分
    Scanner scanner = new Scanner(System.in);
    System.out.println("3桁の数字を入力してください。");
    int temporaryNumber = scanner.nextInt();
    scanner.close();
    System.out.println("あなたが入力した数字は" + temporaryNumber + "です。");
    
    //3文字をそれぞれ配列に格納する
    ArrayList<Integer> inputNumbers = new ArrayList<Integer>();
    inputNumbers.add(0, temporaryNumber / 100);
    inputNumbers.add(1, temporaryNumber % 100 / 10);
    inputNumbers.add(2, temporaryNumber % 10);

    for(int n: inputNumbers) {
        System.out.println(n);
    }




  }
}