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
        int index = findContact(contact.getName());
        if(index < 0 )
        {
            myContacts.add(contact);
            return true;

        }
        return false;

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

    public boolean updateContact(Contact old , Contact newCo)
    {
        int index = findContact(old);
        if(index < 0)
        {
            return false;
        }

        myContacts.set(index , newCo);
        return true;
    }

    public void printContacts()
    {
        System.out.println("ContactList: ");
        int size = myContacts.size();
        for (int i=0;i < size; i++)
        {
            Contact contact = myContacts.get(i);
            System.out.println((i+1)+"-\s\s"+contact.getName() + "\s -> " + contact.getPhoneNum() );
        }
    }

    public Contact querycontact(String name)
    {
        int index = findContact(name);
        if(index < 0 )
        {
            return null;
        }

        return myContacts.get(index);
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