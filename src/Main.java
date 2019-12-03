import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Toyota VS Honda");
        System.out.println("Добавьте марки автомобиля Toyota в список А");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>(5);

        String carModel1 = scanner.nextLine();
        listA.add(carModel1);

        String carModel2 = scanner.nextLine();
        listA.add(carModel2);

        String carModel3 = scanner.nextLine();
        listA.add(carModel3);

        String carModel4 = scanner.nextLine();
        listA.add(carModel4);

        String carModel5 = scanner.nextLine();
        listA.add(carModel5);

        Iterator<String> iterator = listA.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        ArrayList<String> listB = new ArrayList<>(5);

        System.out.println("Добавьте марки автомобиля Honda в список Б");

        String carModel6 = scanner.nextLine();
        listB.add(carModel6);

        String carModel7 = scanner.nextLine();
        listB.add(carModel7);

        String carModel8 = scanner.nextLine();
        listB.add(carModel8);

        String carModel9 = scanner.nextLine();
        listB.add(carModel9);

        String carModel10 = scanner.nextLine();
        listB.add(carModel10);

        iterator = listB.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        System.out.println("Объединение марок Toyota и Honda в список С");

        ArrayList<String> listC = new ArrayList<>(10);
        listC.addAll(listA);
        listC.add(1, listB.get(4));
        listC.add(3, listB.get(3));
        listC.add(5, listB.get(2));
        listC.add(7, listB.get(1));
        listC.add(9, listB.get(0));

        iterator = listC.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        System.out.println("Сортировка списка С по длинне слов. Сначала идут короткие слова");

        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                if (string1.length() > string2.length()) {
                    return 1;
                } else if (string1.length() < string2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        iterator = listC.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

    }
}
