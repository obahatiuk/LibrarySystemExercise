class Book: Resource, LibraryItem {

    var author: String
    var ISBN: String

    constructor(name: String ="none", nbrPages: Int = 0, publicationDate: String = "none", publisher: String ="none", status: Int = 0, author: String = "", ISBN: String="")
            : super(name, nbrPages, publicationDate, publisher, status) {

        this.author = author
        this.ISBN = ISBN
        println("Creating a Book")
    }

    fun editInfo(resourceName: String, numberOfPages: Int, dateOfResourcePublication: String, resourcePublisher: String, author: String, ISBN: String){

        super.getInfo()
        this.author = author
        this.ISBN = ISBN
        println("Editing a Book " + name)

    }

    override fun getInfo(){

        super.getInfo()
        println("Written by " + author)
        println("ISBN: " + ISBN)

    }

    override fun addItem(): Boolean {

        println("Adding book " + name + " to system")
        return true
    }

    override fun removeItem(): Boolean {

        println("Removing book " + name + " from system")
        return true
    }

    override fun signOut(): Boolean {

        println("Book " + name + " borrowed")
        status = BOOKED
        return true
    }

    override fun signIn(): Boolean {

        println("Book " + name + " available")
        status = AVAILABLE
        return true
    }

    override fun status(): Int {

        return status
    }
}