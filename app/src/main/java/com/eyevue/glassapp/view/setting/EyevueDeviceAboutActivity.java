package com.eyevue.glassapp.view.setting;

import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.watchfun.base.BaseActivity;
import p000.C1801ba;
import p000.k95;
import p000.t77;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueDeviceAboutActivity extends BaseActivity<C1801ba> {

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.EyevueDeviceAboutActivity$a */
    public class C2873a implements ModBleResponse.OnDeviceInfoListener {
        public C2873a() {
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnDeviceInfoListener
        public void onDeviceInfo(String btVersion, String ispVersion, String deviceVersion) {
            ((C1801ba) ((BaseActivity) EyevueDeviceAboutActivity.this).binding).f13093F.setText(k95.f53074X4 + btVersion);
            ((C1801ba) ((BaseActivity) EyevueDeviceAboutActivity.this).binding).f13098Q.setText(k95.f53074X4 + ispVersion);
            ((C1801ba) ((BaseActivity) EyevueDeviceAboutActivity.this).binding).f13097N.setText(k95.f53074X4 + deviceVersion);
        }
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1801ba getViewBinding() {
        return C1801ba.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        ((C1801ba) this.binding).f13092C.setTitle(getString(C2531R.string.eyevue_device_info));
        ((C1801ba) this.binding).f13092C.hideBottomLine();
        ((C1801ba) this.binding).f13095L.setText(t77.f83922a + "");
        ModUtils.sendViaBle().appGetDevicdInfo();
        ModUtils.modBleResponse().setOnDeviceInfoListener(new C2873a());
    }
}
