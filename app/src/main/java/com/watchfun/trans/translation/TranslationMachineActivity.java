package com.watchfun.trans.translation;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
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
import com.watchfun.trans.database.transmachine.TransMachineDatabase;
import com.watchfun.trans.translation.TranslationMachineActivity;
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
import p000.C9289md;
import p000.a77;
import p000.dbh;
import p000.e5d;
import p000.ebh;
import p000.igg;
import p000.l3h;
import p000.lgh;
import p000.lx2;
import p000.mc2;
import p000.ne4;
import p000.pj4;
import p000.uah;
import p000.vfe;
import p000.xnc;
import p000.xt5;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class TranslationMachineActivity extends BaseAsrActivity<C9289md, TransMachineDatabase> implements MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: f2 */
    public static final String f25800f2 = "TranslationMachineActivity";

    /* JADX INFO: renamed from: g2 */
    public static final Handler f25801g2 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: H */
    public boolean f25804H;

    /* JADX INFO: renamed from: L */
    public boolean f25805L;

    /* JADX INFO: renamed from: M */
    public boolean f25806M;

    /* JADX INFO: renamed from: M1 */
    public int f25807M1;

    /* JADX INFO: renamed from: N */
    public boolean f25808N;

    /* JADX INFO: renamed from: Q */
    public boolean f25809Q;

    /* JADX INFO: renamed from: V1 */
    public boolean f25810V1;

    /* JADX INFO: renamed from: X */
    public boolean f25811X;

    /* JADX INFO: renamed from: Y */
    public dbh f25812Y;

    /* JADX INFO: renamed from: Z */
    public boolean f25813Z;

    /* JADX INFO: renamed from: Z1 */
    public e5d f25814Z1;

    /* JADX INFO: renamed from: b */
    public lgh f25817b;

    /* JADX INFO: renamed from: b2 */
    public String f25818b2;

    /* JADX INFO: renamed from: c */
    public lgh f25819c;

    /* JADX INFO: renamed from: c2 */
    public String f25820c2;

    /* JADX INFO: renamed from: d */
    public uah f25821d;

    /* JADX INFO: renamed from: e */
    public MediaPlayer f25823e;

    /* JADX INFO: renamed from: f */
    public AudioManager f25825f;

    /* JADX INFO: renamed from: m */
    public long f25826m;

    /* JADX INFO: renamed from: a */
    public String[] f25815a = {xnc.f98582G, "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.WAKE_LOCK"};

    /* JADX INFO: renamed from: C */
    public boolean f25802C = true;

    /* JADX INFO: renamed from: F */
    public Queue<dbh> f25803F = new LinkedList();

    /* JADX INFO: renamed from: a2 */
    public final long f25816a2 = 30000;

    /* JADX INFO: renamed from: d2 */
    public Runnable f25822d2 = new RunnableC4175k();

    /* JADX INFO: renamed from: e2 */
    public boolean f25824e2 = true;

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$a */
    public class ViewOnTouchListenerC4165a implements View.OnTouchListener {
        public ViewOnTouchListenerC4165a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            TranslationMachineActivity.this.f25814Z1.setTopView(true);
            if (motionEvent.getAction() == 0) {
                if (TranslationMachineActivity.this.isAsring()) {
                    TranslationMachineActivity translationMachineActivity = TranslationMachineActivity.this;
                    translationMachineActivity.setClearScreen(true ^ translationMachineActivity.f25810V1);
                } else {
                    TranslationMachineActivity.this.setClearScreen(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$b */
    public class ViewOnTouchListenerC4166b implements View.OnTouchListener {
        public ViewOnTouchListenerC4166b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            TranslationMachineActivity.this.f25814Z1.setTopView(false);
            if (motionEvent.getAction() == 0) {
                if (TranslationMachineActivity.this.isAsring()) {
                    TranslationMachineActivity.this.setClearScreen(!r2.f25810V1);
                } else {
                    TranslationMachineActivity.this.setClearScreen(false);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$c */
    public class ViewOnClickListenerC4167c implements View.OnClickListener {
        public ViewOnClickListenerC4167c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TranslationMachineActivity.this.f25826m <= 500) {
                return;
            }
            TranslationMachineActivity.this.f25826m = System.currentTimeMillis();
            TranslationMachineActivity.this.voiceViewGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$d */
    public class ViewOnClickListenerC4168d implements View.OnClickListener {
        public ViewOnClickListenerC4168d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - TranslationMachineActivity.this.f25826m <= 500) {
                return;
            }
            TranslationMachineActivity.this.f25826m = System.currentTimeMillis();
            TranslationMachineActivity.this.f25803F.clear();
            if (AudioPlayerManager.getInstance().isPlaying()) {
                TranslationMachineActivity.this.f25805L = false;
                ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setImageResource(C4035R.drawable.ic_trans_ban_playing);
                ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setScaleX(1.0f);
                ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setScaleY(1.0f);
                TranslationMachineActivity.this.stopRecognizerAndRecord();
                TranslationMachineActivity.this.f25803F.clear();
                return;
            }
            if (!TranslationMachineActivity.this.f25805L) {
                TranslationMachineActivity.this.f25805L = true;
                ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setImageResource(C4035R.drawable.ic_trans_playing);
                TranslationMachineActivity.this.startPlaying();
            } else {
                TranslationMachineActivity.this.f25805L = false;
                ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setImageResource(C4035R.drawable.ic_trans_ban_playing);
                ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setScaleX(1.0f);
                ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setScaleY(1.0f);
                TranslationMachineActivity.this.stopRecognizerAndRecord();
                TranslationMachineActivity.this.f25803F.clear();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$e */
    public class C4169e implements AudioPlayerManager.AudioPlayerListener {
        public C4169e() {
        }

        @Override // com.watchfun.transcommon.manager.trans.AudioPlayerManager.AudioPlayerListener
        public void onAudioPlaybackCompleted() {
            ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setScaleX(1.0f);
            ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60590Q.setScaleY(1.0f);
            if (TranslationMachineActivity.this.f25805L) {
                TranslationMachineActivity.this.loopStartPlaying();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$f */
    public class ViewOnClickListenerC4170f implements View.OnClickListener {

        /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f25833a;

            public a(final View val$v) {
                this.f25833a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25833a.setScaleX(1.0f);
                this.f25833a.setScaleY(1.0f);
            }
        }

        public ViewOnClickListenerC4170f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TranslationMachineActivity.this.isAsring() || TranslationMachineActivity.this.f25819c == null || TranslationMachineActivity.this.f25819c.getItemCount() <= 0) {
                return;
            }
            dbh xfTransFreelyMessage = TranslationMachineActivity.this.f25819c.getData().get(TranslationMachineActivity.this.f25819c.getItemCount() - 1).getXfTransFreelyMessage();
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
            if (!TextUtils.isEmpty(xfTransFreelyMessage.getVoicePath())) {
                if (xt5.isFileExists(xfTransFreelyMessage.getVoicePath())) {
                    TranslationMachineActivity.this.playFile(xt5.getFileByPath(xfTransFreelyMessage.getVoicePath()));
                    return;
                } else {
                    TranslationMachineActivity.this.startTTS(xfTransFreelyMessage.getTransResult(), xfTransFreelyMessage.getIsLangCode(), xfTransFreelyMessage.getVoicePath());
                    return;
                }
            }
            String str = TranslateWebSocketManager.getInstance().getOutputPath() + pj4.f71071b + System.currentTimeMillis() + ".mp3";
            TranslationMachineActivity.this.startTTS(xfTransFreelyMessage.getTransResult(), xfTransFreelyMessage.getIsLangCode(), str);
            xfTransFreelyMessage.setVoicePath(str);
            TranslationMachineActivity.this.f25821d.updateVoicePathByMessageTime(xfTransFreelyMessage.getMessageTime(), str);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$g */
    public class C4171g implements BottomEditView.OnEditClickListener {
        public C4171g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<dbh> it = TranslationMachineActivity.this.f25821d.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TranslationMachineActivity.this.f25821d.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TranslationMachineActivity.this.f25817b.setEditMode(false);
            TranslationMachineActivity.this.f25819c.setEditMode(false);
            ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60591V1.setVisibility(0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: igh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46980a.lambda$onDelete$0();
                    }
                });
            } else {
                for (dbh dbhVar : TranslationMachineActivity.this.f25817b.getSelectData()) {
                    TranslationMachineActivity.this.f25821d.deleteSelectData(dbhVar.getMessageTime());
                    xt5.delete(dbhVar.getVoicePath());
                }
                for (dbh dbhVar2 : TranslationMachineActivity.this.f25819c.getSelectData()) {
                    TranslationMachineActivity.this.f25821d.deleteSelectData(dbhVar2.getMessageTime());
                    xt5.delete(dbhVar2.getVoicePath());
                }
            }
            TranslationMachineActivity.this.f25817b.removeSelectData();
            TranslationMachineActivity.this.f25819c.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TranslationMachineActivity.this.f25817b.setAllSelectState(isAllSelect);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$h */
    public class RunnableC4172h implements Runnable {
        public RunnableC4172h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachineActivity.this.loopStartPlaying();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$i */
    public class RunnableC4173i implements Runnable {
        public RunnableC4173i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachineActivity.this.loopStartPlaying();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$j */
    public class RunnableC4174j implements Runnable {
        public RunnableC4174j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachineActivity.this.startPlaying();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$k */
    public class RunnableC4175k implements Runnable {
        public RunnableC4175k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachineActivity.this.f25810V1 = true;
            TranslationMachineActivity translationMachineActivity = TranslationMachineActivity.this;
            translationMachineActivity.setClearScreen(translationMachineActivity.f25810V1);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$l */
    public class C4176l implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C4176l() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_PHONE_MODEL_TIP", isChecked);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$m */
    public class C4177m implements AudioManager.OnAudioFocusChangeListener {
        public C4177m() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$n */
    public class C4178n implements MediaPlayer.OnCompletionListener {
        public C4178n() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            if (TranslationMachineActivity.this.f25823e != null) {
                TranslationMachineActivity.this.f25823e.reset();
            }
            TranslationMachineActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$o */
    public class RunnableC4179o implements Runnable {
        public RunnableC4179o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachineActivity.this.f25810V1 = false;
            TranslationMachineActivity translationMachineActivity = TranslationMachineActivity.this;
            translationMachineActivity.setClearScreen(translationMachineActivity.f25810V1);
            ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60603d2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$p */
    public class RunnableC4180p implements Runnable {
        public RunnableC4180p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TranslationMachineActivity.this.f25821d.deleteAll();
            ArrayList<ebh> data = TranslationMachineActivity.this.f25819c.getData();
            for (int i = 0; i < data.size(); i++) {
                xt5.delete(data.get(i).getXfTransFreelyMessage().getVoicePath());
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$q */
    public class ViewOnClickListenerC4181q implements View.OnClickListener {
        public ViewOnClickListenerC4181q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TranslationMachineActivity translationMachineActivity = TranslationMachineActivity.this;
            translationMachineActivity.f25808N = translationMachineActivity.isAsring();
            TranslationMachineActivity.this.f25809Q = true;
            TranslationMachineActivity.this.f25813Z = false;
            TranslationMachineActivity translationMachineActivity2 = TranslationMachineActivity.this;
            translationMachineActivity2.startSelectTransActivity(((C9289md) ((BaseActivity) translationMachineActivity2).binding).f60600c.getText().toString(), ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60606f.getText().toString(), 1, TransActionEnumMode.DUAL_SINGLE_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$r */
    public class ViewOnClickListenerC4182r implements View.OnClickListener {
        public ViewOnClickListenerC4182r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$0() {
            TranslationMachineActivity.this.startAsrNoVad();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TranslationMachineActivity.this.f25826m <= 500) {
                return;
            }
            TranslationMachineActivity.this.f25826m = System.currentTimeMillis();
            TranslationMachineActivity.this.exchangeLanguage();
            TextView textView = ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60600c;
            TranslationMachineActivity translationMachineActivity = TranslationMachineActivity.this;
            textView.setText(AiLangUtil.getValue(translationMachineActivity, ((BaseAsrActivity) translationMachineActivity).fromLanguageData.getKeyName()));
            TextView textView2 = ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60606f;
            TranslationMachineActivity translationMachineActivity2 = TranslationMachineActivity.this;
            textView2.setText(AiLangUtil.getValue(translationMachineActivity2, ((BaseAsrActivity) translationMachineActivity2).toLanguageData.getKeyName()));
            if (TranslationMachineActivity.this.isAsring()) {
                TranslationMachineActivity.this.stopAsr();
                C2478k.runOnUiThreadDelayed(new Runnable() { // from class: jgh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50502a.lambda$onClick$0();
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$s */
    public class ViewOnClickListenerC4183s implements View.OnClickListener {
        public ViewOnClickListenerC4183s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TranslationMachineActivity translationMachineActivity = TranslationMachineActivity.this;
            translationMachineActivity.f25808N = translationMachineActivity.isAsring();
            TranslationMachineActivity.this.f25809Q = true;
            TranslationMachineActivity.this.f25813Z = false;
            TranslationMachineActivity translationMachineActivity2 = TranslationMachineActivity.this;
            translationMachineActivity2.startSelectTransActivity(((C9289md) ((BaseActivity) translationMachineActivity2).binding).f60606f.getText().toString(), ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60600c.getText().toString(), 2, TransActionEnumMode.DUAL_SINGLE_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$t */
    public class ViewOnClickListenerC4184t implements View.OnClickListener {
        public ViewOnClickListenerC4184t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$u */
    public class ViewOnClickListenerC4185u implements View.OnClickListener {
        public ViewOnClickListenerC4185u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - TranslationMachineActivity.this.f25826m <= 500) {
                return;
            }
            TranslationMachineActivity.this.f25826m = System.currentTimeMillis();
            if (!TranslateWebSocketManager.getInstance().isAsring()) {
                TranslationMachineActivity.f25801g2.removeCallbacks(TranslationMachineActivity.this.f25822d2);
                TranslationMachineActivity.f25801g2.postDelayed(TranslationMachineActivity.this.f25822d2, 30000L);
                TranslationMachineActivity.this.startGptVoice();
            } else {
                TranslationMachineActivity.f25801g2.removeCallbacks(TranslationMachineActivity.this.f25822d2);
                ((C9289md) ((BaseActivity) TranslationMachineActivity.this).binding).f60603d2.setVisibility(8);
                TranslationMachineActivity.this.f25810V1 = false;
                TranslationMachineActivity translationMachineActivity = TranslationMachineActivity.this;
                translationMachineActivity.setClearScreen(translationMachineActivity.f25810V1);
                TranslationMachineActivity.this.voiceViewGone();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TranslationMachineActivity$v */
    public class ViewOnClickListenerC4186v implements View.OnClickListener {
        public ViewOnClickListenerC4186v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TranslationMachineActivity.this.isAsring()) {
                TranslationMachineActivity.this.setClearScreen(false);
            } else {
                TranslationMachineActivity.this.setClearScreen(!r2.f25810V1);
            }
        }
    }

    private void audioStopMusic() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f25825f = audioManager;
        sendPauseKeyEvent(audioManager);
        this.f25825f.requestAudioFocus(new C4177m(), 3, 1);
    }

    private void autoStartAsr() {
        if (findUnPermissions(this.f25815a).length <= 0 && this.f25802C) {
            this.f25802C = false;
            zi9.m26852e("TranslationMachineActivity", "msg = 自动启动语音识别.");
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: agh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1598a.lambda$autoStartAsr$0();
                }
            }, 1000L);
        }
    }

    private dbh copyMessage(dbh source) {
        dbh dbhVar = new dbh();
        dbhVar.setMessageTime(source.getMessageTime());
        dbhVar.setPause(source.isPause());
        dbhVar.setIsGptOrXF(source.getIsGptOrXF());
        dbhVar.setType(source.getType());
        dbhVar.setIsLangCode(source.getIsLangCode());
        dbhVar.setResult(source.getResult());
        dbhVar.setTransResult(source.getTransResult());
        dbhVar.setVoicePath(source.getVoicePath());
        return dbhVar;
    }

    private void dismissNotifyDialog() {
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
        runOnUiThread(new Runnable() { // from class: bgh
            @Override // java.lang.Runnable
            public final void run() {
                this.f13707a.lambda$hideVoiceView$4();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25823e = mediaPlayer;
        mediaPlayer.reset();
    }

    private void initRv() {
        ((C9289md) this.binding).f60599b2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((C9289md) this.binding).f60601c2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25817b = new lgh(this, ((C9289md) this.binding).f60599b2, this.f25821d, true);
        this.f25819c = new lgh(this, ((C9289md) this.binding).f60601c2, this.f25821d, false);
        List<dbh> latestData = this.f25804H ? this.f25821d.getLatestData() : new ArrayList<>();
        if (mc2.isEmpty(latestData)) {
            ((C9289md) this.binding).f60588M1.setVisibility(8);
            dbh dbhVar = new dbh();
            dbhVar.setResult(a77.C0077a.f542d);
            dbhVar.setTransResult(a77.C0077a.f542d);
            this.f25817b.addData(dbhVar);
            this.f25819c.addData(dbhVar);
            showEmptyView();
        } else {
            ((C9289md) this.binding).f60583C.setVisibility(8);
            ((C9289md) this.binding).f60609m.setVisibility(0);
            Collections.reverse(latestData);
            dbh dbhVar2 = new dbh();
            dbhVar2.setResult(a77.C0077a.f542d);
            dbhVar2.setTransResult(a77.C0077a.f542d);
            latestData.add(dbhVar2);
            this.f25817b.setData(latestData);
            this.f25819c.setData(latestData);
            ((C9289md) this.binding).f60603d2.setVisibility(8);
        }
        ((C9289md) this.binding).f60599b2.scrollToPosition(this.f25817b.getItemCount() - 1);
        ((C9289md) this.binding).f60599b2.setAdapter(this.f25817b);
        ((C9289md) this.binding).f60599b2.setItemAnimator(null);
        ((C9289md) this.binding).f60601c2.scrollToPosition(this.f25819c.getItemCount() - 1);
        ((C9289md) this.binding).f60601c2.setAdapter(this.f25819c);
        ((C9289md) this.binding).f60601c2.setItemAnimator(null);
        e5d e5dVar = new e5d();
        this.f25814Z1 = e5dVar;
        T t = this.binding;
        e5dVar.syncPositions(((C9289md) t).f60599b2, ((C9289md) t).f60601c2);
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        initRv();
        ((C9289md) this.binding).f60589N.setOnClickListener(new View.OnClickListener() { // from class: egh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32954a.lambda$initUI$1(view);
            }
        });
        ((C9289md) this.binding).f60592X.setOnClickListener(new View.OnClickListener() { // from class: fgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36537a.lambda$initUI$2(view);
            }
        });
        ((C9289md) this.binding).f60600c.setOnClickListener(new ViewOnClickListenerC4181q());
        ((C9289md) this.binding).f60585H.setOnClickListener(new ViewOnClickListenerC4182r());
        ((C9289md) this.binding).f60606f.setOnClickListener(new ViewOnClickListenerC4183s());
        ((C9289md) this.binding).f60602d.setOnClickListener(new ViewOnClickListenerC4184t());
        ((C9289md) this.binding).f60593Y.setOnClickListener(new ViewOnClickListenerC4185u());
        ((C9289md) this.binding).f60597a2.setOnClickListener(new ViewOnClickListenerC4186v());
        ((C9289md) this.binding).f60591V1.setOnClickListener(new View.OnClickListener() { // from class: ggh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39781a.lambda$initUI$3(view);
            }
        });
        ((C9289md) this.binding).f60599b2.setOnTouchListener(new ViewOnTouchListenerC4165a());
        ((C9289md) this.binding).f60601c2.setOnTouchListener(new ViewOnTouchListenerC4166b());
        ((C9289md) this.binding).f60608g2.setOnClickListener(new ViewOnClickListenerC4167c());
        ((C9289md) this.binding).f60590Q.setOnClickListener(new ViewOnClickListenerC4168d());
        AudioPlayerManager.getInstance().setAudioPlayerListener(new C4169e());
        ((C9289md) this.binding).f60588M1.setOnClickListener(new ViewOnClickListenerC4170f());
        ((C9289md) this.binding).f60598b.setOnEditClickListener(new C4171g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$autoStartAsr$0() {
        ((C9289md) this.binding).f60593Y.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$4() {
        if (((C9289md) this.binding).f60608g2.getVisibility() == 0) {
            ((C9289md) this.binding).f60608g2.setVisibility(8);
        }
        if (((C9289md) this.binding).f60587M.getVisibility() == 0) {
            ((C9289md) this.binding).f60587M.setVisibility(8);
        }
        this.f25826m = System.currentTimeMillis();
        lgh lghVar = this.f25817b;
        if (lghVar == null || lghVar.getItemCount() <= 0) {
            ((C9289md) this.binding).f60609m.setVisibility(8);
            ((C9289md) this.binding).f60588M1.setVisibility(8);
            showEmptyView();
        } else {
            ((C9289md) this.binding).f60609m.setVisibility(0);
        }
        ((C9289md) this.binding).f60605e2.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$1(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$2(View view) {
        vfe.getInstance().putBoolean("SP_KEY_AI_CHAT_SAVE_DATA", false);
        C2478k.getSinglePool().execute(new RunnableC4180p());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$3(View view) {
        if (isAsring()) {
            setClearScreen(!this.f25810V1);
        } else {
            setClearScreen(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAsrResultOnce$5(boolean z, String str, String str2, String str3, String str4) {
        if (z) {
            zi9.m26855i("TranslationMachineActivity", "msg ==========================================");
            zi9.m26852e("TranslationMachineActivity", "msg =" + str + " isFinal=" + z + " mp3Filepath =" + str2);
        } else {
            zi9.m26850d("TranslationMachineActivity", "msg =" + str + " isFinal=" + z + " mp3Filepath =" + str2);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.f25805L && !this.f25813Z) {
                loopStartPlaying();
            }
            dbh dbhVarQueryByVoicePath = this.f25821d.queryByVoicePath(str2);
            this.f25812Y = dbhVarQueryByVoicePath;
            if (dbhVarQueryByVoicePath == null) {
                dbh dbhVar = new dbh();
                dbhVar.setMessageTime(Long.parseLong(str3));
                dbhVar.setPause(false);
                if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
                    dbhVar.setIsGptOrXF(3);
                } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
                    dbhVar.setIsGptOrXF(3);
                } else {
                    dbhVar.setIsGptOrXF(1);
                }
                dbhVar.setType(this.type);
                dbhVar.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
                dbhVar.setResult(str);
                dbhVar.setTransResult(str4);
                if (!TextUtils.isEmpty(str2)) {
                    dbhVar.setVoicePath(str2);
                }
                this.f25803F.offer(dbhVar);
                zi9.m26855i("TranslationMachineActivity", "msg =插入内容：" + str + " id=" + this.f25821d.insert(dbhVar) + " 音频文件:" + dbhVar.getVoicePath());
            } else {
                zi9.m26855i("TranslationMachineActivity", "msg = 需要更新内容");
            }
        }
        showTextGPTResult(str, str4, str2, str3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$7(MediaPlayer mediaPlayer) {
        this.f25823e.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$6(ArrayList arrayList, String str, int i) {
        if (TextUtils.isEmpty(((ebh) arrayList.get(i)).getXfTransFreelyMessage().getVoicePath())) {
            return false;
        }
        return ((ebh) arrayList.get(i)).getXfTransFreelyMessage().getVoicePath().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loopStartPlaying() {
        if (this.f25806M) {
            return;
        }
        C2478k.runOnUiThreadDelayed(new RunnableC4174j(), 200L);
    }

    private void scrollToBottom() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearScreen(boolean isClear) {
        this.f25810V1 = isClear;
        ((C9289md) this.binding).f60595Z1.setVisibility(isClear ? 4 : 0);
        Handler handler = f25801g2;
        handler.removeCallbacks(this.f25822d2);
        if (isClear || !isAsring()) {
            return;
        }
        handler.postDelayed(this.f25822d2, 30000L);
    }

    private void setTransLanguageData(TransLanguageData fromLanguageData, TransLanguageData toLanguageData) {
        this.f25809Q = false;
        this.f25818b2 = fromLanguageData.getIatLanguage();
        ((C9289md) this.binding).f60600c.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        this.f25820c2 = toLanguageData.getIatLanguage();
        ((C9289md) this.binding).f60606f.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
        if (this.f25808N && TranslateWebSocketManager.getInstance().isOpen() && !isAsring()) {
            zi9.m26855i("TranslationMachineActivity", "msg = 重新开始语音识别.");
            this.f25826m = 0L;
            ((C9289md) this.binding).f60593Y.performClick();
            this.f25826m = 0L;
            if (this.f25805L) {
                this.f25805L = false;
                ((C9289md) this.binding).f60590Q.performClick();
            }
        }
        this.f25808N = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            this.f25823e.reset();
            this.f25823e.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25823e.setDataSource(this, Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4035R.raw.aaa));
            this.f25823e.prepareAsync();
            sendPauseKeyEvent(this.f25825f);
            this.f25823e.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: hgh
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f43608a.lambda$setupMediaPlayer$7(mediaPlayer);
                }
            });
            this.f25823e.setOnCompletionListener(new C4178n());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 2, 2, new C4176l()).show();
    }

    private void showEmptyView() {
        ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.ic_trans_free_talk_model)).diskCacheStrategy(ne4.f64120d).into(((C9289md) this.binding).f60586L);
    }

    private void showGptVoice() {
        this.f25817b.setBeginning(true);
        this.f25819c.setBeginning(true);
        ((C9289md) this.binding).f60588M1.setVisibility(8);
        if (this.f25817b.getData() != null && (this.f25817b.getData().isEmpty() || this.f25817b.getData().size() == 1)) {
            ((C9289md) this.binding).f60603d2.setVisibility(0);
        }
        ((C9289md) this.binding).f60587M.setVisibility(0);
        ((C9289md) this.binding).f60605e2.setText("");
        ((C9289md) this.binding).f60609m.setVisibility(0);
        if (!isDestroyed() && !isFinishing()) {
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.translate_foot_voice)).diskCacheStrategy(ne4.f64120d).into(((C9289md) this.binding).f60587M);
        }
        ((C9289md) this.binding).f60583C.setVisibility(8);
        zi9.m26850d("TranslationMachineActivity", "showGptVoice-------------------- ");
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
        final ArrayList<ebh> data = this.f25817b.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: dgh
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return TranslationMachineActivity.lambda$showTextGPTResult$6(data, mp3Filepath, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent() && !this.f25811X) {
            if (isFinalResult) {
                this.f25811X = true;
            }
            dbh xfTransFreelyMessage = data.get(optionalIntFindFirst.getAsInt()).getXfTransFreelyMessage();
            xfTransFreelyMessage.setResult(text);
            xfTransFreelyMessage.setTransResult(translateString);
            dbh dbhVarCopyMessage = copyMessage(xfTransFreelyMessage);
            dbh dbhVarCopyMessage2 = copyMessage(xfTransFreelyMessage);
            this.f25817b.updateMessage(dbhVarCopyMessage, r9.getItemCount() - 2);
            this.f25819c.updateMessage(dbhVarCopyMessage2, r7.getItemCount() - 2);
            ((C9289md) this.binding).f60599b2.scrollToPosition(this.f25817b.getItemCount() - 1);
            ((C9289md) this.binding).f60601c2.scrollToPosition(this.f25819c.getItemCount() - 1);
            scrollToBottom();
            return;
        }
        this.f25811X = false;
        dbh dbhVar = new dbh();
        dbhVar.setMessageTime(j);
        dbhVar.setPause(false);
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            dbhVar.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            dbhVar.setIsGptOrXF(3);
        } else {
            dbhVar.setIsGptOrXF(1);
        }
        dbhVar.setType(this.type);
        dbhVar.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        dbhVar.setResult(text);
        dbhVar.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            dbhVar.setVoicePath(mp3Filepath);
        }
        dbh dbhVarCopyMessage3 = copyMessage(dbhVar);
        dbh dbhVarCopyMessage4 = copyMessage(dbhVar);
        ((C9289md) this.binding).f60603d2.setVisibility(8);
        lgh lghVar = this.f25817b;
        lghVar.addData(lghVar.getItemCount() - 1, dbhVarCopyMessage3);
        lgh lghVar2 = this.f25819c;
        lghVar2.addData(lghVar2.getItemCount() - 1, dbhVarCopyMessage4);
        ((C9289md) this.binding).f60599b2.scrollToPosition(this.f25817b.getItemCount() - 1);
        ((C9289md) this.binding).f60601c2.scrollToPosition(this.f25819c.getItemCount() - 1);
        scrollToBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startGptVoice() {
        if (checkAndRequestPermissions()) {
            if (!NetworkUtils.isConnected()) {
                l3h.showToastShort(getString(C4035R.string.loading_no_net_view_text_hint));
                return;
            }
            ((C9289md) this.binding).f60601c2.setVisibility(0);
            ((C9289md) this.binding).f60595Z1.setVisibility(0);
            ((C9289md) this.binding).f60607f2.setVisibility(0);
            lgh lghVar = this.f25817b;
            if (lghVar != null && lghVar.getItemCount() > 0) {
                ((C9289md) this.binding).f60599b2.scrollToPosition(this.f25817b.getItemCount() - 1);
            }
            lgh lghVar2 = this.f25819c;
            if (lghVar2 != null && lghVar2.getItemCount() > 0) {
                ((C9289md) this.binding).f60601c2.scrollToPosition(this.f25819c.getItemCount() - 1);
            }
            this.type = this.phoneType;
            ((C9289md) this.binding).f60593Y.setImageResource(C4035R.drawable.ic_broadcast_pause);
            gptVoice();
        }
    }

    private void startPlayFile(ebh transMachineMessageSelect, String voicePath) {
        if (transMachineMessageSelect != null && !transMachineMessageSelect.isAlreadyPlayed()) {
            transMachineMessageSelect.setAlreadyPlayed(true);
            if (this.f25819c.getItemCount() - 3 >= 0) {
                this.f25819c.getData().get(this.f25819c.getItemCount() - 3).setAlreadyPlayed(true);
            }
        }
        this.f25807M1 = 0;
        playFile(xt5.getFileByPath(voicePath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void startPlaying() {
        ebh ebhVar;
        if (this.f25809Q) {
            zi9.m26855i("TranslationMachineActivity", "msg =选择语言中，停止...");
            return;
        }
        this.f25813Z = true;
        if (AudioPlayerManager.getInstance().isPlaying()) {
            zi9.m26855i("TranslationMachineActivity", "msg =播报中，请等待");
            loopStartPlaying();
            return;
        }
        if (!this.f25805L) {
            ((C9289md) this.binding).f60590Q.setImageResource(C4035R.drawable.ic_trans_ban_playing);
            ((C9289md) this.binding).f60590Q.setScaleX(1.0f);
            ((C9289md) this.binding).f60590Q.setScaleY(1.0f);
            zi9.m26855i("TranslationMachineActivity", "msg =停止播报中");
            return;
        }
        dbh dbhVarPoll = this.f25803F.poll();
        ((C9289md) this.binding).f60590Q.setImageResource(C4035R.drawable.ic_trans_playing);
        ebh ebhVar2 = this.f25819c.getItemCount() + (-2) >= 0 ? this.f25819c.getData().get(this.f25819c.getItemCount() - 2) : null;
        if (dbhVarPoll == null || TextUtils.isEmpty(dbhVarPoll.getVoicePath())) {
            if (isAsring()) {
                if (this.f25819c.getItemCount() - 2 >= 0) {
                    ebhVar2 = this.f25819c.getData().get(this.f25819c.getItemCount() - 2);
                }
                if ((ebhVar2 == null || ebhVar2.isAlreadyPlayed() || !xt5.isFileExists(ebhVar2.getXfTransFreelyMessage().getVoicePath())) && this.f25819c.getItemCount() - 3 >= 0 && (ebhVar = this.f25819c.getData().get(this.f25819c.getItemCount() - 2)) != null && !ebhVar.isAlreadyPlayed()) {
                    ebhVar2 = this.f25819c.getData().get(this.f25819c.getItemCount() - 3);
                }
            }
            if (ebhVar2 == null || ebhVar2.isAlreadyPlayed()) {
                zi9.m26855i("TranslationMachineActivity", "msg =音频全部播报完毕");
                this.f25813Z = false;
                ((C9289md) this.binding).f60590Q.setScaleX(1.0f);
                ((C9289md) this.binding).f60590Q.setScaleY(1.0f);
            } else {
                String voicePath = ebhVar2.getXfTransFreelyMessage().getVoicePath();
                if (xt5.isFileExists(voicePath)) {
                    ebhVar2.setAlreadyPlayed(true);
                    zi9.m26852e("TranslationMachineActivity", "msg =列表，播报:" + ebhVar2.getXfTransFreelyMessage().getTransResult() + " 音频文件:" + voicePath);
                    playFile(xt5.getFileByPath(voicePath));
                } else {
                    zi9.m26855i("TranslationMachineActivity", "msg =列表，音频文件未生成:" + voicePath);
                    C2478k.runOnUiThreadDelayed(new RunnableC4173i(), 1000L);
                }
            }
        } else {
            ((C9289md) this.binding).f60590Q.setScaleX(1.2f);
            ((C9289md) this.binding).f60590Q.setScaleY(1.2f);
            if (xt5.isFileExists(dbhVarPoll.getVoicePath())) {
                zi9.m26852e("TranslationMachineActivity", "msg =队列，播报:" + dbhVarPoll.getTransResult() + " 音频文件:" + dbhVarPoll.getVoicePath());
                if (ebhVar2 != null && !ebhVar2.isAlreadyPlayed()) {
                    ebhVar2.setAlreadyPlayed(true);
                    if (this.f25819c.getItemCount() - 3 >= 0) {
                        this.f25819c.getData().get(this.f25819c.getItemCount() - 3).setAlreadyPlayed(true);
                    }
                }
                this.f25807M1 = 0;
                playFile(xt5.getFileByPath(dbhVarPoll.getVoicePath()));
            } else {
                zi9.m26855i("TranslationMachineActivity", "msg =队列，音频文件未生成,重试:" + (this.f25807M1 + 1) + " path:" + dbhVarPoll.getVoicePath());
                int i = this.f25807M1;
                if (i <= 3) {
                    this.f25807M1 = i + 1;
                    this.f25803F.offer(dbhVarPoll);
                    this.f25805L = true;
                } else {
                    this.f25807M1 = 0;
                }
                C2478k.runOnUiThreadDelayed(new RunnableC4172h(), 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRecognizerAndRecord() {
        zi9.m26852e("TranslationMachineActivity", "msg = 停止播报.");
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
        ((C9289md) this.binding).f60590Q.setScaleX(1.0f);
        ((C9289md) this.binding).f60590Q.setScaleY(1.0f);
        if (this.f25809Q) {
            return;
        }
        ((C9289md) this.binding).f60590Q.setImageResource(C4035R.drawable.ic_trans_ban_playing);
        this.f25805L = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        ((C9289md) this.binding).f60593Y.setImageResource(C4035R.drawable.ic_start_recording);
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
        this.f25818b2 = fromLanguageData.getIatLanguage();
        ((C9289md) this.binding).f60600c.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        this.f25820c2 = toLanguageData.getIatLanguage();
        ((C9289md) this.binding).f60606f.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
        setTransLanguageData(this.fromLanguageData, toLanguageData);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        this.f25802C = true;
        this.f25804H = vfe.getInstance().getBoolean("SP_KEY_AI_CHAT_SAVE_DATA", false);
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25821d = ((TransMachineDatabase) this.database).messageDao();
        initUI();
        startAsrSocket();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public TransMachineDatabase getDatabase() {
        return TransMachineDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C9289md getViewBinding() {
        return C9289md.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
        playFile(responseData);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onAsrResultOnce(String sourLangeuage, final String result, final String transText, final String mp3Filepath, final String startTimeId, final boolean isFinal) {
        runOnUiThread(new Runnable() { // from class: cgh
            @Override // java.lang.Runnable
            public final void run() {
                this.f16498a.lambda$onAsrResultOnce$5(isFinal, result, mp3Filepath, startTimeId, transText);
            }
        });
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        vfe.getInstance().putBoolean("SP_KEY_AI_CHAT_SAVE_DATA", true);
        finish();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopRecognizerAndRecord();
        dismissNotifyDialog();
        Handler handler = f25801g2;
        if (handler != null) {
            handler.removeCallbacks(this.f25822d2);
        }
        this.f25806M = true;
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
        zi9.m26855i("TranslationMachineActivity", "msg = 收到停止语音识别回调.");
        voiceViewGone();
        f25801g2.removeCallbacks(this.f25822d2);
        runOnUiThread(new RunnableC4179o());
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onWebSocketOpen() {
        super.onWebSocketOpen();
        zi9.m26852e("TranslationMachineActivity", "msg = WebSocket连接成功.");
        autoStartAsr();
    }

    public void playFile(File file) {
        MediaPlayer mediaPlayer = this.f25823e;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        AudioPlayerManager.getInstance().playAudioFile(this.f25825f, file, 3);
    }

    public void stopPlayback() {
        zi9.m26850d("TranslationMachineActivity", "stopPlayback--------------------- =");
        MediaPlayer mediaPlayer = this.f25823e;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25823e = null;
        }
    }
}
