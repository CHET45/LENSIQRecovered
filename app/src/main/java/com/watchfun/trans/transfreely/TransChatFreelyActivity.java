package com.watchfun.trans.transfreely;

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
import com.watchfun.trans.database.transfreely.TransFreelyDatabase;
import com.watchfun.trans.transfreely.C4137a;
import com.watchfun.trans.transfreely.TransChatFreelyActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.base.BaseAsrActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.transcommon.widget.BottomEditView;
import com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import p000.C9747n9;
import p000.aah;
import p000.axg;
import p000.ich;
import p000.igg;
import p000.l3h;
import p000.ne4;
import p000.pj4;
import p000.t9h;
import p000.ubb;
import p000.vfe;
import p000.xt5;
import p000.z9h;
import p000.zgb;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class TransChatFreelyActivity extends BaseAsrActivity<C9747n9, TransFreelyDatabase> implements MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: F */
    public static final String f25555F = "TransChatFreelyActivity";

    /* JADX INFO: renamed from: C */
    public int f25556C;

    /* JADX INFO: renamed from: a */
    public C4137a f25557a;

    /* JADX INFO: renamed from: b */
    public t9h f25558b;

    /* JADX INFO: renamed from: c */
    public MediaPlayer f25559c;

    /* JADX INFO: renamed from: d */
    public AudioManager f25560d;

    /* JADX INFO: renamed from: e */
    public long f25561e;

    /* JADX INFO: renamed from: f */
    public boolean f25562f = false;

    /* JADX INFO: renamed from: m */
    public z9h f25563m;

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$a */
    public class C4099a implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C4099a() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_PHONE_MODEL_TIP", isChecked);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$b */
    public class C4100b implements AudioManager.OnAudioFocusChangeListener {
        public C4100b() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$c */
    public class C4101c implements MediaPlayer.OnCompletionListener {
        public C4101c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            TransChatFreelyActivity.this.f25559c.reset();
            TransChatFreelyActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$d */
    public class ViewOnClickListenerC4102d implements View.OnClickListener {
        public ViewOnClickListenerC4102d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$e */
    public class ViewOnClickListenerC4103e implements View.OnClickListener {
        public ViewOnClickListenerC4103e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyActivity transChatFreelyActivity = TransChatFreelyActivity.this;
            transChatFreelyActivity.startSelectTransActivity(((C9747n9) ((BaseActivity) transChatFreelyActivity).binding).f63663e.getText().toString(), ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63643F.getText().toString(), 1, TransActionEnumMode.TRANSLATOR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$f */
    public class ViewOnClickListenerC4104f implements View.OnClickListener {
        public ViewOnClickListenerC4104f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyActivity.this.isAsring()) {
                return;
            }
            TransChatFreelyActivity.this.exchangeLanguage();
            TextView textView = ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63663e;
            TransChatFreelyActivity transChatFreelyActivity = TransChatFreelyActivity.this;
            textView.setText(AiLangUtil.getValue(transChatFreelyActivity, ((BaseAsrActivity) transChatFreelyActivity).fromLanguageData.getKeyName()));
            TextView textView2 = ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63666m;
            TransChatFreelyActivity transChatFreelyActivity2 = TransChatFreelyActivity.this;
            textView2.setText(AiLangUtil.getValue(transChatFreelyActivity2, ((BaseAsrActivity) transChatFreelyActivity2).fromLanguageData.getKeyName()));
            TextView textView3 = ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63661d;
            TransChatFreelyActivity transChatFreelyActivity3 = TransChatFreelyActivity.this;
            textView3.setText(AiLangUtil.getValue(transChatFreelyActivity3, ((BaseAsrActivity) transChatFreelyActivity3).toLanguageData.getKeyName()));
            TextView textView4 = ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63643F;
            TransChatFreelyActivity transChatFreelyActivity4 = TransChatFreelyActivity.this;
            textView4.setText(AiLangUtil.getValue(transChatFreelyActivity4, ((BaseAsrActivity) transChatFreelyActivity4).toLanguageData.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$g */
    public class ViewOnClickListenerC4105g implements View.OnClickListener {
        public ViewOnClickListenerC4105g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyActivity transChatFreelyActivity = TransChatFreelyActivity.this;
            transChatFreelyActivity.startSelectTransActivity(((C9747n9) ((BaseActivity) transChatFreelyActivity).binding).f63643F.getText().toString(), ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63663e.getText().toString(), 2, TransActionEnumMode.TRANSLATOR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$h */
    public class ViewOnClickListenerC4106h implements View.OnClickListener {
        public ViewOnClickListenerC4106h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyActivity.this.checkAndRequestPermissions()) {
                if (ubb.isNetworkAvailable(TransChatFreelyActivity.this)) {
                    TransChatFreelyActivity.this.gptRightVoice();
                } else {
                    l3h.showToastShort(TransChatFreelyActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$i */
    public class ViewOnClickListenerC4107i implements View.OnClickListener {
        public ViewOnClickListenerC4107i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyActivity.this.checkAndRequestPermissions()) {
                if (ubb.isNetworkAvailable(TransChatFreelyActivity.this)) {
                    TransChatFreelyActivity.this.gptPhoneVoice();
                } else {
                    l3h.showToastShort(TransChatFreelyActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$j */
    public class ViewOnClickListenerC4108j implements View.OnClickListener {
        public ViewOnClickListenerC4108j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TransChatFreelyActivity.this.f25561e <= 500) {
                return;
            }
            TransChatFreelyActivity.this.f25561e = System.currentTimeMillis();
            TransChatFreelyActivity.this.voiceViewGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$k */
    public class C4109k implements C4137a.g {

        /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$k$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f25575a;

            public a(final View val$v) {
                this.f25575a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25575a.setScaleX(1.0f);
                this.f25575a.setScaleY(1.0f);
            }
        }

        public C4109k() {
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void click(boolean isSelect) {
            TransChatFreelyActivity.this.f25562f = isSelect;
            ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63659c.setViewSelected(TransChatFreelyActivity.this.f25562f);
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void onItemChatPlayVoice(View v, int postion, z9h xfAiMessage) {
            ((BaseAsrActivity) TransChatFreelyActivity.this).type = xfAiMessage.getType();
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
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
            TransChatFreelyActivity.this.f25557a.updateChangedItemBean(xfAiMessage, postion);
            TransChatFreelyActivity.this.f25558b.updateVoicePathById(xfAiMessage.getId(), str);
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void onItemLongClick(View v, int postion, z9h xfAiMessage, boolean isEditMode) {
            ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63659c.setEditMode(isEditMode);
            TransChatFreelyActivity.this.updateRecyclerViewBottomMargin(isEditMode);
            ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63644H.setVisibility(isEditMode ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyActivity$l */
    public class C4110l implements BottomEditView.OnEditClickListener {
        public C4110l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<z9h> it = TransChatFreelyActivity.this.f25558b.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TransChatFreelyActivity.this.f25558b.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TransChatFreelyActivity.this.f25557a.setEditMode(false);
            TransChatFreelyActivity.this.updateRecyclerViewBottomMargin(false);
            ((C9747n9) ((BaseActivity) TransChatFreelyActivity.this).binding).f63644H.setVisibility(0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: i9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46149a.lambda$onDelete$0();
                    }
                });
            } else {
                for (z9h z9hVar : TransChatFreelyActivity.this.f25557a.getSelectData()) {
                    TransChatFreelyActivity.this.f25558b.deleteSelectData(z9hVar.getMessageTime());
                    xt5.delete(z9hVar.getVoicePath());
                }
            }
            TransChatFreelyActivity.this.f25557a.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TransChatFreelyActivity.this.f25557a.setAllSelectState(isAllSelect);
        }
    }

    private void audioStopMusic() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f25560d = audioManager;
        audioManager.setMode(3);
        this.f25560d.setSpeakerphoneOn(true);
        this.f25560d.setBluetoothScoOn(false);
        this.f25560d.stopBluetoothSco();
        this.f25560d.requestAudioFocus(new C4100b(), 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptPhoneVoice() {
        if (System.currentTimeMillis() - this.f25561e <= 500) {
            return;
        }
        this.f25561e = System.currentTimeMillis();
        this.type = this.phoneType;
        showGptVoice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptRightVoice() {
        if (System.currentTimeMillis() - this.f25561e <= 500) {
            return;
        }
        this.f25561e = System.currentTimeMillis();
        this.type = this.earType;
        showGptVoice();
        zi9.m26850d("TransChatFreelyActivity", "data.getIatLanguage() =" + this.toLanguageData.getIatLanguage());
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: a9h
            @Override // java.lang.Runnable
            public final void run() {
                this.f775a.lambda$hideVoiceView$0();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25559c = mediaPlayer;
        mediaPlayer.reset();
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        if (!vfe.getInstance().getBoolean("SP_KEY_PHONE_MODEL_TIP", false)) {
            showDialog();
        }
        ((C9747n9) this.binding).f63657b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25557a = new C4137a(this, ((C9747n9) this.binding).f63657b, this.f25558b);
        List<z9h> latestTen = this.f25558b.getLatestTen();
        if (AppUtils.isEmpty(latestTen)) {
            ((C9747n9) this.binding).f63646M.setVisibility(0);
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_phone_model)).diskCacheStrategy(ne4.f64120d).into(((C9747n9) this.binding).f63652Y);
        } else {
            ((C9747n9) this.binding).f63646M.setVisibility(8);
            Collections.reverse(latestTen);
            this.f25557a.setData(latestTen);
            ((C9747n9) this.binding).f63657b.scrollToPosition(this.f25557a.getItemCount() - 1);
        }
        ((C9747n9) this.binding).f63657b.setAdapter(this.f25557a);
        ((C9747n9) this.binding).f63657b.setItemAnimator(null);
        ((C9747n9) this.binding).f63647M1.setOnClickListener(new ViewOnClickListenerC4102d());
        ((C9747n9) this.binding).f63663e.setOnClickListener(new ViewOnClickListenerC4103e());
        ((C9747n9) this.binding).f63651X.setOnClickListener(new ViewOnClickListenerC4104f());
        ((C9747n9) this.binding).f63643F.setOnClickListener(new ViewOnClickListenerC4105g());
        ((C9747n9) this.binding).f63642C.setOnClickListener(new ViewOnClickListenerC4106h());
        ((C9747n9) this.binding).f63665f.setOnClickListener(new ViewOnClickListenerC4107i());
        ((C9747n9) this.binding).f63664e2.setOnClickListener(new ViewOnClickListenerC4108j());
        this.f25557a.setItemClickListener(new C4109k());
        ((C9747n9) this.binding).f63659c.setOnEditClickListener(new C4110l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$0() {
        this.f25561e = System.currentTimeMillis();
        if (((C9747n9) this.binding).f63664e2.getVisibility() == 0) {
            ((C9747n9) this.binding).f63664e2.setVisibility(8);
        }
        ((C9747n9) this.binding).f63662d2.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$2(MediaPlayer mediaPlayer) {
        this.f25559c.start();
        zi9.m26850d("TransChatFreelyActivity", "setupMediaPlayer -------222------");
        if (this.f25560d.isSpeakerphoneOn()) {
            zi9.m26850d("TransChatFreelyActivity", "当前处于扬声器模式");
            this.f25560d.setMode(3);
            this.f25560d.setSpeakerphoneOn(true);
        } else {
            this.f25560d.setMode(3);
            this.f25560d.setSpeakerphoneOn(true);
            this.f25560d.setBluetoothScoOn(false);
            this.f25560d.stopBluetoothSco();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$1(ArrayList arrayList, long j, int i) {
        return ((aah) arrayList.get(i)).getXfTransFreelyMessage().getMessageTime() == j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playFile(File file) {
        if (isAsring()) {
            return;
        }
        AudioPlayerManager.getInstance().playAudioFile(this.f25560d, file, this.earType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            zi9.m26850d("TransChatFreelyActivity", "setupMediaPlayer");
            this.f25559c.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25559c.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f25559c.prepare();
            zi9.m26850d("TransChatFreelyActivity", "setupMediaPlayer -------------");
            sendPauseKeyEvent(this.f25560d);
            this.f25559c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: e9h
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f32290a.lambda$setupMediaPlayer$2(mediaPlayer);
                }
            });
            this.f25559c.setOnCompletionListener(new C4101c());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 2, 2, new C4099a()).show();
    }

    private void showGptVoice() {
        ((C9747n9) this.binding).f63662d2.setText("");
        ((C9747n9) this.binding).f63664e2.setVisibility(0);
        ((C9747n9) this.binding).f63657b.scrollToPosition(this.f25557a.getItemCount() - 1);
        if (!isDestroyed() && !isFinishing()) {
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_blue)).diskCacheStrategy(ne4.f64120d).into(((C9747n9) this.binding).f63653Z);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_green)).diskCacheStrategy(ne4.f64120d).into(((C9747n9) this.binding).f63653Z);
            }
        }
        ((C9747n9) this.binding).f63646M.setVisibility(8);
        zi9.m26850d("TransChatFreelyActivity", "showGptVoice-------------------- ");
        startAsr(false);
    }

    private void showTextGPTResult(String text, String translateString, String mp3Filepath, String startTimeId, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        if (isFinalResult) {
            ich ichVar = new ich();
            ichVar.f46518b = 1;
            ichVar.f46517a = translateString;
            zgb.defaultCenter().publish(ichVar);
        }
        final long j = Long.parseLong(startTimeId);
        final ArrayList<aah> data = this.f25557a.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: c9h
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return TransChatFreelyActivity.lambda$showTextGPTResult$1(data, j, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent()) {
            int asInt = optionalIntFindFirst.getAsInt();
            z9h xfTransFreelyMessage = data.get(asInt).getXfTransFreelyMessage();
            xfTransFreelyMessage.setResult(text);
            xfTransFreelyMessage.setTransResult(translateString);
            this.f25557a.updateMessage(xfTransFreelyMessage, asInt);
            this.f25558b.updateTransResultByMessageTime(j, text, translateString);
            ((C9747n9) this.binding).f63657b.scrollToPosition(this.f25557a.getItemCount() - 1);
            return;
        }
        z9h z9hVar = new z9h();
        z9hVar.setMessageTime(j);
        z9hVar.setPause(false);
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            z9hVar.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            z9hVar.setIsGptOrXF(3);
        } else {
            z9hVar.setIsGptOrXF(1);
        }
        z9hVar.setType(this.type);
        z9hVar.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        z9hVar.setResult(text);
        z9hVar.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            z9hVar.setVoicePath(mp3Filepath);
        }
        this.f25557a.addData(z9hVar);
        ((C9747n9) this.binding).f63657b.scrollToPosition(this.f25557a.getItemCount() - 1);
        this.f25558b.insert(z9hVar);
    }

    private void stopRecognizerAndRecord() {
        AudioManager audioManager = this.f25560d;
        if (audioManager != null) {
            audioManager.setMode(0);
            this.f25560d.setSpeakerphoneOn(false);
        }
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewBottomMargin(boolean isEditMode) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((C9747n9) this.binding).f63657b.getLayoutParams();
        layoutParams.bottomMargin = isEditMode ? (int) TypedValue.applyDimension(1, 90.0f, getResources().getDisplayMetrics()) : 0;
        ((C9747n9) this.binding).f63657b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        hideVoiceView();
        stopAsr();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90927T;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90925S;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C9747n9) this.binding).f63663e.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        ((C9747n9) this.binding).f63666m.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C9747n9) this.binding).f63643F.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
        ((C9747n9) this.binding).f63661d.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25558b = ((TransFreelyDatabase) this.database).messageDao();
        initUI();
        startAsrSocket();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
        zi9.m26850d("TransChatFreelyActivity", "responseData =" + responseData.getPath());
        MediaPlayer mediaPlayer = this.f25559c;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        playFile(responseData);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onAsrResultContinuous(String result, String transContent, String mp3Filepath, String startTimeId, boolean isFinal) {
        super.onAsrResultContinuous(result, transContent, mp3Filepath, startTimeId, isFinal);
        showTextGPTResult(result, transContent, mp3Filepath, startTimeId, isFinal);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopRecognizerAndRecord();
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
        AudioManager audioManager = this.f25560d;
        if (audioManager != null) {
            audioManager.setMode(3);
            this.f25560d.setSpeakerphoneOn(true);
        }
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
        hideVoiceView();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onTtsFile(File file) {
        super.onTtsFile(file);
        playFile(file);
    }

    public void stopPlayback() {
        zi9.m26850d("TransChatFreelyActivity", "stopPlayback--------------------- =");
        MediaPlayer mediaPlayer = this.f25559c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25559c = null;
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public TransFreelyDatabase getDatabase() {
        return TransFreelyDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public C9747n9 getViewBinding() {
        return C9747n9.inflate(getLayoutInflater());
    }
}
