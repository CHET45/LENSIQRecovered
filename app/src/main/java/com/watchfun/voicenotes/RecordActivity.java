package com.watchfun.voicenotes;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.blankj.utilcode.util.C2473f;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.translatemodule.BaseWebSocketManager;
import com.watchfun.translatemodule.VoiceWebSocketManager;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import com.watchfun.voicenotes.manager.voicenotes.RecordingService;
import com.watchfun.voicenotes.widget.DialogRecordFragment;
import com.watchfun.voicenotes.widget.DialogRecordHintFragment;
import com.watchfun.voicenotes.widget.DialogRecordStopFragment;
import java.io.File;
import java.util.Locale;
import java.util.Random;
import p000.C15021xb;
import p000.C9389ml;
import p000.DialogC5869fl;
import p000.efb;
import p000.iac;
import p000.igg;
import p000.jk5;
import p000.l3h;
import p000.pb9;
import p000.qd0;
import p000.qxb;
import p000.s2c;
import p000.vfe;
import p000.x4f;
import pl.droidsonroids.gif.C11006b;

/* JADX INFO: loaded from: classes7.dex */
public class RecordActivity extends BaseActivity<C15021xb> {

    /* JADX INFO: renamed from: f2 */
    public static final String f26232f2 = "isAutoStart";

    /* JADX INFO: renamed from: g2 */
    public static final String f26233g2 = "isBackSave";

    /* JADX INFO: renamed from: L */
    public String f26237L;

    /* JADX INFO: renamed from: M */
    public String f26238M;

    /* JADX INFO: renamed from: M1 */
    public boolean f26239M1;

    /* JADX INFO: renamed from: N */
    public VoiceNotesDao f26240N;

    /* JADX INFO: renamed from: Q */
    public C11006b f26241Q;

    /* JADX INFO: renamed from: V1 */
    public String f26242V1;

    /* JADX INFO: renamed from: X */
    public boolean f26243X;

    /* JADX INFO: renamed from: Y */
    public String f26244Y;

    /* JADX INFO: renamed from: Z */
    public String f26245Z;

    /* JADX INFO: renamed from: Z1 */
    public PowerManager.WakeLock f26246Z1;

    /* JADX INFO: renamed from: a */
    public boolean f26247a;

    /* JADX INFO: renamed from: a2 */
    public long f26248a2;

    /* JADX INFO: renamed from: b */
    public boolean f26249b;

    /* JADX INFO: renamed from: e2 */
    public DialogC5869fl f26256e2;

    /* JADX INFO: renamed from: f */
    public long f26257f;

    /* JADX INFO: renamed from: c */
    public boolean f26251c = true;

    /* JADX INFO: renamed from: d */
    public final long f26253d = 10800;

    /* JADX INFO: renamed from: e */
    public final long f26255e = 1000;

    /* JADX INFO: renamed from: m */
    public boolean f26258m = false;

    /* JADX INFO: renamed from: C */
    public StringBuilder f26234C = new StringBuilder();

    /* JADX INFO: renamed from: F */
    public final int f26235F = 103;

    /* JADX INFO: renamed from: H */
    public final int f26236H = 101;

    /* JADX INFO: renamed from: b2 */
    public Handler f26250b2 = new Handler(new C4298a());

    /* JADX INFO: renamed from: c2 */
    public Runnable f26252c2 = new RunnableC4303f();

    /* JADX INFO: renamed from: d2 */
    public final BaseWebSocketManager.AsrDataListener f26254d2 = new C4306i();

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$a */
    public class C4298a implements Handler.Callback {

        /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$a$a */
        public class a implements s2c {
            public a() {
            }

            @Override // p000.s2c
            public void onKeyEvent(int i) {
                if (i == 1) {
                    RecordActivity.this.saveRecord();
                }
            }
        }

