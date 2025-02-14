package com.vanzaga.multiclassexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.vanzaga.multiclassexample.MainClasses.User;
import com.vanzaga.multiclassexample.MainClasses.UserAddress;
import androidx.appcompat.app.AppCompatActivity;

public class UserDetailActivity extends AppCompatActivity {

    // Declaración de variables
    private TextView textView_userName, textView_nombre, textView_userEmail, textView_ciudad, textView_codigoPostal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        // Se inicializan las vistas (TextView) en el método onCreate.
        textView_userName = findViewById(R.id.textView_userName);
        textView_nombre = findViewById(R.id.textView_nombre);
        textView_userEmail = findViewById(R.id.textView_userEmail);
        textView_ciudad = findViewById(R.id.textView_ciudad);
        textView_codigoPostal = findViewById(R.id.textView_codigoPostal);

        // Se obtiene el objeto DataManager de la actividad anterior (MainActivity) usando getIntent().
        DataManager dataManager = (DataManager) getIntent().getSerializableExtra("dataManager");


        // Se obtienen los datos de usuario y dirección de usuario del DataManager y se muestran en los TextView.
        User user = dataManager.getUsers().get(0);
            textView_userName.setText("Nombre de usuario: " + user.getUsername());
            textView_nombre.setText("Nombre real: " + user.getName());
            textView_userEmail.setText("Email: " + user.getEmail());

        UserAddress address = dataManager.getUserAddresses().get(0);
            textView_ciudad.setText("Ciudad: " + address.getCiudad());
            textView_codigoPostal.setText("Código postal: " + address.getPostalCode());

    }

    /*
        User user = dataManager.getUsers().get(0);
        StringBuilder userNameBuilder = new StringBuilder();
        userNameBuilder.append("Nombre de usuario: ").append(user.getUsername());
        textView_userName.setText(userNameBuilder.toString());

        StringBuilder nombreBuilder = new StringBuilder();
        nombreBuilder.append("Nombre real: ").append(user.getName());
        textView_nombre.setText(nombreBuilder.toString());

        StringBuilder userEmailBuilder = new StringBuilder();
        userEmailBuilder.append("Email: ").append(user.getEmail());
        textView_userEmail.setText(userEmailBuilder.toString());

        UserAddress address = dataManager.getUserAddresses().get(0);
        StringBuilder ciudadBuilder = new StringBuilder();
        ciudadBuilder.append("Ciudad: ").append(address.getCiudad());
        textView_ciudad.setText(ciudadBuilder.toString());

        StringBuilder codigoPostalBuilder = new StringBuilder();
        codigoPostalBuilder.append("Código postal: ").append(address.getPostalCode());
        textView_codigoPostal.setText(codigoPostalBuilder.toString());
        */

    public void regresar(View view) {
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);

    }

}