/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsolution;

/**
 *
 * @author eneye380
 */
public class Solution {

    public Solution() {

    }
    //Depth First Tree Traversal

    //Characters in Strings - Order N*N
    
//Characters in Strings - Order N*N
    public String find_chars1(String string1, String string2) {
        String result = "";

        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    result += string1.charAt(i);
                    break;
                }
            }
        }

        return result;
    }
    //Characters in Strings - Order N
    public String find_chars2(String string1, String string2) {
        //
        return "";
    }

    //Array Compaction
    public void compact_array(int[] input_array) {
        int len = input_array.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i < len - 1) {
                if (input_array[i] != input_array[i + 1]) {
                    count++;
                }
            }
            if (i == len - 1) {
                count++;
            }

        }
        int transformed_array[] = new int[count];
        count = 0;
        for (int i = 0; i < len; i++) {
            if (i < len - 1) {
                if (input_array[i] != input_array[i + 1]) {
                    transformed_array[count] = input_array[i];
                    count++;
                }
            }
            if (i == len - 1) {
                transformed_array[count] = input_array[i];
            }
        }
        len = transformed_array.length;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                System.out.print("[" + transformed_array[i] + ", ");
            }
            if (i > 0 && i < len - 1) {
                System.out.print(transformed_array[i] + ", ");
            }
            if (i == len - 1) {
                System.out.println(transformed_array[i] + "]");
            }
        }
    }

    //Rotating an Array
    public int[] rotate_array(int[] array) {
        int N = 2;
        int size = array.length;
        int output[] = new int[size];
        int index;
        for (int i = size - 1; i >= 0; i--) {
            index = (i + N) % size;
            output[index] = array[i];
        }
        return output;
    }

    //Least Common Multiple
    public int LCM(int[] array) {
        int min;
        int lcm = 1;
        int size = array.length;
        int temp_size;
        int temp_array[];
        for (int i = 0; i < size; i++) {
            array[i] = Math.abs(array[i]);
        }
        do {
            min = Integer.MAX_VALUE;
            int count = 0;
            if (size > 1) {
                for (int i = 0; i < size; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                if (min != 1) {
                    for (int i = 0; i < size; i++) {
                        if (array[i] % min == 0) {
                            array[i] = array[i] / min;
                        }
                    }
                } else if (min == 1) {
                    for (int i = 0; i < size; i++) {
                        if (array[i] == 1) {
                            count++;
                        }
                    }
                    temp_size = size;
                    size -= count;
                    temp_array = array;
                    array = new int[size];
                    int index = 0;
                    for (int i = 0; i < temp_size; i++) {
                        if (temp_array[i] != 1) {
                            array[index] = temp_array[i];
                            index++;
                        }
                    }
                }
                if (min != 0) {
                    lcm *= min;
                }
            } else if (size == 1) {
                if (array[0] != 0) {
                    lcm *= array[0];
                    size = 0;
                }
            }
        } while (size > 0);

        return lcm;
    }
    //AngularJS
}