        public C4298a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@efb Message message) {
            int i = message.what;
            if (i == 101) {
                RecordActivity recordActivity = RecordActivity.this;
                if (recordActivity.f26258m) {
                    recordActivity.f26257f++;
                    ((C15021xb) ((BaseActivity) recordActivity).binding).f97392C.setImageResource(C4201R.drawable.ic_record_mic_status_doing);
                    long j = RecordActivity.this.f26257f;
                    ((C15021xb) ((BaseActivity) RecordActivity.this).binding).f97398Q.setText(String.format(Locale.ENGLISH, "%02d:%02d:%02d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60)));
                    ((C15021xb) ((BaseActivity) RecordActivity.this).binding).f97398Q.setTextColor(RecordActivity.this.getResources().getColor(C4201R.color.record_time_color));
                    RecordActivity recordActivity2 = RecordActivity.this;
                    if (recordActivity2.f26257f >= 10800) {
                        recordActivity2.f26258m = false;
                        recordActivity2.stopView();
                        pb9.get("record_action").post(jk5.f51004j);
                        if (RecordActivity.this.f26250b2 != null) {
                            RecordActivity.this.f26250b2.removeMessages(101);
                            RecordActivity.this.f26250b2.removeMessages(103);
                        }
                        DialogRecordHintFragment dialogRecordHintFragment = new DialogRecordHintFragment();
                        RecordActivity.this.showDialogFragment(dialogRecordHintFragment);
                        dialogRecordHintFragment.setOnEventDialog(new a());
                    } else if (recordActivity2.f26250b2 != null) {
                        RecordActivity.this.f26250b2.sendEmptyMessageDelayed(101, 1000L);
                    }
                }
            } else if (i == 103) {
                new Random().nextInt(120);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$b */
    public class ViewOnClickListenerC4299b implements View.OnClickListener {

        /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$b$a */
        public class a implements s2c {
            public a() {
            }

            @Override // p000.s2c
            public void onKeyEvent(int i) {
                if (i == 1) {
                    RecordActivity.this.saveRecord();
                }
            }
        }

        /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$b$b */
        public class b implements s2c {
            public b() {
            }

            @Override // p000.s2c
            public void onKeyEvent(int i) {
                if (i == 1) {
                    RecordActivity.this.finish();
                }
            }
        }

        public ViewOnClickListenerC4299b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordActivity recordActivity = RecordActivity.this;
            if (recordActivity.f26257f == 0) {
                recordActivity.finish();
                return;
            }
            if (recordActivity.f26249b) {
                DialogRecordFragment dialogRecordFragment = new DialogRecordFragment();
                RecordActivity.this.showDialogFragment(dialogRecordFragment);
                dialogRecordFragment.setOnEventDialog(new a());
            } else {
                DialogRecordStopFragment dialogRecordStopFragment = new DialogRecordStopFragment();
                RecordActivity.this.showDialogFragment(dialogRecordStopFragment);
                dialogRecordStopFragment.setOnEventDialog(new b());
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$c */
    public class ViewOnClickListenerC4300c implements View.OnClickListener {
        public ViewOnClickListenerC4300c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - RecordActivity.this.f26248a2 < 1000) {
                return;
            }
            RecordActivity recordActivity = RecordActivity.this;
            if (recordActivity.f26257f > 10800) {
                RecordActivity.this.showDialogFragment(new DialogRecordHintFragment());
                return;
            }
            if (recordActivity.f26258m) {
                recordActivity.stopView();
                pb9.get("record_action").post(jk5.f51004j);
            } else {
                recordActivity.f26258m = true;
                if (recordActivity.f26241Q != null) {
                    RecordActivity.this.f26241Q.start();
                }
                if (RecordActivity.this.f26243X) {
                    ((C15021xb) ((BaseActivity) RecordActivity.this).binding).f97406m.setText(RecordActivity.this.getResources().getText(C4297R.string.text_player_pause));
                    pb9.get("record_action").post("resume");
                } else {
                    RecordActivity.this.f26243X = true;
                    RecordActivity recordActivity2 = RecordActivity.this;
                    recordActivity2.f26257f = 0L;
                    ((C15021xb) ((BaseActivity) recordActivity2).binding).f97406m.setText(RecordActivity.this.getResources().getText(C4297R.string.text_player_pause));
                    pb9.get("record_action").post("start");
                }
                if (RecordActivity.this.f26250b2 != null) {
                    RecordActivity.this.f26250b2.sendEmptyMessageDelayed(101, 1000L);
                }
            }
            RecordActivity.this.f26248a2 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$d */
    public class ViewOnClickListenerC4301d implements View.OnClickListener {
        public ViewOnClickListenerC4301d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordActivity.this.back();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$e */
    public class ViewOnTouchListenerC4302e implements View.OnTouchListener {
        public ViewOnTouchListenerC4302e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            RecordActivity.this.f26239M1 = true;
            RecordActivity.this.f26250b2.removeCallbacks(RecordActivity.this.f26252c2);
            RecordActivity.this.f26250b2.postDelayed(RecordActivity.this.f26252c2, 10000L);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$f */
    public class RunnableC4303f implements Runnable {
        public RunnableC4303f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecordActivity.this.f26239M1 = false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$g */
    public class C4304g implements s2c {
        public C4304g() {
        }

        @Override // p000.s2c
        public void onKeyEvent(int i) {
            if (i == 1) {
                RecordActivity.this.saveRecord();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$h */
    public class C4305h implements qxb<String> {
        public C4305h() {
        }

        @Override // p000.qxb
        public void onChanged(String str) {
            RecordActivity.this.f26237L = str;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivity$i */
    public class C4306i extends BaseWebSocketManager.AsrDataListener {
        public C4306i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClose$3(int i) {
            if (i != 1000) {
                ((C15021xb) ((BaseActivity) RecordActivity.this).binding).f97399X.setVisibility(0);
            }
            if (TextUtils.isEmpty(RecordActivity.this.f26242V1)) {
                return;
            }
            RecordActivity recordActivity = RecordActivity.this;
            StringBuilder sb = recordActivity.f26234C;
            sb.append(recordActivity.f26242V1);
            sb.append("\n");
            RecordActivity.this.f26242V1 = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessageOnce$1() {
            ((C15021xb) ((BaseActivity) RecordActivity.this).binding).f97394H.fullScroll(130);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessageOnce$2(String str, boolean z) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            RecordActivity.this.f26242V1 = str;
            if (z) {
                RecordActivity recordActivity = RecordActivity.this;
                StringBuilder sb = recordActivity.f26234C;
                sb.append(str);
                sb.append("\n");
                recordActivity.f26245Z = sb.toString();
                RecordActivity.this.f26242V1 = "";
            } else {
                RecordActivity.this.f26245Z = RecordActivity.this.f26234C.toString() + str;
            }
            ((C15021xb) ((BaseActivity) RecordActivity.this).binding).f97396M.setText(RecordActivity.this.f26245Z);
            if (RecordActivity.this.f26239M1) {
                return;
            }
            ((C15021xb) ((BaseActivity) RecordActivity.this).binding).f97394H.post(new Runnable() { // from class: gtd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41093a.lambda$onMessageOnce$1();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOpen$0() {
            if (RecordActivity.this.f26251c && RecordActivity.this.f26247a) {
                RecordActivity recordActivity = RecordActivity.this;
                if (!recordActivity.f26258m) {
                    ((C15021xb) ((BaseActivity) recordActivity).binding).f97406m.performClick();
                }
            }
            RecordActivity.this.f26251c = false;
            ((C15021xb) ((BaseActivity) RecordActivity.this).binding).f97399X.setVisibility(8);
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onClose(final int i) {
            RecordActivity.this.runOnUiThread(new Runnable() { // from class: htd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44846a.lambda$onClose$3(i);
                }
            });
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onMessageOnce(String str, final String str2, String str3, String str4, String str5, final boolean z) {
            RecordActivity.this.runOnUiThread(new Runnable() { // from class: ftd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37720a.lambda$onMessageOnce$2(str2, z);
                }
            });
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onOpen() {
            RecordActivity.this.runOnUiThread(new Runnable() { // from class: etd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34017a.lambda$onOpen$0();
                }
            });
            if (RecordActivity.this.f26258m) {
                pb9.get("record_action").post("resume");
            }
        }

        @Override // com.watchfun.translatemodule.BaseWebSocketManager.AsrDataListener, com.watchfun.translatemodule.BaseWebSocketManager.DataListener
        public void onStopRecord() {
            super.onStopRecord();
            if (RecordActivity.this.f26258m) {
                C2473f.m4168e("BaseWebSocketManager", "重新发送开始识别");
                pb9.get("record_action").post("resume");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void back() {
        if (this.f26257f == 0) {
            finish();
            return;
        }
        DialogRecordFragment dialogRecordFragment = new DialogRecordFragment();
        showDialogFragment(dialogRecordFragment);
        dialogRecordFragment.setOnEventDialog(new C4304g());
    }

    private void dismissAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: ctd
            @Override // java.lang.Runnable
            public final void run() {
                this.f27525a.lambda$dismissAudioFormatLoading$2();
            }
        });
    }

    @igg({"InvalidWakeLockTag"})
    private void initWakeLock() {
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(805306394, "target");
        this.f26246Z1 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.acquire();
    }

    private void initWssAsr() {
        VoiceWebSocketManager.getInstance().setAsrDataListener(this.f26254d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissAudioFormatLoading$2() {
        DialogC5869fl dialogC5869fl = this.f26256e2;
        if (dialogC5869fl == null || !dialogC5869fl.isShowing()) {
            return;
        }
        this.f26256e2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveRecord$0(String str, VoiceNotesBean voiceNotesBean, boolean z) {
        if (!z) {
            dismissAudioFormatLoading();
            l3h.showToastShort(getString(C4297R.string.save_error));
            finish();
            return;
        }
        long mp3Duration = iac.getMp3Duration(str);
        if (mp3Duration != -1) {
            voiceNotesBean.setRecordTime(mp3Duration);
        }
        voiceNotesBean.setRecordPath(str);
        this.f26240N.updateMeetingDataByRecordPath(this.f26237L, voiceNotesBean.getCreateTime(), voiceNotesBean.getRecordTime(), str);
        dismissAudioFormatLoading();
        l3h.showToastShort(getString(C4297R.string.save_success));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAudioFormatLoading$1() {
        if (this.f26256e2 == null) {
            this.f26256e2 = new DialogC5869fl(this);
        }
        if (this.f26256e2.isShowing()) {
            return;
        }
        this.f26256e2.show();
    }

    private void releaseWakeLock() {
        PowerManager.WakeLock wakeLock = this.f26246Z1;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveRecord() {
        showAudioFormatLoading();
        this.f26258m = false;
        final VoiceNotesBean voiceNotesBean = new VoiceNotesBean();
        voiceNotesBean.setContent(this.f26245Z);
        voiceNotesBean.setCreateTime(System.currentTimeMillis() + "");
        voiceNotesBean.setRecordTime(this.f26257f);
        if (!TextUtils.isEmpty(this.f26237L) && new File(this.f26237L).exists()) {
            voiceNotesBean.setRecordTime(iac.calculateVoiceNoteDuration(new File(this.f26237L).length()));
        }
        if (TextUtils.isEmpty(this.f26244Y)) {
            voiceNotesBean.setTitle(AppUtils.ShowDateMonthToStr(System.currentTimeMillis()) + C2473f.f17566z + getString(C4297R.string.ai_voice_note_string_record));
        } else {
            voiceNotesBean.setTitle(this.f26244Y);
        }
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString("language_voice_notes"));
        if (transLanguageData != null) {
            voiceNotesBean.setLanguage(AiLangUtil.getValue(this, transLanguageData.getKeyName()));
        }
        voiceNotesBean.setRecordPath(this.f26237L);
        this.f26240N.saveMeetInfo(voiceNotesBean);
        final String strReplace = this.f26237L.replace(".pcm", ".mp3");
        qd0.pcm2mp3(this.f26237L, strReplace, new qd0.InterfaceC11434b() { // from class: dtd
            @Override // p000.qd0.InterfaceC11434b
            public final void onAudioConverted(boolean z) {
                this.f30851a.lambda$saveRecord$0(strReplace, voiceNotesBean, z);
            }
        });
    }

    private void showAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: btd
            @Override // java.lang.Runnable
            public final void run() {
                this.f14743a.lambda$showAudioFormatLoading$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopView() {
        this.f26258m = false;
        Handler handler = this.f26250b2;
        if (handler != null) {
            handler.removeMessages(101);
        }
        C11006b c11006b = this.f26241Q;
        if (c11006b != null) {
            c11006b.stop();
        }
        ((C15021xb) this.binding).f97406m.setText(getResources().getText(C4297R.string.text_start));
        VoiceWebSocketManager.getInstance().stopWssRecord();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C15021xb getViewBinding() {
        return C15021xb.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: R */
    public void m8365R(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        initWakeLock();
        this.f26240N = VoiceNotesDatabase.getDatabase(this).messageDao();
        initWssAsr();
        try {
            startForegroundService(new Intent(this, (Class<?>) RecordingService.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pb9.get("recorder_file", String.class).observe(this, new C4305h());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        super.initVariables();
        this.f26244Y = getIntent().getStringExtra("noteName");
        this.f26247a = getIntent().getBooleanExtra(f26232f2, false);
        this.f26249b = getIntent().getBooleanExtra(f26233g2, false);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        m8365R(this);
        try {
            C11006b c11006b = new C11006b(getResources(), C4201R.drawable.wave);
            this.f26241Q = c11006b;
            c11006b.stop();
            this.f26241Q.seekToFrame(0);
            ((C15021xb) this.binding).f97395L.setImageDrawable(this.f26241Q);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString("language_voice_notes"));
        ((C15021xb) this.binding).f97401b.setText(transLanguageData != null ? AiLangUtil.getValue(this, transLanguageData.getKeyName()) : getString(C4201R.string.language_chinese));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f26244Y)) {
            ((C15021xb) this.binding).f97402c.setText(AppUtils.ShowDateMonthToStr(jCurrentTimeMillis) + C2473f.f17566z + getString(C4297R.string.ai_voice_note_string_record));
        } else {
            ((C15021xb) this.binding).f97402c.setText(this.f26244Y);
        }
        ((C15021xb) this.binding).f97397N.setText(AppUtils.ShowDateMMToStr(jCurrentTimeMillis));
        ((C15021xb) this.binding).f97403d.setOnClickListener(new ViewOnClickListenerC4299b());
        ((C15021xb) this.binding).f97406m.setOnClickListener(new ViewOnClickListenerC4300c());
        ((C15021xb) this.binding).f97405f.setOnClickListener(new ViewOnClickListenerC4301d());
        ((C15021xb) this.binding).f97394H.setOnTouchListener(new ViewOnTouchListenerC4302e());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        back();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        releaseWakeLock();
        Handler handler = this.f26250b2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f26250b2.removeMessages(101);
            this.f26250b2.removeMessages(103);
            this.f26250b2 = null;
        }
        C11006b c11006b = this.f26241Q;
        if (c11006b != null) {
            c11006b.stop();
        }
        x4f.stopService((Class<?>) RecordingService.class);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            VoiceWebSocketManager.getInstance().unRegisterAsrDataListener();
        }
    }
}
