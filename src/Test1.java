import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Test1 {

    public static List<Integer> addToArray() {

        Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> array = new ArrayList<>();
        int lab = 0;

        do {

            System.out.println("Podaj liczby");
            lab = scanner.nextInt();
            if (lab >= 0)
                array.add(lab);
        }while (lab >=0);

        scanner.close();

            return array;

    }
}
