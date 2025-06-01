public class OrdArray {
    private  long[] arr;
    private int nElems;

    public OrdArray(int size) {
        arr = new long[size];
        nElems = 0;
    }
    public int size() {
        return nElems;
    }

    public void insert(long val){
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] > val)
                break;
        }
        if (j <  nElems) {
            for (int i = nElems; i > j; i--) {
                arr[i] = arr[i - 1];
            }
        }
        arr[j] = val;
        nElems++;

    }
    public boolean delete(long val){
        int j = find(val);
        if (j == nElems) //can't find it
            return false;

        for(int i = j; i < nElems - 1; i++){   //move bigger ones down
            arr[i] = arr[i+1];
        }
        nElems--;  //decrement size
        return true;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curInd;
        while(true) {
            curInd = (lowerBound + upperBound) / 2;
            if(arr[curInd] == searchKey)
                return curInd;  // found it
            else if (lowerBound > upperBound)
                return nElems; // not found
            else
                if (arr[curInd] > searchKey)
                    upperBound = curInd - 1; //it's in lower half
                else
                    lowerBound = curInd + 1; //it's in upper half
        }
    }
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
