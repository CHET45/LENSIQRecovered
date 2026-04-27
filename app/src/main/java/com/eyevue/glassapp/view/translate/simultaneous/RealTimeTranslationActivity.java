package com.eyevue.glassapp.view.translate.simultaneous;

import android.bluetooth.BluetoothDevice;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.NetworkUtils;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.base.BaseAsrTransActivity;
import com.eyevue.glassapp.database.realtimetranslation.RealTimeDatabase;
import com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao;
import com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageSelect;
import com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageTb;
import com.eyevue.glassapp.view.translate.simultaneous.C2957a;
import com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.translatewebsocket.TransMachineWebSocketManager;
import com.watchfun.translatewebsocket.strategy.TransMachineStrategy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Queue;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import p000.C14540wb;
import p000.a77;
import p000.amc;
import p000.bsd;
import p000.f5d;
import p000.lx2;
import p000.m3h;
import p000.nc2;
import p000.ne4;
import p000.pj4;
import p000.qt2;
import p000.u0b;
import p000.vfe;
import p000.xnc;
import p000.xt5;

/* JADX INFO: loaded from: classes4.dex */
public class RealTimeTranslationActivity extends BaseAsrTransActivity<C14540wb, RealTimeDatabase> implements MediaHelper.OnMediaKeyEvent, BaseAsrTransActivity.InterfaceC2562d {

    /* JADX INFO: renamed from: B2 */
    public static final String f19234B2 = "RealTimeTranslationActivity";

    /* JADX INFO: renamed from: C2 */
    public static final Handler f19235C2 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g2 */
    public boolean f19239g2;

    /* JADX INFO: renamed from: h2 */
    public MediaPlayer f19240h2;

    /* JADX INFO: renamed from: i2 */
    public AudioManager f19241i2;

    /* JADX INFO: renamed from: j2 */
    public RealTimeMessageDao f19242j2;

    /* JADX INFO: renamed from: k2 */
    public bsd f19243k2;

    /* JADX INFO: renamed from: l2 */
    public bsd f19244l2;

    /* JADX INFO: renamed from: m2 */
    public f5d f19245m2;

    /* JADX INFO: renamed from: o2 */
    public boolean f19247o2;

    /* JADX INFO: renamed from: p2 */
    public boolean f19248p2;

    /* JADX INFO: renamed from: q2 */
    public long f19249q2;

    /* JADX INFO: renamed from: r2 */
    public boolean f19250r2;

    /* JADX INFO: renamed from: t2 */
    public boolean f19252t2;

    /* JADX INFO: renamed from: u2 */
    public boolean f19253u2;

    /* JADX INFO: renamed from: v2 */
    public int f19254v2;

    /* JADX INFO: renamed from: w2 */
    public boolean f19255w2;

    /* JADX INFO: renamed from: x2 */
    public RealTimeMessageTb f19256x2;

    /* JADX INFO: renamed from: y2 */
    public boolean f19257y2;

    /* JADX INFO: renamed from: z2 */
    public boolean f19258z2;

    /* JADX INFO: renamed from: e2 */
    public String[] f19237e2 = {xnc.f98582G, "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.WAKE_LOCK"};

    /* JADX INFO: renamed from: f2 */
    public boolean f19238f2 = true;

    /* JADX INFO: renamed from: n2 */
    public final long f19246n2 = 30000;

    /* JADX INFO: renamed from: s2 */
    public Queue<RealTimeMessageTb> f19251s2 = new LinkedList();

