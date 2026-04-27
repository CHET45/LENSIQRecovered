package com.watchfun.trans.freedomtalk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2478k;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.watchfun.base.BaseActivity;
import com.watchfun.trans.database.freedomTalk.FreedomTalkDatabase;
import com.watchfun.trans.freedomtalk.C4055a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.base.BaseAsrActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.gpt.GPTContract;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.widget.BottomEditView;
import com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p000.C8725l9;
import p000.axg;
import p000.bx6;
import p000.dx6;
import p000.ich;
import p000.igg;
import p000.l3h;
import p000.mc2;
import p000.ne4;
import p000.pj4;
import p000.ryg;
import p000.ubb;
import p000.vfe;
import p000.xt5;
import p000.zgb;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class FreedomTalkActivity extends BaseAsrActivity<C8725l9, FreedomTalkDatabase> implements GPTContract.AiGPTTextToAudioView, AudioPlayerManager.AudioPlayerListener, MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: L */
    public static final String f25330L = "FreedomTalkActivity";

    /* JADX INFO: renamed from: C */
    public int f25331C;

    /* JADX INFO: renamed from: F */
    public long f25332F;

    /* JADX INFO: renamed from: a */
    public C4055a f25334a;

    /* JADX INFO: renamed from: b */
    public bx6 f25335b;

    /* JADX INFO: renamed from: c */
    public MediaPlayer f25336c;

    /* JADX INFO: renamed from: d */
    public AudioManager f25337d;

    /* JADX INFO: renamed from: e */
    public boolean f25338e;

    /* JADX INFO: renamed from: m */
    public dx6 f25340m;

    /* JADX INFO: renamed from: f */
    public boolean f25339f = false;

    /* JADX INFO: renamed from: H */
    public final BroadcastReceiver f25333H = new C4046d();

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$a */
    public class C4043a implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C4043a() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_FREEDOM_TALK_TIP", isChecked);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$b */
    public class C4044b implements AudioManager.OnAudioFocusChangeListener {
        public C4044b() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$c */
    public class C4045c implements MediaPlayer.OnCompletionListener {
        public C4045c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            FreedomTalkActivity.this.f25336c.reset();
            FreedomTalkActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$d */
    public class C4046d extends BroadcastReceiver {
        public C4046d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
                l3h.showToastLong(FreedomTalkActivity.this.getString(C4201R.string.device_status_tip));
                FreedomTalkActivity.this.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$e */
    public class ViewOnClickListenerC4047e implements View.OnClickListener {
        public ViewOnClickListenerC4047e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            FreedomTalkActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$f */
    public class ViewOnClickListenerC4048f implements View.OnClickListener {
        public ViewOnClickListenerC4048f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (FreedomTalkActivity.this.isAsring()) {
                return;
            }
            FreedomTalkActivity.this.exchangeLanguage();
            TextView textView = ((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56873d;
            FreedomTalkActivity freedomTalkActivity = FreedomTalkActivity.this;
            textView.setText(AiLangUtil.getValue(freedomTalkActivity, ((BaseAsrActivity) freedomTalkActivity).fromLanguageData.getKeyName()));
            TextView textView2 = ((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56875f;
            FreedomTalkActivity freedomTalkActivity2 = FreedomTalkActivity.this;
            textView2.setText(AiLangUtil.getValue(freedomTalkActivity2, ((BaseAsrActivity) freedomTalkActivity2).toLanguageData.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$g */
    public class ViewOnClickListenerC4049g implements View.OnClickListener {
        public ViewOnClickListenerC4049g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            FreedomTalkActivity.this.startSelectTransActivity(((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56873d.getText().toString(), ((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56875f.getText().toString(), 1, TransActionEnumMode.DUAL_FREEDOM_TALK_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$h */
    public class ViewOnClickListenerC4050h implements View.OnClickListener {
        public ViewOnClickListenerC4050h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            FreedomTalkActivity.this.startSelectTransActivity(((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56875f.getText().toString(), ((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56873d.getText().toString(), 2, TransActionEnumMode.DUAL_FREEDOM_TALK_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$i */
    public class ViewOnClickListenerC4051i implements View.OnClickListener {
        public ViewOnClickListenerC4051i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (FreedomTalkActivity.this.checkAndRequestPermissions()) {
                if (ubb.isNetworkAvailable(FreedomTalkActivity.this)) {
                    FreedomTalkActivity.this.showGptVoice();
                } else {
                    l3h.showToastShort(FreedomTalkActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$j */
    public class ViewOnClickListenerC4052j implements View.OnClickListener {
        public ViewOnClickListenerC4052j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - FreedomTalkActivity.this.f25332F <= 500) {
                return;
            }
            FreedomTalkActivity.this.f25332F = System.currentTimeMillis();
            FreedomTalkActivity.this.voiceViewGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$k */
    public class C4053k implements C4055a.g {

        /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$k$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f25352a;

            public a(final View val$v) {
                this.f25352a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25352a.setScaleX(1.0f);
                this.f25352a.setScaleY(1.0f);
            }
        }

        public C4053k() {
        }

        @Override // com.watchfun.trans.freedomtalk.C4055a.g
        public void click(boolean isSelect) {
            FreedomTalkActivity.this.f25339f = isSelect;
            ((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56872c.setViewSelected(FreedomTalkActivity.this.f25339f);
        }

        @Override // com.watchfun.trans.freedomtalk.C4055a.g
        public void onItemChatPlayVoice(View v, int postion, dx6 xfAiMessage) {
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
            ((BaseAsrActivity) FreedomTalkActivity.this).type = xfAiMessage.getType();
            zi9.m26850d(FreedomTalkActivity.f25330L, "type =" + ((BaseAsrActivity) FreedomTalkActivity.this).type);
            if (!TextUtils.isEmpty(xfAiMessage.getVoicePath())) {
                if (xt5.isFileExists(xfAiMessage.getVoicePath())) {
                    FreedomTalkActivity.this.playFile(xt5.getFileByPath(xfAiMessage.getVoicePath()));
                    return;
                } else {
                    FreedomTalkActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), xfAiMessage.getVoicePath());
                    return;
                }
            }
            String str = TranslateWebSocketManager.getInstance().getOutputPath() + pj4.f71071b + System.currentTimeMillis() + ".mp3";
            FreedomTalkActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), str);
            xfAiMessage.setVoicePath(str);
            FreedomTalkActivity.this.f25334a.updateChangedItemBean(xfAiMessage, postion);
            FreedomTalkActivity.this.f25335b.updateVoicePathById(xfAiMessage.getId(), str);
        }

        @Override // com.watchfun.trans.freedomtalk.C4055a.g
        public void onItemLongClick(View v, int postion, dx6 xfAiMessage, boolean isEditMode) {
            ((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56872c.setEditMode(isEditMode);
            FreedomTalkActivity.this.updateRecyclerViewBottomMargin(isEditMode);
            ((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56874e.setVisibility(isEditMode ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.FreedomTalkActivity$l */
    public class C4054l implements BottomEditView.OnEditClickListener {
        public C4054l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<dx6> it = FreedomTalkActivity.this.f25335b.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            FreedomTalkActivity.this.f25335b.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            FreedomTalkActivity.this.f25334a.setEditMode(false);
            FreedomTalkActivity.this.updateRecyclerViewBottomMargin(false);
            ((C8725l9) ((BaseActivity) FreedomTalkActivity.this).binding).f56874e.setVisibility(0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: ax6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12098a.lambda$onDelete$0();
                    }
                });
            } else {
                for (dx6 dx6Var : FreedomTalkActivity.this.f25334a.getSelectData()) {
                    FreedomTalkActivity.this.f25335b.deleteSelectData(dx6Var.getMessageTime());
                    xt5.delete(dx6Var.getVoicePath());
                }
            }
            FreedomTalkActivity.this.f25334a.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            FreedomTalkActivity.this.f25334a.setAllSelectState(isAllSelect);
        }
    }

    private void audioStopMusic() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f25337d = audioManager;
        if (audioManager != null) {
            audioManager.setMode(0);
            this.f25337d.setSpeakerphoneOn(false);
        }
        this.f25337d.requestAudioFocus(new C4044b(), 3, 1);
    }

    private void autoStartAsr() {
        if (vfe.getInstance().getBoolean("SP_KEY_FREEDOM_TALK_TIP", false)) {
            ryg.postOnMainThreadDelayed(new Runnable() { // from class: xw6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99560a.lambda$autoStartAsr$0();
                }
            }, 500L);
        }
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: zw6
            @Override // java.lang.Runnable
            public final void run() {
                this.f106183a.lambda$hideVoiceView$1();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25336c = mediaPlayer;
        mediaPlayer.reset();
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        if (!vfe.getInstance().getBoolean("SP_KEY_FREEDOM_TALK_TIP", false)) {
            showDialog();
        }
        ((C8725l9) this.binding).f56871b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25334a = new C4055a(this, ((C8725l9) this.binding).f56871b, this.f25335b);
        List<dx6> latestTen = this.f25335b.getLatestTen();
        if (mc2.isEmpty(latestTen)) {
            ((C8725l9) this.binding).f56857C.setVisibility(0);
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.free_talk_image)).diskCacheStrategy(ne4.f64120d).into(((C8725l9) this.binding).f56860L);
        } else {
            ((C8725l9) this.binding).f56857C.setVisibility(8);
            Collections.reverse(latestTen);
            this.f25334a.setData(latestTen);
            ((C8725l9) this.binding).f56871b.scrollToPosition(this.f25334a.getItemCount() - 1);
        }
        ((C8725l9) this.binding).f56871b.setAdapter(this.f25334a);
        ((C8725l9) this.binding).f56871b.setItemAnimator(null);
        ((C8725l9) this.binding).f56863N.setOnClickListener(new ViewOnClickListenerC4047e());
        ((C8725l9) this.binding).f56859H.setOnClickListener(new ViewOnClickListenerC4048f());
        ((C8725l9) this.binding).f56873d.setOnClickListener(new ViewOnClickListenerC4049g());
        ((C8725l9) this.binding).f56875f.setOnClickListener(new ViewOnClickListenerC4050h());
        ((C8725l9) this.binding).f56874e.setOnClickListener(new ViewOnClickListenerC4051i());
        ((C8725l9) this.binding).f56869Z1.setOnClickListener(new ViewOnClickListenerC4052j());
        this.f25334a.setOnItemClickListener(new C4053k());
        ((C8725l9) this.binding).f56872c.setOnEditClickListener(new C4054l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$autoStartAsr$0() {
        ((C8725l9) this.binding).f56874e.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$1() {
        if (((C8725l9) this.binding).f56869Z1.getVisibility() == 0) {
            ((C8725l9) this.binding).f56869Z1.setVisibility(8);
        }
        ((C8725l9) this.binding).f56865V1.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$2(MediaPlayer mediaPlayer) {
        this.f25336c.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playFile(File file) {
        AudioPlayerManager.getInstance().playAudioFile(this.f25337d, file, this.phoneType);
    }

    private void registerBluetoothReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        registerReceiver(this.f25333H, intentFilter);
        this.f25338e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            zi9.m26850d(f25330L, "setupMediaPlayer");
            this.f25336c.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25336c.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f25336c.prepareAsync();
            zi9.m26850d(f25330L, "setupMediaPlayer -------------");
            sendPauseKeyEvent(this.f25337d);
            this.f25336c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: yw6
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f103186a.lambda$setupMediaPlayer$2(mediaPlayer);
                }
            });
            this.f25336c.setOnCompletionListener(new C4045c());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 2, 3, new C4043a()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGptVoice() {
        if (System.currentTimeMillis() - this.f25332F <= 500) {
            return;
        }
        this.f25332F = System.currentTimeMillis();
        ((C8725l9) this.binding).f56869Z1.setVisibility(0);
        ((C8725l9) this.binding).f56871b.scrollToPosition(this.f25334a.getItemCount() - 1);
        ((C8725l9) this.binding).f56872c.setEditMode(false);
        this.f25334a.setEditMode(false);
        if (!isDestroyed() && !isFinishing()) {
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_blue)).diskCacheStrategy(ne4.f64120d).into(((C8725l9) this.binding).f56861M);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_green)).diskCacheStrategy(ne4.f64120d).into(((C8725l9) this.binding).f56861M);
            }
        }
        ((C8725l9) this.binding).f56857C.setVisibility(8);
        startAsr(true);
    }

    private void showTextGPTResult(String language, String text, String translateString, String mp3Filepath, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        if (this.f25340m == null) {
            dx6 dx6Var = new dx6();
            this.f25340m = dx6Var;
            dx6Var.setMessageTime(System.currentTimeMillis());
            this.f25340m.setPause(false);
            this.f25334a.addData(this.f25340m);
            this.f25331C = this.f25334a.getItemCount() - 1;
        }
        this.f25340m.setResult(text);
        this.f25340m.setTransResult(translateString);
        if (this.fromLanguageData.getIatLanguage().contains(language)) {
            this.type = this.phoneType;
        } else {
            this.type = this.earType;
        }
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            this.f25340m.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            this.f25340m.setIsGptOrXF(3);
        } else {
            this.f25340m.setIsGptOrXF(1);
        }
        this.f25340m.setType(this.type);
        this.f25340m.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        this.f25334a.notifyItemChanged(this.f25331C);
        ((C8725l9) this.binding).f56871b.scrollToPosition(this.f25334a.getItemCount() - 1);
        if (isFinalResult) {
            if (!TextUtils.isEmpty(mp3Filepath)) {
                this.f25340m.setVoicePath(mp3Filepath);
            }
            this.f25335b.insert(this.f25340m);
            this.f25340m = null;
            this.f25331C = -1;
            ich ichVar = new ich();
            ichVar.f46518b = 1;
            ichVar.f46517a = translateString;
            zgb.defaultCenter().publish(ichVar);
        }
    }

    private void stopRecognizerAndRecoveryKey() {
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    private void unRegisterBluetoothReceiver() {
        BroadcastReceiver broadcastReceiver = this.f25333H;
        if (broadcastReceiver != null && this.f25338e) {
            unregisterReceiver(broadcastReceiver);
        }
        this.f25338e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewBottomMargin(boolean isEditMode) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((C8725l9) this.binding).f56871b.getLayoutParams();
        layoutParams.bottomMargin = isEditMode ? (int) TypedValue.applyDimension(1, 90.0f, getResources().getDisplayMetrics()) : 0;
        ((C8725l9) this.binding).f56871b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        hideVoiceView();
        stopAsr();
    }

    public boolean containsChinese(String input) {
        return Pattern.compile("[一-龥]").matcher(input).find();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90935X;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90933W;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C8725l9) this.binding).f56873d.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C8725l9) this.binding).f56875f.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25335b = ((FreedomTalkDatabase) this.database).messageDao();
        initUI();
        startAsrSocketAsLanguages();
        registerBluetoothReceiver();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
        playFile(responseData);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onAsrResultOnce(String sourLangeuage, String result, String transText, String mp3Filepath, String startTimeId, boolean isFinal) {
        super.onAsrResultOnce(sourLangeuage, result, transText, mp3Filepath, startTimeId, isFinal);
        showTextGPTResult(sourLangeuage, result, transText, mp3Filepath, isFinal);
    }

    @Override // com.watchfun.transcommon.manager.trans.AudioPlayerManager.AudioPlayerListener
    public void onAudioPlaybackCompleted() {
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopRecognizerAndRecoveryKey();
        vfe.getInstance().putBoolean("SP_KEY_SUPPORT_TRANS_STATUS", false);
        unRegisterBluetoothReceiver();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        voiceViewGone();
        updateRecyclerViewBottomMargin(false);
        ((C8725l9) this.binding).f56874e.setVisibility(0);
        if (isFinishing()) {
            stopAsrSocket();
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onPermissionSuccess() {
        super.onPermissionSuccess();
        autoStartAsr();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, android.app.Activity
    public void onRestart() {
        super.onRestart();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        autoStartAsr();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        stopRecognizerAndRecoveryKey();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onStopAsrView() {
        super.onStopAsrView();
        hideVoiceView();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onTtsFile(File file) {
        super.onTtsFile(file);
        playFile(file);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onWebSocketOpen() {
        super.onWebSocketOpen();
        autoStartAsr();
    }

    public void stopPlayback() {
        zi9.m26850d(f25330L, "stopPlayback--------------------- =");
        MediaPlayer mediaPlayer = this.f25336c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25336c = null;
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public FreedomTalkDatabase getDatabase() {
        return FreedomTalkDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public C8725l9 getViewBinding() {
        return C8725l9.inflate(getLayoutInflater());
    }
}
