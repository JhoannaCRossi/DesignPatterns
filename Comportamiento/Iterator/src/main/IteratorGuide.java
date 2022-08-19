package main;

public class IteratorGuide implements IIterator{

    private Directory directory;
    private int index;

    public IteratorGuide(Directory directory) {
        this.directory = directory;
    }

    @Override
    public String next() {
        return this.directory.getPhones().get(this.index++);
    }

    @Override
    public boolean nextContains() {
        return this.index < this.directory.getPhones().size() &&
                this.directory.getPhones().get(this.index) != null;
    }
}
