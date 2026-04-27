package com.watchfun.voicenotes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver;
import com.watchfun.voicenotes.VoiceNoteRecordDetailActivity;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import com.watchfun.voicenotes.widget.CustomSeekBar;
import io.reactivex.Observable;
import java.io.File;
import java.util.Objects;
import p000.C11403qb;
import p000.C2062bv;
import p000.C9389ml;
import p000.DialogC5869fl;
import p000.b40;
import p000.dsb;
import p000.mf4;
import p000.mob;
import p000.npe;
import p000.oxb;
import p000.qd0;
import p000.uei;
import p000.vja;
import p000.vt5;
import pl.droidsonroids.gif.C11006b;

/* JADX INFO: loaded from: classes7.dex */
public class VoiceNoteRecordDetailActivity extends BaseActivity<C11403qb> implements MediaNewButtonReceiver.IKeyDownListener {

    /* JADX INFO: renamed from: a */
    public long f26435a;

    /* JADX INFO: renamed from: b */
    public VoiceNotesBean f26436b;

    /* JADX INFO: renamed from: c */
    public C11006b f26437c;

    /* JADX INFO: renamed from: d */
    public VoiceNotesDao f26438d;

    /* JADX INFO: renamed from: e */
    public DialogC5869fl f26439e;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteRecordDetailActivity$a */
    public class C4353a implements oxb<File> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f26440a;

        public C4353a(Context context) {
            this.f26440a = context;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
        }

