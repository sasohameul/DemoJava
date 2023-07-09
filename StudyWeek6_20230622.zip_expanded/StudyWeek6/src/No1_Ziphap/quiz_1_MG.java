package No1_Ziphap;
import java.util.ArrayList;
import java.util.HashSet;

public class quiz_1_MG {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list1.add(i);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(11);

        // 교집합
        ArrayList<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        // 차집합
        ArrayList<Integer> difference = new ArrayList<>(list1);
        difference.removeAll(list2);

        // 합집합
        HashSet<Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        ArrayList<Integer> union = new ArrayList<>(unionSet);

        // 출력
        System.out.println("list1= " + list1);
        System.out.println("list2= " + list2);
        System.out.println("교집합= " + intersection);
        System.out.println("차집합= " + difference);
        System.out.println("합집합= " + union);
    }
}
