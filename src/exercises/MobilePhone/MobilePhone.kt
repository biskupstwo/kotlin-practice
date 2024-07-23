package exercises.MobilePhone

import java.util.*

class MobilePhone(
    var myNumber: String
){
    var myContacts: ArrayList<Contact> = arrayListOf<Contact>()

    fun addNewContact(contact: Contact): Boolean{
        val result: Boolean = !myContacts.contains(contact)
        if (result) myContacts.add(contact)
        return result
    }

    fun updateContact(oldContact: Contact, newContact: Contact): Boolean{
        val result: Boolean = myContacts.contains(oldContact)
        if (result){
            val index = myContacts.indexOf(oldContact)
            myContacts[index] = newContact
        }
        return result && myContacts.contains(newContact)
    }

    fun removeContact(contact: Contact): Boolean{
        val result: Boolean = myContacts.contains(contact)
        if (result){
            val index = myContacts.indexOf(contact)
            myContacts.removeAt(index)
        }
        return result && !myContacts.contains(contact)
    }

    fun findContact(contact: Contact): Int{
        return myContacts.indexOf(contact)
    }

    fun findContact(phoneNumber: String): Int {
        var index = 0
        for (i in myContacts.indices) {
            if (myContacts[i].getPhoneNumber() == phoneNumber) {
                index = i
                break
            } else {
                index = -1
            }
        }
        return index
    }

    fun queryContact(name: String): Int {
        var index = 0

        for (i in myContacts.indices) {
            if (myContacts[i].getName() == name) {
                index = i
                break
            } else {
                index = -1
            }
        }
        return index
    }

    fun printContacts() {
        println("Contact List:")
        for (i in myContacts.indices) println("${i+1}. ${myContacts[i].getName()} -> ${myContacts[i].getPhoneNumber()}")
    }
}

fun main(){
    val bobContact = Contact.createContact("Bob", "31415926")
    val aliceContact = Contact.createContact("Alice", "16180339")
    val tomContact = Contact.createContact("Tom", "11235813")
    val janeContact = Contact.createContact("Jane", "23571113")
    val newJaneContact = Contact.createContact("Jane", "23571114")
    val contactsList = ArrayList(Arrays.asList(bobContact, aliceContact, tomContact, janeContact))

    val myMobilePhone = MobilePhone("100100100")
    for (contact in contactsList) {
        myMobilePhone.addNewContact(contact!!)
    }
    myMobilePhone.printContacts()
    println(myMobilePhone.findContact(janeContact))
    println(myMobilePhone.findContact("23571113"))
    println(myMobilePhone.queryContact("Jane"))
    println(myMobilePhone.updateContact(janeContact, newJaneContact))
    println(myMobilePhone.findContact(janeContact))
    println(myMobilePhone.findContact("23571113"))
    println(myMobilePhone.queryContact("Jane"))
    myMobilePhone.printContacts()
    println(myMobilePhone.removeContact(newJaneContact))
    myMobilePhone.printContacts()
    println(myMobilePhone.addNewContact(janeContact))
    myMobilePhone.printContacts()
}