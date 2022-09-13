class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        
        val stringX = x.toString()
        for (idx in 0 until stringX.length / 2) {
            if (stringX[idx] != stringX[stringX.length - 1 - idx]) {
                return false
            }
        }
        return true
    }
}