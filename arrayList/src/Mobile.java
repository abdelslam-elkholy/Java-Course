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
        for(int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName().equals(name))
            {
                return i;
            }

        }
        return -1;
    }

    public boolean addNewContact(Contact contact)
    {
        int index = findContact(contact);
        if(index < 0 )
        {
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact)
    {
       if (findContact(contact) < 0)
       {
           return  false;
       }

       myContacts.remove(contact);
       return true;
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