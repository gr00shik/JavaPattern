package by.gr00shik.context;

import by.gr00shik.pigs.MakeHouse;

public class TaleContext implements MakeHouse {
    private MakeHouse house;
    public void setTaleContext(MakeHouse house){
        this.house=house;
    }


    public void doHouse() {
        this.house.doHouse();
    }
}
