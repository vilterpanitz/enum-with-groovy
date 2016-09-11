package com.panitz.techblog

/**
 * Created by vilterpanitz on 10/09/16.
 */
public enum WithoutConstructorEnum {
    SPADE(id: 's', name:'Spade', color:'Black'),
    HEART(id: 'h', name:'Heart', color:'Red'),
    CLUB(id:'c', name:'Club', color:'Black'),
    DIAMOND(id:'d', name:'Diamond', color:'Red')

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

    static getCardEnum(id) {
        map[id]
    }

}
