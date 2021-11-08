import java.util.*;
public class arrayList_Intro{
    public static void main(String[] args){

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println(list.size()+" -> "+list); // 0 -> []

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size()+" -> "+list); // 3 -> [10, 20, 30]
        list.add(1, 200);
        System.out.println(list.size()+" -> "+list); // 4 -> [10, 200, 20, 30]

        int val=list.get(2);
        System.out.println(val); // 20
        System.out.println(list.size()+" -> "+list); //4 -> [10, 200, 20, 30]

        list.remove(1);
        System.out.println(list.size()+" -> "+list); // 3 -> [10, 20, 30]

        list.set(1, 200);
        System.out.println(list.size()+" -> "+list); // 3 -> [10, 200, 30]

        for(int i=0;i<list.size();i++){
            int val1=list.get(i);
            System.out.println(val1); // 10 20 30
        }
        for(int val2:list){
            System.out.println(val2); // 10 20 30
        }


        }
        
    }