package com.example.programroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface Mydao {

    @Insert
    public void adduser(User user);

    @Query("select * from Users")
    public List<User>getUsers();

    @Update
    public void updateuser(User user);

    @Delete
    public void deleteuser(User user);

}

