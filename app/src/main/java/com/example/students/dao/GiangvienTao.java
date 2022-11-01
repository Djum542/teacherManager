package com.example.students.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;

import com.example.students.database.GiaovienData;
import com.example.students.model.Giaovien;

import java.util.ArrayList;
import java.util.List;


public class GiangvienTao {
private  GiaovienData csdl;
    public GiangvienTao(Context context) {
         csdl = new GiaovienData(context,"",null,1, SQLiteClosable::acquireReference);

    }
    public List<Giaovien> AllGiaovien(){
        String sql = "select * from Giaovien";
        List<Giaovien> giangvienlist = new ArrayList<Giaovien>();
        SQLiteDatabase database = csdl.getReadableDatabase();
        //tương tu như đầu đọc dữ liệu
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int MaGV = cursor.getInt(0);
            String HoTen = cursor.getString(1);
            int GioiTinh = cursor.getInt(2);
            String Email = cursor.getString(3);
            String Sodienthoai = cursor.getString(4);
            String Khoa = cursor.getString(5);
            String Bomon = cursor.getString(6);
            Giaovien gv = new Giaovien(MaGV, HoTen, GioiTinh, Email, Sodienthoai, Khoa, Bomon);
            giangvienlist.add(gv);
            cursor.moveToNext();
        }
        return giangvienlist;
    }
}
