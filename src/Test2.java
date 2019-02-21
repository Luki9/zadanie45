import java.util.List;

class Test2 {


    public static void printReversed(List<Integer> array) {

        for (int i = array.size() - 1; i >= 0; i--) {

            System.out.println(array.get(i) + ",");

        }
    }

    public static int sum(List<Integer> array) {
        if (array == null || array.size() == 0) throw new NullPointerException();

        int sum = 0;
        for (int i = 0; i < array.size(); i++) {

            sum = sum + array.get(i);

            return sum;

        }

    }

        public static void smallest(List<Integer> array) {

            if (array == null || array.size() == 0) throw new NullPointerException();
            int min = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) < min)
                    min = array.get(i);

            }
            System.out.println("Smallest elemet");

        }

        public static void biggeest(List<Integer> array){
        if (array ==null || array.size() == 0 ) throw new NullPointerException();

        int max = array.get(0);
            for (int i = 0; i <array.size() ; i++) {
                if (array.get(i) > max)
                    max = array.get(i);
            }
            System.out.println("Biggest element");
            }
        }


