package main;
 import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;
 public class Kata4 {
    
    public static void main(String[] args) {
        String fileName = "email.txt";
        try {
            List<Mail> mailList = MailListReader.read(fileName);
            Histogram<String> histogram = MailHistogramBuilder.build(mailList);
            HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
            histoDisplay.execute();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error de entrada salida");
        }
    }
}