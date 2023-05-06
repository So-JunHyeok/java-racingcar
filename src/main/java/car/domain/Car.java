package car.domain;

public class Car {

    private int position = 0;
    private String name;

    private Car(){}
    public Car(String name){
        carNameCheck(name);
        this.name = name;
    }

    public void move(Movable movable){
        if(movable.moveStrategy() > 3) {
            position += 1;
        }
    }
    public int getPosition(){
        return this.position;
    }

    public String getName(){
        return this.name;
    }

    private String carNameCheck(String name){
        if(name.length() > 5){
            throw new RuntimeException();
        }
        return name;
    }
}
