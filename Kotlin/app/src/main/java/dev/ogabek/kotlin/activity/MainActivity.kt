package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.ChatAdapter
import dev.ogabek.kotlin.model.Chat

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    private fun refreshAdapter(chats: java.util.ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.user, "Ogabek Matyakubov", 1))
        chats.add(Chat(R.drawable.user2, "OgabekDev", 0))
        chats.add(Chat(R.drawable.user3, "Ogabek", 0))
        chats.add(Chat(R.drawable.user4, "Android Bootcamp B13", 4))
        chats.add(Chat(R.drawable.user, "Ogabek Matyakubov", 1))
        chats.add(Chat(R.drawable.user2, "OgabekDev", 0))
        chats.add(Chat(R.drawable.user3, "Ogabek", 0))
        chats.add(Chat(R.drawable.user4, "Android Bootcamp B13", 4))
        chats.add(Chat(R.drawable.user, "Ogabek Matyakubov", 1))
        chats.add(Chat(R.drawable.user2, "OgabekDev", 0))
        chats.add(Chat(R.drawable.user3, "Ogabek", 0))
        chats.add(Chat(R.drawable.user4, "Android Bootcamp B13", 4))
        chats.add(Chat(R.drawable.user, "Ogabek Matyakubov", 1))
        chats.add(Chat(R.drawable.user2, "OgabekDev", 0))
        chats.add(Chat(R.drawable.user3, "Ogabek", 0))
        chats.add(Chat(R.drawable.user4, "Android Bootcamp B13", 4))
        return chats
    }

}