package com.watchfun.voicenotes.widget.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p000.igg;

/* JADX INFO: loaded from: classes7.dex */
public class X5WebView extends WebView {

    /* JADX INFO: renamed from: a */
    public WebViewClient f26561a;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.webview.X5WebView$a */
    public class C4388a extends WebViewClient {
        public C4388a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    @igg({"SetJavaScriptEnabled"})
    public X5WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C4388a c4388a = new C4388a();
        this.f26561a = c4388a;
        setWebViewClient(c4388a);
    }

    public X5WebView(Context context) {
        super(context);
        this.f26561a = new C4388a();
    }
}
