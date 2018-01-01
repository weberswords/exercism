
object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    var resultSet = Set[Int]()
    val result = factors.foreach {
      e => for (i <- 1 until limit if i % e == 0) {
        resultSet += i
      }
    }
    resultSet.sum
  }
}


