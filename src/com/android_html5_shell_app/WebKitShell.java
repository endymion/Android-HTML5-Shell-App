package com.android_html5_shell_app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebKitShell extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        WebView engine = (WebView) findViewById(R.id.web_engine);
        engine.loadUrl("http://www.jqmgallery.com/");
        engine.getSettings().setJavaScriptEnabled(true);
    }
}
