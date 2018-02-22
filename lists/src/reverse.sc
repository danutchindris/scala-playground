/**
  * Given a list of Ints
  * return a list with all the elements of the first one in reversed order
  **/
def reverse(xs: List[Int]): List[Int] = {
  @annotation.tailrec
  def loop(l: List[Int], acc: List[Int]): List[Int] =
    if (l == Nil)
      acc
    else
      loop(l.tail, l.head :: acc)
  loop(xs, Nil)
}

reverse(List(1, 2, 3))
