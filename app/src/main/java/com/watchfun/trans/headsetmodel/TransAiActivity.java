package com.watchfun.trans.headsetmodel;

import android.graphics.drawable.Drawable;
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
import com.watchfun.trans.database.transear.TransHeadSetMessageDatabase;
import com.watchfun.trans.headsetmodel.C4068a;
import com.watchfun.trans.headsetmodel.TransAiActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.base.BaseAsrActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver;
import com.watchfun.transcommon.utils.AiLangUtil;
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
import p000.C4671d9;
import p000.axg;
import p000.bah;
import p000.c5e;
import p000.cah;
import p000.eah;
import p000.g1i;
import p000.ich;
import p000.igg;
import p000.l3h;
import p000.lx2;
import p000.mc2;
import p000.ne4;
import p000.pj4;
import p000.ubb;
import p000.vfe;
import p000.xt5;
import p000.zgb;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class TransAiActivity extends BaseAsrActivity<C4671d9, TransHeadSetMessageDatabase> implements AudioPlayerManager.AudioPlayerListener, MediaNewButtonReceiver.IKeyDownListener, MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: L */
    public static final String f25392L = "TransAiActivity";

    /* JADX INFO: renamed from: F */
    public bah f25394F;

    /* JADX INFO: renamed from: H */
    public int f25395H;

    /* JADX INFO: renamed from: a */
    public C4068a f25396a;

    /* JADX INFO: renamed from: b */
    public cah f25397b;

    /* JADX INFO: renamed from: c */
    public MediaPlayer f25398c;

    /* JADX INFO: renamed from: e */
    public MediaNewButtonReceiver f25400e;

    /* JADX INFO: renamed from: f */
    public AudioManager f25401f;

    /* JADX INFO: renamed from: m */
    public long f25402m;

    /* JADX INFO: renamed from: d */
    public boolean f25399d = false;

    /* JADX INFO: renamed from: C */
    public boolean f25393C = false;

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$a */
    public class C4056a implements PhoneEarModelShowTipDialog.OnDialogClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25403a;

        public C4056a(final int val$projectType) {
            this.f25403a = val$projectType;
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            StringBuilder sb = new StringBuilder();
            sb.append("projectType =");
            sb.append(this.f25403a);
            if (this.f25403a == 2) {
                vfe.getInstance().putBoolean("SP_KEY_PHONE_GLASSES_MODEL_TIP", isChecked);
            } else {
                vfe.getInstance().putBoolean("SP_KEY_PHONE_EAR_MODEL_TIP", isChecked);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$b */
    public class C4057b implements AudioManager.OnAudioFocusChangeListener {
        public C4057b() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$c */
    public class C4058c implements MediaPlayer.OnCompletionListener {
        public C4058c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            TransAiActivity.this.f25398c.reset();
            TransAiActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$d */
    public class ViewOnClickListenerC4059d implements View.OnClickListener {
        public ViewOnClickListenerC4059d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransAiActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$e */
    public class ViewOnClickListenerC4060e implements View.OnClickListener {
        public ViewOnClickListenerC4060e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransAiActivity.this.isAsring()) {
                return;
            }
            TransAiActivity.this.exchangeLanguage();
            TextView textView = ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28790e;
            TransAiActivity transAiActivity = TransAiActivity.this;
            textView.setText(AiLangUtil.getValue(transAiActivity, ((BaseAsrActivity) transAiActivity).fromLanguageData.getKeyName()));
            TextView textView2 = ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28791f;
            TransAiActivity transAiActivity2 = TransAiActivity.this;
            textView2.setText(AiLangUtil.getValue(transAiActivity2, ((BaseAsrActivity) transAiActivity2).fromLanguageData.getKeyName()));
            TextView textView3 = ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28789d;
            TransAiActivity transAiActivity3 = TransAiActivity.this;
            textView3.setText(AiLangUtil.getValue(transAiActivity3, ((BaseAsrActivity) transAiActivity3).toLanguageData.getKeyName()));
            TextView textView4 = ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28792m;
            TransAiActivity transAiActivity4 = TransAiActivity.this;
            textView4.setText(AiLangUtil.getValue(transAiActivity4, ((BaseAsrActivity) transAiActivity4).toLanguageData.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$f */
    public class ViewOnClickListenerC4061f implements View.OnClickListener {
        public ViewOnClickListenerC4061f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransAiActivity.this.startSelectTransActivity(((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28790e.getText().toString(), ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28792m.getText().toString(), 1, TransActionEnumMode.PHONE_HEADSET_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$g */
    public class ViewOnClickListenerC4062g implements View.OnClickListener {
        public ViewOnClickListenerC4062g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransAiActivity.this.startSelectTransActivity(((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28792m.getText().toString(), ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28790e.getText().toString(), 2, TransActionEnumMode.PHONE_HEADSET_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$h */
    public class ViewOnClickListenerC4063h implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25411a;

        public ViewOnClickListenerC4063h(final int val$projectType) {
            this.f25411a = val$projectType;
        }

        @Override // android.view.View.OnClickListener
        @c5e(api = 26)
        public void onClick(View v) {
            if (TransAiActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(TransAiActivity.this)) {
                    l3h.showToastShort(TransAiActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                if (this.f25411a == 2) {
                    TransAiActivity transAiActivity = TransAiActivity.this;
                    ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28784Z1.setText(TransAiActivity.this.getString(C4201R.string.str_recorder_dialog_glasses_tip) + g1i.f38277c + AiLangUtil.getValue(transAiActivity, ((BaseAsrActivity) transAiActivity).toLanguageData.getKeyName()));
                } else {
                    TransAiActivity transAiActivity2 = TransAiActivity.this;
                    ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28784Z1.setText(TransAiActivity.this.getString(C4201R.string.str_recorder_dialog_ear_tip) + g1i.f38277c + AiLangUtil.getValue(transAiActivity2, ((BaseAsrActivity) transAiActivity2).toLanguageData.getKeyName()));
                }
                TransAiActivity.this.gptEarVoice();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$i */
    public class ViewOnClickListenerC4064i implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25413a;

        public ViewOnClickListenerC4064i(final int val$projectType) {
            this.f25413a = val$projectType;
        }

        @Override // android.view.View.OnClickListener
        @c5e(api = 26)
        public void onClick(View v) {
            if (TransAiActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(TransAiActivity.this)) {
                    l3h.showToastShort(TransAiActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                if (this.f25413a == 2) {
                    TransAiActivity transAiActivity = TransAiActivity.this;
                    ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28784Z1.setText(TransAiActivity.this.getString(C4201R.string.str_recorder_dialog_glasses_tip) + g1i.f38277c + AiLangUtil.getValue(transAiActivity, ((BaseAsrActivity) transAiActivity).fromLanguageData.getKeyName()));
                } else {
                    TransAiActivity transAiActivity2 = TransAiActivity.this;
                    ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28784Z1.setText(TransAiActivity.this.getString(C4201R.string.str_recorder_dialog_ear_tip) + g1i.f38277c + AiLangUtil.getValue(transAiActivity2, ((BaseAsrActivity) transAiActivity2).fromLanguageData.getKeyName()));
                }
                TransAiActivity.this.gptPhoneVoice();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$j */
    public class ViewOnClickListenerC4065j implements View.OnClickListener {
        public ViewOnClickListenerC4065j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TransAiActivity.this.f25402m <= 500) {
                return;
            }
            TransAiActivity.this.f25402m = System.currentTimeMillis();
            TransAiActivity.this.voiceViewGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$k */
    public class C4066k implements C4068a.g {

        /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$k$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f25417a;

            public a(final View val$v) {
                this.f25417a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25417a.setScaleX(1.0f);
                this.f25417a.setScaleY(1.0f);
            }
        }

        public C4066k() {
        }

        @Override // com.watchfun.trans.headsetmodel.C4068a.g
        public void click(boolean isSelect) {
            TransAiActivity.this.f25393C = isSelect;
            ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28788c.setViewSelected(TransAiActivity.this.f25393C);
        }

        @Override // com.watchfun.trans.headsetmodel.C4068a.g
        public void onItemChatPlayVoice(View v, int postion, bah xfAiMessage) {
            ((BaseAsrActivity) TransAiActivity.this).type = xfAiMessage.getType();
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
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
            TransAiActivity.this.f25396a.updateChangedItemBean(xfAiMessage, postion);
            TransAiActivity.this.f25397b.updateVoicePathById(xfAiMessage.getId(), str);
        }

        @Override // com.watchfun.trans.headsetmodel.C4068a.g
        public void onItemLongClick(View v, int postion, bah xfAiMessage, boolean isEditMode) {
            ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28788c.setEditMode(isEditMode);
            TransAiActivity.this.updateRecyclerViewBottomMargin(isEditMode);
            ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28772C.setVisibility(isEditMode ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.TransAiActivity$l */
    public class C4067l implements BottomEditView.OnEditClickListener {
        public C4067l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<bah> it = TransAiActivity.this.f25397b.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TransAiActivity.this.f25397b.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TransAiActivity.this.f25396a.setEditMode(false);
            ((C4671d9) ((BaseActivity) TransAiActivity.this).binding).f28772C.setVisibility(0);
            TransAiActivity.this.updateRecyclerViewBottomMargin(false);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: p8h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70030a.lambda$onDelete$0();
                    }
                });
            } else {
                for (bah bahVar : TransAiActivity.this.f25396a.getSelectData()) {
                    TransAiActivity.this.f25397b.deleteSelectData(bahVar.getMessageTime());
                    xt5.delete(bahVar.getVoicePath());
                }
            }
            TransAiActivity.this.f25396a.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TransAiActivity.this.f25396a.setAllSelectState(isAllSelect);
        }
    }

    private void audioStopMusic() {
        this.f25401f = (AudioManager) getSystemService("audio");
        this.f25401f.requestAudioFocus(new C4057b(), 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptEarVoice() {
        if (System.currentTimeMillis() - this.f25402m <= 500) {
            return;
        }
        this.f25402m = System.currentTimeMillis();
        this.type = this.earType;
        showGptVoice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptPhoneVoice() {
        if (System.currentTimeMillis() - this.f25402m <= 500) {
            return;
        }
        this.f25402m = System.currentTimeMillis();
        this.type = this.phoneType;
        showGptVoice();
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: l8h
            @Override // java.lang.Runnable
            public final void run() {
                this.f56855a.lambda$hideVoiceView$0();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25398c = mediaPlayer;
        mediaPlayer.reset();
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        int i = vfe.getInstance().getInt("SP_KEY_PROJECT_TYPE", -1);
        Drawable drawable = lx2.getDrawable(this, C4201R.drawable.ic_drop_down);
        if (i == 2) {
            ((C4671d9) this.binding).f28777M1.setText(C4201R.string.trans_ear_glasses_tip);
            Drawable drawable2 = lx2.getDrawable(this, C4201R.drawable.ic_tab_glasses);
            if (drawable2 != null) {
                drawable2.setBounds(10, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            }
            ((C4671d9) this.binding).f28792m.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
        } else {
            ((C4671d9) this.binding).f28777M1.setText(C4201R.string.trans_ear_tip);
            ((C4671d9) this.binding).f28792m.setCompoundDrawablesWithIntrinsicBounds(lx2.getDrawable(this, C4201R.drawable.ic_tab_ear), (Drawable) null, drawable, (Drawable) null);
        }
        boolean z = vfe.getInstance().getBoolean("SP_KEY_PHONE_EAR_MODEL_TIP", false);
        boolean z2 = vfe.getInstance().getBoolean("SP_KEY_PHONE_GLASSES_MODEL_TIP", false);
        StringBuilder sb = new StringBuilder();
        sb.append("projectType =");
        sb.append(i);
        if (i == 2) {
            if (!z2) {
                showModelDialog(i);
            }
        } else if (!z) {
            showModelDialog(i);
        }
        ((C4671d9) this.binding).f28787b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25396a = new C4068a(this, ((C4671d9) this.binding).f28787b, this.f25397b);
        List<bah> latestTen = this.f25397b.getLatestTen();
        if (mc2.isEmpty(latestTen)) {
            ((C4671d9) this.binding).f28774H.setVisibility(0);
            if (i == 2) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_glasses_dialog)).diskCacheStrategy(ne4.f64120d).into(((C4671d9) this.binding).f28776M);
                ((C4671d9) this.binding).f28780V1.setText(C4201R.string.ai_tarns_glasses_empty);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_ear_model)).diskCacheStrategy(ne4.f64120d).into(((C4671d9) this.binding).f28776M);
                ((C4671d9) this.binding).f28780V1.setText(C4201R.string.ai_tarns_empty);
            }
        } else {
            ((C4671d9) this.binding).f28774H.setVisibility(8);
            Collections.reverse(latestTen);
            this.f25396a.setData(latestTen);
            ((C4671d9) this.binding).f28787b.scrollToPosition(this.f25396a.getItemCount() - 1);
        }
        ((C4671d9) this.binding).f28787b.setAdapter(this.f25396a);
        ((C4671d9) this.binding).f28787b.setItemAnimator(null);
        ((C4671d9) this.binding).f28779Q.setOnClickListener(new ViewOnClickListenerC4059d());
        ((C4671d9) this.binding).f28786a2.setVisibility(8);
        ((C4671d9) this.binding).f28775L.setOnClickListener(new ViewOnClickListenerC4060e());
        ((C4671d9) this.binding).f28790e.setOnClickListener(new ViewOnClickListenerC4061f());
        AudioPlayerManager.getInstance().setAudioPlayerListener(this);
        ((C4671d9) this.binding).f28792m.setOnClickListener(new ViewOnClickListenerC4062g());
        ((C4671d9) this.binding).f28789d.setOnClickListener(new ViewOnClickListenerC4063h(i));
        ((C4671d9) this.binding).f28772C.setOnClickListener(new ViewOnClickListenerC4064i(i));
        ((C4671d9) this.binding).f28786a2.setOnClickListener(new ViewOnClickListenerC4065j());
        this.f25396a.setOnItemClickListener(new C4066k());
        ((C4671d9) this.binding).f28788c.setOnEditClickListener(new C4067l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$0() {
        this.f25402m = System.currentTimeMillis();
        if (((C4671d9) this.binding).f28786a2.getVisibility() == 0) {
            ((C4671d9) this.binding).f28786a2.setVisibility(8);
        }
        this.f25399d = false;
        ((C4671d9) this.binding).f28784Z1.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioPlaybackCompleted$2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$3(MediaPlayer mediaPlayer) {
        this.f25398c.start();
        zi9.m26850d("TransAiActivity", "setOnPreparedListener -------------" + this.type);
        if (this.f25400e == null) {
            this.f25400e = new MediaNewButtonReceiver(this, this);
        }
        int i = this.type;
        if (i == 1) {
            this.f25401f.setMode(0);
            this.f25401f.setSpeakerphoneOn(false);
            this.f25401f.setBluetoothScoOn(false);
            this.f25401f.stopBluetoothSco();
            return;
        }
        if (i == 2) {
            this.f25401f.setMode(3);
            this.f25401f.setSpeakerphoneOn(true);
            this.f25401f.setBluetoothScoOn(false);
            this.f25401f.stopBluetoothSco();
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
        AudioPlayerManager.getInstance().playAudioFile(this.f25401f, file, this.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            zi9.m26850d("TransAiActivity", "setupMediaPlayer");
            this.f25398c.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25398c.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f25398c.prepareAsync();
            zi9.m26850d("TransAiActivity", "setupMediaPlayer -------------");
            sendPauseKeyEvent(this.f25401f);
            this.f25398c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: h8h
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f42931a.lambda$setupMediaPlayer$3(mediaPlayer);
                }
            });
            this.f25398c.setOnCompletionListener(new C4058c());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showGptVoice() {
        this.f25399d = true;
        ((C4671d9) this.binding).f28784Z1.setText("");
        ((C4671d9) this.binding).f28786a2.setVisibility(0);
        ((C4671d9) this.binding).f28772C.setVisibility(0);
        ((C4671d9) this.binding).f28788c.setEditMode(false);
        this.f25396a.setEditMode(false);
        updateRecyclerViewBottomMargin(false);
        ((C4671d9) this.binding).f28787b.scrollToPosition(this.f25396a.getItemCount() - 1);
        if (!isDestroyed() && !isFinishing()) {
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_blue)).diskCacheStrategy(ne4.f64120d).into(((C4671d9) this.binding).f28778N);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_green)).diskCacheStrategy(ne4.f64120d).into(((C4671d9) this.binding).f28778N);
            }
        }
        ((C4671d9) this.binding).f28774H.setVisibility(8);
        this.f25401f.setMode(0);
        startAsr(false);
    }

    private void showModelDialog(int projectType) {
        new PhoneEarModelShowTipDialog(this, projectType, 1, new C4056a(projectType)).show();
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
        final ArrayList<eah> data = this.f25396a.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: n8h
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
            this.f25396a.updateMessage(xfAiMessage, asInt);
            this.f25397b.updateTransResultByMessageTime(j, text, translateString);
            ((C4671d9) this.binding).f28787b.scrollToPosition(this.f25396a.getItemCount() - 1);
            return;
        }
        bah bahVar = new bah();
        bahVar.setMessageTime(j);
        bahVar.setPause(false);
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            bahVar.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            bahVar.setIsGptOrXF(3);
        } else {
            bahVar.setIsGptOrXF(1);
        }
        bahVar.setType(this.type);
        bahVar.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        bahVar.setResult(text);
        bahVar.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            bahVar.setVoicePath(mp3Filepath);
        }
        this.f25396a.addData(bahVar);
        ((C4671d9) this.binding).f28787b.scrollToPosition(this.f25396a.getItemCount() - 1);
        this.f25397b.insert(bahVar);
    }

    private void stopMediaAndRecoveryKey() {
        AudioManager audioManager = this.f25401f;
        if (audioManager != null && audioManager.isSpeakerphoneOn()) {
            this.f25401f.setMode(0);
            this.f25401f.setSpeakerphoneOn(false);
        }
        MediaNewButtonReceiver mediaNewButtonReceiver = this.f25400e;
        if (mediaNewButtonReceiver != null) {
            mediaNewButtonReceiver.release();
            this.f25400e = null;
        }
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewBottomMargin(boolean isEditMode) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((C4671d9) this.binding).f28787b.getLayoutParams();
        layoutParams.bottomMargin = isEditMode ? (int) TypedValue.applyDimension(1, 90.0f, getResources().getDisplayMetrics()) : 0;
        ((C4671d9) this.binding).f28787b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        this.f25399d = false;
        hideVoiceView();
        stopAsr();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyFrom() {
        return vfe.C14037b.f90919P;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyTo() {
        return vfe.C14037b.f90917O;
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C4671d9) this.binding).f28790e.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        ((C4671d9) this.binding).f28791f.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C4671d9) this.binding).f28792m.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25397b = ((TransHeadSetMessageDatabase) this.database).messageDao();
        initUI();
        startAsrSocket();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
        zi9.m26850d("TransAiActivity", "type =" + this.type);
        playFile(responseData);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void onAsrResultContinuous(String result, String transContent, String mp3Filepath, String startTimeId, boolean isFinal) {
        super.onAsrResultContinuous(result, transContent, mp3Filepath, startTimeId, isFinal);
        showTextGPTResult(result, transContent, mp3Filepath, startTimeId, isFinal);
    }

    @Override // com.watchfun.transcommon.manager.trans.AudioPlayerManager.AudioPlayerListener
    public void onAudioPlaybackCompleted() {
        runOnUiThread(new Runnable() { // from class: j8h
            @Override // java.lang.Runnable
            public final void run() {
                TransAiActivity.lambda$onAudioPlaybackCompleted$2();
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopMediaAndRecoveryKey();
        vfe.getInstance().putBoolean("SP_KEY_SUPPORT_TRANS_STATUS", false);
    }

    @Override // com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver.IKeyDownListener
    public void onKeyDown(int keyAction) {
        zi9.m26850d("TransAiActivity", "keyAction...");
        if (keyAction == 87 || keyAction == 88 || keyAction == 126 || keyAction == 127) {
            zi9.m26850d("TransAiActivity", "下一首..." + this.f25399d);
            if (this.f25399d) {
                return;
            }
            ((C4671d9) this.binding).f28789d.performClick();
        }
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
        stopMediaAndRecoveryKey();
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
        zi9.m26850d("TransAiActivity", "stopPlayback--------------------- =");
        MediaPlayer mediaPlayer = this.f25398c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25398c = null;
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public TransHeadSetMessageDatabase getDatabase() {
        return TransHeadSetMessageDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public C4671d9 getViewBinding() {
        return C4671d9.inflate(getLayoutInflater());
    }
}
