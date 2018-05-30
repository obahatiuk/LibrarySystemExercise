fun main(args : Array<String>) {

    var book: Book = Book()
    var equipment: Equipment = Equipment()
    var periodical: Periodical = Periodical()
    var room: Room = Room()
    var video: Video = Video()

    book.editInfo("none", 0, "none", "none", "none", "none")
    periodical.editInfo("none", 0, "none", "none", 0, "none")
    video.editInfo("none", 0, "none", "none", 0.0, "")
    room.editInfo(0, 0)
    equipment.editInfo("none", "none")

    book.getInfo()
    equipment.getInfo()
    periodical.getInfo()
    room.getInfo()
    video.getInfo()

    book.addItem()
    equipment.addItem()
    periodical.addItem()
    room.addItem()
    video.addItem()

    book.removeItem()
    equipment.removeItem()
    periodical.removeItem()
    room.removeItem()
    video.removeItem()

    book.signOut()
    equipment.signOut()
    periodical.signOut()
    room.signOut()
    video.signOut()

    book.signIn()
    equipment.signIn()
    periodical.signIn()
    room.signIn()
    video.signIn()

    println(book.status())
    println(equipment.status())
    println(periodical.status())
    println(room.status())
    println(video.status())

}