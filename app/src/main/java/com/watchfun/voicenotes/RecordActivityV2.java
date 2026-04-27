package com.watchfun.voicenotes;

import android.app.Activity;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.reflect.TypeToken;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.voicenotes.bean.RecordRvBean;
import com.watchfun.voicenotes.bean.SaveVoiceNoteReq;
import com.watchfun.voicenotes.bean.SaveVoiceNoteResp;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import com.watchfun.voicenotes.widget.DialogRecord2Fragment;
import com.watchfun.voicenotes.widget.DialogRecordEditNewFragment;
import com.watchfun.voicenotes.widget.DialogRecordHintFragment;
import com.zlw.main.recorderlib.recorder.C4442a;
import com.zlw.main.recorderlib.recorder.C4443b;
import com.zlw.main.recorderlib.recorder.RecordService;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import p000.C12124rk;
import p000.C4731dc;
import p000.C9389ml;
import p000.DialogC5869fl;
import p000.a1h;
import p000.bud;
import p000.efb;
import p000.iac;
import p000.iei;
import p000.igg;
import p000.jei;
import p000.k3h;
import p000.mei;
import p000.mtd;
import p000.s2c;
import p000.sc7;
import p000.std;
import p000.ttd;
import p000.u2c;
import p000.vfe;
import pl.droidsonroids.gif.C11006b;

/* JADX INFO: loaded from: classes7.dex */
public class RecordActivityV2 extends BaseActivity<C4731dc> implements jei.InterfaceC7889b {

    /* JADX INFO: renamed from: a2 */
    public static final int f26271a2 = 1;

    /* JADX INFO: renamed from: b2 */
    public static final String f26272b2 = "RecordActivityV2";

    /* JADX INFO: renamed from: C */
    public VoiceNotesDao f26273C;

    /* JADX INFO: renamed from: F */
    public C11006b f26274F;

    /* JADX INFO: renamed from: H */
    public boolean f26275H;

    /* JADX INFO: renamed from: L */
    public String f26276L;

    /* JADX INFO: renamed from: M */
    public PowerManager.WakeLock f26277M;

    /* JADX INFO: renamed from: M1 */
    public VoiceNotesBean f26278M1;

    /* JADX INFO: renamed from: N */
    public ttd f26279N;

    /* JADX INFO: renamed from: V1 */
    public mtd f26281V1;

    /* JADX INFO: renamed from: X */
    public jei.InterfaceC7888a f26282X;

    /* JADX INFO: renamed from: Z1 */
    public DialogC5869fl f26285Z1;

    /* JADX INFO: renamed from: c */
    public long f26288c;

    /* JADX INFO: renamed from: m */
    public String f26292m;

    /* JADX INFO: renamed from: a */
    public final long f26286a = 10800;

    /* JADX INFO: renamed from: b */
    public final long f26287b = 1000;

    /* JADX INFO: renamed from: d */
    public boolean f26289d = false;

    /* JADX INFO: renamed from: e */
    public final int f26290e = 103;

    /* JADX INFO: renamed from: f */
    public final int f26291f = 101;

    /* JADX INFO: renamed from: Q */
    public List<RecordRvBean> f26280Q = new ArrayList();

    /* JADX INFO: renamed from: Y */
    public boolean f26283Y = false;

    /* JADX INFO: renamed from: Z */
    public Handler f26284Z = new Handler(new C4307a());

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$a */
    public class C4307a implements Handler.Callback {

        /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$a$a */
        public class a implements s2c {
            public a() {
            }

            @Override // p000.s2c
            public void onKeyEvent(int i) {
                if (i == 1) {
                    RecordActivityV2.this.f26283Y = false;
                } else {
                    RecordActivityV2.this.f26283Y = true;
                }
                RecordActivityV2.this.stopRecord();
            }
        }

