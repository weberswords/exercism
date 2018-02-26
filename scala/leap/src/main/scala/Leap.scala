object Leap {
  def leapYear(year: Int): Boolean = {
    val yearDividedBy4 = year % 4
    val yearDividedBy100 = year % 100
    val yearDividedBy400 = year % 400

    if (yearDividedBy4 == 0 && yearDividedBy100 != 0) {
      true
    } else if (yearDividedBy4 != 0 || yearDividedBy400 != 0)  {
      false
    } else {
      true
    }
  }
}