        @Override // p000.oxb
        public void onNext(File file) {
            if (file != null) {
                try {
                    if (file.exists()) {
                        Uri uriForFile = FileProvider.getUriForFile(this.f26440a, this.f26440a.getPackageName() + ".fileProvider", file);
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("audio/*");
                        intent.putExtra("android.intent.extra.STREAM", uriForFile);
                        intent.addFlags(1);
                        this.f26440a.startActivity(Intent.createChooser(intent, ""));
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            Toast.makeText(this.f26440a, "audio is not exist", 0).show();
        }
    }

    private void dismissAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: rei
            @Override // java.lang.Runnable
            public final void run() {
                this.f78122a.lambda$dismissAudioFormatLoading$13();
            }
        });
    }

    private void findMeeting() {
        VoiceNotesBean voiceNotesBeanFindByMid = this.f26438d.findByMid(this.f26435a);
        this.f26436b = voiceNotesBeanFindByMid;
        if (voiceNotesBeanFindByMid != null) {
            if (voiceNotesBeanFindByMid.getRecordPath() != null) {
                String recordPath = this.f26436b.getRecordPath();
                if (recordPath.endsWith(".pcm")) {
                    showAudioFormatLoading();
                    final String strReplace = recordPath.replace(".pcm", ".mp3");
                    qd0.pcm2mp3(recordPath, strReplace, new qd0.InterfaceC11434b() { // from class: vei
                        @Override // p000.qd0.InterfaceC11434b
                        public final void onAudioConverted(boolean z) {
                            this.f90847a.lambda$findMeeting$9(strReplace, z);
                        }
                    });
                } else {
                    vja.getInstance().initMediaPayer(recordPath, 1.0f, this, this);
                }
            }
            ((C11403qb) this.binding).f73793c.setText(this.f26436b.getTitle());
            ((C11403qb) this.binding).f73792b.setText(TextUtils.isEmpty(this.f26436b.language) ? getString(C4297R.string.language_chinese) : this.f26436b.language);
            if (TextUtils.isEmpty(this.f26436b.getContent())) {
                ((C11403qb) this.binding).f73784L.setVisibility(8);
                ((C11403qb) this.binding).f73782F.setVisibility(8);
                ((C11403qb) this.binding).f73787Q.setText("");
            } else {
                ((C11403qb) this.binding).f73784L.setVisibility(0);
                ((C11403qb) this.binding).f73782F.setVisibility(0);
                ((C11403qb) this.binding).f73787Q.setText(this.f26436b.getContent());
            }
            if (TextUtils.isEmpty(this.f26436b.getCreateTime())) {
                return;
            }
            ((C11403qb) this.binding).f73790Z.setText(b40.getCollectTime(Long.parseLong(this.f26436b.getCreateTime())));
            ((C11403qb) this.binding).f73788X.setText(b40.secondsToHMS(0L));
            ((C11403qb) this.binding).f73789Y.setText(b40.secondsToHMS(this.f26436b.getRecordTime()));
        }
    }

    private void initMediaPlayListener() {
        vja.getInstance().setPlayCallback(new vja.InterfaceC14119e() { // from class: nei
            @Override // p000.vja.InterfaceC14119e
            public final void onState(int i) {
                this.f64221a.lambda$initMediaPlayListener$10(i);
            }
        });
        vja.getInstance().setSeekCallback(new vja.InterfaceC14121g() { // from class: tei
            @Override // p000.vja.InterfaceC14121g
            public final void onSeek(int i, float f, boolean z, boolean z2) {
                this.f84469a.lambda$initMediaPlayListener$11(i, f, z, z2);
            }
        });
        CustomSeekBar customSeekBar = ((C11403qb) this.binding).f73785M;
        vja vjaVar = vja.getInstance();
        Objects.requireNonNull(vjaVar);
        customSeekBar.setOnProgressChangeListener(new uei(vjaVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissAudioFormatLoading$13() {
        DialogC5869fl dialogC5869fl = this.f26439e;
        if (dialogC5869fl == null || !dialogC5869fl.isShowing()) {
            return;
        }
        this.f26439e.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$findMeeting$9(String str, boolean z) {
        if (z) {
            vja.getInstance().initMediaPayer(str, 1.0f, this, this);
            this.f26436b.setRecordPath(str);
            this.f26438d.updateMeetInfo(this.f26436b);
        }
        dismissAudioFormatLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMediaPlayListener$10(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    refreshPauseBtnState();
                    return;
                } else if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            refreshPlayingBtnState();
            return;
        }
        refreshInitBtnState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMediaPlayListener$11(int i, float f, boolean z, boolean z2) {
        if (isFinishing()) {
            return;
        }
        ((C11403qb) this.binding).f73785M.setProgress(f);
        ((C11403qb) this.binding).f73788X.setText(b40.secondsToHMS(((long) i) / 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        if (b40.isFastClick(300L)) {
            return;
        }
        shareAudio(this.f26436b.getTitle(), this.f26436b.getRecordPath(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initView$3(View view) {
        if (b40.isFastClick(300L)) {
            return;
        }
        vja.getInstance().seekTo(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initView$4(View view) {
        if (b40.isFastClick(300L)) {
            return;
        }
        vja.getInstance().seekTo(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$5(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$6(View view) {
        Intent intent = new Intent(this, (Class<?>) VoiceNoteRecordEditDetailActivity.class);
        intent.putExtra("mid", this.f26435a);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$7(boolean z) {
        if (z) {
            ((C11403qb) this.binding).f73797m.setImageResource(C4297R.drawable.ic_play_stop_v1);
            C11006b c11006b = this.f26437c;
            if (c11006b != null) {
                c11006b.start();
                return;
            }
            return;
        }
        ((C11403qb) this.binding).f73797m.setImageResource(C4297R.drawable.ic_play_start_v1);
        C11006b c11006b2 = this.f26437c;
        if (c11006b2 != null) {
            c11006b2.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$8(View view) {
        if (b40.isFastClick(300L)) {
            return;
        }
        vja.getInstance().playOrPause(new vja.InterfaceC14120f() { // from class: wei
            @Override // p000.vja.InterfaceC14120f
            public final void onState(boolean z) {
                this.f94059a.lambda$initView$7(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$shareAudio$0(Context context) {
        Toast.makeText(context, "audio is not exist", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shareAudio$1(String str, final Context context, String str2, mob mobVar) throws Exception {
        File file = new File(str);
        if (!file.exists()) {
            runOnUiThread(new Runnable() { // from class: sei
                @Override // java.lang.Runnable
                public final void run() {
                    VoiceNoteRecordDetailActivity.lambda$shareAudio$0(context);
                }
            });
        } else {
            mobVar.onNext(vt5.copyShareFileToCache(str2, file));
            mobVar.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAudioFormatLoading$12() {
        if (this.f26439e == null) {
            this.f26439e = new DialogC5869fl(this);
        }
        if (this.f26439e.isShowing()) {
            return;
        }
        this.f26439e.show();
    }

    private void refreshInitBtnState() {
        ((C11403qb) this.binding).f73788X.setText(b40.secondsToHMS(0L));
        ((C11403qb) this.binding).f73785M.setProgress(0.0f);
        ((C11403qb) this.binding).f73797m.setImageResource(C4297R.drawable.ic_play_start_v1);
        C11006b c11006b = this.f26437c;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    private void refreshPauseBtnState() {
        ((C11403qb) this.binding).f73797m.setImageResource(C4297R.drawable.ic_play_start_v1);
        C11006b c11006b = this.f26437c;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    private void refreshPlayingBtnState() {
        ((C11403qb) this.binding).f73797m.setImageResource(C4297R.drawable.ic_play_stop_v1);
        C11006b c11006b = this.f26437c;
        if (c11006b != null) {
            c11006b.start();
        }
    }

    private void shareAudio(final String str, final String str2, final Context context) {
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        Observable.create(new dsb() { // from class: qei
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                this.f74265a.lambda$shareAudio$1(str2, context, str, mobVar);
            }
        }).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C4353a(context));
    }

    private void showAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: pei
            @Override // java.lang.Runnable
            public final void run() {
                this.f70579a.lambda$showAudioFormatLoading$12();
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        this.f26438d = VoiceNotesDatabase.getDatabase(this).messageDao();
        this.f26435a = getIntent().getLongExtra("mid", 0L);
        try {
            C11006b c11006b = new C11006b(getResources(), C4297R.drawable.wave);
            this.f26437c = c11006b;
            c11006b.stop();
            this.f26437c.seekToFrame(0);
            ((C11403qb) this.binding).f73786N.setImageDrawable(this.f26437c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        m8515s(this);
        ((C11403qb) this.binding).f73781C.setOnClickListener(new View.OnClickListener() { // from class: xei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97607a.lambda$initView$2(view);
            }
        });
        ((C11403qb) this.binding).f73796f.setOnClickListener(new View.OnClickListener() { // from class: yei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceNoteRecordDetailActivity.lambda$initView$3(view);
            }
        });
        ((C11403qb) this.binding).f73795e.setOnClickListener(new View.OnClickListener() { // from class: zei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceNoteRecordDetailActivity.lambda$initView$4(view);
            }
        });
        ((C11403qb) this.binding).f73794d.setOnClickListener(new View.OnClickListener() { // from class: afi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1357a.lambda$initView$5(view);
            }
        });
        ((C11403qb) this.binding).f73782F.setOnClickListener(new View.OnClickListener() { // from class: bfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13665a.lambda$initView$6(view);
            }
        });
        ((C11403qb) this.binding).f73797m.setOnClickListener(new View.OnClickListener() { // from class: oei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67445a.lambda$initView$8(view);
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vja.getInstance().release();
        C11006b c11006b = this.f26437c;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    @Override // com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver.IKeyDownListener
    public void onKeyDown(int i) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C11006b c11006b = this.f26437c;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        C11006b c11006b;
        super.onResume();
        ((C11403qb) this.binding).f73797m.setImageResource(vja.getInstance().f91382d ? C4297R.drawable.ic_play_stop_v1 : C4297R.drawable.ic_play_start_v1);
        ((C11403qb) this.binding).f73785M.setProgress(vja.getInstance().getSeekPercent());
        if (vja.getInstance().f91382d && (c11006b = this.f26437c) != null) {
            c11006b.start();
        }
        findMeeting();
        initMediaPlayListener();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C11403qb getViewBinding() {
        return C11403qb.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: s */
    public void m8515s(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }
}
