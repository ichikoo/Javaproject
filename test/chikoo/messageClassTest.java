/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chikoo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;
/**
 *
 * @author ishmaelChikoo
 */
public class messageClassTest {
    
    // instantiate the class 
    messageClass message = new messageClass();
    public messageClassTest() {
    }

    @Test
    public void testSomeMethod() 
    {
        // expected correct message when the method is called 
        String expected = "Hello";
        //the actual calling of the method
        String actual = message.getMessage();
        //check for me if the method is returning the correct message
        assertEquals(expected, actual);
    }
    
}
