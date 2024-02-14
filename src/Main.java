import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    /**
     * ArrayList тузунуз
     * 1ден 100го чейинки 50 сан менен толтурунуз
     * Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
     * Аларды консольго чыгарыныз
     * <p>
     * Создайте ArrayList.
     * Заполните его от1 до100 50 цифрами.
     * Создайте еще 2 ArrayList и в одну положите четные, во вторую нечетные.
     * Выведите их на консоль
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(1, 100));
        }


        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int counterForEvenNumbers = 0;
        int counterForNotEvenNumbers = 0;

        for (Integer i : list) {
            if (i % 2 == 0) {
                list1.add(i);
                counterForEvenNumbers++;
            } else {
                list2.add(i);
                counterForNotEvenNumbers++;
            }
        }


        System.out.println("Бул толук массив:");
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Бул ЖУП сандардын количествосу:" + counterForEvenNumbers);
        for (Integer i : list1) {
            System.out.print(i + " ");
        }

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Бул ТАК сандардын количествосу:" + counterForNotEvenNumbers);
        for (Integer i : list2) {
            System.out.print(i + " ");
        }
    }

}