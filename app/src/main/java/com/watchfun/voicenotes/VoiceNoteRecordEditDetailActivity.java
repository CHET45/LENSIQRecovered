package com.watchfun.voicenotes;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver;
import com.watchfun.voicenotes.VoiceNoteRecordEditDetailActivity;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import com.watchfun.voicenotes.widget.CustomSeekBar;
import java.util.Objects;
import p000.C11987rb;
import p000.C9389ml;
import p000.b1i;
import p000.b40;
import p000.uei;
import p000.vja;
import pl.droidsonroids.gif.C11006b;

/* JADX INFO: loaded from: classes7.dex */
public class VoiceNoteRecordEditDetailActivity extends BaseActivity<C11987rb> implements MediaNewButtonReceiver.IKeyDownListener {

    /* JADX INFO: renamed from: a */
    public long f26442a;

    /* JADX INFO: renamed from: b */
    public VoiceNotesBean f26443b;

    /* JADX INFO: renamed from: c */
    public C11006b f26444c;

    /* JADX INFO: renamed from: d */
    public VoiceNotesDao f26445d;

    private void findMeeting() {
        VoiceNotesBean voiceNotesBeanFindByMid = this.f26445d.findByMid(this.f26442a);
        this.f26443b = voiceNotesBeanFindByMid;
        if (voiceNotesBeanFindByMid != null) {
            ((C11987rb) this.binding).f77631c.setText(voiceNotesBeanFindByMid.getTitle());
            ((C11987rb) this.binding).f77630b.setText(this.f26443b.getContent());
            if (!TextUtils.isEmpty(this.f26443b.getCreateTime())) {
                ((C11987rb) this.binding).f77627Q.setText(b40.getCollectTime(Long.parseLong(this.f26443b.getCreateTime())));
                ((C11987rb) this.binding).f77626N.setText(b40.secondsToHMS(this.f26443b.getRecordTime()));
            }
        }
        initMediaPlayListener();
    }

