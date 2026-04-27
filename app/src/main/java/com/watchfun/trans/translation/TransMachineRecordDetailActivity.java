package com.watchfun.trans.translation;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.trans.C4035R;
import com.watchfun.trans.database.transmachine.TransMachineDatabase;
import com.watchfun.transcommon.C4201R;
import java.io.File;
import java.io.IOException;
import java.util.List;
import p000.C7874jd;
import p000.ct5;
import p000.d1h;
import p000.d99;
import p000.dbh;
import p000.g1i;
import p000.jbh;
import p000.m9f;
import p000.mzd;
import p000.uah;
import p000.ybh;
import p000.ztd;

/* JADX INFO: loaded from: classes6.dex */
public class TransMachineRecordDetailActivity extends BaseActivity<C7874jd> {

    /* JADX INFO: renamed from: N */
    public static final String f25781N = "KEY_ID";

    /* JADX INFO: renamed from: C */
    public ybh f25782C;

    /* JADX INFO: renamed from: F */
    public jbh f25783F;

    /* JADX INFO: renamed from: H */
    public mzd f25784H;

    /* JADX INFO: renamed from: L */
    public ztd f25785L;

    /* JADX INFO: renamed from: M */
    public Context f25786M;

    /* JADX INFO: renamed from: a */
    public MediaPlayer f25787a;

    /* JADX INFO: renamed from: b */
    public boolean f25788b = false;

    /* JADX INFO: renamed from: c */
    public boolean f25789c = false;

    /* JADX INFO: renamed from: d */
    public Handler f25790d;

    /* JADX INFO: renamed from: e */
    public Runnable f25791e;

    /* JADX INFO: renamed from: f */
    public TransMachineDatabase f25792f;

