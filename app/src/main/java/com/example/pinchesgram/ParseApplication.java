package com.example.pinchesgram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iq9bBQYfNpzWkWyu6sH4WsF7Fb0dAY09IZRSqfm6")
                .clientKey("Th6UMMg0KDGRY8AwZ9IV4rixEIh8y6fM058hc6fl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
