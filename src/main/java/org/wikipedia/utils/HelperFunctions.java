package org.wikipedia.utils;

import java.time.Duration;

public class HelperFunctions {
    public static String getDuration(long millis){
        Duration duration = Duration.ofMillis(millis);
        long SS = duration.toSecondsPart();
        return SS + " Seconds";

    }
}
