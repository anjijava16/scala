// IDX | 1 2 3 4 5 6 7
//-----+----------------
// FIB | 1 1 2 3 5 8 13


object Fibonacci {
  def go(n: Int) = {
    def fib(idx: Int, fib_current: Int = 1, fib_previous: Int = 0) : Int = {
      if(idx == 1) return fib_current
      fib(idx - 1, fib_current + fib_previous, fib_current)
    }
    fib(n)
  }

  def main(args: Array[String]) {
    println(go(8))
  }
}