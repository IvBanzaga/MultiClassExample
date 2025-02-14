package com.vanzaga.multiclassexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.vanzaga.multiclassexample.DataManager;
import com.vanzaga.multiclassexample.MainClasses.User;
import com.vanzaga.multiclassexample.MainClasses.UserAddress;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextName, editTextEmail, editTextCity, editTextPostalCode;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editText_username);
        editTextName = findViewById(R.id.editText_nombre);
        editTextEmail = findViewById(R.id.editText_email);
        editTextCity = findViewById(R.id.editTextCiudad);
        editTextPostalCode = findViewById(R.id.editText_codigoPostal);
        btnSubmit = findViewById(R.id.btnSubmit);

        DataManager dataManager = new DataManager();

        btnSubmit.setOnClickListener(view -> {
            String username = editTextUsername.getText().toString();
            String nombre = editTextName.getText().toString();
            String email = editTextEmail.getText().toString();
            String ciudad = editTextCity.getText().toString();
            String postalCode = editTextPostalCode.getText().toString();

            User user = new User(username, nombre, email);
            UserAddress address = new UserAddress(ciudad, postalCode);

            dataManager.addUser(user);
            dataManager.addUserAddress(address);

            Intent intent = new Intent(MainActivity.this, UserDetailActivity.class);
            intent.putExtra("dataManager", dataManager);
            startActivity(intent);
        });
    }
}
