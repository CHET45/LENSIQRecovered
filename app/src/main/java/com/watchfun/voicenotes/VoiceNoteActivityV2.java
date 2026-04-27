package com.watchfun.voicenotes;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2474g;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.voicenotes.api.AiVoiceNoteApi;
import com.watchfun.voicenotes.bean.BleConnectStatusEvent;
import com.watchfun.voicenotes.bean.SaveVoiceNoteReq;
import com.watchfun.voicenotes.bean.SaveVoiceNoteResp;
import com.watchfun.voicenotes.bean.UpdateNoteTitleReq;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import com.watchfun.voicenotes.widget.DialogRecordEditNewFragment;
import com.watchfun.voicenotes.widget.Jl_Dialog;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.C12269rt;
import p000.C14552wd;
import p000.C9389ml;
import p000.DialogC5869fl;
import p000.a1h;
import p000.bqa;
import p000.dc2;
import p000.efb;
import p000.g3c;
import p000.gu8;
import p000.ihg;
import p000.jei;
import p000.jhg;
import p000.k3c;
import p000.kei;
import p000.khg;
import p000.l3h;
import p000.lhg;
import p000.lx2;
import p000.mdi;
import p000.mei;
import p000.mt0;
import p000.pb9;
import p000.qt5;
import p000.qxb;
import p000.toc;
import p000.u2c;
import p000.ufh;
import p000.ufi;
import p000.vfe;
import p000.xnc;
import p000.xrf;
import p000.yfb;

/* JADX INFO: loaded from: classes7.dex */
public class VoiceNoteActivityV2 extends BaseActivity<C14552wd> implements MediaHelper.OnMediaKeyEvent, jei.InterfaceC7889b, qt5.InterfaceC11687f, qxb<Boolean> {

    /* JADX INFO: renamed from: c2 */
    public static final String f26401c2 = "VoiceNoteActivityV2";

    /* JADX INFO: renamed from: C */
    public Jl_Dialog f26402C;

    /* JADX INFO: renamed from: F */
    public AudioManager f26403F;

    /* JADX INFO: renamed from: H */
    public dc2 f26404H;

    /* JADX INFO: renamed from: L */
    public Handler f26405L;

    /* JADX INFO: renamed from: M */
    public mei f26406M;

    /* JADX INFO: renamed from: M1 */
    public int f26407M1;

    /* JADX INFO: renamed from: N */
    public qt5 f26408N;

    /* JADX INFO: renamed from: Q */
    public VoiceNotesBean f26409Q;

    /* JADX INFO: renamed from: V1 */
    public DialogRecordEditNewFragment f26410V1;

    /* JADX INFO: renamed from: X */
    public k3c f26411X;

    /* JADX INFO: renamed from: Z */
    public VoiceNotesBean f26413Z;

    /* JADX INFO: renamed from: a2 */
    public DialogC5869fl f26416a2;

    /* JADX INFO: renamed from: b */
    public bqa f26417b;

    /* JADX INFO: renamed from: b2 */
    public DialogC5869fl f26418b2;

    /* JADX INFO: renamed from: c */
    public VoiceNotesDao f26419c;

    /* JADX INFO: renamed from: d */
    public toc f26420d;

    /* JADX INFO: renamed from: e */
    public ufi f26421e;

    /* JADX INFO: renamed from: f */
    public TransLanguageData f26422f;

    /* JADX INFO: renamed from: m */
    public String f26423m;

    /* JADX INFO: renamed from: a */
    public List<VoiceNotesBean> f26415a = new ArrayList();

    /* JADX INFO: renamed from: Y */
    public boolean f26412Y = false;

    /* JADX INFO: renamed from: Z1 */
    public String[] f26414Z1 = {xnc.f98582G};

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$a */
    public class C4344a implements khg {
        public C4344a() {
        }

