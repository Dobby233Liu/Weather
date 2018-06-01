package com.l.weather;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		WebView wv=new WebView(this);
		WebSettings ws=wv.getSettings();
		ws.setJavaScriptEnabled(true);
		wv.loadUrl("file:///android_asset/index.html");
        setContentView(wv);
    }

	@Override
	public void onBackPressed()
	{
		// TODO: Implement this method
		super.onBackPressed();
		finish();
	}
}
