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
public class TestSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("::::SOLUTIONS::::");
//declaring and initiating object reference
        Solution solution = new Solution();
        //Test: Character in Strings
        String cstr = solution.find_chars1("inyene", "eneye");
        System.out.println("*Test1: Character in Strings*");
        System.out.println(cstr);
        System.out.println(solution.find_chars2("inyene", "eneye"));
        System.out.println(solution.find_chars3("inyene", "eneye"));
        //Test: Array Compaction
        System.out.println("**Test2: Array Compaction**");
        int arrc[] = {1, 3, 7, 7, 8, 9, 9, 9, 10,10,11,11,15,15};
        solution.compact_array(arrc);

        //Test: Rotating an Array
        System.out.println("***Test3: Rotating an Array***");
        int rotarr[] = {1, 2, 3, 4, 5, 6};
        int r[] = solution.rotate_array(rotarr);
        int len = r.length;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                System.out.print("[" + r[i] + ", ");
            }
            if (i > 0 && i < len - 1) {
                System.out.print(r[i] + ", ");
            }
            if (i == len - 1) {
                System.out.println(r[i] + "]");
            }
        }
        //Test: Least Common Multiple
        System.out.println("****Test4: Least Common Multiple****");
        int arrlcm[] = {99,34,77,5};
        System.out.println(solution.LCM(arrlcm));
        
    }

}