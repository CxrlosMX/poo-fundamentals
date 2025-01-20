package com.rendon.singletons;

import com.rendon.models.MindStone;
import com.rendon.models.TimeStone;
import lombok.extern.java.Log;

@Log
public class TimeStoneSingleton {

    /*
    *
    * */
    private static volatile TimeStone timeStoneinstance;

    private TimeStoneSingleton() {}


    public static TimeStone getInstance() {
        if (timeStoneinstance == null) {
            log.info("Creating the singleton instance"+ TimeStone.class);
            synchronized (TimeStoneSingleton.class) {
                if (timeStoneinstance == null) {
                    timeStoneinstance = new TimeStone();
                }
            }
        }


        return timeStoneinstance;
    }


}
