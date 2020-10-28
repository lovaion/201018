package org.example;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MyMathTest {


    private static Math math;

    // prima di fare le prove viene eseguito il codice
    @BeforeClass
    public static void prepare(){
        math = new Math();
    }
    @Test
    public void numeriPrimiWorks(){
        // controlliamo che con input 1 la lista sia vuota
        assertEquals(new ArrayList<Integer>(),math.numeriPrimi(1));
        // se metto 2, mi deve tornare 2
        assertEquals(Arrays.asList(2),math.numeriPrimi(2));
        // controllo che con input i numeri primi da 2 a 20 ci siano tutti
        assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), math.numeriPrimi(19));
        //controllo che funzioni il not equsls
        assertNotEquals(Arrays.asList(1,2,3), math.numeriPrimi(3));
        // altro controllo
        assertNotEquals(Arrays.asList(), math.numeriPrimi(9));

    }



}
