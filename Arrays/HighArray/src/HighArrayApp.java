public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        for (int i = 0; i < 10; i++) {
            arr.insert(33);
        }
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 35;
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else System.out.println("Can't find " + searchKey);

        arr.delete(0);
        arr.delete(55);
        arr.delete(99);
        arr.delete(100);

        arr.display();

        System.out.println(" max Value: " + arr.getMax());

        System.out.println("deleting 77");
        arr.delete(77);


        arr.display();
        System.out.println(" max Value:  " + arr.getMax());

       HighArray receiverArray = new HighArray(maxSize);

       while (arr.size() > 0) {
           long val = arr.removeMax();
           receiverArray.insert(val);
       }

        System.out.println("donor array: ");
        arr.display();

        System.out.println("receiver array: ");
        receiverArray.display();

        receiverArray.noDups();

        receiverArray.display();


    }
}
