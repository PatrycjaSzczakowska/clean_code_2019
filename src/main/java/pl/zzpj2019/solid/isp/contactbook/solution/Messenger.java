package pl.zzpj2019.solid.isp.contactbook.solution;

public class Messenger {
    private static Emailer emailer;
    private static Dialer dialer;

    public Messenger() {
        emailer = new Emailer();
        dialer = new Dialer();
    }

    public static void main(String[] args) {
        Contact contact = new Contact("Jan Kowalski", "Kielce",
                "jan.kowalski@gmail.com", "83744-23434");
        contactPeople(contact);
    }

    public static void contactPeople(Contact contact) {
        if (contact.getEmailAddress() != null) {
            emailer.sendMessage(contact, "promocja", "tanio dzisiaj!");
        }

        if (contact.getTelephone() != null) {
            dialer.makeCall(contact);
        }
    }


}
