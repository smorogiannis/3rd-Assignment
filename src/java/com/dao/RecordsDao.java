package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.Records;

public class RecordsDao {
    
    public static void saveRecord(Records rcs, Session session) {
        Transaction transaction;
        
        // start a transaction
        transaction = session.beginTransaction();
        // save the student object
        session.save(rcs);
        // commit transaction
        transaction.commit();
    }

    public static Records getRecord(String barcode, Session session) {

        Transaction transaction;
        Records rcs;
        // start a transaction
        transaction = session.beginTransaction();
        // get an user object
        rcs = session.get(Records.class, barcode);
        // commit transaction
        transaction.commit();
        return rcs;
    }
}


