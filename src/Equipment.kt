class Equipment : LibraryItem {

    companion object {

        const val BOOKED = 1
        const val AVAILABLE = 0
    }

    var type: String
    var maintenanceDate: String
    var status: Int

    constructor( type: String ="none", maintenanceDate: String = "none", status: Int = 0) {

        this.type = type
        this.maintenanceDate = maintenanceDate
        this.status = status
        println("Creating an Equipment")
    }

    fun editInfo(type: String, maintenanceDate: String)
    {
        this.type = type
        this.maintenanceDate = maintenanceDate
        println("Editing an Equipment " + type)
    }

    fun getInfo()
    {
        println("Equipment type " + type)
        print(". Maintenance date is " + maintenanceDate)
    }

    override fun addItem(): Boolean {

        print("Adding equipment " + type + " to system")
        println(". Maintenance date is " + maintenanceDate)
        return true
    }

    override fun removeItem(): Boolean {
        println("Removing equipment " + type)
        return true
    }

    override fun signOut(): Boolean {
        println("Equipment " + type + " booked")
        status = BOOKED
        return true
    }

    override fun signIn(): Boolean {
        println("Equipment " + type + " available")
        status = AVAILABLE
        return true
    }

    override fun status(): Int {
        return status
    }
}