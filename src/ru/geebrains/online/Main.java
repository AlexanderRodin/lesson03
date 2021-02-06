package ru.geebrains.online;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"face", "life", "week", "work", "day", "sun",
                "room", "life", "school", "sun", "tree", "fire", "work", "food",
                "street", "room", "money", "wey", "tree", "pen", "work"};

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
        sortList(arrList);

        System.out.println();

        Spawner arrNum = new Spawner();
        arrNum.addTelephone("Sidorov%", "+7978487996");
        arrNum.addTelephone("Pttrov", "+79125130874");
        arrNum.addTelephone("Rodin", "+79787788666");
        arrNum.addTelephone("Budnik", "+79784455888");
        arrNum.addTelephone("Budnik", "+79885333322");
        arrNum.addTelephone("Skvortsov", "+79125130874");


        System.out.println();



        System.out.println("Surname: Budnik; Number:  "+arrNum.getTelephone("Budnik"));
        System.out.println("Surname: Pttrov; Number:  "+arrNum.getTelephone("Pttrov"));



        }

    public static void sortList (ArrayList<String> arrList){
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for(String str : arrList){
            if(counts.containsKey(str)){
                counts.put(str, counts.get(str)+1);
            }else counts.put(str, 1);
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()){
            System.out.print(entry.getKey()+"; ");
        }
        System.out.println();
        for(Map.Entry<String, Integer> entry : counts.entrySet()){
            if(entry.getValue() > 1)
                System.out.print(entry.getKey() + " = "+entry.getValue()+"; ");
        }

    }


}
