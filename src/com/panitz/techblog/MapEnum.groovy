package com.panitz.techblog

/**
 * Created by vilterpanitz on 10/09/16.
 */
public enum MapEnum {
    SPADE('s','Spade', 'Black'),
    HEART('h','Heart', 'Red'),
    CLUB('c','Club', 'Black'),
    DIAMOND('d','Diamond', 'Red')

    final String id;
    final String name;
    final String color;
    static final Map map

    static {
        map = [:] as TreeMap
        values().each { suit ->
            map.put(suit.id, suit)
        }
    }

    private MapEnum(String id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    static getCardEnum(id) {
        map[id]
    }
}
