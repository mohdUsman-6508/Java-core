package CollectionsFramework.Map.EnumMap;

import java.util.EnumMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        EnumMap<Day, String> map = new EnumMap<>(Day.class);

        map.put(Day.MONDAY, "Gym");
        map.put(Day.THURSDAY, "Football");
        map.put(Day.SATURDAY, "Study");

        System.out.println(map);


    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
}

/*
Notes:
 array of size same as enum
 no hashing
 ordinal/index is used
 Faster than HashMap
 Memory Efficient
 */