// noob implementation
def fib(n: Int): Int = {
  @annotation.tailrec
  def loop(x: Int, a: Int, b: Int): Int =
    if (n <= 1)
      0
    else if (n == 2)
      1
    else if (x >= n)
      a
    else
      loop(x + 1, b, a + b)
  loop(1, 0, 1)
}
