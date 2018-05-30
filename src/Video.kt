class Video: Resource, LibraryItem {

    var length: Double
    var ISBN: String

    constructor(name: String ="none", nbrPages: Int = 0, publicationDate: String = "none", publisher: String ="none", status: Int = 0,length: Double = 0.0, ISBN: String = "")
            : super(name, nbrPages, publicationDate, publisher, status) {

        this.length = length
        this.ISBN = ISBN
        println("Creating a Video")
    }

    fun editInfo(resourceName: String, numberOfPages: Int, dateOfResourcePublication: String, resourcePublisher: String, length: Double, ISBN: String ){

        super.getInfo()
        this.length = length
        this.ISBN = ISBN
        println("Editing a Video " + name)

    }

    override fun getInfo(){

        super.getInfo()
        println("Issue number: " + length)
        println("ISSN: " + ISBN)

    }

    override fun addItem(): Boolean {

        println("Adding Video " + name + " to system")
        return true
    }

    override fun removeItem(): Boolean {

        println("Removing Video " + name + " from system")
        return true
    }

    override fun signOut(): Boolean {

        println("Video " + name + " borrowed")
        status = BOOKED
        return true
    }

    override fun signIn(): Boolean {

        println("Video " + name + " available")
        status = AVAILABLE
        return true
    }

    override fun status(): Int {

        return status
    }
}