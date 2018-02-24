def fact(n: Int) = {
  @annotation.tailrec
  def loop(x: Int, acc: Int): Int =
    if (x <= 0)
      acc
    else
      loop(x - 1, x * acc)
  loop(n, 1)
}
