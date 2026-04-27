package com.eyevue.glassapp.view.guidance;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.guid.NewGuidBean;
import com.eyevue.glassapp.base.BaseBluetoothFragment;
import com.eyevue.glassapp.utils.PermissionUtil;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.AiLangUtil;
import java.util.ArrayList;
import java.util.List;
import p000.ad7;
import p000.ek9;
import p000.ekg;
import p000.hib;
import p000.ju6;
import p000.kcb;
import p000.l3h;
import p000.mf4;
import p000.phg;
import p000.pj4;
import p000.t77;
import p000.ymh;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class GuideCommonFragment extends BaseBluetoothFragment<ju6> implements ad7.InterfaceC0178a, BaseBluetoothFragment.InterfaceC2567e {
    private static final String ARG_TAB_NAME_MODE = "tab_name_mode";
    List<NewGuidBean> listData = new ArrayList();
    private kcb mPresenter;
    private ekg tabNameMode;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.GuideCommonFragment$a */
    public class ViewOnClickListenerC2787a implements View.OnClickListener {
        public ViewOnClickListenerC2787a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((ju6) ((BaseBluetoothFragment) GuideCommonFragment.this).binding).f51924N.setVisibility(8);
            ((ju6) ((BaseBluetoothFragment) GuideCommonFragment.this).binding).f51925Q.seekTo(0);
            ((ju6) ((BaseBluetoothFragment) GuideCommonFragment.this).binding).f51925Q.start();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.guidance.GuideCommonFragment$b */
    public class ViewOnClickListenerC2788b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ekg f18609a;

        public ViewOnClickListenerC2788b(final ekg val$tabNameMode) {
            this.f18609a = val$tabNameMode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (this.f18609a.getAction() != null) {
                GuideCommonFragment.this.addDevice();
                return;
            }
            if (this.f18609a.getActivityClass() != null) {
                String str = t77.f83939r;
                String str2 = t77.f83923b;
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    l3h.showToastShort(GuideCommonFragment.this.getString(C2531R.string.eyevue_add_device_dialog_tip));
                    return;
                }
                ek9 loginSkipMode = GuideCommonFragment.this.getLoginSkipMode(this.f18609a.getId());
                if (loginSkipMode != null) {
                    Intent intent = new Intent(GuideCommonFragment.this.getActivity(), this.f18609a.getActivityClass());
                    if (loginSkipMode == ek9.TRANSLATOR) {
                        GuideCommonFragment.this.toTrans(intent, loginSkipMode);
                        return;
                    } else {
                        GuideCommonFragment.this.startToTransView(intent, loginSkipMode);
                        return;
                    }
                }
                if (this.f18609a.getId() == ekg.AI_DIALOG.getId()) {
                    GuideCommonFragment.this.requireActivity().finish();
                    phg phgVar = new phg();
                    phgVar.f70840b = true;
                    zgb.defaultCenter().publish(phgVar);
                }
                C2473f.m4168e("lttttt", "mode is null::" + this.f18609a.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ek9 getLoginSkipMode(int id) {
        switch (id) {
            case 3:
                return ek9.FREEDOM_TALK;
            case 4:
                return ek9.TRANSLATOR;
            case 5:
            default:
                return null;
            case 6:
                return ek9.PHONE_HEADSET;
            case 7:
                return ek9.DUAL_EAR;
            case 8:
                return ek9.VOICE_NOTE;
            case 9:
                return ek9.PHOTO_TRANS;
            case 10:
                return ek9.VIDEO_AUDIO_CALL;
            case 11:
                return ek9.REAL_TIME_TRANS;
            case 12:
                return ek9.TEXT_TRANS;
        }
    }

    private NewGuidBean getNewGuidBeanById(int id) {
        if (id <= 0 || id > this.listData.size()) {
            return null;
        }
        return this.listData.get(id - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showView$0(MediaPlayer mediaPlayer) {
        mediaPlayer.setVolume(0.0f, 0.0f);
        ((ju6) ((BaseBluetoothFragment) this).binding).f51924N.setVisibility(8);
        ((ju6) ((BaseBluetoothFragment) this).binding).f51925Q.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showView$1(MediaPlayer mediaPlayer) {
        ((ju6) ((BaseBluetoothFragment) this).binding).f51924N.setVisibility(0);
    }

    public static GuideCommonFragment newInstance(ekg tabNameMode) {
        GuideCommonFragment guideCommonFragment = new GuideCommonFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(ARG_TAB_NAME_MODE, tabNameMode);
        guideCommonFragment.setArguments(bundle);
        return guideCommonFragment;
    }

    private void showView(NewGuidBean newGuidBean, ekg tabNameMode) {
        String string;
        List<TransLanguageData> languageData;
        String video = newGuidBean.getVideo();
        if (video != null && !video.isEmpty()) {
            int identifier = getResources().getIdentifier(video, "raw", getActivity().getPackageName());
            if (identifier != 0) {
                ((ju6) ((BaseBluetoothFragment) this).binding).f51926X.setVisibility(0);
                ((ju6) ((BaseBluetoothFragment) this).binding).f51925Q.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + pj4.f71071b + identifier));
                ((ju6) ((BaseBluetoothFragment) this).binding).f51925Q.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: bd7
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        this.f13434a.lambda$showView$0(mediaPlayer);
                    }
                });
                ((ju6) ((BaseBluetoothFragment) this).binding).f51925Q.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: cd7
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        this.f16289a.lambda$showView$1(mediaPlayer);
                    }
                });
                ((ju6) ((BaseBluetoothFragment) this).binding).f51926X.setOnClickListener(new ViewOnClickListenerC2787a());
            } else {
                Log.e("CommonFragment", "Resource not found for video: " + video);
            }
        }
        newGuidBean.getImage();
        String text = newGuidBean.getText();
        if (!TextUtils.isEmpty(text)) {
            int identifier2 = getResources().getIdentifier(text, ymh.InterfaceC15723b.f102127e, requireContext().getPackageName());
            if (identifier2 != 0) {
                ((ju6) ((BaseBluetoothFragment) this).binding).f51930d.setText(identifier2);
            } else {
                Log.e("CommonFragment", "Resource not found for text: " + text);
            }
        }
        String method = newGuidBean.getMethod();
        if (!TextUtils.isEmpty(method)) {
            int identifier3 = getResources().getIdentifier(method, ymh.InterfaceC15723b.f102127e, requireContext().getPackageName());
            if (identifier3 != 0) {
                if (newGuidBean.isAiTip() || newGuidBean.isVoiceNoteTip()) {
                    List<TransLanguageData> languageChatGptData = AiLangUtil.parseLanguageChatGptData(getContext());
                    string = languageChatGptData != null ? getString(identifier3, String.valueOf(languageChatGptData.size())) : getString(identifier3);
                } else {
                    string = (!newGuidBean.isTransTip() || (languageData = AiLangUtil.parseLanguageData(getContext())) == null) ? getString(identifier3) : getString(identifier3, String.valueOf(languageData.size()));
                }
                ((ju6) ((BaseBluetoothFragment) this).binding).f51920F.setText(string);
            } else {
                Log.e("CommonFragment", "Resource not found for text: " + method);
            }
        }
        String jump = newGuidBean.getJump();
        if (!TextUtils.isEmpty(jump)) {
            int identifier4 = getResources().getIdentifier(jump, ymh.InterfaceC15723b.f102127e, requireContext().getPackageName());
            if (identifier4 != 0) {
                ((ju6) ((BaseBluetoothFragment) this).binding).f51931e.setText(getString(identifier4));
            } else {
                Log.e("CommonFragment", "Resource not found for text: " + method);
            }
        }
        ((ju6) ((BaseBluetoothFragment) this).binding).f51932f.setOnClickListener(new ViewOnClickListenerC2788b(tabNameMode));
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment, p000.wu0
    public void addNetDisposable(mf4 disposable) {
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment, p000.wu0
    public String getPageName() {
        return "guide";
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        ekg ekgVar = this.tabNameMode;
        if (ekgVar != null) {
            int id = ekgVar.getId();
            setOnBluetoothSettingsListener(this);
            NewGuidBean newGuidBeanById = getNewGuidBeanById(id);
            if (newGuidBeanById != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("newGuidBean =");
                sb.append(newGuidBeanById.getDescription());
                showView(newGuidBeanById, this.tabNameMode);
            }
        }
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment
    public void loadData() {
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment.InterfaceC2567e
    public void onBondFail() {
        this.isConnectBt = false;
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment.InterfaceC2567e
    public void onBondSuccess(BluetoothDevice device) {
        this.isConnectBt = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@hib Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.tabNameMode = (ekg) getArguments().getSerializable(ARG_TAB_NAME_MODE);
        }
        kcb kcbVar = new kcb(this);
        this.mPresenter = kcbVar;
        kcbVar.requestData();
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment.InterfaceC2567e
    public void onGetFirstDeviceSuccess(BluetoothDevice activeDevice) {
        this.isConnectBt = true;
    }

    @Override // p000.ad7.InterfaceC0178a
    public void onGetRecListSuccess(List<NewGuidBean> list, boolean hasMore, boolean isCache, boolean isRefresh) {
        this.listData.addAll(list);
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled() && PermissionUtil.isHasScanPermission(getActivity()) && PermissionUtil.isHasConnectPermission(getActivity())) {
            searBoundDevice();
        }
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment.InterfaceC2567e
    public void searBoundDeviceSuccess(BluetoothDevice device) {
        this.isConnectBt = true;
    }

    @Override // com.eyevue.glassapp.base.BaseBluetoothFragment, com.watchfun.base.BaseFragment
    public ju6 provideViewBinding(ViewGroup container) {
        return ju6.inflate(getLayoutInflater(), container, false);
    }
}
