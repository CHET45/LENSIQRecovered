package com.watchfun.voicenotes;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.voicenotes.bean.BleConnectStatusEvent;
import com.watchfun.voicenotes.bean.H5Param;
import com.watchfun.voicenotes.bean.LocalReqHeader;
import com.watchfun.voicenotes.utils.webview.AndroidBridge;
import com.watchfun.voicenotes.utils.webview.WebViewJsExecutor;
import com.watchfun.voicenotes.widget.AiVoiceNoteLoadingView;
import com.watchfun.voicenotes.widget.webview.X5WebView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p000.C6169g9;
import p000.C9389ml;
import p000.c1i;
import p000.g1i;
import p000.hi9;
import p000.hxg;
import p000.iei;
import p000.igg;
import p000.li3;
import p000.mbb;
import p000.obb;
import p000.p43;
import p000.pb9;
import p000.qxb;
import p000.sc7;

/* JADX INFO: loaded from: classes7.dex */
public class CommonWebViewActivity extends BaseActivity<C6169g9> implements qxb<String>, mbb.InterfaceC9258c {

    /* JADX INFO: renamed from: H */
    public static final String f26184H = "FILE_PATH";

    /* JADX INFO: renamed from: L */
    public static final String f26185L = "title";

    /* JADX INFO: renamed from: M */
    public static final String f26186M = "show_titlebar";

    /* JADX INFO: renamed from: N */
    public static final String f26187N = "url";

    /* JADX INFO: renamed from: Q */
    public static final String f26188Q = "id";

    /* JADX INFO: renamed from: X */
    public static final String f26189X = "file_id";

    /* JADX INFO: renamed from: Y */
    public static final String f26190Y = "CommonWebViewActivity";

    /* JADX INFO: renamed from: Z */
    public static final String f26191Z = "is_set_bg_color";

    /* JADX INFO: renamed from: C */
    public C4293d f26192C;

    /* JADX INFO: renamed from: F */
    public boolean f26193F = true;

    /* JADX INFO: renamed from: a */
    public X5WebView f26194a;

    /* JADX INFO: renamed from: b */
    public String f26195b;

    /* JADX INFO: renamed from: c */
    public String f26196c;

    /* JADX INFO: renamed from: d */
    public String f26197d;

    /* JADX INFO: renamed from: e */
    public String f26198e;

    /* JADX INFO: renamed from: f */
    public mbb f26199f;

