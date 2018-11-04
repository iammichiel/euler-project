package problems

object Problem006 {
    def run() = {
        val sum = (1 to 100).map(current => current * current).foldLeft(0)(_ + _);
        val squares = Math.pow((1 to 100).foldLeft(0)(_ + _), 2);

        val result = (squares - sum).toLong;


        println(s"Problem 006 : ${result}");
    }

}