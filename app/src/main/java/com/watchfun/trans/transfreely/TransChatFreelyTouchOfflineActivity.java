package com.watchfun.trans.transfreely;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.watchfun.base.BaseActivity;
import com.watchfun.trans.C4035R;
import com.watchfun.trans.database.transfreely.TransFreelyDatabase;
import com.watchfun.trans.offline.OfflineLanguageActivity;
import com.watchfun.trans.transfreely.C4137a;
import com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.base.BaseAsrActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.transcommon.widget.BottomEditView;
import com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import p000.AbstractC11416qc;
import p000.C11389q9;
import p000.aah;
import p000.axg;
import p000.bzb;
import p000.efb;
import p000.eyb;
import p000.hyb;
import p000.igg;
import p000.im4;
import p000.l3h;
import p000.l5g;
import p000.lx2;
import p000.ne4;
import p000.pj4;
import p000.rv4;
import p000.t9h;
import p000.ubb;
import p000.vfe;
import p000.wyb;
import p000.xnc;
import p000.xt5;
import p000.z9h;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class TransChatFreelyTouchOfflineActivity extends BaseAsrActivity<C11389q9, TransFreelyDatabase> implements MediaHelper.OnMediaKeyEvent, MediaNewButtonReceiver.IKeyDownListener {

    /* JADX INFO: renamed from: l2 */
    public static final String f25600l2 = "TransChatFreelyTouchActivity";

    /* JADX INFO: renamed from: m2 */
    public static final String f25601m2 = "TRANS_OFFLINE_AUTH_SUCCESS";

    /* JADX INFO: renamed from: n2 */
    public static final int f25602n2 = 100;

    /* JADX INFO: renamed from: o2 */
    public static final long f25603o2 = 500;

    /* JADX INFO: renamed from: p2 */
    public static final int f25604p2 = 10000;

    /* JADX INFO: renamed from: C */
    public int f25605C;

    /* JADX INFO: renamed from: F */
    public AbstractC11416qc<String[]> f25606F;

    /* JADX INFO: renamed from: H */
    public boolean f25607H;

    /* JADX INFO: renamed from: L */
    public TransChatFreelyTouchOfflineActivity f25608L;

    /* JADX INFO: renamed from: M */
    public String f25609M;

    /* JADX INFO: renamed from: N */
    public String f25611N;

    /* JADX INFO: renamed from: X */
    public Handler f25614X;

    /* JADX INFO: renamed from: Z1 */
    public z9h f25617Z1;

    /* JADX INFO: renamed from: a */
    public C4137a f25618a;

    /* JADX INFO: renamed from: a2 */
    public rv4 f25619a2;

    /* JADX INFO: renamed from: b */
    public t9h f25620b;

    /* JADX INFO: renamed from: b2 */
    public rv4 f25621b2;

    /* JADX INFO: renamed from: c */
    public MediaPlayer f25622c;

    /* JADX INFO: renamed from: c2 */
    public boolean f25623c2;

    /* JADX INFO: renamed from: d */
    public AudioManager f25624d;

    /* JADX INFO: renamed from: e */
    public long f25626e;

    /* JADX INFO: renamed from: e2 */
    public String f25627e2;

    /* JADX INFO: renamed from: f2 */
    public NetworkChangeReceiver f25629f2;

    /* JADX INFO: renamed from: g2 */
    public long f25630g2;

    /* JADX INFO: renamed from: h2 */
    public boolean f25631h2;

    /* JADX INFO: renamed from: j2 */
    public boolean f25633j2;

    /* JADX INFO: renamed from: k2 */
    public MediaNewButtonReceiver f25634k2;

    /* JADX INFO: renamed from: m */
    public z9h f25635m;

    /* JADX INFO: renamed from: f */
    public boolean f25628f = false;

    /* JADX INFO: renamed from: Q */
    public boolean f25612Q = false;

    /* JADX INFO: renamed from: Y */
    public int f25615Y = 0;

    /* JADX INFO: renamed from: Z */
    public final int f25616Z = 1;

    /* JADX INFO: renamed from: M1 */
    public final int f25610M1 = 2;

    /* JADX INFO: renamed from: V1 */
    public long f25613V1 = 0;

    /* JADX INFO: renamed from: d2 */
    public int f25625d2 = 0;

    /* JADX INFO: renamed from: i2 */
    public String[] f25632i2 = {xnc.f98580E, xnc.f98579D};

    public class NetworkChangeReceiver extends BroadcastReceiver {
        public NetworkChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                    ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73649V1.setVisibility(0);
                } else {
                    ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73649V1.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$a */
    public class RunnableC4122a implements Runnable {
        public RunnableC4122a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(TransChatFreelyTouchOfflineActivity.this.f25627e2) || !new File(TransChatFreelyTouchOfflineActivity.this.f25627e2).exists() || TransChatFreelyTouchOfflineActivity.this.f25635m == null) {
                return;
            }
            TransChatFreelyTouchOfflineActivity.this.f25635m.setVoicePath(TransChatFreelyTouchOfflineActivity.this.f25627e2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Log.e("yujl", "stopOfflineTrans :  showTextOfflineResult(currentMessage, startTime);");
            TransChatFreelyTouchOfflineActivity transChatFreelyTouchOfflineActivity = TransChatFreelyTouchOfflineActivity.this;
            transChatFreelyTouchOfflineActivity.showTextOfflineResult(transChatFreelyTouchOfflineActivity.f25635m, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$b */
    public class C4123b implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C4123b() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_PHONE_MODEL_TIP", isChecked);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$c */
    public class C4124c implements AudioManager.OnAudioFocusChangeListener {
        public C4124c() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$d */
    public class C4125d implements MediaPlayer.OnCompletionListener {
        public C4125d() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            TransChatFreelyTouchOfflineActivity.this.f25622c.reset();
            TransChatFreelyTouchOfflineActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$e */
    public class C4126e implements rv4.InterfaceC12313c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f25641a;

        public C4126e(final String[] val$permissions) {
            this.f25641a = val$permissions;
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onLeftClick() {
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onRightClick() {
            Arrays.asList(this.f25641a);
            if (Build.VERSION.SDK_INT >= 33 || lx2.checkSelfPermission(TransChatFreelyTouchOfflineActivity.this.f25608L, xnc.f98580E) == 0) {
                return;
            }
            ActivityCompat.requestPermissions(TransChatFreelyTouchOfflineActivity.this.f25608L, new String[]{xnc.f98580E}, 10000);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$f */
    public class C4127f implements rv4.InterfaceC12313c {
        public C4127f() {
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onLeftClick() {
            TransChatFreelyTouchOfflineActivity.this.f25621b2 = null;
        }

        @Override // p000.rv4.InterfaceC12313c
        public void onRightClick() {
            TransChatFreelyTouchOfflineActivity.this.startActivity(new Intent(TransChatFreelyTouchOfflineActivity.this.f25608L, (Class<?>) OfflineLanguageActivity.class));
            TransChatFreelyTouchOfflineActivity.this.f25621b2 = null;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$g */
    public class C4128g implements bzb.InterfaceC2119h {
        public C4128g() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void offlineResourceMissing() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onAuthResult(int code) {
            vfe.getInstance().putBoolean("TRANS_OFFLINE_AUTH_SUCCESS", true);
            if (code == 0) {
                TransChatFreelyTouchOfflineActivity.this.f25607H = true;
                bzb.getInstance().engineInit();
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeResult(String result, String s1) {
            Log.e("yujl", "onRecognizeResult isOfflineRecording : " + TransChatFreelyTouchOfflineActivity.this.f25633j2);
            Log.e("yujl", "onRecognizeResult : " + result);
            if (TransChatFreelyTouchOfflineActivity.this.f25635m == null) {
                TransChatFreelyTouchOfflineActivity.this.f25635m = new z9h();
            }
            TransChatFreelyTouchOfflineActivity.this.f25635m.setType(((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).type);
            TransChatFreelyTouchOfflineActivity.this.f25635m.setResult(result);
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeVadTimeOut() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTranslateResult(String result, String s1) {
            Log.e("yujl", "onTranslateResult isOfflineRecording : " + TransChatFreelyTouchOfflineActivity.this.f25633j2);
            Log.e("yujl", "onTranslateResult : " + result);
            if (TransChatFreelyTouchOfflineActivity.this.f25635m != null) {
                TransChatFreelyTouchOfflineActivity.this.f25635m.setTransResult(result);
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsConvertMp3Finish(String s) {
            Log.e("yujl", "onTtsConvertMp3Finish : " + s);
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsResult(String result) {
            Log.e("yujl", "onTtsResult isOfflineRecording : " + TransChatFreelyTouchOfflineActivity.this.f25633j2);
            Log.e("yujl", "onTtsResult : " + result);
            TransChatFreelyTouchOfflineActivity.this.f25627e2 = result;
            if (TextUtils.isEmpty(result) || TransChatFreelyTouchOfflineActivity.this.f25635m == null || TransChatFreelyTouchOfflineActivity.this.f25612Q) {
                return;
            }
            TransChatFreelyTouchOfflineActivity.this.f25635m.setVoicePath(result);
            System.currentTimeMillis();
            Log.e("yujl", "showTextOfflineResult : ");
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$h */
    public class ViewOnClickListenerC4129h implements View.OnClickListener {
        public ViewOnClickListenerC4129h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyTouchOfflineActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$i */
    public class ViewOnClickListenerC4130i implements View.OnClickListener {
        public ViewOnClickListenerC4130i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyTouchOfflineActivity.this.f25625d2 = -1;
            TransChatFreelyTouchOfflineActivity transChatFreelyTouchOfflineActivity = TransChatFreelyTouchOfflineActivity.this;
            transChatFreelyTouchOfflineActivity.startSelectTransActivity(((C11389q9) ((BaseActivity) transChatFreelyTouchOfflineActivity).binding).f73662e.getText().toString(), ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73642F.getText().toString(), 1, TransActionEnumMode.TRANSLATOR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$j */
    public class ViewOnClickListenerC4131j implements View.OnClickListener {
        public ViewOnClickListenerC4131j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyTouchOfflineActivity.this.isAsring()) {
                return;
            }
            TransChatFreelyTouchOfflineActivity.this.exchangeLanguage();
            ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73662e.setText(AiLangUtil.getValue(TransChatFreelyTouchOfflineActivity.this.f25608L, ((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).fromLanguageData.getKeyName()));
            ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73665m.setText(AiLangUtil.getValue(TransChatFreelyTouchOfflineActivity.this.f25608L, ((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).fromLanguageData.getKeyName()));
            ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73660d.setText(AiLangUtil.getValue(TransChatFreelyTouchOfflineActivity.this.f25608L, ((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).toLanguageData.getKeyName()));
            ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73642F.setText(AiLangUtil.getValue(TransChatFreelyTouchOfflineActivity.this.f25608L, ((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).toLanguageData.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$k */
    public class ViewOnClickListenerC4132k implements View.OnClickListener {
        public ViewOnClickListenerC4132k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyTouchOfflineActivity.this.f25625d2 = -1;
            TransChatFreelyTouchOfflineActivity transChatFreelyTouchOfflineActivity = TransChatFreelyTouchOfflineActivity.this;
            transChatFreelyTouchOfflineActivity.startSelectTransActivity(((C11389q9) ((BaseActivity) transChatFreelyTouchOfflineActivity).binding).f73642F.getText().toString(), ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73662e.getText().toString(), 2, TransActionEnumMode.TRANSLATOR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$l */
    public class ViewOnTouchListenerC4133l implements View.OnTouchListener {
        public ViewOnTouchListenerC4133l() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1 && action != 3) {
                    return false;
                }
                Log.e("yujl", "ACTION_UP ACTION_CANCEL:");
                if (TransChatFreelyTouchOfflineActivity.this.f25614X != null) {
                    TransChatFreelyTouchOfflineActivity.this.f25614X.removeCallbacksAndMessages(null);
                }
                TransChatFreelyTouchOfflineActivity.this.f25633j2 = false;
                if (ubb.isNetworkAvailable(TransChatFreelyTouchOfflineActivity.this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                    TransChatFreelyTouchOfflineActivity.this.voiceViewGone();
                } else {
                    TransChatFreelyTouchOfflineActivity.this.f25633j2 = false;
                    bzb.getInstance().recognizeStopRecord();
                    TransChatFreelyTouchOfflineActivity.this.stopOfflineTrans();
                    TransChatFreelyTouchOfflineActivity.this.f25630g2 = System.currentTimeMillis();
                }
                return true;
            }
            Log.e("yujl", "ACTION_DOWN ACTION_DOWN:");
            if (!TransChatFreelyTouchOfflineActivity.this.checkAndRequestPermissions()) {
                return true;
            }
            if (TransChatFreelyTouchOfflineActivity.this.f25614X != null) {
                TransChatFreelyTouchOfflineActivity.this.f25614X.removeCallbacksAndMessages(null);
            }
            if (ubb.isNetworkAvailable(TransChatFreelyTouchOfflineActivity.this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                TransChatFreelyTouchOfflineActivity.this.gptRightVoice();
                return true;
            }
            if (!TransChatFreelyTouchOfflineActivity.this.checkAndRequestOfflinePermissions()) {
                return true;
            }
            TransChatFreelyTouchOfflineActivity transChatFreelyTouchOfflineActivity = TransChatFreelyTouchOfflineActivity.this;
            if (!transChatFreelyTouchOfflineActivity.isOfflineStartTooFast(transChatFreelyTouchOfflineActivity.f25630g2) && TransChatFreelyTouchOfflineActivity.this.checkOfflineResource()) {
                TransChatFreelyTouchOfflineActivity.this.f25615Y = 2;
                TransChatFreelyTouchOfflineActivity.this.f25631h2 = true;
                if (TransChatFreelyTouchOfflineActivity.this.f25625d2 != 2) {
                    TransChatFreelyTouchOfflineActivity.this.f25625d2 = 2;
                    hyb hybVarFromCode = hyb.fromCode(((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).fromLanguageData.getKeyName());
                    bzb.getInstance().setLanguage(hyb.fromCode(((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).toLanguageData.getKeyName()).getOfflineLanguageType(), hybVarFromCode.getOfflineLanguageType());
                }
                TransChatFreelyTouchOfflineActivity.this.useOfflineTrans();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$m */
    public class ViewOnTouchListenerC4134m implements View.OnTouchListener {
        public ViewOnTouchListenerC4134m() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1 && action != 3) {
                    return false;
                }
                Log.e("yujl", "ACTION_UP ACTION_CANCEL:");
                if (TransChatFreelyTouchOfflineActivity.this.f25614X != null) {
                    TransChatFreelyTouchOfflineActivity.this.f25614X.removeCallbacksAndMessages(null);
                }
                if (ubb.isNetworkAvailable(TransChatFreelyTouchOfflineActivity.this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                    TransChatFreelyTouchOfflineActivity.this.voiceViewGone();
                } else {
                    TransChatFreelyTouchOfflineActivity.this.f25612Q = false;
                    TransChatFreelyTouchOfflineActivity.this.f25633j2 = false;
                    bzb.getInstance().recognizeStopRecord();
                    TransChatFreelyTouchOfflineActivity.this.stopOfflineTrans();
                    TransChatFreelyTouchOfflineActivity.this.f25630g2 = System.currentTimeMillis();
                }
                return true;
            }
            Log.e("yujl", "ACTION_DOWN ACTION_DOWN:");
            if (!TransChatFreelyTouchOfflineActivity.this.checkAndRequestPermissions()) {
                return true;
            }
            if (TransChatFreelyTouchOfflineActivity.this.f25614X != null) {
                TransChatFreelyTouchOfflineActivity.this.f25614X.removeCallbacksAndMessages(null);
            }
            if (ubb.isNetworkAvailable(TransChatFreelyTouchOfflineActivity.this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                TransChatFreelyTouchOfflineActivity.this.gptPhoneVoice();
            } else {
                if (!TransChatFreelyTouchOfflineActivity.this.checkAndRequestOfflinePermissions()) {
                    return true;
                }
                TransChatFreelyTouchOfflineActivity transChatFreelyTouchOfflineActivity = TransChatFreelyTouchOfflineActivity.this;
                if (!transChatFreelyTouchOfflineActivity.isOfflineStartTooFast(transChatFreelyTouchOfflineActivity.f25630g2) && TransChatFreelyTouchOfflineActivity.this.checkOfflineResource()) {
                    TransChatFreelyTouchOfflineActivity.this.f25615Y = 1;
                    TransChatFreelyTouchOfflineActivity.this.f25631h2 = true;
                    if (TransChatFreelyTouchOfflineActivity.this.f25625d2 != 1) {
                        TransChatFreelyTouchOfflineActivity.this.f25625d2 = 1;
                        bzb.getInstance().setLanguage(hyb.fromCode(((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).fromLanguageData.getKeyName()).getOfflineLanguageType(), hyb.fromCode(((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).toLanguageData.getKeyName()).getOfflineLanguageType());
                    }
                    TransChatFreelyTouchOfflineActivity.this.useOfflineTrans();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$n */
    public class C4135n implements C4137a.g {

        /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$n$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f25652a;

            public a(final View val$v) {
                this.f25652a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25652a.setScaleX(1.0f);
                this.f25652a.setScaleY(1.0f);
            }
        }

        public C4135n() {
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void click(boolean isSelect) {
            TransChatFreelyTouchOfflineActivity.this.f25628f = isSelect;
            ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73658c.setViewSelected(TransChatFreelyTouchOfflineActivity.this.f25628f);
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void onItemChatPlayVoice(View v, int postion, z9h xfAiMessage) {
            if (TransChatFreelyTouchOfflineActivity.this.isFastClick(1500L)) {
                return;
            }
            ((BaseAsrActivity) TransChatFreelyTouchOfflineActivity.this).type = xfAiMessage.getType();
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
            if (!TextUtils.isEmpty(xfAiMessage.getVoicePath())) {
                if (!xt5.isFileExists(xfAiMessage.getVoicePath())) {
                    TransChatFreelyTouchOfflineActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), xfAiMessage.getVoicePath());
                    return;
                } else if (!xfAiMessage.getVoicePath().endsWith(".pcm")) {
                    TransChatFreelyTouchOfflineActivity.this.playFile(xt5.getFileByPath(xfAiMessage.getVoicePath()));
                    return;
                } else {
                    AudioPlayerManager.getInstance().stopAudio();
                    bzb.getInstance().playPcm(xfAiMessage.getVoicePath());
                    return;
                }
            }
            String str = TranslateWebSocketManager.getInstance().getOutputPath() + pj4.f71071b + System.currentTimeMillis() + ".mp3";
            TransChatFreelyTouchOfflineActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), str);
            xfAiMessage.setVoicePath(str);
            TransChatFreelyTouchOfflineActivity.this.f25618a.updateChangedItemBean(xfAiMessage, postion);
            TransChatFreelyTouchOfflineActivity.this.f25620b.updateVoicePathById(xfAiMessage.getId(), str);
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void onItemLongClick(View v, int postion, z9h xfAiMessage, boolean isEditMode) {
            ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73658c.setEditMode(isEditMode);
            TransChatFreelyTouchOfflineActivity.this.updateRecyclerViewBottomMargin(isEditMode);
            ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73643H.setVisibility(isEditMode ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchOfflineActivity$o */
    public class C4136o implements BottomEditView.OnEditClickListener {
        public C4136o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<z9h> it = TransChatFreelyTouchOfflineActivity.this.f25620b.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TransChatFreelyTouchOfflineActivity.this.f25620b.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TransChatFreelyTouchOfflineActivity.this.f25618a.setEditMode(false);
            TransChatFreelyTouchOfflineActivity.this.updateRecyclerViewBottomMargin(false);
            ((C11389q9) ((BaseActivity) TransChatFreelyTouchOfflineActivity.this).binding).f73643H.setVisibility(0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: s9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81019a.lambda$onDelete$0();
                    }
                });
            } else {
                for (z9h z9hVar : TransChatFreelyTouchOfflineActivity.this.f25618a.getSelectData()) {
                    TransChatFreelyTouchOfflineActivity.this.f25620b.deleteSelectData(z9hVar.getMessageTime());
                    xt5.delete(z9hVar.getVoicePath());
                }
            }
            TransChatFreelyTouchOfflineActivity.this.f25618a.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TransChatFreelyTouchOfflineActivity.this.f25618a.setAllSelectState(isAllSelect);
        }
    }

    private void audioStopMusic() {
        this.f25624d = (AudioManager) getSystemService("audio");
        this.f25624d.requestAudioFocus(new C4124c(), 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkAndRequestOfflinePermissions() {
        if (Build.VERSION.SDK_INT >= 33 || l5g.hasPermissions(this.f25608L, this.f25632i2)) {
            return true;
        }
        showPermissionReqDialog(this.f25632i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkOfflineResource() {
        return isOfflineResExist(this.fromLanguageData) && isOfflineResExist(this.toLanguageData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptPhoneVoice() {
        this.type = this.phoneType;
        showGptVoice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptRightVoice() {
        this.type = this.earType;
        showGptVoice();
        zi9.m26850d("TransChatFreelyTouchActivity", "data.getIatLanguage() =" + this.toLanguageData.getIatLanguage());
    }

    private void handlePresse(boolean isLeft, boolean isPressed) {
        if (isLeft) {
            if (!isPressed) {
                Log.e("yujl", "ACTION_UP ACTION_CANCEL:");
                Handler handler = this.f25614X;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (ubb.isNetworkAvailable(this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                    voiceViewGone();
                    return;
                }
                this.f25612Q = false;
                this.f25633j2 = false;
                bzb.getInstance().recognizeStopRecord();
                stopOfflineTrans();
                this.f25630g2 = System.currentTimeMillis();
                return;
            }
            Log.e("yujl", "ACTION_DOWN ACTION_DOWN:");
            if (checkAndRequestPermissions()) {
                Handler handler2 = this.f25614X;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                if (ubb.isNetworkAvailable(this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                    gptPhoneVoice();
                    return;
                }
                if (checkAndRequestOfflinePermissions() && !isOfflineStartTooFast(this.f25630g2) && checkOfflineResource()) {
                    this.f25615Y = 1;
                    this.f25631h2 = true;
                    if (this.f25625d2 != 1) {
                        this.f25625d2 = 1;
                        bzb.getInstance().setLanguage(hyb.fromCode(this.fromLanguageData.getKeyName()).getOfflineLanguageType(), hyb.fromCode(this.toLanguageData.getKeyName()).getOfflineLanguageType());
                    }
                    useOfflineTrans();
                    return;
                }
                return;
            }
            return;
        }
        if (!isPressed) {
            Log.e("yujl", "ACTION_UP ACTION_CANCEL:");
            Handler handler3 = this.f25614X;
            if (handler3 != null) {
                handler3.removeCallbacksAndMessages(null);
            }
            this.f25633j2 = false;
            if (ubb.isNetworkAvailable(this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                voiceViewGone();
                return;
            }
            this.f25633j2 = false;
            bzb.getInstance().recognizeStopRecord();
            stopOfflineTrans();
            this.f25630g2 = System.currentTimeMillis();
            return;
        }
        Log.e("yujl", "ACTION_DOWN ACTION_DOWN:");
        if (checkAndRequestPermissions()) {
            Handler handler4 = this.f25614X;
            if (handler4 != null) {
                handler4.removeCallbacksAndMessages(null);
            }
            if (ubb.isNetworkAvailable(this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                gptRightVoice();
                return;
            }
            if (checkAndRequestOfflinePermissions() && !isOfflineStartTooFast(this.f25630g2) && checkOfflineResource()) {
                this.f25615Y = 2;
                this.f25631h2 = true;
                if (this.f25625d2 != 2) {
                    this.f25625d2 = 2;
                    hyb hybVarFromCode = hyb.fromCode(this.fromLanguageData.getKeyName());
                    bzb.getInstance().setLanguage(hyb.fromCode(this.toLanguageData.getKeyName()).getOfflineLanguageType(), hybVarFromCode.getOfflineLanguageType());
                }
                useOfflineTrans();
            }
        }
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: q9h
            @Override // java.lang.Runnable
            public final void run() {
                this.f73701a.lambda$hideVoiceView$0();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25622c = mediaPlayer;
        mediaPlayer.reset();
    }

    private void initOffLineTrans() {
        if (eyb.getInstance().isSupportOfflineTranslation()) {
            im4.getInstance().init(this);
            if (Build.VERSION.SDK_INT >= 33) {
                if (bzb.getInstance().getAuthResult() != 0) {
                    bzb.getInstance().initSDK(this.f25608L);
                } else {
                    this.f25607H = true;
                }
            } else if (l5g.hasPermissions(this.f25608L, this.f25632i2)) {
                if (bzb.getInstance().getAuthResult() != 0) {
                    bzb.getInstance().initSDK(this.f25608L);
                } else {
                    this.f25607H = true;
                }
            }
            bzb.getInstance().setOfflineSdkListener(new C4128g());
        }
    }

    private void initReceiver() {
        if (ubb.isNetworkAvailable(this.f25608L)) {
            ((C11389q9) this.binding).f73649V1.setVisibility(8);
        } else {
            ((C11389q9) this.binding).f73649V1.setVisibility(0);
        }
        this.f25629f2 = new NetworkChangeReceiver();
        registerReceiver(this.f25629f2, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        setNeedUseOfflineMode(true);
        ((C11389q9) this.binding).f73656b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25618a = new C4137a(this, ((C11389q9) this.binding).f73656b, this.f25620b);
        List<z9h> latestTen = this.f25620b.getLatestTen();
        if (AppUtils.isEmpty(latestTen)) {
            ((C11389q9) this.binding).f73645M.setVisibility(0);
        } else {
            ((C11389q9) this.binding).f73645M.setVisibility(8);
            Collections.reverse(latestTen);
            this.f25618a.setData(latestTen);
            ((C11389q9) this.binding).f73656b.scrollToPosition(this.f25618a.getItemCount() - 1);
        }
        ((C11389q9) this.binding).f73656b.setAdapter(this.f25618a);
        ((C11389q9) this.binding).f73656b.setItemAnimator(null);
        ((C11389q9) this.binding).f73646M1.setOnClickListener(new ViewOnClickListenerC4129h());
        ((C11389q9) this.binding).f73662e.setOnClickListener(new ViewOnClickListenerC4130i());
        ((C11389q9) this.binding).f73650X.setOnClickListener(new ViewOnClickListenerC4131j());
        ((C11389q9) this.binding).f73642F.setOnClickListener(new ViewOnClickListenerC4132k());
        ((C11389q9) this.binding).f73641C.setOnTouchListener(new ViewOnTouchListenerC4133l());
        ((C11389q9) this.binding).f73664f.setOnTouchListener(new ViewOnTouchListenerC4134m());
        this.f25618a.setItemClickListener(new C4135n());
        ((C11389q9) this.binding).f73658c.setOnEditClickListener(new C4136o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFastClick(long clickDelay) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f25613V1 < clickDelay) {
            return true;
        }
        this.f25630g2 = System.currentTimeMillis();
        this.f25613V1 = jCurrentTimeMillis;
        return false;
    }

    private boolean isOfflineResExist(TransLanguageData transLanguageData) {
        hyb hybVarFromCode = hyb.fromCode(transLanguageData.getKeyName());
        if (hybVarFromCode != null) {
            int iCheckOfflineResource = wyb.checkOfflineResource(hybVarFromCode.getOfflineLanguageType());
            if (iCheckOfflineResource == 0) {
                showDownloadDialog(String.format(getString(C4035R.string.language_resource_not_download), this.f25608L.getResources().getString(hybVarFromCode.getLanguageId())));
                return false;
            }
            if (iCheckOfflineResource == 1) {
                return true;
            }
            if (iCheckOfflineResource == 2) {
                showDownloadDialog(getString(C4035R.string.base_resource_not_download));
                return false;
            }
        } else {
            ToastUtils.showShort(getString(C4035R.string.language_resource_not_support) + AiLangUtil.getValue(this.f25608L, transLanguageData.getKeyName()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOfflineStartTooFast(long offlineLastStopTime) {
        if (System.currentTimeMillis() - offlineLastStopTime < 400) {
            return true;
        }
        this.f25630g2 = System.currentTimeMillis();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$0() {
        this.f25626e = System.currentTimeMillis();
        if (((C11389q9) this.binding).f73663e2.getVisibility() == 0) {
            ((C11389q9) this.binding).f73663e2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$2(MediaPlayer mediaPlayer) {
        this.f25622c.start();
        zi9.m26850d("TransChatFreelyTouchActivity", "setupMediaPlayer -------222------");
        if (this.f25634k2 == null) {
            this.f25634k2 = new MediaNewButtonReceiver(this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$1(ArrayList arrayList, long j, int i) {
        return ((aah) arrayList.get(i)).getXfTransFreelyMessage().getMessageTime() == j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playFile(File file) {
        zi9.m26850d("TransChatFreelyTouchActivity", "playFile-----------------isAsring--- " + isAsring());
        if (isAsring()) {
            return;
        }
        bzb.getInstance().stopPcmPlay();
        this.type = this.phoneType;
        AudioPlayerManager.getInstance().playAudioFile(this.f25624d, file, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            zi9.m26850d("TransChatFreelyTouchActivity", "setupMediaPlayer");
            this.f25622c.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25622c.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f25622c.prepare();
            zi9.m26850d("TransChatFreelyTouchActivity", "setupMediaPlayer -------------");
            sendPauseKeyEvent(this.f25624d);
            this.f25622c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: p9h
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f70128a.lambda$setupMediaPlayer$2(mediaPlayer);
                }
            });
            this.f25622c.setOnCompletionListener(new C4125d());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 2, 2, new C4123b()).show();
    }

    private void showDownloadDialog(String text) {
        if (this.f25621b2 == null) {
            this.f25621b2 = new rv4(this);
        }
        this.f25621b2.setMessage(text).setLeftButtonText(getString(C4201R.string.cancel)).setRightButtonText(getString(C4201R.string.confirm));
        this.f25621b2.setOnDialogClickListener(new C4127f());
        this.f25621b2.show();
    }

    private void showGptVoice() {
        showRecordingUI();
        zi9.m26850d("TransChatFreelyTouchActivity", "showGptVoice-------------------- ");
        AudioPlayerManager.getInstance().stopAudio();
        if (this.type == this.phoneType) {
            TranslateWebSocketManager.getInstance().startNormalAsrVad(this.fromLanguageData.getIatLanguage(), this.toLanguageData.getIatLanguage(), 86400000L, false, "");
        } else {
            TranslateWebSocketManager.getInstance().startNormalAsrVad(this.toLanguageData.getIatLanguage(), this.fromLanguageData.getIatLanguage(), 86400000L, false, "");
        }
    }

    private void showPermissionReqDialog(String[] permissions2) {
        this.f25619a2 = new rv4(this);
        this.f25619a2.setMessage(getString(C4035R.string.permission_download_language)).setLeftButtonText(getString(C4201R.string.cancel)).setRightButtonText(getString(C4201R.string.confirm));
        this.f25619a2.setOnDialogClickListener(new C4126e(permissions2));
        this.f25619a2.show();
    }

    private void showRecordingUI() {
        ((C11389q9) this.binding).f73663e2.setVisibility(0);
        ((C11389q9) this.binding).f73656b.scrollToPosition(this.f25618a.getItemCount() - 1);
        if (!isDestroyed() && !isFinishing()) {
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.ic_volume_white)).diskCacheStrategy(ne4.f64120d).into(((C11389q9) this.binding).f73652Z);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.ic_volume_white)).diskCacheStrategy(ne4.f64120d).into(((C11389q9) this.binding).f73652Z);
            }
        }
        ((C11389q9) this.binding).f73645M.setVisibility(8);
    }

    private void showTextGPTResult(String text, String translateString, String mp3Filepath, String startTimeId, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        final long j = Long.parseLong(startTimeId);
        final ArrayList<aah> data = this.f25618a.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: r9h
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return TransChatFreelyTouchOfflineActivity.lambda$showTextGPTResult$1(data, j, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent()) {
            int asInt = optionalIntFindFirst.getAsInt();
            z9h xfTransFreelyMessage = data.get(asInt).getXfTransFreelyMessage();
            xfTransFreelyMessage.setResult(text);
            xfTransFreelyMessage.setTransResult(translateString);
            this.f25618a.updateMessage(xfTransFreelyMessage, asInt);
            this.f25620b.updateTransResultByMessageTime(j, text, translateString);
            ((C11389q9) this.binding).f73656b.scrollToPosition(this.f25618a.getItemCount() - 1);
            return;
        }
        z9h z9hVar = new z9h();
        z9hVar.setMessageTime(j);
        z9hVar.setPause(false);
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            z9hVar.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            z9hVar.setIsGptOrXF(3);
        } else {
            z9hVar.setIsGptOrXF(1);
        }
        z9hVar.setType(this.type);
        z9hVar.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        z9hVar.setResult(text);
        z9hVar.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            z9hVar.setVoicePath(mp3Filepath);
        }
        this.f25618a.addData(z9hVar);
        ((C11389q9) this.binding).f73656b.scrollToPosition(this.f25618a.getItemCount() - 1);
        this.f25620b.insert(z9hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTextOfflineResult(z9h message, long startTimeId) {
        if (TextUtils.isEmpty(message.getResult()) || message.getResult().equals("null")) {
            return;
        }
        z9h z9hVar = new z9h();
        z9hVar.setMessageTime(startTimeId);
        z9hVar.setPause(false);
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            z9hVar.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            z9hVar.setIsGptOrXF(3);
        } else {
            z9hVar.setIsGptOrXF(1);
        }
        z9hVar.setType(this.f25615Y);
        z9hVar.setIsLangCode((this.f25615Y == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        z9hVar.setResult(message.getResult());
        z9hVar.setTransResult(message.getTransResult());
        if (!TextUtils.isEmpty(message.getVoicePath())) {
            z9hVar.setVoicePath(message.getVoicePath());
        }
        this.f25618a.addData(z9hVar);
        ((C11389q9) this.binding).f73656b.scrollToPosition(this.f25618a.getItemCount() - 1);
        this.f25620b.insert(z9hVar);
        Log.e("yujl", "messageDao.insert(msg); :  messageDao.insert(msg);");
        this.f25635m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopOfflineTrans() {
        this.f25612Q = false;
        hideVoiceView();
        this.f25614X.postDelayed(new RunnableC4122a(), 600L);
    }

    private void stopRecognizerAndRecord() {
        MediaNewButtonReceiver mediaNewButtonReceiver = this.f25634k2;
        if (mediaNewButtonReceiver != null) {
            mediaNewButtonReceiver.release();
            this.f25634k2 = null;
        }
        AudioManager audioManager = this.f25624d;
        if (audioManager != null) {
            audioManager.setMode(0);
            this.f25624d.setSpeakerphoneOn(false);
        }
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewBottomMargin(boolean isEditMode) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((C11389q9) this.binding).f73656b.getLayoutParams();
        layoutParams.bottomMargin = isEditMode ? (int) TypedValue.applyDimension(1, 90.0f, getResources().getDisplayMetrics()) : 0;
        ((C11389q9) this.binding).f73656b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void useOfflineTrans() {
        if (!vfe.getInstance().getBoolean("TRANS_OFFLINE_AUTH_SUCCESS", false)) {
            l3h.showToastShort(getString(C4035R.string.sdk_not_auth));
            return;
        }
        if (!this.f25607H) {
            l3h.showToastShort(getString(C4035R.string.sdk_not_init));
            return;
        }
        this.f25612Q = true;
        this.f25627e2 = "";
        showRecordingUI();
        Handler handler = this.f25614X;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f25633j2 = true;
        bzb.getInstance().recognizeStartRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        hideVoiceView();
        stopAsr();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90927T;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90925S;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C11389q9) this.binding).f73662e.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        ((C11389q9) this.binding).f73665m.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C11389q9) this.binding).f73642F.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
        ((C11389q9) this.binding).f73660d.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        this.f25608L = this;
        super.initView();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25620b = ((TransFreelyDatabase) this.database).messageDao();
        initUI();
        startAsrSocket();
        initReceiver();
        initOffLineTrans();
        this.f25614X = new Handler();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
        zi9.m26850d("TransChatFreelyTouchActivity", "responseData =" + responseData.getPath());
        MediaPlayer mediaPlayer = this.f25622c;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        playFile(responseData);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onAsrResultContinuous(String result, String transContent, String mp3Filepath, String startTimeId, boolean isFinal) {
        super.onAsrResultContinuous(result, transContent, mp3Filepath, startTimeId, isFinal);
        showTextGPTResult(result, transContent, mp3Filepath, startTimeId, isFinal);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopRecognizerAndRecord();
        NetworkChangeReceiver networkChangeReceiver = this.f25629f2;
        if (networkChangeReceiver != null) {
            unregisterReceiver(networkChangeReceiver);
        }
        bzb.getInstance().stopPcmPlay();
    }

    @Override // com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver.IKeyDownListener
    public void onKeyDown(int keyAction) {
        if (keyAction == 87) {
            if (ubb.isNetworkAvailable(this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
                if (TranslateWebSocketManager.getInstance().isAsring()) {
                    handlePresse(false, false);
                    return;
                } else {
                    handlePresse(false, true);
                    return;
                }
            }
            if (bzb.getInstance().isRecordStart()) {
                handlePresse(false, false);
                return;
            } else {
                handlePresse(false, true);
                return;
            }
        }
        if (keyAction != 88) {
            return;
        }
        if (ubb.isNetworkAvailable(this.f25608L) || !eyb.getInstance().isSupportOfflineTranslation()) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                handlePresse(true, false);
                return;
            } else {
                handlePresse(true, true);
                return;
            }
        }
        if (bzb.getInstance().isRecordStart()) {
            handlePresse(true, false);
        } else {
            handlePresse(true, true);
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        voiceViewGone();
        if (isFinishing()) {
            stopAsrSocket();
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        if (Build.VERSION.SDK_INT >= 33 || requestCode != 10000) {
            return;
        }
        for (int i : grantResults) {
            if (i != 0) {
                l3h.showToastShort(this, C4035R.string.file_permission_denied);
                return;
            }
        }
        if (bzb.getInstance().getAuthResult() != 0) {
            bzb.getInstance().initSDK(this.f25608L);
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, android.app.Activity
    public void onRestart() {
        super.onRestart();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        stopRecognizerAndRecord();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onStopAsrView() {
        super.onStopAsrView();
        hideVoiceView();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onTtsFile(File file) {
        super.onTtsFile(file);
        playFile(file);
    }

    public void stopPlayback() {
        zi9.m26850d("TransChatFreelyTouchActivity", "stopPlayback--------------------- =");
        MediaPlayer mediaPlayer = this.f25622c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25622c = null;
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public TransFreelyDatabase getDatabase() {
        return TransFreelyDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public C11389q9 getViewBinding() {
        return C11389q9.inflate(getLayoutInflater());
    }

    private boolean isFastClick() {
        return isFastClick(500L);
    }
}
