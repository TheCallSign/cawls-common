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
 * Array based Stack data structure
 * @author St John Giddy
 * @param <T>
 */
public class StackArray<T> implements Stack<T> {

    private T[] arr;

    private int total;

    public StackArray()
    {
        arr = (T[]) new Object[2];
    }

    private void resize(int capacity)
    {
        T[] tmp = (T[]) new Object[capacity];
        System.arraycopy(arr, 0, tmp, 0, total);
        arr = tmp;
    }

    @Override
    public StackArray<T> push(T ele)
    {
        if (arr.length == total) resize(arr.length * 2);
        arr[total++] = ele;
        return this;
    } 

    /**
     * @exception  java.util.NoSuchElementException() If the stack size is 0
     * @return 
     */
    @Override
    public T pop()
    {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = arr[--total];
        arr[total] = null;
        if (total > 0 && total == arr.length / 4) resize(arr.length / 2);
        return ele;
    }

    @Override
    public T peek() {
        if (total == 0) return null;
        T ele = arr[total];
        return ele;
    }
    
    @Override
    public int size(){
        return total;
    }
    
    @Override
    public String toString()
    {
        return java.util.Arrays.toString(arr);
    }

    

}