import java.util.ArrayList;

public class Mobile {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    Mobile(String myNumber)
    {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact  )
    {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name)
    {

    }
}
class Contact
{
    private String name;
    private String phoneNum;

    Contact(String name , String phoneNum)
    {
        this.name=name;
        this.phoneNum=phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public static Contact createContact(String name , String phoneNum)
    {
        return new Contact(name , phoneNum);
    }
}