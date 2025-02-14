package com.vanzaga.multiclassexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.vanzaga.multiclassexample.MainClasses.User;

public class AddUserActivity extends AppCompatActivity {

    private EditText editText_userName, editText_nombre, editText_userEmail;
    private DataManager dataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        editText_userName = findViewById(R.id.editText_userName);
        editText_nombre = findViewById(R.id.editText_nombre);
        editText_userEmail = findViewById(R.id.editText_userEmail);

        dataManager = DataManager.getInstance();
    }

    public void saveUser(View view) {
        String userName = editText_userName.getText().toString();
        String nombre = editText_nombre.getText().toString();
        String email = editText_userEmail.getText().toString();

        User newUser = new User(userName, nombre, email);
        dataManager.addUser(newUser);

        Intent intent = new Intent(this, UserListActivity.class);
        startActivity(intent);
    }
}