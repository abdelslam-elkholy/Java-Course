public class Main {



    public static void main(String[] args) {
        Mobile mobile= new Mobile("Abdelsalam");
        Contact contact = new Contact("Mahmoud" , "01020597823");
        mobile.printContacts();

        mobile.addNewContact(Contact.createContact("Ahmed" , "01020597823"));
//        System.out.println(mobile.addNewContact(Contact.createContact("Ahmed" , "01020597823")));
        mobile.printContacts();


        mobile.addNewContact(Contact.createContact("Ahmed" , "01020597823"));
        mobile.printContacts();

        mobile.addNewContact(Contact.createContact("Mohammed" , "01020597823"));
        mobile.printContacts();

        mobile.addNewContact(Contact.createContact("Abdelrahman" , "01020597823"));
        mobile.printContacts();

        mobile.addNewContact(contact);
        mobile.printContacts();

        mobile.updateContact(contact , Contact.createContact("Updated" , "01020597823") );
        mobile.printContacts();


        mobile.removeContact(mobile.querycontact("Abdelrahman"));
        mobile.printContacts();





    }
}
