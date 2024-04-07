package com.example.foodapp_androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.zoho.salesiqembed.ZohoSalesIQ;

public class ChatActivity extends AppCompatActivity {
    private LinearLayout home, delivery, cart, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        home = findViewById(R.id.layout_home);
        delivery = findViewById(R.id.layout_delivery);
        cart = findViewById(R.id.layout_cart);
        profile = findViewById(R.id.layout_profile);

        //Tích hợp zoho

//        InitConfig initConfig = new InitConfig();
//        ZohoSalesIQ.init(this.getApplication(), "GarMdLDlOPrxy7R8kur7kxy5DVKCOhhLkJsJ5PA9ES3lzS5RxEdNN7lL3KqGrrQOE8IA0L0udBo%3D_in",
//                " VXYedrQX8SnlbJmrcouAR7LpdS6Rx2KVMNPd1LI5EfNHw9BJpKJ2Sw0c5L8d5IbXtk33t845srRZjJzZNeA6z6FvoblUri4%2Be%2BL9KDXvlKyW7MVwxpK1AYn28bjqpW35cjQwBcJtfKk%3D",
//                initConfig, new InitListener() {
//                    @Override
//                    public void onInitSuccess() {
//                        ZohoSalesIQ.Launcher.show(ZohoSalesIQ.Launcher.VisibilityMode.ALWAYS);
//                    }
//
//                    @Override
//                    public void onInitError(int errorCode, String errorMessage) {
//
//                    }
//                });

        ZohoSalesIQ.init(this.getApplication(), "GarMdLDlOPrxy7R8kur7kxy5DVKCOhhLkJsJ5PA9ES3lzS5RxEdNN7lL3KqGrrQOE8IA0L0udBo%3D_in",
               " VXYedrQX8SnlbJmrcouAR7LpdS6Rx2KVMNPd1LI5EfNHw9BJpKJ2Sw0c5L8d5IbXtk33t845srRZjJzZNeA6z6FvoblUri4%2Be%2BL9KDXvlKyW7MVwxpK1AYn28bjqpW35cjQwBcJtfKk%3D");
        ZohoSalesIQ.showLauncher(true);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatActivity.this, DeliveryActivity.class);
                startActivity(intent);
            }
        });

    }
}