package solution;

public class Author {
    Document doc = Document.getInstance();
//    Document doc = new Document();

    public void write(String contents){
        doc.addSentence(contents);
    }

    public void readAloud(){
        System.out.println("Ahem .... ");
        doc.readAloud();
        System.out.println(".....The End");
    }
}
