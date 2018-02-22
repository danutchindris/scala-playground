/**
  * Given a list of A and a function from A to B
  * return a list with all the elements of the first one transformed into B
  **/
def map[A, B](l: List[A], f: A => B): List[B] = {
  if (l == Nil)
    Nil
  else
    f(l.head) :: map(l.tail, f)
}

map(List(1, 2, 3), (x: Int) => x + "")
