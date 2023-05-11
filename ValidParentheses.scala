// Problem Link: https://leetcode.com/problems/valid-parentheses/


import scala.collection.mutable.Stack

object Solution {
  def isValid(s: String): Boolean = {
    var parenthesesStack = Stack[Char]()

    s.foreach(character => {
      if (parenthesesStack.size == 0) {
        parenthesesStack.push(character)
      } else if (parenthesesStack.top == '(' && character == ')') {
        parenthesesStack.pop()
      } else if (parenthesesStack.top == '[' && character == ']') {
        parenthesesStack.pop()
      } else if (parenthesesStack.top == '{' && character == '}') {
        parenthesesStack.pop()
      } else {
        parenthesesStack.push(character)
      }
    })

    if (parenthesesStack.size == 0) true else false
  }
}

// To test the implementation
// object TestRunner {
//   def main(args: Array[String]): Unit = {
//     println(Solution.isValid("()()()()"))
//     println(Solution.isValid("()[]{}"))
//     println(Solution.isValid("([{"))
//   }
// }