        public C4307a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@efb Message message) {
            int i = message.what;
            if (i == 101) {
                RecordActivityV2 recordActivityV2 = RecordActivityV2.this;
                if (recordActivityV2.f26289d) {
                    recordActivityV2.f26288c++;
                    ((C4731dc) ((BaseActivity) recordActivityV2).binding).f29244C.setImageResource(C4297R.drawable.ic_record_mic_normal);
                    long j = RecordActivityV2.this.f26288c;
                    ((C4731dc) ((BaseActivity) RecordActivityV2.this).binding).f29255Z.setText(String.format(Locale.ENGLISH, "%02d:%02d:%02d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60)));
                    ((C4731dc) ((BaseActivity) RecordActivityV2.this).binding).f29255Z.setTextColor(RecordActivityV2.this.getResources().getColor(C4297R.color.ai_voice_note_list_title_color));
                    RecordActivityV2 recordActivityV22 = RecordActivityV2.this;
                    if (recordActivityV22.f26288c >= 10800) {
                        recordActivityV22.f26289d = false;
                        recordActivityV22.stopView();
                        RecordActivityV2.this.pauseRecord();
                        if (RecordActivityV2.this.f26284Z != null) {
                            RecordActivityV2.this.f26284Z.removeMessages(101);
                            RecordActivityV2.this.f26284Z.removeMessages(103);
                        }
                        DialogRecordHintFragment dialogRecordHintFragment = new DialogRecordHintFragment();
                        RecordActivityV2.this.showDialogFragment(dialogRecordHintFragment);
                        dialogRecordHintFragment.setOnEventDialog(new a());
                    } else if (recordActivityV22.f26284Z != null) {
                        RecordActivityV2.this.f26284Z.sendEmptyMessageDelayed(101, 1000L);
                    }
                }
            } else if (i == 103) {
                new Random().nextInt(120);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$b */
    public static /* synthetic */ class C4308b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26295a;

        static {
            int[] iArr = new int[C4443b.h.values().length];
            f26295a = iArr;
            try {
                iArr[C4443b.h.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26295a[C4443b.h.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26295a[C4443b.h.RECORDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26295a[C4443b.h.STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26295a[C4443b.h.FINISH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$c */
    public class C4309c extends TypeToken<List<TransLanguageData>> {
        public C4309c() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$d */
    public class ViewOnClickListenerC4310d implements View.OnClickListener {
        public ViewOnClickListenerC4310d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordActivityV2.this.saveAndExit(true);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$e */
    public class ViewOnClickListenerC4311e implements View.OnClickListener {
        public ViewOnClickListenerC4311e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C4731dc) ((BaseActivity) RecordActivityV2.this).binding).f29249M1.setVisibility(8);
            RecordActivityV2 recordActivityV2 = RecordActivityV2.this;
            if (recordActivityV2.f26288c > 10800) {
                RecordActivityV2.this.showDialogFragment(new DialogRecordHintFragment());
                return;
            }
            if (recordActivityV2.f26289d) {
                recordActivityV2.stopView();
                RecordActivityV2.this.pauseRecord();
                return;
            }
            recordActivityV2.f26289d = true;
            if (recordActivityV2.f26274F != null) {
                RecordActivityV2.this.f26274F.start();
            }
            if (RecordActivityV2.this.f26275H) {
                ((C4731dc) ((BaseActivity) RecordActivityV2.this).binding).f29263m.setImageResource(C4297R.drawable.ic_record_pause_v1);
                ((C4731dc) ((BaseActivity) RecordActivityV2.this).binding).f29254Y.setText(C4297R.string.ai_voice_note_tip_pause_record);
                RecordActivityV2.this.resumeRecord();
            } else {
                RecordActivityV2.this.f26275H = true;
                RecordActivityV2 recordActivityV22 = RecordActivityV2.this;
                recordActivityV22.f26288c = 0L;
                ((C4731dc) ((BaseActivity) recordActivityV22).binding).f29263m.setImageResource(C4297R.drawable.ic_record_pause_v1);
                ((C4731dc) ((BaseActivity) RecordActivityV2.this).binding).f29254Y.setText(C4297R.string.ai_voice_note_tip_pause_record);
                RecordActivityV2.this.startRecord();
            }
            if (RecordActivityV2.this.f26284Z != null) {
                RecordActivityV2.this.f26284Z.sendEmptyMessageDelayed(101, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$f */
    public class ViewOnClickListenerC4312f implements View.OnClickListener {
        public ViewOnClickListenerC4312f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordActivityV2.this.saveAndExit(false);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$g */
    public class C4313g extends TypeToken<List<TransLanguageData>> {
        public C4313g() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$h */
    public class C4314h implements u2c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogRecordEditNewFragment f26301a;

        public C4314h(DialogRecordEditNewFragment dialogRecordEditNewFragment) {
            this.f26301a = dialogRecordEditNewFragment;
        }

        @Override // p000.u2c
        public void onInput(String str) {
            if (TextUtils.isEmpty(str)) {
                k3h.showToastShort(RecordActivityV2.this.getResources().getString(C4297R.string.ai_voice_note_please_input_record_title));
                return;
            }
            this.f26301a.dismiss();
            RecordActivityV2.this.f26276L = str;
            RecordActivityV2.this.stopRecord();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$i */
    public class C4315i implements bud {
        public C4315i() {
        }

        @Override // p000.bud
        public void onError(String str) {
            Log.e(RecordActivityV2.f26272b2, "onError errInfo:" + str);
        }

        @Override // p000.bud
        public void onStateChange(C4443b.h hVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("onStateChange: ");
            sb.append(hVar.name());
            int i = C4308b.f26295a[hVar.ordinal()];
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordActivityV2$j */
    public class C4316j implements std {
        public C4316j() {
        }

        @Override // p000.std
        public void onError(String str) {
            ToastUtils.showLong("Record Error：" + str);
        }

        @Override // p000.std
        public void onResult(File file) {
            StringBuilder sb = new StringBuilder();
            sb.append("onResult :");
            sb.append(file.getAbsoluteFile());
            RecordActivityV2.this.f26292m = file.getAbsolutePath();
            RecordActivityV2.this.saveRecord();
        }
    }

    private void doSave() {
        this.f26289d = false;
        VoiceNotesBean voiceNotesBean = new VoiceNotesBean();
        this.f26278M1 = voiceNotesBean;
        voiceNotesBean.setContent("");
        this.f26278M1.setCreateTime(System.currentTimeMillis() + "");
        this.f26278M1.setRecordTime(this.f26288c);
        if (TextUtils.isEmpty(this.f26276L)) {
            this.f26278M1.setTitle(a1h.ShowDateToStr(System.currentTimeMillis()));
        } else {
            this.f26278M1.setTitle(this.f26276L);
        }
        List list = (List) sc7.fromJson(vfe.getInstance().getString(iei.f46711e), new C4313g().getType());
        if (list != null && list.size() > 0) {
            this.f26278M1.setLanguage(C12124rk.getValue(this, list));
        }
        this.f26278M1.setRecordPath(this.f26292m);
        if (!TextUtils.isEmpty(this.f26292m) && new File(this.f26292m).exists()) {
            this.f26278M1.setRecordTime(iac.calculateVoiceNoteDuration(new File(this.f26292m).length()));
        }
        File parentFile = new File(this.f26292m).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        long mp3Duration = iac.getMp3Duration(this.f26292m);
        this.f26278M1.setRecordPath(this.f26292m);
        if (mp3Duration != -1) {
            this.f26278M1.setRecordTime(mp3Duration);
        }
        this.f26273C.saveMeetInfo(this.f26278M1);
        saveVoiceNote(this.f26278M1.getTitle(), this.f26278M1.getLanguage(), (int) this.f26278M1.getRecordTime());
    }

    private void initMP3RecordParams() {
        mtd mtdVar = mtd.getInstance();
        this.f26281V1 = mtdVar;
        mtdVar.changeFormat(C4442a.a.MP3);
        this.f26281V1.changeRecordConfig(RecordService.getRecordConfig().setSampleRate(16000));
        this.f26281V1.changeRecordConfig(RecordService.getRecordConfig().setEncodingConfig(2));
        this.f26281V1.setSource(C4442a.f26661m);
        File file = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/audio/");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f26281V1.changeRecordDir(file.getAbsolutePath());
        initRecordEvent();
    }

    private void initRecordEvent() {
        this.f26281V1.setRecordStateListener(new C4315i());
        this.f26281V1.setRecordResultListener(new C4316j());
    }

    @igg({"InvalidWakeLockTag"})
    private void initWakeLock() {
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(805306394, "target");
        this.f26277M = wakeLockNewWakeLock;
        wakeLockNewWakeLock.acquire();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveAndExit$0(int i) {
        if (i == 1) {
            showInputRecordNameDialog();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseRecord() {
        this.f26281V1.pause();
    }

    private void releaseWakeLock() {
        PowerManager.WakeLock wakeLock = this.f26277M;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeRecord() {
        this.f26281V1.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveAndExit(boolean z) {
        if (this.f26288c == 0) {
            finish();
            return;
        }
        if (this.f26275H && this.f26289d) {
            ((C4731dc) this.binding).f29263m.performClick();
        }
        if (!z) {
            showInputRecordNameDialog();
            return;
        }
        DialogRecord2Fragment dialogRecord2Fragment = new DialogRecord2Fragment();
        showDialogFragment(dialogRecord2Fragment);
        dialogRecord2Fragment.setTitle(getString(C4297R.string.ai_voice_note_record_tip_on_exit));
        dialogRecord2Fragment.setLeftText(getString(C4297R.string.ai_voice_note_record_abort));
        dialogRecord2Fragment.setRightText(getString(C4297R.string.ai_voice_note_string_save));
        dialogRecord2Fragment.setOnEventDialog(new s2c() { // from class: itd
            @Override // p000.s2c
            public final void onKeyEvent(int i) {
                this.f48255a.lambda$saveAndExit$0(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveRecord() {
        showLoadingView();
        doSave();
    }

    private void saveVoiceNote(String str, String str2, int i) {
        SaveVoiceNoteReq saveVoiceNoteReq = new SaveVoiceNoteReq();
        saveVoiceNoteReq.setTitle(str);
        saveVoiceNoteReq.setLanguage(str2);
        saveVoiceNoteReq.setVoiceDuration(i);
        this.f26282X.saveVoiceNote(saveVoiceNoteReq);
    }

    private void showInputRecordNameDialog() {
        DialogRecordEditNewFragment dialogRecordEditNewFragment = DialogRecordEditNewFragment.getInstance(a1h.ShowDateToStr(System.currentTimeMillis()));
        dialogRecordEditNewFragment.setTitleTip(getString(C4297R.string.ai_voice_note_record_tip_on_exit));
        showDialogFragment(dialogRecordEditNewFragment);
        dialogRecordEditNewFragment.setOnEventEditDialog(new C4314h(dialogRecordEditNewFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRecord() {
        this.f26281V1.start();
    }

    private void startRecordingService() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRecord() {
        this.f26281V1.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopView() {
        this.f26289d = false;
        Handler handler = this.f26284Z;
        if (handler != null) {
            handler.removeMessages(101);
        }
        C11006b c11006b = this.f26274F;
        if (c11006b != null) {
            c11006b.stop();
        }
        ((C4731dc) this.binding).f29263m.setImageResource(C4297R.drawable.ic_record_start_v1);
        ((C4731dc) this.binding).f29254Y.setText(C4297R.string.ai_voice_note_tip_start_record);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C4731dc getViewBinding() {
        return C4731dc.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: D */
    public void m8396D(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }

    public void dismissLoadingView() {
        DialogC5869fl dialogC5869fl = this.f26285Z1;
        if (dialogC5869fl != null) {
            dialogC5869fl.dismiss();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        initWakeLock();
        this.f26273C = VoiceNotesDatabase.getDatabase(this).messageDao();
    }

    @Override // com.watchfun.base.BaseActivity
    public void initVariables() {
        super.initVariables();
        this.f26276L = getIntent().getStringExtra("noteName");
    }

    @Override // com.watchfun.base.BaseActivity
    @igg({"ClickableViewAccessibility"})
    public void initView() {
        super.initView();
        m8396D(this);
        ((C4731dc) this.binding).f29256Z1.setText(C4297R.string.ai_voice_note_title_record_page);
        this.f26282X = new mei(this);
        initMP3RecordParams();
        try {
            C11006b c11006b = new C11006b(getResources(), C4297R.drawable.ai_voice_note_wave_v1);
            this.f26274F = c11006b;
            c11006b.stop();
            this.f26274F.seekToFrame(0);
            ((C4731dc) this.binding).f29250N.setImageDrawable(this.f26274F);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List list = (List) sc7.fromJson(vfe.getInstance().getString(iei.f46711e), new C4309c().getType());
        ((C4731dc) this.binding).f29258b.setText((list == null || list.isEmpty()) ? getString(C4297R.string.language_chinese) : C12124rk.getValue(this, list));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f26276L)) {
            ((C4731dc) this.binding).f29259c.setText(a1h.ShowDateToStr(jCurrentTimeMillis));
        } else {
            ((C4731dc) this.binding).f29259c.setText(this.f26276L);
        }
        ((C4731dc) this.binding).f29253X.setText(a1h.ShowDateMMToStr(jCurrentTimeMillis));
        this.f26279N = new ttd(this, this.f26280Q);
        ((C4731dc) this.binding).f29248M.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((C4731dc) this.binding).f29248M.setAdapter(this.f26279N);
        ((C4731dc) this.binding).f29260d.setOnClickListener(new ViewOnClickListenerC4310d());
        ((C4731dc) this.binding).f29263m.setOnClickListener(new ViewOnClickListenerC4311e());
        ((C4731dc) this.binding).f29262f.setOnClickListener(new ViewOnClickListenerC4312f());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @igg({"MissingSuperCall"})
    public void onBackPressed() {
        saveAndExit(true);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f26284Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            releaseWakeLock();
            Handler handler = this.f26284Z;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f26284Z.removeMessages(101);
                this.f26284Z.removeMessages(103);
            }
            C11006b c11006b = this.f26274F;
            if (c11006b != null) {
                c11006b.stop();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @efb String[] strArr, @efb int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1 && iArr.length > 0 && iArr[0] == 0) {
            startRecordingService();
        }
    }

    @Override // p000.jei.InterfaceC7889b
    public void queryVoiceNodeLimitFail() {
    }

    @Override // p000.jei.InterfaceC7889b
    public void queryVoiceNodeLimitTimeSuccess(boolean z, int i, int i2) {
    }

    @Override // p000.jei.InterfaceC7889b
    public void saveVoiceNoteFail() {
        dismissLoadingView();
        if (this.f26283Y) {
            this.f26283Y = false;
        } else {
            finish();
        }
    }

    @Override // p000.jei.InterfaceC7889b
    public void saveVoiceNoteSuccess(SaveVoiceNoteResp saveVoiceNoteResp) {
        try {
            this.f26278M1.setId(saveVoiceNoteResp.getId());
            this.f26273C.updateMeetingDataByRecordPath(this.f26278M1.getRecordPath(), this.f26278M1.getCreateTime(), this.f26278M1.getId());
        } catch (Exception e) {
            Log.e(f26272b2, "saveVoiceNoteSuccess: " + e);
        }
        ToastUtils.showShort(getString(C4297R.string.save_success));
        dismissLoadingView();
        if (this.f26283Y) {
            this.f26283Y = false;
        } else {
            finish();
        }
    }

    public void showLoadingView() {
        if (this.f26285Z1 == null) {
            this.f26285Z1 = new DialogC5869fl(this);
        }
        this.f26285Z1.show();
    }

    @Override // p000.jei.InterfaceC7889b
    public void updateNoteTitleFail() {
    }

    @Override // p000.jei.InterfaceC7889b
    public void updateNoteTitleSuccess() {
    }
}
