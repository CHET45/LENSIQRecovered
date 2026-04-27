package com.watchfun.voicenotes.utils.webview;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import p000.c0b;
import p000.eu9;
import p000.nk1;

/* JADX INFO: loaded from: classes7.dex */
public class WebViewJsExecutor {
    private static String escapeJsString(String str) {
        return str == null ? "" : str.replace(nk1.f64796h, "\\\\").replace("'", "\\'").replace("\n", "\\n").replace(eu9.f34034d, "\\r").replace("\t", "\\t");
    }

    public static void executeJs(final WebView webView, final String str, final ValueCallback<String> valueCallback) {
        if (webView == null || str == null) {
            return;
        }
        webView.post(new Runnable() { // from class: mji
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript(str, valueCallback);
            }
        });
    }

    public static void executeVoidFunction(WebView webView, String str) {
        if (webView == null || str == null || str.isEmpty()) {
            return;
        }
        executeJs(webView, "javascript:" + str + "()", null);
    }

    public static void executeWithParams(WebView webView, String str, String... strArr) {
        if (webView == null || str == null || str.isEmpty() || strArr == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append("'");
            sb.append(escapeJsString(strArr[i]));
            sb.append("'");
            if (i != strArr.length - 1) {
                sb.append(",");
            }
        }
        executeJs(webView, "javascript:" + str + c0b.f15433c + ((Object) sb) + c0b.f15434d, null);
    }

    public static void executeWithResult(WebView webView, String str, ValueCallback<String> valueCallback) {
        if (webView == null || str == null || str.isEmpty()) {
            return;
        }
        executeJs(webView, "javascript:(" + str + "())", valueCallback);
    }

    public static void executeWithParams(WebView webView, String str, int... iArr) {
        if (webView == null || str == null || str.isEmpty() || iArr == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            sb.append("'");
            sb.append(iArr[i]);
            sb.append("'");
            if (i != iArr.length - 1) {
                sb.append(",");
            }
        }
        executeJs(webView, "javascript:" + str + c0b.f15433c + ((Object) sb) + c0b.f15434d, null);
    }
}
