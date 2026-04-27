package com.watchfun.trans.transfreely;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2478k;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.watchfun.base.BaseActivity;
import com.watchfun.trans.C4035R;
import com.watchfun.trans.database.transfreely.TransFreelyDatabase;
import com.watchfun.trans.transfreely.C4137a;
import com.watchfun.trans.transfreely.TransChatFreelyTouchActivity;
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
import p000.C10854p9;
import p000.aah;
import p000.axg;
import p000.igg;
import p000.l3h;
import p000.ne4;
import p000.pj4;
import p000.ryg;
import p000.t9h;
import p000.ubb;
import p000.vfe;
import p000.xt5;
import p000.z9h;
import p000.zi9;

/* JADX INFO: loaded from: classes6.dex */
public class TransChatFreelyTouchActivity extends BaseAsrActivity<C10854p9, TransFreelyDatabase> implements MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: F */
    public static final String f25578F = "TransChatFreelyTouchActivity";

    /* JADX INFO: renamed from: C */
    public int f25579C;

    /* JADX INFO: renamed from: a */
    public C4137a f25580a;

    /* JADX INFO: renamed from: b */
    public t9h f25581b;

    /* JADX INFO: renamed from: c */
    public MediaPlayer f25582c;

    /* JADX INFO: renamed from: d */
    public AudioManager f25583d;

    /* JADX INFO: renamed from: e */
    public long f25584e;

    /* JADX INFO: renamed from: f */
    public boolean f25585f = false;

    /* JADX INFO: renamed from: m */
    public z9h f25586m;

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$a */
    public class C4111a implements AudioManager.OnAudioFocusChangeListener {
        public C4111a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$b */
    public class C4112b implements MediaPlayer.OnCompletionListener {
        public C4112b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            TransChatFreelyTouchActivity.this.f25582c.reset();
            TransChatFreelyTouchActivity.this.setupMediaPlayer();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$c */
    public class ViewOnClickListenerC4113c implements View.OnClickListener {
        public ViewOnClickListenerC4113c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyTouchActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$d */
    public class ViewOnClickListenerC4114d implements View.OnClickListener {
        public ViewOnClickListenerC4114d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyTouchActivity transChatFreelyTouchActivity = TransChatFreelyTouchActivity.this;
            transChatFreelyTouchActivity.startSelectTransActivity(((C10854p9) ((BaseActivity) transChatFreelyTouchActivity).binding).f70054e.getText().toString(), ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70034F.getText().toString(), 1, TransActionEnumMode.TRANSLATOR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$e */
    public class ViewOnClickListenerC4115e implements View.OnClickListener {
        public ViewOnClickListenerC4115e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (TransChatFreelyTouchActivity.this.isAsring()) {
                return;
            }
            TransChatFreelyTouchActivity.this.exchangeLanguage();
            TextView textView = ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70054e;
            TransChatFreelyTouchActivity transChatFreelyTouchActivity = TransChatFreelyTouchActivity.this;
            textView.setText(AiLangUtil.getValue(transChatFreelyTouchActivity, ((BaseAsrActivity) transChatFreelyTouchActivity).fromLanguageData.getKeyName()));
            TextView textView2 = ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70056m;
            TransChatFreelyTouchActivity transChatFreelyTouchActivity2 = TransChatFreelyTouchActivity.this;
            textView2.setText(AiLangUtil.getValue(transChatFreelyTouchActivity2, ((BaseAsrActivity) transChatFreelyTouchActivity2).fromLanguageData.getKeyName()));
            TextView textView3 = ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70052d;
            TransChatFreelyTouchActivity transChatFreelyTouchActivity3 = TransChatFreelyTouchActivity.this;
            textView3.setText(AiLangUtil.getValue(transChatFreelyTouchActivity3, ((BaseAsrActivity) transChatFreelyTouchActivity3).toLanguageData.getKeyName()));
            TextView textView4 = ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70034F;
            TransChatFreelyTouchActivity transChatFreelyTouchActivity4 = TransChatFreelyTouchActivity.this;
            textView4.setText(AiLangUtil.getValue(transChatFreelyTouchActivity4, ((BaseAsrActivity) transChatFreelyTouchActivity4).toLanguageData.getKeyName()));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$f */
    public class ViewOnClickListenerC4116f implements View.OnClickListener {
        public ViewOnClickListenerC4116f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            TransChatFreelyTouchActivity transChatFreelyTouchActivity = TransChatFreelyTouchActivity.this;
            transChatFreelyTouchActivity.startSelectTransActivity(((C10854p9) ((BaseActivity) transChatFreelyTouchActivity).binding).f70034F.getText().toString(), ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70054e.getText().toString(), 2, TransActionEnumMode.TRANSLATOR_TYPE.getCode());
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$g */
    public class ViewOnTouchListenerC4117g implements View.OnTouchListener {
        public ViewOnTouchListenerC4117g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1 && action != 3) {
                    return false;
                }
                TransChatFreelyTouchActivity.this.voiceViewGone();
                return true;
            }
            if (!TransChatFreelyTouchActivity.this.checkAndRequestPermissions()) {
                return true;
            }
            if (ubb.isNetworkAvailable(TransChatFreelyTouchActivity.this)) {
                TransChatFreelyTouchActivity.this.gptRightVoice();
                return true;
            }
            l3h.showToastShort(TransChatFreelyTouchActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
            return true;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$h */
    public class ViewOnTouchListenerC4118h implements View.OnTouchListener {
        public ViewOnTouchListenerC4118h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1 && action != 3) {
                    return false;
                }
                TransChatFreelyTouchActivity.this.voiceViewGone();
                return true;
            }
            if (!TransChatFreelyTouchActivity.this.checkAndRequestPermissions()) {
                return true;
            }
            if (ubb.isNetworkAvailable(TransChatFreelyTouchActivity.this)) {
                TransChatFreelyTouchActivity.this.gptPhoneVoice();
                return true;
            }
            l3h.showToastShort(TransChatFreelyTouchActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$i */
    public class C4119i implements C4137a.g {

        /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$i$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f25596a;

            public a(final View val$v) {
                this.f25596a = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25596a.setScaleX(1.0f);
                this.f25596a.setScaleY(1.0f);
            }
        }

        public C4119i() {
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void click(boolean isSelect) {
            TransChatFreelyTouchActivity.this.f25585f = isSelect;
            ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70050c.setViewSelected(TransChatFreelyTouchActivity.this.f25585f);
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void onItemChatPlayVoice(View v, int postion, z9h xfAiMessage) {
            ((BaseAsrActivity) TransChatFreelyTouchActivity.this).type = xfAiMessage.getType();
            v.setScaleX(1.2f);
            v.setScaleY(1.2f);
            v.postDelayed(new a(v), 3500L);
            if (!TextUtils.isEmpty(xfAiMessage.getVoicePath())) {
                if (xt5.isFileExists(xfAiMessage.getVoicePath())) {
                    TransChatFreelyTouchActivity.this.playFile(xt5.getFileByPath(xfAiMessage.getVoicePath()));
                    return;
                } else {
                    TransChatFreelyTouchActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), xfAiMessage.getVoicePath());
                    return;
                }
            }
            String str = TranslateWebSocketManager.getInstance().getOutputPath() + pj4.f71071b + System.currentTimeMillis() + ".mp3";
            TransChatFreelyTouchActivity.this.startTTS(xfAiMessage.getTransResult(), xfAiMessage.getIsLangCode(), str);
            xfAiMessage.setVoicePath(str);
            TransChatFreelyTouchActivity.this.f25580a.updateChangedItemBean(xfAiMessage, postion);
            TransChatFreelyTouchActivity.this.f25581b.updateVoicePathById(xfAiMessage.getId(), str);
        }

        @Override // com.watchfun.trans.transfreely.C4137a.g
        public void onItemLongClick(View v, int postion, z9h xfAiMessage, boolean isEditMode) {
            ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70050c.setEditMode(isEditMode);
            TransChatFreelyTouchActivity.this.updateRecyclerViewBottomMargin(isEditMode);
            ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70035H.setVisibility(isEditMode ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$j */
    public class C4120j implements BottomEditView.OnEditClickListener {
        public C4120j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            Iterator<z9h> it = TransChatFreelyTouchActivity.this.f25581b.getAll().iterator();
            while (it.hasNext()) {
                xt5.delete(it.next().getVoicePath());
            }
            TransChatFreelyTouchActivity.this.f25581b.deleteAll();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TransChatFreelyTouchActivity.this.f25580a.setEditMode(false);
            TransChatFreelyTouchActivity.this.updateRecyclerViewBottomMargin(false);
            ((C10854p9) ((BaseActivity) TransChatFreelyTouchActivity.this).binding).f70035H.setVisibility(0);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: o9h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66949a.lambda$onDelete$0();
                    }
                });
            } else {
                for (z9h z9hVar : TransChatFreelyTouchActivity.this.f25580a.getSelectData()) {
                    TransChatFreelyTouchActivity.this.f25581b.deleteSelectData(z9hVar.getMessageTime());
                    xt5.delete(z9hVar.getVoicePath());
                }
            }
            TransChatFreelyTouchActivity.this.f25580a.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TransChatFreelyTouchActivity.this.f25580a.setAllSelectState(isAllSelect);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.TransChatFreelyTouchActivity$k */
    public class C4121k implements PhoneEarModelShowTipDialog.OnDialogClickListener {
        public C4121k() {
        }

        @Override // com.watchfun.transcommon.widget.PhoneEarModelShowTipDialog.OnDialogClickListener
        public void onCancel(boolean isChecked) {
            vfe.getInstance().putBoolean("SP_KEY_PHONE_MODEL_TIP", isChecked);
        }
    }

    private void audioStopMusic() {
        this.f25583d = (AudioManager) getSystemService("audio");
        this.f25583d.requestAudioFocus(new C4111a(), 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptPhoneVoice() {
        this.type = this.phoneType;
        showGptVoice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gptRightVoice() {
        this.type = this.earType;
        showGptVoice();
        zi9.m26850d("TransChatFreelyTouchActivity", "data.getIatLanguage() =" + this.toLanguageData.getIatLanguage());
    }

    private void hideVoiceView() {
        runOnUiThread(new Runnable() { // from class: n9h
            @Override // java.lang.Runnable
            public final void run() {
                this.f63763a.lambda$hideVoiceView$1();
            }
        });
    }

    private void initMedia() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25582c = mediaPlayer;
        mediaPlayer.reset();
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        ((C10854p9) this.binding).f70048b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f25580a = new C4137a(this, ((C10854p9) this.binding).f70048b, this.f25581b);
        List<z9h> latestTen = this.f25581b.getLatestTen();
        if (AppUtils.isEmpty(latestTen)) {
            ((C10854p9) this.binding).f70037M.setVisibility(0);
        } else {
            ((C10854p9) this.binding).f70037M.setVisibility(8);
            Collections.reverse(latestTen);
            this.f25580a.setData(latestTen);
            ((C10854p9) this.binding).f70048b.scrollToPosition(this.f25580a.getItemCount() - 1);
        }
        ((C10854p9) this.binding).f70048b.setAdapter(this.f25580a);
        ((C10854p9) this.binding).f70048b.setItemAnimator(null);
        ((C10854p9) this.binding).f70038M1.setOnClickListener(new ViewOnClickListenerC4113c());
        ((C10854p9) this.binding).f70054e.setOnClickListener(new ViewOnClickListenerC4114d());
        ((C10854p9) this.binding).f70042X.setOnClickListener(new ViewOnClickListenerC4115e());
        ((C10854p9) this.binding).f70034F.setOnClickListener(new ViewOnClickListenerC4116f());
        ((C10854p9) this.binding).f70033C.setOnTouchListener(new ViewOnTouchListenerC4117g());
        ((C10854p9) this.binding).f70055f.setOnTouchListener(new ViewOnTouchListenerC4118h());
        this.f25580a.setItemClickListener(new C4119i());
        ((C10854p9) this.binding).f70050c.setOnEditClickListener(new C4120j());
        ryg.getUiThreadHandler().postDelayed(new Runnable() { // from class: k9h
            @Override // java.lang.Runnable
            public final void run() {
                this.f53400a.lambda$initUI$0();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideVoiceView$1() {
        this.f25584e = System.currentTimeMillis();
        if (((C10854p9) this.binding).f70053d2.getVisibility() == 0) {
            ((C10854p9) this.binding).f70053d2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$0() {
        ((C10854p9) this.binding).f70055f.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupMediaPlayer$3(MediaPlayer mediaPlayer) {
        this.f25582c.start();
        zi9.m26850d("TransChatFreelyTouchActivity", "setupMediaPlayer -------222------");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showTextGPTResult$2(ArrayList arrayList, long j, int i) {
        return ((aah) arrayList.get(i)).getXfTransFreelyMessage().getMessageTime() == j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playFile(File file) {
        zi9.m26850d("TransChatFreelyTouchActivity", "playFile-----------------isAsring--- " + isAsring());
        if (isAsring()) {
            return;
        }
        AudioPlayerManager.getInstance().playAudioFile(this.f25583d, file, this.phoneType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMediaPlayer() {
        try {
            zi9.m26850d("TransChatFreelyTouchActivity", "setupMediaPlayer");
            this.f25582c.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f25582c.setDataSource(getApplicationContext(), Uri.parse("android.resource://" + getPackageName() + pj4.f71071b + C4201R.raw.aaa));
            this.f25582c.prepare();
            zi9.m26850d("TransChatFreelyTouchActivity", "setupMediaPlayer -------------");
            sendPauseKeyEvent(this.f25583d);
            this.f25582c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: m9h
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f60300a.lambda$setupMediaPlayer$3(mediaPlayer);
                }
            });
            this.f25582c.setOnCompletionListener(new C4112b());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDialog() {
        new PhoneEarModelShowTipDialog(this, 2, 2, new C4121k()).show();
    }

    private void showGptVoice() {
        ((C10854p9) this.binding).f70053d2.setVisibility(0);
        ((C10854p9) this.binding).f70048b.scrollToPosition(this.f25580a.getItemCount() - 1);
        if (!isDestroyed() && !isFinishing()) {
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.ic_volume_white)).diskCacheStrategy(ne4.f64120d).into(((C10854p9) this.binding).f70044Z);
            } else {
                ComponentCallbacks2C2485a.with((FragmentActivity) this).asGif().load(Integer.valueOf(C4035R.drawable.ic_volume_white)).diskCacheStrategy(ne4.f64120d).into(((C10854p9) this.binding).f70044Z);
            }
        }
        ((C10854p9) this.binding).f70037M.setVisibility(8);
        zi9.m26850d("TransChatFreelyTouchActivity", "showGptVoice-------------------- ");
        AudioPlayerManager.getInstance().stopAudio();
        if (this.type == this.phoneType) {
            TranslateWebSocketManager.getInstance().startNormalAsrVad(this.fromLanguageData.getIatLanguage(), this.toLanguageData.getIatLanguage(), 86400000L, false, "");
        } else {
            TranslateWebSocketManager.getInstance().startNormalAsrVad(this.toLanguageData.getIatLanguage(), this.fromLanguageData.getIatLanguage(), 86400000L, false, "");
        }
    }

    private void showTextGPTResult(String text, String translateString, String mp3Filepath, String startTimeId, boolean isFinalResult) {
        if (TextUtils.isEmpty(text) || text.equals("null")) {
            return;
        }
        final long j = Long.parseLong(startTimeId);
        final ArrayList<aah> data = this.f25580a.getData();
        OptionalInt optionalIntFindFirst = IntStream.range(0, data.size()).filter(new IntPredicate() { // from class: l9h
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return TransChatFreelyTouchActivity.lambda$showTextGPTResult$2(data, j, i);
            }
        }).findFirst();
        if (optionalIntFindFirst.isPresent()) {
            int asInt = optionalIntFindFirst.getAsInt();
            z9h xfTransFreelyMessage = data.get(asInt).getXfTransFreelyMessage();
            xfTransFreelyMessage.setResult(text);
            xfTransFreelyMessage.setTransResult(translateString);
            this.f25580a.updateMessage(xfTransFreelyMessage, asInt);
            this.f25581b.updateTransResultByMessageTime(j, text, translateString);
            ((C10854p9) this.binding).f70048b.scrollToPosition(this.f25580a.getItemCount() - 1);
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
        this.f25580a.addData(z9hVar);
        ((C10854p9) this.binding).f70048b.scrollToPosition(this.f25580a.getItemCount() - 1);
        this.f25581b.insert(z9hVar);
    }

    private void stopRecognizerAndRecord() {
        stopPlayback();
        AudioPlayerManager.getInstance().stopAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewBottomMargin(boolean isEditMode) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((C10854p9) this.binding).f70048b.getLayoutParams();
        layoutParams.bottomMargin = isEditMode ? (int) TypedValue.applyDimension(1, 90.0f, getResources().getDisplayMetrics()) : 0;
        ((C10854p9) this.binding).f70048b.setLayoutParams(layoutParams);
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
        ((C10854p9) this.binding).f70054e.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
        ((C10854p9) this.binding).f70056m.setText(AiLangUtil.getValue(this, fromLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public void initToLanguageView(TransLanguageData toLanguageData) {
        super.initToLanguageView(toLanguageData);
        ((C10854p9) this.binding).f70034F.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
        ((C10854p9) this.binding).f70052d.setText(AiLangUtil.getValue(this, toLanguageData.getKeyName()));
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initMedia();
        audioStopMusic();
        setupMediaPlayer();
        this.f25581b = ((TransFreelyDatabase) this.database).messageDao();
        initUI();
        startAsrSocket();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File responseData) {
        zi9.m26850d("TransChatFreelyTouchActivity", "responseData =" + responseData.getPath());
        MediaPlayer mediaPlayer = this.f25582c;
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
        zi9.m26850d("TransChatFreelyTouchActivity", "stopPlayback--------------------- =");
        MediaPlayer mediaPlayer = this.f25582c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f25582c = null;
        }
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity
    public TransFreelyDatabase getDatabase() {
        return TransFreelyDatabase.getDatabase(this);
    }

    @Override // com.watchfun.transcommon.base.BaseAsrActivity, com.watchfun.base.BaseActivity
    public C10854p9 getViewBinding() {
        return C10854p9.inflate(getLayoutInflater());
    }
}
