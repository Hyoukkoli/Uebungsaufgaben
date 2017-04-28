class Quellcode84 extends Quellcode83{

    String firstStudiesSubject;

    Quellcode84(String name, int number, int year, String subject, String firstSubject){
        super(name, number, year, subject);
        firstStudiesSubject = firstSubject;
    }

    void setFirstStudiesSubject(String subject){
        firstStudiesSubject = subject;
    }

    String getFirstStudiesSubject(){
        return firstStudiesSubject;
    }
}