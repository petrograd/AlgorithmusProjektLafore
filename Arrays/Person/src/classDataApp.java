public class classDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray personsList;
        personsList = new ClassDataArray(maxSize);

        personsList.insert("John", "Elton", 24);
        personsList.insert("Smith", "Lorraine", 37);
        personsList.insert("Yee", "Tom", 43);
        personsList.insert("Adams", "Henry", 63);
        personsList.insert("Hashimoto", "Sato", 21);
        personsList.insert("Stimson", "Henry", 29);
        personsList.insert("Velasquez", "Jose", 72);
        personsList.insert("Lamarque", "Henry", 54);
        personsList.insert("Vang", "Minh", 22);
        personsList.insert("Creswell", "Lucinda", 18);

        personsList.display();

        String searchKey = "Stimson";
        findPerson(personsList, searchKey);
        searchKey = "Stimson2";
        findPerson(personsList, searchKey);

        System.out.println("Deleting Smith, Yee and Creswell");
        personsList.delete("Smith");
        personsList.delete("Yee");
        personsList.delete("Creswell");

        personsList.display();
    }
    public static void findPerson(ClassDataArray arr, String name) {
        Person found;
        found = arr.find(name);
        if (found != null)
            System.out.println("Found: " + found.getLastName());
        else
            System.out.println("Not Found: " + name);

    }
}
