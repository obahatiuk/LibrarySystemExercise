class Periodical: Resource, LibraryItem {

    var issueNbr: Int
    var ISSN: String

    constructor(name: String ="none", nbrPages: Int = 0, publicationDate: String = "none", publisher: String ="none", status: Int = 0,issueNbr: Int = 0, ISSN: String = "")
            : super(name, nbrPages, publicationDate, publisher, status) {

        this.issueNbr = issueNbr
        this.ISSN = ISSN
        println("Creating a Periodical")
    }

    fun editInfo(resourceName: String, numberOfPages: Int, dateOfResourcePublication: String, resourcePublisher: String, issueNbr: Int, ISSN: String ){

        super.getInfo()
        this.issueNbr = issueNbr
        this.ISSN = ISSN
        println("Editing a Periodical " + name)

    }

    override fun getInfo(){

        super.getInfo()
        println("Issue number: " + issueNbr)
        println("ISSN: " + ISSN)

    }

    override fun addItem(): Boolean {

        println("Adding Periodical " + name + " to system")
        return true
    }

    override fun removeItem(): Boolean {

        println("Removing Periodical " + name + " from system")
        return true
    }

    override fun signOut(): Boolean {

        println("Periodical " + name + " borrowed")
        status = BOOKED
        return true
    }

    override fun signIn(): Boolean {

        println("Periodical " + name + " available")
        status = AVAILABLE
        return true
    }

    override fun status(): Int {

        return status
    }
}