/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsolution;

import java.util.Stack;

/**
 *
 * @author eneye380
 */
public class BinaryTreeDFS {

    public void DFS(Node root) {
        Stack<Node> stack = new Stack<Node>();
        stack.add(root);
        while (stack.isEmpty() == false) {
            Node x = stack.pop();
            if (x.right != null) {
                stack.add(x.right);
            }
            if (x.left != null) {
                stack.add(x.left);
            }
            System.out.print(" " + x.data);
        }
        System.out.println("");
    }
}
