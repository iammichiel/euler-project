package problems

object Problem005 {
    def run() = {
        val result = tryNumber(1);

        println(s"Problem 005 : ${result}");
    }


    def tryNumber(current: Int):Int = {
        if ((1 to 20).exists(dividor => current % dividor != 0)) tryNumber(current + 1)
        else current
    }
}