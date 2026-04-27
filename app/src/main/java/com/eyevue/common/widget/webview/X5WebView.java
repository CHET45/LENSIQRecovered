package com.eyevue.common.widget.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
public class X5WebView extends WebView {

    /* JADX INFO: renamed from: a */
    public WebViewClient f18168a;

    /* JADX INFO: renamed from: com.eyevue.common.widget.webview.X5WebView$a */
    public class C2552a extends WebViewClient {
        public C2552a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @igg({"SetJavaScriptEnabled"})
    public X5WebView(Context arg0, AttributeSet arg1) {
        super(arg0, arg1);
        C2552a c2552a = new C2552a();
        this.f18168a = c2552a;
        setWebViewClient(c2552a);
    }

    public X5WebView(Context arg0) {
        super(arg0);
        this.f18168a = new C2552a();
    }
}
