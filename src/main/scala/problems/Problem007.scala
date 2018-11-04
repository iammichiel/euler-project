package problems

object Problem007 {
    private var primes = List(1);

    def run() = {
        // val r = (1 to 6).filter(isPrime(_));

        val result = findPrimes(2, 0);
        println(s"Problem 007 : ${result}");
    }

    def findPrimes(current: Int, nbPrimes: Int):Int = {
        if (nbPrimes == 10001) current - 1
        else {
            if (isPrime(current)) {
                findPrimes(current + 1, nbPrimes + 1)
            } else findPrimes(current + 1, nbPrimes)
        }
    }

    def isPrime(value: Int):Boolean = {
        val isPrime = !primes.exists(current => current != 1 && value % current == 0);
        if (isPrime) {
            primes = value :: primes;

            true
        } else {
            false
        }
    }
}