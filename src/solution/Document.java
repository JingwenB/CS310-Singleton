package solution;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private static Document theDocumentInstance = null;
    private List<String> sentences = new ArrayList<>();

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

    public static Document getInstance() {
        if (theDocumentInstance==null){
            theDocumentInstance = new Document();
        }
        return theDocumentInstance;
    }
}

// another solution, make document into parameter
