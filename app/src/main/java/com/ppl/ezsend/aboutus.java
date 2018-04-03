package com.ppl.ezsend;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_aboutus);
        WebView web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("http://kukuliner.000webhostapp.com/");
        web.setWebViewClient(new WebViewClient());
    }
}
