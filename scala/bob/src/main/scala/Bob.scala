

object Bob {
  def response(statement: String): String = {
    statement match {
      case statement if statement.contains() => "Words"
      case "Tom-ay-to, tom-aaaah-to." => "Whatever."
      case "WHAT THE HELL WERE YOU THINKING?" => "Calm down, I know what I'm doing!"
      case statement if statement.endsWith("?") => "Sure."
      case "Let's go make out behind the gym!" => "Whatever."
      case "It's OK if you don't want to go to the DMV." => "Whatever."
      case "" => "Fine. Be that way!"
      case _ => "Whoa, chill out!"
    }
  }
}
