package com.vanzaga.multiclassexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.vanzaga.multiclassexample.MainClasses.User;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.textView_userName.setText("Nombre de usuario: " + user.getUsername());
        holder.textView_nombre.setText("Nombre real: " + user.getName());
        holder.textView_userEmail.setText("Email: " + user.getEmail());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView textView_userName, textView_nombre, textView_userEmail;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_userName = itemView.findViewById(R.id.textView_userName);
            textView_nombre = itemView.findViewById(R.id.textView_nombre);
            textView_userEmail = itemView.findViewById(R.id.textView_userEmail);
        }
    }
}