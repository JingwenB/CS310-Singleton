package starter;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Document {
    // add static var, similar to factory but refers to a field

    private static Document documentInstance= null; // x需要initiate instance

    private List<String> sentences = new ArrayList<>();

    // getInstance 是唯一可以access Document 的method=> Document constructor 不需要被其他class access=> make it private
    public static Document getInstance(){
        if(documentInstance == null){
            documentInstance = new Document();
        }
        return documentInstance;
    }

    // change constructor to private
    private Document(){
        System.out.println("Creating document...");
    }


    public void addSentence(String sentence){
        sentences.add(sentence);
    }

    public void readAloud(){
        for(String sentence : sentences){
            System.out.println(sentence);
        }
    }


}
