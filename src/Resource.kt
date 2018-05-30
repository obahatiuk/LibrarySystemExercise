abstract class Resource {

    companion object {

        const val BOOKED = 1
        const val AVAILABLE = 0
    }

    var name: String
    var nbrPages: Int
    var publicationDate: String
    var publisher: String
    var status: Int

    constructor( name: String ="none", nbrPages: Int = 0, publicationDate: String = "none", publisher: String ="none", status: Int = 0) {

        this.name = name
        this.nbrPages = nbrPages
        this.publicationDate = publicationDate
        this.publisher = publisher
        this.status = status

    }

    open fun editInfo(resourceName: String, numberOfPages: Int,  dateOfResourcePublication: String, resourcePublisher: String){

        this.name = resourceName
        this.nbrPages = numberOfPages
        this.publicationDate = dateOfResourcePublication
        this.publisher = resourcePublisher

    }
    open fun getInfo(){

        println("Name of the resource " + name)
        println("Number of pages " + nbrPages)
        println("Publication date" + publicationDate)
        println("Publisher " + publisher)
        println("Status " + status)

    }

}