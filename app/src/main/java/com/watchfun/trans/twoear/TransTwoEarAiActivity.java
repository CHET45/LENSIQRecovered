package com.watchfun.trans.twoear;

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
import com.watchfun.trans.database.twoear.TransTwoEarDatabase;
import com.watchfun.trans.twoear.C4200a;
import com.watchfun.trans.twoear.TransTwoEarAiActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.base.BaseAsrActivity;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.enunmode.TransActionEnumMode;
import com.watchfun.transcommon.gpt.GPTContract;
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
import p000.C10317od;
import p000.axg;
import p000.g1i;
import p000.ich;
import p000.igg;
import p000.l3h;
import p000.mc2;
import p000.nch;
import p000.ne4;
import p000.pch;
import p000.pj4;
import p000.qch;
import p000.ubb;
import p000.vfe;
import p000.xt5;
import p000.zgb;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class TransTwoEarAiActivity extends BaseAsrActivity<C10317od, TransTwoEarDatabase> implements GPTContract.AiGPTTextToAudioView, MediaNewButtonReceiver.IKeyDownListener, MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: L */
    public static final String f25862L = "TransTwoEarAiActivity";

    /* JADX INFO: renamed from: F */
    public pch f25864F;

    /* JADX INFO: renamed from: H */
    public int f25865H;

    /* JADX INFO: renamed from: a */
    public C4200a f25866a;

    /* JADX INFO: renamed from: b */
    public nch f25867b;

    /* JADX INFO: renamed from: c */
    public MediaPlayer f25868c;

    /* JADX INFO: renamed from: e */
    public MediaNewButtonReceiver f25870e;

    /* JADX INFO: renamed from: f */
    public AudioManager f25871f;

    /* JADX INFO: renamed from: m */
    public long f25872m;

    /* JADX INFO: renamed from: d */
    public boolean f25869d = false;

    /* JADX INFO: renamed from: C */
    public boolean f25863C = false;

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$a */
    public class C4188a implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C4188a() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_TWO_EAR_TIP", isChecked);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$b */
    public class C4189b implements AudioManager.OnAudioFocusChangeListener {
        public C4189b() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$c */
    public class C4190c implements MediaPlayer.OnCompletionListener {
        public C4190c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            TransTwoEarAiActivity.this.f25868c.reset();
            TransTwoEarAiActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$d */
    public class ViewOnClickListenerC4191d implements View.OnClickListener {
        public ViewOnClickListenerC4191d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransTwoEarAiActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$e */
    public class ViewOnClickListenerC4192e implements View.OnClickListener {
        public ViewOnClickListenerC4192e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransTwoEarAiActivity.this.isAsring()) {
                return;
            }
            TransTwoEarAiActivity.this.exchangeLanguage();
            TextView textView = ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67285d;
            TransTwoEarAiActivity transTwoEarAiActivity = TransTwoEarAiActivity.this;
            textView.setText(AiLangUtil.getValue(transTwoEarAiActivity, ((BaseAsrActivity) transTwoEarAiActivity).fromLanguageData.getKeyName()));
            TextView textView2 = ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67286e;
            TransTwoEarAiActivity transTwoEarAiActivity2 = TransTwoEarAiActivity.this;
            textView2.setText(AiLangUtil.getValue(transTwoEarAiActivity2, ((BaseAsrActivity) transTwoEarAiActivity2).fromLanguageData.getKeyName()));
            TextView textView3 = ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67287f;
            TransTwoEarAiActivity transTwoEarAiActivity3 = TransTwoEarAiActivity.this;
            textView3.setText(AiLangUtil.getValue(transTwoEarAiActivity3, ((BaseAsrActivity) transTwoEarAiActivity3).toLanguageData.getKeyName()));
            TextView textView4 = ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67288m;
            TransTwoEarAiActivity transTwoEarAiActivity4 = TransTwoEarAiActivity.this;
            textView4.setText(AiLangUtil.getValue(transTwoEarAiActivity4, ((BaseAsrActivity) transTwoEarAiActivity4).toLanguageData.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$f */
    public class ViewOnClickListenerC4193f implements View.OnClickListener {
        public ViewOnClickListenerC4193f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransTwoEarAiActivity.this.startSelectTransActivity(((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67285d.getText().toString(), ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67288m.getText().toString(), 1, TransActionEnumMode.DUAL_EAR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$g */
    public class ViewOnClickListenerC4194g implements View.OnClickListener {
        public ViewOnClickListenerC4194g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransTwoEarAiActivity.this.startSelectTransActivity(((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67288m.getText().toString(), ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67285d.getText().toString(), 2, TransActionEnumMode.DUAL_EAR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$h */
    public class ViewOnClickListenerC4195h implements View.OnClickListener {
        public ViewOnClickListenerC4195h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransTwoEarAiActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(TransTwoEarAiActivity.this)) {
                    l3h.showToastShort(TransTwoEarAiActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                TransTwoEarAiActivity transTwoEarAiActivity = TransTwoEarAiActivity.this;
                ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67277V1.setText(TransTwoEarAiActivity.this.getString(C4201R.string.text_right_ear_tip) + g1i.f38277c + AiLangUtil.getValue(transTwoEarAiActivity, ((BaseAsrActivity) transTwoEarAiActivity).toLanguageData.getKeyName()));
                TransTwoEarAiActivity.this.gptRightVoice();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$i */
    public class ViewOnClickListenerC4196i implements View.OnClickListener {
        public ViewOnClickListenerC4196i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransTwoEarAiActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(TransTwoEarAiActivity.this)) {
                    l3h.showToastShort(TransTwoEarAiActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
                    return;
                }
                TransTwoEarAiActivity transTwoEarAiActivity = TransTwoEarAiActivity.this;
                ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67277V1.setText(TransTwoEarAiActivity.this.getString(C4201R.string.text_left_ear_tip) + g1i.f38277c + AiLangUtil.getValue(transTwoEarAiActivity, ((BaseAsrActivity) transTwoEarAiActivity).fromLanguageData.getKeyName()));
                TransTwoEarAiActivity.this.gptLeftVoice();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$j */
    public class ViewOnClickListenerC4197j implements View.OnClickListener {
        public ViewOnClickListenerC4197j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (System.currentTimeMillis() - TransTwoEarAiActivity.this.f25872m <= 500) {
                return;
            }
            TransTwoEarAiActivity.this.f25872m = System.currentTimeMillis();
            TransTwoEarAiActivity.this.voiceViewGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$k */
    public class C4198k implements C4200a.g {

        /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$k$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f25884a;

            public a(final View val$v) {
                this.f25884a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25884a.setScaleX(1.0f);
                this.f25884a.setScaleY(1.0f);
            }
        }

        public C4198k() {
        }

        @Override // com.watchfun.trans.twoear.C4200a.g
        public void click(boolean isSelect) {
            TransTwoEarAiActivity.this.f25863C = isSelect;
            ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67284c.setViewSelected(TransTwoEarAiActivity.this.f25863C);
        }

        @Override // com.watchfun.trans.twoear.C4200a.g
        public void onItemChatPlayVoice(View v, int postion, pch xfAiMessage) {
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
            ((BaseAsrActivity) TransTwoEarAiActivity.this).type = xfAiMessage.getType();
            zi9.m26850d(TransTwoEarAiActivity.f25862L, "type =" + ((BaseAsrActivity) TransTwoEarAiActivity.this).type);
            if (!TextUtils.isEmpty(xfAiMessage.getVoicePath())) {
                if (xt5.isFileExists(xfAiMessage.getVoicePath())) {
                    TransTwoEarAiActivity.this.playFile(xt5.getFileByPath(xfAiMessage.getVoicePath()));
                    return;
                } else {
                    TransTwoEarAiActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), xfAiMessage.getVoicePath());
                    return;
                }
            }
            String str = TranslateWebSocketManager.getInstance().getOutputPath() + pj4.f71071b + System.currentTimeMillis() + ".mp3";
            TransTwoEarAiActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), str);
            xfAiMessage.setVoicePath(str);
            TransTwoEarAiActivity.this.f25866a.updateChangedItemBean(xfAiMessage, postion);
            TransTwoEarAiActivity.this.f25867b.updateVoicePathById(xfAiMessage.getId(), str);
        }

        @Override // com.watchfun.trans.twoear.C4200a.g
        public void onItemLongClick(View v, int postion, pch xfAiMessage, boolean isEditMode) {
            ((C10317od) ((BaseActivity) TransTwoEarAiActivity.this).binding).f67284c.setEditMode(isEditMode);
            TransTwoEarAiActivity.this.updateRecyclerViewBottomMargin(isEditMode);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.TransTwoEarAiActivity$l */
    public class C4199l implements BottomEditView.OnEditClickListener {
        public C4199l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<pch> it = TransTwoEarAiActivity.this.f25867b.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TransTwoEarAiActivity.this.f25867b.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TransTwoEarAiActivity.this.f25866a.setEditMode(false);
            TransTwoEarAiActivity.this.updateRecyclerViewBottomMargin(false);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: mch
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60582a.lambda$onDelete$0();
                    }
                });
            } else {
                for (pch pchVar : TransTwoEarAiActivity.this.f25866a.getSelectData()) {
                    TransTwoEarAiActivity.this.f25867b.deleteSelectData(pchVar.getMessageTime());
                    xt5.delete(pchVar.getVoicePath());
                }
            }
            TransTwoEarAiActivity.this.f25866a.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TransTwoEarAiActivity.this.f25866a.setAllSelectState(isAllSelect);
        }
    }

    private void audioStopMusic() {
        this.f25871f = (AudioManager) getSystemService("audio");
        this.f25871f.requestAudioFocus(new C4189b(), 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptLeftVoice() {
        if (System.currentTimeMillis() - this.f25872m <= 500) {
            return;
        }
        this.f25872m = System.currentTimeMillis();
        this.f25869d = true;
        this.type = this.phoneType;
        showGptVoice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptRightVoice() {
        if (System.currentTimeMillis() - this.f25872m <= 500) {
            return;
        }
        this.f25872m = System.currentTimeMillis();
        this.f25869d = true;
        this.type = this.earType;
        showGptVoice();
        zi9.m26850d(f25862L, "data.getIatLanguage() =" + this.toLanguageData.getIatLanguage());
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: kch
            @Override // java.lang.Runnable
            public final void run() {
                this.f53620a.lambda$hideVoiceView$0();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25868c = mediaPlayer;
        mediaPlayer.reset();
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        if (!vfe.getInstance().getBoolean("SP_KEY_TWO_EAR_TIP", false)) {
            showDialog();
        }
        ((C10317od) this.binding).f67283b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25866a = new C4200a(this, ((C10317od) this.binding).f67283b, this.f25867b);
        List<pch> latestTen = this.f25867b.getLatestTen();
        if (mc2.isEmpty(latestTen)) {
            ((C10317od) this.binding).f67271H.setVisibility(0);
            ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_trans_two_ear_model)).diskCacheStrategy(ne4.f64120d).into(((C10317od) this.binding).f67273M);
        } else {
            ((C10317od) this.binding).f67271H.setVisibility(8);
            Collections.reverse(latestTen);
            this.f25866a.setData(latestTen);
            ((C10317od) this.binding).f67283b.scrollToPosition(this.f25866a.getItemCount() - 1);
        }
        ((C10317od) this.binding).f67283b.setAdapter(this.f25866a);
        ((C10317od) this.binding).f67283b.setItemAnimator(null);
        ((C10317od) this.binding).f67276Q.setOnClickListener(new ViewOnClickListenerC4191d());
        ((C10317od) this.binding).f67272L.setOnClickListener(new ViewOnClickListenerC4192e());
        ((C10317od) this.binding).f67285d.setOnClickListener(new ViewOnClickListenerC4193f());
        ((C10317od) this.binding).f67288m.setOnClickListener(new ViewOnClickListenerC4194g());
        ((C10317od) this.binding).f67287f.setOnClickListener(new ViewOnClickListenerC4195h());
        ((C10317od) this.binding).f67286e.setOnClickListener(new ViewOnClickListenerC4196i());
        ((C10317od) this.binding).f67281Z1.setOnClickListener(new ViewOnClickListenerC4197j());
        this.f25866a.setOnItemClickListener(new C4198k());
        ((C10317od) this.binding).f67284c.setOnEditClickListener(new C4199l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$0() {
        this.f25869d = false;
        this.f25872m = System.currentTimeMillis();
        if (((C10317od) this.binding).f67281Z1.getVisibility() == 0) {
            ((C10317od) this.binding).f67281Z1.setVisibility(8);
        }
        ((C10317od) this.binding).f67277V1.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$2(MediaPlayer mediaPlayer) {
        this.f25868c.start();
        zi9.m26850d(f25862L, "mediaNewButtonReceiver -------------" + this.f25870e);
        if (this.f25870e == null) {
            this.f25870e = new MediaNewButtonReceiver(this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$1(ArrayList arrayList, long j, int i) {
        return ((qch) arrayList.get(i)).getXfTransTwoEarMessage().getMessageTime() == j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playFile(File file) {
        if (isAsring()) {
            return;
        }
        AudioPlayerManager.getInstance().playAudioFile(this.f25871f, file, this.phoneType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            zi9.m26850d(f25862L, "setupMediaPlayer");
            this.f25868c.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25868c.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f25868c.prepareAsync();
            zi9.m26850d(f25862L, "setupMediaPlayer -------------");
            sendPauseKeyEvent(this.f25871f);
            this.f25868c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: jch
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f50330a.lambda$setupMediaPlayer$2(mediaPlayer);
                }
            });
            this.f25868c.setOnCompletionListener(new C4190c());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 0, -1, new C4188a()).show();
    }

    private void showGptVoice() {
        this.f25869d = true;
        ((C10317od) this.binding).f67281Z1.setVisibility(0);
        ((C10317od) this.binding).f67284c.setEditMode(false);
        this.f25866a.setEditMode(false);
        updateRecyclerViewBottomMargin(false);
        ((C10317od) this.binding).f67283b.scrollToPosition(this.f25866a.getItemCount() - 1);
        if (!isDestroyed() && !isFinishing()) {
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_blue)).diskCacheStrategy(ne4.f64120d).into(((C10317od) this.binding).f67275N);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_green)).diskCacheStrategy(ne4.f64120d).into(((C10317od) this.binding).f67275N);
            }
        }
        ((C10317od) this.binding).f67271H.setVisibility(8);
        startAsr(false);
    }

    private void showTextGPTResult(String text, String translateString, String mp3Filepath, String startTimeId, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        final long j = Long.parseLong(startTimeId);
        if (isFinalResult) {
            ich ichVar = new ich();
            ichVar.f46518b = 1;
            ichVar.f46517a = translateString;
            zgb.defaultCenter().publish(ichVar);
        }
        final ArrayList<qch> data = this.f25866a.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: lch
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return TransTwoEarAiActivity.lambda$showTextGPTResult$1(data, j, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent()) {
            int asInt = optionalIntFindFirst.getAsInt();
            pch xfTransTwoEarMessage = data.get(asInt).getXfTransTwoEarMessage();
            xfTransTwoEarMessage.setResult(text);
            xfTransTwoEarMessage.setTransResult(translateString);
            this.f25866a.updateMessage(xfTransTwoEarMessage, asInt);
            this.f25867b.updateTransResultByMessageTime(j, text, translateString);
            ((C10317od) this.binding).f67283b.scrollToPosition(this.f25866a.getItemCount() - 1);
            return;
        }
        pch pchVar = new pch();
        pchVar.setMessageTime(j);
        pchVar.setPause(false);
        if (this.type == this.phoneType && this.toLanguageData.isUseMicTTS()) {
            pchVar.setIsGptOrXF(3);
        } else if (this.type == this.earType && this.fromLanguageData.isUseMicTTS()) {
            pchVar.setIsGptOrXF(3);
        } else {
            pchVar.setIsGptOrXF(1);
        }
        pchVar.setType(this.type);
        pchVar.setIsLangCode((this.type == this.phoneType ? this.toLanguageData : this.fromLanguageData).getIatLanguage());
        pchVar.setResult(text);
        pchVar.setTransResult(translateString);
        if (!TextUtils.isEmpty(mp3Filepath)) {
            pchVar.setVoicePath(mp3Filepath);
        }
        this.f25866a.addData(pchVar);
        ((C10317od) this.binding).f67283b.scrollToPosition(this.f25866a.getItemCount() - 1);
        this.f25867b.insert(pchVar);
    }

    private void stopRecognizerAndRecoveryKey() {
        MediaNewButtonReceiver mediaNewButtonReceiver = this.f25870e;
        if (mediaNewButtonReceiver != null) {
            mediaNewButtonReceiver.release();
            this.f25870e = null;
        }
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewBottomMargin(boolean isEditMode) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((C10317od) this.binding).f67283b.getLayoutParams();
        layoutParams.bottomMargin = isEditMode ? (int) TypedValue.applyDimension(1, 90.0f, getResources().getDisplayMetrics()) : 0;
        ((C10317od) this.binding).f67283b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGone() {
        this.f25869d = false;
        hideVoiceView();
        stopAsr();
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyFrom() {
        return "woke_language_from_two_ear_news";
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public String getSpKeyTo() {
        return "woke_language_to_two_ear_news";
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initFromLanguageView(TransLanguageData fromLanguageData) {
        super.initFromLanguageView(fromLanguageData);
        ((C10317od) this.binding).f67285d.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        ((C10317od) this.binding).f67286e.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C10317od) this.binding).f67287f.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
        ((C10317od) this.binding).f67288m.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25867b = ((TransTwoEarDatabase) this.database).messageDao();
        initUI();
        startAsrSocket();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
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
        stopRecognizerAndRecoveryKey();
        vfe.getInstance().putBoolean("SP_KEY_SUPPORT_TRANS_STATUS", false);
    }

    @Override // com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver.IKeyDownListener
    public void onKeyDown(int keyAction) {
        if (keyAction == 87) {
            StringBuilder sb = new StringBuilder();
            sb.append("下一首...");
            sb.append(this.f25869d);
            if (this.f25869d) {
                return;
            }
            ((C10317od) this.binding).f67287f.performClick();
            return;
        }
        if (keyAction != 88) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("上一首...");
        sb2.append(this.f25869d);
        if (this.f25869d) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("上一首...3333333");
        sb3.append(this.f25869d);
        ((C10317od) this.binding).f67286e.performClick();
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

    public void stopPlayback() {
        MediaPlayer mediaPlayer = this.f25868c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25868c = null;
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public TransTwoEarDatabase getDatabase() {
        return TransTwoEarDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public C10317od getViewBinding() {
        return C10317od.inflate(getLayoutInflater());
    }
}
