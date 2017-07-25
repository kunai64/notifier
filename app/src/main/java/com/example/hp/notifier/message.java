package com.example.hp.notifier;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by hp on 10-May-17.
 */
public class message {
    public String title;
    public String content;

    public message() {

    }

    public message(String title, String content) {
        this.title = title;
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
