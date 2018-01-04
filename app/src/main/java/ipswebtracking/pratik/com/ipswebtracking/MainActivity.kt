package ipswebtracking.pratik.com.ipswebtracking

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.Window
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private var MyWebView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyWebView = findViewById<View>(R.id.webView) as WebView?
        val webSettings = MyWebView!!.settings

        webSettings.javaScriptEnabled = true
        MyWebView!!.loadUrl("http://ipsweb.ptcmysore.gov.in/ipswebtracking/")
        MyWebView!!.webViewClient = WebViewClient() //In-App Browsing

        MyWebView!!.settings.loadWithOverviewMode= true
        MyWebView!!.settings.useWideViewPort = true
        MyWebView!!.scrollBarStyle = WebView.SCROLLBARS_OUTSIDE_OVERLAY
        MyWebView!!.isScrollbarFadingEnabled = true
        webSettings.builtInZoomControls= true


    }

}




