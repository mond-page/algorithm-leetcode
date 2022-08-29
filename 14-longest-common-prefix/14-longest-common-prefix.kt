class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var longestPrefix = ""
        val minLengthValue = minLengthStr(strs)
        if (minLengthValue < 0) {
            return longestPrefix
        }

        for (idx in 0..minLengthValue) {
            val set: HashSet<String> = HashSet()
            for (str in strs) {
                set.add(str[idx].toString())
            }
            
            if (set.size != 1) {
                break
            } else {
                longestPrefix = longestPrefix.plus(set.first())
            }
        }
        return longestPrefix
    }

    private fun minLengthStr(strs: Array<String>): Int {
        var minValue: Int = 201
        for (str in strs) {
            minValue = minValue.coerceAtMost(str.length)
        }

        return minValue -1
    }
}