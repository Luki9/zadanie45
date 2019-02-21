import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int lab = 0;

        while (lab >= 0) {
            lab = (scanner.nextInt());

            if (lab >= 0)
                array.add(lab);
        }


        System.out.println("Lista" + array);
        System.out.println("Lista od tyłu");
        Test2.printReversed(array);

        System.out.println(Test2.sum(array));

    }


}

