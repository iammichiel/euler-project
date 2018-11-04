package problems

object Problem004 {
    def run() = {
        val result = (100 to 999).map(i => {
            (100 to 999).map(y => i * y)
        }).flatten.filter(isPalindrome(_)).max;

        println(s"Problem 004 : ${result}");
    }

    def isPalindrome(value: Int):Boolean = {
        return value.toString.reverse == value.toString;
    }
}