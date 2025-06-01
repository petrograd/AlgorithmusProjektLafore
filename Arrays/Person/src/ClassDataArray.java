public class ClassDataArray {
    private  Person[] arr;
    private int nElems;

    public ClassDataArray(int size) {
        arr = new Person[size];
        nElems = 0;
    }
    public int size() {
        return nElems;
    }

    public void insert(String last, String first, int age){
        arr[nElems] = new Person(last, first, age);
        nElems++;

    }
    public boolean delete(String val){
        int j;
        for(j = 0; j < nElems; j++ ) {
            if (arr[j].getLastName().equals(val)) {
                break;
            }
        }
        if (j == nElems) // didn't find
            return false;
        //
        for (int i = j; i < nElems - 1; i++) {
            arr[i] = arr[i + 1];
        }
        nElems--;  //decrement size
        return true;
    }
//
    public Person find(String searchKey) {
        int j;
        for(j = 0; j < nElems; j++) {
            if (arr[j].getLastName().equals(searchKey))
                return arr[j];
        }
        return null; // searchKey not found
    }
    public void display() {
        for (int i = 0; i < nElems; i++) {
           arr[i].displayPerson();
        }
    }
}
