package main;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.add("123");
        directory.add("236");
        directory.add("456");
        directory.add("888");

        IIterator iterator = new IteratorGuide(directory);

        while(iterator.nextContains()){
            System.out.println(iterator.next());
        }
    }
}
