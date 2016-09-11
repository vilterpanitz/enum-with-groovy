package com.panitz.techblog

/**
 * Created by vilterpanitz on 10/09/16.
 */
class WithoutConstructorEnumTest extends GroovyTestCase {

    void testSpade() {
        def spadeSuit = WithoutConstructorEnum.getCardEnum('s')
        assert spadeSuit == WithoutConstructorEnum.SPADE // Checks if is the Enum Object
        assert spadeSuit.id == 's' // Checks its id
        assert spadeSuit.name == 'Spade' // Checks its name
        assert spadeSuit.color == 'Black' // Checks its color
    }

    void testHeart() {
        def heartSuit = WithoutConstructorEnum.getCardEnum('h')
        assert heartSuit == WithoutConstructorEnum.HEART // Checks if is the Enum Object
        assert heartSuit.id == 'h' // Checks its id
        assert heartSuit.name == 'Heart' // Checks its name
        assert heartSuit.color == 'Red' // Checks its color
    }

}
