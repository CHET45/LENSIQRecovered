package com.watchfun.voicenotes;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import p000.C1826bc;
import p000.C9389ml;
import p000.efb;
import p000.ih0;
import pl.droidsonroids.gif.C11006b;

/* JADX INFO: loaded from: classes7.dex */
public class RecordEditDetailActivity extends BaseActivity<C1826bc> {

    /* JADX INFO: renamed from: C */
    public VoiceNotesDao f26320C;

    /* JADX INFO: renamed from: a */
    public long f26321a;

    /* JADX INFO: renamed from: b */
    public VoiceNotesBean f26322b;

    /* JADX INFO: renamed from: c */
    public ih0 f26323c;

    /* JADX INFO: renamed from: d */
    public boolean f26324d;

    /* JADX INFO: renamed from: e */
    public C11006b f26325e;

    /* JADX INFO: renamed from: f */
    public final int f26326f = 104;

    /* JADX INFO: renamed from: m */
    public Handler f26327m = new Handler(new C4322a());

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordEditDetailActivity$a */
    public class C4322a implements Handler.Callback {
        public C4322a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@efb Message message) {
            if (message.what != 104 || RecordEditDetailActivity.this.f26323c == null) {
                return false;
            }
            long currentPosition = RecordEditDetailActivity.this.f26323c.getCurrentPosition();
            if (currentPosition > RecordEditDetailActivity.this.f26322b.getRecordTime()) {
                currentPosition = RecordEditDetailActivity.this.f26322b.getRecordTime();
            }
            ((C1826bc) ((BaseActivity) RecordEditDetailActivity.this).binding).f13280F.setText(AppUtils.secondsToHMS(currentPosition));
            if (RecordEditDetailActivity.this.f26327m == null) {
                return false;
            }
            RecordEditDetailActivity.this.f26327m.sendEmptyMessageDelayed(104, 1000L);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordEditDetailActivity$b */
    public class ViewOnClickListenerC4323b implements View.OnClickListener {
        public ViewOnClickListenerC4323b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordEditDetailActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordEditDetailActivity$c */
    public class ViewOnClickListenerC4324c implements View.OnClickListener {
        public ViewOnClickListenerC4324c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RecordEditDetailActivity.this.f26322b != null) {
                String string = ((C1826bc) ((BaseActivity) RecordEditDetailActivity.this).binding).f13285b.getText().toString();
                if (!TextUtils.isEmpty(string)) {
                    RecordEditDetailActivity.this.f26322b.setContent(string);
                }
                String string2 = ((C1826bc) ((BaseActivity) RecordEditDetailActivity.this).binding).f13286c.getText().toString();
                if (!TextUtils.isEmpty(string2)) {
                    RecordEditDetailActivity.this.f26322b.setTitle(string2);
                }
                RecordEditDetailActivity.this.f26320C.updateMeetInfo(RecordEditDetailActivity.this.f26322b);
                ToastUtils.showShort(RecordEditDetailActivity.this.getString(C4201R.string.save_success));
            }
            RecordEditDetailActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordEditDetailActivity$d */
    public class ViewOnClickListenerC4325d implements View.OnClickListener {
        public ViewOnClickListenerC4325d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RecordEditDetailActivity.this.f26324d) {
                RecordEditDetailActivity.this.f26324d = false;
                if (RecordEditDetailActivity.this.f26323c != null) {
                    RecordEditDetailActivity.this.f26323c.pausePlay();
                }
                ((C1826bc) ((BaseActivity) RecordEditDetailActivity.this).binding).f13287d.setImageResource(C4201R.drawable.ic_play_start);
                C11006b c11006b = RecordEditDetailActivity.this.f26325e;
                if (c11006b != null) {
                    c11006b.stop();
                }
                if (RecordEditDetailActivity.this.f26327m != null) {
                    RecordEditDetailActivity.this.f26327m.removeMessages(104);
                    return;
                }
                return;
            }
            RecordEditDetailActivity.this.f26324d = true;
            if (RecordEditDetailActivity.this.f26323c != null) {
                RecordEditDetailActivity.this.f26323c.startPlay(RecordEditDetailActivity.this.f26322b.getRecordPath());
            }
            ((C1826bc) ((BaseActivity) RecordEditDetailActivity.this).binding).f13287d.setImageResource(C4201R.drawable.ic_play_stop);
            C11006b c11006b2 = RecordEditDetailActivity.this.f26325e;
            if (c11006b2 != null) {
                c11006b2.start();
            }
            if (RecordEditDetailActivity.this.f26327m != null) {
                RecordEditDetailActivity.this.f26327m.sendEmptyMessageDelayed(104, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordEditDetailActivity$e */
    public class C4326e implements ih0.InterfaceC7282b {
        public C4326e() {
        }

        @Override // p000.ih0.InterfaceC7282b
        public void onPlaybackCompletion() {
            RecordEditDetailActivity.this.f26324d = false;
            ((C1826bc) ((BaseActivity) RecordEditDetailActivity.this).binding).f13280F.setText(AppUtils.secondsToHMS(0L));
            ((C1826bc) ((BaseActivity) RecordEditDetailActivity.this).binding).f13287d.setImageResource(C4201R.drawable.ic_play_start);
            C11006b c11006b = RecordEditDetailActivity.this.f26325e;
            if (c11006b != null) {
                c11006b.stop();
            }
            if (RecordEditDetailActivity.this.f26327m != null) {
                RecordEditDetailActivity.this.f26327m.removeMessages(104);
            }
        }
    }

    private void findMeeting() {
        VoiceNotesBean voiceNotesBeanFindByMid = this.f26320C.findByMid(this.f26321a);
        this.f26322b = voiceNotesBeanFindByMid;
        if (voiceNotesBeanFindByMid != null) {
            ((C1826bc) this.binding).f13286c.setText(voiceNotesBeanFindByMid.getTitle());
            ((C1826bc) this.binding).f13285b.setText(this.f26322b.getContent());
            if (!TextUtils.isEmpty(this.f26322b.getCreateTime())) {
                ((C1826bc) this.binding).f13282L.setText(AppUtils.getCollectTime(Long.parseLong(this.f26322b.getCreateTime())));
                ((C1826bc) this.binding).f13281H.setText(AppUtils.secondsToHMS(this.f26322b.getRecordTime()));
            }
            ih0 ih0Var = new ih0();
            this.f26323c = ih0Var;
            ih0Var.setOnPlaybackCompletionListener(new C4326e());
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        this.f26320C = VoiceNotesDatabase.getDatabase(this).messageDao();
        this.f26321a = getIntent().getLongExtra("mid", 0L);
        findMeeting();
        try {
            C11006b c11006b = new C11006b(getResources(), C4201R.drawable.wave);
            this.f26325e = c11006b;
            c11006b.stop();
            this.f26325e.seekToFrame(0);
            ((C1826bc) this.binding).f13290m.setImageDrawable(this.f26325e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        m8424r(this);
        ((C1826bc) this.binding).f13279C.setOnClickListener(new ViewOnClickListenerC4323b());
        T t = this.binding;
        AppUtils.setupTextWatcher(((C1826bc) t).f13286c, ((C1826bc) t).f13283M, false, C4201R.color.text_important_color, C4201R.drawable.shape_add_device_bg, C4201R.color.base_purple, C4201R.drawable.shape_un_add_device_bg);
        ((C1826bc) this.binding).f13283M.setOnClickListener(new ViewOnClickListenerC4324c());
        ((C1826bc) this.binding).f13287d.setOnClickListener(new ViewOnClickListenerC4325d());
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f26327m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f26327m.removeMessages(104);
            this.f26327m = null;
        }
        ih0 ih0Var = this.f26323c;
        if (ih0Var != null) {
            ih0Var.stopPlay();
            this.f26323c.release();
            this.f26323c = null;
        }
        C11006b c11006b = this.f26325e;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ih0 ih0Var = this.f26323c;
        if (ih0Var == null || !ih0Var.isPlaying()) {
            return;
        }
        this.f26324d = false;
        this.f26323c.pausePlay();
        ((C1826bc) this.binding).f13287d.setImageResource(C4201R.drawable.ic_play_start);
        C11006b c11006b = this.f26325e;
        if (c11006b != null) {
            c11006b.stop();
        }
        Handler handler = this.f26327m;
        if (handler != null) {
            handler.removeMessages(104);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C1826bc getViewBinding() {
        return C1826bc.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: r */
    public void m8424r(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }
}
