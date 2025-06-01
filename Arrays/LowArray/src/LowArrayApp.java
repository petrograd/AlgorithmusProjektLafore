class LowArray {
    private long[] a;

    public LowArray(int size) {
        a = new long[size];
    }
    public void setElem(int index, long value) {
        a[index] = value;
    }
    public long getElem(int index) {
        return a[index];
    }
}
public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr;
        arr = new LowArray(100);
        int nElems = 0;
        int j;

        arr.setElem(0,77);
        arr.setElem(1, 99);
        arr.setElem(2, 33);

        arr.setElem(3,55);
        arr.setElem(4, 22);
        arr.setElem(5,88);
        arr.setElem(6, 11);
        arr.setElem(7,0);
        arr.setElem(8, 99);
        arr.setElem(9,66);
        nElems = 10;

        //display items
        for(j = 0; j < nElems; j++) 
            System.out.print(arr.getElem(j) + " ");
        System.out.println();

        int searchKey = 26;
        for(j = 0; j < nElems; j++) {
            if (searchKey == arr.getElem(j))
                break;
        }
        if (j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        //delete value 55
        for(j = 0; j < nElems; j++)
            if (arr.getElem(j) == 55)
                break;
        //higher ones down
        if (j < nElems) {
            for (int k = j; k < nElems - 1; k++)
                arr.setElem(k, arr.getElem(k + 1));
            nElems--;
        }


        //display items
        for(j = 0; j < nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println();

        //delete value 66
        for(j = 0; j < nElems; j++)
            if (arr.getElem(j) == 66)
                break;
        //higher ones down
        if (j < nElems) {
            for (int k = j; k < nElems - 1; k++)
                arr.setElem(k, arr.getElem(k + 1));
            nElems--;
        }
        //display items
        for(j = 0; j < nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println();
    }
}
