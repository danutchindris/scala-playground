def sum(f: Int => Int, a: Int, b: Int): Int = {
  @annotation.tailrec
  def loop(a: Int, acc: Int): Int = {
    if (a > b)
      acc
    else
      loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}
