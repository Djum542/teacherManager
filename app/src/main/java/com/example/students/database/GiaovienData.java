package com.example.students.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GiaovienData extends SQLiteOpenHelper {
    public GiaovienData(@Nullable Context context) {
        super(context, "GiangvienDatabase.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlGVcreate = "create table if not exists, "+
                "Giaovien(MaGV int primary key,"+
                "HoTen varchar(200),"+
                "GioiTinh int"+
                "Email varchar(200)"+
                "Sodienthoai varchar(13)"+
                "Khoa varchar(50)"+
                "Bomon varchar(200))";
        sqLiteDatabase.execSQL(sqlGVcreate);
        String sqladd1 = "insert into Giaovien(MaGV,HoTen, GioiTinh, Email, Sodienthoai, Khoa, Bomon) values("522", "Thao", "0", "03548228", "Luat", "Luatdansu")";
        sqLiteDatabase.execSQL(sqladd1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
