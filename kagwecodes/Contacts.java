package kagwecodes;


import java.util.HashMap;
import java.util.Map;

public class Contacts {
    double contacts;
        Map<String, Integer> contacts1 = new HashMap<String, Integer>();



        public Contacts() {

    }
    public Object ContactList(){
            return contacts1.entrySet();
    }


    public Contacts(double contacts) {
        this.contacts = contacts;
    }

    public double getContacts() {
        return contacts;
    }

    public void setContacts(double contacts) {
        this.contacts = contacts;
    }
}
