object Bob {
  def response(statement: String): String = {
    statement match {
      case "Tom-ay-to, tom-aaaah-to." => "Whatever."
      case statement if statement.endsWith("?") => "Sure."
      case _ => "Whoa, chill out!"
    }
  }
}
