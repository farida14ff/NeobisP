//package com.example.taskapp.data;
//
//import android.arch.persistence.room.Dao;
//import android.arch.persistence.room.Delete;
//import android.arch.persistence.room.Insert;
//import android.arch.persistence.room.Query;
//
//import com.example.taskapp.Notes;
//
//import java.util.List;
//
//@Dao
//public interface NotesDao {
//    @Query("SELECT * FROM Notes")
//    List<Notes> getAllNotes();
//
//    @Insert
//    long addNotes(Notes notes);
//
//    @Query("UPDATE Notes SET mTitle = :name, mText = :quantity")
//    void updatePNotes(String name, int quantity, double price, String imageUri, long id);
//
//    @Query("DELETE FROM Notes")
//    void deleteAllNotes();
//
//    @Query("DELETE FROM Notes WHERE _id = :id")
//    void deleteNotes(int id);
//
//    @Delete
//    long deleteNotes(Notes notes);
//}
