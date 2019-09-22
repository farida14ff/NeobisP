//package com.example.taskapp.data;
//
//import android.arch.persistence.room.Database;
//import android.arch.persistence.room.Room;
//import android.arch.persistence.room.RoomDatabase;
//import android.content.Context;
//
//import com.example.taskapp.Notes;
//
//@Database(entities = Notes.class, version = 1)
//abstract class NotesRoomDatabase extends RoomDatabase {
//
//    public abstract NotesDao notesDao();
//
//    private static volatile NotesRoomDatabase notesRoomInterface;
//
//    static  NotesRoomDatabase getDatabase(final Context context){
//        if (notesRoomInterface == null){
//            synchronized (NotesRoomDatabase.class){
//                notesRoomInterface = Room.databaseBuilder(context.getApplicationContext(),
//                        NotesRoomDatabase.class, "note_database").build();
//            }
//        }
//        return  notesRoomInterface;
//
//
//    }
//
//
//}
