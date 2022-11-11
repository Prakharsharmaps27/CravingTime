package com.prakharsharma.cravingtime;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.prakharsharma.cravingtime.models.ordermodel;

import java.util.ArrayList;

public class Sqlite extends SQLiteOpenHelper {

    final static String DBNAME =  "mydatabase.db";
    final static int DBVERSION = 1;

    public Sqlite(@Nullable Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE orders" + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                   "name text," + "phone text," + "price int," + "image int," +"quantity int," + "about text," +
                "foodname text )"

        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS orders");
    }

    public boolean insertorder(String name , String phone , int price, String about , String foodname,int image,int quantity){

        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        ContentValues values = new ContentValues();

        values.put("name",name);
        values.put("phone",phone);
        values.put("price",price);
        values.put("about",about);
        values.put("foodname",foodname);
        values.put("image",image);
        values.put("quantity",quantity);

        long id = sqLiteDatabase.insert("orders",null,values);

        if (id<=0){
            return false;
        }else{
            return true;
        }
    }

    public ArrayList<ordermodel> liste(){

        ArrayList<ordermodel> liste = new ArrayList<>();
        SQLiteDatabase database = getWritableDatabase();

        Cursor cursor = database.rawQuery("Select id , image , foodname , price , name , quantity from orders",null );
        if(cursor.moveToFirst()){
            while(cursor.moveToNext()){
                ordermodel ordermodel = new ordermodel();
                ordermodel.setOrdernumber(cursor.getInt(0)+"");
                ordermodel.setOrderimage(cursor.getInt(1));
                ordermodel.setFoodname(cursor.getString(2));
                ordermodel.setFoodprice(cursor.getString(3));
                ordermodel.setPersonname(cursor.getString(4));
                ordermodel.setQuantityy(cursor.getString(5));

                liste.add(ordermodel);
            }
        }

        cursor.close();
        database.close();
        return liste;

    }
}
