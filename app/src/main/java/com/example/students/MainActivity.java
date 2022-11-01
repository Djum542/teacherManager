package com.example.students;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.example.students.adapter.GiaovienAdapter;
import com.example.students.dao.GiangvienTao;
import com.example.students.model.Giaovien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ListView lvGiaovien;
private List<Giaovien> giaoviens;
private GiaovienAdapter adapter;
private GiangvienTao giangvienTao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGiaovien = (ListView) findViewById(R.id.giaovien);
        giaoviens = new ArrayList<Giaovien>();
        giangvienTao = new GiangvienTao(MainActivity.this);
        giaoviens = giangvienTao.AllGiaovien();
        Giaovien gv1 = new Giaovien(022,"Tiến", 0, "tien2254@gmail.com", "0325745937", "Chính trị", "Mác");
        giaoviens.add(gv1);
        adapter = new GiaovienAdapter(getApplicationContext(), giaoviens);
        lvGiaovien.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opition,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_doimatkhau) {
            Intent intent = new Intent(MainActivity.this,MatkhauActivity.class);
        }else {

        }
        if (id == R.id.menu_thoat) {
            finish();
        }
        return true;
    }
}