package com.ikhiloyaimokhai.nigeriastatesandlgas;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Nigeria {

    public static List<String> getStates() {
        return Util.states();
    }

    public static List<String> getCapitals() {
        return Util.capitals();
    }

    public static Map<String,String> getStatesAndCapital(){
        return  Util.statesAndCapital();
    }

    public static String getCapital(String state){
        return Util.capital(state);
    }

    public static Set<String> getLgasByState(String state){
        return Util.lgasByState(state);
    }

}
