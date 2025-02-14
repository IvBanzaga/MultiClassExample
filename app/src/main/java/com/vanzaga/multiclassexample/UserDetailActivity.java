package com.vanzaga.multiclassexample;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.vanzaga.multiclassexample.MainClasses.User;
import com.vanzaga.multiclassexample.MainClasses.UserAddress;
import androidx.appcompat.app.AppCompatActivity;

public class UserDetailActivity extends AppCompatActivity {
    private TextView textView_userName, textView_nombre, textView_userEmail, textView_ciudad, textView_codigoPostal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        textView_userName = findViewById(R.id.textView_userName);
        textView_nombre = findViewById(R.id.textView_nombre);
        textView_userEmail = findViewById(R.id.textView_userEmail);
        textView_ciudad = findViewById(R.id.textView_ciudad);
        textView_codigoPostal = findViewById(R.id.textView_codigoPostal);

        DataManager dataManager = (DataManager) getIntent().getSerializableExtra("dataManager");

        User user = dataManager.getUsers().get(0);
            textView_userName.setText("Nombre de usuario: " + user.getUsername());
            textView_nombre.setText("Nombre real: " + user.getName());
            textView_userEmail.setText("Email: " + user.getEmail());

        UserAddress address = dataManager.getUserAddresses().get(0);
            textView_ciudad.setText("Ciudad: " + address.getCiudad());
            textView_codigoPostal.setText("Código postal: " + address.getPostalCode());

    }

    public void regresar(View view) {

    }

}