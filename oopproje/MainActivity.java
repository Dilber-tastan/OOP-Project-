package com.example.oopproje;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
       /* user user=new user();
        user.name="nehir";
        user.job="doctor";
        user user1 =new user();
        user1.name="esma";
        user1.job="software developer";
         user user2=new user();
         user2.name="devran";
         user2.job="vet";*/
        user user1=new user("nehir","doctor");
        System.out.println(user1.information());
        System.out.println(user1.name);
        System.out.println(user1.job);

        musician music =new musician("james","guitar",40);
       // music.age=60;//We provide access because it is public.
        //We provide access because it is public.
       // System.out.println(music.age);
        System.out.println(music.getName());
      supermusician lars=  new supermusician("lars","drums",50);
        System.out.println(lars.sing());


       // static polymorphism
        mathematics math =new mathematics();
        System.out.println(math.sum(4,9));
        System.out.println(math.sum(7,8,26));

       // dinamic polymorphism
        animal animal =new animal();
        animal.sing();
        dog  kangal =new dog();
        kangal.sing();
        kangal.test();

         piano mypiano =new piano();
         mypiano.brand="yamaha";
         mypiano.digital= true;
         mypiano.info();



    }
}