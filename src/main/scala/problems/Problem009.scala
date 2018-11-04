package problems

object Problem009 {
    def run() = {
        val result = calculate(1, 0, 0);

        println(s"Problem 009 : ${result}");
    }

    def calculate(a:Int, b:Int, c:Int): Int = {
        if (a + b + c == 1000 && a*a + b*b == c*c) {
            a * b * c
        }
        else if (c == 1000) calculate(a, b + 1, 1)
        else if (b == 1000) calculate(a + 1, 1, c)
        else if (a == 1000) 0
        else {


            calculate(a, b, c + 1)
        }
    }
}