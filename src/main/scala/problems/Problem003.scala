package problems

import scala.math.BigInt;

/**

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */
object Problem003 {
    private var primes = List(1L);

    def run() = {
        val MAX_VALUE = 600851475143L;
        val TEST_VALUE = 13195;

        val result = getFactors(MAX_VALUE).max;

        println(s"Problem 003 : ${result}");


    }

    def getFactors(value: Long) = {
        (1L to Math.sqrt(value).toLong).filter(current => value % current == 0 && isPrime(current))
    }

    def isPrime(value: Long):Boolean = {
        val isPrime = !primes.exists(current => current != 1 && value % current == 0);
        if (isPrime) {
            primes = value :: primes;

            true
        } else {
            false
        }
    }
}