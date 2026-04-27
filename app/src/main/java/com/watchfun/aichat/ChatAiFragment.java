package com.watchfun.aichat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.watchfun.aichat.C3994a;
import com.watchfun.aichat.database.GPTMessageDatabase;
import com.watchfun.base.BaseFragment;
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
import com.watchfun.transcommon.manager.trans.AudioPlayerManager;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.widget.BottomEditView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C2133c;
import p000.C2337ck;
import p000.C4826dk;
import p000.C6875hk;
import p000.C7323ik;
import p000.axg;
import p000.b27;
import p000.bxg;
import p000.d27;
import p000.e10;
import p000.efb;
import p000.gxg;
import p000.hy2;
import p000.igg;
import p000.iu6;
import p000.l3h;
import p000.lx2;
import p000.mc2;
import p000.ne4;
import p000.q87;
import p000.t77;
import p000.u20;
import p000.ubb;
import p000.ufh;
import p000.vfe;
import p000.xcg;
import p000.xja;
import p000.xnc;
import p000.yi9;
import p000.zgb;

/* JADX INFO: loaded from: classes6.dex */
public class ChatAiFragment extends BaseFragment<iu6> implements GPTContract.AiDialogueView, AudioManager.OnAudioFocusChangeListener, GPTContract.AiGPTAudioView, GPTContract.AiGPTTextToAudioView, AudioPlayerManager.AudioPlayerListener {

    /* JADX INFO: renamed from: p2 */
    public static final String f24860p2 = "ChatAiFragment";

    /* JADX INFO: renamed from: q2 */
    public static View f24861q2;

    /* JADX INFO: renamed from: F */
    public boolean f24863F;

    /* JADX INFO: renamed from: H */
    public GptAiAudioFilePresenter f24864H;

    /* JADX INFO: renamed from: L */
    public TalkNetManager f24865L;

    /* JADX INFO: renamed from: M1 */
    public SpeechRecognizer f24867M1;

    /* JADX INFO: renamed from: Q */
    public String f24869Q;

    /* JADX INFO: renamed from: Y */
    public b27 f24872Y;

    /* JADX INFO: renamed from: Z */
    public AudioManager f24873Z;

    /* JADX INFO: renamed from: Z1 */
    public PermissionExplanationDialog f24874Z1;

    /* JADX INFO: renamed from: a */
    public q87 f24875a;

    /* JADX INFO: renamed from: a2 */
    public TransLanguageData f24876a2;

    /* JADX INFO: renamed from: c */
    public GptCompletionsPresenter f24879c;

    /* JADX INFO: renamed from: d */
    public int f24881d;

    /* JADX INFO: renamed from: d2 */
    public Handler f24882d2;

    /* JADX INFO: renamed from: e */
    public GPTMessageDatabase f24883e;

    /* JADX INFO: renamed from: e2 */
    public b27 f24884e2;

    /* JADX INFO: renamed from: f */
    public d27 f24885f;

    /* JADX INFO: renamed from: f2 */
    public String f24886f2;

    /* JADX INFO: renamed from: g2 */
    public String f24887g2;

    /* JADX INFO: renamed from: j2 */
    public boolean f24890j2;

    /* JADX INFO: renamed from: k2 */
    public boolean f24891k2;

    /* JADX INFO: renamed from: l2 */
    public CustomLoadingDialog f24892l2;

    /* JADX INFO: renamed from: b */
    public String[] f24877b = {xnc.f98582G, "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.WAKE_LOCK"};

    /* JADX INFO: renamed from: m */
    public boolean f24893m = true;

    /* JADX INFO: renamed from: C */
    public boolean f24862C = false;

    /* JADX INFO: renamed from: M */
    public boolean f24866M = false;

    /* JADX INFO: renamed from: N */
    public boolean f24868N = false;

    /* JADX INFO: renamed from: X */
    public int f24871X = -1;

    /* JADX INFO: renamed from: V1 */
    public boolean f24870V1 = true;

    /* JADX INFO: renamed from: b2 */
    public final Map<String, List<String>> f24878b2 = new HashMap();

    /* JADX INFO: renamed from: c2 */
    public final Map<String, List<String>> f24880c2 = new HashMap();

    /* JADX INFO: renamed from: h2 */
    public String f24888h2 = "";

    /* JADX INFO: renamed from: i2 */
    public String f24889i2 = "";

    /* JADX INFO: renamed from: m2 */
    public List<AiModelBean> f24894m2 = new ArrayList();

    /* JADX INFO: renamed from: n2 */
    public Runnable f24895n2 = new RunnableC3961p();