        @Override // p000.khg
        public void onCreateMenu(ihg ihgVar, ihg ihgVar2, int i) {
            lhg lhgVar = new lhg(VoiceNoteActivityV2.this);
            lhgVar.setImage(C4297R.drawable.ic_voice_note_list_edit);
            lhgVar.setWidth(xrf.dp2px(48.0f));
            lhgVar.setHeight(xrf.dp2px(88.0f));
            lhg lhgVar2 = new lhg(VoiceNoteActivityV2.this);
            lhgVar2.setWidth(xrf.dp2px(12.0f));
            lhg lhgVar3 = new lhg(VoiceNoteActivityV2.this);
            lhgVar3.setImage(C4297R.drawable.ic_voice_note_list_del);
            lhgVar3.setWidth(xrf.dp2px(48.0f));
            lhgVar3.setHeight(xrf.dp2px(88.0f));
            ihgVar2.addMenuItem(lhgVar);
            ihgVar2.addMenuItem(lhgVar2);
            ihgVar2.addMenuItem(lhgVar3);
            lhg lhgVar4 = new lhg(VoiceNoteActivityV2.this);
            lhgVar4.setWidth(xrf.dp2px(17.0f));
            ihgVar2.addMenuItem(lhgVar4);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$b */
    public class C4345b implements bqa.InterfaceC2001a {
        public C4345b() {
        }

        @Override // p000.bqa.InterfaceC2001a
        public void onDel(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDel: ");
            sb.append(i);
            VoiceNoteActivityV2.this.showDelDialog(i);
        }

        @Override // p000.bqa.InterfaceC2001a
        public void onEdit(int i) {
            VoiceNoteActivityV2.this.f26413Z = (VoiceNotesBean) VoiceNoteActivityV2.this.f26415a.get(i);
            VoiceNoteActivityV2.this.f26407M1 = i;
            VoiceNoteActivityV2.this.showReNameDialog();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$c */
    public class C4346c implements k3c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqa.InterfaceC2001a f26426a;

        public C4346c(bqa.InterfaceC2001a interfaceC2001a) {
            this.f26426a = interfaceC2001a;
        }

        @Override // p000.k3c
        public void onItemClick(jhg jhgVar, int i) {
            jhgVar.closeMenu();
            if (jhgVar.getDirection() == -1) {
                int position = jhgVar.getPosition();
                if (position == 2) {
                    this.f26426a.onDel(i);
                } else if (position == 0) {
                    this.f26426a.onEdit(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$d */
    public class C4347d implements dc2.InterfaceC4732a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f26428a;

        public C4347d(int i) {
            this.f26428a = i;
        }

        @Override // p000.dc2.InterfaceC4732a
        public void onOk() {
            VoiceNotesBean voiceNotesBean = (VoiceNotesBean) VoiceNoteActivityV2.this.f26415a.get(this.f26428a);
            VoiceNoteActivityV2.this.f26415a.remove(this.f26428a);
            VoiceNoteActivityV2.this.f26417b.setList(VoiceNoteActivityV2.this.f26415a);
            String recordPath = voiceNotesBean.getRecordPath();
            if (!TextUtils.isEmpty(recordPath)) {
                File file = new File(recordPath);
                if (file.exists()) {
                    file.delete();
                }
            }
            VoiceNoteActivityV2.this.f26419c.deleteMeetInfo(voiceNotesBean);
            if (VoiceNoteActivityV2.this.f26415a.isEmpty()) {
                ((C14552wd) ((BaseActivity) VoiceNoteActivityV2.this).binding).f93957b.setVisibility(0);
            } else {
                ((C14552wd) ((BaseActivity) VoiceNoteActivityV2.this).binding).f93957b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$e */
    public class C4348e implements g3c {
        public C4348e() {
        }

        @Override // p000.g3c
        public void onItemClick(@efb mt0<?, ?> mt0Var, @efb View view, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onItemClick: ");
            sb.append(((VoiceNotesBean) VoiceNoteActivityV2.this.f26415a.get(i)).getRecordPath());
            VoiceNoteActivityV2 voiceNoteActivityV2 = VoiceNoteActivityV2.this;
            voiceNoteActivityV2.f26409Q = (VoiceNotesBean) voiceNoteActivityV2.f26415a.get(i);
            if (TextUtils.isEmpty(VoiceNoteActivityV2.this.f26409Q.f26451id)) {
                VoiceNoteActivityV2.this.httpSaveVoice();
            } else {
                VoiceNoteActivityV2.this.checkToConvertBeforeOpenDetail();
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$f */
    public class C4349f implements mdi.InterfaceC9323c {
        public C4349f() {
        }

        @Override // p000.mdi.InterfaceC9323c
        public void onFail() {
            VoiceNoteActivityV2.this.dismissAudioFormatLoading();
        }

        @Override // p000.mdi.InterfaceC9323c
        public void onSuccess(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("转换mp3成功: ");
            sb.append(str);
            VoiceNoteActivityV2.this.dismissAudioFormatLoading();
            if (VoiceNoteActivityV2.this.isDestroyed() || VoiceNoteActivityV2.this.isFinishing()) {
                return;
            }
            VoiceNoteActivityV2 voiceNoteActivityV2 = VoiceNoteActivityV2.this;
            kei.toVoiceNoteDetailPage(voiceNoteActivityV2, str, voiceNoteActivityV2.f26409Q.f26451id, null);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$g */
    public class C4350g implements AudioManager.OnAudioFocusChangeListener {
        public C4350g() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$h */
    public class C4351h implements PermissionExplanationDialog.OnClickListListener {
        public C4351h() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            VoiceNoteActivityV2.this.checkPermission();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            Toast.makeText(VoiceNoteActivityV2.this, C4297R.string.ai_voice_note_permission_tip5, 0).show();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV2$i */
    public class C4352i implements Comparator<VoiceNotesBean> {
        public C4352i() {
        }

        @Override // java.util.Comparator
        public int compare(VoiceNotesBean voiceNotesBean, VoiceNotesBean voiceNotesBean2) {
            try {
                Long lValueOf = null;
                Long lValueOf2 = voiceNotesBean.getCreateTime() == null ? null : Long.valueOf(Long.parseLong(voiceNotesBean.getCreateTime()));
                if (voiceNotesBean2.getCreateTime() != null) {
                    lValueOf = Long.valueOf(Long.parseLong(voiceNotesBean2.getCreateTime()));
                }
                if (lValueOf2 != null && lValueOf != null) {
                    return lValueOf.compareTo(lValueOf2);
                }
                if (lValueOf2 == null && lValueOf == null) {
                    return 0;
                }
                return lValueOf2 == null ? 1 : -1;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0;
            }
        }
    }

    private void audioStopMusic() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f26403F = audioManager;
        if (audioManager != null) {
            audioManager.setMode(0);
            this.f26403F.setSpeakerphoneOn(false);
        }
        this.f26403F.requestAudioFocus(new C4350g(), 3, 1);
        sendPauseKeyEvent(this.f26403F);
    }

    private boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f26414Z1).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f26414Z1) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                ActivityCompat.requestPermissions(this, this.f26414Z1, 200);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkToConvertBeforeOpenDetail() {
        String recordPath = this.f26409Q.getRecordPath();
        if (TextUtils.isEmpty(recordPath) || !new File(recordPath).exists() || new File(recordPath).length() == 0) {
            return;
        }
        Long l = this.f26409Q.mid;
        if (recordPath.endsWith(".mp3")) {
            kei.toVoiceNoteDetailPage(this, recordPath, this.f26409Q.f26451id, null);
            return;
        }
        if (mdi.isConverting(recordPath)) {
            return;
        }
        showAudioFormatLoading();
        File file = new File(recordPath);
        String strReplace = file.getName().replace(".pcm", "");
        mdi.convertPCMToMP3(this, l.longValue(), recordPath, new File(file.getParentFile(), strReplace + ".mp3").getAbsolutePath(), 44100, new C4349f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: bei
            @Override // java.lang.Runnable
            public final void run() {
                this.f13596a.lambda$dismissAudioFormatLoading$7();
            }
        });
    }

    private void dismissNotifyDialog() {
        Jl_Dialog jl_Dialog = this.f26402C;
        if (jl_Dialog != null) {
            if (jl_Dialog.isShow() && !isDestroyed()) {
                this.f26402C.dismiss();
            }
            this.f26402C = null;
        }
    }

    private void dismissPermissionExplanationDialog() {
        toc tocVar = this.f26420d;
        if (tocVar != null) {
            if (tocVar.isShowing()) {
                this.f26420d.dismiss();
            }
            this.f26420d = null;
        }
    }

    private void findMeeting() {
        List<VoiceNotesBean> all = this.f26419c.getAll();
        if (all.isEmpty()) {
            this.f26415a.clear();
            ((C14552wd) this.binding).f93957b.setVisibility(0);
        } else {
            ((C14552wd) this.binding).f93957b.setVisibility(8);
            this.f26415a.clear();
            this.f26415a.addAll(all);
        }
        List<VoiceNotesBean> list = this.f26415a;
        if (list != null && !list.isEmpty()) {
            for (VoiceNotesBean voiceNotesBean : this.f26415a) {
                StringBuilder sb = new StringBuilder();
                sb.append("MeetingBean createTime: ");
                sb.append(voiceNotesBean.getCreateTime());
            }
            Collections.sort(this.f26415a, new C4352i());
        }
        this.f26417b.setList(this.f26415a);
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

    private String getVoiceNoteQaHtml() {
        return AiVoiceNoteApi.defaultVoiceNoteQaHtml + getVoiceNoteQaLanguageCode();
    }

    private String getVoiceNoteQaLanguageCode() {
        String language = C9389ml.getInstance().getLanguage();
        return (TextUtils.isEmpty(language) || language.contains("zh")) ? "zh" : ufh.f87916c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void httpSaveVoice() {
        showLoadingView();
        SaveVoiceNoteReq saveVoiceNoteReq = new SaveVoiceNoteReq();
        saveVoiceNoteReq.setTitle(this.f26409Q.getTitle());
        saveVoiceNoteReq.setLanguage(this.f26409Q.getLanguage());
        saveVoiceNoteReq.setVoiceDuration((int) this.f26409Q.getRecordTime());
        this.f26406M.saveVoiceNote(saveVoiceNoteReq);
    }

    private void initSwipeRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        ((C14552wd) this.binding).f93961f.setSwipeMenuCreator(new C4344a());
        C4346c c4346c = new C4346c(new C4345b());
        this.f26411X = c4346c;
        ((C14552wd) this.binding).f93961f.setOnItemMenuClickListener(c4346c);
        this.f26417b = new bqa(C4297R.layout.item_meeting_info_layout_v2);
        ((C14552wd) this.binding).f93961f.setLayoutManager(linearLayoutManager);
        ((C14552wd) this.binding).f93961f.setAdapter(this.f26417b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissAudioFormatLoading$7() {
        DialogC5869fl dialogC5869fl = this.f26418b2;
        if (dialogC5869fl == null || !dialogC5869fl.isShowing()) {
            return;
        }
        this.f26418b2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        toMeeting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$3(View view) {
        openAiTransQa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAudioFormatLoading$6() {
        if (this.f26418b2 == null) {
            this.f26418b2 = new DialogC5869fl(this, getResources().getString(C4297R.string.ai_voice_note_record_audio_format_tips));
        }
        if (this.f26418b2.isShowing()) {
            return;
        }
        this.f26418b2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifyDialog$4(View view, DialogFragment dialogFragment) {
        dismissNotifyDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifyDialog$5(View view, DialogFragment dialogFragment) {
        dismissNotifyDialog();
        startNotificationSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showReNameDialog$0(String str) {
        if (TextUtils.isEmpty(str)) {
            l3h.showToastShort(getResources().getString(C4297R.string.ai_voice_note_please_input_record_title));
            return;
        }
        this.f26413Z.setTitle(str);
        if (TextUtils.isEmpty(this.f26413Z.getId())) {
            updateNoteTitleSuccess();
            return;
        }
        showLoadingView();
        this.f26406M.updateNoteTitle(new UpdateNoteTitleReq(this.f26413Z.f26451id, str));
    }

    private void openAiTransQa() {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, (Class<?>) CommonWebViewActivity.class);
        bundle.putString("url", getVoiceNoteQaHtml());
        bundle.putBoolean(CommonWebViewActivity.f26191Z, false);
        intent.putExtras(bundle);
        startActivity(intent);
        this.f26412Y = true;
    }

    private void queryVoiceNodeLimitTime() {
        this.f26406M.queryVoiceNodeLimitTime();
    }

    private void setDefTransTime() {
        ((C14552wd) this.binding).f93955C.f106193m.setText(C9389ml.getInstance().getDeviceName());
        ((C14552wd) this.binding).f93955C.f106192f.setText(String.format(getResources().getString(C4297R.string.voice_note_limit_time), "-", "-"));
    }

    private void showAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: aei
            @Override // java.lang.Runnable
            public final void run() {
                this.f1271a.lambda$showAudioFormatLoading$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDelDialog(int i) {
        dc2 dc2Var = new dc2(this, new C4347d(i));
        this.f26404H = dc2Var;
        dc2Var.setTitle(getString(C4297R.string.ai_voice_note_del_voice_note_confirm));
        this.f26404H.show();
    }

    private void showNotifyDialog() {
        if (isFinishing() || isFinishing()) {
            return;
        }
        if (this.f26402C == null) {
            this.f26402C = new Jl_Dialog.Builder().title(getString(C4297R.string.ai_voice_note_permission)).content(getString(C4297R.string.ai_voice_note_string_notify_permission)).cancel(true).left(getString(C4297R.string.ai_voice_note_cancel)).right(getString(C4297R.string.ai_voice_note_to_setting)).leftClickListener(new Jl_Dialog.InterfaceC4383c() { // from class: dei
                @Override // com.watchfun.voicenotes.widget.Jl_Dialog.InterfaceC4383c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f29542a.lambda$showNotifyDialog$4(view, dialogFragment);
                }
            }).rightClickListener(new Jl_Dialog.InterfaceC4383c() { // from class: eei
                @Override // com.watchfun.voicenotes.widget.Jl_Dialog.InterfaceC4383c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f32784a.lambda$showNotifyDialog$5(view, dialogFragment);
                }
            }).build();
        }
        if (this.f26402C.isShow()) {
            return;
        }
        this.f26402C.show(getSupportFragmentManager(), "notify_dialogs");
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f26420d == null) {
            this.f26420d = new toc(this, new C4351h());
        }
        if (this.f26420d.isShowing()) {
            return;
        }
        this.f26420d.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showReNameDialog() {
        DialogRecordEditNewFragment dialogRecordEditNewFragment = this.f26410V1;
        if (dialogRecordEditNewFragment == null || !dialogRecordEditNewFragment.isShow()) {
            String strShowDateToStr = a1h.ShowDateToStr(System.currentTimeMillis());
            if (!TextUtils.isEmpty(this.f26413Z.getTitle())) {
                strShowDateToStr = this.f26413Z.getTitle();
            }
            DialogRecordEditNewFragment dialogRecordEditNewFragment2 = DialogRecordEditNewFragment.getInstance(strShowDateToStr);
            this.f26410V1 = dialogRecordEditNewFragment2;
            showDialogFragment(dialogRecordEditNewFragment2);
            this.f26410V1.setOnEventEditDialog(new u2c() { // from class: cei
                @Override // p000.u2c
                public final void onInput(String str) {
                    this.f16397a.lambda$showReNameDialog$0(str);
                }
            });
        }
    }

    private void toMeeting() {
        if (checkAndRequestPermissions()) {
            if (C2474g.areNotificationsEnabled()) {
                startActivity(new Intent(this, (Class<?>) RecordActivityV2.class));
            } else {
                showNotifyDialog();
            }
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C14552wd getViewBinding() {
        return C14552wd.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: B */
    public void m8499B(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }

    public void dismissLoadingView() {
        DialogC5869fl dialogC5869fl = this.f26416a2;
        if (dialogC5869fl != null) {
            dialogC5869fl.dismiss();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        this.f26419c = VoiceNotesDatabase.getDatabase(this).messageDao();
        qt5 qt5Var = qt5.getInstance(this);
        this.f26408N = qt5Var;
        qt5Var.addListener(this);
        pb9.get(BleConnectStatusEvent.EVENT_KEY_DISCONNECT_BT_CONNECT, Boolean.class).observe(this, this);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        m8499B(this);
        this.f26406M = new mei(this);
        this.f26405L = new Handler();
        initSwipeRecycleView();
        ((C14552wd) this.binding).f93960e.setOnClickListener(new View.OnClickListener() { // from class: fei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36337a.lambda$initView$1(view);
            }
        });
        ((C14552wd) this.binding).f93958c.setOnClickListener(new View.OnClickListener() { // from class: gei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39650a.lambda$initView$2(view);
            }
        });
        audioStopMusic();
        this.f26417b.setOnItemClickListener(new C4348e());
        setDefTransTime();
        ((C14552wd) this.binding).f93955C.f106188b.setOnClickListener(new View.OnClickListener() { // from class: hei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43347a.lambda$initView$3(view);
            }
        });
    }

    @Override // p000.qt5.InterfaceC11687f
    public void onCancelled(@yfb String str) {
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qt5 qt5Var = this.f26408N;
        if (qt5Var != null) {
            qt5Var.removeListener(this);
        }
        Handler handler = this.f26405L;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        dc2 dc2Var = this.f26404H;
        if (dc2Var != null) {
            dc2Var.dismiss();
        }
        pb9.get(BleConnectStatusEvent.EVENT_KEY_DISCONNECT_BT_CONNECT, Boolean.class).removeObserver(this);
    }

    @Override // p000.qt5.InterfaceC11687f
    public void onError(@yfb String str, @yfb String str2) {
    }

    @Override // p000.qt5.InterfaceC11687f
    public void onPaused(@yfb String str) {
    }

    @Override // p000.qt5.InterfaceC11687f
    public void onProgress(@yfb String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onProgress: ");
        sb.append(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @efb String[] strArr, @efb int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 200) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    l3h.showToastShort(getResources().getString(C4297R.string.permission_system_set));
                    return;
                }
            }
            vfe.getInstance().putBoolean("SP_KEY_PERMISSIONSGRANTED", true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f26412Y) {
            gu8.setLanguage(this);
            this.f26412Y = false;
        }
        findMeeting();
        queryVoiceNodeLimitTime();
    }

    @Override // p000.qt5.InterfaceC11687f
    public void onResumed(@yfb String str) {
    }

    @Override // p000.qt5.InterfaceC11687f
    public void onSuccess(@yfb String str, @yfb String str2) {
    }

    @Override // p000.jei.InterfaceC7889b
    public void queryVoiceNodeLimitFail() {
    }

    @Override // p000.jei.InterfaceC7889b
    public void queryVoiceNodeLimitTimeSuccess(boolean z, int i, int i2) {
        if (!z) {
            ((C14552wd) this.binding).f93955C.getRoot().setVisibility(8);
            return;
        }
        ((C14552wd) this.binding).f93955C.f106190d.setMax(i);
        ((C14552wd) this.binding).f93955C.f106190d.setProgress(i2);
        ((C14552wd) this.binding).f93955C.getRoot().setVisibility(0);
        ((C14552wd) this.binding).f93955C.f106192f.setText(String.format(getResources().getString(C4297R.string.voice_note_limit_time), i2 + "", i + ""));
    }

    @Override // p000.jei.InterfaceC7889b
    public void saveVoiceNoteFail() {
        ToastUtils.showShort(getString(C4297R.string.loading_no_net_view_text_hint));
        dismissLoadingView();
    }

    @Override // p000.jei.InterfaceC7889b
    public void saveVoiceNoteSuccess(SaveVoiceNoteResp saveVoiceNoteResp) {
        dismissLoadingView();
        try {
            this.f26409Q.setId(saveVoiceNoteResp.getId());
            this.f26419c.updateMeetInfo(this.f26409Q);
        } catch (Exception e) {
            Log.e("VoiceNoteActivityV2", "saveVoiceNoteSuccess: " + e);
        }
        checkToConvertBeforeOpenDetail();
    }

    public void showLoadingView() {
        if (this.f26416a2 == null) {
            this.f26416a2 = new DialogC5869fl(this);
        }
        this.f26416a2.show();
    }

    public void startNotificationSetting() {
        ApplicationInfo applicationInfo = getApplicationInfo();
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", applicationInfo.packageName);
            intent.putExtra("android.provider.extra.APP_PACKAGE", applicationInfo.packageName);
            intent.putExtra("app_uid", applicationInfo.uid);
            startActivity(intent);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setFlags(268435456);
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts(C12269rt.f79418l, applicationInfo.packageName, null));
            startActivity(intent2);
        }
    }

    @Override // p000.jei.InterfaceC7889b
    public void updateNoteTitleFail() {
        dismissLoadingView();
        ToastUtils.showShort(getString(C4297R.string.loading_no_net_view_text_hint));
    }

    @Override // p000.jei.InterfaceC7889b
    public void updateNoteTitleSuccess() {
        dismissLoadingView();
        this.f26419c.updateMeetInfo(this.f26413Z);
        this.f26417b.setList(this.f26415a);
        this.f26417b.notifyItemChanged(this.f26407M1);
        ToastUtils.showShort(getString(C4297R.string.save_success));
    }

    @Override // p000.qxb
    public void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            pb9.get(BleConnectStatusEvent.EVENT_KEY_SHOW_DISCONNECT_BT_CONNECT_DIALOG, Boolean.class).post(Boolean.TRUE);
            finish();
        }
    }
}
