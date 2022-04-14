package com.company;

public class Main {

    public static void main(String[] args) {

//        Stwórz projekt o nazwie PhoneBook
//        Stwórz zmienne:
//        id – typ int, zainicjalizowany dowonlną wartością liczbową (wartość id równa 0 będzie traktowana jako domyślna – nieustawiona)
//        name – typ String, zainicjowana dowolnym imieniem
//        surname – typ String, zainicjowana dowolnym nazwiskiem
//        phoneNumber – typ String, zainicjowana dowolnym, 9-cyfrowym numerem telefonu
//        age – typ int, zainicjalizowaną wartością 20
//        contact – typ String, zainicjalizowaną pustym ciągiem znaków
//        isHidden – typ boolean, zainicjalizowaną wartością false

        Integer id = 22;
        String name = "Filip";
        String surname = "Wierzbicki";
        String phoneNumber = "123456789";
        Integer age = 20;
        String contact = "";
        boolean isHidden = false;
        Integer isMobile = 0;
        //id;name;surname;age;numer;isMobile
        contact = id + ";" + name + ";" +surname + ";" +age + ";" +phoneNumber;
//        System.out.println(contact);

        NumberType numberType = NumberType.MOBI;
//
//        #Zadanie 1
//        printContactCard(id, name, surname, age, phoneNumber);
//        printContact(id, name, surname, phoneNumber, age);
//        String dane = getContact(id, name, surname, phoneNumber, age);
//        System.out.println(dane);

////        #Zadanie 2
//
//        printContactCard(contact);
//        printContact(contact);
//        getContactRaw(id, name, surname, age, phoneNumber, isMobile);
//
////        #Zadanie 3
//
//        int lastDialed[] = new int[10];
//        int index = 1;
//        getContact(id, name, surname, phoneNumber, age);
//        getLastDialed(lastDialed);
//        getLastDialed(lastDialed, index);
//        dial(lastDialed, index);
//        removeLastDialed(lastDialed, index);
//
    }
//        Zadanie 1
//            Stwórz metody:
//        static void printContactCard(int id, String name, String surname, String phoneNumber, int age)
//        – wyświetlającą tekst zawierającą informację o kontakcie w formacie:
//        Id: id
//        Imię: name
//        Nazwisko: surname
//        Wiek: age
//        Numer telefonu: nubmer
//        void printContact(int id, String name, String surname, String phoneNumber, int age)
//        – wyświetlającą tekst zawierającą informację o kontakcie w formacie: id | name | surname | age | number
//        static String getContact(int id, String name, String surname, String phoneNumber)
//        – zwracającą tekst z informacją o kontakcie w formacie: id | name | surname | age | number

//    static void printContactCard(int id, String name, String surname, int age, String phoneNumber){
//        System.out.println("ID: " + id);
//        System.out.println("Imię: " + name);
//        System.out.println("Nazwisko: " + surname);
//        System.out.println("Wiek: " + age);
//        System.out.println("Numer telefonu: " + phoneNumber);
//    }
//
//    static void printContact(int id, String name, String surname, String phoneNumber, int age){
//        System.out.println(id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
//    }
//
//    static String getContact(int id, String name, String surname, String phoneNumber, int age){
//        if(Objects.equals(name, "")){
//            name = "NIEZNANY";
//        } else if(Objects.equals(surname, "")){
//            surname = "NIEZNANY";
//        } else if(phoneNumber.length()!=9){
//            phoneNumber = "000000000";
//        }
//        return  (id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
//    }

//      # Zadanie 2
//
//    void printContactCard(String contact) – przyjmującą dane w formacie id;name;surname;age;number I wyświetlającą dane w formacie:
//    Id: id
//    Imię: name
//    Nazwisko: surname
//    Wiek: age
//    Numer telefonu: nubmer
//    void printContact(String contact) – przyjmującą dane w formacie id;name;surname;age;numer;isMobile
//    I wyświetlającą dane w formacie: id | name | surname | age | numer
//    String getContactRaw(String name, String surname, int age, String number, int isMobile)
//    – zwracającą tekst z informacją o kontakcie w formacie: id;name;surname;age;number;isHidden

//    static void printContactCard(String contact){
//
//        System.out.println(contact.replace(";", "\n"));return;
//
//    }

//    static void printContactCard(String contact){
//       String[] contact2 = contact.split(";");
//       String contact1 = Arrays.toString(contact2);
//       System.out.printf(" Id: %s %n Imię: %s %n Nazwisko: %s %n Wiek: %s %n Numer telefonu: %s %n ",  contact2[0], contact2[1], contact2[2], contact2[3], contact2[4]);
//    }
//
//    static void printContact(String contact){
//        System.out.println(contact.replace(";", "|"));
//    }
//
//    static String getContactRaw(Integer id1, String name, String surname, Integer age1, String number, Integer isMobile1){
//        String id = id1.toString();
//        String age = age1.toString();
//        String isMobile = isMobile1.toString();
//
//        String wynik = (String.join(";",id,name,surname,age,number,isMobile));
//        return wynik;
//    }

//      #zadanie 3

//    Zmień implementację metod:
//    printContactCard, printContact, getContact, getContactRaw – tak aby:
//    w przypadku wystąpienia zmiennej String z pustym ciągiem znaków zastępowała go wartością NIEZNANY
//    phoneNumber o liczbie cyfr mniejszej/większej niż 9 zastępowała go dziewięcioma zerami
//    Stwórz tablicę:
//    lastDialed – typu int o rozmiarze 10
//    Stwórz metody:
//    int getLastDialed(int[] tab) – zwracającą wartość na pierwszej pozycji tablicy
//    int getLastDialed(int[] tab, int index) – zwracającą wartość na przekazanej pozycji w tablicy
//    (wartość index podawana jest w sposób ‘naturalny’ - od 1-10).
//    Jeśli na podanej pozycji nie ma prawidłowego id (wartość różna od 0) zwróć 0 i wyświetl odpowiedni komunikat
//    int dial(int[] tab, int id) – ustawiającą przekazaną wartość na pierwszej pozycji w tablicy
//    int removeLastDialed(int[] tab, int index) – ustawiającą wartość dla elementu tablicy, pod indeksem przekazanym
//    jako argument, na 0 (wartość index podawana jest w sposób ‘naturalny’ - od 1-10)

//    static int getLastDialed(int[] tab){
//        return tab[0];
//    }
//
//    static int getLastDialed(int[] tab, int index){
//        return tab[index-1];
//    }
//
//    static int dial(int[] tab, int id){
//        return tab[0] = id;
//    }
//
//    static int removeLastDialed(int[] tab, int index){
//        return tab[index]=0;
//    }

//        #zadanie 4

//        Stwórz enum:
//        NumberType – zawierający 4 wpisy HOME("Domowy"), MOBI("Komórkowy"), WORK("Służbowy")
//        NumberType powinien posiadać metodę pozwalającą na pobranie pełnej nazwy typu numeru („Domowy”, „Komórkowy” lub „Służbowy”)
//        W ciele metody main stwórz zmienną o nazwie numberType i typie NumberType. Przypisz jej wartość MOBI (pobraną z enum)
//        Zmienna/pole powinno mieć typ wcześniej stworzonego enum’a, tak aby można łatwo ustawić typ numeru

//        Zmień implementację metod:
//        int dial(int id) – tak aby przekazany id trafiał na pierwszą pozycję w tablicy, a istniejące w tablicy wartości były ‘przesuwane’ na kolejne pozycje.
//        Jeśli w tablicy zapisanych było już 10 wartości, ostatnia jest usuwana
//        Zgodnie z listą ostatnio wybieranych numerów w telefonie. Kiedy wybieramy jakiś numer, trafia on na górę listy jako ostatnio wybierany
//        printContact, printConctactCard, - aby wyświetlały na ostatnim miejscu typ numeru (pobrany z enum w formie fullText)
//        Modyfikacja wcześniej istniejący metod do wyświetlania numeru w formie ‘raw’ (dane rozdzielone średnikami) oraz wizytówki (dane w formie np. Imię: Tomasz).
//        Modyfikacja ma polegać na dodaniu nowo utworzonego pola numberType
//        getContact, getRawContact – aby zwracał kontakt z podstawową wartością zmiennej numberType w formie tekstu (PRIV, MOBI, WORK)
//        Podobnie jak powyżej, różnica polega na zwracaniu danych w formie łańcuch znaków zamiast ich wyświetlania

        String Numer1;

            void NumerTelefonu(String Numer2){
                Numer1 = Numer2;
            }

        }


