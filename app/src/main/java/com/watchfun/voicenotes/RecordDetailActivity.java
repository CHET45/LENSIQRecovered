package com.watchfun.voicenotes;

import android.app.Activity;
import android.content.Intent;
import android.media.audiofx.Visualizer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import p000.C16061zb;
import p000.C9389ml;
import p000.efb;
import p000.ih0;
import p000.vfe;
import pl.droidsonroids.gif.C11006b;

/* JADX INFO: loaded from: classes7.dex */
public class RecordDetailActivity extends BaseActivity<C16061zb> {

    /* JADX INFO: renamed from: H */
    public VoiceNotesDao f26307H;

    /* JADX INFO: renamed from: a */
    public long f26308a;

    /* JADX INFO: renamed from: b */
    public VoiceNotesBean f26309b;

    /* JADX INFO: renamed from: c */
    public ih0 f26310c;

    /* JADX INFO: renamed from: d */
    public boolean f26311d;

    /* JADX INFO: renamed from: m */
    public C11006b f26314m;

    /* JADX INFO: renamed from: e */
    public Visualizer f26312e = null;

    /* JADX INFO: renamed from: f */
    public float f26313f = 0.0f;

    /* JADX INFO: renamed from: C */
    public final int f26305C = 104;

    /* JADX INFO: renamed from: F */
    public Handler f26306F = new Handler(new C4317a());

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordDetailActivity$a */
    public class C4317a implements Handler.Callback {
        public C4317a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@efb Message message) {
            if (message.what != 104 || RecordDetailActivity.this.f26310c == null) {
                return false;
            }
            long currentPosition = RecordDetailActivity.this.f26310c.getCurrentPosition();
            if (currentPosition > RecordDetailActivity.this.f26309b.getRecordTime()) {
                currentPosition = RecordDetailActivity.this.f26309b.getRecordTime();
            }
            ((C16061zb) ((BaseActivity) RecordDetailActivity.this).binding).f104648L.setText(AppUtils.secondsToHMS(currentPosition));
            if (RecordDetailActivity.this.f26306F == null) {
                return false;
            }
            RecordDetailActivity.this.f26306F.sendEmptyMessageDelayed(104, 1000L);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordDetailActivity$b */
    public class ViewOnClickListenerC4318b implements View.OnClickListener {
        public ViewOnClickListenerC4318b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordDetailActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordDetailActivity$c */
    public class ViewOnClickListenerC4319c implements View.OnClickListener {
        public ViewOnClickListenerC4319c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(RecordDetailActivity.this, (Class<?>) RecordEditDetailActivity.class);
            intent.putExtra("mid", RecordDetailActivity.this.f26308a);
            RecordDetailActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordDetailActivity$d */
    public class ViewOnClickListenerC4320d implements View.OnClickListener {
        public ViewOnClickListenerC4320d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RecordDetailActivity.this.f26311d) {
                RecordDetailActivity.this.f26311d = false;
                if (RecordDetailActivity.this.f26310c != null) {
                    RecordDetailActivity.this.f26310c.pausePlay();
                }
                ((C16061zb) ((BaseActivity) RecordDetailActivity.this).binding).f104655e.setImageResource(C4201R.drawable.ic_play_start);
                C11006b c11006b = RecordDetailActivity.this.f26314m;
                if (c11006b != null) {
                    c11006b.stop();
                }
                if (RecordDetailActivity.this.f26306F != null) {
                    RecordDetailActivity.this.f26306F.removeMessages(104);
                    return;
                }
                return;
            }
            RecordDetailActivity.this.f26311d = true;
            if (RecordDetailActivity.this.f26310c != null) {
                RecordDetailActivity.this.f26310c.startPlay(RecordDetailActivity.this.f26309b.getRecordPath());
            }
            ((C16061zb) ((BaseActivity) RecordDetailActivity.this).binding).f104655e.setImageResource(C4201R.drawable.ic_play_stop);
            C11006b c11006b2 = RecordDetailActivity.this.f26314m;
            if (c11006b2 != null) {
                c11006b2.start();
            }
            if (RecordDetailActivity.this.f26306F != null) {
                RecordDetailActivity.this.f26306F.sendEmptyMessageDelayed(104, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.RecordDetailActivity$e */
    public class C4321e implements ih0.InterfaceC7282b {
        public C4321e() {
        }

        @Override // p000.ih0.InterfaceC7282b
        public void onPlaybackCompletion() {
            RecordDetailActivity.this.f26311d = false;
            ((C16061zb) ((BaseActivity) RecordDetailActivity.this).binding).f104648L.setText(AppUtils.secondsToHMS(0L));
            ((C16061zb) ((BaseActivity) RecordDetailActivity.this).binding).f104655e.setImageResource(C4201R.drawable.ic_play_start);
            C11006b c11006b = RecordDetailActivity.this.f26314m;
            if (c11006b != null) {
                c11006b.stop();
            }
            if (RecordDetailActivity.this.f26306F != null) {
                RecordDetailActivity.this.f26306F.removeMessages(104);
            }
        }
    }

    private void findMeeting() {
        VoiceNotesBean voiceNotesBeanFindByMid = this.f26307H.findByMid(this.f26308a);
        this.f26309b = voiceNotesBeanFindByMid;
        if (voiceNotesBeanFindByMid != null) {
            ((C16061zb) this.binding).f104653c.setText(voiceNotesBeanFindByMid.getTitle());
            ((C16061zb) this.binding).f104652b.setText(TextUtils.isEmpty(this.f26309b.language) ? getString(C4201R.string.language_chinese) : this.f26309b.language);
            ((C16061zb) this.binding).f104647H.setText(this.f26309b.getContent());
            if (!TextUtils.isEmpty(this.f26309b.getCreateTime())) {
                ((C16061zb) this.binding).f104650N.setText(AppUtils.getCollectTime(Long.parseLong(this.f26309b.getCreateTime())));
                ((C16061zb) this.binding).f104648L.setText(AppUtils.secondsToHMS(0L));
                ((C16061zb) this.binding).f104649M.setText(AppUtils.secondsToHMS(this.f26309b.getRecordTime()));
            }
            if (this.f26310c == null) {
                ih0 ih0Var = new ih0();
                this.f26310c = ih0Var;
                ih0Var.setOnPlaybackCompletionListener(new C4321e());
            }
        }
    }

    private void setStartBarUtil() {
        C4032a.setStatusBarDark(this, vfe.getInstance().getBoolean("THEME_DARK", false), true, false);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        this.f26307H = VoiceNotesDatabase.getDatabase(this).messageDao();
        this.f26308a = getIntent().getLongExtra("mid", 0L);
        try {
            C11006b c11006b = new C11006b(getResources(), C4201R.drawable.wave);
            this.f26314m = c11006b;
            c11006b.stop();
            this.f26314m.seekToFrame(0);
            ((C16061zb) this.binding).f104646F.setImageDrawable(this.f26314m);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        m8409p(this);
        ((C16061zb) this.binding).f104654d.setOnClickListener(new ViewOnClickListenerC4318b());
        ((C16061zb) this.binding).f104656f.setOnClickListener(new ViewOnClickListenerC4319c());
        ((C16061zb) this.binding).f104655e.setOnClickListener(new ViewOnClickListenerC4320d());
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C16061zb getViewBinding() {
        return C16061zb.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f26306F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f26306F.removeMessages(104);
            this.f26306F = null;
        }
        ih0 ih0Var = this.f26310c;
        if (ih0Var != null) {
            ih0Var.stopPlay();
            this.f26310c.release();
            this.f26310c = null;
        }
        C11006b c11006b = this.f26314m;
        if (c11006b != null) {
            c11006b.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ih0 ih0Var = this.f26310c;
        if (ih0Var == null || !ih0Var.isPlaying()) {
            return;
        }
        this.f26311d = false;
        this.f26310c.pausePlay();
        ((C16061zb) this.binding).f104655e.setImageResource(C4201R.drawable.ic_play_start);
        C11006b c11006b = this.f26314m;
        if (c11006b != null) {
            c11006b.stop();
        }
        Handler handler = this.f26306F;
        if (handler != null) {
            handler.removeMessages(104);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        findMeeting();
    }

    /* JADX INFO: renamed from: p */
    public void m8409p(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }
}