    /* JADX INFO: renamed from: m */
    public AndroidBridge f26200m;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.CommonWebViewActivity$a */
    public class C4290a implements ValueCallback<String> {
        public C4290a() {
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.CommonWebViewActivity$b */
    public class C4291b extends WebViewClient {
        public C4291b() {
        }

        private String getMimeType(String str) {
            return str == null ? "application/octet-stream" : str.endsWith(".pcm") ? "audio/x-pcm" : str.endsWith(".mp3") ? "audio/mpeg" : str.endsWith(".wav") ? "audio/wav" : (str.endsWith(".jpg") || str.endsWith(".jpeg")) ? "image/jpeg" : str.endsWith(".png") ? "image/png" : str.endsWith(hi9.f43738c) ? "text/plain" : "application/octet-stream";
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            CommonWebViewActivity.this.saveLocalHeaderToLocalStorageData();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            StringBuilder sb = new StringBuilder();
            sb.append("shouldInterceptRequest: WebResourceRequest ");
            sb.append(webResourceRequest.getUrl().toString());
            String string = webResourceRequest.getUrl().toString();
            if (string.startsWith(iei.f46708b) && (string.contains(".wav") || string.contains(".mp3"))) {
                try {
                    return new WebResourceResponse(getMimeType(string), "UTF-8", CommonWebViewActivity.this.getContentResolver().openInputStream(webResourceRequest.getUrl()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.CommonWebViewActivity$c */
    public class C4292c extends WebChromeClient {
        public C4292c() {
        }

        private String[] addPermission(String[] strArr, String str) {
            String[] strArr2 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[strArr.length] = str;
            return strArr2;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            StringBuilder sb = new StringBuilder();
            sb.append("[ppt:");
            sb.append(consoleMessage.sourceId());
            sb.append(g1i.f38277c);
            sb.append(consoleMessage.lineNumber());
            sb.append("] ");
            sb.append(consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            super.onPermissionRequest(permissionRequest);
            String[] strArrAddPermission = new String[0];
            for (String str : permissionRequest.getResources()) {
                if (str.equals("android.webkit.resource.CLIPBOARD_READ") || str.equals("android.webkit.resource.CLIPBOARD_WRITE")) {
                    strArrAddPermission = addPermission(strArrAddPermission, str);
                }
            }
            if (strArrAddPermission.length > 0) {
                permissionRequest.grant(strArrAddPermission);
            } else {
                permissionRequest.deny();
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i >= 100) {
                ((C6169g9) ((BaseActivity) CommonWebViewActivity.this).binding).f39020c.setVisibility(8);
            } else {
                ((C6169g9) ((BaseActivity) CommonWebViewActivity.this).binding).f39020c.setVisibility(0);
                ((C6169g9) ((BaseActivity) CommonWebViewActivity.this).binding).f39020c.setProgress(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.CommonWebViewActivity$d */
    public static class C4293d implements qxb<Boolean> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<Activity> f26204a;

        public C4293d(CommonWebViewActivity commonWebViewActivity) {
            this.f26204a = new WeakReference<>(commonWebViewActivity);
        }

        @Override // p000.qxb
        public void onChanged(Boolean bool) {
            Activity activity = this.f26204a.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            pb9.get(BleConnectStatusEvent.EVENT_KEY_SHOW_DISCONNECT_BT_CONNECT_DIALOG, Boolean.class).post(Boolean.TRUE);
            activity.finish();
        }
    }

    @igg({"SetJavaScriptEnabled"})
    private void initWebViewSettings() {
        AndroidBridge androidBridge = new AndroidBridge(this);
        this.f26200m = androidBridge;
        androidBridge.setVoiceNoteId(this.f26198e);
        this.f26194a.addJavascriptInterface(this.f26200m, "AndroidBridge");
        WebSettings settings = this.f26194a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName(li3.f57665c);
        settings.setDomStorageEnabled(true);
        settings.setDatabasePath(getApplicationContext().getFilesDir().getAbsolutePath() + "/web");
        settings.setDatabaseEnabled(true);
        settings.setSafeBrowsingEnabled(false);
        settings.setMixedContentMode(0);
        WebView.setWebContentsDebuggingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveLocalHeaderToLocalStorageData() {
        String lowerCase;
        String macAddress = C9389ml.getInstance().getMacAddress();
        String uid = C9389ml.getInstance().getUid();
        String token = C9389ml.getInstance().getToken();
        String userId = C9389ml.getInstance().getUserId();
        String languageCode = C9389ml.getInstance().getLanguageCode();
        String countryCode = C9389ml.getInstance().getCountryCode();
        boolean zIsUsingSystemLanguage = C9389ml.getInstance().isUsingSystemLanguage();
        String isInChina = C9389ml.getInstance().getIsInChina();
        if (TextUtils.isEmpty(languageCode) || zIsUsingSystemLanguage) {
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            if (TextUtils.isEmpty(country)) {
                lowerCase = language.toLowerCase();
            } else {
                lowerCase = language + "-" + country.replace(p43.f69617m, "-").replace("-#hans", "").toLowerCase();
            }
        } else if (TextUtils.isEmpty(countryCode)) {
            lowerCase = languageCode.replace(p43.f69617m, "-").toLowerCase();
        } else {
            lowerCase = languageCode + "-" + countryCode.toLowerCase();
        }
        LocalReqHeader localReqHeader = new LocalReqHeader();
        localReqHeader.setPhoneBrand(Build.BRAND);
        localReqHeader.setPhoneModel(Build.MODEL);
        localReqHeader.setAppVersion(c1i.getVersion(this));
        localReqHeader.setUserId(userId);
        localReqHeader.setOsType("android");
        localReqHeader.setMac(macAddress);
        localReqHeader.setUid(uid);
        localReqHeader.setToken(token);
        localReqHeader.setAppType("1");
        localReqHeader.setLanguage(lowerCase);
        localReqHeader.setIsInChina(isInChina);
        StringBuilder sb = new StringBuilder();
        sb.append("localStorage.setItem('REQ_HEADER', '" + sc7.toJson(localReqHeader) + "');");
        if (C9389ml.getInstance().isForceDarkModel() || hxg.isCurrentlyDark(this)) {
            sb.append("localStorage.setItem('THEME', 'dark');");
        } else {
            sb.append("localStorage.setItem('THEME', 'light');");
        }
        sb.append("localStorage.setItem('IS_LIMIT_TIME', '1');");
        sb.append("localStorage.setItem('THEME_COLOR', '" + hxg.getH5AiSummaryColor(this) + "');");
        sb.append("localStorage.setItem('API_DOMAIN', '" + AndroidBridge.getH5ApiDomain() + "');");
        this.f26194a.evaluateJavascript(sb.toString(), new C4290a());
    }

    private void setExtra() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f26196c = intent.getStringExtra(f26185L);
            this.f26195b = intent.getStringExtra("url");
            this.f26198e = intent.getStringExtra("id");
            this.f26197d = intent.getStringExtra("file_id");
            if (this.f26193F) {
                this.f26193F = intent.getBooleanExtra(f26191Z, true);
            }
            this.f26197d = iei.f46708b + this.f26197d;
            ((C6169g9) this.binding).f39021d.setTitle(this.f26196c);
            if (intent.getBooleanExtra(f26186M, true)) {
                ((C6169g9) this.binding).f39021d.setVisibility(0);
            } else {
                ((C6169g9) this.binding).f39021d.setVisibility(8);
            }
        }
    }

    private void setupWebViewClients() {
        this.f26194a.setWebViewClient(new C4291b());
        this.f26194a.setWebChromeClient(new C4292c());
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6169g9 getViewBinding() {
        return C6169g9.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: i */
    public void m8324i(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        try {
            ((C6169g9) this.binding).f39019b.setVisibility(8);
            String strNetworkType = obb.getInstance().networkType();
            if (!TextUtils.isEmpty(strNetworkType) && !strNetworkType.equals("no_network")) {
                ((C6169g9) this.binding).f39019b.hideAllView();
                this.f26194a.loadUrl(Uri.parse(this.f26195b).toString());
                return;
            }
            ((C6169g9) this.binding).f39019b.showNoNetView();
            ((C6169g9) this.binding).f39019b.setLoadingViewCallBack(new AiVoiceNoteLoadingView.InterfaceC4362a() { // from class: oc2
                @Override // com.watchfun.voicenotes.widget.AiVoiceNoteLoadingView.InterfaceC4362a
                public final void onRetry() {
                    this.f67115a.initData();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        setExtra();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        m8324i(this);
        mbb mbbVar = new mbb(this);
        this.f26199f = mbbVar;
        mbbVar.setNetworkChangeListener(this);
        ((C6169g9) this.binding).f39021d.hideBottomLine();
        X5WebView x5WebView = new X5WebView(this, null);
        this.f26194a = x5WebView;
        if (this.f26193F) {
            x5WebView.setBackgroundColor(getResources().getColor(C4297R.color.tab_bg));
        }
        ((C6169g9) this.binding).f39022e.addView(this.f26194a, new FrameLayout.LayoutParams(-1, -1));
        initWebViewSettings();
        setupWebViewClients();
        pb9.get("select_language", String.class).observeForever(this);
        this.f26192C = new C4293d(this);
        pb9.get(BleConnectStatusEvent.EVENT_KEY_DISCONNECT_BT_CONNECT, Boolean.class).observe(this, this.f26192C);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ((C6169g9) this.binding).f39022e.removeAllViews();
        X5WebView x5WebView = this.f26194a;
        if (x5WebView != null) {
            x5WebView.stopLoading();
            this.f26194a.removeAllViews();
            this.f26194a.destroy();
            this.f26194a = null;
        }
        pb9.get("select_language", String.class).removeObserver(this);
        pb9.get(BleConnectStatusEvent.EVENT_KEY_DISCONNECT_BT_CONNECT, Boolean.class).removeObserver(this.f26192C);
        this.f26192C = null;
        super.onDestroy();
    }

    @Override // p000.mbb.InterfaceC9258c
    public void onNetworkAvailable(String str) {
        WebViewJsExecutor.executeWithParams(this.f26194a, "onNetChange", 1);
    }

    @Override // p000.mbb.InterfaceC9258c
    public void onNetworkLost() {
        WebViewJsExecutor.executeWithParams(this.f26194a, "onNetChange", 0);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f26199f.startMonitoring();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f26199f.stopMonitoring();
    }

    @Override // p000.qxb
    public void onChanged(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("onChanged: language ");
        sb.append(str);
        TransLanguageData transLanguageData = (TransLanguageData) sc7.fromJson(str, TransLanguageData.class);
        H5Param.SetLanParam setLanParam = new H5Param.SetLanParam();
        if (transLanguageData != null) {
            setLanParam.name = AiLangUtil.getValue(this, transLanguageData.getKeyName());
            setLanParam.key = transLanguageData.getLangKey();
        }
        WebViewJsExecutor.executeWithParams(this.f26194a, "onLanguageSelect", sc7.toJson(setLanParam));
    }
}
