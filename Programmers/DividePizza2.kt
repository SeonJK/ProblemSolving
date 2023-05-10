package Programmers

fun main() {
    pizzaSolution2(10)
}

fun pizzaSolution2(n: Int) = lcm(n, 6) / 6

fun lcm(a: Int, b: Int): Int = a*b / gcd(a, b)

tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a%b)
