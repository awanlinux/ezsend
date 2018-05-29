package com.ppl.ezsend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class cekharga extends AppCompatActivity {

    public cekharga() throws IOException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cekharga);
        this.setTitle( "Cek Harga");
    }

    public void provinsi() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.rajaongkir.com/starter/province?id=12")
                .get()
                .addHeader("key", "74a00001992d619fc47c81af9b2dd454")
                .build();

        Response response = client.newCall(request).execute();
    }

    public void city() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.rajaongkir.com/starter/city?id=39&province=5")
                .get()
                .addHeader("key", "74a00001992d619fc47c81af9b2dd454")
                .build();

        Response response = client.newCall(request).execute();
    }

    public void cost() throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "origin=501&destination=114&weight=1700&courier=jne");
        Request request = new Request.Builder()
                .url("https://api.rajaongkir.com/starter/cost")
                .post(body)
                .addHeader("key", "74a00001992d619fc47c81af9b2dd454")
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .build();

        Response response = client.newCall(request).execute();
    }



    public void toastMsg(String msg) {

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }

    public void displayToastMsg(View v) {

        toastMsg(" Kurir : JNE, Kota : Jakarta Utara, Berat : 1 Kilo, Harga Rp 20000");

    }


}
