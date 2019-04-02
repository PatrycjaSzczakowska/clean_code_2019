package pl.zzpj2019.solid.isp.contactbook.solution;

class Emailer {

    public void sendMessage(Emailable emailable, String subject, String body) {
        String emailAddress = emailable.getEmailAddress();
        sendEmail(emailAddress, subject, body);
    }


    private void sendEmail(String emailAddress, String subject, String body) {
        StringBuilder mail = new StringBuilder();
        mail.append(subject + "\n");
        mail.append(emailAddress + "\n");
        mail.append(body + "\n");
        System.out.println(mail.toString());
    }
}