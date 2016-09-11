package com.panitz.techblog

/**
 * Created by vilterpanitz on 10/09/16.
 */
class MapEnumTest extends GroovyTestCase {

    void testSpade() {
        def spadeSuit = MapEnum.getCardEnum('s')
        assert spadeSuit == MapEnum.SPADE // Checks if is the Enum Object
        assert spadeSuit.id == 's' // Checks its id
        assert spadeSuit.name == 'Spade' // Checks its name
        assert spadeSuit.color == 'Black' // Checks its color
    }
    void testHeart() {
        def heartSuit = MapEnum.getCardEnum('h')
        assert heartSuit == MapEnum.HEART // Checks if is the Enum Object
        assert heartSuit.id == 'h' // Checks its id
        assert heartSuit.name == 'Heart' // Checks its name
        assert heartSuit.color == 'Red' // Checks its color
    }

}
