package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.ChatAdapter;
import dev.ogabek.java.model.Chat;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        refreshAdapter(getAllChats());
    }

    private void refreshAdapter(List<Chat> chats) {
        ChatAdapter adapter = new ChatAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    private List<Chat> getAllChats() {
        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat(R.drawable.user, "Ogabek Matyakubov", 1));
        chats.add(new Chat(R.drawable.user2, "OgabekDev", 0));
        chats.add(new Chat(R.drawable.user3, "Ogabek", 2));
        chats.add(new Chat(R.drawable.user4, "Android Bootcamp B13", 4));
        chats.add(new Chat(R.drawable.user, "Ogabek Matyakubov", 1));
        chats.add(new Chat(R.drawable.user2, "OgabekDev", 0));
        chats.add(new Chat(R.drawable.user3, "Ogabek", 3));
        chats.add(new Chat(R.drawable.user4, "Android Bootcamp B13", 4));
        chats.add(new Chat(R.drawable.user, "Ogabek Matyakubov", 1));
        chats.add(new Chat(R.drawable.user2, "OgabekDev", 0));
        chats.add(new Chat(R.drawable.user3, "Ogabek", 0));
        chats.add(new Chat(R.drawable.user4, "Android Bootcamp B13", 4));
        chats.add(new Chat(R.drawable.user, "Ogabek Matyakubov", 1));
        chats.add(new Chat(R.drawable.user2, "OgabekDev", 4));
        chats.add(new Chat(R.drawable.user3, "Ogabek", 0));
        chats.add(new Chat(R.drawable.user4, "Android Bootcamp B13", 4));
        return chats;
    }
}