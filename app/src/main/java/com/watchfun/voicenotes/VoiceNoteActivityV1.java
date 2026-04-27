package com.watchfun.voicenotes;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2474g;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.manager.p013ai.MediaHelper;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.voicenotes.bean.SaveVoiceNoteResp;
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
import p000.C14003vd;
import p000.C9389ml;
import p000.DialogC5869fl;
import p000.a1h;
import p000.aqa;
import p000.bqa;
import p000.dc2;
import p000.efb;
import p000.g3c;
import p000.ihg;
import p000.jei;
import p000.jhg;
import p000.k3c;
import p000.khg;
import p000.l3h;
import p000.lhg;
import p000.lx2;
import p000.mdi;
import p000.mt0;
import p000.qt5;
import p000.toc;
import p000.u2c;
import p000.ufi;
import p000.vfe;
import p000.xnc;
import p000.xrf;
import p000.yfb;

/* JADX INFO: loaded from: classes7.dex */
public class VoiceNoteActivityV1 extends BaseActivity<C14003vd> implements MediaHelper.OnMediaKeyEvent, jei.InterfaceC7889b, qt5.InterfaceC11687f {

    /* JADX INFO: renamed from: c2 */
    public static final String f26365c2 = "VoiceNoteActivityV2";

    /* JADX INFO: renamed from: C */
    public Jl_Dialog f26366C;

    /* JADX INFO: renamed from: F */
    public AudioManager f26367F;

    /* JADX INFO: renamed from: H */
    public dc2 f26368H;

    /* JADX INFO: renamed from: L */
    public Handler f26369L;

    /* JADX INFO: renamed from: M */
    public qt5 f26370M;

    /* JADX INFO: renamed from: M1 */
    public int f26371M1;

    /* JADX INFO: renamed from: N */
    public VoiceNotesBean f26372N;

    /* JADX INFO: renamed from: Q */
    public k3c f26373Q;

    /* JADX INFO: renamed from: V1 */
    public DialogC5869fl f26374V1;

    /* JADX INFO: renamed from: X */
    public boolean f26375X;

    /* JADX INFO: renamed from: Y */
    public boolean f26376Y;

    /* JADX INFO: renamed from: Z */
    public VoiceNotesBean f26377Z;

    /* JADX INFO: renamed from: a2 */
    public DialogC5869fl f26380a2;

    /* JADX INFO: renamed from: b */
    public aqa f26381b;

    /* JADX INFO: renamed from: b2 */
    public DialogRecordEditNewFragment f26382b2;

    /* JADX INFO: renamed from: c */
    public VoiceNotesDao f26383c;

    /* JADX INFO: renamed from: d */
    public toc f26384d;

    /* JADX INFO: renamed from: e */
    public ufi f26385e;

    /* JADX INFO: renamed from: f */
    public TransLanguageData f26386f;

    /* JADX INFO: renamed from: m */
    public String f26387m;

    /* JADX INFO: renamed from: a */
    public List<VoiceNotesBean> f26379a = new ArrayList();

