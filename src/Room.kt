class Room : LibraryItem {

    companion object {

        const val BOOKED = 1
        const val AVAILABLE = 0
    }

    var number: Int
    var size: Int
    var status: Int

    constructor( number: Int = 0, size: Int = 0, status: Int = 0) {

        this.number = number
        this.size = size
        this.status = status
        println("Creating a Room")
    }

    fun editInfo(number: Int, size: Int)
    {
        this.number = number
        this.size = size
        println("Editing a Room " + number)
    }

    fun getInfo()
    {
        println("Room number " + number)
        print(" is " + size + " square feet")
    }

    override fun addItem(): Boolean {

        print("Adding room " + number + " to system")
        return true
    }

    override fun removeItem(): Boolean {
        println("Removing room " + number)
        return true
    }

    override fun signOut(): Boolean {
        println("Room " + number + " booked")
        status = BOOKED
        return true
    }

    override fun signIn(): Boolean {
        println("Room " + number + " available")
        status = AVAILABLE
        return true
    }

    override fun status(): Int {
        return status
    }
}