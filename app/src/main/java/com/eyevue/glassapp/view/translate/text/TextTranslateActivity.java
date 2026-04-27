package com.eyevue.glassapp.view.translate.text;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.dialogs.WaitingDialog;
import com.eyevue.glassapp.utils.TransLangUtil;
import com.google.gson.Gson;
import com.watchfun.base.BaseActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.bean.p012ai.LangLau;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import java.io.File;
import java.io.IOException;
import p000.C6218gd;
import p000.InterfaceC12632sk;
import p000.fre;
import p000.jq9;
import p000.l3h;
import p000.p87;
import p000.pj4;
import p000.u87;
import p000.ufh;
import p000.vfe;
import p000.yrf;

/* JADX INFO: loaded from: classes4.dex */
public class TextTranslateActivity extends BaseActivity<C6218gd> implements InterfaceC12632sk.d, InterfaceC12632sk.b {

    /* JADX INFO: renamed from: F */
    public static final String f19298F = "woke_language_from_two_ear_news";

    /* JADX INFO: renamed from: H */
    public static final String f19299H = "woke_language_to_two_ear_news";

    /* JADX INFO: renamed from: C */
    public WaitingDialog f19300C;

    /* JADX INFO: renamed from: a */
    public TransLanguageData f19301a;

    /* JADX INFO: renamed from: b */
    public TransLanguageData f19302b;

    /* JADX INFO: renamed from: c */
    public String f19303c;

    /* JADX INFO: renamed from: d */
    public String f19304d;

    /* JADX INFO: renamed from: e */
    public u87 f19305e;

    /* JADX INFO: renamed from: f */
    public AudioManager f19306f;

