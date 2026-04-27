package com.watchfun.aichat;

import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.watchfun.aichat.C3994a;
import com.watchfun.aichat.database.GPTMessageDatabase;
import com.watchfun.base.BaseActivity;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.bean.p012ai.AiModelBean;
import com.watchfun.transcommon.bean.p012ai.ChatMessageDTO;
import com.watchfun.transcommon.dialog.CustomLoadingDialog;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.gpt.GPTContract;
import com.watchfun.transcommon.gpt.presenter.GptAiAudioFilePresenter;
import com.watchfun.transcommon.gpt.presenter.GptCompletionsPresenter;
import com.watchfun.transcommon.manager.AudioRecorder;
import com.watchfun.transcommon.manager.TalkNetManager;
import com.watchfun.transcommon.manager.p013ai.MediaPlayerManager;
import com.watchfun.transcommon.manager.trans.AsrWebSocketManager;
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.AiLangUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C11945r9;
import p000.C2133c;
import p000.C2337ck;
import p000.C4826dk;
import p000.C6875hk;
import p000.C7323ik;
import p000.b27;
import p000.d27;
import p000.e10;
import p000.efb;
import p000.igg;
import p000.l3h;
import p000.lx2;
import p000.mc2;
import p000.ne4;
import p000.q87;
import p000.qc7;
import p000.t77;
import p000.ubb;
import p000.ufh;
import p000.vfe;
import p000.xja;
import p000.xnc;
import p000.yi9;

/* JADX INFO: loaded from: classes6.dex */
public class ChatGptAiActivity extends BaseActivity<C11945r9> implements GPTContract.AiDialogueView, AudioManager.OnAudioFocusChangeListener, GPTContract.AiGPTAudioView, GPTContract.AiGPTTextToAudioView, AudioPlayerManager.AudioPlayerListener {

    /* JADX INFO: renamed from: n2 */
    public static final String f24930n2 = "ChatGptAiActivity";

    /* JADX INFO: renamed from: o2 */
    public static View f24931o2;

    /* JADX INFO: renamed from: F */
    public boolean f24933F;

    /* JADX INFO: renamed from: H */
    public GptAiAudioFilePresenter f24934H;

    /* JADX INFO: renamed from: L */
    public TalkNetManager f24935L;

    /* JADX INFO: renamed from: M1 */
    public SpeechRecognizer f24937M1;

    /* JADX INFO: renamed from: Q */
    public String f24939Q;

    /* JADX INFO: renamed from: Y */
    public b27 f24942Y;

    /* JADX INFO: renamed from: Z */
    public AudioManager f24943Z;

    /* JADX INFO: renamed from: Z1 */
    public PermissionExplanationDialog f24944Z1;

    /* JADX INFO: renamed from: a */
    public q87 f24945a;

    /* JADX INFO: renamed from: a2 */
    public TransLanguageData f24946a2;

    /* JADX INFO: renamed from: b2 */
    public AsrWebSocketManager f24948b2;

    /* JADX INFO: renamed from: c */
    public GptCompletionsPresenter f24949c;

    /* JADX INFO: renamed from: d */
    public int f24951d;

    /* JADX INFO: renamed from: e */
    public GPTMessageDatabase f24953e;

    /* JADX INFO: renamed from: e2 */
    public Handler f24954e2;

    /* JADX INFO: renamed from: f */
    public d27 f24955f;

    /* JADX INFO: renamed from: f2 */
    public b27 f24956f2;

    /* JADX INFO: renamed from: g2 */
    public String f24957g2;

    /* JADX INFO: renamed from: h2 */
    public String f24958h2;

    /* JADX INFO: renamed from: k2 */
    public CustomLoadingDialog f24961k2;

    /* JADX INFO: renamed from: b */
    public String[] f24947b = {xnc.f98582G, "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.WAKE_LOCK"};

    /* JADX INFO: renamed from: m */
    public boolean f24963m = true;

    /* JADX INFO: renamed from: C */
    public boolean f24932C = false;

    /* JADX INFO: renamed from: M */
    public boolean f24936M = false;

    /* JADX INFO: renamed from: N */
    public boolean f24938N = false;

    /* JADX INFO: renamed from: X */
    public int f24941X = -1;

    /* JADX INFO: renamed from: V1 */
    public boolean f24940V1 = true;

    /* JADX INFO: renamed from: c2 */
    public final Map<String, List<String>> f24950c2 = new HashMap();

    /* JADX INFO: renamed from: d2 */
    public final Map<String, List<String>> f24952d2 = new HashMap();

    /* JADX INFO: renamed from: i2 */
    public String f24959i2 = "";

    /* JADX INFO: renamed from: j2 */
    public String f24960j2 = "";

