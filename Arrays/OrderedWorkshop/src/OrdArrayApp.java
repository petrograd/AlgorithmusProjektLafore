public class OrdArrayApp {

        public static void main(String[] args) {
            int maxSize = 100;
            OrdArray arr, arr2, resArray;
            arr = new OrdArray(maxSize);

            for (int i = 0; i < 10; i++) {
                arr.insert((int) (Math.random() * 1000));
            }

            System.out.println("Arr1, size " + arr.size());
            arr.display();

            arr2 = new OrdArray(maxSize);
            for (int i = 0; i < 10; i++) {
                arr2.insert((int) (Math.random() * 100));
            }
            System.out.println("Arr2, size " + arr2.size());
            arr2.display();

            resArray = OrdArray.merge(arr, arr2);

            System.out.println("resArr, size " + resArray.size());
            resArray.display();
        }

}
