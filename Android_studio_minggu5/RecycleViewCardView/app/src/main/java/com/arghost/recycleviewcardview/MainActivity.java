package com.arghost.recycleviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Brush", "Avanger"));
        siswaList.add(new Siswa("Tony", "Avanger"));
        siswaList.add(new Siswa("Loki", "Avanger"));
        siswaList.add(new Siswa("Captain", "Avanger"));
        siswaList.add(new Siswa("Wakanda", "Avanger"));
        siswaList.add(new Siswa("Dr.Strange", "Avanger"));
        siswaList.add(new Siswa("Nezuko", "Avanger"));
        siswaList.add(new Siswa("Tanjirou", "Avanger"));
        siswaList.add(new Siswa("Mikey", "Avanger"));
        siswaList.add(new Siswa("Draken", "Avanger"));
        siswaList.add(new Siswa("Baji", "Avanger"));
        siswaList.add(new Siswa("Genji", "Avanger"));
        siswaList.add(new Siswa("Valhalla", "Avanger"));
        siswaList.add(new Siswa("Touman", "Avanger"));
        siswaList.add(new Siswa("Jony", "Avanger"));
        siswaList.add(new Siswa("Angele", "Avanger"));
        siswaList.add(new Siswa("Mia", "Avanger"));
        siswaList.add(new Siswa("Razor", "Avanger"));
        siswaList.add(new Siswa("Bull", "Avanger"));
        siswaList.add(new Siswa("Neo", "Avanger"));
        siswaList.add(new Siswa("Widia", "Avanger"));
        siswaList.add(new Siswa("Citra", "Avanger"));
        siswaList.add(new Siswa("Shouta", "Avanger"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }


    public void btnTambah(View view) {
        siswaList.add(new Siswa("Kimmy", "Avanger"));
        adapter.notifyDataSetChanged();
    }
}