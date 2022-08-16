package main;

import java.util.HashMap;

//se imparte el patron de diseño flyweight a partir de un hashmap
public class CloudFactory {

    private HashMap<CloudType, Cloud> cloudsMap;

    public CloudFactory(){
        this.cloudsMap = new HashMap<CloudType, Cloud>();
    }

    public Cloud getCloud(CloudType type){
        Cloud cloud = (Cloud)this.cloudsMap.get(type);

        //se generan unicamente objetos que no existan en el hashmap
        if(cloud == null){
            cloud = new Cloud(type, "image.jpg", 100, 100);
            this.cloudsMap.put(type, cloud);
        }
        return cloud;
    }

    public int countCloudsMap(){
        return this.cloudsMap.size();
    }
}
