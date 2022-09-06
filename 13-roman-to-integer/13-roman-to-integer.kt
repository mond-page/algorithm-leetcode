class Solution {
    val ROMAN_NUMBER = hashMapOf(Pair("I", 1), Pair("V", 5), Pair("X", 10), Pair("L", 50),
            Pair("C", 100), Pair("D", 500), Pair("M", 1000))
    fun romanToInt(s: String): Int {
        var sum: Int = 0
        var before: Int = 0
        for (character in s.toCharArray()) {
            var now = ROMAN_NUMBER[character.toString()]!!
            sum += if (before < now) {
                now - before * 2
            } else {
                now
            }
            before = now
        }
        return sum
    }
}