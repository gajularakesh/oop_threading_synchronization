package com.scalar.designPatterns.singleton.type2code;

public class DataBase {

    private DataBase(){}

    //private static int count = 1;

    public static class DataBaseHelper{
//        static{
//            DataBase.count++;
//        }
        private static DataBase instance = new DataBase();
    }

    public static DataBase getInstance(){

        return DataBaseHelper.instance;
    }

        //for testing purpose weather it is called multiple time or not
//    public static int getCount() {
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Count before first getInstance call: " + DataBase.getCount());
//        DataBase db1 = DataBase.getInstance();
//        System.out.println("Count after first getInstance call: " + DataBase.getCount());
//        DataBase db2 = DataBase.getInstance();
//        System.out.println("Count after second getInstance call: " + DataBase.getCount());
//    }
}
