package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = sadArray.toMutableList()
        val a = sadArray.size - 2
        for (i in a downTo 1) {
            if (happyArray[i - 1] + happyArray[i + 1] < happyArray[i]) {
                happyArray.removeAt(i)
            }
        }
        return happyArray.toIntArray()
    }
}
