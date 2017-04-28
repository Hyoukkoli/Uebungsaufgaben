class Quellcode83 extends Aufgabe72 {

    String studiesSubject;

    void setSubject(String subject){
        studiesSubject = subject;
    }
    String getStudiesSubject(){
        return studiesSubject;
    }

    Quellcode83(String name, int number, int year, String subject){
        super(name, number, year);
        studiesSubject = subject;
    }
}