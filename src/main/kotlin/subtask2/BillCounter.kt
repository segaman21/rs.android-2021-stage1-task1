package subtask2

class BillCounter {

    // TODO: Complete the following function

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val a = bill.size - 1
        var sum = 0
        for (i in 0..a) {
            sum += bill[i]
        }
        val newSum = (sum - bill[k])/2
        if (newSum == b) {
            return "bon appetit"
        } else {
            val raznica = b - newSum
            return raznica.toString()
        }
    }
}
