package by.gr00shik.facade;

import by.gr00shik.sputnic.FirstState;
import by.gr00shik.sputnic.LastState;
import by.gr00shik.sputnic.SecondState;

public class SputnicFacade {
    private FirstState state1 = new FirstState();
    private SecondState state2 = new SecondState();
    private LastState state3 = new LastState();

    public void run(){
        state1.burnOil();
        state2.enterAtmosphere();
        state3.dropOnEarth();
    }
}
