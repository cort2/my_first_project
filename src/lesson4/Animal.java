package lesson4;

import javax.xml.namespace.NamespaceContext;

public class Animal {
    private String name;
    private int weight;

    Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    String getInfo(){
        return this.name + " " + this.weight;
    }
    String getName(){
        return "Big" + " " + this.name;
    }
    void setWeight(int newWeight){
        this.weight = newWeight;
    }
    int getWeight(){
        return this.weight;
    }
}

