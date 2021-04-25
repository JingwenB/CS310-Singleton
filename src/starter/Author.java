package starter;

public class Author {
    // 每一个arthor 有一个自己专属的document=> to change into shared document=> singleton
    Document doc = Document.getInstance();

    public void write(String contents){
        doc.addSentence(contents);
    }

    public void readAloud(){
        System.out.println("Ahem .... ");
        doc.readAloud();
        System.out.println(".....The End");
    }
}
