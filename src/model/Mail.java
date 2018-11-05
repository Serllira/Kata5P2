package model;

 public class Mail {
    private final String mail;
    
    public String getDomain(){
        return mail.split("@")[1];
    }
    public Mail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }   
} 