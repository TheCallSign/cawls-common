/*
 * Copyright 2015 St John Giddy.
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
import java.util.Iterator;
import java.util.List;

/**
 * Common functions I use.
 * www.thecallsign.net
 * @author St John 'Cawl' Giddy
 * @version 0.2.1
 * 
 */
public class Common {

    /**
     * Convert a List of Integers to an int array
     *
     * @param integers Integer List
     * @return Array of ints
     * @since 0.1.0
     */
    public static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++) {
            ret[i] = iterator.next();
        }
        return ret;
    }

    /**
     * Get the factors of an integer
     *
     * @param val Integer to factorize
     * @return A list containing the factors
     * @since 0.1.0
     */
    public static List<Integer> factorize(int val) {
        List<Integer> numArray = new ArrayList<>();
        for (int i = 2; i < Math.ceil(Math.sqrt(val)); i++) {
            if (val % i == 0) {
                numArray.add(i);
                val /= i;
            }
        }
        numArray.add(val);
        return numArray;
    }

    /**
     * Get a direct string representation of a List
     * Taken from http://stackoverflow.com/a/6324852/4341594
     * 
     * @param list
     * @return String representation
     * @since 0.2.0
     */
    public static String getStringRepresentation(List<Character> list) {
        StringBuilder builder = new StringBuilder(list.size());
        for (Character ch : list) {
            builder.append(ch);
        }
        return builder.toString();
    }

    /**
     * Count occurrences of a char in a string
     * Taken from http://stackoverflow.com/a/275969/4341594
     * @param haystack String to search
     * @param needle Char to count occurrences of.
     * @return Number of occurrences
     * @since 0.2.0
     */
    
    public static int countOccurrences(String haystack, char needle) {
        int count = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle) {
                count++;
            }
        }
        return count;
    }
}
