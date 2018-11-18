package main;
 import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;
import view.MailListReaderBD;
 public class Kata5p2 {

    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    
    public Kata5p2(){
        mailList = new ArrayList<>();
    }

    public static void main(String[] args) throws IOException {
        Kata5p2 kata5p2 = new Kata5p2();
        kata5p2.execute();
    }

    public void execute() throws IOException {
        input();
        process();
        output();
    }

    public void input() throws IOException {
        mailList = MailListReaderBD.read(fileName);
    }

    public void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    public void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}