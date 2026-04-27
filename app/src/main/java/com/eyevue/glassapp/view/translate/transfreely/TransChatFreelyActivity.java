package com.eyevue.glassapp.view.translate.transfreely;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2478k;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.glassapp.base.BaseAsrTransActivity;
import com.eyevue.glassapp.view.translate.transfreely.C2985a;
import com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity;
import com.watchfun.trans.database.transfreely.TransFreelyDatabase;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.transcommon.widget.BottomEditView;
import com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import com.watchfun.translatewebsocket.strategy.TransChatFreeStrategy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import p000.C10257o9;
import p000.aah;
import p000.amc;
import p000.axg;
import p000.igg;
import p000.l3h;
import p000.ne4;
import p000.pj4;
import p000.t9h;
import p000.u0b;
import p000.ubb;
import p000.vfe;
import p000.xt5;
import p000.z9h;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class TransChatFreelyActivity extends BaseAsrTransActivity<C10257o9, TransFreelyDatabase> implements MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: m2 */
    public static final String f19324m2 = "TransChatFreelyActivity";

    /* JADX INFO: renamed from: e2 */
    public C2985a f19325e2;

    /* JADX INFO: renamed from: f2 */
    public t9h f19326f2;

    /* JADX INFO: renamed from: g2 */
    public MediaPlayer f19327g2;

    /* JADX INFO: renamed from: h2 */
    public AudioManager f19328h2;

    /* JADX INFO: renamed from: i2 */
    public long f19329i2;

    /* JADX INFO: renamed from: k2 */
    public boolean f19331k2;

    /* JADX INFO: renamed from: j2 */
    public boolean f19330j2 = false;

    /* JADX INFO: renamed from: l2 */
    public final Map<String, Boolean> f19332l2 = new HashMap();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$a */
    public class ViewOnClickListenerC2972a implements View.OnClickListener {
        public ViewOnClickListenerC2972a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyActivity.this.isAsring()) {
                return;
            }
            TransChatFreelyActivity.this.f19331k2 = !r2.f19331k2;
            if (TransChatFreelyActivity.this.f19325e2 != null) {
                TransChatFreelyActivity.this.f19325e2.setEditMode(TransChatFreelyActivity.this.f19331k2);
            }
            ((C10257o9) TransChatFreelyActivity.this.f18225b).f66817c.setEditMode(TransChatFreelyActivity.this.f19331k2);
            if (TransChatFreelyActivity.this.f19331k2) {
                ((C10257o9) TransChatFreelyActivity.this.f18225b).f66803L.setVisibility(8);
            } else {
                ((C10257o9) TransChatFreelyActivity.this.f18225b).f66803L.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$b */
    public class C2973b implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C2973b() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_PHONE_MODEL_TIP", isChecked);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$c */
    public class C2974c implements AudioManager.OnAudioFocusChangeListener {
        public C2974c() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$d */
    public class C2975d implements MediaPlayer.OnCompletionListener {
        public C2975d() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            TransChatFreelyActivity.this.f19327g2.reset();
            TransChatFreelyActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$e */
    public class ViewOnClickListenerC2976e implements View.OnClickListener {
        public ViewOnClickListenerC2976e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$f */
    public class ViewOnClickListenerC2977f implements View.OnClickListener {
        public ViewOnClickListenerC2977f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyActivity transChatFreelyActivity = TransChatFreelyActivity.this;
            transChatFreelyActivity.startSelectTransActivity(((C10257o9) transChatFreelyActivity.f18225b).f66823f.getText().toString(), ((C10257o9) TransChatFreelyActivity.this.f18225b).f66802H.getText().toString(), 1, TransActionEnumMode.TRANSLATOR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$g */
    public class ViewOnClickListenerC2978g implements View.OnClickListener {
        public ViewOnClickListenerC2978g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyActivity.this.isAsring()) {
                return;
            }
            TransChatFreelyActivity.this.exchangeLanguage();
            TextView textView = ((C10257o9) TransChatFreelyActivity.this.f18225b).f66823f;
            TransChatFreelyActivity transChatFreelyActivity = TransChatFreelyActivity.this;
            textView.setText(AiLangUtil.getValue(transChatFreelyActivity, transChatFreelyActivity.f18224a2.getKeyName()));
            TextView textView2 = ((C10257o9) TransChatFreelyActivity.this.f18225b).f66800C;
            TransChatFreelyActivity transChatFreelyActivity2 = TransChatFreelyActivity.this;
            textView2.setText(AiLangUtil.getValue(transChatFreelyActivity2, transChatFreelyActivity2.f18224a2.getKeyName()));
            TextView textView3 = ((C10257o9) TransChatFreelyActivity.this.f18225b).f66819d;
            TransChatFreelyActivity transChatFreelyActivity3 = TransChatFreelyActivity.this;
            textView3.setText(AiLangUtil.getValue(transChatFreelyActivity3, transChatFreelyActivity3.f18226b2.getKeyName()));
            TextView textView4 = ((C10257o9) TransChatFreelyActivity.this.f18225b).f66802H;
            TransChatFreelyActivity transChatFreelyActivity4 = TransChatFreelyActivity.this;
            textView4.setText(AiLangUtil.getValue(transChatFreelyActivity4, transChatFreelyActivity4.f18226b2.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$h */
    public class ViewOnClickListenerC2979h implements View.OnClickListener {
        public ViewOnClickListenerC2979h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyActivity transChatFreelyActivity = TransChatFreelyActivity.this;
            transChatFreelyActivity.startSelectTransActivity(((C10257o9) transChatFreelyActivity.f18225b).f66802H.getText().toString(), ((C10257o9) TransChatFreelyActivity.this.f18225b).f66823f.getText().toString(), 2, TransActionEnumMode.TRANSLATOR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$i */
    public class ViewOnClickListenerC2980i implements View.OnClickListener {
        public ViewOnClickListenerC2980i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(TransChatFreelyActivity.this)) {
                    l3h.showToastShort(TransChatFreelyActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                if (amc.getInstance().isPlaying()) {
                    amc.getInstance().pauseMp3Playback();
                    amc.getInstance().pausePlayback();
                }
                TransChatFreelyActivity.this.gptRightVoice();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$j */
    public class ViewOnClickListenerC2981j implements View.OnClickListener {
        public ViewOnClickListenerC2981j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(TransChatFreelyActivity.this)) {
                    l3h.showToastShort(TransChatFreelyActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                if (amc.getInstance().isPlaying()) {
                    amc.getInstance().pauseMp3Playback();
                    amc.getInstance().pausePlayback();
                }
                TransChatFreelyActivity.this.gptPhoneVoice();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$k */
    public class ViewOnClickListenerC2982k implements View.OnClickListener {
        public ViewOnClickListenerC2982k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TransChatFreelyActivity.this.f19329i2 <= 500) {
                return;
            }
            TransChatFreelyActivity.this.f19329i2 = System.currentTimeMillis();
            TransChatFreelyActivity.this.voiceViewGone();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$l */
    public class C2983l implements C2985a.g {

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$l$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f19345a;

            public a(final View val$v) {
                this.f19345a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19345a.setScaleX(1.0f);
                this.f19345a.setScaleY(1.0f);
            }
        }

        public C2983l() {
        }

        @Override // com.eyevue.glassapp.view.translate.transfreely.C2985a.g
        public void click(boolean isSelect) {
            TransChatFreelyActivity.this.f19330j2 = isSelect;
            ((C10257o9) TransChatFreelyActivity.this.f18225b).f66817c.setViewSelected(TransChatFreelyActivity.this.f19330j2);
        }

        @Override // com.eyevue.glassapp.view.translate.transfreely.C2985a.g
        public void onItemChatPlayVoice(View v, int postion, z9h xfAiMessage) {
            TransChatFreelyActivity.this.f18214M = xfAiMessage.getType();
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
            if (amc.getInstance().isPlaying()) {
                amc.getInstance().pauseMp3Playback();
                amc.getInstance().pausePlayback();
            }
            if (!TextUtils.isEmpty(xfAiMessage.getVoicePath())) {
                if (xt5.isFileExists(xfAiMessage.getVoicePath())) {
                    TransChatFreelyActivity.this.playFile(xt5.getFileByPath(xfAiMessage.getVoicePath()));
                    return;
                } else {
                    TransChatFreelyActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), xfAiMessage.getVoicePath());
                    return;
                }
            }
            String str = TranslateWebSocketManager.getInstance().getOutputPath() + pj4.f71071b + System.currentTimeMillis() + ".mp3";
            TransChatFreelyActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), str);
            xfAiMessage.setVoicePath(str);
            TransChatFreelyActivity.this.f19325e2.updateChangedItemBean(xfAiMessage, postion);
            TransChatFreelyActivity.this.f19326f2.updateVoicePathById(xfAiMessage.getId(), str);
        }

        @Override // com.eyevue.glassapp.view.translate.transfreely.C2985a.g
        public void onItemLongClick(View v, int postion, z9h xfAiMessage, boolean isEditMode) {
            TransChatFreelyActivity.this.f19331k2 = isEditMode;
            ((C10257o9) TransChatFreelyActivity.this.f18225b).f66817c.setEditMode(isEditMode);
            ((C10257o9) TransChatFreelyActivity.this.f18225b).f66803L.setVisibility(isEditMode ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.TransChatFreelyActivity$m */
    public class C2984m implements BottomEditView.OnEditClickListener {
        public C2984m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<z9h> it = TransChatFreelyActivity.this.f19326f2.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TransChatFreelyActivity.this.f19326f2.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TransChatFreelyActivity.this.f19331k2 = false;
            TransChatFreelyActivity.this.f19325e2.setEditMode(TransChatFreelyActivity.this.f19331k2);
            ((C10257o9) TransChatFreelyActivity.this.f18225b).f66803L.setVisibility(TransChatFreelyActivity.this.f19331k2 ? 8 : 0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: j9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50050a.lambda$onDelete$0();
                    }
                });
            } else {
                for (z9h z9hVar : TransChatFreelyActivity.this.f19325e2.getSelectData()) {
                    TransChatFreelyActivity.this.f19326f2.deleteSelectData(z9hVar.getMessageTime());
                    xt5.delete(z9hVar.getVoicePath());
                }
            }
            TransChatFreelyActivity.this.f19325e2.removeSelectData();
            TransChatFreelyActivity.this.f19332l2.clear();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TransChatFreelyActivity.this.f19325e2.setAllSelectState(isAllSelect);
        }
    }

    private void audioStopMusic() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f19328h2 = audioManager;
        audioManager.setMode(3);
        this.f19328h2.setSpeakerphoneOn(true);
        this.f19328h2.setBluetoothScoOn(false);
        this.f19328h2.stopBluetoothSco();
        this.f19328h2.requestAudioFocus(new C2974c(), 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptPhoneVoice() {
        if (System.currentTimeMillis() - this.f19329i2 <= 500) {
            return;
        }
        this.f19329i2 = System.currentTimeMillis();
        this.f18214M = this.f18216N;
        showGptVoice();
        this.f19332l2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptRightVoice() {
        if (System.currentTimeMillis() - this.f19329i2 <= 500) {
            return;
        }
        this.f19329i2 = System.currentTimeMillis();
        this.f18214M = this.f18217Q;
        showGptVoice();
        zi9.m26850d("TransChatFreelyActivity", "data.getIatLanguage() =" + this.f18226b2.getIatLanguage());
        this.f19332l2.clear();
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: f9h
            @Override // java.lang.Runnable
            public final void run() {
                this.f35794a.lambda$hideVoiceView$2();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f19327g2 = mediaPlayer;
        mediaPlayer.reset();
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        if (!vfe.getInstance().getBoolean("SP_KEY_PHONE_MODEL_TIP", false)) {
            showDialog();
        }
        ((C10257o9) this.f18225b).f66815b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f19325e2 = new C2985a(this, ((C10257o9) this.f18225b).f66815b, this.f19326f2);
        List<z9h> latestTen = this.f19326f2.getLatestTen();
        if (AppUtils.isEmpty(latestTen)) {
            ((C10257o9) this.f18225b).f66806N.setVisibility(0);
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_phone_model)).diskCacheStrategy(ne4.f64120d).into(((C10257o9) this.f18225b).f66811Z);
        } else {
            ((C10257o9) this.f18225b).f66806N.setVisibility(8);
            Collections.reverse(latestTen);
            this.f19325e2.setData(latestTen);
            ((C10257o9) this.f18225b).f66815b.scrollToPosition(this.f19325e2.getItemCount() - 1);
        }
        ((C10257o9) this.f18225b).f66815b.setAdapter(this.f19325e2);
        ((C10257o9) this.f18225b).f66815b.setItemAnimator(null);
        ((C10257o9) this.f18225b).f66808V1.setOnClickListener(new ViewOnClickListenerC2976e());
        ((C10257o9) this.f18225b).f66823f.setOnClickListener(new ViewOnClickListenerC2977f());
        ((C10257o9) this.f18225b).f66810Y.setOnClickListener(new ViewOnClickListenerC2978g());
        ((C10257o9) this.f18225b).f66802H.setOnClickListener(new ViewOnClickListenerC2979h());
        ((C10257o9) this.f18225b).f66801F.setOnClickListener(new ViewOnClickListenerC2980i());
        ((C10257o9) this.f18225b).f66825m.setOnClickListener(new ViewOnClickListenerC2981j());
        ((C10257o9) this.f18225b).f66824f2.setOnClickListener(new ViewOnClickListenerC2982k());
        this.f19325e2.setItemClickListener(new C2983l());
        ((C10257o9) this.f18225b).f66817c.setOnEditClickListener(new C2984m());
        ((C10257o9) this.f18225b).f66821e.setOnClickListener(new ViewOnClickListenerC2972a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$2() {
        this.f19329i2 = System.currentTimeMillis();
        if (((C10257o9) this.f18225b).f66824f2.getVisibility() == 0) {
            ((C10257o9) this.f18225b).f66824f2.setVisibility(8);
        }
        ((C10257o9) this.f18225b).f66822e2.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0() {
        initPcmAudio();
        setPcmAudioSpeakerMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$4(MediaPlayer mediaPlayer) {
        this.f19327g2.start();
        zi9.m26850d("TransChatFreelyActivity", "setupMediaPlayer -------222------");
        if (this.f19328h2.isSpeakerphoneOn()) {
            zi9.m26850d("TransChatFreelyActivity", "当前处于扬声器模式");
            this.f19328h2.setMode(3);
            this.f19328h2.setSpeakerphoneOn(true);
        } else {
            this.f19328h2.setMode(3);
            this.f19328h2.setSpeakerphoneOn(true);
            this.f19328h2.setBluetoothScoOn(false);
            this.f19328h2.stopBluetoothSco();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showGptVoice$1() {
        startAsr(8000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$3(ArrayList arrayList, long j, int i) {
        return ((aah) arrayList.get(i)).getXfTransFreelyMessage().getMessageTime() == j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playFile(File file) {
        MediaPlayer mediaPlayer = this.f19327g2;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        if (AudioPlayerManager.getInstance().isPlaying()) {
            AudioPlayerManager.getInstance().stopAudio();
        }
        AudioPlayerManager.getInstance().playAudioFile(this.f19328h2, file, this.f18217Q);
    }

    private void setPcmAudioSpeakerMode() {
        try {
            amc amcVar = amc.getInstance();
            if (amcVar.isInitialized()) {
                amc.EnumC0331d enumC0331d = amc.EnumC0331d.TRANSLATE;
                amcVar.setCurrentActiveModule(enumC0331d);
                amcVar.setModuleChannelSwitchEnable(enumC0331d, true);
                amcVar.switchAudioChannel(u0b.EnumC13307d.SPEAKER);
            }
        } catch (Exception e) {
            Log.e("TransChatFreelyActivity", "Failed to set PcmAudioManager speaker mode: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            zi9.m26850d("TransChatFreelyActivity", "setupMediaPlayer");
            this.f19327g2.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f19327g2.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f19327g2.prepare();
            zi9.m26850d("TransChatFreelyActivity", "setupMediaPlayer -------------");
            sendPauseKeyEvent(this.f19328h2);
            this.f19327g2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: h9h
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f42962a.lambda$setupMediaPlayer$4(mediaPlayer);
                }
            });
            this.f19327g2.setOnCompletionListener(new C2975d());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 2, 2, new C2973b()).show();
    }

    private void showGptVoice() {
        ((C10257o9) this.f18225b).f66822e2.setText("");
        ((C10257o9) this.f18225b).f66824f2.setVisibility(0);
        ((C10257o9) this.f18225b).f66815b.scrollToPosition(this.f19325e2.getItemCount() - 1);
        if (!isDestroyed() && !isFinishing()) {
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_blue)).diskCacheStrategy(ne4.f64120d).into(((C10257o9) this.f18225b).f66805M1);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_green)).diskCacheStrategy(ne4.f64120d).into(((C10257o9) this.f18225b).f66805M1);
            }
        }
        ((C10257o9) this.f18225b).f66806N.setVisibility(8);
        zi9.m26850d("TransChatFreelyActivity", "showGptVoice-------------------- ");
        new Thread(new Runnable() { // from class: g9h
            @Override // java.lang.Runnable
            public final void run() {
                this.f39071a.lambda$showGptVoice$1();
            }
        }).start();
    }

    private void showTextGPTResult(String text, String translateString, String mp3Filepath, String startTimeId, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        final long j = Long.parseLong(startTimeId);
        final ArrayList<aah> data = this.f19325e2.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: d9h
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return TransChatFreelyActivity.lambda$showTextGPTResult$3(data, j, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent()) {
            int asInt = optionalIntFindFirst.getAsInt();
            z9h xfTransFreelyMessage = data.get(asInt).getXfTransFreelyMessage();
            xfTransFreelyMessage.setResult(text);
            xfTransFreelyMessage.setTransResult(translateString);
            this.f19325e2.updateMessage(xfTransFreelyMessage, asInt);
            this.f19326f2.updateTransResultByMessageTime(j, text, translateString);
            ((C10257o9) this.f18225b).f66815b.scrollToPosition(this.f19325e2.getItemCount() - 1);
            return;
        }
        z9h z9hVar = new z9h();
        z9hVar.setMessageTime(j);
        z9hVar.setPause(false);
        if (this.f18214M == this.f18216N && this.f18226b2.isUseMicTTS()) {
            z9hVar.setIsGptOrXF(3);
        } else if (this.f18214M == this.f18217Q && this.f18224a2.isUseMicTTS()) {
            z9hVar.setIsGptOrXF(3);
        } else {
            z9hVar.setIsGptOrXF(1);
        }
        z9hVar.setType(this.f18214M);
        z9hVar.setIsLangCode((this.f18214M == this.f18216N ? this.f18226b2 : this.f18224a2).getIatLanguage());
        z9hVar.setResult(text);
        z9hVar.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            z9hVar.setVoicePath(mp3Filepath);
        }
        this.f19325e2.addData(z9hVar);
        ((C10257o9) this.f18225b).f66815b.scrollToPosition(this.f19325e2.getItemCount() - 1);
        this.f19326f2.insert(z9hVar);
    }

    private void stopRecognizerAndRecord() {
        AudioManager audioManager = this.f19328h2;
        if (audioManager != null) {
            audioManager.setMode(0);
            this.f19328h2.setSpeakerphoneOn(false);
        }
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        hideVoiceView();
        stopAsr();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90927T;
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90925S;
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C10257o9) this.f18225b).f66823f.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        ((C10257o9) this.f18225b).f66800C.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C10257o9) this.f18225b).f66802H.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
        ((C10257o9) this.f18225b).f66819d.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void initView() {
        super.initView();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        setTransMode(2);
        this.f19326f2 = ((TransFreelyDatabase) this.f18227c).messageDao();
        initUI();
        setCurrentStrategy(new TransChatFreeStrategy());
        startAsrSocket();
        C2478k.runOnUiThreadDelayed(new Runnable() { // from class: b9h
            @Override // java.lang.Runnable
            public final void run() {
                this.f13086a.lambda$initView$0();
            }
        }, 100L);
    }

    @Override // p000.InterfaceC12632sk.b
    public void loadAudioFail() {
    }

    @Override // p000.InterfaceC12632sk.b
    public void loadAudioListSuccess(File responseData) {
        zi9.m26850d("TransChatFreelyActivity", "responseData =" + responseData.getPath());
        MediaPlayer mediaPlayer = this.f19327g2;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        playFile(responseData);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onAsrResultContinuous(String result, String transContent, String mp3Filepath, String startTimeId, boolean isFinal) {
        super.onAsrResultContinuous(result, transContent, mp3Filepath, startTimeId, isFinal);
        showTextGPTResult(result, transContent, mp3Filepath, startTimeId, isFinal);
        if (!isFinal || TextUtils.isEmpty(startTimeId)) {
            return;
        }
        this.f19332l2.remove(startTimeId);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopRecognizerAndRecord();
        this.f19332l2.clear();
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
        if (amc.getInstance().isPlaying()) {
            amc.getInstance().resumeMp3Playback();
            amc.getInstance().resumePlayback();
        }
        AudioManager audioManager = this.f19328h2;
        if (audioManager != null) {
            audioManager.setMode(3);
            this.f19328h2.setSpeakerphoneOn(true);
        }
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        setPcmAudioSpeakerMode();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setPcmAudioSpeakerMode();
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        stopRecognizerAndRecord();
        this.f19332l2.clear();
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
        setPcmAudioSpeakerMode();
        amc.getInstance().resumeMp3Playback();
        amc.getInstance().addMp3AudioData(bytes);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public void onTtsPcmByte(byte[] bytes) {
        super.onTtsPcmByte(bytes);
        if (AudioPlayerManager.getInstance().isPlaying()) {
            AudioPlayerManager.getInstance().stopAudio();
        }
        setPcmAudioSpeakerMode();
        amc.getInstance().resumePlayback();
        amc.getInstance().addAudioData(bytes);
    }

    public void stopPlayback() {
        zi9.m26850d("TransChatFreelyActivity", "stopPlayback--------------------- =");
        MediaPlayer mediaPlayer = this.f19327g2;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f19327g2 = null;
        }
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    @igg({"RestrictedApi"})
    public TransFreelyDatabase getDatabase() {
        return TransFreelyDatabase.getDatabase(this);
    }

    @Override // com.eyevue.glassapp.base.BaseAsrTransActivity
    public C10257o9 getViewBinding() {
        return C10257o9.inflate(getLayoutInflater());
    }
}
