package com.example.programroom;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = User.class,version =1)
public abstract class MyDatabase extends RoomDatabase {

   public abstract Mydao mydao();

 // private static MyDatabase minstance;

//  public static MyDatabase getInstance(Context context){
//
//      if(minstance==null)
//      {
//
//          minstance = Room.databaseBuilder(context.getApplicationContext(),MyDatabase.class, "Userdb").build();
//      }
//      return minstance;
//  }


}