    /* JADX INFO: renamed from: A2 */
    public Runnable f19236A2 = new RunnableC2949k();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$a */
    public class ViewOnTouchListenerC2939a implements View.OnTouchListener {
        public ViewOnTouchListenerC2939a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            RealTimeTranslationActivity.this.f19245m2.setTopView(true);
            if (motionEvent.getAction() == 0) {
                if (RealTimeTranslationActivity.this.isAsring()) {
                    RealTimeTranslationActivity realTimeTranslationActivity = RealTimeTranslationActivity.this;
                    realTimeTranslationActivity.setClearScreen(true ^ realTimeTranslationActivity.f19250r2);
                } else {
                    RealTimeTranslationActivity.this.setClearScreen(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$b */
    public class ViewOnTouchListenerC2940b implements View.OnTouchListener {
        public ViewOnTouchListenerC2940b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            RealTimeTranslationActivity.this.f19245m2.setTopView(false);
            if (motionEvent.getAction() == 0) {
                if (RealTimeTranslationActivity.this.isAsring()) {
                    RealTimeTranslationActivity.this.setClearScreen(!r2.f19250r2);
                } else {
                    RealTimeTranslationActivity.this.setClearScreen(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$c */
    public class ViewOnClickListenerC2941c implements View.OnClickListener {
        public ViewOnClickListenerC2941c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - RealTimeTranslationActivity.this.f19249q2 <= 500) {
                return;
            }
            RealTimeTranslationActivity.this.f19249q2 = System.currentTimeMillis();
            RealTimeTranslationActivity.this.f19251s2.clear();
            if (C2957a.getInstance().isPlaying()) {
                RealTimeTranslationActivity.this.f19252t2 = false;
                ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setImageResource(C2531R.drawable.ic_trans_ban_playing);
                ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setScaleX(1.0f);
                ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setScaleY(1.0f);
                RealTimeTranslationActivity.this.stopRecognizerAndRecord();
                RealTimeTranslationActivity.this.clearAudio();
                RealTimeTranslationActivity.this.f19251s2.clear();
                return;
            }
            if (!RealTimeTranslationActivity.this.f19252t2) {
                RealTimeTranslationActivity.this.f19252t2 = true;
                amc.getInstance().resumePlayback();
                amc.getInstance().resumeMp3Playback();
                ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setImageResource(C2531R.drawable.ic_trans_playing);
                Log.i(RealTimeTranslationActivity.f19234B2, "msg =startPlaying=========================.");
                RealTimeTranslationActivity.this.startPlaying();
                return;
            }
            RealTimeTranslationActivity.this.f19252t2 = false;
            ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setImageResource(C2531R.drawable.ic_trans_ban_playing);
            ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setScaleX(1.0f);
            ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setScaleY(1.0f);
            RealTimeTranslationActivity.this.stopRecognizerAndRecord();
            RealTimeTranslationActivity.this.clearAudio();
            RealTimeTranslationActivity.this.f19251s2.clear();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$d */
    public class C2942d implements C2957a.e {
        public C2942d() {
        }

        @Override // com.eyevue.glassapp.view.translate.simultaneous.C2957a.e
        public void onAudioPlaybackCompleted() {
            ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setScaleX(1.0f);
            ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93849N.setScaleY(1.0f);
            if (RealTimeTranslationActivity.this.f19252t2) {
                RealTimeTranslationActivity.this.loopStartPlaying();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$e */
    public class RunnableC2943e implements Runnable {
        public RunnableC2943e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealTimeTranslationActivity.this.startPlaying();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$f */
    public class RunnableC2944f implements Runnable {
        public RunnableC2944f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealTimeTranslationActivity.this.loopStartPlaying();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$g */
    public class RunnableC2945g implements Runnable {
        public RunnableC2945g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealTimeTranslationActivity.this.loopStartPlaying();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$h */
    public class C2946h implements AudioManager.OnAudioFocusChangeListener {
        public C2946h() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$i */
    public class C2947i implements MediaPlayer.OnCompletionListener {
        public C2947i() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            if (RealTimeTranslationActivity.this.f19240h2 != null) {
                RealTimeTranslationActivity.this.f19240h2.reset();
            }
            RealTimeTranslationActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$j */
    public class RunnableC2948j implements Runnable {
        public RunnableC2948j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealTimeTranslationActivity.this.initUI();
            RealTimeTranslationActivity.this.initPcmAudio();
            RealTimeTranslationActivity.this.setPcmAudioEarpieceMode();
            RealTimeTranslationActivity.this.setCurrentStrategy(new TransMachineStrategy());
            RealTimeTranslationActivity.this.startAsrSocket();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$k */
    public class RunnableC2949k implements Runnable {
        public RunnableC2949k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealTimeTranslationActivity.this.f19250r2 = true;
            RealTimeTranslationActivity realTimeTranslationActivity = RealTimeTranslationActivity.this;
            realTimeTranslationActivity.setClearScreen(realTimeTranslationActivity.f19250r2);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$l */
    public class RunnableC2950l implements Runnable {
        public RunnableC2950l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealTimeTranslationActivity.this.f19250r2 = false;
            RealTimeTranslationActivity realTimeTranslationActivity = RealTimeTranslationActivity.this;
            realTimeTranslationActivity.setClearScreen(realTimeTranslationActivity.f19250r2);
            ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93861c2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$m */
    public class RunnableC2951m implements Runnable {
        public RunnableC2951m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealTimeTranslationActivity.this.f19242j2.deleteAll();
            ArrayList<RealTimeMessageSelect> data = RealTimeTranslationActivity.this.f19244l2.getData();
            for (int i = 0; i < data.size(); i++) {
                xt5.delete(data.get(i).getXfTransFreelyMessage().getVoicePath());
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$n */
    public class ViewOnClickListenerC2952n implements View.OnClickListener {
        public ViewOnClickListenerC2952n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            RealTimeTranslationActivity realTimeTranslationActivity = RealTimeTranslationActivity.this;
            realTimeTranslationActivity.f19247o2 = realTimeTranslationActivity.isAsring();
            RealTimeTranslationActivity.this.f19248p2 = true;
            RealTimeTranslationActivity.this.f19253u2 = false;
            RealTimeTranslationActivity realTimeTranslationActivity2 = RealTimeTranslationActivity.this;
            realTimeTranslationActivity2.startSelectTransActivity(((C14540wb) realTimeTranslationActivity2.f18225b).f93858b.getText().toString(), ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93864e.getText().toString(), 1, TransActionEnumMode.DUAL_SINGLE_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$o */
    public class ViewOnClickListenerC2953o implements View.OnClickListener {

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$o$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RealTimeTranslationActivity.this.init();
                RealTimeTranslationActivity.this.startAsr(90000L);
            }
        }

        public ViewOnClickListenerC2953o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - RealTimeTranslationActivity.this.f19249q2 <= 500) {
                return;
            }
            RealTimeTranslationActivity.this.f19249q2 = System.currentTimeMillis();
            RealTimeTranslationActivity.this.f19258z2 = true;
            RealTimeTranslationActivity.this.exchangeLanguage();
            TextView textView = ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93858b;
            RealTimeTranslationActivity realTimeTranslationActivity = RealTimeTranslationActivity.this;
            textView.setText(AiLangUtil.getValue(realTimeTranslationActivity, realTimeTranslationActivity.f18224a2.getKeyName()));
            TextView textView2 = ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93864e;
            RealTimeTranslationActivity realTimeTranslationActivity2 = RealTimeTranslationActivity.this;
            textView2.setText(AiLangUtil.getValue(realTimeTranslationActivity2, realTimeTranslationActivity2.f18226b2.getKeyName()));
            if (RealTimeTranslationActivity.this.isAsring()) {
                RealTimeTranslationActivity.this.stopAsr();
                C2478k.runOnUiThreadDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$p */
    public class ViewOnClickListenerC2954p implements View.OnClickListener {
        public ViewOnClickListenerC2954p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            RealTimeTranslationActivity realTimeTranslationActivity = RealTimeTranslationActivity.this;
            realTimeTranslationActivity.f19247o2 = realTimeTranslationActivity.isAsring();
            RealTimeTranslationActivity.this.f19248p2 = true;
            RealTimeTranslationActivity.this.f19253u2 = false;
            RealTimeTranslationActivity realTimeTranslationActivity2 = RealTimeTranslationActivity.this;
            realTimeTranslationActivity2.startSelectTransActivity(((C14540wb) realTimeTranslationActivity2.f18225b).f93864e.getText().toString(), ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93858b.getText().toString(), 2, TransActionEnumMode.DUAL_SINGLE_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$q */
    public class ViewOnClickListenerC2955q implements View.OnClickListener {
        public ViewOnClickListenerC2955q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - RealTimeTranslationActivity.this.f19249q2 <= 500) {
                return;
            }
            RealTimeTranslationActivity.this.f19249q2 = System.currentTimeMillis();
            if (!RealTimeTranslationActivity.this.isAsring()) {
                RealTimeTranslationActivity.f19235C2.removeCallbacks(RealTimeTranslationActivity.this.f19236A2);
                RealTimeTranslationActivity.f19235C2.postDelayed(RealTimeTranslationActivity.this.f19236A2, 30000L);
                RealTimeTranslationActivity.this.startGptVoice();
            } else {
                RealTimeTranslationActivity.f19235C2.removeCallbacks(RealTimeTranslationActivity.this.f19236A2);
                ((C14540wb) RealTimeTranslationActivity.this.f18225b).f93861c2.setVisibility(8);
                RealTimeTranslationActivity.this.f19250r2 = false;
                RealTimeTranslationActivity realTimeTranslationActivity = RealTimeTranslationActivity.this;
                realTimeTranslationActivity.setClearScreen(realTimeTranslationActivity.f19250r2);
                RealTimeTranslationActivity.this.voiceViewGone();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.RealTimeTranslationActivity$r */
    public class ViewOnClickListenerC2956r implements View.OnClickListener {
        public ViewOnClickListenerC2956r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!RealTimeTranslationActivity.this.isAsring()) {
                RealTimeTranslationActivity.this.setClearScreen(false);
            } else {
                RealTimeTranslationActivity.this.setClearScreen(!r2.f19250r2);
            }
        }
    }

    private void audioStopMusic() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f19241i2 = audioManager;
        sendPauseKeyEvent(audioManager);
        this.f19241i2.requestAudioFocus(new C2946h(), 3, 1);
    }

    private void autoStartAsr() {
        if (findUnPermissions(this.f19237e2).length <= 0 && this.f19238f2) {
            this.f19238f2 = false;
            Log.e(f19234B2, "msg = 自动启动语音识别.");
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: vrd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92090a.lambda$autoStartAsr$0();
                }
            }, 1000L);
        }
    }

    private RealTimeMessageTb copyMessage(RealTimeMessageTb source) {
        RealTimeMessageTb realTimeMessageTb = new RealTimeMessageTb();
        realTimeMessageTb.setMessageTime(source.getMessageTime());
        realTimeMessageTb.setPause(source.isPause());
        realTimeMessageTb.setIsGptOrXF(source.getIsGptOrXF());
        realTimeMessageTb.setType(source.getType());
        realTimeMessageTb.setIsLangCode(source.getIsLangCode());
        realTimeMessageTb.setResult(source.getResult());
        realTimeMessageTb.setTransResult(source.getTransResult());
        realTimeMessageTb.setVoicePath(source.getVoicePath());
        return realTimeMessageTb;
    }

    private String[] findUnPermissions(String[] wanted) {
        ArrayList arrayList = new ArrayList();
        for (String str : wanted) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private void gptVoice() {
        showGptVoice();
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: trd
            @Override // java.lang.Runnable
            public final void run() {
                this.f85677a.lambda$hideVoiceView$4();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f19240h2 = mediaPlayer;
        mediaPlayer.reset();
    }

    private void initRv() {
        ((C14540wb) this.f18225b).f93857a2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((C14540wb) this.f18225b).f93859b2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f19243k2 = new bsd(this, ((C14540wb) this.f18225b).f93857a2, this.f19242j2, true);
        this.f19244l2 = new bsd(this, ((C14540wb) this.f18225b).f93859b2, this.f19242j2, false);
        List<RealTimeMessageTb> latestData = this.f19239g2 ? this.f19242j2.getLatestData() : new ArrayList<>();
        if (nc2.isEmpty(latestData)) {
            ((C14540wb) this.f18225b).f93854Z.setVisibility(8);
            RealTimeMessageTb realTimeMessageTb = new RealTimeMessageTb();
            realTimeMessageTb.setResult(a77.C0077a.f542d);
            realTimeMessageTb.setTransResult(a77.C0077a.f542d);
            this.f19243k2.addData(realTimeMessageTb);
            this.f19244l2.addData(realTimeMessageTb);
        } else {
            ((C14540wb) this.f18225b).f93868m.setVisibility(8);
            ((C14540wb) this.f18225b).f93866f.setVisibility(0);
            Collections.reverse(latestData);
            RealTimeMessageTb realTimeMessageTb2 = new RealTimeMessageTb();
            realTimeMessageTb2.setResult(a77.C0077a.f542d);
            realTimeMessageTb2.setTransResult(a77.C0077a.f542d);
            latestData.add(realTimeMessageTb2);
            this.f19243k2.setData(latestData);
            this.f19244l2.setData(latestData);
            ((C14540wb) this.f18225b).f93861c2.setVisibility(8);
        }
        ((C14540wb) this.f18225b).f93857a2.scrollToPosition(this.f19243k2.getItemCount() - 1);
        ((C14540wb) this.f18225b).f93857a2.setAdapter(this.f19243k2);
        ((C14540wb) this.f18225b).f93857a2.setItemAnimator(null);
        ((C14540wb) this.f18225b).f93859b2.scrollToPosition(this.f19244l2.getItemCount() - 1);
        ((C14540wb) this.f18225b).f93859b2.setAdapter(this.f19244l2);
        ((C14540wb) this.f18225b).f93859b2.setItemAnimator(null);
        f5d f5dVar = new f5d();
        this.f19245m2 = f5dVar;
        T t = this.f18225b;
        f5dVar.syncPositions(((C14540wb) t).f93857a2, ((C14540wb) t).f93859b2);
        markAllAsPlayed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initUI() {
        initRv();
        ((C14540wb) this.f18225b).f93847M.setOnClickListener(new View.OnClickListener() { // from class: xrd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99066a.lambda$initUI$1(view);
            }
        });
        ((C14540wb) this.f18225b).f93850Q.setOnClickListener(new View.OnClickListener() { // from class: yrd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102787a.lambda$initUI$2(view);
            }
        });
        ((C14540wb) this.f18225b).f93858b.setOnClickListener(new ViewOnClickListenerC2952n());
        ((C14540wb) this.f18225b).f93844F.setOnClickListener(new ViewOnClickListenerC2953o());
        ((C14540wb) this.f18225b).f93864e.setOnClickListener(new ViewOnClickListenerC2954p());
        ((C14540wb) this.f18225b).f93852X.setOnClickListener(new ViewOnClickListenerC2955q());
        ((C14540wb) this.f18225b).f93855Z1.setOnClickListener(new ViewOnClickListenerC2956r());
        ((C14540wb) this.f18225b).f93848M1.setOnClickListener(new View.OnClickListener() { // from class: zrd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105859a.lambda$initUI$3(view);
            }
        });
        ((C14540wb) this.f18225b).f93857a2.setOnTouchListener(new ViewOnTouchListenerC2939a());
        ((C14540wb) this.f18225b).f93859b2.setOnTouchListener(new ViewOnTouchListenerC2940b());
        ((C14540wb) this.f18225b).f93849N.setOnClickListener(new ViewOnClickListenerC2941c());
        C2957a.getInstance().setAudioPlayerListener(new C2942d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$autoStartAsr$0() {
        ((C14540wb) this.f18225b).f93852X.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$4() {
        if (((C14540wb) this.f18225b).f93846L.getVisibility() == 0) {
            ((C14540wb) this.f18225b).f93846L.setVisibility(8);
        }
        this.f19249q2 = System.currentTimeMillis();
        bsd bsdVar = this.f19243k2;
        if (bsdVar != null && bsdVar.getItemCount() > 0) {
            ((C14540wb) this.f18225b).f93866f.setVisibility(0);
        } else {
            ((C14540wb) this.f18225b).f93866f.setVisibility(8);
            ((C14540wb) this.f18225b).f93854Z.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$1(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$2(View view) {
        vfe.getInstance().putBoolean(qt2.f75579c, false);
        C2478k.getSinglePool().execute(new RunnableC2951m());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$3(View view) {
        if (isAsring()) {
            setClearScreen(!this.f19250r2);
        } else {
            setClearScreen(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAsrResultOnce$5(boolean z, String str, String str2, String str3, String str4) {
        if (z) {
            Log.i(f19234B2, "msg ==========================================");
            Log.e(f19234B2, "msg =" + str + " isFinal=" + z + " mp3Filepath =" + str2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("msg =");
            sb.append(str);
            sb.append(" isFinal=");
            sb.append(z);
            sb.append(" mp3Filepath =");
            sb.append(str2);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.f19252t2 && !this.f19253u2) {
                loopStartPlaying();
            }
            RealTimeMessageTb realTimeMessageTbQueryByVoicePath = this.f19242j2.queryByVoicePath(str2);
            this.f19256x2 = realTimeMessageTbQueryByVoicePath;
            if (realTimeMessageTbQueryByVoicePath == null) {
                RealTimeMessageTb realTimeMessageTb = new RealTimeMessageTb();
                realTimeMessageTb.setMessageTime(Long.parseLong(str3));
                realTimeMessageTb.setPause(false);
                if (this.f18214M == this.f18216N && this.f18226b2.isUseMicTTS()) {
                    realTimeMessageTb.setIsGptOrXF(3);
                } else if (this.f18214M == this.f18217Q && this.f18224a2.isUseMicTTS()) {
                    realTimeMessageTb.setIsGptOrXF(3);
                } else {
                    realTimeMessageTb.setIsGptOrXF(1);
                }
                realTimeMessageTb.setType(this.f18214M);
                realTimeMessageTb.setIsLangCode((this.f18214M == this.f18216N ? this.f18226b2 : this.f18224a2).getIatLanguage());
                realTimeMessageTb.setResult(str);
                realTimeMessageTb.setTransResult(str4);
                if (!TextUtils.isEmpty(str2)) {
                    realTimeMessageTb.setVoicePath(str2);
                }
                this.f19251s2.offer(realTimeMessageTb);
                Log.i(f19234B2, "msg =插入内容：" + str + " id=" + this.f19242j2.insert(realTimeMessageTb) + " 音频文件:" + realTimeMessageTb.getVoicePath());
            } else {
                Log.i(f19234B2, "msg = 需要更新内容");
            }
        }
        showTextGPTResult(str, str4, str2, str3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$7(MediaPlayer mediaPlayer) {
        this.f19240h2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$6(ArrayList arrayList, String str, int i) {
        if (TextUtils.isEmpty(((RealTimeMessageSelect) arrayList.get(i)).getXfTransFreelyMessage().getVoicePath())) {
            return false;
        }
        return ((RealTimeMessageSelect) arrayList.get(i)).getXfTransFreelyMessage().getVoicePath().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loopStartPlaying() {
        if (this.f19255w2) {
            return;
        }
        C2478k.runOnUiThreadDelayed(new RunnableC2943e(), 200L);
    }

    private void markAllAsPlayed() {
        ArrayList<RealTimeMessageSelect> data;
        bsd bsdVar = this.f19244l2;
        if (bsdVar == null || (data = bsdVar.getData()) == null) {
            return;
        }
        for (RealTimeMessageSelect realTimeMessageSelect : data) {
            if (realTimeMessageSelect != null && realTimeMessageSelect.getXfTransFreelyMessage() != null) {
                realTimeMessageSelect.setAlreadyPlayed(true);
                realTimeMessageSelect.getXfTransFreelyMessage().setVoicePath(null);
            }
        }
        this.f19251s2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearScreen(boolean isClear) {
        this.f19250r2 = isClear;
        ((C14540wb) this.f18225b).f93851V1.setVisibility(isClear ? 4 : 0);
        Handler handler = f19235C2;
        handler.removeCallbacks(this.f19236A2);
        if (isClear || !isAsring()) {
            return;
        }
        handler.postDelayed(this.f19236A2, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPcmAudioEarpieceMode() {
        try {
            amc amcVar = amc.getInstance();
            if (amcVar.isInitialized()) {
                amc.EnumC0331d enumC0331d = amc.EnumC0331d.TRANSLATE;
                amcVar.setCurrentActiveModule(enumC0331d);
                amcVar.setModuleChannelSwitchEnable(enumC0331d, true);
                amcVar.switchAudioChannel(u0b.EnumC13307d.EARPIECE);
                C2473f.m4167d(f19234B2, "TranslationMachineActivity: PcmNewAudioManager earpiece mode set");
            }
        } catch (Exception e) {
            C2473f.m4168e(f19234B2, "TranslationMachineActivity: Failed to set earpiece mode: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            this.f19240h2.reset();
            this.f19240h2.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f19240h2.setDataSource(this, Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C2531R.raw.aaa));
            this.f19240h2.prepareAsync();
            sendPauseKeyEvent(this.f19241i2);
            this.f19240h2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: asd
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f11773a.lambda$setupMediaPlayer$7(mediaPlayer);
                }
            });
            this.f19240h2.setOnCompletionListener(new C2947i());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showGptVoice() {
        this.f19243k2.setBeginning(true);
        this.f19244l2.setBeginning(true);
        ((C14540wb) this.f18225b).f93854Z.setVisibility(8);
        if (this.f19243k2.getData() != null && (this.f19243k2.getData().isEmpty() || this.f19243k2.getData().size() == 1)) {
            ((C14540wb) this.f18225b).f93861c2.setVisibility(0);
        }
        ((C14540wb) this.f18225b).f93846L.setVisibility(0);
        ((C14540wb) this.f18225b).f93866f.setVisibility(0);
        if (!isDestroyed() && !isFinishing()) {
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C2531R.drawable.realtime_wave)).diskCacheStrategy(ne4.f64120d).into(((C14540wb) this.f18225b).f93846L);
        }
        ((C14540wb) this.f18225b).f93868m.setVisibility(8);
        if (isAsring()) {
            stopAsr();
        }
        startAsr(90000L);
    }

    private void showTextGPTResult(String text, String translateString, final String mp3Filepath, String startTimeId, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        long j = Long.parseLong(startTimeId);
        final ArrayList<RealTimeMessageSelect> data = this.f19243k2.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: wrd
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return RealTimeTranslationActivity.lambda$showTextGPTResult$6(data, mp3Filepath, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent() && !this.f19257y2) {
            if (isFinalResult) {
                this.f19257y2 = true;
            }
            RealTimeMessageTb xfTransFreelyMessage = data.get(optionalIntFindFirst.getAsInt()).getXfTransFreelyMessage();
            xfTransFreelyMessage.setResult(text);
            xfTransFreelyMessage.setTransResult(translateString);
            RealTimeMessageTb realTimeMessageTbCopyMessage = copyMessage(xfTransFreelyMessage);
            RealTimeMessageTb realTimeMessageTbCopyMessage2 = copyMessage(xfTransFreelyMessage);
            this.f19243k2.updateMessage(realTimeMessageTbCopyMessage, r9.getItemCount() - 2);
            this.f19244l2.updateMessage(realTimeMessageTbCopyMessage2, r7.getItemCount() - 2);
            ((C14540wb) this.f18225b).f93857a2.scrollToPosition(this.f19243k2.getItemCount() - 1);
            ((C14540wb) this.f18225b).f93859b2.scrollToPosition(this.f19244l2.getItemCount() - 1);
            return;
        }
        this.f19257y2 = false;
        RealTimeMessageTb realTimeMessageTb = new RealTimeMessageTb();
        realTimeMessageTb.setMessageTime(j);
        realTimeMessageTb.setPause(false);
        if (this.f18214M == this.f18216N && this.f18226b2.isUseMicTTS()) {
            realTimeMessageTb.setIsGptOrXF(3);
        } else if (this.f18214M == this.f18217Q && this.f18224a2.isUseMicTTS()) {
            realTimeMessageTb.setIsGptOrXF(3);
        } else {
            realTimeMessageTb.setIsGptOrXF(1);
        }
        realTimeMessageTb.setType(this.f18214M);
        realTimeMessageTb.setIsLangCode((this.f18214M == this.f18216N ? this.f18226b2 : this.f18224a2).getIatLanguage());
        realTimeMessageTb.setResult(text);
        realTimeMessageTb.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            realTimeMessageTb.setVoicePath(mp3Filepath);
        }
        RealTimeMessageTb realTimeMessageTbCopyMessage3 = copyMessage(realTimeMessageTb);
        RealTimeMessageTb realTimeMessageTbCopyMessage4 = copyMessage(realTimeMessageTb);
        ((C14540wb) this.f18225b).f93861c2.setVisibility(8);
        bsd bsdVar = this.f19243k2;
        bsdVar.addData(bsdVar.getItemCount() - 1, realTimeMessageTbCopyMessage3);
        bsd bsdVar2 = this.f19244l2;
        bsdVar2.addData(bsdVar2.getItemCount() - 1, realTimeMessageTbCopyMessage4);
        ((C14540wb) this.f18225b).f93857a2.scrollToPosition(this.f19243k2.getItemCount() - 1);
        ((C14540wb) this.f18225b).f93859b2.scrollToPosition(this.f19244l2.getItemCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startGptVoice() {
        if (checkAndRequestPermissions()) {
            if (!NetworkUtils.isConnected()) {
                m3h.showToastShort(getString(C2531R.string.eyevue_loading_no_net_view_text_hint));
                return;
            }
            ((C14540wb) this.f18225b).f93859b2.setVisibility(0);
            ((C14540wb) this.f18225b).f93851V1.setVisibility(0);
            ((C14540wb) this.f18225b).f93865e2.setVisibility(0);
            bsd bsdVar = this.f19243k2;
            if (bsdVar != null && bsdVar.getItemCount() > 0) {
                ((C14540wb) this.f18225b).f93857a2.scrollToPosition(this.f19243k2.getItemCount() - 1);
            }
            bsd bsdVar2 = this.f19244l2;
            if (bsdVar2 != null && bsdVar2.getItemCount() > 0) {
                ((C14540wb) this.f18225b).f93859b2.scrollToPosition(this.f19244l2.getItemCount() - 1);
            }
            this.f18214M = this.f18216N;
            ((C14540wb) this.f18225b).f93852X.setImageResource(C2531R.drawable.ic_broadcast_pause);
            gptVoice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void startPlaying() {
        RealTimeMessageSelect realTimeMessageSelect;
        if (this.f19248p2) {
            Log.i(f19234B2, "msg =选择语言中，停止...======================================");
            return;
        }
        this.f19253u2 = true;
        if (C2957a.getInstance().isPlaying()) {
            Log.i(f19234B2, "msg =播报中，请等待======================================");
            loopStartPlaying();
            return;
        }
        if (!this.f19252t2) {
            ((C14540wb) this.f18225b).f93849N.setImageResource(C2531R.drawable.ic_trans_ban_playing);
            ((C14540wb) this.f18225b).f93849N.setScaleX(1.0f);
            ((C14540wb) this.f18225b).f93849N.setScaleY(1.0f);
            Log.i(f19234B2, "msg =停止播报中======================================");
            return;
        }
        RealTimeMessageTb realTimeMessageTbPoll = this.f19251s2.poll();
        ((C14540wb) this.f18225b).f93849N.setImageResource(C2531R.drawable.ic_trans_playing);
        RealTimeMessageSelect realTimeMessageSelect2 = this.f19244l2.getItemCount() + (-2) >= 0 ? this.f19244l2.getData().get(this.f19244l2.getItemCount() - 2) : null;
        if (realTimeMessageTbPoll == null || TextUtils.isEmpty(realTimeMessageTbPoll.getVoicePath())) {
            if (isAsring()) {
                if (this.f19244l2.getItemCount() - 2 >= 0) {
                    realTimeMessageSelect2 = this.f19244l2.getData().get(this.f19244l2.getItemCount() - 2);
                }
                if ((realTimeMessageSelect2 == null || realTimeMessageSelect2.isAlreadyPlayed() || !xt5.isFileExists(realTimeMessageSelect2.getXfTransFreelyMessage().getVoicePath())) && this.f19244l2.getItemCount() - 3 >= 0 && (realTimeMessageSelect = this.f19244l2.getData().get(this.f19244l2.getItemCount() - 2)) != null && !realTimeMessageSelect.isAlreadyPlayed()) {
                    realTimeMessageSelect2 = this.f19244l2.getData().get(this.f19244l2.getItemCount() - 3);
                }
            }
            if (realTimeMessageSelect2 == null || realTimeMessageSelect2.isAlreadyPlayed()) {
                Log.i(f19234B2, "msg =音频全部播报完毕======================================");
                this.f19253u2 = false;
                ((C14540wb) this.f18225b).f93849N.setScaleX(1.0f);
                ((C14540wb) this.f18225b).f93849N.setScaleY(1.0f);
            } else {
                String voicePath = realTimeMessageSelect2.getXfTransFreelyMessage().getVoicePath();
                if (xt5.isFileExists(voicePath)) {
                    realTimeMessageSelect2.setAlreadyPlayed(true);
                    Log.e(f19234B2, "msg =列表，播报======================================:" + realTimeMessageSelect2.getXfTransFreelyMessage().getTransResult() + " 音频文件:" + voicePath);
                    playFile(xt5.getFileByPath(voicePath));
                } else {
                    Log.i(f19234B2, "msg =列表，音频文件未生成======================================:" + voicePath);
                    C2478k.runOnUiThreadDelayed(new RunnableC2945g(), 1000L);
                }
            }
        } else {
            ((C14540wb) this.f18225b).f93849N.setScaleX(1.0f);
            ((C14540wb) this.f18225b).f93849N.setScaleY(1.0f);
            if (xt5.isFileExists(realTimeMessageTbPoll.getVoicePath())) {
                Log.e(f19234B2, "msg =队列，播报======================================:" + realTimeMessageTbPoll.getTransResult() + " 音频文件:" + realTimeMessageTbPoll.getVoicePath());
                if (realTimeMessageSelect2 != null && !realTimeMessageSelect2.isAlreadyPlayed()) {
                    realTimeMessageSelect2.setAlreadyPlayed(true);
                    if (this.f19244l2.getItemCount() - 3 >= 0) {
                        this.f19244l2.getData().get(this.f19244l2.getItemCount() - 3).setAlreadyPlayed(true);
                    }
                }
                this.f19254v2 = 0;
                playFile(xt5.getFileByPath(realTimeMessageTbPoll.getVoicePath()));
            } else {
                Log.i(f19234B2, "msg =队列，音频文件未生成,重试:" + (this.f19254v2 + 1) + " path:" + realTimeMessageTbPoll.getVoicePath());
                int i = this.f19254v2;
                if (i <= 5) {
                    this.f19254v2 = i + 1;
                    this.f19251s2.offer(realTimeMessageTbPoll);
                    this.f19252t2 = true;
                } else {
                    this.f19254v2 = 0;
                }
                C2478k.runOnUiThreadDelayed(new RunnableC2944f(), 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRecognizerAndRecord() {
        Log.e(f19234B2, "msg = 停止播报.");
        stopPlayback();
        C2957a.getInstance().stopAudio();
        ((C14540wb) this.f18225b).f93849N.setScaleX(1.0f);
        ((C14540wb) this.f18225b).f93849N.setScaleY(1.0f);
        amc.getInstance().pauseMp3Playback();
        if (this.f19248p2) {
            return;
        }
        ((C14540wb) this.f18225b).f93849N.setImageResource(C2531R.drawable.ic_trans_ban_playing);
        this.f19252t2 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        this.f19258z2 = false;
        ((C14540wb) this.f18225b).f93852X.setImageResource(C2531R.drawable.ic_start_recording);
        hideVoiceView();
        stopAsr();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90931V;
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90929U;
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C14540wb) this.f18225b).f93858b.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C14540wb) this.f18225b).f93864e.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initView() {
        super.initView();
        this.f19238f2 = true;
        setOnBluetoothSettingsListener(this);
        this.f19239g2 = vfe.getInstance().getBoolean(qt2.f75579c, false);
        startReceiver();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f19242j2 = ((RealTimeDatabase) this.f18227c).getRealTimeMessageDao();
        C2478k.runOnUiThreadDelayed(new RunnableC2948j(), 500L);
    }

    @Override // p000.InterfaceC12632sk.b
    public void loadAudioFail() {
    }

    @Override // p000.InterfaceC12632sk.b
    public void loadAudioListSuccess(File file) {
        playFile(file);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public RealTimeDatabase getDatabase() {
        return RealTimeDatabase.getDatabase(this);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C14540wb getViewBinding() {
        return C14540wb.inflate(getLayoutInflater());
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onAsrResultOnce(String sourLangeuage, final String result, final String transText, final String mp3Filepath, final String startTimeId, final boolean isFinal) {
        super.onAsrResultOnce(sourLangeuage, result, transText, mp3Filepath, startTimeId, isFinal);
        runOnUiThread(new Runnable() { // from class: urd
            @Override // java.lang.Runnable
            public final void run() {
                this.f88866a.lambda$onAsrResultOnce$5(isFinal, result, mp3Filepath, startTimeId, transText);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        vfe.getInstance().putBoolean(qt2.f75579c, true);
        finish();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onCloseWeb(int close) {
        super.onCloseWeb(close);
        this.f19258z2 = false;
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver();
        stopRecognizerAndRecord();
        Handler handler = f19235C2;
        if (handler != null) {
            handler.removeCallbacks(this.f19236A2);
        }
        this.f19255w2 = true;
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity.InterfaceC2562d
    public void onGetDeviceFail() {
        m3h.showToastShort(getString(C2531R.string.eyevue_bluetooth_is_close));
        finish();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity.InterfaceC2562d
    public void onGetDeviceSuccess(BluetoothDevice device) {
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        voiceViewGone();
        if (isFinishing()) {
            stopAsr();
        }
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, android.app.Activity
    public void onRestart() {
        super.onRestart();
        if (amc.getInstance().isPlaying() && this.f19252t2) {
            amc.getInstance().resumeMp3Playback();
        }
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        setPcmAudioEarpieceMode();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        stopRecognizerAndRecord();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onStopAsrView() {
        super.onStopAsrView();
        Log.i(f19234B2, "msg = 收到停止语音识别回调.");
        if (!this.f19258z2) {
            voiceViewGone();
        }
        f19235C2.removeCallbacks(this.f19236A2);
        runOnUiThread(new RunnableC2950l());
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onWebSocketOpen() {
        super.onWebSocketOpen();
        Log.e(f19234B2, "msg = WebSocket连接成功.");
        autoStartAsr();
    }

    public void playFile(File file) {
        MediaPlayer mediaPlayer = this.f19240h2;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        C2957a.getInstance().playAudioFile(this.f19241i2, file, 3);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity.InterfaceC2562d
    public void searBoundDeviceSuccess(BluetoothDevice device) {
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity.InterfaceC2562d
    public void searBoundDeviceView() {
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void setTransLanguageData(TransLanguageData fromLanguageData, TransLanguageData toLanguageData) {
        super.setTransLanguageData(fromLanguageData, toLanguageData);
        ((C14540wb) this.f18225b).f93858b.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        ((C14540wb) this.f18225b).f93864e.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
        this.f19248p2 = false;
        markAllAsPlayed();
        if (this.f19247o2 && TransMachineWebSocketManager.getInstance().isOpen() && !isAsring()) {
            C2473f.m4173i(f19234B2, "msg = 重新开始语音识别.");
            this.f19249q2 = 0L;
            ((C14540wb) this.f18225b).f93852X.performClick();
            this.f19249q2 = 0L;
            if (this.f19252t2) {
                this.f19252t2 = false;
                ((C14540wb) this.f18225b).f93849N.performClick();
            }
        }
        this.f19247o2 = false;
    }

    public void stopPlayback() {
        MediaPlayer mediaPlayer = this.f19240h2;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f19240h2 = null;
        }
    }
}
