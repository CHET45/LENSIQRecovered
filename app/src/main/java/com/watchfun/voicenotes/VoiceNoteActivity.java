package com.watchfun.voicenotes;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
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
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDao;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import com.watchfun.voicenotes.widget.DialogRecordEditNewFragment;
import com.watchfun.voicenotes.widget.DialogRecordMenuFragment;
import com.watchfun.voicenotes.widget.WatchDialog;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.C12269rt;
import p000.C12989td;
import p000.C9389ml;
import p000.DialogC5869fl;
import p000.efb;
import p000.l3h;
import p000.lx2;
import p000.mdi;
import p000.nfi;
import p000.s2c;
import p000.u2c;
import p000.ufi;
import p000.vfe;
import p000.xnc;

/* JADX INFO: loaded from: classes7.dex */
public class VoiceNoteActivity extends BaseActivity<C12989td> implements MediaHelper.OnMediaKeyEvent {

    /* JADX INFO: renamed from: C */
    public ufi f26340C;

    /* JADX INFO: renamed from: F */
    public TransLanguageData f26341F;

    /* JADX INFO: renamed from: H */
    public String f26342H;

    /* JADX INFO: renamed from: L */
    public WatchDialog f26343L;

    /* JADX INFO: renamed from: M */
    public AudioManager f26344M;

    /* JADX INFO: renamed from: N */
    public DialogC5869fl f26345N;

    /* JADX INFO: renamed from: a */
    public boolean f26347a;

    /* JADX INFO: renamed from: b */
    public boolean f26348b;

    /* JADX INFO: renamed from: d */
    public nfi f26350d;

    /* JADX INFO: renamed from: f */
    public VoiceNotesDao f26352f;

    /* JADX INFO: renamed from: m */
    public PermissionExplanationDialog f26353m;

    /* JADX INFO: renamed from: c */
    public List<VoiceNotesBean> f26349c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f26351e = 10086;

    /* JADX INFO: renamed from: Q */
    public String[] f26346Q = {xnc.f98582G};

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$a */
    public class C4327a implements nfi.InterfaceC9864a {
        public C4327a() {
        }

