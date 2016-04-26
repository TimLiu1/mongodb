package com.Tim.Mongodb;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class connection {

    public static void main(String[] args) throws Exception {

        Mongo m = new Mongo("localhost", 27017);

        DB db = m.getDB("test ");

        if(db.authenticate("test", "123".toCharArray())){

            System.out.println("success");;

        }

        else System.out.println("false");

    }

}    