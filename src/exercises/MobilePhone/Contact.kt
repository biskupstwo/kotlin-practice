package exercises.MobilePhone

class Contact(
    private var name: String,
    private var phoneNumber: String
) {
    companion object{ // static method
        fun createContact(name: String, phoneNumber: String): Contact {
            return Contact(name, phoneNumber)
        }
    }
    fun getName() = name
    fun getPhoneNumber() = phoneNumber

}