        @Override // p000.nfi.InterfaceC9864a
        public void onItemClick(int i) {
            VoiceNoteActivity.this.checkToConvertBeforeOpenDetail((VoiceNotesBean) VoiceNoteActivity.this.f26349c.get(i));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$b */
    public class C4328b implements nfi.InterfaceC9865b {

        /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$b$a */
        public class a implements s2c {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f26356a;

            /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$b$a$a, reason: collision with other inner class name */
            public class C16424a implements u2c {
                public C16424a() {
                }

                @Override // p000.u2c
                public void onInput(String str) {
                    VoiceNotesBean voiceNotesBean = (VoiceNotesBean) VoiceNoteActivity.this.f26349c.get(a.this.f26356a);
                    if (TextUtils.isEmpty(str)) {
                        str = AppUtils.getCollectTime(Long.parseLong(voiceNotesBean.getCreateTime())) + VoiceNoteActivity.this.getString(C4201R.string.recording);
                    }
                    voiceNotesBean.setTitle(str);
                    VoiceNoteActivity.this.f26352f.updateMeetInfo(voiceNotesBean);
                    VoiceNoteActivity.this.f26350d.setData(VoiceNoteActivity.this.f26349c);
                    VoiceNoteActivity.this.f26350d.notifyItemChanged(a.this.f26356a);
                    ToastUtils.showShort(VoiceNoteActivity.this.getString(C4201R.string.save_success));
                }
            }

            public a(int i) {
                this.f26356a = i;
            }

            @Override // p000.s2c
            public void onKeyEvent(int i) {
                if (i != 1) {
                    if (i == 2) {
                        DialogRecordEditNewFragment dialogRecordEditNewFragment = DialogRecordEditNewFragment.getInstance(((VoiceNotesBean) VoiceNoteActivity.this.f26349c.get(this.f26356a)).getTitle());
                        VoiceNoteActivity.this.showDialogFragment(dialogRecordEditNewFragment);
                        dialogRecordEditNewFragment.setOnEventEditDialog(new C16424a());
                        return;
                    }
                    return;
                }
                VoiceNotesBean voiceNotesBean = (VoiceNotesBean) VoiceNoteActivity.this.f26349c.get(this.f26356a);
                String recordPath = voiceNotesBean.getRecordPath();
                if (!TextUtils.isEmpty(recordPath)) {
                    File file = new File(recordPath);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                VoiceNoteActivity.this.f26352f.deleteMeetInfo(voiceNotesBean);
                VoiceNoteActivity.this.f26349c.remove(this.f26356a);
                VoiceNoteActivity.this.f26350d.setData(VoiceNoteActivity.this.f26349c);
            }
        }

        public C4328b() {
        }

        @Override // p000.nfi.InterfaceC9865b
        public void onItemLongClick(int i) {
            DialogRecordMenuFragment dialogRecordMenuFragment = new DialogRecordMenuFragment();
            VoiceNoteActivity.this.showDialogFragment(dialogRecordMenuFragment);
            dialogRecordMenuFragment.setOnEventDialog(new a(i));
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$c */
    public class C4329c implements mdi.InterfaceC9323c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Long f26359a;

        public C4329c(Long l) {
            this.f26359a = l;
        }

        @Override // p000.mdi.InterfaceC9323c
        public void onFail() {
            VoiceNoteActivity.this.dismissAudioFormatLoading();
        }

        @Override // p000.mdi.InterfaceC9323c
        public void onSuccess(String str) {
            VoiceNoteActivity.this.dismissAudioFormatLoading();
            if (VoiceNoteActivity.this.isDestroyed() || VoiceNoteActivity.this.isFinishing()) {
                return;
            }
            Intent intent = new Intent(VoiceNoteActivity.this, (Class<?>) VoiceNoteRecordDetailActivity.class);
            intent.putExtra("mid", this.f26359a);
            VoiceNoteActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$d */
    public class C4330d implements AudioManager.OnAudioFocusChangeListener {
        public C4330d() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$e */
    public class C4331e implements ufi.InterfaceC13534b {
        public C4331e() {
        }

        @Override // p000.ufi.InterfaceC13534b
        public void onLanguageSelect() {
            VoiceNoteActivity voiceNoteActivity = VoiceNoteActivity.this;
            voiceNoteActivity.startToSelectTransActivity(voiceNoteActivity.f26342H);
        }

        @Override // p000.ufi.InterfaceC13534b
        public void onSure(String str) {
            Intent intent = new Intent(VoiceNoteActivity.this, (Class<?>) RecordActivity.class);
            intent.putExtra("noteName", str);
            intent.putExtra(RecordActivity.f26233g2, VoiceNoteActivity.this.f26348b);
            intent.putExtra(RecordActivity.f26232f2, VoiceNoteActivity.this.f26347a);
            VoiceNoteActivity.this.startActivity(intent);
            VoiceNoteActivity.this.f26340C.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$f */
    public class C4332f implements PermissionExplanationDialog.OnClickListListener {
        public C4332f() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            VoiceNoteActivity.this.checkPermission();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            Toast.makeText(VoiceNoteActivity.this, C4297R.string.ai_voice_note_permission_tip5, 0).show();
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.VoiceNoteActivity$g */
    public class C4333g implements Comparator<VoiceNotesBean> {
        public C4333g() {
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
        this.f26344M = audioManager;
        if (audioManager != null) {
            audioManager.setMode(0);
            this.f26344M.setSpeakerphoneOn(false);
        }
        this.f26344M.requestAudioFocus(new C4330d(), 3, 1);
        sendPauseKeyEvent(this.f26344M);
    }

    private boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f26346Q).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f26346Q) {
            if (lx2.checkSelfPermission(this, str) != 0) {
                ActivityCompat.requestPermissions(this, this.f26346Q, 200);
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
            mdi.convertPCMToMP3(this, l.longValue(), recordPath, new File(file.getParentFile(), strReplace + ".mp3").getAbsolutePath(), 44100, new C4329c(l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: sdi
            @Override // java.lang.Runnable
            public final void run() {
                this.f81509a.lambda$dismissAudioFormatLoading$3();
            }
        });
    }

    private void dismissNotifyDialog() {
        WatchDialog watchDialog = this.f26343L;
        if (watchDialog != null) {
            if (watchDialog.isShow() && !isDestroyed()) {
                this.f26343L.dismiss();
            }
            this.f26343L = null;
        }
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f26353m;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f26353m.dismiss();
            }
            this.f26353m = null;
        }
    }

    private void findMeeting() {
        List<VoiceNotesBean> all = this.f26352f.getAll();
        if (all.isEmpty()) {
            ((C12989td) this.binding).f84299b.setVisibility(0);
        } else {
            ((C12989td) this.binding).f84299b.setVisibility(8);
            this.f26349c.clear();
            this.f26349c.addAll(all);
        }
        List<VoiceNotesBean> list = this.f26349c;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (VoiceNotesBean voiceNotesBean : this.f26349c) {
            StringBuilder sb = new StringBuilder();
            sb.append("VoiceNotesBean createTime: ");
            sb.append(voiceNotesBean.getCreateTime());
        }
        Collections.sort(this.f26349c, new C4333g());
        this.f26350d.setData(this.f26349c);
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
        this.f26341F = transLanguageData;
        if (transLanguageData != null) {
            this.f26342H = AiLangUtil.getValue(this, transLanguageData.getKeyName());
        } else {
            TransLanguageData transLanguageData2 = new TransLanguageData();
            this.f26341F = transLanguageData2;
            transLanguageData2.setTransId(1);
            this.f26341F.setDefaultName("中文");
            this.f26341F.setSelect(true);
            this.f26341F.setVoiceName("xiaoyan");
            this.f26341F.setIatLanguage("zh-CN");
            this.f26341F.setLangKey("zh-Hans");
            this.f26341F.setUseMicTTS(true);
            this.f26341F.setKeyName("zh_name");
            vfe.getInstance().putString("language_voice_notes", TransLanguageData.toJson(this.f26341F));
            this.f26342H = "中文";
        }
        ufi ufiVar = this.f26340C;
        if (ufiVar != null) {
            ufiVar.setLanguage(this.f26342H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissAudioFormatLoading$3() {
        DialogC5869fl dialogC5869fl = this.f26345N;
        if (dialogC5869fl == null || !dialogC5869fl.isShowing()) {
            return;
        }
        this.f26345N.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLister$0(View view) {
        toMeeting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLister$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAudioFormatLoading$2() {
        if (this.f26345N == null) {
            this.f26345N = new DialogC5869fl(this, getResources().getString(C4297R.string.ai_voice_note_record_audio_format_tips));
        }
        if (this.f26345N.isShowing()) {
            return;
        }
        this.f26345N.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifyDialog$4(View view, DialogFragment dialogFragment) {
        dismissNotifyDialog();
        showStartVoiceNotesDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifyDialog$5(View view, DialogFragment dialogFragment) {
        dismissNotifyDialog();
        startNotificationSetting();
    }

    private void setLister() {
        ((C12989td) this.binding).f84302e.setOnClickListener(new View.OnClickListener() { // from class: qdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74095a.lambda$setLister$0(view);
            }
        });
        ((C12989td) this.binding).f84300c.setOnClickListener(new View.OnClickListener() { // from class: rdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77964a.lambda$setLister$1(view);
            }
        });
        this.f26350d.setOnItemClickListener(new C4327a());
        this.f26350d.setOnItemLongClickListener(new C4328b());
    }

    private void showAudioFormatLoading() {
        runOnUiThread(new Runnable() { // from class: ndi
            @Override // java.lang.Runnable
            public final void run() {
                this.f64085a.lambda$showAudioFormatLoading$2();
            }
        });
    }

    private void showNotifyDialog() {
        if (isFinishing()) {
            return;
        }
        if (this.f26343L == null) {
            this.f26343L = new WatchDialog.Builder().title(getString(C4297R.string.ai_voice_note_permission)).content(getString(C4297R.string.ai_voice_note_string_notify_permission)).cancel(true).left(getString(C4297R.string.ai_voice_note_cancel)).leftColor(getResources().getColor(C4201R.color.gray_d4d4d4)).right(getString(C4297R.string.ai_voice_note_to_setting)).rightColor(getResources().getColor(C4201R.color.text_important_color)).leftClickListener(new WatchDialog.InterfaceC4387c() { // from class: odi
                @Override // com.watchfun.voicenotes.widget.WatchDialog.InterfaceC4387c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f67371a.lambda$showNotifyDialog$4(view, dialogFragment);
                }
            }).rightClickListener(new WatchDialog.InterfaceC4387c() { // from class: pdi
                @Override // com.watchfun.voicenotes.widget.WatchDialog.InterfaceC4387c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f70501a.lambda$showNotifyDialog$5(view, dialogFragment);
                }
            }).build();
        }
        if (this.f26343L.isShow()) {
            return;
        }
        this.f26343L.show(getSupportFragmentManager(), "notify_dialog");
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f26353m == null) {
            this.f26353m = new PermissionExplanationDialog(this, new C4332f());
        }
        if (this.f26353m.isShowing()) {
            return;
        }
        this.f26353m.show();
    }

    private void showStartVoiceNotesDialog() {
        if (this.f26340C == null) {
            this.f26340C = new ufi(this, new C4331e());
        }
        if (this.f26340C.isShowing()) {
            return;
        }
        this.f26340C.show();
        this.f26340C.setLanguage(this.f26342H);
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
    public void initData() {
        super.initData();
        this.f26352f = VoiceNotesDatabase.getDatabase(this).messageDao();
        this.f26347a = getIntent().getBooleanExtra(RecordActivity.f26232f2, false);
        this.f26348b = getIntent().getBooleanExtra(RecordActivity.f26233g2, false);
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        m8446x(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        nfi nfiVar = new nfi(this);
        this.f26350d = nfiVar;
        nfiVar.setData(this.f26349c);
        ((C12989td) this.binding).f84303f.setLayoutManager(linearLayoutManager);
        ((C12989td) this.binding).f84303f.setAdapter(this.f26350d);
        audioStopMusic();
        setLister();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @efb String[] strArr, @efb int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 200) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    l3h.showToastShort(getString(C4201R.string.permission_system_set));
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

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C12989td getViewBinding() {
        return C12989td.inflate(getLayoutInflater());
    }

    /* JADX INFO: renamed from: x */
    public void m8446x(Activity activity) {
        if (C9389ml.getInstance().isForceDarkModel()) {
            C4032a.setStatusBarDark(this, true, false, false);
        } else {
            C4032a.setStatusBarDark(this, C9389ml.getInstance().getDefaultNightMode() == 2, false, false);
        }
    }
}
