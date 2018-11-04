package problems

object Problem010 {
    def run() = {
        val result = findPrimes(2, 2L);
        println(s"Problem 010 : ${result}");
    }

    def findPrimes(value: Int, sum: Long):Long = {
        if (value > 2000000) sum
        else {
            if (isPrime(value)) findPrimes(value + 1, sum + value)
            else findPrimes(value + 1, sum)
        }
    }

    def isPrime(value: Long):Boolean = {
        if (value == 1) false
        else {
            if (value.toString.length > 1 && Seq(0, 2, 4, 5, 6, 8).contains(value.toString.takeRight(1))) {
                false
            } else {
                val sqrt = 1 + Math.sqrt(value).toInt;

                !(2 to sqrt).exists(current => value % current == 0)
            }
        }
    }
}