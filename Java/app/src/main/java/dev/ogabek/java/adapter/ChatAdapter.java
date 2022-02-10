package dev.ogabek.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Chat;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Chat> chats;

    public ChatAdapter(Context context, List<Chat> chats) {
        this.context = context;
        this.chats = chats;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item, parent, false);
        return new ChatListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Chat chat = chats.get(position);

        if (holder instanceof ChatListViewHolder) {
            ((ChatListViewHolder) holder).profile.setImageResource(chat.getProfile());
            ((ChatListViewHolder) holder).fullName.setText(chat.getFullName());
            ((ChatListViewHolder) holder).count.setText(String.valueOf(chat.getCount()));
            if (chat.getCount() > 0) {
                ((ChatListViewHolder) holder).count.setVisibility(View.VISIBLE);
            } else {
                ((ChatListViewHolder) holder).count.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    private static class ChatListViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView count, fullName;
        public ChatListViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_profile);
            count = view.findViewById(R.id.tv_count);
            fullName = view.findViewById(R.id.tv_full_name);

        }
    }
}