    /* JADX INFO: renamed from: Z1 */
    public String[] f26378Z1 = {xnc.f98582G};

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$a */
    public class C4334a implements Comparator<VoiceNotesBean> {
        public C4334a() {
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

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$b */
    public class C4335b implements khg {
        public C4335b() {
        }

        @Override // p000.khg
        public void onCreateMenu(ihg ihgVar, ihg ihgVar2, int i) {
            lhg lhgVar = new lhg(VoiceNoteActivityV1.this);
            lhgVar.setImage(C4297R.drawable.ic_voice_note_list_edit);
            lhgVar.setWidth(xrf.dp2px(48.0f));
            lhgVar.setHeight(xrf.dp2px(120.0f));
            lhg lhgVar2 = new lhg(VoiceNoteActivityV1.this);
            lhgVar2.setWidth(xrf.dp2px(12.0f));
            lhg lhgVar3 = new lhg(VoiceNoteActivityV1.this);
            lhgVar3.setImage(C4297R.drawable.ic_voice_note_list_del);
            lhgVar3.setWidth(xrf.dp2px(48.0f));
            lhgVar3.setHeight(xrf.dp2px(120.0f));
            ihgVar2.addMenuItem(lhgVar);
            ihgVar2.addMenuItem(lhgVar2);
            ihgVar2.addMenuItem(lhgVar3);
            lhg lhgVar4 = new lhg(VoiceNoteActivityV1.this);
            lhgVar4.setWidth(xrf.dp2px(17.0f));
            ihgVar2.addMenuItem(lhgVar4);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$c */
    public class C4336c implements bqa.InterfaceC2001a {
        public C4336c() {
        }

        @Override // p000.bqa.InterfaceC2001a
        public void onDel(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDel: ");
            sb.append(i);
            VoiceNoteActivityV1.this.showDelDialog(i);
        }

        @Override // p000.bqa.InterfaceC2001a
        public void onEdit(int i) {
            VoiceNotesBean voiceNotesBean = (VoiceNotesBean) VoiceNoteActivityV1.this.f26379a.get(i);
            VoiceNoteActivityV1.this.f26377Z = voiceNotesBean;
            VoiceNoteActivityV1.this.f26371M1 = i;
            VoiceNoteActivityV1.this.showReNameDialog(voiceNotesBean, i);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$d */
    public class C4337d implements k3c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bqa.InterfaceC2001a f26391a;

        public C4337d(bqa.InterfaceC2001a interfaceC2001a) {
            this.f26391a = interfaceC2001a;
        }

        @Override // p000.k3c
        public void onItemClick(jhg jhgVar, int i) {
            jhgVar.closeMenu();
            if (jhgVar.getDirection() == -1) {
                int position = jhgVar.getPosition();
                if (position == 2) {
                    this.f26391a.onDel(i);
                } else if (position == 0) {
                    this.f26391a.onEdit(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$e */
    public class C4338e implements dc2.InterfaceC4732a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f26393a;

        public C4338e(int i) {
            this.f26393a = i;
        }

        @Override // p000.dc2.InterfaceC4732a
        public void onOk() {
            VoiceNotesBean voiceNotesBean = (VoiceNotesBean) VoiceNoteActivityV1.this.f26379a.get(this.f26393a);
            VoiceNoteActivityV1.this.f26379a.remove(this.f26393a);
            VoiceNoteActivityV1.this.f26381b.setList(VoiceNoteActivityV1.this.f26379a);
            String recordPath = voiceNotesBean.getRecordPath();
            if (!TextUtils.isEmpty(recordPath)) {
                File file = new File(recordPath);
                if (file.exists()) {
                    file.delete();
                }
            }
            VoiceNoteActivityV1.this.f26383c.deleteMeetInfo(voiceNotesBean);
            if (VoiceNoteActivityV1.this.f26379a.isEmpty()) {
                ((C14003vd) ((BaseActivity) VoiceNoteActivityV1.this).binding).f90701b.setVisibility(0);
            } else {
                ((C14003vd) ((BaseActivity) VoiceNoteActivityV1.this).binding).f90701b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$f */
    public class C4339f implements g3c {
        public C4339f() {
        }

        @Override // p000.g3c
        public void onItemClick(@efb mt0<?, ?> mt0Var, @efb View view, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onItemClick: ");
            sb.append(((VoiceNotesBean) VoiceNoteActivityV1.this.f26379a.get(i)).getRecordPath());
            VoiceNoteActivityV1 voiceNoteActivityV1 = VoiceNoteActivityV1.this;
            voiceNoteActivityV1.f26372N = (VoiceNotesBean) voiceNoteActivityV1.f26379a.get(i);
            VoiceNoteActivityV1 voiceNoteActivityV12 = VoiceNoteActivityV1.this;
            voiceNoteActivityV12.checkToConvertBeforeOpenDetail(voiceNoteActivityV12.f26372N);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$g */
    public class C4340g implements mdi.InterfaceC9323c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Long f26396a;

        public C4340g(Long l) {
            this.f26396a = l;
        }

        @Override // p000.mdi.InterfaceC9323c
        public void onFail() {
            VoiceNoteActivityV1.this.dismissAudioFormatLoading();
        }

        @Override // p000.mdi.InterfaceC9323c
        public void onSuccess(String str) {
            VoiceNoteActivityV1.this.dismissAudioFormatLoading();
            StringBuilder sb = new StringBuilder();
            sb.append("转换mp3成功: ");
            sb.append(str);
            if (VoiceNoteActivityV1.this.isDestroyed() || VoiceNoteActivityV1.this.isFinishing()) {
                return;
            }
            Intent intent = new Intent(VoiceNoteActivityV1.this, (Class<?>) VoiceNoteRecordDetailActivity.class);
            intent.putExtra("mid", this.f26396a);
            VoiceNoteActivityV1.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$h */
    public class C4341h implements AudioManager.OnAudioFocusChangeListener {
        public C4341h() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$i */
    public class C4342i implements ufi.InterfaceC13534b {
        public C4342i() {
        }

        @Override // p000.ufi.InterfaceC13534b
        public void onLanguageSelect() {
            VoiceNoteActivityV1 voiceNoteActivityV1 = VoiceNoteActivityV1.this;
            voiceNoteActivityV1.startToSelectTransActivity(voiceNoteActivityV1.f26387m);
        }

        @Override // p000.ufi.InterfaceC13534b
        public void onSure(String str) {
            Intent intent = new Intent(VoiceNoteActivityV1.this, (Class<?>) RecordActivity.class);
            intent.putExtra("noteName", str);
            intent.putExtra(RecordActivity.f26233g2, VoiceNoteActivityV1.this.f26376Y);
            intent.putExtra(RecordActivity.f26232f2, VoiceNoteActivityV1.this.f26375X);
            VoiceNoteActivityV1.this.startActivity(intent);
            VoiceNoteActivityV1.this.f26385e.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivityV1$j */
    public class C4343j implements PermissionExplanationDialog.OnClickListListener {
        public C4343j() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            VoiceNoteActivityV1.this.checkPermission();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            Toast.makeText(VoiceNoteActivityV1.this, C4297R.string.ai_voice_note_permission_tip5, 0).show();
        }
    }

    private void audioStopMusic() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.f26367F = audioManager;
        if (audioManager != null) {
            audioManager.setMode(0);
            this.f26367F.setSpeakerphoneOn(false);
        }
        this.f26367F.requestAudioFocus(new C4341h(), 3, 1);
        sendPauseKeyEvent(this.f26367F);
    }

    private boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f26378Z1).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f26378Z1) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                ActivityCompat.requestPermissions(this, this.f26378Z1, 200);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkToConvertBeforeOpenDetail(VoiceNotesBean voiceNotesBean) {
        String recordPath = voiceNotesBean.getRecordPath();
        if (TextUtils.isEmpty(recordPath) || !new File(recordPath).exists() || new File(recordPath).length() == 0) {
            return;
        }
        Long l = voiceNotesBean.mid;
        if (recordPath.endsWith(".mp3")) {
            Intent intent = new Intent(this, (Class<?>) VoiceNoteRecordDetailActivity.class);
            intent.putExtra("mid", l);
            startActivity(intent);
        } else {
            if (mdi.isConverting(recordPath)) {
                return;
            }
            showAudioFormatLoading();
            File file = new File(recordPath);
            String strReplace = file.getName().replace(".pcm", "");
            mdi.convertPCMToMP3(this, l.longValue(), recordPath, new File(file.getParentFile(), strReplace + ".mp3").getAbsolutePath(), 44100, new C4340g(l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: ydi
            @Override // java.lang.Runnable
            public final void run() {
                this.f101275a.lambda$dismissAudioFormatLoading$3();
            }
        });
    }

    private void dismissNotifyDialog() {
        Jl_Dialog jl_Dialog = this.f26366C;
        if (jl_Dialog != null) {
            if (jl_Dialog.isShow() && !isDestroyed()) {
                this.f26366C.dismiss();
            }
            this.f26366C = null;
        }
    }

    private void dismissPermissionExplanationDialog() {
        toc tocVar = this.f26384d;
        if (tocVar != null) {
            if (tocVar.isShowing()) {
                this.f26384d.dismiss();
            }
            this.f26384d = null;
        }
    }

    private void findMeeting() {
        List<VoiceNotesBean> all = this.f26383c.getAll();
        if (all.isEmpty()) {
            this.f26379a.clear();
            ((C14003vd) this.binding).f90701b.setVisibility(0);
        } else {
            ((C14003vd) this.binding).f90701b.setVisibility(8);
            this.f26379a.clear();
            this.f26379a.addAll(all);
        }
        List<VoiceNotesBean> list = this.f26379a;
        if (list != null && !list.isEmpty()) {
            for (VoiceNotesBean voiceNotesBean : this.f26379a) {
                StringBuilder sb = new StringBuilder();
                sb.append("MeetingBean createTime: ");
                sb.append(voiceNotesBean.getCreateTime());
            }
            Collections.sort(this.f26379a, new C4334a());
        }
        this.f26381b.setList(this.f26379a);
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

    private void initLanguage() {
        TransLanguageData transLanguageData = AppUtils.getTransLanguageData(vfe.getInstance().getString("language_voice_notes"));
        this.f26386f = transLanguageData;
        if (transLanguageData != null) {
            this.f26387m = AiLangUtil.getValue(this, transLanguageData.getKeyName());
        } else {
            TransLanguageData transLanguageData2 = new TransLanguageData();
            this.f26386f = transLanguageData2;
            transLanguageData2.setTransId(1);
            this.f26386f.setDefaultName("中文");
            this.f26386f.setSelect(true);
            this.f26386f.setVoiceName("xiaoyan");
            this.f26386f.setIatLanguage("zh-CN");
            this.f26386f.setLangKey("zh-Hans");
            this.f26386f.setUseMicTTS(true);
            this.f26386f.setKeyName("zh_name");
            vfe.getInstance().putString("language_voice_notes", TransLanguageData.toJson(this.f26386f));
            this.f26387m = "中文";
        }
        ufi ufiVar = this.f26385e;
        if (ufiVar != null) {
            ufiVar.setLanguage(this.f26387m);
        }
    }

    private void initSwipeRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        ((C14003vd) this.binding).f90705f.setSwipeMenuCreator(new C4335b());
        C4337d c4337d = new C4337d(new C4336c());
        this.f26373Q = c4337d;
        ((C14003vd) this.binding).f90705f.setOnItemMenuClickListener(c4337d);
        this.f26381b = new aqa(C4297R.layout.item_meeting_info_layout_v1);
        ((C14003vd) this.binding).f90705f.setLayoutManager(linearLayoutManager);
        ((C14003vd) this.binding).f90705f.setAdapter(this.f26381b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissAudioFormatLoading$3() {
        DialogC5869fl dialogC5869fl = this.f26374V1;
        if (dialogC5869fl == null || !dialogC5869fl.isShowing()) {
            return;
        }
        this.f26374V1.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        toMeeting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAudioFormatLoading$2() {
        if (this.f26374V1 == null) {
            this.f26374V1 = new DialogC5869fl(this, getResources().getString(C4297R.string.ai_voice_note_record_audio_format_tips));
        }
        if (this.f26374V1.isShowing()) {
            return;
        }
        this.f26374V1.show();
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
    public /* synthetic */ void lambda$showReNameDialog$6(int i, String str, String str2) {
        VoiceNotesBean voiceNotesBean = this.f26379a.get(i);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        voiceNotesBean.setTitle(str);
        this.f26383c.updateMeetInfo(voiceNotesBean);
        this.f26381b.setList(this.f26379a);
        this.f26381b.notifyItemChanged(i);
        ToastUtils.showShort(getString(C4201R.string.save_success));
    }

    private void showAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: vdi
            @Override // java.lang.Runnable
            public final void run() {
                this.f90756a.lambda$showAudioFormatLoading$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDelDialog(int i) {
        dc2 dc2Var = new dc2(this, new C4338e(i));
        this.f26368H = dc2Var;
        dc2Var.setTitle(getString(C4297R.string.ai_voice_note_del_voice_note_confirm));
        this.f26368H.show();
    }

    private void showNotifyDialog() {
        if (isFinishing() || isFinishing()) {
            return;
        }
        if (this.f26366C == null) {
            this.f26366C = new Jl_Dialog.Builder().title(getString(C4297R.string.ai_voice_note_permission)).content(getString(C4297R.string.ai_voice_note_string_notify_permission)).cancel(true).left(getString(C4297R.string.ai_voice_note_cancel)).right(getString(C4297R.string.ai_voice_note_to_setting)).leftClickListener(new Jl_Dialog.InterfaceC4383c() { // from class: wdi
                @Override // com.watchfun.voicenotes.widget.Jl_Dialog.InterfaceC4383c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f94013a.lambda$showNotifyDialog$4(view, dialogFragment);
                }
            }).rightClickListener(new Jl_Dialog.InterfaceC4383c() { // from class: xdi
                @Override // com.watchfun.voicenotes.widget.Jl_Dialog.InterfaceC4383c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f97572a.lambda$showNotifyDialog$5(view, dialogFragment);
                }
            }).build();
        }
        if (this.f26366C.isShow()) {
            return;
        }
        this.f26366C.show(getSupportFragmentManager(), "notify_dialogs");
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f26384d == null) {
            this.f26384d = new toc(this, new C4343j());
        }
        if (this.f26384d.isShowing()) {
            return;
        }
        this.f26384d.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showReNameDialog(VoiceNotesBean voiceNotesBean, final int i) {
        DialogRecordEditNewFragment dialogRecordEditNewFragment = this.f26382b2;
        if (dialogRecordEditNewFragment == null || !dialogRecordEditNewFragment.isShow()) {
            final String strShowDateToStr = a1h.ShowDateToStr(System.currentTimeMillis());
            DialogRecordEditNewFragment dialogRecordEditNewFragment2 = DialogRecordEditNewFragment.getInstance(TextUtils.isEmpty(voiceNotesBean.getTitle()) ? strShowDateToStr : voiceNotesBean.getTitle());
            this.f26382b2 = dialogRecordEditNewFragment2;
            showDialogFragment(dialogRecordEditNewFragment2);
            this.f26382b2.setOnEventEditDialog(new u2c() { // from class: zdi
                @Override // p000.u2c
                public final void onInput(String str) {
                    this.f104869a.lambda$showReNameDialog$6(i, strShowDateToStr, str);
                }
            });
        }
    }

    private void showStartVoiceNotesDialog() {
        if (this.f26385e == null) {
            this.f26385e = new ufi(this, new C4342i());
        }
        if (this.f26385e.isShowing()) {
            return;
        }
        this.f26385e.show();
        this.f26385e.setLanguage(this.f26387m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startToSelectTransActivity(String str) {
        Intent intent = new Intent(this, (Class<?>) SelectTransActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SelectTransActivity.KEY_TITLE, str);
        bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, "");
        bundle.putInt(SelectTransActivity.KEY_TYPE, 1);
        bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, 6);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void toMeeting() {
        if (checkAndRequestPermissions()) {
            if (C2474g.areNotificationsEnabled()) {
                showStartVoiceNotesDialog();
            } else {
                showNotifyDialog();
            }
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C14003vd getViewBinding() {
        return C14003vd.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: E */
    public void m8474E(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }

    public void dismissLoadingView() {
        DialogC5869fl dialogC5869fl = this.f26380a2;
        if (dialogC5869fl != null) {
            dialogC5869fl.dismiss();
        }
    }

    @Override // com.watchfun.base.BaseActivity
    public void initData() {
        super.initData();
        this.f26383c = VoiceNotesDatabase.getDatabase(this).messageDao();
        this.f26375X = getIntent().getBooleanExtra(RecordActivity.f26232f2, false);
        this.f26376Y = getIntent().getBooleanExtra(RecordActivity.f26233g2, false);
        qt5 qt5Var = qt5.getInstance(this);
        this.f26370M = qt5Var;
        qt5Var.addListener(this);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        this.f26369L = new Handler();
        m8474E(this);
        initSwipeRecycleView();
        ((C14003vd) this.binding).f90704e.setOnClickListener(new View.OnClickListener() { // from class: tdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84373a.lambda$initView$0(view);
            }
        });
        ((C14003vd) this.binding).f90702c.setOnClickListener(new View.OnClickListener() { // from class: udi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87763a.lambda$initView$1(view);
            }
        });
        audioStopMusic();
        this.f26381b.setOnItemClickListener(new C4339f());
    }

    @Override // p000.qt5.InterfaceC11687f
    public void onCancelled(@yfb String str) {
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qt5 qt5Var = this.f26370M;
        if (qt5Var != null) {
            qt5Var.removeListener(this);
        }
        Handler handler = this.f26369L;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        dc2 dc2Var = this.f26368H;
        if (dc2Var != null) {
            dc2Var.dismiss();
        }
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
        initLanguage();
        findMeeting();
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
    }

    @Override // p000.jei.InterfaceC7889b
    public void saveVoiceNoteFail() {
    }

    @Override // p000.jei.InterfaceC7889b
    public void saveVoiceNoteSuccess(SaveVoiceNoteResp saveVoiceNoteResp) {
    }

    public void showLoadingView() {
        if (this.f26380a2 == null) {
            this.f26380a2 = new DialogC5869fl(this);
        }
        this.f26380a2.show();
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
        this.f26383c.updateMeetInfo(this.f26377Z);
        this.f26381b.setList(this.f26379a);
        this.f26381b.notifyItemChanged(this.f26371M1);
        ToastUtils.showShort(getString(C4297R.string.save_success));
    }
}
