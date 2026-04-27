package com.eyevue.glassapp.view.p007ai;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2474g;
import com.blankj.utilcode.util.C2475h;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.database.aichat.AiChatMessage;
import com.eyevue.glassapp.database.aichat.AiChatMessageDao;
import com.eyevue.glassapp.database.aichat.AiChatMessageDatabase;
import com.eyevue.glassapp.floatwindow.service.DaemonService;
import com.eyevue.glassapp.helper.AiWebSocketManager;
import com.eyevue.glassapp.location.LocationManager;
import com.eyevue.glassapp.utils.BatteryOptimization.BatteryOptimizationUtils;
import com.eyevue.glassapp.utils.PermissionUtil;
import com.eyevue.glassapp.view.batterypermissions.EyevueBatteryPermissionsActivity;
import com.eyevue.glassapp.view.p007ai.EyevueAiFragment;
import com.eyevue.glassapp.view.translate.simultaneous.C2957a;
import com.watchfun.base.BaseFragment;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.dialog.PermissionExplanationDialog;
import com.watchfun.transcommon.selectlau.SelectTransActivity;
import com.watchfun.transcommon.utils.AiLangUtil;
import com.watchfun.voicenotes.widget.WatchDialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.C12269rt;
import p000.C14100vj;
import p000.C14131vk;
import p000.C14630wj;
import p000.C16155zj;
import p000.C8840lk;
import p000.DialogC15687yj;
import p000.csd;
import p000.efb;
import p000.igg;
import p000.l3h;
import p000.lu6;
import p000.lx2;
import p000.mc2;
import p000.ne4;
import p000.rc7;
import p000.td9;
import p000.u56;
import p000.u77;
import p000.ubb;
import p000.vfe;
import p000.x4f;
import p000.xcg;
import p000.xnc;
import p000.xt5;
import p000.zgb;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueAiFragment extends BaseFragment<lu6> {

    /* JADX INFO: renamed from: C */
    public AiChatMessage f18363C;

    /* JADX INFO: renamed from: F */
    public int f18364F;

    /* JADX INFO: renamed from: H */
    public WatchDialog f18365H;

    /* JADX INFO: renamed from: L */
    public boolean f18366L;

    /* JADX INFO: renamed from: M */
    public boolean f18367M;

    /* JADX INFO: renamed from: M1 */
    public long f18368M1;

    /* JADX INFO: renamed from: N */
    public td9 f18369N;

    /* JADX INFO: renamed from: Q */
    public AudioManager f18370Q;

    /* JADX INFO: renamed from: X */
    public boolean f18372X;

    /* JADX INFO: renamed from: Y */
    public long f18373Y;

    /* JADX INFO: renamed from: Z */
    public DialogC15687yj f18374Z;

    /* JADX INFO: renamed from: c */
    public AiChatMessageDao f18379c;

    /* JADX INFO: renamed from: d */
    public C14100vj f18380d;

    /* JADX INFO: renamed from: e */
    public boolean f18381e;

    /* JADX INFO: renamed from: f */
    public boolean f18382f;

    /* JADX INFO: renamed from: m */
    public PermissionExplanationDialog f18383m;

    /* JADX INFO: renamed from: a */
    public final String f18376a = "EyevueAiActivity";

    /* JADX INFO: renamed from: b */
    public String[] f18378b = {xnc.f98582G, "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.WAKE_LOCK"};

    /* JADX INFO: renamed from: V1 */
    public final xcg<C16155zj> f18371V1 = new C2695a();

    /* JADX INFO: renamed from: Z1 */
    public final xcg<csd> f18375Z1 = new xcg() { // from class: kk5
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f54544a.lambda$new$2((csd) obj);
        }
    };

    /* JADX INFO: renamed from: a2 */
    public final xcg<C14131vk> f18377a2 = new xcg() { // from class: lk5
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f57979a.lambda$new$4((C14131vk) obj);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$a */
    public class C2695a implements xcg<C16155zj> {
        public C2695a() {
        }

        @Override // p000.xcg
        public void onEvent(C16155zj aiClickEditMessageEvent) {
            if (((BaseFragment) EyevueAiFragment.this).binding == null || !EyevueAiFragment.this.isAdded()) {
                return;
            }
            if (aiClickEditMessageEvent.f105206a) {
                EyevueAiFragment.this.f18382f = false;
                EyevueAiFragment.this.f18381e = false;
                EyevueAiFragment.this.sendSelectAllState();
                EyevueAiFragment.this.f18380d.setEditMode(false);
                ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58765C.setVisibility(0);
                if (mc2.isEmpty(EyevueAiFragment.this.f18379c.getLatestTen())) {
                    ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58769M.setVisibility(0);
                } else {
                    ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58769M.setVisibility(8);
                }
                ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58782d.setImageResource(C2531R.drawable.icon_album_edit);
                return;
            }
            if (!aiClickEditMessageEvent.f105207b) {
                if (aiClickEditMessageEvent.f105208c) {
                    EyevueAiFragment.this.f18381e = !r5.f18381e;
                    EyevueAiFragment.this.f18380d.setAllSelectState(EyevueAiFragment.this.f18381e);
                    EyevueAiFragment.this.sendSelectAllState();
                    return;
                }
                return;
            }
            if (EyevueAiFragment.this.f18381e) {
                Iterator<AiChatMessage> it = EyevueAiFragment.this.f18379c.getAll().iterator();
                while (it.hasNext()) {
                    xt5.delete(it.next().getVoicePath());
                }
                EyevueAiFragment.this.f18379c.deleteAll();
                if (mc2.isEmpty(EyevueAiFragment.this.f18379c.getAll())) {
                    ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58769M.setVisibility(0);
                }
            } else {
                for (AiChatMessage aiChatMessage : EyevueAiFragment.this.f18380d.getSelectData()) {
                    EyevueAiFragment.this.f18379c.deleteSelectData(aiChatMessage.getMessageTime());
                    xt5.delete(aiChatMessage.getVoicePath());
                }
            }
            EyevueAiFragment.this.f18380d.removeSelectData();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$b */
    public class C2696b implements PermissionExplanationDialog.OnClickListListener {
        public C2696b() {
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onOk() {
            EyevueAiFragment.this.checkPermission();
        }

        @Override // com.watchfun.transcommon.dialog.PermissionExplanationDialog.OnClickListListener
        public void onRefuse() {
            Toast.makeText(EyevueAiFragment.this.getContext(), C4201R.string.permission_tip5, 0).show();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$c */
    public class C2697c implements td9.InterfaceC12994a {
        public C2697c() {
        }

        @Override // p000.td9.InterfaceC12994a
        public void onOk() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$d */
    public class C2698d implements C2475h.f {
        public C2698d() {
        }

        @Override // com.blankj.utilcode.util.C2475h.f
        public void onDenied() {
            EyevueAiFragment.this.dismissLocationDialog();
        }

        @Override // com.blankj.utilcode.util.C2475h.f
        public void onGranted() {
            C2473f.m4168e("EyevueAiActivity", "权限请求成功");
            LocationManager.getInstance().startLocation();
            if (!x4f.isServiceRunning((Class<?>) DaemonService.class)) {
                u56.getInstance(EyevueAiFragment.this.getActivity()).create(EyevueAiFragment.this.getActivity());
            }
            EyevueAiFragment.this.dismissLocationDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$e */
    public class C2699e implements DialogC15687yj.c {
        public C2699e() {
        }

        @Override // p000.DialogC15687yj.c
        public void onAgree() {
            EyevueAiFragment.this.dismissAiPermissionDialog();
            EyevueAiFragment.this.startActivity(new Intent(EyevueAiFragment.this.requireContext(), (Class<?>) EyevueBatteryPermissionsActivity.class));
        }

        @Override // p000.DialogC15687yj.c
        public void onDisagree() {
            EyevueAiFragment.this.dismissAiPermissionDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$f */
    public class C2700f implements ModBleResponse.OnAiStartListener {
        public C2700f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAiStart$0() {
            EyevueAiFragment.this.showGPSLocationDialog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAiStart$1() {
            if (EyevueAiFragment.this.isAdded()) {
                EyevueAiFragment.this.f18382f = false;
                if (EyevueAiFragment.this.f18380d != null) {
                    EyevueAiFragment.this.f18380d.setEditMode(EyevueAiFragment.this.f18382f);
                }
                ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58765C.setVisibility(EyevueAiFragment.this.f18382f ? 8 : 0);
                ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58782d.setImageResource(EyevueAiFragment.this.f18382f ? C2531R.drawable.icon_album_cancel : C2531R.drawable.icon_album_edit);
                C8840lk c8840lk = new C8840lk();
                c8840lk.f57748a = EyevueAiFragment.this.f18382f;
                zgb.defaultCenter().publish(c8840lk);
                EyevueAiFragment.this.f18381e = false;
                EyevueAiFragment.this.sendSelectAllState();
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnAiStartListener
        public void onAiStart() {
            if (!C2474g.areNotificationsEnabled()) {
                EyevueAiFragment.this.showNotifyDialog();
                AiWebSocketManager.getInstance().stopAi();
            } else if (!PermissionUtil.isHasLocationPermission(EyevueAiFragment.this.getContext()) || !PermissionUtil.checkGpsProviderEnable(EyevueAiFragment.this.getContext())) {
                C2478k.runOnUiThread(new Runnable() { // from class: rk5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f78537a.lambda$onAiStart$0();
                    }
                });
                AiWebSocketManager.getInstance().stopAi();
            } else {
                if (!x4f.isServiceRunning((Class<?>) DaemonService.class)) {
                    AiWebSocketManager.getInstance().stopAi();
                    u56.getInstance(EyevueAiFragment.this.getContext()).create(EyevueAiFragment.this.getActivity());
                }
                EyevueAiFragment.this.requireActivity().runOnUiThread(new Runnable() { // from class: sk5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f82105a.lambda$onAiStart$1();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$g */
    public class C2701g implements C2957a.e {
        public C2701g() {
        }

        @Override // com.eyevue.glassapp.view.translate.simultaneous.C2957a.e
        public void onAudioPlaybackCompleted() {
            EyevueAiFragment.this.f18380d.setCurrentPlayingMsgId("");
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$h */
    public class C2702h implements C14100vj.m {
        public C2702h() {
        }

        @Override // p000.C14100vj.m
        public void click(boolean isSelect) {
            EyevueAiFragment.this.f18381e = isSelect;
            EyevueAiFragment.this.sendSelectAllState();
        }

        @Override // p000.C14100vj.m
        public void onImageClick(String url) {
        }

        @Override // p000.C14100vj.m
        public void onItemChatPlayVoice(View view, int position, AiChatMessage userAiInfo) {
            if (AiWebSocketManager.getInstance().isDialogueEnd()) {
                if (EyevueAiFragment.this.f18380d.getCurrentPlayingMsgId().equals(userAiInfo.getMsgId())) {
                    EyevueAiFragment.this.f18380d.setCurrentPlayingMsgId("");
                    C2957a.getInstance().pause();
                } else {
                    EyevueAiFragment.this.f18380d.setCurrentPlayingMsgId(userAiInfo.getMsgId());
                    C2957a.getInstance().playAudioFile(EyevueAiFragment.this.f18370Q, xt5.getFileByPath(userAiInfo.getVoicePath()), 0);
                }
            }
        }

        @Override // p000.C14100vj.m
        public void onItemChatVoice(View view, int position, String path) {
        }

        @Override // p000.C14100vj.m
        public void onItemLongClick(boolean iseditMode, boolean isSelect) {
            EyevueAiFragment.this.f18381e = isSelect;
            EyevueAiFragment.this.sendSelectAllState();
            EyevueAiFragment.this.f18382f = iseditMode;
            ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58765C.setVisibility(EyevueAiFragment.this.f18382f ? 8 : 0);
            EyevueAiFragment.this.initHistoryData(false);
            C8840lk c8840lk = new C8840lk();
            c8840lk.f57748a = iseditMode;
            zgb.defaultCenter().publish(c8840lk);
        }

        @Override // p000.C14100vj.m
        public void onItemTranslate(int position, AiChatMessage userAiInfo) {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$i */
    public class ViewOnClickListenerC2703i implements View.OnClickListener {
        public ViewOnClickListenerC2703i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (AiWebSocketManager.getInstance().isDialogueEnd()) {
                EyevueAiFragment.this.initHistoryData(false);
                EyevueAiFragment.this.f18382f = !r3.f18382f;
                if (EyevueAiFragment.this.f18380d != null) {
                    EyevueAiFragment.this.f18380d.setEditMode(EyevueAiFragment.this.f18382f);
                }
                ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58765C.setVisibility(EyevueAiFragment.this.f18382f ? 8 : 0);
                ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58782d.setImageResource(EyevueAiFragment.this.f18382f ? C2531R.drawable.icon_album_cancel : C2531R.drawable.icon_album_edit);
                C8840lk c8840lk = new C8840lk();
                c8840lk.f57748a = EyevueAiFragment.this.f18382f;
                zgb.defaultCenter().publish(c8840lk);
                EyevueAiFragment.this.f18381e = false;
                EyevueAiFragment.this.sendSelectAllState();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$j */
    public class ViewOnClickListenerC2704j implements View.OnClickListener {
        public ViewOnClickListenerC2704j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!AiWebSocketManager.getInstance().isStartFromPhone()) {
                AiWebSocketManager.getInstance().stopAi();
                EyevueAiFragment.this.f18380d.setWorking(false);
                EyevueAiFragment.this.f18367M = true;
            }
            if (EyevueAiFragment.this.f18380d.isWorking()) {
                l3h.showToastShort(EyevueAiFragment.this.getString(C2531R.string.str_no_spack_tip));
            } else {
                EyevueAiFragment.this.startAiView();
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$k */
    public class ViewOnClickListenerC2705k implements View.OnClickListener {
        public ViewOnClickListenerC2705k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            boolean z = vfe.getInstance().getBoolean(AiWebSocketManager.IS_SUPPORT_DUPLEX, false);
            boolean z2 = !z;
            if (z) {
                ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58781c.setImageResource(C2531R.drawable.icon_ai_duplex_un);
                ToastUtils.showShort(EyevueAiFragment.this.getString(C2531R.string.string_duplex_close));
            } else {
                ((lu6) ((BaseFragment) EyevueAiFragment.this).binding).f58781c.setImageResource(C2531R.drawable.icon_ai_duplex);
                ToastUtils.showShort(EyevueAiFragment.this.getString(C2531R.string.string_duplex_open));
            }
            vfe.getInstance().putBoolean(AiWebSocketManager.IS_SUPPORT_DUPLEX, z2);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$l */
    public class ViewOnClickListenerC2706l implements View.OnClickListener {
        public ViewOnClickListenerC2706l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueAiFragment.m4577t(EyevueAiFragment.this);
            if (EyevueAiFragment.this.f18373Y % 5 == 0) {
                if (u77.f86966j == 0) {
                    u77.f86966j = 1;
                    ToastUtils.showShort("AI切换微软模型,请重新开始对话");
                } else {
                    u77.f86966j = 0;
                    ToastUtils.showShort("AI切换阿里模型,请重新开始对话");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$m */
    public class ViewOnClickListenerC2707m implements View.OnClickListener {
        public ViewOnClickListenerC2707m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueAiFragment.this.showAiPermissionDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.ai.EyevueAiFragment$n */
    public class ViewOnClickListenerC2708n implements View.OnClickListener {
        public ViewOnClickListenerC2708n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueAiFragment.m4580w(EyevueAiFragment.this);
            if (EyevueAiFragment.this.f18368M1 >= 10) {
                AiWebSocketManager.getInstance().isSaveTestPcm = true;
                ToastUtils.showShort("save test pcm");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        for (String str : this.f18378b) {
            if (lx2.checkSelfPermission(getContext(), str) != 0) {
                ActivityCompat.requestPermissions(getActivity(), this.f18378b, 200);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAiPermissionDialog() {
        DialogC15687yj dialogC15687yj = this.f18374Z;
        if (dialogC15687yj != null) {
            if (dialogC15687yj.isShowing()) {
                this.f18374Z.dismiss();
            }
            this.f18374Z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissLocationDialog() {
        td9 td9Var = this.f18369N;
        if (td9Var != null) {
            if (td9Var.isShowing()) {
                this.f18369N.dismiss();
            }
            this.f18369N = null;
        }
    }

    private void dismissNotifyDialog() {
        WatchDialog watchDialog = this.f18365H;
        if (watchDialog != null) {
            if (watchDialog.isShow() && isAdded()) {
                this.f18365H.dismiss();
            }
            this.f18365H = null;
        }
    }

    private void dismissPermissionExplanationDialog() {
        PermissionExplanationDialog permissionExplanationDialog = this.f18383m;
        if (permissionExplanationDialog != null) {
            if (permissionExplanationDialog.isShowing()) {
                this.f18383m.dismiss();
            }
            this.f18383m = null;
        }
    }

    private String[] findUnaskedPermissions(String[] wanted) {
        ArrayList arrayList = new ArrayList();
        for (String str : wanted) {
            if (lx2.checkSelfPermission(getContext(), str) != 0) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initHistoryData(boolean isScrollToBottom) {
        AiChatMessageDao aiChatMessageDao = this.f18379c;
        if (aiChatMessageDao == null || this.binding == 0 || this.f18380d == null || this.f18363C != null) {
            return;
        }
        List<AiChatMessage> latestTen = aiChatMessageDao.getLatestTen();
        if (mc2.isEmpty(latestTen)) {
            ((lu6) this.binding).f58769M.setVisibility(0);
            return;
        }
        Collections.reverse(latestTen);
        this.f18380d.clearData();
        this.f18380d.setData(latestTen, false, false);
        if (isScrollToBottom) {
            ((lu6) this.binding).f58772Q.scrollToPosition(this.f18380d.getItemCount() - 1);
        }
    }

    private void initLanguage() {
        TransLanguageData transLanguageData = rc7.getTransLanguageData(vfe.getInstance().getString(vfe.C14037b.f90942a0));
        if (transLanguageData != null) {
            ((lu6) this.binding).f58783e.setText(AiLangUtil.getValue(getContext(), transLanguageData.getKeyName()));
            return;
        }
        TransLanguageData transLanguageData2 = new TransLanguageData();
        transLanguageData2.setTransId(1);
        transLanguageData2.setVoiceName("xiaoyan");
        transLanguageData2.setIatLanguage("zh-CN");
        transLanguageData2.setLangKey("zh-Hans");
        transLanguageData2.setDefaultName("中文");
        transLanguageData2.setKeyName("zh_name");
        transLanguageData2.setSelect(true);
        transLanguageData2.setUseMicTTS(true);
        ((lu6) this.binding).f58783e.setText(C4201R.string.ai_trans_zh);
        vfe.getInstance().putString(vfe.C14037b.f90942a0, TransLanguageData.toJson(transLanguageData2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(csd csdVar) {
        C14100vj c14100vj = this.f18380d;
        if (c14100vj != null) {
            c14100vj.setCurrentPlayingMsgId("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(C14131vk c14131vk) {
        if (this.binding == 0 || this.f18380d == null) {
            return;
        }
        AiChatMessage aiChatMessage = new AiChatMessage();
        aiChatMessage.setMessageTime(System.currentTimeMillis());
        aiChatMessage.setMsgType(c14131vk.f91476b);
        if (((lu6) this.binding).f58769M.getVisibility() == 0) {
            ((lu6) this.binding).f58769M.setVisibility(8);
        }
        int i = c14131vk.f91476b;
        if (i == 1002) {
            aiChatMessage.setImagePath(c14131vk.f91479e);
            aiChatMessage.setMsgId(System.currentTimeMillis() + "");
            this.f18380d.addData(aiChatMessage);
            this.f18380d.setmIsPointAnimation(true);
            ((lu6) this.binding).f58772Q.scrollToPosition(this.f18380d.getItemCount() - 1);
            return;
        }
        if (i != 1001 && i != 2001) {
            if (i == 2009) {
                this.f18380d.setmIsPointAnimation(false);
                this.f18380d.setCurrentPlayingMsgId("");
                return;
            }
            return;
        }
        if (this.f18363C == null) {
            this.f18363C = aiChatMessage;
            aiChatMessage.setContent(c14131vk.f91477c);
            this.f18363C.setMsgId(System.currentTimeMillis() + "");
            this.f18380d.addData(this.f18363C);
            this.f18364F = this.f18380d.getItemCount() - 1;
            if (c14131vk.f91476b == 2001) {
                this.f18380d.setWorking(true);
                this.f18380d.setCurrentPlayingMsgId(this.f18363C.getMsgId());
            }
        }
        this.f18363C.setContent(c14131vk.f91477c);
        this.f18363C.setVoicePath(c14131vk.f91478d);
        this.f18380d.notifyItemChanged(this.f18364F);
        ((lu6) this.binding).f58772Q.scrollToPosition(this.f18380d.getItemCount() - 1);
        if (c14131vk.f91475a) {
            if (c14131vk.f91476b == 1001 && !AiWebSocketManager.getInstance().isDialogueEnd()) {
                this.f18380d.setmIsPointAnimation(true);
            }
            if (c14131vk.f91476b == 2001) {
                this.f18380d.setWorking(false);
                this.f18380d.setmIsPointAnimation(false);
            }
            ((lu6) this.binding).f58772Q.scrollBy(0, 200);
            this.f18363C = null;
            this.f18364F = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(final C14131vk c14131vk) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: ok5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67894a.lambda$new$3(c14131vk);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setListener$0(View view) {
        Intent intent = new Intent(getContext(), (Class<?>) SelectTransActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SelectTransActivity.KEY_TITLE, ((lu6) this.binding).f58783e.getText().toString());
        bundle.putString(SelectTransActivity.KEY_OTHER_TITLE, "");
        bundle.putInt(SelectTransActivity.KEY_TYPE, 1);
        bundle.putInt(SelectTransActivity.KEY_ACTION_TYPE, 5);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifyDialog$5(View view, DialogFragment dialogFragment) {
        dismissNotifyDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifyDialog$6(View view, DialogFragment dialogFragment) {
        dismissNotifyDialog();
        startNotificationSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startAiView$1() {
        AiWebSocketManager.getInstance().startAiAsr(true);
    }

    public static EyevueAiFragment newInstance() {
        return new EyevueAiFragment();
    }

    private void requestLocationPermission() {
        C2475h.permission(xnc.f98583H, xnc.f98584I).callback(new C2698d()).request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSelectAllState() {
        C14630wj c14630wj = new C14630wj();
        c14630wj.f94372a = this.f18381e;
        zgb.defaultCenter().publish(c14630wj);
    }

    @igg({"ClickableViewAccessibility"})
    private void setListener() {
        zgb.defaultCenter().subscribeStrongly(C14131vk.class, this.f18377a2);
        zgb.defaultCenter().subscribeStrongly(csd.class, this.f18375Z1);
        zgb.defaultCenter().subscriber(C16155zj.class, this.f18371V1);
        ModUtils.modBleResponse().setOnAiStartListener(new C2700f());
        C2957a.getInstance().setAudioPlayerListener(new C2701g());
        this.f18380d.setItemClickListener(new C2702h());
        ((lu6) this.binding).f58782d.setOnClickListener(new ViewOnClickListenerC2703i());
        ((lu6) this.binding).f58783e.setOnClickListener(new View.OnClickListener() { // from class: qk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74741a.lambda$setListener$0(view);
            }
        });
        ((lu6) this.binding).f58784f.setOnClickListener(new ViewOnClickListenerC2704j());
        if (vfe.getInstance().getBoolean(AiWebSocketManager.IS_SUPPORT_DUPLEX, false)) {
            ((lu6) this.binding).f58781c.setImageResource(C2531R.drawable.icon_ai_duplex);
        } else {
            ((lu6) this.binding).f58781c.setImageResource(C2531R.drawable.icon_ai_duplex_un);
        }
        ((lu6) this.binding).f58781c.setOnClickListener(new ViewOnClickListenerC2705k());
        ((lu6) this.binding).f58779a2.setOnClickListener(new ViewOnClickListenerC2706l());
        ((lu6) this.binding).f58780b.setOnClickListener(new ViewOnClickListenerC2707m());
        ((lu6) this.binding).f58785m.setOnClickListener(new ViewOnClickListenerC2708n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAiPermissionDialog() {
        if (isAdded()) {
            if (this.f18374Z == null) {
                this.f18374Z = new DialogC15687yj(requireContext(), new C2699e());
            }
            DialogC15687yj dialogC15687yj = this.f18374Z;
            if (dialogC15687yj == null || dialogC15687yj.isShowing()) {
                return;
            }
            this.f18374Z.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGPSLocationDialog() {
        if (isAdded()) {
            requestLocationPermission();
            zi9.m26852e("EyevueAiActivity", "showGPSLocationDialog");
            td9 td9Var = new td9(getActivity(), new C2697c());
            this.f18369N = td9Var;
            td9Var.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNotifyDialog() {
        if (isAdded()) {
            if (this.f18365H == null) {
                this.f18365H = new WatchDialog.Builder().title(getString(C2531R.string.permission)).content(getString(C2531R.string.string_notify_permission)).cancel(true).left(getString(C2531R.string.cancel)).leftColor(getResources().getColor(C2531R.color.gray_d4d4d4)).right(getString(C2531R.string.to_setting)).rightColor(getResources().getColor(C4201R.color.base_blue)).leftClickListener(new WatchDialog.InterfaceC4387c() { // from class: mk5
                    @Override // com.watchfun.voicenotes.widget.WatchDialog.InterfaceC4387c
                    public final void onClick(View view, DialogFragment dialogFragment) {
                        this.f61244a.lambda$showNotifyDialog$5(view, dialogFragment);
                    }
                }).rightClickListener(new WatchDialog.InterfaceC4387c() { // from class: nk5
                    @Override // com.watchfun.voicenotes.widget.WatchDialog.InterfaceC4387c
                    public final void onClick(View view, DialogFragment dialogFragment) {
                        this.f64802a.lambda$showNotifyDialog$6(view, dialogFragment);
                    }
                }).build();
            }
            if (this.f18365H.isShow()) {
                return;
            }
            this.f18365H.show(getChildFragmentManager(), "notify_dialog");
        }
    }

    private void showPermissionExplanationDialog() {
        dismissPermissionExplanationDialog();
        if (this.f18383m == null) {
            this.f18383m = new PermissionExplanationDialog(getContext(), new C2696b());
        }
        if (this.f18383m.isShowing()) {
            return;
        }
        this.f18383m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startAiView() {
        if (!checkAndRequestPermissions()) {
            return false;
        }
        if (!C2474g.areNotificationsEnabled()) {
            showNotifyDialog();
            return false;
        }
        if (!x4f.isServiceRunning((Class<?>) DaemonService.class)) {
            u56.getInstance(getContext()).create(getActivity());
            return false;
        }
        if (!PermissionUtil.isHasLocationPermission(getContext()) || !PermissionUtil.checkGpsProviderEnable(getContext())) {
            showGPSLocationDialog();
            return false;
        }
        if (!ubb.isNetworkAvailable(getContext())) {
            l3h.showToastShort(getString(C4201R.string.loading_no_net_view_text_hint));
            return false;
        }
        ((lu6) this.binding).f58784f.setBackgroundResource(C2531R.drawable.bg_card_base_blue_12_shape);
        ((lu6) this.binding).f58777Z1.setText("");
        ComponentCallbacks2C2485a.with(this).asGif().load(Integer.valueOf(C2531R.drawable.ai_anim)).diskCacheStrategy(ne4.f64120d).into(((lu6) this.binding).f58767H);
        ((lu6) this.binding).f58767H.setVisibility(0);
        ((lu6) this.binding).f58770M1.setVisibility(0);
        if (this.f18367M) {
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: pk5
                @Override // java.lang.Runnable
                public final void run() {
                    EyevueAiFragment.lambda$startAiView$1();
                }
            }, 500L);
        } else {
            AiWebSocketManager.getInstance().startAiAsr(true);
        }
        this.f18367M = false;
        return true;
    }

    private void stopAiView() {
        ((lu6) this.binding).f58784f.setBackgroundResource(C2531R.drawable.bg_card_white_shape);
        ((lu6) this.binding).f58777Z1.setText(getString(C2531R.string.string_touch_speak));
        ((lu6) this.binding).f58767H.setVisibility(8);
        ((lu6) this.binding).f58770M1.setVisibility(8);
        AiWebSocketManager.getInstance().stopAiAsr();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ long m4577t(EyevueAiFragment eyevueAiFragment) {
        long j = eyevueAiFragment.f18373Y;
        eyevueAiFragment.f18373Y = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ long m4580w(EyevueAiFragment eyevueAiFragment) {
        long j = eyevueAiFragment.f18368M1;
        eyevueAiFragment.f18368M1 = 1 + j;
        return j;
    }

    @Override // com.watchfun.base.BaseFragment
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public lu6 provideViewBinding(ViewGroup viewGroup) {
        return lu6.inflate(getLayoutInflater(), viewGroup, false);
    }

    public boolean checkAndRequestPermissions() {
        if (findUnaskedPermissions(this.f18378b).length <= 0) {
            return true;
        }
        showPermissionExplanationDialog();
        return false;
    }

    @Override // com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        this.f18379c = AiChatMessageDatabase.getDatabase(getContext()).messageDao();
        this.f18380d = new C14100vj(getContext());
        ((lu6) this.binding).f58772Q.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        ((lu6) this.binding).f58772Q.setAdapter(this.f18380d);
        ((lu6) this.binding).f58772Q.setItemAnimator(null);
        this.f18370Q = (AudioManager) getContext().getSystemService("audio");
        initHistoryData(true);
        setListener();
    }

    @Override // com.watchfun.base.BaseFragment
    public void loadData() {
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(C14131vk.class, this.f18377a2);
        zgb.defaultCenter().unsubscribe(csd.class, this.f18375Z1);
        zgb.defaultCenter().unsubscribe(C16155zj.class, this.f18371V1);
    }

    @Override // com.watchfun.base.LazyLoadFragment
    public void onFragmentPause() {
        super.onFragmentPause();
        if (C2957a.getInstance().isPlaying()) {
            C2957a.getInstance().stopAudio();
            C14100vj c14100vj = this.f18380d;
            if (c14100vj != null) {
                c14100vj.setCurrentPlayingMsgId("");
            }
        }
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentResume() {
        super.onFragmentResume();
        if (C2474g.areNotificationsEnabled()) {
            if (PermissionUtil.isHasLocationPermission(getContext()) && PermissionUtil.checkGpsProviderEnable(getContext())) {
                if (!x4f.isServiceRunning((Class<?>) DaemonService.class)) {
                    u56.getInstance(getActivity()).create(getActivity());
                }
            } else if (!this.f18372X) {
                showGPSLocationDialog();
                this.f18372X = true;
            }
        }
        initLanguage();
        initHistoryData(true);
        if (PermissionUtil.isHasLocationPermission(getContext()) && PermissionUtil.checkGpsProviderEnable(getContext())) {
            LocationManager.getInstance().startLocation();
        }
        if (BatteryOptimizationUtils.isIgnoringBatteryOptimizations(requireContext())) {
            ((lu6) this.binding).f58780b.setVisibility(8);
        } else {
            ((lu6) this.binding).f58780b.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        if (requestCode == 200) {
            for (int i : grantResults) {
                if (i != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("allGranted =");
                    sb.append(requestCode);
                    l3h.showToastShort(getString(C2531R.string.eyevue_permission_system_set));
                    return;
                }
            }
            vfe.getInstance().putBoolean("SP_KEY_PERMISSIONSGRANTED", true);
        }
    }

    public void startNotificationSetting() {
        ApplicationInfo applicationInfo = getContext().getApplicationInfo();
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
}
