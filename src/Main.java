public class Main {
    public static void main(String[] args) {
        // Create a hash table with a size of 10
        HashTable hashTable = new HashTable(10);

        // Insert key-value pairs into the hash table
        hashTable.insert("Alice", "123-456-7890");
        hashTable.insert("Bob", "234-567-8901");
        hashTable.insert("Charlie", "345-678-9012");

        // Retrieve values using keys
        String aliceNumber = hashTable.search("Alice");
        String bobNumber = hashTable.search("Bob");
        String davidNumber = hashTable.search("David"); // Returns null for non-existing key

        // Output retrieved values
        System.out.println("Alice's number: " + aliceNumber); // Output: 123-456-7890
        System.out.println("Bob's number: " + bobNumber); // Output: 234-567-8901
        System.out.println("David's number: " + davidNumber); // Output: null

        // print the values using Iterator
        Iterator<String> it = hashTable.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
