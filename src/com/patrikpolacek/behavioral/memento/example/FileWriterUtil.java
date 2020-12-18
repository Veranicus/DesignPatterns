package com.patrikpolacek.behavioral.memento.example;

public class FileWriterUtil {

    private String fileName;

    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str){
        content.append(str);
    }
//    Creates the memento
    public Memento save(){
        return new Memento(this.fileName,this.content);
    }
//    restore into its earlier state
    public void undoToLastSave(Object obj){
        Memento memento = (Memento)obj;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

   private class Memento{
        private String fileName;
        private StringBuilder content;

       public Memento(String fileName, StringBuilder content) {
           this.fileName = fileName;
//           notice the deep copy so that Memento and FileWriterUitl
//           content variables dont refer to same object
           this.content = new StringBuilder(content);
       }
   }
}
