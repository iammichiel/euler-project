package problems

object Problem002 {
    def run() = {
        val result = calculate(1, 1, 0);

        println(s"Problem 002 : ${result}")
    }

    def calculate(previous: Int, current: Int, sum: Int): Int = {
        if (current > 4000000) sum
        else {
            if (current % 2 == 0) calculate(current, previous + current, sum + current)
            else calculate(current, previous + current, sum)
        }
    }
}