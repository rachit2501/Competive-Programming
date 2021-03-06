// Duplicate subtree in Binary Tree
// Given a Binary Tree, the task is to complete the function dupSub which takes the root of the tree as the only argument and returns true if the Binary tree contains a duplicate sub-tree of size two or more.

// Input :  Binary Tree
//                A
//              /    \
//            B        C
//          /   \       \
//         D     E       B
//                      /  \
//                     D    E
// Output : Yes

// Note: Two same leaf nodes are not considered as subtree as size of a leaf node is one.

// Input:
// The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains a string s representing the binary tree.
// For example the string : (a(b()())(c()()) represents the below binary tree
//        a
//     /     \
//   b       c

// Output:
// For each test case output will be 1 if the binary tree contains duplicate sub-tree of size two or more else 0.

// Constraints:
// 1<=T<=50
// 1<=length of string<=100

// Example(To be used only for expected output) :
// Input:
// 2
// (a(b(d()())(e()()))(c()(b(d()())(e()()))))
// (a(b()())(c()()))

// Output:
// 1
// 0

import java.util.ArrayList;
import java.util.List;

public class DuplicateSubtree {

  boolean dupSub(Node root) {
    List<Node> list = new ArrayList<Node>();
    // TODO
  }
}
