class Solution {
    var isNotBeginCloseBracket: Boolean = true
    val stack: Stack<Char> = Stack()

    fun isValid(s: String): Boolean {
        for (idx in s.indices) {
            when (s[idx]) {
                '(', '{', '[' -> stack.push(s[idx])
                ')', '}', ']' -> closeBracket(s[idx])
            }
        }
        return isNotBeginCloseBracket && stack.size == 0
    }

    private fun closeBracket(c: Char) {
        when (c) {
            ')' -> validOpenBracket('(')
            '}' -> validOpenBracket('{')
            ']' -> validOpenBracket('[')
        }
    }

    private fun validOpenBracket(c: Char) {
        if (stack.size == 0) {
            isNotBeginCloseBracket = false
            return
        }
        
        if (stack.pop() != c) {
            isNotBeginCloseBracket = false
        }
    }
}