    /* JADX INFO: renamed from: o2 */
    public final xcg<bxg> f24896o2 = new xcg() { // from class: bx1
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f15121a.lambda$new$0((bxg) obj);
        }
    };

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$a */
    public class ViewOnClickListenerC3946a implements View.OnClickListener {
        public ViewOnClickListenerC3946a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = !((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48486a2.isSelected();
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48486a2.setSelected(z);
            vfe.getInstance().putBoolean("SP_KEY_AI_CHAT_ONLINE_SEARCH", z);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$b */
    public class ViewOnClickListenerC3947b implements View.OnClickListener {
        public ViewOnClickListenerC3947b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            yi9.m26090d(ChatAiFragment.f24860p2, "llRecordSend...");
            if (ChatAiFragment.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(ChatAiFragment.this.getActivity())) {
                    l3h.showToastShort(ChatAiFragment.this.getActivity(), C4201R.string.loading_no_net_view_text_hint);
                } else if (ChatAiFragment.this.f24875a.isWorking()) {
                    l3h.showToastShort(ChatAiFragment.this.getActivity(), C4201R.string.str_no_spack_tip);
                } else {
                    MediaPlayerManager.getInstance().stopAndClearData();
                    ChatAiFragment.this.showVoiceView();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$c */
    public class ViewOnClickListenerC3948c implements View.OnClickListener {
        public ViewOnClickListenerC3948c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChatAiFragment.this.voiceViewGptGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$d */
    public class ViewOnClickListenerC3949d implements View.OnClickListener {

        /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List f24901a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f24902b;

            public a(List list, String str) {
                this.f24901a = list;
                this.f24902b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                ChatAiFragment.this.f24879c.refreshData(this.f24901a, new ChatMessageDTO("user", this.f24902b));
            }
        }

        public ViewOnClickListenerC3949d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChatAiFragment chatAiFragment = ChatAiFragment.this;
            chatAiFragment.hideSoftInputFromWindow(((iu6) ((BaseFragment) chatAiFragment).binding).f48473F);
            if (!C6875hk.getInstance().isConnected()) {
                l3h.showToastShort(ChatAiFragment.this.getActivity(), C4201R.string.loading_no_net_view_text_hint);
                return;
            }
            if (ChatAiFragment.this.f24875a.isWorking()) {
                l3h.showToastShort(ChatAiFragment.this.getActivity(), C4201R.string.str_no_spack_tip);
                return;
            }
            String string = ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48495f.getText().toString();
            if (TextUtils.isEmpty(string)) {
                l3h.showToastShort(ChatAiFragment.this.getActivity(), C4201R.string.string_empty_content);
                return;
            }
            String strReplace = string.replace("\n", "");
            MediaPlayerManager.getInstance().stopAndClearData();
            List<C2133c.b> historyRecentMSg = ChatAiFragment.this.f24875a.getHistoryRecentMSg();
            ChatAiFragment.this.showSendTextListAdapter(strReplace);
            MediaPlayerManager.getInstance().readyToPlayInRealTime();
            ChatAiFragment.this.f24882d2.removeCallbacksAndMessages(null);
            ChatAiFragment.this.f24882d2.postDelayed(new a(historyRecentMSg, strReplace), 200L);
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48495f.setText("");
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$e */
    public class C3950e implements MediaPlayerManager.OnPlayListener {
        public C3950e() {
        }

        @Override // com.watchfun.transcommon.manager.ai.MediaPlayerManager.OnPlayListener
        public void onHistoryPlayComplete() {
            ChatAiFragment.this.f24875a.setCurrentPlayingMsgId("");
        }

        @Override // com.watchfun.transcommon.manager.ai.MediaPlayerManager.OnPlayListener
        public void onPlayPause() {
        }

        @Override // com.watchfun.transcommon.manager.ai.MediaPlayerManager.OnPlayListener
        public void onPlayResume() {
        }

        @Override // com.watchfun.transcommon.manager.ai.MediaPlayerManager.OnPlayListener
        public void onRealTimePlayComplete() {
            ChatAiFragment.this.f24875a.setCurrentPlayingMsgId("");
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$f */
    public class C3951f implements q87.InterfaceC11362j {

        /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f24906a;

            public a(View view) {
                this.f24906a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24906a.setScaleX(1.0f);
                this.f24906a.setScaleY(1.0f);
            }
        }

        public C3951f() {
        }

        @Override // p000.q87.InterfaceC11362j
        public void click(boolean z) {
            ChatAiFragment.this.f24890j2 = z;
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48489c.setViewSelected(ChatAiFragment.this.f24890j2);
        }

        @Override // p000.q87.InterfaceC11362j
        public void onItemChatPlayVoice(View view, int i, b27 b27Var) {
            String msgId = b27Var.getMsgId();
            view.setScaleX(1.2f);
            view.setScaleY(1.2f);
            view.postDelayed(new a(view), 5500L);
            yi9.m26090d(ChatAiFragment.f24860p2, "onItemChatPlayVoice: " + msgId + ",currentMsgId " + ChatAiFragment.this.f24886f2);
            if (TextUtils.equals(ChatAiFragment.this.f24886f2, msgId) && MediaPlayerManager.getInstance().isPlayingRealTime()) {
                if (MediaPlayerManager.getInstance().getMediaPlayer().isPlaying()) {
                    MediaPlayerManager.getInstance().pause();
                    ChatAiFragment.this.f24875a.setCurrentPlayingMsgId("");
                    return;
                } else {
                    MediaPlayerManager.getInstance().resume();
                    ChatAiFragment.this.f24875a.setCurrentPlayingMsgId(msgId);
                    return;
                }
            }
            if (!MediaPlayerManager.getInstance().isPlayingHistory()) {
                File[] aiVoiceFiles = C6875hk.getInstance().getAiVoiceFiles(msgId);
                MediaPlayerManager.getInstance().playHistory(aiVoiceFiles);
                if (aiVoiceFiles == null || aiVoiceFiles.length == 0) {
                    return;
                }
                ChatAiFragment.this.f24875a.setCurrentPlayingMsgId(msgId);
                return;
            }
            if (MediaPlayerManager.getInstance().getHistoryPlayFileName().contains(msgId)) {
                if (MediaPlayerManager.getInstance().getMediaPlayer().isPlaying()) {
                    MediaPlayerManager.getInstance().pause();
                    ChatAiFragment.this.f24875a.setCurrentPlayingMsgId("");
                    return;
                } else {
                    MediaPlayerManager.getInstance().resume();
                    ChatAiFragment.this.f24875a.setCurrentPlayingMsgId(msgId);
                    return;
                }
            }
            File[] aiVoiceFiles2 = C6875hk.getInstance().getAiVoiceFiles(msgId);
            MediaPlayerManager.getInstance().playHistory(aiVoiceFiles2);
            if (aiVoiceFiles2 == null || aiVoiceFiles2.length == 0) {
                return;
            }
            ChatAiFragment.this.f24875a.setCurrentPlayingMsgId(msgId);
        }

        @Override // p000.q87.InterfaceC11362j
        public void onItemChatVoice(View view, int i, String str) {
        }

        @Override // p000.q87.InterfaceC11362j
        public void onItemLongClick(boolean z, boolean z2) {
            ChatAiFragment.this.f24890j2 = z2;
            ChatAiFragment.this.f24891k2 = z;
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48489c.setEditMode(z);
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48491d.setVisibility(z ? 8 : 0);
        }

        @Override // p000.q87.InterfaceC11362j
        public void onItemTranslate(int i, b27 b27Var) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$g */
    public class C3952g implements BottomEditView.OnEditClickListener {
        public C3952g() {
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            ChatAiFragment.this.f24891k2 = false;
            ChatAiFragment.this.f24875a.setEditMode(false);
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48491d.setVisibility(0);
            if (mc2.isEmpty(ChatAiFragment.this.f24885f.getLatestTen())) {
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48484Z1.setVisibility(0);
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48492d2.setVisibility(8);
            } else {
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48484Z1.setVisibility(8);
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48492d2.setVisibility(0);
            }
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean z) {
            if (z) {
                ChatAiFragment.this.f24885f.deleteAll();
                if (mc2.isEmpty(ChatAiFragment.this.f24885f.getLatestTen())) {
                    ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48484Z1.setVisibility(0);
                    ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48492d2.setVisibility(8);
                }
            } else {
                Iterator<b27> it = ChatAiFragment.this.f24875a.getSelectData().iterator();
                while (it.hasNext()) {
                    ChatAiFragment.this.f24885f.deleteSelectData(it.next().getMessageTime());
                }
            }
            ChatAiFragment.this.f24875a.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean z) {
            ChatAiFragment.this.f24875a.setAllSelectState(z);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$h */
    public class ViewOnClickListenerC3953h implements View.OnClickListener {
        public ViewOnClickListenerC3953h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ChatAiFragment.this.f24875a.isWorking() || C6875hk.getInstance().isVoiceSpeechStart()) {
                return;
            }
            ChatAiFragment.this.f24891k2 = !r2.f24891k2;
            if (ChatAiFragment.this.f24875a != null) {
                ChatAiFragment.this.f24875a.setEditMode(ChatAiFragment.this.f24891k2);
            }
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48489c.setEditMode(ChatAiFragment.this.f24891k2);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$i */
    public class ViewOnClickListenerC3954i implements View.OnClickListener {
        public ViewOnClickListenerC3954i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(ChatAiFragment.this.getActivity(), (Class<?>) SelectTransActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(SelectTransActivity.KEY_TITLE, ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48500m.getText().toString());
            bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, "");
            bundle.putInt(SelectTransActivity.KEY_TYPE, 1);
            bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, 5);
            intent.putExtras(bundle);
            ChatAiFragment.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$j */
    public class RunnableC3955j implements Runnable {
        public RunnableC3955j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48497g2.setText("");
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48499i2.setVisibility(0);
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48499i2.requestLayout();
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48499i2.invalidate();
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48491d.setVisibility(8);
            if (vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a) == axg.f12167a) {
                ComponentCallbacks2C2485a.with(ChatAiFragment.this.getActivity()).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_blue)).diskCacheStrategy(ne4.f64120d).into(((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48483Z);
            } else {
                ComponentCallbacks2C2485a.with(ChatAiFragment.this.getActivity()).asGif().load(Integer.valueOf(C4201R.drawable.ic_volume_green)).diskCacheStrategy(ne4.f64120d).into(((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48483Z);
            }
            int iApplyDimension = (int) TypedValue.applyDimension(1, 200.0f, ChatAiFragment.this.getResources().getDisplayMetrics());
            yi9.m26090d(ChatAiFragment.f24860p2, "Calculated offset in pixels: " + iApplyDimension);
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48487b.setPadding(0, 0, 0, iApplyDimension);
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48487b.setClipToPadding(false);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$k */
    public class RunnableC3956k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24912a;

        public RunnableC3956k(String str) {
            this.f24912a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChatAiFragment.this.f24875a.setCurrentPlayingMsgId(this.f24912a);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$l */
    public class RunnableC3957l implements Runnable {
        public RunnableC3957l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48499i2.setVisibility(8);
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48491d.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$m */
    public class C3958m implements PermissionExplanationDialog.OnClickListListener {
        public C3958m() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            ChatAiFragment.this.checkPermission();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            Toast.makeText(ChatAiFragment.this.getActivity(), C4201R.string.permission_tip5, 0).show();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$n */
    public class RunnableC3959n implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24916a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b27 f24917b;

        public RunnableC3959n(String str, b27 b27Var) {
            this.f24916a = str;
            this.f24917b = b27Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24916a != null) {
                ChatAiFragment.this.f24885f.insert(this.f24917b);
            } else {
                yi9.m26090d(ChatAiFragment.f24860p2, "messageDao.insert fail, because msgId is null");
            }
            ChatAiFragment.this.f24875a.refreshData(this.f24917b, false, false);
            ChatAiFragment.this.updateRecyclerViewScrollPosition();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$o */
    public class RunnableC3960o implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f24919a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f24920b;

        public RunnableC3960o(List list, String str) {
            this.f24919a = list;
            this.f24920b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChatAiFragment.this.f24879c.refreshData(this.f24919a, new ChatMessageDTO("user", this.f24920b));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$p */
    public class RunnableC3961p implements Runnable {
        public RunnableC3961p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48497g2.getText().toString();
            if (TextUtils.isEmpty(string) || !TextUtils.equals(string, ChatAiFragment.this.f24888h2) || ChatAiFragment.this.f24875a.isWorking()) {
                return;
            }
            ChatAiFragment.this.voiceViewGptGone();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$q */
    public class C3962q implements C6875hk.f {
        public C3962q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClosed$1(int i) {
            if (i != 1000) {
                l3h.showToastShort(ChatAiFragment.this.getString(C4201R.string.loading_no_net_view_text_hint));
            }
            ChatAiFragment.this.hideVoiceView();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFailure$2() {
            ChatAiFragment.this.hideVoiceView();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVoiceTranscribe$0(String str, boolean z) {
            if (TextUtils.isEmpty(str) || ChatAiFragment.this.f24866M) {
                return;
            }
            ChatAiFragment.this.showGptText(str, false, z);
        }

        @Override // p000.C6875hk.f
        public void onClosed(final int i) {
            if (ChatAiFragment.this.getActivity() != null) {
                ChatAiFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: ex1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34340a.lambda$onClosed$1(i);
                    }
                });
            }
        }

        @Override // p000.C6875hk.f
        public void onFailure() {
            if (ChatAiFragment.this.getActivity() != null) {
                ChatAiFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: dx1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31222a.lambda$onFailure$2();
                    }
                });
            }
        }

        @Override // p000.C6875hk.f
        public void onMessage(C2337ck c2337ck) {
            if (TextUtils.equals(c2337ck.getType(), "chatMessage")) {
                ChatAiFragment.this.dealChatMsgOnRecv(c2337ck);
            }
        }

        @Override // p000.C6875hk.f
        public void onMessageBytes(byte[] bArr) {
            if (!C6875hk.getInstance().isVoiceSpeechStart() || !xja.getInstance().isPlayingHistory()) {
                MediaPlayerManager.getInstance().setContext(ChatAiFragment.this.getActivity());
                MediaPlayerManager.getInstance().addSound(bArr);
            }
            C6875hk.getInstance().cacheAudioFile(ChatAiFragment.this.f24886f2, bArr);
        }

        @Override // p000.C6875hk.f
        public void onOpen() {
            if (ChatAiFragment.this.f24875a != null) {
                ChatAiFragment.this.f24875a.setWorking(false);
            }
            ChatAiFragment.this.sendWsConfig(vfe.getInstance().getString("SP_KEY_AI_CHAT_AI_MODEL", ""));
        }

        @Override // p000.C6875hk.f
        public void onServerResponseTimeout() {
            if (ChatAiFragment.this.f24875a != null) {
                ChatAiFragment.this.f24875a.setWorking(false);
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
                if (ChatAiFragment.this.getActivity() != null) {
                    ChatAiFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: cx1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f27978a.lambda$onVoiceTranscribe$0(text, zEquals);
                        }
                    });
                }
                ChatAiFragment.this.f24882d2.removeCallbacks(ChatAiFragment.this.f24895n2);
                ChatAiFragment.this.f24882d2.postDelayed(ChatAiFragment.this.f24895n2, 1500L);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$r */
    public class C3963r implements C3994a.c {
        public C3963r() {
        }

        @Override // com.watchfun.aichat.C3994a.c
        public void onItemClick(int i, AiModelBean aiModelBean) {
            String code = aiModelBean.getCode();
            vfe.getInstance().putString("SP_KEY_AI_CHAT_AI_MODEL", code);
            vfe.getInstance().putString("SP_KEY_AI_CHAT_AI_MODEL_NAME", aiModelBean.getEnglishName());
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48490c2.setText(aiModelBean.getEnglishName());
            ChatAiFragment.this.sendWsConfig(code);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$s */
    public class C3964s extends TypeToken<List<AiModelBean>> {
        public C3964s() {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$t */
    public class C3965t implements AudioManager.OnAudioFocusChangeListener {
        public C3965t() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$u */
    public class ViewTreeObserverOnGlobalLayoutListenerC3966u implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC3966u() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ChatAiFragment.this.f24893m) {
                return;
            }
            Rect rect = new Rect();
            ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48473F.getWindowVisibleDisplayFrame(rect);
            if ((((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48473F.getHeight() - rect.bottom) + 135 > 0) {
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48473F.setTranslationY(-r1);
            } else {
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48473F.setTranslationY(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$v */
    public class ViewOnClickListenerC3967v implements View.OnClickListener {
        public ViewOnClickListenerC3967v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!ChatAiFragment.this.isAdded() || ChatAiFragment.this.isDetached() || ChatAiFragment.this.isRemoving() || mc2.isEmpty(ChatAiFragment.this.f24894m2) || ChatAiFragment.this.f24894m2.size() <= 1) {
                return;
            }
            ChatAiFragment chatAiFragment = ChatAiFragment.this;
            chatAiFragment.showAiModelDlg(chatAiFragment.f24894m2);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.ChatAiFragment$w */
    public class ViewOnClickListenerC3968w implements View.OnClickListener {
        public ViewOnClickListenerC3968w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ChatAiFragment.this.checkAndRequestPermissions()) {
                if (!ubb.isNetworkAvailable(ChatAiFragment.this.getActivity())) {
                    l3h.showToastShort(ChatAiFragment.this.getActivity(), C4201R.string.loading_no_net_view_text_hint);
                    return;
                }
                hy2 hy2Var = new hy2(ChatAiFragment.this.getContext(), vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a));
                if (ChatAiFragment.this.f24893m) {
                    ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48476M.setImageDrawable(u20.getDrawable(hy2Var, C4201R.drawable.ic_ai_voice));
                    ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48475L.setVisibility(0);
                    ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48488b2.setVisibility(8);
                    ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48495f.requestFocus();
                    ((InputMethodManager) ChatAiFragment.this.getActivity().getSystemService("input_method")).showSoftInput(((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48495f, 1);
                    ChatAiFragment.this.f24893m = false;
                    return;
                }
                ChatAiFragment.this.f24893m = true;
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48476M.setImageDrawable(u20.getDrawable(hy2Var, C4201R.drawable.ic_keyboard));
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48488b2.setVisibility(0);
                ((iu6) ((BaseFragment) ChatAiFragment.this).binding).f48475L.setVisibility(8);
                ChatAiFragment chatAiFragment = ChatAiFragment.this;
                chatAiFragment.hideSoftInputFromWindow(((iu6) ((BaseFragment) chatAiFragment).binding).f48473F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f24877b).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f24877b) {
            if (lx2.checkSelfPermission(getActivity(), str) != 0) {
                ActivityCompat.requestPermissions(getActivity(), this.f24877b, 200);
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
        this.f24886f2 = id;
        if (this.f24878b2.containsKey(id)) {
            arrayList = this.f24878b2.get(id);
            arrayList2 = this.f24880c2.get(id);
        } else {
            arrayList = new ArrayList<>();
            arrayList2 = new ArrayList<>();
            this.f24878b2.put(id, arrayList);
            this.f24880c2.put(id, arrayList2);
        }
        if (TextUtils.equals(c2337ck.getStatus(), C2337ck.f16773h)) {
            if (arrayList != null) {
                processingData(convertListToString(arrayList2), convertListToString(arrayList), id, true);
                q87 q87Var = this.f24875a;
                if (q87Var != null) {
                    q87Var.setWorking(false);
                }
                this.f24884e2 = null;
                this.f24878b2.remove(id);
                this.f24880c2.remove(id);
            }
        } else if (TextUtils.equals(c2337ck.getStatus(), C2337ck.f16772g) && arrayList != null) {
            if (!TextUtils.equals(id, this.f24887g2)) {
                getActivity().runOnUiThread(new RunnableC3956k(id));
            }
            if (!TextUtils.equals(c2337ck.getContentType(), C2337ck.f16776k)) {
                arrayList.add(c2337ck.getContent());
            } else if (arrayList2 != null) {
                arrayList2.add(c2337ck.getContent());
            }
            processingData(convertListToString(arrayList2), convertListToString(arrayList), id, false);
            q87 q87Var2 = this.f24875a;
            if (q87Var2 != null) {
                q87Var2.setWorking(true);
            }
        }
        this.f24887g2 = id;
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f24874Z1;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f24874Z1.dismiss();
            }
            this.f24874Z1 = null;
        }
    }

    private String[] findUnaskedPermissions(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (lx2.checkSelfPermission(getActivity(), str) != 0) {
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
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideVoiceView() {
        if (((iu6) this.binding).f48499i2.getVisibility() == 0) {
            getActivity().runOnUiThread(new RunnableC3957l());
        }
    }

    private void initAiChatWebSocket() {
        C6875hk.getInstance().setWebSocketListener(new C3962q());
        C6875hk.getInstance().init(getContext(), e10.f31486b, e10.f31487c, e10.f31490f);
        C6875hk.getInstance().connect();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initAiModelData(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.watchfun.aichat.ChatAiFragment.initAiModelData(java.lang.String):void");
    }

    private void initLanguage() {
        TransLanguageData transLanguageData = getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90942a0));
        this.f24876a2 = transLanguageData;
        if (transLanguageData != null) {
            ((iu6) this.binding).f48500m.setText(AiLangUtil.getValue(getActivity(), this.f24876a2.getKeyName()));
            return;
        }
        TransLanguageData transLanguageData2 = new TransLanguageData();
        this.f24876a2 = transLanguageData2;
        transLanguageData2.setTransId(1);
        this.f24876a2.setVoiceName("xiaoyan");
        this.f24876a2.setIatLanguage("zh-CN");
        this.f24876a2.setLangKey("zh-Hans");
        this.f24876a2.setDefaultName("中文");
        this.f24876a2.setKeyName("zh_name");
        this.f24876a2.setSelect(true);
        this.f24876a2.setUseMicTTS(true);
        ((iu6) this.binding).f48500m.setText(C4201R.string.ai_trans_zh);
        vfe.getInstance().putString(vfe.C14037b.f90942a0, TransLanguageData.toJson(this.f24876a2));
    }

    @igg({"ClickableViewAccessibility"})
    private void initUI() {
        initAiModelData(t77.f83944w);
        if (t77.f83945x) {
            ((iu6) this.binding).f48480V1.setVisibility(8);
        } else {
            ((iu6) this.binding).f48480V1.setVisibility(8);
        }
        this.f24882d2 = new Handler();
        ((iu6) this.binding).f48486a2.setSelected(vfe.getInstance().getBoolean("SP_KEY_AI_CHAT_ONLINE_SEARCH", false));
        this.f24864H = new GptAiAudioFilePresenter(this);
        this.f24879c = new GptCompletionsPresenter(this);
        this.f24865L = new TalkNetManager();
        this.f24873Z = (AudioManager) getActivity().getSystemService("audio");
        this.f24873Z.requestAudioFocus(new C3965t(), 3, 1);
        initLanguage();
        MediaPlayerManager.getInstance().init();
        initAiChatWebSocket();
        this.f24885f = GPTMessageDatabase.getDatabase(getActivity()).messageDao();
        ((iu6) this.binding).f48487b.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.f24875a = new q87(getActivity(), ((iu6) this.binding).f48487b);
        List<b27> latestTen = this.f24885f.getLatestTen();
        if (mc2.isEmpty(latestTen)) {
            ((iu6) this.binding).f48484Z1.setVisibility(0);
            ((iu6) this.binding).f48492d2.setVisibility(8);
        } else {
            Collections.reverse(latestTen);
            this.f24875a.setData(latestTen, false, false);
            T t = this.binding;
            ((iu6) t).f48487b.scrollToPosition(((iu6) t).f48487b.getAdapter().getItemCount() - 1);
            ((iu6) this.binding).f48484Z1.setVisibility(8);
            ((iu6) this.binding).f48492d2.setVisibility(0);
        }
        ((iu6) this.binding).f48473F.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3966u());
        ((iu6) this.binding).f48480V1.setOnClickListener(new ViewOnClickListenerC3967v());
        ((iu6) this.binding).f48476M.setOnClickListener(new ViewOnClickListenerC3968w());
        ((iu6) this.binding).f48486a2.setOnClickListener(new ViewOnClickListenerC3946a());
        ((iu6) this.binding).f48488b2.setOnClickListener(new ViewOnClickListenerC3947b());
        ((iu6) this.binding).f48499i2.setOnClickListener(new ViewOnClickListenerC3948c());
        ((iu6) this.binding).f48478N.setOnClickListener(new ViewOnClickListenerC3949d());
        MediaPlayerManager.getInstance().setPlayListener(new C3950e());
        AudioPlayerManager.getInstance().setAudioPlayerListener(this);
        this.f24875a.setItemClickListener(new C3951f());
        ((iu6) this.binding).f48489c.setOnEditClickListener(new C3952g());
        ((iu6) this.binding).f48492d2.setOnClickListener(new ViewOnClickListenerC3953h());
        ((iu6) this.binding).f48500m.setOnClickListener(new ViewOnClickListenerC3954i());
    }

    private boolean isUseMicrosoft() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(bxg bxgVar) {
        if (bxgVar.f15188a == 1) {
            updateTheme();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAudioPlaybackCompleted$1() {
        this.f24868N = false;
        this.f24862C = false;
        b27 b27Var = this.f24872Y;
        if (b27Var != null) {
            b27Var.setPause(false);
            this.f24875a.updateMessage(this.f24872Y, this.f24871X);
        }
    }

    public static ChatAiFragment newInstance() {
        return new ChatAiFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWsConfig(String str) {
        C7323ik c7323ik = new C7323ik();
        c7323ik.setCommand("config");
        c7323ik.setSourceLanguage(this.f24876a2.getIatLanguage());
        c7323ik.setSampleRate(44100);
        c7323ik.setAiModel(str);
        C6875hk.getInstance().sendConfig(c7323ik);
    }

    private void setListener() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAiModelDlg(List<AiModelBean> list) {
        C3994a c3994a = new C3994a(getActivity(), (ViewGroup) getActivity().findViewById(android.R.id.content));
        c3994a.setData(list);
        c3994a.setListener(new C3963r());
        int[] iArr = new int[2];
        ((iu6) this.binding).f48480V1.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = (((iu6) this.binding).f48480V1.getWidth() - c3994a.getWidth()) / 2;
        c3994a.showAtLocation(((iu6) this.binding).f48480V1, 0, i + width, i2 + ((iu6) this.binding).f48480V1.getHeight() + ((int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGptText(String str, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str) || z) {
            if (!z) {
                this.f24888h2 = this.f24889i2 + str;
                if (z2) {
                    this.f24889i2 += str;
                }
                ((iu6) this.binding).f48497g2.setText(this.f24888h2);
                return;
            }
            String strReplace = str.replace("\n", "");
            hideSoftInputFromWindow(((iu6) this.binding).f48473F);
            MediaPlayerManager.getInstance().stopAndClearData();
            List<C2133c.b> historyRecentMSg = this.f24875a.getHistoryRecentMSg();
            showSendTextListAdapter(strReplace);
            MediaPlayerManager.getInstance().readyToPlayInRealTime();
            C6875hk.getInstance().setVoiceSpeechStart(false);
            this.f24882d2.postDelayed(new RunnableC3960o(historyRecentMSg, strReplace), 200L);
            ((iu6) this.binding).f48495f.setText("");
            ((iu6) this.binding).f48497g2.setText("");
            ((iu6) this.binding).f48487b.smoothScrollToPosition(((iu6) r3).f48487b.getAdapter().getItemCount() - 1);
            this.f24888h2 = "";
            this.f24889i2 = "";
        }
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f24874Z1 == null) {
            this.f24874Z1 = new PermissionExplanationDialog(getActivity(), new C3958m());
        }
        if (this.f24874Z1.isShowing()) {
            return;
        }
        this.f24874Z1.show();
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
        this.f24885f.insert(b27Var);
        arrayList.add(b27Var);
        this.f24875a.setData(arrayList, false, true);
        T t = this.binding;
        ((iu6) t).f48487b.smoothScrollToPosition(((iu6) t).f48487b.getAdapter().getItemCount() - 1);
        ((iu6) this.binding).f48484Z1.setVisibility(8);
        ((iu6) this.binding).f48492d2.setVisibility(0);
        this.f24875a.setWorking(true);
    }

    private void showVoice() {
        getActivity().runOnUiThread(new RunnableC3955j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showVoiceView() {
        showVoice();
        stopPlay();
        AudioPlayerManager.getInstance().stopAudio();
        C6875hk.getInstance().sendStartVoiceCmd();
    }

    private void stopPlay() {
        b27 b27Var = this.f24872Y;
        if (b27Var != null && this.f24875a != null) {
            b27Var.setPause(false);
            this.f24862C = false;
            this.f24868N = true;
            this.f24875a.updateMessage(this.f24872Y, this.f24871X);
        }
        AudioPlayerManager.getInstance().stopAudio();
        MediaPlayerManager.getInstance().stopAndClearData();
    }

    private void updateIcons(Context context) {
        T t = this.binding;
        if (t == 0) {
            return;
        }
        ((iu6) t).f48476M.setImageDrawable(u20.getDrawable(context, this.f24893m ? C4201R.drawable.ic_ai_voice : C4201R.drawable.ic_keyboard));
        gxg.invalidateView(((iu6) this.binding).f48476M);
        ((iu6) this.binding).f48474H.setImageDrawable(gxg.resolveThemeDrawable(context, C4201R.attr.aiEmptyIcon));
        gxg.invalidateView(((iu6) this.binding).f48474H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewScrollPosition() {
        ((iu6) this.binding).f48487b.smoothScrollToPosition((((((iu6) this.binding).f48487b.getMeasuredHeight() == 0 || ((iu6) this.binding).f48487b.getLayoutManager().getItemCount() == 0) ? 20 : ((iu6) this.binding).f48487b.getMeasuredHeight() / ((iu6) this.binding).f48487b.getLayoutManager().getItemCount()) / 60) + 100);
    }

    private void updateTheme() {
        hy2 hy2Var = new hy2(getContext(), vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a));
        updateViewColors(hy2Var, gxg.resolveThemeColor(hy2Var, C4201R.attr.imgbg));
        updateIcons(hy2Var);
        this.f24875a.notifyDataSetChanged();
    }

    private void updateViewColors(Context context, int i) {
        T t = this.binding;
        if (t == 0) {
            return;
        }
        ((iu6) t).f48472C.setTextColor(i);
        gxg.invalidateView(((iu6) this.binding).f48472C);
        gxg.updateStrokeColor(context, ((iu6) this.binding).f48488b2, i, C4201R.dimen.dp_1);
        gxg.applyTintToBackground(((iu6) this.binding).f48494e2, i);
        gxg.applyTintToBackground(((iu6) this.binding).f48482Y, i);
        gxg.applyTintToBackground(((iu6) this.binding).f48479Q, i);
        gxg.applyTintToBackground(((iu6) this.binding).f48492d2, i);
    }

    private void voiceViewGone() {
        hideVoiceView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void voiceViewGptGone() {
        AudioRecorder.getInstance().stopRecord();
        C6875hk.getInstance().sendStopVoiceCmd();
        this.f24864H.refreshData(this.f24865L.stopRecordAndUpload(getActivity()), ufh.f87916c);
        String string = ((iu6) this.binding).f48497g2.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            showGptText(string, true, false);
        }
        voiceViewGone();
    }

    public void dismissLoadingView() {
        CustomLoadingDialog customLoadingDialog = this.f24892l2;
        if (customLoadingDialog != null) {
            customLoadingDialog.dismiss();
        }
    }

    @Override // com.watchfun.base.BaseFragment, p000.wu0
    public String getPageName() {
        return "ai";
    }

    @Override // com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        zgb.defaultCenter().subscriber(bxg.class, this.f24896o2);
        initUI();
        setListener();
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTTextToAudioView
    public void loadAudioListSuccess(File file) {
        AudioPlayerManager.getInstance().playAudioFile(this.f24873Z, file, 1);
    }

    @Override // com.watchfun.base.BaseFragment
    public void loadData() {
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
        this.f24885f.insert(b27Var);
    }

    @Override // com.watchfun.transcommon.gpt.GPTContract.AiGPTAudioView
    public void loadRecListSuccess(String str, boolean z, boolean z2, boolean z3) {
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
    }

    @Override // com.watchfun.transcommon.manager.trans.AudioPlayerManager.AudioPlayerListener
    public void onAudioPlaybackCompleted() {
        getActivity().runOnUiThread(new Runnable() { // from class: ax1
            @Override // java.lang.Runnable
            public final void run() {
                this.f12056a.lambda$onAudioPlaybackCompleted$1();
            }
        });
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(@efb LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        yi9.m26090d(f24860p2, "onDestory");
        Handler handler = this.f24882d2;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        zgb.defaultCenter().unsubscribe(bxg.class, this.f24896o2);
        AudioRecorder.getInstance().stopRecord();
        C6875hk.getInstance().release();
        MediaPlayerManager.getInstance().release();
        AudioPlayerManager.getInstance().stopAudio();
    }

    @Override // com.watchfun.base.LazyLoadFragment
    public void onFragmentPause() {
        super.onFragmentPause();
        AudioRecorder.getInstance().stopRecord();
        C6875hk.getInstance().sendStopVoiceCmd();
        voiceViewGone();
        stopPlay();
        this.f24866M = true;
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentResume() {
        super.onFragmentResume();
        initLanguage();
        sendWsConfig(vfe.getInstance().getString("SP_KEY_AI_CHAT_AI_MODEL", ""));
        this.f24866M = false;
    }

    @Override // com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        voiceViewGone();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @efb String[] strArr, @efb int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        yi9.m26090d(f24860p2, "onRequestPermissionsResult =" + i);
        if (i == 200) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    l3h.showToastShort(getActivity(), C4201R.string.permission_system_set);
                    return;
                }
            }
            vfe.getInstance().putBoolean("SP_KEY_PERMISSIONSGRANTED", true);
        }
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
        this.f24884e2 = b27Var;
        this.f24882d2.postDelayed(new RunnableC3959n(str3, b27Var), 900L);
    }

    public void showLoadingView() {
        if (this.f24892l2 == null) {
            this.f24892l2 = new CustomLoadingDialog(getActivity());
        }
        this.f24892l2.show();
    }

    @Override // com.watchfun.base.BaseFragment
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public iu6 provideViewBinding(ViewGroup viewGroup) {
        return iu6.inflate(getLayoutInflater(), viewGroup, false);
    }
}
