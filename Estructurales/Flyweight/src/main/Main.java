package main;

public class Main {
    public static void main(String[] args) {

        CloudFactory factory = new CloudFactory();

        for (int i = 0; i < 10; i++) {
            Cloud cloud = factory.getCloud(CloudType.Small);
        }

        for (int i = 0; i < 10; i++) {
            Cloud cloud = factory.getCloud(CloudType.Medium);
        }

        for (int i = 0; i < 10; i++) {
            Cloud cloud = factory.getCloud(CloudType.Large);
        }

        System.out.println(factory.countCloudsMap());
    }
}
