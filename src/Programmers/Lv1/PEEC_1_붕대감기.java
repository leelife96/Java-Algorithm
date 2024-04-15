package Programmers.Lv1;

import java.util.*;

public class PEEC_1_붕대감기 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        Map<Integer, Integer> attackInfo = new HashMap<>();
        int now_hp = health;
        int successcount = 0;

        for(int[] attack : attacks) {
            attackInfo.put(attack[0], attack[1]);
        }

        for(int i=1; i<=attacks[attacks.length-1][0]; i++){
            if(attackInfo.containsKey(i)){
                now_hp -= attackInfo.get(i);
                successcount = 0;
            }
            else {
                now_hp+=bandage[1];
                successcount++;
                if(successcount == bandage[0]){
                    now_hp += bandage[2];
                    successcount = 0;
                }
                if(now_hp > health) {
                    now_hp = health;
                }

            }
            if(now_hp <= 0){
                return -1;
            }
        }

        return now_hp;
    }
}