    /* JADX INFO: renamed from: m */
    public p87 f19307m;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.text.TextTranslateActivity$a */
    public class ViewOnClickListenerC2958a implements View.OnClickListener {
        public ViewOnClickListenerC2958a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TextUtils.isEmpty(((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39374Y.getText().toString())) {
                l3h.showToastShort(TextTranslateActivity.this.getApplicationContext(), C2531R.string.tip_content_is_empty);
                return;
            }
            AudioPlayerManager.getInstance().stopAudio();
            TextTranslateActivity.this.showLoadingView();
            TextTranslateActivity.this.f19305e.refreshData(TextTranslateActivity.this.getApplicationContext(), ((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39374Y.getText().toString().replace("\n", ""), TextTranslateActivity.this.f19302b.getIatLanguage(), TextTranslateActivity.this.f19301a.getIatLanguage());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.text.TextTranslateActivity$b */
    public class ViewOnClickListenerC2959b implements View.OnClickListener {
        public ViewOnClickListenerC2959b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((ClipboardManager) TextTranslateActivity.this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("trans", ((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39375Z.getText().toString()));
            l3h.showToastShort(TextTranslateActivity.this.getApplicationContext(), C2531R.string.label_cpoy_text_success);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.text.TextTranslateActivity$c */
    public class ViewOnClickListenerC2960c implements View.OnClickListener {
        public ViewOnClickListenerC2960c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            AudioPlayerManager.getInstance().stopAudio();
            File file = new File(TextTranslateActivity.this.getFilesDir().getAbsolutePath() + pj4.f71071b + jq9.stringToMD5(((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39375Z.getText().toString() + TextTranslateActivity.this.f19302b.getIatLanguage()) + ".mp3");
            if (file.exists() && file.length() != 0) {
                if (file.length() != 0) {
                    TextTranslateActivity.this.playFile(file);
                }
            } else {
                try {
                    TextTranslateActivity.this.showLoadingView();
                    file.createNewFile();
                    TextTranslateActivity textTranslateActivity = TextTranslateActivity.this;
                    textTranslateActivity.startTTS(((C6218gd) ((BaseActivity) textTranslateActivity).binding).f39375Z.getText().toString(), TextTranslateActivity.this.f19302b.getIatLanguage(), file.getAbsolutePath());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.text.TextTranslateActivity$d */
    public class ViewOnClickListenerC2961d implements View.OnClickListener {
        public ViewOnClickListenerC2961d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TextTranslateActivity textTranslateActivity = TextTranslateActivity.this;
            textTranslateActivity.startSelectTransActivity(((C6218gd) ((BaseActivity) textTranslateActivity).binding).f39377b.getText().toString(), ((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39378c.getText().toString(), 1, 3);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.text.TextTranslateActivity$e */
    public class ViewOnClickListenerC2962e implements View.OnClickListener {
        public ViewOnClickListenerC2962e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TextTranslateActivity.this.exchangeLanguage();
            ((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39377b.setText(TransLangUtil.getValue(TextTranslateActivity.this.getApplicationContext(), TextTranslateActivity.this.f19301a.getKeyName()));
            ((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39378c.setText(TransLangUtil.getValue(TextTranslateActivity.this.getApplicationContext(), TextTranslateActivity.this.f19302b.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.text.TextTranslateActivity$f */
    public class ViewOnClickListenerC2963f implements View.OnClickListener {
        public ViewOnClickListenerC2963f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TextTranslateActivity textTranslateActivity = TextTranslateActivity.this;
            textTranslateActivity.startSelectTransActivity(((C6218gd) ((BaseActivity) textTranslateActivity).binding).f39378c.getText().toString(), ((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39377b.getText().toString(), 2, 3);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.text.TextTranslateActivity$g */
    public class ViewOnClickListenerC2964g implements View.OnClickListener {
        public ViewOnClickListenerC2964g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39375Z.setText("");
            ((C6218gd) ((BaseActivity) TextTranslateActivity.this).binding).f39370M.setVisibility(8);
            AudioPlayerManager.getInstance().stopAudio();
        }
    }

    private static TransLanguageData getTransLanguageData(String text) {
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        return (TransLanguageData) new Gson().fromJson(text, TransLanguageData.class);
    }

    private void initLanguage(String spKeyFrom, String spKeyTo) {
        TransLanguageData transLanguageData = getTransLanguageData(vfe.getInstance().getString(spKeyFrom));
        this.f19301a = transLanguageData;
        if (transLanguageData != null) {
            initFromLanguageView(transLanguageData);
        } else {
            this.f19301a = new TransLanguageData();
            LangLau langLau = new LangLau();
            langLau.setEn("Chinese");
            langLau.setZh("中文");
            this.f19301a.setTransId(1);
            this.f19301a.setDefaultName("中文");
            this.f19301a.setSelect(true);
            this.f19301a.setVoiceName("xiaoyan");
            this.f19301a.setIatLanguage("zh-CN");
            this.f19301a.setLangKey("cn");
            this.f19301a.setKeyName("zh_name");
            this.f19301a.setUseMicTTS(true);
            vfe.getInstance().putString(spKeyFrom, TransLanguageData.toJson(this.f19301a));
            initFromLanguageView(this.f19301a);
        }
        TransLanguageData transLanguageData2 = getTransLanguageData(vfe.getInstance().getString(spKeyTo));
        this.f19302b = transLanguageData2;
        if (transLanguageData2 != null) {
            initToLanguageView(transLanguageData2);
            return;
        }
        this.f19302b = new TransLanguageData();
        LangLau langLau2 = new LangLau();
        langLau2.setEn("English");
        langLau2.setZh("英语");
        this.f19302b.setTransId(2);
        this.f19302b.setDefaultName("English");
        this.f19302b.setSelect(true);
        this.f19302b.setVoiceName("catherine");
        this.f19302b.setIatLanguage("en-US");
        this.f19302b.setLangKey(ufh.f87916c);
        this.f19302b.setKeyName("en_name");
        this.f19302b.setUseMicTTS(true);
        vfe.getInstance().putString(spKeyTo, TransLanguageData.toJson(this.f19302b));
        initToLanguageView(this.f19302b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        finish();
    }

    public void dismissLoadingView() {
        WaitingDialog waitingDialog = this.f19300C;
        if (waitingDialog != null) {
            waitingDialog.dismiss();
        }
    }

    public void exchangeLanguage() {
        this.f19301a = getTransLanguageData(vfe.getInstance().getString(this.f19303c));
        this.f19302b = getTransLanguageData(vfe.getInstance().getString(this.f19304d));
        vfe.getInstance().putString(this.f19304d, TransLanguageData.toJson(this.f19301a));
        vfe.getInstance().putString(this.f19303c, TransLanguageData.toJson(this.f19302b));
        this.f19301a = getTransLanguageData(vfe.getInstance().getString(this.f19303c));
        this.f19302b = getTransLanguageData(vfe.getInstance().getString(this.f19304d));
    }

    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        ((C6218gd) this.binding).f39377b.setText(TransLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    public void initToLanguageView(TransLanguageData toLanguageData) {
        ((C6218gd) this.binding).f39378c.setText(TransLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        ((C6218gd) this.binding).f39375Z.setMaxHeight((fre.getScreenHeight() - yrf.dp2px(250.0f)) / 2);
        ((C6218gd) this.binding).f39374Y.setMaxHeight((fre.getScreenHeight() - yrf.dp2px(250.0f)) / 2);
        ((C6218gd) this.binding).f39379d.setOnClickListener(new View.OnClickListener() { // from class: ewg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34337a.lambda$initView$0(view);
            }
        });
        ((C6218gd) this.binding).f39382m.setOnClickListener(new ViewOnClickListenerC2958a());
        ((C6218gd) this.binding).f39381f.setOnClickListener(new ViewOnClickListenerC2959b());
        ((C6218gd) this.binding).f39366C.setOnClickListener(new ViewOnClickListenerC2960c());
        ((C6218gd) this.binding).f39377b.setOnClickListener(new ViewOnClickListenerC2961d());
        ((C6218gd) this.binding).f39380e.setOnClickListener(new ViewOnClickListenerC2962e());
        ((C6218gd) this.binding).f39378c.setOnClickListener(new ViewOnClickListenerC2963f());
        ((C6218gd) this.binding).f39373X.setOnClickListener(new ViewOnClickListenerC2964g());
    }

    @Override // p000.InterfaceC12632sk.b
    public void loadAudioFail() {
        dismissLoadingView();
        ToastUtils.showShort(getString(C2531R.string.eyevue_loading_no_net_view_text_hint));
    }

    @Override // p000.InterfaceC12632sk.b
    public void loadAudioListSuccess(File responseData) {
        dismissLoadingView();
        playFile(responseData);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f19305e = new u87(this);
        this.f19307m = new p87(this);
        this.f19306f = (AudioManager) getSystemService("audio");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        AudioPlayerManager.getInstance().stopAudio();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f19303c = "woke_language_from_two_ear_news";
        this.f19304d = "woke_language_to_two_ear_news";
        initLanguage("woke_language_from_two_ear_news", "woke_language_to_two_ear_news");
    }

    public void playFile(File file) {
        AudioPlayerManager.getInstance().playAudioFile(this.f19306f, file, 1);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C6218gd getViewBinding() {
        return C6218gd.inflate(getLayoutInflater());
    }

    public void showLoadingView() {
        if (this.f19300C == null) {
            this.f19300C = new WaitingDialog(false);
        }
        this.f19300C.show(getSupportFragmentManager(), "text");
    }

    public void startSelectTransActivity(String strFrom, String strTo, int type, int actionType) {
        Intent intent = new Intent(this, (Class<?>) SelectTransActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SelectTransActivity.KEY_TITLE, strFrom);
        bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, strTo);
        bundle.putInt(SelectTransActivity.KEY_TYPE, type);
        bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, actionType);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void startTTS(String text, String language, String voicePath) {
        p87 p87Var = this.f19307m;
        if (p87Var != null) {
            p87Var.refreshData(this, text, language, voicePath);
        }
    }

    @Override // p000.InterfaceC12632sk.d
    public void transFail() {
        dismissLoadingView();
        ToastUtils.showShort(getString(C2531R.string.eyevue_loading_no_net_view_text_hint));
    }

    @Override // p000.InterfaceC12632sk.d
    public void transSuccess(String responseData, boolean hasMore, boolean isCache, boolean isRefresh, int postion) {
        dismissLoadingView();
        ((C6218gd) this.binding).f39375Z.setText(responseData);
        ((C6218gd) this.binding).f39370M.setVisibility(0);
    }
}
