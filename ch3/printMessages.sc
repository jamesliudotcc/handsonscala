class Msg(val id: Int, val parent: Option[Int], val txt: String)

def printMessages(messages: Array[Msg]): Unit = {
    def findParent(parent: Int): Option[Int] = {
        for (message <- messages) {
            if (message.id == parent) {
                message.parent
            } else {
                None
            }
        }
    }

    def padChildren(parent: Option[Int]): String = {
        parent match {
            case Some(parent) => "    " + padChildren(findParent(parent))
            case None => ""
        }
    }

    for (message <- messages) { 
        println(padChildren(message.parent) + message.txt)
    }
}

printMessages(Array(
  new Msg(0, None, "Hello"),
  new Msg(1, Some(0), "World"),
  new Msg(2, None, "I am Cow"),
  new Msg(3, Some(2), "Hear me moo"),
  new Msg(4, Some(2), "Here I stand"),
  new Msg(5, Some(2), "I am Cow"),
  new Msg(6, Some(5), "Here me moo, moo")
))