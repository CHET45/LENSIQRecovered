package com.eyevue.glassapp.view.statement;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.LoadingView;
import com.eyevue.common.widget.webview.X5WebView;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import p000.C13958va;
import p000.pbb;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueStatementActivity extends BaseActivity<C13958va> {

    /* JADX INFO: renamed from: a */
    public X5WebView f19165a;

    /* JADX INFO: renamed from: b */
    public boolean f19166b;

    /* JADX INFO: renamed from: c */
    public boolean f19167c;

    /* JADX INFO: renamed from: d */
    public String f19168d;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.statement.EyevueStatementActivity$a */
    public class C2924a extends WebChromeClient {
        public C2924a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
            if (EyevueStatementActivity.this.f19166b) {
                return;
            }
            ((C13958va) ((BaseActivity) EyevueStatementActivity.this).binding).f90423c.setProgress(newProgress);
            if (newProgress != 100) {
                ((C13958va) ((BaseActivity) EyevueStatementActivity.this).binding).f90423c.setVisibility(0);
            } else {
                EyevueStatementActivity.this.f19166b = true;
                ((C13958va) ((BaseActivity) EyevueStatementActivity.this).binding).f90423c.setVisibility(8);
            }
        }
    }

    private void setTitle() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f19167c = intent.getBooleanExtra("isUserAgreement", false);
            this.f19168d = intent.getStringExtra("url");
            if (this.f19167c) {
                ((C13958va) this.binding).f90424d.setTitle(C2531R.string.eyevue_user_agreement, this);
            } else {
                ((C13958va) this.binding).f90424d.setTitle(C2531R.string.eyevue_privacy_agreement, this);
            }
        }
    }

    private void webSetting(final Uri uri) {
        X5WebView x5WebView = this.f19165a;
        if (x5WebView == null) {
            return;
        }
        WebSettings settings = x5WebView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSavePassword(false);
        settings.setDisplayZoomControls(true);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        CookieManager.getInstance().setAcceptCookie(false);
        ((C13958va) this.binding).f90423c.setProgress(0);
        this.f19165a.loadUrl(uri.toString());
        this.f19165a.setWebChromeClient(new C2924a());
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C13958va getViewBinding() {
        return C13958va.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        try {
            ((C13958va) this.binding).f90422b.setVisibility(0);
            String strNetworkType = pbb.getInstance().networkType();
            if (!TextUtils.isEmpty(strNetworkType) && !strNetworkType.equals("no_network")) {
                ((C13958va) this.binding).f90422b.hideAllView();
                webSetting(Uri.parse(this.f19168d));
                return;
            }
            ((C13958va) this.binding).f90422b.showNoNetView();
            ((C13958va) this.binding).f90422b.setLoadingViewCallBack(new LoadingView.InterfaceC2535a() { // from class: yn5
                @Override // com.eyevue.common.widget.LoadingView.InterfaceC2535a
                public final void onRetry() {
                    this.f102332a.initData();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        setTitle();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
        ((C13958va) this.binding).f90424d.hideBottomLine();
        this.f19165a = new X5WebView(this, null);
        ((C13958va) this.binding).f90425e.addView(this.f19165a, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ((C13958va) this.binding).f90425e.removeAllViews();
        X5WebView x5WebView = this.f19165a;
        if (x5WebView != null) {
            x5WebView.stopLoading();
            this.f19165a.removeAllViews();
            this.f19165a.destroy();
            this.f19165a = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C4032a.setStatusBarDark(this, false, true, false);
        yp0.setStatusBarLightMode((Activity) this, false);
    }
}
