package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import com.example.custom_listview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.amira,R.drawable.indah, R.drawable.nabil,R.drawable.loly,R.drawable.vanya,R.drawable.farhan,
                R.drawable.fadel,R.drawable.rizka,R.drawable.haiqal,R.drawable.pije};
        String[] nama = {"Amira Nurul Amanda","Indah Syahputri","Nabilah luthfiyah","Lolyvia Khoiriah","Vanya Widya","Farhan Al Zuhri",
                "Fadel Majid","Rizka Annisa","Haiqal Rizki","Fildzah Alifia"};
        String[] nim = {"181402009","181402011","181402009","181402016","181402048",
                "181402069","181402083","191402010","191402043","191402017"};
        String[] email = {"amiraamandanurul@gmail.com","indah@gmail.com","nabilah@gmail.com","lolyvia@gmail.com","vanya@gmail.com",
                "farhan@gmail.com","fadel@gmail.com","rizka@gmail.com","haiwal@gmail.com","fildzah@gmail.com"};
        String[] angkatan ={"2018","2018","2018","2018","2018","2018","2018","2019","2019","2019"};
        String[] fakultas = {"Fasilkom-TI","Fasilkom-TI","Fasilkom-TI","Fasilkom-TI","Fasilkom-TI",
                "Fasilkom-TI","Fasilkom-TI","Fasilkom-TI","Fasilkom-TI","Fasilkom-TI"};
        String[] prodi = {"Teknologi Informasi","Teknologi Informasi","Teknologi Informasi","Teknologi Informasi",
                "Teknologi Informasi","Teknologi Informasi","Teknologi Informasi","Teknologi Informasi","Teknologi Informasi", "Teknologi Informasi"};

        String[] semester = {"7","7","7","7","7","7","7","5","5","5"};
        String[] status = {"Aktif","Aktif","Aktif","Aktif","Aktif",
                "Aktif","Aktif","Aktif","Aktif","Aktif"};

        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            User user = new User(nama[i],nim[i],email[i],angkatan[i],fakultas[i],prodi[i],semester[i], status[i], imageId[i]);
            userArrayList.add(user);


        }


        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this,UserActivity.class);
                i.putExtra("nama",nama[position]);
                i.putExtra("nim",nim[position]);
                i.putExtra("email",email[position]);
                i.putExtra("angkatan",angkatan[position]);
                i.putExtra("fakultas",fakultas[position]);
                i.putExtra("prodi",prodi[position]);
                i.putExtra("semester",semester[position]);
                i.putExtra("status",status[position]);
                i.putExtra("imageid",imageId[position]);

                startActivity(i);

            }
        });

    }
}