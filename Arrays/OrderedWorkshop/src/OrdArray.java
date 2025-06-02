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

    public void insertOld(long val){
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

    public void insert(long val) { // insert with binary search
        int left = 0;
        int right = nElems-1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] <= val)
                left= mid + 1;
            else {
                right = mid - 1;
            }

        }
        //shift to the right
        for (int i = nElems; i > left; i-- ) { //expand array
                arr[i] = arr[i - 1];
        }
        //insertion
        arr[left] = val;
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
            if (i > 0)
                System.out.print(", ");

            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public long getEl(int ind){
        return arr[ind];
    }
    //task 2.5 PP
    public static OrdArray merge(OrdArray arr1, OrdArray arr2) {
        int s1 = arr1.size();
        int s2 = arr2.size();
        int p1 = 0, p2 = 0;
        OrdArray targetArray;
        targetArray = new OrdArray(arr1.nElems + arr2.nElems);
        int pt = 0;
        while (p1 < arr1.nElems && p2 < arr2.nElems) {
            if (arr1.getEl(p1) <= arr2.getEl(p2)) {
                targetArray.insert(arr1.getEl(p1));
                p1++;
            } else {
                targetArray.insert(arr2.getEl(p2));
                p2++;
            }

        }
        while (p1 < arr1.nElems) {
            targetArray.insert(arr1.getEl(p1));
            p1++;
        }
        while (p2 < arr1.nElems) {
            targetArray.insert(arr2.getEl(p2));
            p2++;
        }
        return targetArray;
    }
}
