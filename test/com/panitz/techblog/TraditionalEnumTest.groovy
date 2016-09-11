package com.panitz.techblog

/**
 * Created by vilterpanitz on 10/09/16.
 */
class TraditionalEnumTest extends GroovyTestCase {

    void testTraditionalEnum() {
        def spadeSuit = TraditionalEnum.getCardEnum('s')
        assert spadeSuit == TraditionalEnum.SPADE // Checks if is the Enum Object
        assert spadeSuit.id == 's' // Checks its id
        assert spadeSuit.name == 'Spade' // Checks its name
        assert spadeSuit.color == 'Black' // Checks its color

        def heartSuit = TraditionalEnum.getCardEnum('h')
        assert heartSuit == TraditionalEnum.HEART // Checks if is the Enum Object
        assert heartSuit.id == 'h' // Checks its id
        assert heartSuit.name == 'Heart' // Checks its name
        assert heartSuit.color == 'Red' // Checks its color
    }
}
