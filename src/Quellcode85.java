class Quellcode85 extends Aufgabe72{

    String subject1, subject2;

    Quellcode85(String name, int number, int year, String s1, String s2){
        super(name, number, year);
        subject1 = s1;
        subject2 = s2;
    }

    void setStudiesSubject(String s1, String s2){
        subject1 = s1;
        subject2 = s2;
    }

    String getSubject1(){
        return subject1;
    }

    String getSubject2(){
        return subject2;
    }
}