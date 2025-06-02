public class HighArray {
    private long[] a;
    private int nElems;
    public HighArray(int size) {
        a = new long[size];
        nElems = 0;
    }
    public boolean find(long searchKey){
        for (int i = 0; i < nElems; i++) {
            if (searchKey == a[i])
                return true;
        }
        return false;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for(j = 0; j < nElems; j++ )
            if (value == a[j])
                break;

        if (j == nElems) //not found
            return false;
        //higher ones down

        for(int k = j; k < nElems - 1; k++)
            a[k] = a[k + 1];
        nElems--;
        return true;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public long getMax() {

        long maxVal = -1;
        for (int i = 0; i < nElems; i++) {
            if (a[i] > maxVal)
                maxVal = a[i];
        }
        return maxVal;
    }

    public long removeMax() {
        long maxValue = getMax();
        delete(maxValue);
        return maxValue;

    }
    public int size() {
        return nElems;
    }

    public void noDups() {

        //This version shrinks the array as it goes along
        long value;
        for (int i = 0; i < nElems; i++) {
            value = a[i];
            for (int j = i + 1; j < nElems; j++) {
                if (a[j] == value) {
                    for (int k = j; k < nElems - 1; k++) {
                        a[k] = a[k+1];
                    }
                    nElems--;
                    j--;
                    System.out.println("Deleted " + value);
                }
            }
        }
    }
}
