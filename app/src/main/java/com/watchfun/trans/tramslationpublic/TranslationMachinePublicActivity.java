package com.watchfun.trans.tramslationpublic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.NetworkUtils;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.watchfun.base.BaseActivity;
import com.watchfun.trans.C4035R;
import com.watchfun.trans.database.transmachinepublic.TransMachinePublicDatabase;
import com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.base.BaseAsrActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.widget.BottomEditView;
import com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Queue;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import p000.C9783nd;
import p000.a77;
import p000.e5d;
import p000.fbh;
import p000.hbh;
import p000.ibh;
import p000.igg;
import p000.k3h;
import p000.l3h;
import p000.mc2;
import p000.ne4;
import p000.pj4;
import p000.vfe;
import p000.vgh;
import p000.xt5;

/* JADX INFO: loaded from: classes6.dex */
public class TranslationMachinePublicActivity extends BaseAsrActivity<C9783nd, TransMachinePublicDatabase> implements MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: g2 */
    public static final String f25502g2 = "TranslationMachineActivity";

    /* JADX INFO: renamed from: h2 */
    public static final Handler f25503h2 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: F */
    public boolean f25505F;

    /* JADX INFO: renamed from: H */
    public boolean f25506H;

    /* JADX INFO: renamed from: L */
    public boolean f25507L;

    /* JADX INFO: renamed from: M */
    public boolean f25508M;

    /* JADX INFO: renamed from: M1 */
    public boolean f25509M1;

    /* JADX INFO: renamed from: N */
    public boolean f25510N;

    /* JADX INFO: renamed from: Q */
    public boolean f25511Q;

    /* JADX INFO: renamed from: V1 */
    public e5d f25512V1;

    /* JADX INFO: renamed from: X */
    public hbh f25513X;

    /* JADX INFO: renamed from: Y */
    public boolean f25514Y;

    /* JADX INFO: renamed from: Z */
    public int f25515Z;

    /* JADX INFO: renamed from: a */
    public vgh f25517a;

    /* JADX INFO: renamed from: a2 */
    public boolean f25518a2;

    /* JADX INFO: renamed from: b */
    public vgh f25519b;

    /* JADX INFO: renamed from: b2 */
    public String f25520b2;

    /* JADX INFO: renamed from: c */
    public fbh f25521c;

    /* JADX INFO: renamed from: c2 */
    public String f25522c2;

    /* JADX INFO: renamed from: d */
    public MediaPlayer f25523d;

    /* JADX INFO: renamed from: e */
    public AudioManager f25525e;

    /* JADX INFO: renamed from: f */
    public long f25527f;

    /* JADX INFO: renamed from: m */
    public boolean f25529m = true;

    /* JADX INFO: renamed from: C */
    public Queue<hbh> f25504C = new LinkedList();

    /* JADX INFO: renamed from: Z1 */
    public final long f25516Z1 = 30000;

    /* JADX INFO: renamed from: d2 */
    public final BroadcastReceiver f25524d2 = new C4086k();

    /* JADX INFO: renamed from: e2 */
    public Runnable f25526e2 = new RunnableC4091p();

    /* JADX INFO: renamed from: f2 */
    public boolean f25528f2 = true;

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$a */
    public class ViewOnClickListenerC4076a implements View.OnClickListener {
        public ViewOnClickListenerC4076a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TranslationMachinePublicActivity.this.isAsring()) {
                TranslationMachinePublicActivity.this.setClearScreen(false);
            } else {
                TranslationMachinePublicActivity.this.setClearScreen(!r2.f25509M1);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$b */
    public class ViewOnTouchListenerC4077b implements View.OnTouchListener {
        public ViewOnTouchListenerC4077b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            TranslationMachinePublicActivity.this.f25512V1.setTopView(true);
            if (motionEvent.getAction() == 0) {
                if (TranslationMachinePublicActivity.this.isAsring()) {
                    TranslationMachinePublicActivity translationMachinePublicActivity = TranslationMachinePublicActivity.this;
                    translationMachinePublicActivity.setClearScreen(true ^ translationMachinePublicActivity.f25509M1);
                } else {
                    TranslationMachinePublicActivity.this.setClearScreen(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$c */
    public class ViewOnTouchListenerC4078c implements View.OnTouchListener {
        public ViewOnTouchListenerC4078c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            TranslationMachinePublicActivity.this.f25512V1.setTopView(false);
            if (motionEvent.getAction() == 0) {
                if (TranslationMachinePublicActivity.this.isAsring()) {
                    TranslationMachinePublicActivity.this.setClearScreen(!r2.f25509M1);
                } else {
                    TranslationMachinePublicActivity.this.setClearScreen(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$d */
    public class ViewOnClickListenerC4079d implements View.OnClickListener {
        public ViewOnClickListenerC4079d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TranslationMachinePublicActivity.this.f25527f <= 500) {
                return;
            }
            TranslationMachinePublicActivity.this.f25527f = System.currentTimeMillis();
            TranslationMachinePublicActivity.this.voiceViewGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$e */
    public class ViewOnClickListenerC4080e implements View.OnClickListener {
        public ViewOnClickListenerC4080e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - TranslationMachinePublicActivity.this.f25527f <= 500) {
                return;
            }
            TranslationMachinePublicActivity.this.f25527f = System.currentTimeMillis();
            TranslationMachinePublicActivity.this.f25504C.clear();
            if (AudioPlayerManager.getInstance().isPlaying()) {
                TranslationMachinePublicActivity.this.f25506H = false;
                ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setImageResource(C4035R.drawable.ic_trans_ban_playing);
                ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setScaleX(1.0f);
                ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setScaleY(1.0f);
                TranslationMachinePublicActivity.this.stopRecognizerAndRecord();
                TranslationMachinePublicActivity.this.f25504C.clear();
                return;
            }
            if (!TranslationMachinePublicActivity.this.f25506H) {
                TranslationMachinePublicActivity.this.f25506H = true;
                ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setImageResource(C4035R.drawable.ic_trans_playing);
                TranslationMachinePublicActivity.this.startPlaying();
            } else {
                TranslationMachinePublicActivity.this.f25506H = false;
                ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setImageResource(C4035R.drawable.ic_trans_ban_playing);
                ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setScaleX(1.0f);
                ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setScaleY(1.0f);
                TranslationMachinePublicActivity.this.stopRecognizerAndRecord();
                TranslationMachinePublicActivity.this.f25504C.clear();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$f */
    public class C4081f implements AudioPlayerManager.AudioPlayerListener {
        public C4081f() {
        }

        @Override // com.watchfun.transcommon.manager.trans.AudioPlayerManager.AudioPlayerListener
        public void onAudioPlaybackCompleted() {
            ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setScaleX(1.0f);
            ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63981Q.setScaleY(1.0f);
            if (TranslationMachinePublicActivity.this.f25506H) {
                TranslationMachinePublicActivity.this.loopStartPlaying();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$g */
    public class ViewOnClickListenerC4082g implements View.OnClickListener {

        /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$g$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f25537a;

            public a(final View val$v) {
                this.f25537a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25537a.setScaleX(1.0f);
                this.f25537a.setScaleY(1.0f);
            }
        }

        public ViewOnClickListenerC4082g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TranslationMachinePublicActivity.this.isAsring() || TranslationMachinePublicActivity.this.f25519b == null || TranslationMachinePublicActivity.this.f25519b.getItemCount() <= 0) {
                return;
            }
            hbh xfTransFreelyMessage = TranslationMachinePublicActivity.this.f25519b.getData().get(TranslationMachinePublicActivity.this.f25519b.getItemCount() - 1).getXfTransFreelyMessage();
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
            if (!TextUtils.isEmpty(xfTransFreelyMessage.getVoicePath())) {
                if (xt5.isFileExists(xfTransFreelyMessage.getVoicePath())) {
                    TranslationMachinePublicActivity.this.playFile(xt5.getFileByPath(xfTransFreelyMessage.getVoicePath()));
                    return;
                } else {
                    TranslationMachinePublicActivity.this.startTTS(xfTransFreelyMessage.getTransResult(), xfTransFreelyMessage.getIsLangCode(), xfTransFreelyMessage.getVoicePath());
                    return;
                }
            }
            String str = TranslateWebSocketManager.getInstance().getOutputPath() + pj4.f71071b + System.currentTimeMillis() + ".mp3";
            TranslationMachinePublicActivity.this.startTTS(xfTransFreelyMessage.getTransResult(), xfTransFreelyMessage.getIsLangCode(), str);
            xfTransFreelyMessage.setVoicePath(str);
            TranslationMachinePublicActivity.this.f25521c.updateVoicePathByMessageTime(xfTransFreelyMessage.getMessageTime(), str);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$h */
    public class C4083h implements BottomEditView.OnEditClickListener {
        public C4083h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<hbh> it = TranslationMachinePublicActivity.this.f25521c.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TranslationMachinePublicActivity.this.f25521c.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TranslationMachinePublicActivity.this.f25517a.setEditMode(false);
            TranslationMachinePublicActivity.this.f25519b.setEditMode(false);
            ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63982V1.setVisibility(0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: ugh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f87991a.lambda$onDelete$0();
                    }
                });
            } else {
                for (hbh hbhVar : TranslationMachinePublicActivity.this.f25517a.getSelectData()) {
                    TranslationMachinePublicActivity.this.f25521c.deleteSelectData(hbhVar.getMessageTime());
                    xt5.delete(hbhVar.getVoicePath());
                }
                for (hbh hbhVar2 : TranslationMachinePublicActivity.this.f25519b.getSelectData()) {
                    TranslationMachinePublicActivity.this.f25521c.deleteSelectData(hbhVar2.getMessageTime());
                    xt5.delete(hbhVar2.getVoicePath());
                }
            }
            TranslationMachinePublicActivity.this.f25517a.removeSelectData();
            TranslationMachinePublicActivity.this.f25519b.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TranslationMachinePublicActivity.this.f25517a.setAllSelectState(isAllSelect);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$i */
    public class RunnableC4084i implements Runnable {
        public RunnableC4084i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachinePublicActivity.this.loopStartPlaying();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$j */
    public class RunnableC4085j implements Runnable {
        public RunnableC4085j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachinePublicActivity.this.loopStartPlaying();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$k */
    public class C4086k extends BroadcastReceiver {
        public C4086k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
                l3h.showToastLong(TranslationMachinePublicActivity.this.getString(C4201R.string.device_status_tip));
                TranslationMachinePublicActivity.this.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$l */
    public class RunnableC4087l implements Runnable {
        public RunnableC4087l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachinePublicActivity.this.startPlaying();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$m */
    public class C4088m implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C4088m() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_PHONE_MODEL_TIP", isChecked);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$n */
    public class C4089n implements AudioManager.OnAudioFocusChangeListener {
        public C4089n() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$o */
    public class C4090o implements MediaPlayer.OnCompletionListener {
        public C4090o() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            if (TranslationMachinePublicActivity.this.f25523d != null) {
                TranslationMachinePublicActivity.this.f25523d.reset();
            }
            TranslationMachinePublicActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$p */
    public class RunnableC4091p implements Runnable {
        public RunnableC4091p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachinePublicActivity.this.f25509M1 = true;
            TranslationMachinePublicActivity translationMachinePublicActivity = TranslationMachinePublicActivity.this;
            translationMachinePublicActivity.setClearScreen(translationMachinePublicActivity.f25509M1);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$q */
    public class RunnableC4092q implements Runnable {
        public RunnableC4092q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachinePublicActivity.this.f25509M1 = false;
            TranslationMachinePublicActivity translationMachinePublicActivity = TranslationMachinePublicActivity.this;
            translationMachinePublicActivity.setClearScreen(translationMachinePublicActivity.f25509M1);
            ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63994d2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$r */
    public class RunnableC4093r implements Runnable {
        public RunnableC4093r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachinePublicActivity.this.f25521c.deleteAll();
            ArrayList<ibh> data = TranslationMachinePublicActivity.this.f25519b.getData();
            for (int i = 0; i < data.size(); i++) {
                xt5.delete(data.get(i).getXfTransFreelyMessage().getVoicePath());
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$s */
    public class ViewOnClickListenerC4094s implements View.OnClickListener {
        public ViewOnClickListenerC4094s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TranslationMachinePublicActivity translationMachinePublicActivity = TranslationMachinePublicActivity.this;
            translationMachinePublicActivity.f25508M = translationMachinePublicActivity.isAsring();
            TranslationMachinePublicActivity.this.f25510N = true;
            TranslationMachinePublicActivity.this.f25514Y = false;
            TranslationMachinePublicActivity translationMachinePublicActivity2 = TranslationMachinePublicActivity.this;
            translationMachinePublicActivity2.startSelectTransActivity(((C9783nd) ((BaseActivity) translationMachinePublicActivity2).binding).f63991c.getText().toString(), ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63997f.getText().toString(), 1, TransActionEnumMode.DUAL_SINGLE_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$t */
    public class ViewOnClickListenerC4095t implements View.OnClickListener {
        public ViewOnClickListenerC4095t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TranslationMachinePublicActivity.this.f25527f <= 500) {
                return;
            }
            TranslationMachinePublicActivity.this.f25527f = System.currentTimeMillis();
            TranslationMachinePublicActivity.this.exchangeLanguage();
            TextView textView = ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63991c;
            TranslationMachinePublicActivity translationMachinePublicActivity = TranslationMachinePublicActivity.this;
            textView.setText(AiLangUtil.getValue(translationMachinePublicActivity, ((BaseAsrActivity) translationMachinePublicActivity).fromLanguageData.getKeyName()));
            TextView textView2 = ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63997f;
            TranslationMachinePublicActivity translationMachinePublicActivity2 = TranslationMachinePublicActivity.this;
            textView2.setText(AiLangUtil.getValue(translationMachinePublicActivity2, ((BaseAsrActivity) translationMachinePublicActivity2).toLanguageData.getKeyName()));
            if (TranslationMachinePublicActivity.this.isAsring()) {
                TranslationMachinePublicActivity.this.stopAsr();
                TranslationMachinePublicActivity.this.startAsrNoVad();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$u */
    public class ViewOnClickListenerC4096u implements View.OnClickListener {
        public ViewOnClickListenerC4096u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TranslationMachinePublicActivity translationMachinePublicActivity = TranslationMachinePublicActivity.this;
            translationMachinePublicActivity.f25508M = translationMachinePublicActivity.isAsring();
            TranslationMachinePublicActivity.this.f25510N = true;
            TranslationMachinePublicActivity.this.f25514Y = false;
            TranslationMachinePublicActivity translationMachinePublicActivity2 = TranslationMachinePublicActivity.this;
            translationMachinePublicActivity2.startSelectTransActivity(((C9783nd) ((BaseActivity) translationMachinePublicActivity2).binding).f63997f.getText().toString(), ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63991c.getText().toString(), 2, TransActionEnumMode.DUAL_SINGLE_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$v */
    public class ViewOnClickListenerC4097v implements View.OnClickListener {
        public ViewOnClickListenerC4097v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.tramslationpublic.TranslationMachinePublicActivity$w */
    public class ViewOnClickListenerC4098w implements View.OnClickListener {
        public ViewOnClickListenerC4098w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - TranslationMachinePublicActivity.this.f25527f <= 500) {
                return;
            }
            TranslationMachinePublicActivity.this.f25527f = System.currentTimeMillis();
            if (!TranslateWebSocketManager.getInstance().isAsring()) {
                TranslationMachinePublicActivity.f25503h2.removeCallbacks(TranslationMachinePublicActivity.this.f25526e2);
                TranslationMachinePublicActivity.f25503h2.postDelayed(TranslationMachinePublicActivity.this.f25526e2, 30000L);
                TranslationMachinePublicActivity.this.startGptVoice();
            } else {
                TranslationMachinePublicActivity.f25503h2.removeCallbacks(TranslationMachinePublicActivity.this.f25526e2);
                ((C9783nd) ((BaseActivity) TranslationMachinePublicActivity.this).binding).f63994d2.setVisibility(8);
                TranslationMachinePublicActivity.this.f25509M1 = false;
                TranslationMachinePublicActivity translationMachinePublicActivity = TranslationMachinePublicActivity.this;
                translationMachinePublicActivity.setClearScreen(translationMachinePublicActivity.f25509M1);
                TranslationMachinePublicActivity.this.voiceViewGone();
            }
        }
    }

    private void audioStopMusic() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f25525e = audioManager;
        sendPauseKeyEvent(audioManager);
        this.f25525e.requestAudioFocus(new C4089n(), 3, 1);
    }

    private void autoStartAsr() {
        if (this.f25529m) {
            this.f25529m = false;
            Log.e("TranslationMachineActivity", "msg = 自动启动语音识别.");
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: sgh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81746a.lambda$autoStartAsr$0();
                }
            }, 1000L);
        }
    }

    private hbh copyMessage(hbh source) {
        hbh hbhVar = new hbh();
        hbhVar.setMessageTime(source.getMessageTime());
        hbhVar.setPause(source.isPause());
        hbhVar.setIsGptOrXF(source.getIsGptOrXF());
        hbhVar.setType(source.getType());
        hbhVar.setIsLangCode(source.getIsLangCode());
        hbhVar.setResult(source.getResult());
        hbhVar.setTransResult(source.getTransResult());
        hbhVar.setVoicePath(source.getVoicePath());
        return hbhVar;
    }

    private void gptVoice() {
        showGptVoice();
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: ngh
            @Override // java.lang.Runnable
            public final void run() {
                this.f64484a.lambda$hideVoiceView$4();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25523d = mediaPlayer;
        mediaPlayer.reset();
    }

    private void initRv() {
        ((C9783nd) this.binding).f63990b2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((C9783nd) this.binding).f63992c2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25517a = new vgh(this, ((C9783nd) this.binding).f63990b2, this.f25521c, true);
        this.f25519b = new vgh(this, ((C9783nd) this.binding).f63992c2, this.f25521c, false);
        List<hbh> latestData = this.f25505F ? this.f25521c.getLatestData() : new ArrayList<>();
        if (mc2.isEmpty(latestData)) {
            ((C9783nd) this.binding).f63979M1.setVisibility(8);
            hbh hbhVar = new hbh();
            hbhVar.setResult(a77.C0077a.f542d);
            hbhVar.setTransResult(a77.C0077a.f542d);
            this.f25517a.addData(hbhVar);
            this.f25519b.addData(hbhVar);
            showEmptyView();
        } else {
            ((C9783nd) this.binding).f63974C.setVisibility(8);
            ((C9783nd) this.binding).f64000m.setVisibility(0);
            Collections.reverse(latestData);
            hbh hbhVar2 = new hbh();
            hbhVar2.setResult(a77.C0077a.f542d);
            hbhVar2.setTransResult(a77.C0077a.f542d);
            latestData.add(hbhVar2);
            this.f25517a.setData(latestData);
            this.f25519b.setData(latestData);
            ((C9783nd) this.binding).f63994d2.setVisibility(8);
        }
        ((C9783nd) this.binding).f63990b2.scrollToPosition(this.f25517a.getItemCount() - 1);
        ((C9783nd) this.binding).f63990b2.setAdapter(this.f25517a);
        ((C9783nd) this.binding).f63990b2.setItemAnimator(null);
        ((C9783nd) this.binding).f63992c2.scrollToPosition(this.f25519b.getItemCount() - 1);
        ((C9783nd) this.binding).f63992c2.setAdapter(this.f25519b);
        ((C9783nd) this.binding).f63992c2.setItemAnimator(null);
        e5d e5dVar = new e5d();
        this.f25512V1 = e5dVar;
        T t = this.binding;
        e5dVar.syncPositions(((C9783nd) t).f63990b2, ((C9783nd) t).f63992c2);
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        initRv();
        ((C9783nd) this.binding).f63980N.setOnClickListener(new View.OnClickListener() { // from class: ogh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67589a.lambda$initUI$1(view);
            }
        });
        ((C9783nd) this.binding).f63983X.setOnClickListener(new View.OnClickListener() { // from class: pgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70719a.lambda$initUI$2(view);
            }
        });
        ((C9783nd) this.binding).f63991c.setOnClickListener(new ViewOnClickListenerC4094s());
        ((C9783nd) this.binding).f63976H.setOnClickListener(new ViewOnClickListenerC4095t());
        ((C9783nd) this.binding).f63997f.setOnClickListener(new ViewOnClickListenerC4096u());
        ((C9783nd) this.binding).f63993d.setOnClickListener(new ViewOnClickListenerC4097v());
        ((C9783nd) this.binding).f63984Y.setOnClickListener(new ViewOnClickListenerC4098w());
        ((C9783nd) this.binding).f63988a2.setOnClickListener(new ViewOnClickListenerC4076a());
        ((C9783nd) this.binding).f63982V1.setOnClickListener(new View.OnClickListener() { // from class: qgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74397a.lambda$initUI$3(view);
            }
        });
        ((C9783nd) this.binding).f63990b2.setOnTouchListener(new ViewOnTouchListenerC4077b());
        ((C9783nd) this.binding).f63992c2.setOnTouchListener(new ViewOnTouchListenerC4078c());
        ((C9783nd) this.binding).f63999g2.setOnClickListener(new ViewOnClickListenerC4079d());
        ((C9783nd) this.binding).f63981Q.setOnClickListener(new ViewOnClickListenerC4080e());
        AudioPlayerManager.getInstance().setAudioPlayerListener(new C4081f());
        ((C9783nd) this.binding).f63979M1.setOnClickListener(new ViewOnClickListenerC4082g());
        ((C9783nd) this.binding).f63989b.setOnEditClickListener(new C4083h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$autoStartAsr$0() {
        ((C9783nd) this.binding).f63984Y.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$4() {
        if (((C9783nd) this.binding).f63999g2.getVisibility() == 0) {
            ((C9783nd) this.binding).f63999g2.setVisibility(8);
        }
        if (((C9783nd) this.binding).f63978M.getVisibility() == 0) {
            ((C9783nd) this.binding).f63978M.setVisibility(8);
        }
        this.f25527f = System.currentTimeMillis();
        vgh vghVar = this.f25517a;
        if (vghVar == null || vghVar.getItemCount() <= 0) {
            ((C9783nd) this.binding).f64000m.setVisibility(8);
            ((C9783nd) this.binding).f63979M1.setVisibility(8);
            showEmptyView();
        } else {
            ((C9783nd) this.binding).f64000m.setVisibility(0);
        }
        ((C9783nd) this.binding).f63996e2.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$1(View view) {
        vfe.getInstance().putBoolean("SP_KEY_AI_CHAT_SAVE_DATA", true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$2(View view) {
        vfe.getInstance().putBoolean("SP_KEY_AI_CHAT_SAVE_DATA", false);
        C2478k.getSinglePool().execute(new RunnableC4093r());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$3(View view) {
        if (isAsring()) {
            setClearScreen(!this.f25509M1);
        } else {
            setClearScreen(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAsrResultOnce$5(boolean z, String str, String str2, String str3, String str4) {
        if (z) {
            Log.i("TranslationMachineActivity", "msg ==========================================");
            Log.e("TranslationMachineActivity", "msg =" + str + " isFinal=" + z + " mp3Filepath =" + str2);
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
            if (this.f25506H && !this.f25514Y) {
                loopStartPlaying();
            }
            hbh hbhVarQueryByVoicePath = this.f25521c.queryByVoicePath(str2);
            this.f25513X = hbhVarQueryByVoicePath;
            if (hbhVarQueryByVoicePath == null) {
                hbh hbhVar = new hbh();
                hbhVar.setMessageTime(Long.parseLong(str3));
                hbhVar.setPause(false);
                if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
                    hbhVar.setIsGptOrXF(3);
                } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
                    hbhVar.setIsGptOrXF(3);
                } else {
                    hbhVar.setIsGptOrXF(1);
                }
                hbhVar.setType(this.type);
                hbhVar.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
                hbhVar.setResult(str);
                hbhVar.setTransResult(str4);
                if (!TextUtils.isEmpty(str2)) {
                    hbhVar.setVoicePath(str2);
                }
                this.f25504C.offer(hbhVar);
                Log.i("TranslationMachineActivity", "msg =插入内容：" + str + " id=" + this.f25521c.insert(hbhVar) + " 音频文件:" + hbhVar.getVoicePath());
            } else {
                Log.i("TranslationMachineActivity", "msg = 需要更新内容");
            }
        }
        showTextGPTResult(str, str4, str2, str3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$7(MediaPlayer mediaPlayer) {
        this.f25523d.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$6(ArrayList arrayList, String str, int i) {
        if (TextUtils.isEmpty(((ibh) arrayList.get(i)).getXfTransFreelyMessage().getVoicePath())) {
            return false;
        }
        return ((ibh) arrayList.get(i)).getXfTransFreelyMessage().getVoicePath().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loopStartPlaying() {
        if (this.f25507L) {
            return;
        }
        C2478k.runOnUiThreadDelayed(new RunnableC4087l(), 200L);
    }

    private void registerBluetoothReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        registerReceiver(this.f25524d2, intentFilter);
        this.f25518a2 = true;
    }

    private void scrollToBottom() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearScreen(boolean isClear) {
        this.f25509M1 = isClear;
        ((C9783nd) this.binding).f63980N.setVisibility(isClear ? 4 : 0);
        ((C9783nd) this.binding).f63991c.setVisibility(isClear ? 4 : 0);
        ((C9783nd) this.binding).f63976H.setVisibility(isClear ? 4 : 0);
        ((C9783nd) this.binding).f63997f.setVisibility(isClear ? 4 : 0);
        ((C9783nd) this.binding).f63986Z1.setVisibility(isClear ? 4 : 0);
        Handler handler = f25503h2;
        handler.removeCallbacks(this.f25526e2);
        if (isClear || !isAsring()) {
            return;
        }
        handler.postDelayed(this.f25526e2, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            this.f25523d.reset();
            this.f25523d.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25523d.setDataSource(this, Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4035R.raw.aaa));
            this.f25523d.prepareAsync();
            sendPauseKeyEvent(this.f25525e);
            this.f25523d.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: rgh
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f78275a.lambda$setupMediaPlayer$7(mediaPlayer);
                }
            });
            this.f25523d.setOnCompletionListener(new C4090o());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 2, 2, new C4088m()).show();
    }

    private void showEmptyView() {
        ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.ic_volume_blue)).diskCacheStrategy(ne4.f64120d).into(((C9783nd) this.binding).f63977L);
    }

    private void showGptVoice() {
        this.f25517a.setBeginning(true);
        this.f25519b.setBeginning(true);
        ((C9783nd) this.binding).f63979M1.setVisibility(8);
        if (this.f25517a.getData() != null && (this.f25517a.getData().isEmpty() || this.f25517a.getData().size() == 1)) {
            ((C9783nd) this.binding).f63994d2.setVisibility(0);
        }
        ((C9783nd) this.binding).f63978M.setVisibility(0);
        ((C9783nd) this.binding).f63996e2.setText("");
        ((C9783nd) this.binding).f64000m.setVisibility(0);
        if (!isDestroyed() && !isFinishing()) {
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.translate_foot_voice)).diskCacheStrategy(ne4.f64120d).into(((C9783nd) this.binding).f63978M);
        }
        ((C9783nd) this.binding).f63974C.setVisibility(8);
        if (isAsring()) {
            stopAsr();
        }
        startAsrNoVad();
    }

    private void showTextGPTResult(String text, String translateString, final String mp3Filepath, String startTimeId, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        long j = Long.parseLong(startTimeId);
        final ArrayList<ibh> data = this.f25517a.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: mgh
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return TranslationMachinePublicActivity.lambda$showTextGPTResult$6(data, mp3Filepath, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent() && !this.f25511Q) {
            if (isFinalResult) {
                this.f25511Q = true;
            }
            hbh xfTransFreelyMessage = data.get(optionalIntFindFirst.getAsInt()).getXfTransFreelyMessage();
            xfTransFreelyMessage.setResult(text);
            xfTransFreelyMessage.setTransResult(translateString);
            hbh hbhVarCopyMessage = copyMessage(xfTransFreelyMessage);
            hbh hbhVarCopyMessage2 = copyMessage(xfTransFreelyMessage);
            this.f25517a.updateMessage(hbhVarCopyMessage, r9.getItemCount() - 2);
            this.f25519b.updateMessage(hbhVarCopyMessage2, r7.getItemCount() - 2);
            ((C9783nd) this.binding).f63990b2.scrollToPosition(this.f25517a.getItemCount() - 1);
            ((C9783nd) this.binding).f63992c2.scrollToPosition(this.f25519b.getItemCount() - 1);
            scrollToBottom();
            return;
        }
        this.f25511Q = false;
        hbh hbhVar = new hbh();
        hbhVar.setMessageTime(j);
        hbhVar.setPause(false);
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            hbhVar.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            hbhVar.setIsGptOrXF(3);
        } else {
            hbhVar.setIsGptOrXF(1);
        }
        hbhVar.setType(this.type);
        hbhVar.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        hbhVar.setResult(text);
        hbhVar.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            hbhVar.setVoicePath(mp3Filepath);
        }
        hbh hbhVarCopyMessage3 = copyMessage(hbhVar);
        hbh hbhVarCopyMessage4 = copyMessage(hbhVar);
        ((C9783nd) this.binding).f63994d2.setVisibility(8);
        vgh vghVar = this.f25517a;
        vghVar.addData(vghVar.getItemCount() - 1, hbhVarCopyMessage3);
        vgh vghVar2 = this.f25519b;
        vghVar2.addData(vghVar2.getItemCount() - 1, hbhVarCopyMessage4);
        ((C9783nd) this.binding).f63990b2.scrollToPosition(this.f25517a.getItemCount() - 1);
        ((C9783nd) this.binding).f63992c2.scrollToPosition(this.f25519b.getItemCount() - 1);
        scrollToBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startGptVoice() {
        if (checkAndRequestPermissions()) {
            if (!NetworkUtils.isConnected()) {
                k3h.showToastShort(getString(C4035R.string.loading_no_net_view_text_hint));
                return;
            }
            ((C9783nd) this.binding).f63992c2.setVisibility(0);
            ((C9783nd) this.binding).f63986Z1.setVisibility(0);
            ((C9783nd) this.binding).f63998f2.setVisibility(0);
            vgh vghVar = this.f25517a;
            if (vghVar != null && vghVar.getItemCount() > 0) {
                ((C9783nd) this.binding).f63990b2.scrollToPosition(this.f25517a.getItemCount() - 1);
            }
            vgh vghVar2 = this.f25519b;
            if (vghVar2 != null && vghVar2.getItemCount() > 0) {
                ((C9783nd) this.binding).f63992c2.scrollToPosition(this.f25519b.getItemCount() - 1);
            }
            this.type = this.phoneType;
            ((C9783nd) this.binding).f63984Y.setImageResource(C4035R.drawable.ic_broadcast_pause);
            gptVoice();
        }
    }

    private void startPlayFile(ibh transMachineMessageSelect, String voicePath) {
        if (transMachineMessageSelect != null && !transMachineMessageSelect.isAlreadyPlayed()) {
            transMachineMessageSelect.setAlreadyPlayed(true);
            if (this.f25519b.getItemCount() - 3 >= 0) {
                this.f25519b.getData().get(this.f25519b.getItemCount() - 3).setAlreadyPlayed(true);
            }
        }
        this.f25515Z = 0;
        playFile(xt5.getFileByPath(voicePath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void startPlaying() {
        ibh ibhVar;
        if (this.f25510N) {
            Log.i("TranslationMachineActivity", "msg =选择语言中，停止...");
            return;
        }
        this.f25514Y = true;
        if (AudioPlayerManager.getInstance().isPlaying()) {
            Log.i("TranslationMachineActivity", "msg =播报中，请等待");
            loopStartPlaying();
            return;
        }
        if (!this.f25506H) {
            ((C9783nd) this.binding).f63981Q.setImageResource(C4035R.drawable.ic_trans_ban_playing);
            ((C9783nd) this.binding).f63981Q.setScaleX(1.0f);
            ((C9783nd) this.binding).f63981Q.setScaleY(1.0f);
            Log.i("TranslationMachineActivity", "msg =停止播报中");
            return;
        }
        hbh hbhVarPoll = this.f25504C.poll();
        ((C9783nd) this.binding).f63981Q.setImageResource(C4035R.drawable.ic_trans_playing);
        ibh ibhVar2 = this.f25519b.getItemCount() + (-2) >= 0 ? this.f25519b.getData().get(this.f25519b.getItemCount() - 2) : null;
        if (hbhVarPoll == null || TextUtils.isEmpty(hbhVarPoll.getVoicePath())) {
            if (isAsring()) {
                if (this.f25519b.getItemCount() - 2 >= 0) {
                    ibhVar2 = this.f25519b.getData().get(this.f25519b.getItemCount() - 2);
                }
                if ((ibhVar2 == null || ibhVar2.isAlreadyPlayed() || !xt5.isFileExists(ibhVar2.getXfTransFreelyMessage().getVoicePath())) && this.f25519b.getItemCount() - 3 >= 0 && (ibhVar = this.f25519b.getData().get(this.f25519b.getItemCount() - 2)) != null && !ibhVar.isAlreadyPlayed()) {
                    ibhVar2 = this.f25519b.getData().get(this.f25519b.getItemCount() - 3);
                }
            }
            if (ibhVar2 == null || ibhVar2.isAlreadyPlayed()) {
                Log.i("TranslationMachineActivity", "msg =音频全部播报完毕");
                this.f25514Y = false;
                ((C9783nd) this.binding).f63981Q.setScaleX(1.0f);
                ((C9783nd) this.binding).f63981Q.setScaleY(1.0f);
            } else {
                String voicePath = ibhVar2.getXfTransFreelyMessage().getVoicePath();
                if (xt5.isFileExists(voicePath)) {
                    ibhVar2.setAlreadyPlayed(true);
                    Log.e("TranslationMachineActivity", "msg =列表，播报:" + ibhVar2.getXfTransFreelyMessage().getTransResult() + " 音频文件:" + voicePath);
                    playFile(xt5.getFileByPath(voicePath));
                } else {
                    Log.i("TranslationMachineActivity", "msg =列表，音频文件未生成:" + voicePath);
                    C2478k.runOnUiThreadDelayed(new RunnableC4085j(), 1000L);
                }
            }
        } else {
            ((C9783nd) this.binding).f63981Q.setScaleX(1.2f);
            ((C9783nd) this.binding).f63981Q.setScaleY(1.2f);
            if (xt5.isFileExists(hbhVarPoll.getVoicePath())) {
                Log.e("TranslationMachineActivity", "msg =队列，播报:" + hbhVarPoll.getTransResult() + " 音频文件:" + hbhVarPoll.getVoicePath());
                if (ibhVar2 != null && !ibhVar2.isAlreadyPlayed()) {
                    ibhVar2.setAlreadyPlayed(true);
                    if (this.f25519b.getItemCount() - 3 >= 0) {
                        this.f25519b.getData().get(this.f25519b.getItemCount() - 3).setAlreadyPlayed(true);
                    }
                }
                this.f25515Z = 0;
                playFile(xt5.getFileByPath(hbhVarPoll.getVoicePath()));
            } else {
                Log.i("TranslationMachineActivity", "msg =队列，音频文件未生成,重试:" + (this.f25515Z + 1) + " path:" + hbhVarPoll.getVoicePath());
                int i = this.f25515Z;
                if (i <= 3) {
                    this.f25515Z = i + 1;
                    this.f25504C.offer(hbhVarPoll);
                    this.f25506H = true;
                } else {
                    this.f25515Z = 0;
                }
                C2478k.runOnUiThreadDelayed(new RunnableC4084i(), 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRecognizerAndRecord() {
        Log.e("TranslationMachineActivity", "msg = 停止播报.");
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
        ((C9783nd) this.binding).f63981Q.setScaleX(1.0f);
        ((C9783nd) this.binding).f63981Q.setScaleY(1.0f);
        if (this.f25510N) {
            return;
        }
        ((C9783nd) this.binding).f63981Q.setImageResource(C4035R.drawable.ic_trans_ban_playing);
        this.f25506H = false;
    }

    private void unRegisterBluetoothReceiver() {
        BroadcastReceiver broadcastReceiver = this.f25524d2;
        if (broadcastReceiver != null && this.f25518a2) {
            unregisterReceiver(broadcastReceiver);
        }
        this.f25518a2 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        ((C9783nd) this.binding).f63984Y.setImageResource(C4035R.drawable.ic_start_recording);
        hideVoiceView();
        stopAsr();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90931V;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90929U;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        this.f25520b2 = fromLanguageData.getIatLanguage();
        ((C9783nd) this.binding).f63991c.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        this.f25522c2 = toLanguageData.getIatLanguage();
        ((C9783nd) this.binding).f63997f.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        this.f25529m = true;
        registerBluetoothReceiver();
        this.f25505F = vfe.getInstance().getBoolean("SP_KEY_AI_CHAT_SAVE_DATA", false);
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25521c = ((TransMachinePublicDatabase) this.database).messageDao();
        initUI();
        startAsrSocket();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public TransMachinePublicDatabase getDatabase() {
        return TransMachinePublicDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C9783nd getViewBinding() {
        return C9783nd.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
        playFile(responseData);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onAsrResultOnce(String sourLangeuage, final String result, final String transText, final String mp3Filepath, final String startTimeId, final boolean isFinal) {
        runOnUiThread(new Runnable() { // from class: tgh
            @Override // java.lang.Runnable
            public final void run() {
                this.f84656a.lambda$onAsrResultOnce$5(isFinal, result, mp3Filepath, startTimeId, transText);
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopRecognizerAndRecord();
        Handler handler = f25503h2;
        if (handler != null) {
            handler.removeCallbacks(this.f25526e2);
        }
        this.f25507L = true;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        voiceViewGone();
        if (isFinishing()) {
            stopAsrSocket();
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, android.app.Activity
    public void onRestart() {
        super.onRestart();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        stopRecognizerAndRecord();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onStopAsrView() {
        super.onStopAsrView();
        Log.i("TranslationMachineActivity", "msg = 收到停止语音识别回调.");
        voiceViewGone();
        f25503h2.removeCallbacks(this.f25526e2);
        runOnUiThread(new RunnableC4092q());
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onWebSocketOpen() {
        super.onWebSocketOpen();
        Log.e("TranslationMachineActivity", "msg = WebSocket连接成功.");
        autoStartAsr();
    }

    public void playFile(File file) {
        MediaPlayer mediaPlayer = this.f25523d;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        AudioPlayerManager.getInstance().playAudioFile(this.f25525e, file, 3);
    }

    public void stopPlayback() {
        MediaPlayer mediaPlayer = this.f25523d;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25523d = null;
        }
    }
}
