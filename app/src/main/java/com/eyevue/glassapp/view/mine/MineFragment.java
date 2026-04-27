package com.eyevue.glassapp.view.mine;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.update.VersionData;
import com.eyevue.glassapp.BuildConfig;
import com.eyevue.glassapp.helper.UpdateHelper;
import com.eyevue.glassapp.view.about.EyevueAboutActivity;
import com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity;
import com.eyevue.glassapp.view.auth.EyevueLoginActivity;
import com.eyevue.glassapp.view.batterypermissions.EyevueBatteryPermissionsActivity;
import com.eyevue.glassapp.view.feedback.EyevueFeedbackActivity;
import com.eyevue.glassapp.view.guidance.NewStudentGuideActivity;
import com.eyevue.glassapp.view.language.EyevueLanguageActivity;
import com.eyevue.glassapp.view.p008qr.EyevueBindDeviceActivity;
import com.eyevue.glassapp.view.setting.EyevueSettingActivity;
import com.eyevue.glassapp.view.statement.EyevueStatementActivity;
import com.google.gson.Gson;
import com.watchfun.base.BaseFragment;
import p000.AbstractC11416qc;
import p000.bu8;
import p000.c1i;
import p000.d94;
import p000.efb;
import p000.hib;
import p000.hu8;
import p000.igg;
import p000.lx2;
import p000.m3h;
import p000.ou6;
import p000.qt2;
import p000.qwh;
import p000.swh;
import p000.t77;
import p000.vfe;
import p000.xcg;
import p000.xnc;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class MineFragment extends BaseFragment<ou6> implements View.OnClickListener, qwh.InterfaceC11753b {

    /* JADX INFO: renamed from: e */
    public static final String f18677e = "MineFragment";

    /* JADX INFO: renamed from: a */
    public AbstractC11416qc<Intent> f18678a;

    /* JADX INFO: renamed from: b */
    public swh f18679b;

    /* JADX INFO: renamed from: c */
    public boolean f18680c;

    /* JADX INFO: renamed from: d */
    public final xcg<d94> f18681d = new xcg() { // from class: yva
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f103143a.lambda$new$1((d94) obj);
        }
    };

    private void checkStoragePermission(VersionData versionData, boolean isClick) {
        if (lx2.checkSelfPermission(getActivity(), xnc.f98580E) != 0) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{xnc.f98580E}, 10000);
        } else {
            UpdateHelper.getInstance().checkVersion(getActivity(), versionData, this.f18678a, isClick);
        }
    }

    private VersionData getData(String text) {
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        return (VersionData) new Gson().fromJson(text, VersionData.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(d94 d94Var) {
        int i = d94Var.f28798a;
        if (i == 1 || i == 3) {
            String str = t77.f83939r;
            StringBuilder sb = new StringBuilder();
            sb.append("mine  authCode = ");
            sb.append(str);
            if (!TextUtils.isEmpty(str)) {
                ((ou6) this.binding).f68785b.setText(C2531R.string.eyevue_already_binding);
                ((ou6) this.binding).f68789d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else {
                ((ou6) this.binding).f68785b.setText(C2531R.string.eyevue_binding_device);
                ((ou6) this.binding).f68789d.setText("");
                ((ou6) this.binding).f68789d.setCompoundDrawablesWithIntrinsicBounds(0, 0, C2531R.drawable.ic_bv_more, 0);
            }
        }
    }

    public static MineFragment newInstance() {
        return new MineFragment();
    }

    private void toLogin() {
        Intent intent = new Intent(getActivity(), (Class<?>) EyevueLoginActivity.class);
        intent.putExtra(qt2.f75577a, 0);
        startActivity(intent);
    }

    private void toSetting() {
        startActivity(new Intent(getActivity(), (Class<?>) EyevueSettingActivity.class));
    }

    @Override // com.watchfun.base.BaseFragment
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ou6 provideViewBinding(ViewGroup container) {
        return ou6.inflate(getLayoutInflater(), container, false);
    }

    @Override // com.watchfun.base.BaseFragment, p000.wu0
    public String getPageName() {
        return "mi";
    }

    @Override // com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        zgb.defaultCenter().subscriber(d94.class, this.f18681d);
        this.f18679b = new swh(this);
        ((ou6) this.binding).f68787c.setOnClickListener(this);
        ((ou6) this.binding).f68781Z.setOnClickListener(this);
        ((ou6) this.binding).f68784a2.setOnClickListener(this);
        ((ou6) this.binding).f68771F.setOnClickListener(this);
        ((ou6) this.binding).f68782Z1.setOnClickListener(this);
        ((ou6) this.binding).f68780Y.setOnClickListener(this);
        ((ou6) this.binding).f68777Q.setOnClickListener(this);
        ((ou6) this.binding).f68792m.setOnClickListener(this);
        ((ou6) this.binding).f68773L.setOnClickListener(this);
        ((ou6) this.binding).f68772H.setOnClickListener(this);
        ((ou6) this.binding).f68790e.setOnClickListener(this);
        ((ou6) this.binding).f68778V1.setOnClickListener(this);
        String string = vfe.getInstance().getString("CURRENT_LANGUAGE");
        if (TextUtils.isEmpty(string)) {
            ((ou6) this.binding).f68774M.setText(C2531R.string.is_follow_system);
        } else {
            ((ou6) this.binding).f68774M.setText(bu8.getLanguageString(string, getActivity()));
        }
        ((ou6) this.binding).f68778V1.setText("v" + c1i.getVersion(getActivity()));
    }

    @Override // com.watchfun.base.BaseFragment
    public void loadData() {
    }

    @Override // p000.qwh.InterfaceC11753b
    public void loadVersionSuccess(VersionData versionData, boolean isCache) {
        String str = "v" + c1i.getVersion(getActivity());
        if (!versionData.isNeedUpdate() || versionData.getVersion().equals(str)) {
            vfe.getInstance().putString("SP_UPDATE_DATA", "");
            UpdateHelper.getInstance().deleteApkIfExists(getActivity());
            return;
        }
        this.f18680c = false;
        vfe.getInstance().putBoolean("SP_UPDATE_GET", true);
        vfe.getInstance().putString("SP_UPDATE_DATA", VersionData.toJson(versionData));
        checkStoragePermission(versionData, this.f18680c);
        ((ou6) this.binding).f68778V1.setText(C2531R.string.eyevue_check_app_name);
    }

    @Override // android.view.View.OnClickListener
    @igg({"NonConstantResourceId"})
    public void onClick(View v) {
        if (v.getId() == C2531R.id.login_layout || v.getId() == C2531R.id.tv_user_info) {
            String string = vfe.getInstance().getString("KEY_TOKEN");
            String string2 = vfe.getInstance().getString("KEY_LOGIN_EMAIL");
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                toLogin();
                return;
            } else {
                toSetting();
                return;
            }
        }
        if (v.getId() == C2531R.id.user_feedback) {
            startActivity(new Intent(getActivity(), (Class<?>) EyevueFeedbackActivity.class));
            return;
        }
        if (v.getId() == C2531R.id.update_app) {
            return;
        }
        if (v.getId() == C2531R.id.mine_about) {
            startActivity(new Intent(getActivity(), (Class<?>) EyevueAboutActivity.class));
            return;
        }
        if (v.getId() == C2531R.id.update_language) {
            startActivity(new Intent(getActivity(), (Class<?>) EyevueLanguageActivity.class));
            return;
        }
        if (v.getId() == C2531R.id.tv_user_agreement) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(getActivity(), (Class<?>) EyevueStatementActivity.class);
            bundle.putBoolean("isUserAgreement", true);
            bundle.putString("url", BuildConfig.DEFAULT_USER_AGREEMENT_HTML);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        if (v.getId() == C2531R.id.tv_privacy_policy) {
            Bundle bundle2 = new Bundle();
            Intent intent2 = new Intent(getActivity(), (Class<?>) EyevueStatementActivity.class);
            bundle2.putBoolean("isUserAgreement", false);
            bundle2.putString("url", BuildConfig.DEFAULT_PRIVACY_HTML);
            intent2.putExtras(bundle2);
            startActivity(intent2);
            return;
        }
        if (v.getId() == C2531R.id.mine_permission) {
            startActivity(new Intent(getActivity(), (Class<?>) EyevueBatteryPermissionsActivity.class));
            return;
        }
        if (v.getId() == C2531R.id.mine_beginner_guide) {
            startActivity(new Intent(getActivity(), (Class<?>) NewStudentGuideActivity.class));
            return;
        }
        if (v.getId() != C2531R.id.bind_device_layout) {
            if (v.getId() == C2531R.id.btn_alarm) {
                startActivity(new Intent(getContext(), (Class<?>) EyevueAlarmClockActivity.class));
                return;
            }
            return;
        }
        String str = t77.f83939r;
        StringBuilder sb = new StringBuilder();
        sb.append("authCode = ");
        sb.append(str);
        String str2 = t77.f83923b;
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                m3h.showToastShort(getString(C2531R.string.eyevue_add_device_dialog_tip));
            } else {
                startActivity(new Intent(getActivity(), (Class<?>) EyevueBindDeviceActivity.class));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@hib Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(@efb LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        hu8.setLanguage(getActivity());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(d94.class, this.f18681d);
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentFirstVisible() {
        super.onFragmentFirstVisible();
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentResume() {
        super.onFragmentResume();
        hu8.setLanguage(getActivity());
        String str = t77.f83939r;
        StringBuilder sb = new StringBuilder();
        sb.append("authCode = ");
        sb.append(str);
        if (!TextUtils.isEmpty(str)) {
            ((ou6) this.binding).f68785b.setText(C2531R.string.eyevue_already_binding);
            ((ou6) this.binding).f68789d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            ((ou6) this.binding).f68785b.setText(C2531R.string.eyevue_binding_device);
            ((ou6) this.binding).f68789d.setText("");
            ((ou6) this.binding).f68789d.setCompoundDrawablesWithIntrinsicBounds(0, 0, C2531R.drawable.ic_bv_more, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @efb String[] permissions2, @efb int[] grantResults) {
        VersionData data;
        super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
        if (requestCode == 10000 && grantResults.length > 0 && grantResults[0] == 0) {
            String string = vfe.getInstance().getString("SP_UPDATE_DATA");
            if (TextUtils.isEmpty(string) || (data = getData(string)) == null) {
                return;
            }
            String str = "v" + c1i.getVersion(getActivity());
            if (!data.isNeedUpdate() || data.getVersion().equals(str)) {
                return;
            }
            UpdateHelper.getInstance().checkVersion(getActivity(), data, this.f18678a, this.f18680c);
        }
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String string = vfe.getInstance().getString("KEY_TOKEN");
        String string2 = vfe.getInstance().getString("KEY_LOGIN_EMAIL");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            ((ou6) this.binding).f68770C.setText(getString(C2531R.string.click_to_login));
        } else {
            ((ou6) this.binding).f68770C.setText(string2);
        }
    }
}
