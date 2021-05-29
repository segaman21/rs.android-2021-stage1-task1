package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val res = arrayListOf<String>()
        var newSeparator: Char?

        for ((index, letter) in inputString.withIndex()) {
            if (separators.contains(letter)) {
                var counter = 0
                newSeparator = separators[letter]

                for (subIndex in index..inputString.lastIndex) {

                    if (inputString[subIndex] == letter) {
                        counter++
                    }
                    if (inputString[subIndex] == newSeparator) {
                        counter--
                        if (counter == 0) {
                            res.add(inputString.substring(index + 1 until subIndex))
                            break
                        }
                    }

                }
            }
        }
        return res.toTypedArray()
    }

    companion object {
        private val separators = mapOf<Char, Char>('<' to '>', '[' to ']', '(' to ')')
    }
}
