package com.example.taskapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

//    private static int viewHolderCount;
//    private int numberItems;

//    public NotesAdapter(String titleS, String textS){
//
////        numberItems = nuberOfItems;
////        viewHolderCount = 0;
//    }

//    public NotesAdapter(@NonNull AppCompatActivity context, ArrayList<Notes> notes) {
//        super(context,0, notes);
//    }

    private List<Notes> mNotess;

    public NotesAdapter(List<Notes> contacts) {
        mNotess = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.list_item;

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, viewGroup, false);

        // viewHolder.viewHolderIndex.setText("ViewHoler index" + viewHolderCount);
        //viewHolderCount++;

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder notesViewHolder, int i) {

        Notes notes = mNotess.get(i);

        TextView titleView = notesViewHolder.titleView;
        titleView.setText(notes.getmTitle());

        TextView textView = notesViewHolder.textView;
        textView.setText(notes.getmText());

        ImageView saveImgView = notesViewHolder.saveImgView;
        //saveImgView.setImageResource(notes.getmSaveImg());
        saveImgView.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        //return mNotess.size();
        return mNotess.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleView;
        TextView textView;
        ImageView saveImgView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleView = itemView.findViewById(R.id.id_title);
            textView = itemView.findViewById(R.id.id_text);
            saveImgView = itemView.findViewById(R.id.id_image);
        }

//        void bind(int listIndex){
//            listItemNotesView.setText(String.valueOf(listIndex));
//        }
    }
}