    private void initMediaPlayListener() {
        vja.getInstance().setPlayCallback(new vja.InterfaceC14119e() { // from class: ifi
            @Override // p000.vja.InterfaceC14119e
            public final void onState(int i) {
                this.f46743a.lambda$initMediaPlayListener$6(i);
            }
        });
        vja.getInstance().setSeekCallback(new vja.InterfaceC14121g() { // from class: jfi
            @Override // p000.vja.InterfaceC14121g
            public final void onSeek(int i, float f, boolean z, boolean z2) {
                this.f50460a.lambda$initMediaPlayListener$7(i, f, z, z2);
            }
        });
        CustomSeekBar customSeekBar = ((C11987rb) this.binding).f77622F;
        vja vjaVar = vja.getInstance();
        Objects.requireNonNull(vjaVar);
        customSeekBar.setOnProgressChangeListener(new uei(vjaVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMediaPlayListener$6(int i) {
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
    public /* synthetic */ void lambda$initMediaPlayListener$7(int i, float f, boolean z, boolean z2) {
        if (isFinishing()) {
            return;
        }
        ((C11987rb) this.binding).f77622F.setProgress(f);
        ((C11987rb) this.binding).f77625M.setText(b40.secondsToHMS(((long) i) / 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initView$1(View view) {
        if (b40.isFastClick(300L)) {
            return;
        }
        vja.getInstance().seekTo(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initView$2(View view) {
        if (b40.isFastClick(300L)) {
            return;
        }
        vja.getInstance().seekTo(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$3(View view) {
        if (this.f26443b != null) {
            String string = ((C11987rb) this.binding).f77630b.getText().toString();
            if (!TextUtils.isEmpty(string)) {
                this.f26443b.setContent(string);
            }
            String string2 = ((C11987rb) this.binding).f77631c.getText().toString();
            if (!TextUtils.isEmpty(string2)) {
                this.f26443b.setTitle(string2);
            }
            this.f26445d.updateMeetInfo(this.f26443b);
            ToastUtils.showShort(getString(C4297R.string.save_success));
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$4(boolean z) {
        if (b40.isFastClick(300L)) {
            return;
        }
        if (z) {
            ((C11987rb) this.binding).f77634f.setImageResource(C4297R.drawable.ic_play_stop_v1);
            C11006b c11006b = this.f26444c;
            if (c11006b != null) {
                c11006b.start();
                return;
            }
            return;
        }
        ((C11987rb) this.binding).f77634f.setImageResource(C4297R.drawable.ic_play_start_v1);
        C11006b c11006b2 = this.f26444c;
        if (c11006b2 != null) {
            c11006b2.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$5(View view) {
        vja.getInstance().playOrPause(new vja.InterfaceC14120f() { // from class: hfi
            @Override // p000.vja.InterfaceC14120f
            public final void onState(boolean z) {
                this.f43401a.lambda$initView$4(z);
            }
        });
    }

    private void refreshInitBtnState() {
        ((C11987rb) this.binding).f77625M.setText(b40.secondsToHMS(0L));
        ((C11987rb) this.binding).f77622F.setProgress(0.0f);
        ((C11987rb) this.binding).f77634f.setImageResource(C4297R.drawable.ic_play_start_v1);
        C11006b c11006b = this.f26444c;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    private void refreshPauseBtnState() {
        ((C11987rb) this.binding).f77634f.setImageResource(C4297R.drawable.ic_play_start_v1);
        C11006b c11006b = this.f26444c;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    private void refreshPlayingBtnState() {
        ((C11987rb) this.binding).f77634f.setImageResource(C4297R.drawable.ic_play_stop_v1);
        C11006b c11006b = this.f26444c;
        if (c11006b != null) {
            c11006b.start();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        this.f26445d = VoiceNotesDatabase.getDatabase(this).messageDao();
        this.f26442a = getIntent().getLongExtra("mid", 0L);
        findMeeting();
        try {
            C11006b c11006b = new C11006b(getResources(), C4297R.drawable.wave);
            this.f26444c = c11006b;
            c11006b.stop();
            this.f26444c.seekToFrame(0);
            ((C11987rb) this.binding).f77623H.setImageDrawable(this.f26444c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        m8525m(this);
        ((C11987rb) this.binding).f77624L.setOnClickListener(new View.OnClickListener() { // from class: cfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16456a.lambda$initView$0(view);
            }
        });
        T t = this.binding;
        b1i.setupTextWatcher(((C11987rb) t).f77631c, ((C11987rb) t).f77628X);
        ((C11987rb) this.binding).f77633e.setOnClickListener(new View.OnClickListener() { // from class: dfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceNoteRecordEditDetailActivity.lambda$initView$1(view);
            }
        });
        ((C11987rb) this.binding).f77632d.setOnClickListener(new View.OnClickListener() { // from class: efi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceNoteRecordEditDetailActivity.lambda$initView$2(view);
            }
        });
        ((C11987rb) this.binding).f77628X.setOnClickListener(new View.OnClickListener() { // from class: ffi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36497a.lambda$initView$3(view);
            }
        });
        ((C11987rb) this.binding).f77634f.setOnClickListener(new View.OnClickListener() { // from class: gfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39746a.lambda$initView$5(view);
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C11987rb getViewBinding() {
        return C11987rb.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: m */
    public void m8525m(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C11006b c11006b = this.f26444c;
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
        C11006b c11006b = this.f26444c;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        C11006b c11006b;
        super.onResume();
        ((C11987rb) this.binding).f77634f.setImageResource(vja.getInstance().f91382d ? C4297R.drawable.ic_play_stop_v1 : C4297R.drawable.ic_play_start_v1);
        ((C11987rb) this.binding).f77622F.setProgress(vja.getInstance().getSeekPercent());
        if (!vja.getInstance().f91382d || (c11006b = this.f26444c) == null) {
            return;
        }
        c11006b.start();
    }
}
