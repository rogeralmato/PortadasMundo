package com.androidbelieve.drawerwithswipetabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Ratan on 7/29/2015.
 */
public class SocialFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.primary_layout,null);

        View rootView = inflater.inflate(R.layout.social_layout, container, false);
        WebView lavanguardia = (WebView) rootView.findViewById(R.id.webView);
        WebSettings webSettings = lavanguardia.getSettings();
        webSettings.setJavaScriptEnabled(true);
        lavanguardia.getSettings().setLoadWithOverviewMode(true);
        lavanguardia.getSettings().setUseWideViewPort(true);
        lavanguardia.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/lavanguardia.php");


        lavanguardia.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebView periodico = (WebView) rootView.findViewById(R.id.webView2);

        webSettings.setJavaScriptEnabled(true);
        periodico.getSettings().setLoadWithOverviewMode(true);
        periodico.getSettings().setUseWideViewPort(true);
        periodico.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/elperiodico.php");


        periodico.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebView pais = (WebView) rootView.findViewById(R.id.webView3);

        webSettings.setJavaScriptEnabled(true);
        pais.getSettings().setLoadWithOverviewMode(true);
        pais.getSettings().setUseWideViewPort(true);
        pais.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/elpais.php");


        pais.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebView elmundo = (WebView) rootView.findViewById(R.id.webView4);

        webSettings.setJavaScriptEnabled(true);
        elmundo.getSettings().setLoadWithOverviewMode(true);
        elmundo.getSettings().setUseWideViewPort(true);
        elmundo.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/elmundo.php");


        elmundo.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebView razon = (WebView) rootView.findViewById(R.id.webView5);

        webSettings.setJavaScriptEnabled(true);
        razon.getSettings().setLoadWithOverviewMode(true);
        razon.getSettings().setUseWideViewPort(true);
        razon.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/larazon.php");


        razon.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebView elpunt = (WebView) rootView.findViewById(R.id.webView6);

        webSettings.setJavaScriptEnabled(true);
        elpunt.getSettings().setLoadWithOverviewMode(true);
        elpunt.getSettings().setUseWideViewPort(true);
        elpunt.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/elpunt_avui.php");


        elpunt.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebView sevilla = (WebView) rootView.findViewById(R.id.webView7);

        webSettings.setJavaScriptEnabled(true);
        sevilla.getSettings().setLoadWithOverviewMode(true);
        sevilla.getSettings().setUseWideViewPort(true);
        sevilla.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/diario_sevilla.php");


        sevilla.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebView vasco = (WebView) rootView.findViewById(R.id.webView8);

        webSettings.setJavaScriptEnabled(true);
        vasco.getSettings().setLoadWithOverviewMode(true);
        vasco.getSettings().setUseWideViewPort(true);
        vasco.loadUrl("http://appsbyrgrfifa16.webcindario.com/portadasesp/diario_vasco.php");


        vasco.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });







        return rootView;
    }



}



