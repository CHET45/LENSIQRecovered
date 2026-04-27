package com.eyevue.glassapp.view.translate.headsetmodel;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2478k;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.glassapp.base.BaseAsrTransActivity;
import com.eyevue.glassapp.utils.AudioManagerUtil;
import com.eyevue.glassapp.view.translate.headsetmodel.C2938a;
import com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity;
import com.watchfun.trans.database.transear.TransHeadSetMessageDatabase;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.widget.BottomEditView;
import com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import com.watchfun.translatewebsocket.strategy.TransAiStrategy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import p000.C5194e9;
import p000.amc;
import p000.axg;
import p000.bah;
import p000.c5e;
import p000.cah;
import p000.eah;
import p000.g1i;
import p000.igg;
import p000.l3h;
import p000.mc2;
import p000.ne4;
import p000.pj4;
import p000.ubb;
import p000.vfe;
import p000.xt5;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class TransAiActivity extends BaseAsrTransActivity<C5194e9, TransHeadSetMessageDatabase> implements AudioPlayerManager.AudioPlayerListener, MediaNewButtonReceiver.IKeyDownListener, MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: m2 */
    public static final String f19171m2 = "TransAiActivity";

    /* JADX INFO: renamed from: e2 */
    public C2938a f19172e2;

    /* JADX INFO: renamed from: f2 */
    public cah f19173f2;

    /* JADX INFO: renamed from: g2 */
    public MediaPlayer f19174g2;

    /* JADX INFO: renamed from: i2 */
    public MediaNewButtonReceiver f19176i2;

    /* JADX INFO: renamed from: j2 */
    public long f19177j2;

    /* JADX INFO: renamed from: l2 */
    public boolean f19179l2;

    /* JADX INFO: renamed from: h2 */
    public boolean f19175h2 = false;

    /* JADX INFO: renamed from: k2 */
    public boolean f19178k2 = false;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$a */
    public class ViewOnClickListenerC2925a implements View.OnClickListener {
        public ViewOnClickListenerC2925a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransAiActivity.this.isAsring()) {
                return;
            }
            TransAiActivity.this.f19179l2 = !r2.f19179l2;
            if (TransAiActivity.this.f19172e2 != null) {
                TransAiActivity.this.f19172e2.setEditMode(TransAiActivity.this.f19179l2);
            }
            ((C5194e9) TransAiActivity.this.f18225b).f32159c.setEditMode(TransAiActivity.this.f19179l2);
            if (TransAiActivity.this.f19179l2) {
                ((C5194e9) TransAiActivity.this.f18225b).f32143F.setVisibility(8);
            } else {
                ((C5194e9) TransAiActivity.this.f18225b).f32143F.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$b */
    public class C2926b implements PhoneEarModelShowTipDialog.OnDialogClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19181a;

        public C2926b(final int val$projectType) {
            this.f19181a = val$projectType;
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            StringBuilder sb = new StringBuilder();
            sb.append("projectType =");
            sb.append(this.f19181a);
            if (this.f19181a == 2) {
                vfe.getInstance().putBoolean("SP_KEY_PHONE_GLASSES_MODEL_TIP", isChecked);
            } else {
                vfe.getInstance().putBoolean("SP_KEY_PHONE_EAR_MODEL_TIP", isChecked);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$c */
    public class C2927c implements AudioManager.OnAudioFocusChangeListener {
        public C2927c() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$d */
    public class C2928d implements MediaPlayer.OnCompletionListener {
        public C2928d() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            TransAiActivity.this.f19174g2.reset();
            TransAiActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$e */
    public class ViewOnClickListenerC2929e implements View.OnClickListener {
        public ViewOnClickListenerC2929e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransAiActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$f */
    public class ViewOnClickListenerC2930f implements View.OnClickListener {
        public ViewOnClickListenerC2930f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransAiActivity.this.isAsring()) {
                return;
            }
            TransAiActivity.this.exchangeLanguage();
            TextView textView = ((C5194e9) TransAiActivity.this.f18225b).f32162f;
            TransAiActivity transAiActivity = TransAiActivity.this;
            textView.setText(AiLangUtil.getValue(transAiActivity, transAiActivity.f18224a2.getKeyName()));
            TextView textView2 = ((C5194e9) TransAiActivity.this.f18225b).f32163m;
            TransAiActivity transAiActivity2 = TransAiActivity.this;
            textView2.setText(AiLangUtil.getValue(transAiActivity2, transAiActivity2.f18224a2.getKeyName()));
            TextView textView3 = ((C5194e9) TransAiActivity.this.f18225b).f32160d;
            TransAiActivity transAiActivity3 = TransAiActivity.this;
            textView3.setText(AiLangUtil.getValue(transAiActivity3, transAiActivity3.f18226b2.getKeyName()));
            TextView textView4 = ((C5194e9) TransAiActivity.this.f18225b).f32142C;
            TransAiActivity transAiActivity4 = TransAiActivity.this;
            textView4.setText(AiLangUtil.getValue(transAiActivity4, transAiActivity4.f18226b2.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$g */
    public class ViewOnClickListenerC2931g implements View.OnClickListener {
        public ViewOnClickListenerC2931g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransAiActivity.this.startSelectTransActivity(((C5194e9) TransAiActivity.this.f18225b).f32162f.getText().toString(), ((C5194e9) TransAiActivity.this.f18225b).f32142C.getText().toString(), 1, TransActionEnumMode.PHONE_HEADSET_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$h */
    public class ViewOnClickListenerC2932h implements View.OnClickListener {
        public ViewOnClickListenerC2932h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransAiActivity.this.startSelectTransActivity(((C5194e9) TransAiActivity.this.f18225b).f32142C.getText().toString(), ((C5194e9) TransAiActivity.this.f18225b).f32162f.getText().toString(), 2, TransActionEnumMode.PHONE_HEADSET_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$i */
    public class ViewOnClickListenerC2933i implements View.OnClickListener {
        public ViewOnClickListenerC2933i() {
        }

        @Override // android.view.View.OnClickListener
        @c5e(api = 26)
        public void onClick(View v) {
            if (TransAiActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(TransAiActivity.this)) {
                    l3h.showToastShort(TransAiActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                TransAiActivity transAiActivity = TransAiActivity.this;
                ((C5194e9) TransAiActivity.this.f18225b).f32156a2.setText(TransAiActivity.this.getString(C4201R.string.str_recorder_dialog_glasses_tip) + g1i.f38277c + AiLangUtil.getValue(transAiActivity, transAiActivity.f18226b2.getKeyName()));
                if (amc.getInstance().isPlaying()) {
                    amc.getInstance().pauseMp3Playback();
                    amc.getInstance().pausePlayback();
                }
                TransAiActivity.this.gptEarVoice();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$j */
    public class ViewOnClickListenerC2934j implements View.OnClickListener {
        public ViewOnClickListenerC2934j() {
        }

        @Override // android.view.View.OnClickListener
        @c5e(api = 26)
        public void onClick(View v) {
            if (TransAiActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(TransAiActivity.this)) {
                    l3h.showToastShort(TransAiActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                TransAiActivity transAiActivity = TransAiActivity.this;
                ((C5194e9) TransAiActivity.this.f18225b).f32156a2.setText(TransAiActivity.this.getString(C4201R.string.str_recorder_dialog_glasses_tip) + g1i.f38277c + AiLangUtil.getValue(transAiActivity, transAiActivity.f18224a2.getKeyName()));
                if (amc.getInstance().isPlaying()) {
                    amc.getInstance().pauseMp3Playback();
                    amc.getInstance().pausePlayback();
                }
                TransAiActivity.this.gptPhoneVoice();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$k */
    public class ViewOnClickListenerC2935k implements View.OnClickListener {
        public ViewOnClickListenerC2935k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TransAiActivity.this.f19177j2 <= 500) {
                return;
            }
            TransAiActivity.this.f19177j2 = System.currentTimeMillis();
            TransAiActivity.this.voiceViewGone();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$l */
    public class C2936l implements C2938a.g {

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$l$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f19193a;

            public a(final View val$v) {
                this.f19193a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19193a.setScaleX(1.0f);
                this.f19193a.setScaleY(1.0f);
            }
        }

        public C2936l() {
        }

        @Override // com.eyevue.glassapp.view.translate.headsetmodel.C2938a.g
        public void click(boolean isSelect) {
            TransAiActivity.this.f19178k2 = isSelect;
            ((C5194e9) TransAiActivity.this.f18225b).f32159c.setViewSelected(TransAiActivity.this.f19178k2);
        }

        @Override // com.eyevue.glassapp.view.translate.headsetmodel.C2938a.g
        public void onItemChatPlayVoice(View v, int postion, bah xfAiMessage) {
            TransAiActivity.this.f18214M = xfAiMessage.getType();
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
            if (amc.getInstance().isPlaying()) {
                amc.getInstance().pauseMp3Playback();
                amc.getInstance().pausePlayback();
            }
            if (!TextUtils.isEmpty(xfAiMessage.getVoicePath())) {
                if (xt5.isFileExists(xfAiMessage.getVoicePath())) {
                    TransAiActivity.this.playFile(xt5.getFileByPath(xfAiMessage.getVoicePath()));
                    return;
                } else {
                    TransAiActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), xfAiMessage.getVoicePath());
                    return;
                }
            }
            String str = TranslateWebSocketManager.getInstance().getOutputPath() + pj4.f71071b + System.currentTimeMillis() + ".mp3";
            TransAiActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), str);
            xfAiMessage.setVoicePath(str);
            TransAiActivity.this.f19172e2.updateChangedItemBean(xfAiMessage, postion);
            TransAiActivity.this.f19173f2.updateVoicePathById(xfAiMessage.getId(), str);
        }

        @Override // com.eyevue.glassapp.view.translate.headsetmodel.C2938a.g
        public void onItemLongClick(View v, int postion, bah xfAiMessage, boolean isEditMode) {
            TransAiActivity.this.f19179l2 = isEditMode;
            ((C5194e9) TransAiActivity.this.f18225b).f32159c.setEditMode(isEditMode);
            ((C5194e9) TransAiActivity.this.f18225b).f32143F.setVisibility(isEditMode ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.TransAiActivity$m */
    public class C2937m implements BottomEditView.OnEditClickListener {
        public C2937m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<bah> it = TransAiActivity.this.f19173f2.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TransAiActivity.this.f19173f2.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TransAiActivity.this.f19179l2 = false;
            TransAiActivity.this.f19172e2.setEditMode(false);
            ((C5194e9) TransAiActivity.this.f18225b).f32143F.setVisibility(0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: q8h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f73635a.lambda$onDelete$0();
                    }
                });
            } else {
                for (bah bahVar : TransAiActivity.this.f19172e2.getSelectData()) {
                    TransAiActivity.this.f19173f2.deleteSelectData(bahVar.getMessageTime());
                    xt5.delete(bahVar.getVoicePath());
                }
            }
            TransAiActivity.this.f19172e2.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TransAiActivity.this.f19172e2.setAllSelectState(isAllSelect);
        }
    }

    private void audioStopMusic() {
        AudioManagerUtil.getInstance().getAudioManager().requestAudioFocus(new C2927c(), 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptEarVoice() {
        if (System.currentTimeMillis() - this.f19177j2 <= 500) {
            return;
        }
        this.f19177j2 = System.currentTimeMillis();
        this.f18214M = this.f18217Q;
        showGptVoice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptPhoneVoice() {
        if (System.currentTimeMillis() - this.f19177j2 <= 500) {
            return;
        }
        this.f19177j2 = System.currentTimeMillis();
        this.f18214M = this.f18216N;
        showGptVoice();
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: i8h
            @Override // java.lang.Runnable
            public final void run() {
                this.f46075a.lambda$hideVoiceView$0();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f19174g2 = mediaPlayer;
        mediaPlayer.reset();
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        if (!vfe.getInstance().getBoolean("SP_KEY_PHONE_GLASSES_MODEL_TIP", false)) {
            showModelDialog(2);
        }
        ((C5194e9) this.f18225b).f32157b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f19172e2 = new C2938a(this, ((C5194e9) this.f18225b).f32157b, this.f19173f2);
        List<bah> latestTen = this.f19173f2.getLatestTen();
        if (mc2.isEmpty(latestTen)) {
            ((C5194e9) this.f18225b).f32145L.setVisibility(0);
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_glasses_dialog)).diskCacheStrategy(ne4.f64120d).into(((C5194e9) this.f18225b).f32148N);
            ((C5194e9) this.f18225b).f32154Z1.setText(C4201R.string.ai_tarns_glasses_empty);
        } else {
            ((C5194e9) this.f18225b).f32145L.setVisibility(8);
            Collections.reverse(latestTen);
            this.f19172e2.setData(latestTen);
            ((C5194e9) this.f18225b).f32157b.scrollToPosition(this.f19172e2.getItemCount() - 1);
        }
        ((C5194e9) this.f18225b).f32157b.setAdapter(this.f19172e2);
        ((C5194e9) this.f18225b).f32157b.setItemAnimator(null);
        ((C5194e9) this.f18225b).f32151X.setOnClickListener(new ViewOnClickListenerC2929e());
        ((C5194e9) this.f18225b).f32158b2.setVisibility(8);
        ((C5194e9) this.f18225b).f32146M.setOnClickListener(new ViewOnClickListenerC2930f());
        ((C5194e9) this.f18225b).f32162f.setOnClickListener(new ViewOnClickListenerC2931g());
        AudioPlayerManager.getInstance().setAudioPlayerListener(this);
        ((C5194e9) this.f18225b).f32142C.setOnClickListener(new ViewOnClickListenerC2932h());
        ((C5194e9) this.f18225b).f32160d.setOnClickListener(new ViewOnClickListenerC2933i());
        ((C5194e9) this.f18225b).f32143F.setOnClickListener(new ViewOnClickListenerC2934j());
        ((C5194e9) this.f18225b).f32158b2.setOnClickListener(new ViewOnClickListenerC2935k());
        this.f19172e2.setOnItemClickListener(new C2936l());
        ((C5194e9) this.f18225b).f32159c.setOnEditClickListener(new C2937m());
        ((C5194e9) this.f18225b).f32161e.setOnClickListener(new ViewOnClickListenerC2925a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$0() {
        this.f19177j2 = System.currentTimeMillis();
        if (((C5194e9) this.f18225b).f32158b2.getVisibility() == 0) {
            ((C5194e9) this.f18225b).f32158b2.setVisibility(8);
        }
        this.f19175h2 = false;
        ((C5194e9) this.f18225b).f32156a2.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioPlaybackCompleted$2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$3(MediaPlayer mediaPlayer) {
        this.f19174g2.start();
        zi9.m26850d("TransAiActivity", "setOnPreparedListener -------------" + this.f18214M);
        if (this.f19176i2 == null) {
            this.f19176i2 = new MediaNewButtonReceiver(this, this);
        }
        int i = this.f18214M;
        if (i == 1) {
            AudioManagerUtil.getInstance().getAudioManager().setMode(0);
            AudioManagerUtil.getInstance().getAudioManager().setSpeakerphoneOn(false);
            AudioManagerUtil.getInstance().getAudioManager().setBluetoothScoOn(false);
            AudioManagerUtil.getInstance().getAudioManager().stopBluetoothSco();
            return;
        }
        if (i == 2) {
            AudioManagerUtil.getInstance().getAudioManager().setMode(3);
            AudioManagerUtil.getInstance().getAudioManager().setSpeakerphoneOn(true);
            AudioManagerUtil.getInstance().getAudioManager().setBluetoothScoOn(false);
            AudioManagerUtil.getInstance().getAudioManager().stopBluetoothSco();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$1(ArrayList arrayList, long j, int i) {
        return ((eah) arrayList.get(i)).getXfAiMessage().getMessageTime() == j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playFile(File file) {
        if (isAsring()) {
            return;
        }
        AudioPlayerManager.getInstance().playAudioFile(AudioManagerUtil.getInstance().getAudioManager(), file, this.f18214M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            zi9.m26850d("TransAiActivity", "setupMediaPlayer");
            this.f19174g2.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f19174g2.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f19174g2.prepareAsync();
            zi9.m26850d("TransAiActivity", "setupMediaPlayer -------------");
            sendPauseKeyEvent(AudioManagerUtil.getInstance().getAudioManager());
            this.f19174g2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: k8h
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f52811a.lambda$setupMediaPlayer$3(mediaPlayer);
                }
            });
            this.f19174g2.setOnCompletionListener(new C2928d());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showGptVoice() {
        this.f19175h2 = true;
        ((C5194e9) this.f18225b).f32156a2.setText("");
        ((C5194e9) this.f18225b).f32158b2.setVisibility(0);
        ((C5194e9) this.f18225b).f32143F.setVisibility(0);
        this.f19179l2 = false;
        ((C5194e9) this.f18225b).f32159c.setEditMode(false);
        this.f19172e2.setEditMode(false);
        ((C5194e9) this.f18225b).f32157b.scrollToPosition(this.f19172e2.getItemCount() - 1);
        if (!isDestroyed() && !isFinishing()) {
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_blue)).diskCacheStrategy(ne4.f64120d).into(((C5194e9) this.f18225b).f32149Q);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_green)).diskCacheStrategy(ne4.f64120d).into(((C5194e9) this.f18225b).f32149Q);
            }
        }
        ((C5194e9) this.f18225b).f32145L.setVisibility(8);
        startAsr(8000L);
    }

    private void showModelDialog(int projectType) {
        new PhoneEarModelShowTipDialog(this, projectType, 1, new C2926b(projectType)).show();
    }

    private void showTextGPTResult(String text, String translateString, String mp3Filepath, String startTimeId, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        final long j = Long.parseLong(startTimeId);
        final ArrayList<eah> data = this.f19172e2.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: m8h
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return TransAiActivity.lambda$showTextGPTResult$1(data, j, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent()) {
            int asInt = optionalIntFindFirst.getAsInt();
            bah xfAiMessage = data.get(asInt).getXfAiMessage();
            xfAiMessage.setResult(text);
            xfAiMessage.setTransResult(translateString);
            this.f19172e2.updateMessage(xfAiMessage, asInt);
            this.f19173f2.updateTransResultByMessageTime(j, text, translateString);
            ((C5194e9) this.f18225b).f32157b.scrollToPosition(this.f19172e2.getItemCount() - 1);
            return;
        }
        bah bahVar = new bah();
        bahVar.setMessageTime(j);
        bahVar.setPause(false);
        if (this.f18214M == this.f18216N && this.f18226b2.isUseMicTTS()) {
            bahVar.setIsGptOrXF(3);
        } else if (this.f18214M == this.f18217Q && this.f18224a2.isUseMicTTS()) {
            bahVar.setIsGptOrXF(3);
        } else {
            bahVar.setIsGptOrXF(1);
        }
        bahVar.setType(this.f18214M);
        bahVar.setIsLangCode((this.f18214M == this.f18216N ? this.f18226b2 : this.f18224a2).getIatLanguage());
        bahVar.setResult(text);
        bahVar.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            bahVar.setVoicePath(mp3Filepath);
        }
        this.f19172e2.addData(bahVar);
        ((C5194e9) this.f18225b).f32157b.scrollToPosition(this.f19172e2.getItemCount() - 1);
        this.f19173f2.insert(bahVar);
    }

    private void stopMediaAndRecoveryKey() {
        MediaNewButtonReceiver mediaNewButtonReceiver = this.f19176i2;
        if (mediaNewButtonReceiver != null) {
            mediaNewButtonReceiver.release();
            this.f19176i2 = null;
        }
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        this.f19175h2 = false;
        hideVoiceView();
        stopAsr();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90919P;
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90917O;
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C5194e9) this.f18225b).f32162f.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        ((C5194e9) this.f18225b).f32163m.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C5194e9) this.f18225b).f32142C.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initView() {
        super.initView();
        initPcmAudio();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f19173f2 = ((TransHeadSetMessageDatabase) this.f18227c).messageDao();
        initUI();
        setTransMode(4);
        setCurrentStrategy(new TransAiStrategy());
        startAsrSocket();
    }

    @Override // p000.InterfaceC12632sk.b
    public void loadAudioFail() {
    }

    @Override // p000.InterfaceC12632sk.b
    public void loadAudioListSuccess(File responseData) {
        zi9.m26850d("TransAiActivity", "type =" + this.f18214M);
        playFile(responseData);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onAsrResultContinuous(String result, String transContent, String mp3Filepath, String startTimeId, boolean isFinal) {
        super.onAsrResultContinuous(result, transContent, mp3Filepath, startTimeId, isFinal);
        showTextGPTResult(result, transContent, mp3Filepath, startTimeId, isFinal);
    }

    @Override // com.watchfun.transcommon.manager.trans.AudioPlayerManager.AudioPlayerListener
    public void onAudioPlaybackCompleted() {
        runOnUiThread(new Runnable() { // from class: o8h
            @Override // java.lang.Runnable
            public final void run() {
                TransAiActivity.lambda$onAudioPlaybackCompleted$2();
            }
        });
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopMediaAndRecoveryKey();
        vfe.getInstance().putBoolean("SP_KEY_SUPPORT_TRANS_STATUS", false);
    }

    @Override // com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver.IKeyDownListener
    public void onKeyDown(int keyAction) {
        zi9.m26850d("TransAiActivity", "keyAction...");
        if (keyAction == 87 || keyAction == 88 || keyAction == 126 || keyAction == 127) {
            zi9.m26850d("TransAiActivity", "下一首..." + this.f19175h2);
            if (this.f19175h2) {
                return;
            }
            ((C5194e9) this.f18225b).f32160d.performClick();
        }
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
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        stopMediaAndRecoveryKey();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onStopAsrView() {
        super.onStopAsrView();
        hideVoiceView();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onTtsFile(File file) {
        super.onTtsFile(file);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onTtsMp3Byte(byte[] bytes) {
        super.onTtsMp3Byte(bytes);
        if (AudioPlayerManager.getInstance().isPlaying()) {
            AudioPlayerManager.getInstance().stopAudio();
        }
        amc.getInstance().resumeMp3Playback();
        amc.getInstance().addMp3AudioData(bytes);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onTtsPcmByte(byte[] bytes) {
        super.onTtsPcmByte(bytes);
        if (AudioPlayerManager.getInstance().isPlaying()) {
            AudioPlayerManager.getInstance().stopAudio();
        }
        amc.getInstance().resumePlayback();
        amc.getInstance().addAudioData(bytes);
    }

    public void stopPlayback() {
        zi9.m26850d("TransAiActivity", "stopPlayback--------------------- =");
        MediaPlayer mediaPlayer = this.f19174g2;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f19174g2 = null;
        }
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    @igg({"RestrictedApi"})
    public TransHeadSetMessageDatabase getDatabase() {
        return TransHeadSetMessageDatabase.getDatabase(this);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public C5194e9 getViewBinding() {
        return C5194e9.inflate(getLayoutInflater());
    }
}
