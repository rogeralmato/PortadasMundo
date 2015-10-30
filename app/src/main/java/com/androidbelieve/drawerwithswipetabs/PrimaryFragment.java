package com.androidbelieve.drawerwithswipetabs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.callback.BitmapAjaxCallback;
import com.androidquery.util.AQUtility;
import com.squareup.picasso.Picasso;
import com.androidquery.AQuery;
import com.androidquery.AbstractAQuery;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class PrimaryFragment extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.primary_layout,null);

        View rootView = inflater.inflate(R.layout.primary_layout, container, false);
        WebView mundo = (WebView) rootView.findViewById(R.id.webView);
        WebSettings webSettings = mundo.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mundo.getSettings().setLoadWithOverviewMode(true);
        mundo.getSettings().setUseWideViewPort(true);
        mundo.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/mundodeportivo.php");


        mundo.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebView marca = (WebView) rootView.findViewById(R.id.webView2);

        webSettings.setJavaScriptEnabled(true);
        marca.getSettings().setLoadWithOverviewMode(true);
        marca.getSettings().setUseWideViewPort(true);
        marca.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/marca.php");


        marca.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
           }
        });

        WebView sport = (WebView) rootView.findViewById(R.id.webView3);

        webSettings.setJavaScriptEnabled(true);
        sport.getSettings().setLoadWithOverviewMode(true);
        sport.getSettings().setUseWideViewPort(true);
        sport.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/sport.php");


        sport.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebView as = (WebView) rootView.findViewById(R.id.webView4);

        webSettings.setJavaScriptEnabled(true);
        as.getSettings().setLoadWithOverviewMode(true);
        as.getSettings().setUseWideViewPort(true);
        as.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/as.php");


        as.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebView el9 = (WebView) rootView.findViewById(R.id.webView5);

        webSettings.setJavaScriptEnabled(true);
        el9.getSettings().setLoadWithOverviewMode(true);
        el9.getSettings().setUseWideViewPort(true);
        el9.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/el9.php");


        el9.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebView superdeporte = (WebView) rootView.findViewById(R.id.webView6);

        webSettings.setJavaScriptEnabled(true);
        superdeporte.getSettings().setLoadWithOverviewMode(true);
        superdeporte.getSettings().setUseWideViewPort(true);
        superdeporte.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/superdeporte.php");


        superdeporte.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });






        return rootView;
    }


    
}



//http://appsbyrgrfifa16.webcindario.com/portadasesp/mundodeportivo.php