package com.qf.demo;

import com.qf.entity.Rabbit;

import java.util.ArrayList;
import java.util.List;

/* * 有一对兔子，从出生后的第3个月起每个月都生一对兔子，
小兔子长到第3个月后每个月又生一对兔子，假如兔子不死，问第20个月第兔子对数为多少？
  使用面向对象的方法
*/
public class demo {
    public static void main(String[] args) {

        //定义一个笼子
        List<Rabbit> rabbits = new ArrayList<>();
        //将兔子加入笼子
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {//第一个月放一只
                rabbits.add(new Rabbit());
            }else {
                //每个月只需要将笼子里面的兔子拿出来
                List<Rabbit> newRabbits = new ArrayList<>(rabbits);
                for (Rabbit rabbit : newRabbits) {
                    rabbit.addAge();
                    Rabbit son = rabbit.son();
                    if (son != null){
                        rabbits.add(son);
                    }
                }
            }
        }
        System.out.println(rabbits.size());

    }
}
