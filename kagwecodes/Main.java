package kagwecodes;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello User");
        System.out.println("please select an option\n");
        System.out.println(" 1.Contacts\n 2.Messages\n 3.Quit\n");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
            System.out.println("1.Show contacts\n 2. Add new Contact\n 3. Search for contact \n 4. Delete Contact \n 5. Go to Prev menu");
            Scanner sc = new Scanner(System.in);
            int contactChoice = sc.nextInt();

            switch (contactChoice) {
                case 1:
                    Contacts contact = new Contacts();
                    contact.contacts1.put("Jeff", 109229);
                    contact.contacts1.put("Andy", 1234);
                    System.out.println(contact.ContactList());
                    break;

                case 2:
                    Contacts cnt = new Contacts();

                    System.out.println("to add a contact please input their name and number below");
                    Scanner scanner1 = new Scanner(System.in);
                    String name= scanner1.next();
                    Integer number= scanner1.nextInt();
                    cnt.contacts1.put(name, number);
                    cnt.contacts1.put("Jeff", 109229);
                    cnt.contacts1.put("Andy", 1234);
                    System.out.println(cnt.ContactList());
                    break;
                case 3:
                    Contacts cont = new Contacts();
                    System.out.println("please input the contact you would like to search ");
                    Scanner scanner2 = new Scanner(System.in);
                    String contactName = scanner2.next();
                    cont.contacts1.put("Jeff", 109229);
                    cont.contacts1.put("Andy", 1234);
                    if (cont.contacts1.containsValue(contactName)){
                        System.out.println(cont.contacts1.get(contactName));
                    }else {
                        System.out.println("The contact does not exist");
                    }
                    break;
                case 4:
                    Contacts cont1 = new Contacts();
                    System.out.println("which contact would you like to delete?");
                    Scanner scanner3 = new Scanner(System.in);
                    String contToDelete = scanner3.next();
                    cont1.contacts1.put("Jeff", 109229);
                    cont1.contacts1.put("Andy", 1234);
                    cont1.contacts1.remove(contToDelete);
                    break;
                case 5:
                    break;
                }
        break;
            case 2:
                System.out.println("1. see list of messages. \n 2. Send a new message. ");
                int messageChoice;
                Scanner scan = new Scanner(System.in);
                messageChoice= scan.nextInt();
                switch (messageChoice){
                    case 1:
                        Messages message = new Messages();
                        message.message1.put("Jeff", "Hi");
                        message.message1.put("Andy","Hey beautiful");
                        System.out.println(message.message1.entrySet());
                        break;
                    case 2:
                        System.out.println("To send a Message insert the contact and message below");
                        Scanner scn = new Scanner(System.in);
                        String contact;
                        String messageToSend;
                        contact = scn.next();
                        messageToSend=scn.next();
                        Messages messg = new Messages();
                        messg.message1.put(contact, messageToSend);
                        System.out.println("message sent is " + messg.message1.entrySet());
                        break;
                }
                break;
        }
    }
}


