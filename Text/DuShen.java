package Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//赌神
public class DuShen {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♥","♠","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color+number);
            }
        }
        //2.洗牌
        Collections.shuffle(poker);
        //3.发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if(i%3==0){
                player01.add(p);
            }else if(i%3==1){
                player02.add(p);
            }else if(i%3==2){
                player03.add(p);
            }

        }
        //4.看牌
        System.out.println("周润发："+player01);
        System.out.println("刘德华："+player02);
        System.out.println("渣渣辉："+player03);
        System.out.println("底牌："+dipai);
    }
}
