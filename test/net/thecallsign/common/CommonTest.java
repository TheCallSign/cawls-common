/*
 * Copyright 2015 St John.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.thecallsign.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static net.thecallsign.common.Common.convertIntegers;
import static net.thecallsign.common.Common.getStringRepresentation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author St John
 */
public class CommonTest {
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    private ArrayList<Integer> intList;
    private int[] intExpected;
    private StringBuilder charExpected;
    private ArrayList<Character> charList;
    
    public CommonTest() {
    }
    
    @Before
    public void setUp() {
        intList = new ArrayList();
        intExpected = new int[100];
        for (int i = 0; i < 100; i++) {
            intExpected[i] = i;
            intList.add(i);
        }
        charList = new ArrayList();
        charExpected = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            charExpected.append((char) i);
            charList.add((char)i);
        }
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void convertIntegersTest() {
        System.out.println("* CommonTest: convertIntegers()");
        Assert.assertArrayEquals(new int[] {1,2,3,4,5}, convertIntegers(Arrays.asList(1,2,3,4,5)));
        Assert.assertArrayEquals(new int[] {5,4,3,2,1}, convertIntegers(Arrays.asList(5,4,3,2,1)));
        Assert.assertArrayEquals(intExpected, convertIntegers(intList));
        
    }
    
    @Test
    public void getStringRepresentationTest() {
        System.out.println("* CommonTest: getStringRepresentation()");
        assertEquals("abcde", getStringRepresentation(Arrays.asList('a','b','c','d','e')));
        assertEquals(charExpected.toString(), getStringRepresentation(charList));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
