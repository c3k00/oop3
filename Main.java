
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StreamComparator group1 = new StreamComparator("#1", 54);
        StreamComparator group2 = new StreamComparator("#2", 44);
        StreamComparator group3 = new StreamComparator("#3", 34);
        StreamComparator group4 = new StreamComparator("#4", 51);
        StreamComparator group5 = new StreamComparator("#5", 43);
        StreamComparator group6 = new StreamComparator("#6", 15);
        StreamComparator group7 = new StreamComparator("#7", 24);
        StreamComparator group8 = new StreamComparator("#8", 33);

        System.out.println("==".repeat(13)+"GROUP"+"==".repeat(13));

        List<StreamComparator> groupList = new ArrayList<>(List.of(group1,group2,group3,group4,group5,group6,group7,group8));
        StudentGroupIterator studentGroupIterator = new StudentGroupIterator(groupList);
        System.out.println(studentGroupIterator.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",",""));

        System.out.println("==".repeat(8)+"Поочередный вывод груп"+"==".repeat(8));

        while (studentGroupIterator.hasNext()){
            System.out.println(studentGroupIterator.getGroup(studentGroupIterator.getCount()).toString1());
            studentGroupIterator.next();
        }

        System.out.println("==".repeat(5)+"Сортировка груп по количеству студентов"+"==".repeat(5));

        Collections.sort(groupList);
        System.out.println((groupList.toString())
                .replace("[", "")
                .replace("]", "")
                .replace(",",""));
    }

}
