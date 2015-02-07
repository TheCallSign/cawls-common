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

import java.util.NoSuchElementException;

/**
 * LinkedList based Stack data structure
 * @author St John Giddy
 * @param <T>
 */
public class StackLinkedList<T> implements Stack<T> {

    private int total;

    private Node first;


    public StackLinkedList() { }

    public StackLinkedList<T> push(T ele)
    {
        Node current = first;
        first = new Node();
        first.ele = ele;
        first.next = current;
        total++;
        return this;
    } 

    @Override
    public T pop() throws NoSuchElementException
    {
        if (first == null) throw new java.util.NoSuchElementException();
        T ele = first.ele;
        first = first.next;
        total--;
        return ele;
    }
    
    @Override
    public T peek(){
        if (first == null) return null;
        T ele = first.ele;
        return ele;
    }
    
    @Override
    public int size(){
        return total;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.ele).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

    private class Node {

        private T ele;
        private Node next;
    }

}