    /* JADX INFO: renamed from: l2 */
    public List<AiModelBean> f24962l2 = new ArrayList();

    /* JADX INFO: renamed from: m2 */
    public Runnable f24964m2 = new RunnableC3983o();

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$a */
    public class ViewOnClickListenerC3969a implements View.OnClickListener {
        public ViewOnClickListenerC3969a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = !((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77415M1.isSelected();
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77415M1.setSelected(z);
            vfe.getInstance().putBoolean("SP_KEY_AI_CHAT_ONLINE_SEARCH", z);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$b */
    public class ViewOnClickListenerC3970b implements View.OnClickListener {
        public ViewOnClickListenerC3970b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            yi9.m26090d(ChatGptAiActivity.f24930n2, "llRecordSend...");
            if (ChatGptAiActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(ChatGptAiActivity.this)) {
                    l3h.showToastShort(ChatGptAiActivity.this, C4201R.string.loading_no_net_view_text_hint);
                } else if (ChatGptAiActivity.this.f24945a.isWorking()) {
                    l3h.showToastShort(ChatGptAiActivity.this, C4201R.string.str_no_spack_tip);
                } else {
                    MediaPlayerManager.getInstance().stopAndClearData();
                    ChatGptAiActivity.this.showVoiceView();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$c */
    public class ViewOnClickListenerC3971c implements View.OnClickListener {
        public ViewOnClickListenerC3971c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChatGptAiActivity.this.voiceViewGptGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$d */
    public class ViewOnClickListenerC3972d implements View.OnClickListener {

        /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List f24969a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f24970b;

            public a(List list, String str) {
                this.f24969a = list;
                this.f24970b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                ChatGptAiActivity.this.f24949c.refreshData(this.f24969a, new ChatMessageDTO("user", this.f24970b));
            }
        }

        public ViewOnClickListenerC3972d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChatGptAiActivity chatGptAiActivity = ChatGptAiActivity.this;
            chatGptAiActivity.hideSoftInputFromWindow(((C11945r9) ((BaseActivity) chatGptAiActivity).binding).f77410C);
            if (!C6875hk.getInstance().isConnected()) {
                l3h.showToastShort(ChatGptAiActivity.this, C4201R.string.loading_no_net_view_text_hint);
                return;
            }
            if (ChatGptAiActivity.this.f24945a.isWorking()) {
                l3h.showToastShort(ChatGptAiActivity.this, C4201R.string.str_no_spack_tip);
                return;
            }
            String string = ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77431e.getText().toString();
            if (TextUtils.isEmpty(string)) {
                l3h.showToastShort(ChatGptAiActivity.this, C4201R.string.string_empty_content);
                return;
            }
            String strReplace = string.replace("\n", "");
            MediaPlayerManager.getInstance().stopAndClearData();
            List<C2133c.b> historyRecentMSg = ChatGptAiActivity.this.f24945a.getHistoryRecentMSg();
            ChatGptAiActivity.this.showSendTextListAdapter(strReplace);
            MediaPlayerManager.getInstance().readyToPlayInRealTime();
            ChatGptAiActivity.this.f24954e2.removeCallbacksAndMessages(null);
            ChatGptAiActivity.this.f24954e2.postDelayed(new a(historyRecentMSg, strReplace), 200L);
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77431e.setText("");
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$e */
    public class C3973e implements MediaPlayerManager.OnPlayListener {
        public C3973e() {
        }

        @Override // com.watchfun.transcommon.manager.ai.MediaPlayerManager.OnPlayListener
        public void onHistoryPlayComplete() {
            ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId("");
        }

        @Override // com.watchfun.transcommon.manager.ai.MediaPlayerManager.OnPlayListener
        public void onPlayPause() {
        }

        @Override // com.watchfun.transcommon.manager.ai.MediaPlayerManager.OnPlayListener
        public void onPlayResume() {
        }

        @Override // com.watchfun.transcommon.manager.ai.MediaPlayerManager.OnPlayListener
        public void onRealTimePlayComplete() {
            ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId("");
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$f */
    public class C3974f implements q87.InterfaceC11362j {

        /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f24974a;

            public a(View view) {
                this.f24974a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24974a.setScaleX(1.0f);
                this.f24974a.setScaleY(1.0f);
            }
        }

        public C3974f() {
        }

        @Override // p000.q87.InterfaceC11362j
        public void click(boolean z) {
        }

        @Override // p000.q87.InterfaceC11362j
        public void onItemChatPlayVoice(View view, int i, b27 b27Var) {
            String msgId = b27Var.getMsgId();
            view.setScaleX(1.2f);
            view.setScaleY(1.2f);
            view.postDelayed(new a(view), 5500L);
            yi9.m26090d(ChatGptAiActivity.f24930n2, "onItemChatPlayVoice: " + msgId + ",currentMsgId " + ChatGptAiActivity.this.f24957g2);
            if (TextUtils.equals(ChatGptAiActivity.this.f24957g2, msgId) && MediaPlayerManager.getInstance().isPlayingRealTime()) {
                if (MediaPlayerManager.getInstance().getMediaPlayer().isPlaying()) {
                    MediaPlayerManager.getInstance().pause();
                    ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId("");
                    return;
                } else {
                    MediaPlayerManager.getInstance().resume();
                    ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId(msgId);
                    return;
                }
            }
            if (!MediaPlayerManager.getInstance().isPlayingHistory()) {
                File[] aiVoiceFiles = C6875hk.getInstance().getAiVoiceFiles(msgId);
                MediaPlayerManager.getInstance().playHistory(aiVoiceFiles);
                if (aiVoiceFiles == null || aiVoiceFiles.length == 0) {
                    return;
                }
                ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId(msgId);
                return;
            }
            if (MediaPlayerManager.getInstance().getHistoryPlayFileName().contains(msgId)) {
                if (MediaPlayerManager.getInstance().getMediaPlayer().isPlaying()) {
                    MediaPlayerManager.getInstance().pause();
                    ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId("");
                    return;
                } else {
                    MediaPlayerManager.getInstance().resume();
                    ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId(msgId);
                    return;
                }
            }
            File[] aiVoiceFiles2 = C6875hk.getInstance().getAiVoiceFiles(msgId);
            MediaPlayerManager.getInstance().playHistory(aiVoiceFiles2);
            if (aiVoiceFiles2 == null || aiVoiceFiles2.length == 0) {
                return;
            }
            ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId(msgId);
        }

        @Override // p000.q87.InterfaceC11362j
        public void onItemChatVoice(View view, int i, String str) {
        }

        @Override // p000.q87.InterfaceC11362j
        public void onItemLongClick(boolean z, boolean z2) {
        }

        @Override // p000.q87.InterfaceC11362j
        public void onItemTranslate(int i, b27 b27Var) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$g */
    public class ViewOnClickListenerC3975g implements View.OnClickListener {
        public ViewOnClickListenerC3975g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(ChatGptAiActivity.this, (Class<?>) SelectTransActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(SelectTransActivity.KEY_TITLE, ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77433f.getText().toString());
            bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, "");
            bundle.putInt(SelectTransActivity.KEY_TYPE, 1);
            bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, 5);
            intent.putExtras(bundle);
            ChatGptAiActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$h */
    public class C3976h extends TypeToken<List<AiModelBean>> {
        public C3976h() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$i */
    public class RunnableC3977i implements Runnable {
        public RunnableC3977i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77430d2.setText("");
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77434f2.setVisibility(0);
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77434f2.requestLayout();
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77434f2.invalidate();
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77427c.setVisibility(8);
            if (!ChatGptAiActivity.this.isFinishing() && !ChatGptAiActivity.this.isDestroyed()) {
                ComponentCallbacks2C2485a.with((FragmentActivity) ChatGptAiActivity.this).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_black)).diskCacheStrategy(ne4.f64120d).into(((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77417Q);
            }
            int iApplyDimension = (int) TypedValue.applyDimension(1, 200.0f, ChatGptAiActivity.this.getResources().getDisplayMetrics());
            yi9.m26090d(ChatGptAiActivity.f24930n2, "Calculated offset in pixels: " + iApplyDimension);
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77425b.setPadding(0, 0, 0, iApplyDimension);
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77425b.setClipToPadding(false);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$j */
    public class RunnableC3978j implements Runnable {
        public RunnableC3978j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77434f2.setVisibility(8);
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77427c.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$k */
    public class RunnableC3979k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24980a;

        public RunnableC3979k(String str) {
            this.f24980a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChatGptAiActivity.this.f24945a.setCurrentPlayingMsgId(this.f24980a);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$l */
    public class C3980l implements PermissionExplanationDialog.OnClickListListener {
        public C3980l() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            ChatGptAiActivity.this.checkPermission();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            Toast.makeText(ChatGptAiActivity.this, C4201R.string.permission_tip5, 0).show();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$m */
    public class RunnableC3981m implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24983a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b27 f24984b;

        public RunnableC3981m(String str, b27 b27Var) {
            this.f24983a = str;
            this.f24984b = b27Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24983a != null) {
                ChatGptAiActivity.this.f24955f.insert(this.f24984b);
            } else {
                yi9.m26090d(ChatGptAiActivity.f24930n2, "messageDao.insert fail, because msgId is null");
            }
            ChatGptAiActivity.this.f24945a.refreshData(this.f24984b, false, false);
            ChatGptAiActivity.this.updateRecyclerViewScrollPosition();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$n */
    public class RunnableC3982n implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f24986a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f24987b;

        public RunnableC3982n(List list, String str) {
            this.f24986a = list;
            this.f24987b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChatGptAiActivity.this.f24949c.refreshData(this.f24986a, new ChatMessageDTO("user", this.f24987b));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$o */
    public class RunnableC3983o implements Runnable {
        public RunnableC3983o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77430d2.getText().toString();
            if (TextUtils.isEmpty(string) || !TextUtils.equals(string, ChatGptAiActivity.this.f24959i2) || ChatGptAiActivity.this.f24945a.isWorking()) {
                return;
            }
            ChatGptAiActivity.this.voiceViewGptGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$p */
    public class C3984p implements C6875hk.f {
        public C3984p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClosed$1(int i) {
            if (i != 1000) {
                l3h.showToastShort(ChatGptAiActivity.this.getString(C4201R.string.loading_no_net_view_text_hint));
            }
            ChatGptAiActivity.this.hideVoiceView();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFailure$2() {
            ChatGptAiActivity.this.hideVoiceView();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVoiceTranscribe$0(String str, boolean z) {
            if (TextUtils.isEmpty(str) || ChatGptAiActivity.this.f24936M) {
                return;
            }
            ChatGptAiActivity.this.showGptText(str, false, z);
        }

        @Override // p000.C6875hk.f
        public void onClosed(final int i) {
            ChatGptAiActivity.this.runOnUiThread(new Runnable() { // from class: hx1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45181a.lambda$onClosed$1(i);
                }
            });
        }

        @Override // p000.C6875hk.f
        public void onFailure() {
            ChatGptAiActivity.this.runOnUiThread(new Runnable() { // from class: gx1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41754a.lambda$onFailure$2();
                }
            });
        }

        @Override // p000.C6875hk.f
        public void onMessage(C2337ck c2337ck) {
            if (TextUtils.equals(c2337ck.getType(), "chatMessage")) {
                ChatGptAiActivity.this.dealChatMsgOnRecv(c2337ck);
            }
        }

        @Override // p000.C6875hk.f
        public void onMessageBytes(byte[] bArr) {
            if (!C6875hk.getInstance().isVoiceSpeechStart() || !xja.getInstance().isPlayingHistory()) {
                MediaPlayerManager.getInstance().setContext(ChatGptAiActivity.this);
                MediaPlayerManager.getInstance().addSound(bArr);
            }
            C6875hk.getInstance().cacheAudioFile(ChatGptAiActivity.this.f24957g2, bArr);
        }

        @Override // p000.C6875hk.f
        public void onOpen() {
            if (ChatGptAiActivity.this.f24945a != null) {
                ChatGptAiActivity.this.f24945a.setWorking(false);
            }
            ChatGptAiActivity.this.sendWsConfig(vfe.getInstance().getString("SP_KEY_AI_CHAT_AI_MODEL", ""));
        }

        @Override // p000.C6875hk.f
        public void onServerResponseTimeout() {
            if (ChatGptAiActivity.this.f24945a != null) {
                ChatGptAiActivity.this.f24945a.setWorking(false);
            }
        }

        @Override // p000.C6875hk.f
        public void onSpeechStarted() {
        }

        @Override // p000.C6875hk.f
        public void onSpeechStoped() {
        }

        @Override // p000.C6875hk.f
        public void onVoiceTranscribe(C4826dk c4826dk) {
            if (C6875hk.getInstance().isVoiceSpeechStart()) {
                final String text = c4826dk.getText();
                final boolean zEquals = TextUtils.equals(c4826dk.getStatus(), C4826dk.f29845f);
                ChatGptAiActivity.this.runOnUiThread(new Runnable() { // from class: ix1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48735a.lambda$onVoiceTranscribe$0(text, zEquals);
                    }
                });
                ChatGptAiActivity.this.f24954e2.removeCallbacks(ChatGptAiActivity.this.f24964m2);
                ChatGptAiActivity.this.f24954e2.postDelayed(ChatGptAiActivity.this.f24964m2, 1500L);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$q */
    public class C3985q implements C3994a.c {
        public C3985q() {
        }

        @Override // com.watchfun.aichat.C3994a.c
        public void onItemClick(int i, AiModelBean aiModelBean) {
            String code = aiModelBean.getCode();
            vfe.getInstance().putString("SP_KEY_AI_CHAT_AI_MODEL", code);
            vfe.getInstance().putString("SP_KEY_AI_CHAT_AI_MODEL_NAME", aiModelBean.getEnglishName());
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77424a2.setText(aiModelBean.getEnglishName());
            ChatGptAiActivity.this.sendWsConfig(code);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$r */
    public class ViewOnClickListenerC3986r implements View.OnClickListener {
        public ViewOnClickListenerC3986r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChatGptAiActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$s */
    public class C3987s implements AudioManager.OnAudioFocusChangeListener {
        public C3987s() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$t */
    public class ViewTreeObserverOnGlobalLayoutListenerC3988t implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC3988t() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ChatGptAiActivity.this.f24963m) {
                return;
            }
            Rect rect = new Rect();
            ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77410C.getWindowVisibleDisplayFrame(rect);
            if ((((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77410C.getHeight() - rect.bottom) + 135 > 0) {
                ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77410C.setTranslationY(-r1);
            } else {
                ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77410C.setTranslationY(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$u */
    public class ViewOnClickListenerC3989u implements View.OnClickListener {
        public ViewOnClickListenerC3989u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (mc2.isEmpty(ChatGptAiActivity.this.f24962l2) || ChatGptAiActivity.this.f24962l2.size() <= 1) {
                return;
            }
            ChatGptAiActivity chatGptAiActivity = ChatGptAiActivity.this;
            chatGptAiActivity.showAiModelDlg(chatGptAiActivity.f24962l2);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatGptAiActivity$v */
    public class ViewOnClickListenerC3990v implements View.OnClickListener {
        public ViewOnClickListenerC3990v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ChatGptAiActivity.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(ChatGptAiActivity.this)) {
                    l3h.showToastShort(ChatGptAiActivity.this, C4201R.string.loading_no_net_view_text_hint);
                    return;
                }
                if (ChatGptAiActivity.this.f24963m) {
                    ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77412H.setImageResource(C4201R.drawable.ic_ai_voice);
                    ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77411F.setVisibility(0);
                    ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77418V1.setVisibility(8);
                    ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77431e.requestFocus();
                    ((InputMethodManager) ChatGptAiActivity.this.getSystemService("input_method")).showSoftInput(((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77431e, 1);
                    ChatGptAiActivity.this.f24963m = false;
                    return;
                }
                ChatGptAiActivity.this.f24963m = true;
                ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77412H.setImageResource(C4201R.drawable.ic_keyboard);
                ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77418V1.setVisibility(0);
                ((C11945r9) ((BaseActivity) ChatGptAiActivity.this).binding).f77411F.setVisibility(8);
                ChatGptAiActivity chatGptAiActivity = ChatGptAiActivity.this;
                chatGptAiActivity.hideSoftInputFromWindow(((C11945r9) ((BaseActivity) chatGptAiActivity).binding).f77410C);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f24947b).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f24947b) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                ActivityCompat.requestPermissions(this, this.f24947b, 200);
                return;
            }
        }
    }

    private String convertListToString(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealChatMsgOnRecv(C2337ck c2337ck) {
        List<String> arrayList;
        List<String> arrayList2;
        String id = c2337ck.getId();
        this.f24957g2 = id;
        if (this.f24950c2.containsKey(id)) {
            arrayList = this.f24950c2.get(id);
            arrayList2 = this.f24952d2.get(id);
        } else {
            arrayList = new ArrayList<>();
            arrayList2 = new ArrayList<>();
            this.f24950c2.put(id, arrayList);
            this.f24952d2.put(id, arrayList2);
        }
        if (TextUtils.equals(c2337ck.getStatus(), C2337ck.f16773h)) {
            if (arrayList != null) {
                processingData(convertListToString(arrayList2), convertListToString(arrayList), id, true);
                q87 q87Var = this.f24945a;
                if (q87Var != null) {
                    q87Var.setWorking(false);
                }
                this.f24956f2 = null;
                this.f24950c2.remove(id);
                this.f24952d2.remove(id);
            }
        } else if (TextUtils.equals(c2337ck.getStatus(), C2337ck.f16772g) && arrayList != null) {
            if (!TextUtils.equals(id, this.f24958h2)) {
                runOnUiThread(new RunnableC3979k(id));
            }
            if (!TextUtils.equals(c2337ck.getContentType(), C2337ck.f16776k)) {
                arrayList.add(c2337ck.getContent());
            } else if (arrayList2 != null) {
                arrayList2.add(c2337ck.getContent());
            }
            processingData(convertListToString(arrayList2), convertListToString(arrayList), id, false);
            q87 q87Var2 = this.f24945a;
            if (q87Var2 != null) {
                q87Var2.setWorking(true);
            }
        }
        this.f24958h2 = id;
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f24944Z1;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f24944Z1.dismiss();
            }
            this.f24944Z1 = null;
        }
    }

    private String[] findUnaskedPermissions(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private TransLanguageData getTransLanguageData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (TransLanguageData) new Gson().fromJson(str, TransLanguageData.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideSoftInputFromWindow(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideVoiceView() {
        if (((C11945r9) this.binding).f77434f2.getVisibility() == 0) {
            runOnUiThread(new RunnableC3978j());
        }
    }

    private void initAiChatWebSocket() {
        C6875hk.getInstance().setWebSocketListener(new C3984p());
        C6875hk.getInstance().init(this, e10.f31486b, e10.f31487c, e10.f31490f);
        C6875hk.getInstance().connect();
    }

    private void initAiModelData(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List list = (List) qc7.fromJson(str, new C3976h().getType());
        String englishName = "";
        String string = vfe.getInstance().getString("SP_KEY_AI_CHAT_AI_MODEL", "");
        this.f24962l2.clear();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AiModelBean aiModelBean = (AiModelBean) it.next();
                if (TextUtils.equals(aiModelBean.getCode(), string)) {
                    aiModelBean.setSelected(true);
                    englishName = aiModelBean.getEnglishName();
                    vfe.getInstance().putString("SP_KEY_AI_CHAT_AI_MODEL", aiModelBean.getCode());
                    vfe.getInstance().putString("SP_KEY_AI_CHAT_AI_MODEL_NAME", englishName);
                    z = true;
                    break;
                }
            }
            if (!z) {
                AiModelBean aiModelBean2 = (AiModelBean) list.get(0);
                aiModelBean2.setSelected(true);
                englishName = aiModelBean2.getEnglishName();
                vfe.getInstance().putString("SP_KEY_AI_CHAT_AI_MODEL", aiModelBean2.getCode());
                vfe.getInstance().putString("SP_KEY_AI_CHAT_AI_MODEL_NAME", englishName);
            }
            this.f24962l2.addAll(list);
        }
        if (!mc2.isEmpty(this.f24962l2)) {
            ((C11945r9) this.binding).f77424a2.setText(englishName);
        } else if (t77.f83945x) {
            ((C11945r9) this.binding).f77424a2.setText("Default");
        } else {
            ((C11945r9) this.binding).f77424a2.setText("openai");
        }
    }

    private void initLanguage() {
        TransLanguageData transLanguageData = getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90942a0));
        this.f24946a2 = transLanguageData;
        if (transLanguageData != null) {
            ((C11945r9) this.binding).f77433f.setText(AiLangUtil.getValue(this, transLanguageData.getKeyName()));
            return;
        }
        TransLanguageData transLanguageData2 = new TransLanguageData();
        this.f24946a2 = transLanguageData2;
        transLanguageData2.setTransId(1);
        this.f24946a2.setVoiceName("xiaoyan");
        this.f24946a2.setIatLanguage("zh-CN");
        this.f24946a2.setLangKey("zh-Hans");
        this.f24946a2.setDefaultName("中文");
        this.f24946a2.setKeyName("zh_name");
        this.f24946a2.setSelect(true);
        this.f24946a2.setUseMicTTS(true);
        ((C11945r9) this.binding).f77433f.setText(C4201R.string.ai_trans_zh);
        vfe.getInstance().putString(vfe.C14037b.f90942a0, TransLanguageData.toJson(this.f24946a2));
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        initAiModelData(t77.f83944w);
        if (t77.f83945x || mc2.isEmpty(this.f24962l2)) {
            ((C11945r9) this.binding).f77420Y.setVisibility(8);
        } else {
            ((C11945r9) this.binding).f77420Y.setVisibility(0);
        }
        this.f24954e2 = new Handler();
        ((C11945r9) this.binding).f77419X.setOnClickListener(new ViewOnClickListenerC3986r());
        ((C11945r9) this.binding).f77415M1.setSelected(vfe.getInstance().getBoolean("SP_KEY_AI_CHAT_ONLINE_SEARCH", false));
        checkAndRequestPermissions();
        this.f24934H = new GptAiAudioFilePresenter(this);
        this.f24949c = new GptCompletionsPresenter(this);
        this.f24935L = new TalkNetManager();
        this.f24943Z = (AudioManager) getSystemService("audio");
        this.f24943Z.requestAudioFocus(new C3987s(), 3, 1);
        initLanguage();
        MediaPlayerManager.getInstance().init();
        initAiChatWebSocket();
        this.f24955f = GPTMessageDatabase.getDatabase(this).messageDao();
        ((C11945r9) this.binding).f77425b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f24945a = new q87(this, ((C11945r9) this.binding).f77425b);
        List<b27> latestTen = this.f24955f.getLatestTen();
        if (mc2.isEmpty(latestTen)) {
            ((C11945r9) this.binding).f77421Z.setVisibility(0);
        } else {
            Collections.reverse(latestTen);
            this.f24945a.setData(latestTen, false, false);
            T t = this.binding;
            ((C11945r9) t).f77425b.scrollToPosition(((C11945r9) t).f77425b.getAdapter().getItemCount() - 1);
        }
        this.f24949c.getAiModelList(false);
        ((C11945r9) this.binding).f77410C.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3988t());
        ((C11945r9) this.binding).f77420Y.setOnClickListener(new ViewOnClickListenerC3989u());
        ((C11945r9) this.binding).f77412H.setOnClickListener(new ViewOnClickListenerC3990v());
        ((C11945r9) this.binding).f77415M1.setOnClickListener(new ViewOnClickListenerC3969a());
        ((C11945r9) this.binding).f77418V1.setOnClickListener(new ViewOnClickListenerC3970b());
        ((C11945r9) this.binding).f77434f2.setOnClickListener(new ViewOnClickListenerC3971c());
        ((C11945r9) this.binding).f77413L.setOnClickListener(new ViewOnClickListenerC3972d());
        MediaPlayerManager.getInstance().setPlayListener(new C3973e());
        AudioPlayerManager.getInstance().setAudioPlayerListener(this);
        this.f24945a.setItemClickListener(new C3974f());
        ((C11945r9) this.binding).f77433f.setOnClickListener(new ViewOnClickListenerC3975g());
    }

    private boolean isUseMicrosoft() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAudioPlaybackCompleted$0() {
        this.f24938N = false;
        this.f24932C = false;
        b27 b27Var = this.f24942Y;
        if (b27Var != null) {
            b27Var.setPause(false);
            this.f24945a.updateMessage(this.f24942Y, this.f24941X);
        }
    }

    private void loadMoreDate() {
    }

    public static ChatGptAiActivity newInstance() {
        return new ChatGptAiActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWsConfig(String str) {
        C7323ik c7323ik = new C7323ik();
        c7323ik.setCommand("config");
        c7323ik.setSourceLanguage(this.f24946a2.getIatLanguage());
        c7323ik.setSampleRate(44100);
        c7323ik.setAiModel(str);
        C6875hk.getInstance().sendConfig(c7323ik);
    }

    private void setListener() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAiModelDlg(List<AiModelBean> list) {
        C3994a c3994a = new C3994a(this, (ViewGroup) findViewById(android.R.id.content));
        c3994a.setData(list);
        c3994a.setListener(new C3985q());
        c3994a.showAsDropDown(((C11945r9) this.binding).f77422Z1, c3994a.getXOffset(this), 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGptText(String str, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str) || z) {
            if (!z) {
                this.f24959i2 = this.f24960j2 + str;
                if (z2) {
                    this.f24960j2 += str;
                }
                ((C11945r9) this.binding).f77430d2.setText(this.f24959i2);
                return;
            }
            String strReplace = str.replace("\n", "");
            hideSoftInputFromWindow(((C11945r9) this.binding).f77410C);
            MediaPlayerManager.getInstance().stopAndClearData();
            List<C2133c.b> historyRecentMSg = this.f24945a.getHistoryRecentMSg();
            showSendTextListAdapter(strReplace);
            MediaPlayerManager.getInstance().readyToPlayInRealTime();
            C6875hk.getInstance().setVoiceSpeechStart(false);
            this.f24954e2.postDelayed(new RunnableC3982n(historyRecentMSg, strReplace), 200L);
            ((C11945r9) this.binding).f77431e.setText("");
            ((C11945r9) this.binding).f77430d2.setText("");
            ((C11945r9) this.binding).f77425b.smoothScrollToPosition(((C11945r9) r3).f77425b.getAdapter().getItemCount() - 1);
            this.f24959i2 = "";
            this.f24960j2 = "";
        }
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f24944Z1 == null) {
            this.f24944Z1 = new PermissionExplanationDialog(this, new C3980l());
        }
        if (this.f24944Z1.isShowing() || isDestroyed() || isFinishing()) {
            return;
        }
        this.f24944Z1.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSendTextListAdapter(String str) {
        ArrayList arrayList = new ArrayList();
        b27 b27Var = new b27();
        b27Var.setDefaultCharacters(str);
        b27Var.setType(2);
        b27Var.setMultipleOptions(1);
        b27Var.setMessageTime(System.currentTimeMillis());
        b27Var.setPause(false);
        b27Var.setMsgId(System.currentTimeMillis() + "");
        this.f24955f.insert(b27Var);
        arrayList.add(b27Var);
        this.f24945a.setData(arrayList, false, true);
        T t = this.binding;
        ((C11945r9) t).f77425b.smoothScrollToPosition(((C11945r9) t).f77425b.getAdapter().getItemCount() - 1);
        ((C11945r9) this.binding).f77421Z.setVisibility(8);
        this.f24945a.setWorking(true);
    }

    private void showVoice() {
        runOnUiThread(new RunnableC3977i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showVoiceView() {
        showVoice();
        stopPlay();
        AudioPlayerManager.getInstance().stopAudio();
        C6875hk.getInstance().sendStartVoiceCmd();
    }

    private void stopPlay() {
        b27 b27Var = this.f24942Y;
        if (b27Var != null && this.f24945a != null) {
            b27Var.setPause(false);
            this.f24932C = false;
            this.f24938N = true;
            this.f24945a.updateMessage(this.f24942Y, this.f24941X);
        }
        AudioPlayerManager.getInstance().stopAudio();
        MediaPlayerManager.getInstance().stopAndClearData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewScrollPosition() {
        ((C11945r9) this.binding).f77425b.smoothScrollToPosition((((((C11945r9) this.binding).f77425b.getMeasuredHeight() == 0 || ((C11945r9) this.binding).f77425b.getLayoutManager().getItemCount() == 0) ? 20 : ((C11945r9) this.binding).f77425b.getMeasuredHeight() / ((C11945r9) this.binding).f77425b.getLayoutManager().getItemCount()) / 60) + 100);
    }

    private void voiceViewGone() {
        AsrWebSocketManager asrWebSocketManager;
        if (isUseMicrosoft() && (asrWebSocketManager = this.f24948b2) != null) {
            asrWebSocketManager.stopSocket();
        }
        hideVoiceView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGptGone() {
        AudioRecorder.getInstance().stopRecord();
        C6875hk.getInstance().sendStopVoiceCmd();
        this.f24934H.refreshData(this.f24935L.stopRecordAndUpload(this), ufh.f87916c);
        String string = ((C11945r9) this.binding).f77430d2.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            showGptText(string, true, false);
        }
        voiceViewGone();
    }

    public void dismissLoadingView() {
        CustomLoadingDialog customLoadingDialog = this.f24961k2;
        if (customLoadingDialog != null) {
            customLoadingDialog.dismiss();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C11945r9 getViewBinding() {
        return C11945r9.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity, p000.wu0
    public String getPageName() {
        return "ai";
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        initUI();
        setListener();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File file) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        AudioPlayerManager.getInstance().playAudioFile(this.f24943Z, file, 1);
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiDialogueView
    public void loadDataSuccess(String str) {
        b27 b27Var = new b27();
        if (!TextUtils.isEmpty(str)) {
            b27Var.setResult(str.replace("*", "").replace("\n\n", "\n"));
        }
        b27Var.setType(1);
        b27Var.setMultipleOptions(1);
        b27Var.setMessageTime(System.currentTimeMillis());
        b27Var.setPause(false);
        this.f24955f.insert(b27Var);
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTAudioView
    public void loadRecListSuccess(String str, boolean z, boolean z2, boolean z3) {
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
    }

    @Override // com.watchfun.transcommon.manager.trans.AudioPlayerManager.AudioPlayerListener
    public void onAudioPlaybackCompleted() {
        runOnUiThread(new Runnable() { // from class: fx1
            @Override // java.lang.Runnable
            public final void run() {
                this.f37906a.lambda$onAudioPlaybackCompleted$0();
            }
        });
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        yi9.m26090d(f24930n2, "onDestory");
        Handler handler = this.f24954e2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        AudioRecorder.getInstance().stopRecord();
        C6875hk.getInstance().release();
        MediaPlayerManager.getInstance().release();
        AudioPlayerManager.getInstance().stopAudio();
        AsrWebSocketManager asrWebSocketManager = this.f24948b2;
        if (asrWebSocketManager != null) {
            asrWebSocketManager.release();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        voiceViewGone();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @efb String[] strArr, @efb int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        yi9.m26090d(f24930n2, "onRequestPermissionsResult =" + i);
        if (i == 200) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    l3h.showToastShort(this, C4201R.string.permission_system_set);
                    return;
                }
            }
            vfe.getInstance().putBoolean("SP_KEY_PERMISSIONSGRANTED", true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initLanguage();
        sendWsConfig(vfe.getInstance().getString("SP_KEY_AI_CHAT_AI_MODEL", ""));
        this.f24936M = false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        voiceViewGone();
        stopPlay();
        this.f24936M = true;
    }

    public void processingData(String str, String str2, String str3, boolean z) {
        b27 b27Var = new b27();
        if (!TextUtils.isEmpty(str2)) {
            b27Var.setResult(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            b27Var.setReasoningResult(str);
        }
        b27Var.setType(1);
        b27Var.setMultipleOptions(1);
        b27Var.setMessageTime(System.currentTimeMillis());
        b27Var.setPause(false);
        b27Var.setMsgId(str3);
        this.f24956f2 = b27Var;
        this.f24954e2.postDelayed(new RunnableC3981m(str3, b27Var), 900L);
    }

    public void showLoadingView() {
        if (this.f24961k2 == null) {
            this.f24961k2 = new CustomLoadingDialog(this);
        }
        this.f24961k2.show();
    }
}