    /* JADX INFO: renamed from: m */
    public uah f25793m;

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordDetailActivity$a */
    public class ViewOnClickListenerC4161a implements View.OnClickListener {
        public ViewOnClickListenerC4161a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TransMachineRecordDetailActivity.this.f25788b) {
                TransMachineRecordDetailActivity.this.pauseMusic();
            } else {
                TransMachineRecordDetailActivity.this.startMusic();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordDetailActivity$b */
    public class C4162b implements SeekBar.OnSeekBarChangeListener {
        public C4162b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if (fromUser) {
                TransMachineRecordDetailActivity.this.f25787a.seekTo(progress);
                int currentPosition = TransMachineRecordDetailActivity.this.f25787a.getCurrentPosition();
                Log.e("MediaPlayer", "当前播放位置: " + currentPosition + "ms");
                ((C7874jd) ((BaseActivity) TransMachineRecordDetailActivity.this).binding).f50335M.setText(d1h.formatLongToTime((long) currentPosition));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            TransMachineRecordDetailActivity.this.f25789c = true;
            ((C7874jd) ((BaseActivity) TransMachineRecordDetailActivity.this).binding).f50342d.setImageResource(C4035R.drawable.ic_play_start);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            TransMachineRecordDetailActivity.this.f25789c = false;
            if (TransMachineRecordDetailActivity.this.f25788b) {
                ((C7874jd) ((BaseActivity) TransMachineRecordDetailActivity.this).binding).f50342d.setImageResource(C4035R.drawable.ic_play_stop);
            } else {
                ((C7874jd) ((BaseActivity) TransMachineRecordDetailActivity.this).binding).f50342d.setImageResource(C4035R.drawable.ic_play_start);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordDetailActivity$c */
    public class C4163c implements ztd.InterfaceC16252a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jbh f25796a;

        public C4163c(final jbh val$record) {
            this.f25796a = val$record;
        }

        @Override // p000.ztd.InterfaceC16252a
        public void cancel() {
            TransMachineRecordDetailActivity.this.f25785L.dismiss();
        }

        @Override // p000.ztd.InterfaceC16252a
        public void delete() {
            TransMachineRecordDetailActivity.this.f25793m.deleteRecordById(this.f25796a.getId());
            TransMachineRecordDetailActivity.this.finish();
            TransMachineRecordDetailActivity.this.f25785L.dismiss();
        }

        @Override // p000.ztd.InterfaceC16252a
        public void rename() {
            TransMachineRecordDetailActivity.this.showRenameDialog(this.f25796a);
            TransMachineRecordDetailActivity.this.f25785L.dismiss();
        }

        @Override // p000.ztd.InterfaceC16252a
        public void shareAudio() {
            String sourceVoicePath = this.f25796a.getSourceVoicePath();
            if (TextUtils.isEmpty(sourceVoicePath)) {
                return;
            }
            File file = new File(sourceVoicePath);
            if (file.exists()) {
                m9f.shareMp3File(TransMachineRecordDetailActivity.this, file);
            }
            TransMachineRecordDetailActivity.this.f25785L.dismiss();
        }

        @Override // p000.ztd.InterfaceC16252a
        public void shareText() {
            List<dbh> messageList = this.f25796a.getMessageList();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25796a.getName());
            sb.append(System.lineSeparator());
            sb.append(TransMachineRecordDetailActivity.this.f25786M.getResources().getString(C4035R.string.duration));
            sb.append(g1i.f38277c);
            sb.append(d1h.formatLongToTime(this.f25796a.getDuration()));
            sb.append(d99.f28832c);
            sb.append(TransMachineRecordDetailActivity.this.f25786M.getResources().getString(C4035R.string.time));
            sb.append(d1h.formatLongToDate(this.f25796a.getTime()));
            sb.append(System.lineSeparator());
            for (dbh dbhVar : messageList) {
                sb.append(dbhVar.getResult());
                sb.append(System.lineSeparator());
                sb.append(dbhVar.getTransResult());
                sb.append(System.lineSeparator());
            }
            String string = sb.toString();
            m9f.shareTextFile(TransMachineRecordDetailActivity.this, ct5.getTextPath(TransMachineRecordDetailActivity.this, this.f25796a.getName()), string);
            TransMachineRecordDetailActivity.this.f25785L.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordDetailActivity$d */
    public class C4164d implements mzd.InterfaceC9617b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jbh f25798a;

        public C4164d(final jbh val$record) {
            this.f25798a = val$record;
        }

        @Override // p000.mzd.InterfaceC9617b
        public void onCancel() {
            TransMachineRecordDetailActivity.this.f25784H.dismiss();
        }

        @Override // p000.mzd.InterfaceC9617b
        public void onSure(String name) {
            if (TextUtils.isEmpty(name)) {
                ToastUtils.showShort(TransMachineRecordDetailActivity.this.f25786M.getResources().getString(C4035R.string.title_cannot_be_empty));
            } else {
                String mP3Path = ct5.getMP3Path(TransMachineRecordDetailActivity.this.f25786M, d1h.formatLongToYMDHMSS(this.f25798a.getTime()), name);
                if (ct5.renameFile(mP3Path, this.f25798a)) {
                    TransMachineRecordDetailActivity.this.f25793m.reRecordNameById(this.f25798a.getId(), name, mP3Path);
                    ((C7874jd) ((BaseActivity) TransMachineRecordDetailActivity.this).binding).f50337Q.setText(TransMachineRecordDetailActivity.this.f25793m.getRecordById(this.f25798a.getId()).getName());
                } else {
                    ToastUtils.showShort(TransMachineRecordDetailActivity.this.f25786M.getResources().getString(C4201R.string.reboot_failed));
                }
            }
            TransMachineRecordDetailActivity.this.f25784H.dismiss();
        }
    }

    private void initMediaPlayer(String filePath) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25787a = mediaPlayer;
        try {
            mediaPlayer.setDataSource(filePath);
            this.f25787a.prepareAsync();
            this.f25787a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: qbh
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.f73882a.lambda$initMediaPlayer$3(mediaPlayer2);
                }
            });
            this.f25787a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: rbh
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    return this.f77694a.lambda$initMediaPlayer$5(mediaPlayer2, i, i2);
                }
            });
            this.f25787a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: sbh
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    this.f81171a.lambda$initMediaPlayer$7(mediaPlayer2);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "初始化播放器失败", 0).show();
        }
    }

    private void initSeekBar() {
        ((C7874jd) this.binding).f50333H.setOnSeekBarChangeListener(new C4162b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMediaPlayer$2() {
        int duration = this.f25787a.getDuration();
        if (duration <= 0) {
            Toast.makeText(this, "无法获取音频时长，请检查文件格式", 0).show();
        } else {
            ((C7874jd) this.binding).f50334L.setText(d1h.formatLongToTime(duration));
            ((C7874jd) this.binding).f50333H.setMax(duration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMediaPlayer$3(MediaPlayer mediaPlayer) {
        runOnUiThread(new Runnable() { // from class: vbh
            @Override // java.lang.Runnable
            public final void run() {
                this.f90569a.lambda$initMediaPlayer$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMediaPlayer$4(int i, int i2) {
        Toast.makeText(this, "播放错误：what=" + i + ", extra=" + i2, 1).show();
        this.f25788b = false;
        updatePlayButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initMediaPlayer$5(MediaPlayer mediaPlayer, final int i, final int i2) {
        runOnUiThread(new Runnable() { // from class: ubh
            @Override // java.lang.Runnable
            public final void run() {
                this.f87456a.lambda$initMediaPlayer$4(i, i2);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMediaPlayer$6() {
        this.f25788b = false;
        this.f25787a.seekTo(0);
        ((C7874jd) this.binding).f50333H.setProgress(0);
        ((C7874jd) this.binding).f50335M.setText(d1h.formatLongToTime(0L));
        ((C7874jd) this.binding).f50342d.setImageResource(C4035R.drawable.ic_play_start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMediaPlayer$7(MediaPlayer mediaPlayer) {
        runOnUiThread(new Runnable() { // from class: tbh
            @Override // java.lang.Runnable
            public final void run() {
                this.f84180a.lambda$initMediaPlayer$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$0(View view) {
        showRecordShareDialog(this.f25783F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseMusic() {
        if (this.f25787a.isPlaying()) {
            this.f25787a.pause();
            this.f25788b = false;
            updatePlayButton();
            this.f25790d.removeCallbacks(this.f25791e);
        }
    }

    private void setOnClickListener() {
        ((C7874jd) this.binding).f50342d.setOnClickListener(new ViewOnClickListenerC4161a());
        ((C7874jd) this.binding).f50343e.setOnClickListener(new View.OnClickListener() { // from class: wbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93915a.lambda$setOnClickListener$0(view);
            }
        });
        ((C7874jd) this.binding).f50341c.setOnClickListener(new View.OnClickListener() { // from class: xbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97490a.lambda$setOnClickListener$1(view);
            }
        });
    }

    private void showRecordShareDialog(jbh record) {
        if (this.f25785L == null) {
            this.f25785L = new ztd(this, new C4163c(record));
        }
        if (this.f25785L.isShowing()) {
            return;
        }
        this.f25785L.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRenameDialog(jbh record) {
        if (this.f25784H == null) {
            this.f25784H = new mzd(this, record, new C4164d(record));
        }
        if (this.f25784H.isShowing()) {
            return;
        }
        this.f25784H.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMusic() {
        if (this.f25787a.isPlaying()) {
            return;
        }
        if (this.f25787a.getDuration() / 1000 == this.f25783F.getDuration() / 1000) {
            this.f25787a.seekTo(0);
            ((C7874jd) this.binding).f50333H.setProgress(0);
        }
        this.f25787a.start();
        this.f25788b = true;
        updatePlayButton();
        startProgressUpdater();
    }

    private void startProgressUpdater() {
        updateProgress();
    }

    private void updatePlayButton() {
        ((C7874jd) this.binding).f50342d.setImageResource(this.f25788b ? C4035R.drawable.ic_play_stop : C4035R.drawable.ic_play_start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        if (!this.f25788b || this.f25789c) {
            return;
        }
        int currentPosition = this.f25787a.getCurrentPosition();
        ((C7874jd) this.binding).f50333H.setProgress(currentPosition);
        ((C7874jd) this.binding).f50335M.setText(d1h.formatLongToTime(currentPosition));
        this.f25790d.postDelayed(this.f25791e, 100L);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public C7874jd getViewBinding() {
        return C7874jd.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        long longExtra = getIntent().getLongExtra(f25781N, 0L);
        TransMachineDatabase database = TransMachineDatabase.getDatabase(this);
        this.f25792f = database;
        uah uahVarMessageDao = database.messageDao();
        this.f25793m = uahVarMessageDao;
        jbh recordById = uahVarMessageDao.getRecordById(longExtra);
        this.f25783F = recordById;
        if (recordById != null) {
            List<dbh> messageList = recordById.getMessageList();
            this.f25782C = new ybh(this);
            ((C7874jd) this.binding).f50331C.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.f25782C.setData(messageList);
            ((C7874jd) this.binding).f50331C.setAdapter(this.f25782C);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initSeekBar();
        setOnClickListener();
        jbh jbhVar = this.f25783F;
        if (jbhVar != null) {
            ((C7874jd) this.binding).f50337Q.setText(jbhVar.getName());
            ((C7874jd) this.binding).f50338X.setText(d1h.formatLongToTime(this.f25783F.getDuration()));
            ((C7874jd) this.binding).f50336N.setText(d1h.formatLongToDate(this.f25783F.getTime()));
            if (TextUtils.isEmpty(this.f25783F.getSourceVoicePath())) {
                return;
            }
            initMediaPlayer(this.f25783F.getSourceVoicePath());
        }
    }

    @Override // com.watchfun.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f25790d = new Handler();
        this.f25791e = new Runnable() { // from class: pbh
            @Override // java.lang.Runnable
            public final void run() {
                this.f70249a.updateProgress();
            }
        };
        this.f25786M = this;
        initData();
        initView();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f25790d.removeCallbacks(this.f25791e);
        MediaPlayer mediaPlayer = this.f25787a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f25787a.stop();
            }
            this.f25787a.release();
            this.f25787a = null;
        }
    }
}
