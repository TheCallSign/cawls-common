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

/**
 * A LILO (Last In Last Out) data structure, used for recursion or storing 
 * a set of elements where order is vital.
 * 
 * @author St John Giddy
 * @param <T> Element Type of element to store
 */
public interface Stack<T> {
    /**
     * Push an element to the stack
     * @param ele Element to push.
     * @return The stack instance
     */
    Stack<T> push(T ele);
    /**
     * Return the top element of the stack and remove it from the structure.
     * 
     * @return Top element of the stack
     */
    T pop();
    /**
     * Return the top element of the stack without 
     * removing it from the structure.
     * @return Top element of the stack
     */
    T peek();
    /**
     * Get the number of elements in the stack
     * @return N(element)
     */
    int size();
}
