package Structural.Adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDataBase();
        dataBase.insert();
        dataBase.update();
        dataBase.insert();
        dataBase.remove();
    }
}
