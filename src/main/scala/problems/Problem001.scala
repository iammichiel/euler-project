package problems;

object Problem001 {
    def run() = {
        val result = (1 to 999).filter(current => current % 5 == 0 || current % 3 == 0).foldLeft(0)(_ + _);

        println(s"Problem 001 : ${result}")
    }
}