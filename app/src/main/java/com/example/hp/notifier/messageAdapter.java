package com.example.hp.notifier;

import android.support.v7.widget.RecyclerView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by hp on 11-May-17.
 */

public class messageAdapter extends RecyclerView.Adapter<messageAdapter.messageHolder> {

    ArrayList<message> msg;

    public messageAdapter(ArrayList<message> msg) {
        this.msg = msg;
    }

    @Override
    public messageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customview, parent, false);
        messageHolder holder = new messageHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(messageHolder holder, int position) {
        message mssg = msg.get(position);
        Log.d(">>>>", "onBindViewHolder: "+msg.get(0));
        holder.title.setText(mssg.getTitle());
        holder.content.setText(mssg.getContent());
    }

    @Override
    public int getItemCount() {
        return msg.size();
    }

    public static class messageHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView content;

        messageHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            content = (TextView) view.findViewById(R.id.content);
        }
    }
}
