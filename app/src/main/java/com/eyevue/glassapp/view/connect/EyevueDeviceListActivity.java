package com.eyevue.glassapp.view.connect;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.BluetoothUtil;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.database.device.DeviceInfoBean;
import com.eyevue.glassapp.database.device.DeviceListDao;
import com.eyevue.glassapp.database.device.DeviceListDatabase;
import com.watchfun.base.BaseActivity;
import p000.C2246ca;
import p000.fzd;
import p000.i91;
import p000.k84;
import p000.t77;
import p000.xcg;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueDeviceListActivity extends BaseActivity<C2246ca> {

    /* JADX INFO: renamed from: a */
    public DeviceListDao f18554a;

    /* JADX INFO: renamed from: b */
    public k84 f18555b;

    /* JADX INFO: renamed from: c */
    public boolean f18556c;

    /* JADX INFO: renamed from: d */
    public fzd f18557d;

    /* JADX INFO: renamed from: e */
    public final xcg<i91> f18558e = new xcg() { // from class: wl5
        @Override // p000.xcg
        public final void onEvent(Object obj) {
            this.f94614a.lambda$new$0((i91) obj);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.connect.EyevueDeviceListActivity$a */
    public class C2767a implements k84.InterfaceC8229d {
        public C2767a() {
        }

        @Override // p000.k84.InterfaceC8229d
        public void click(DeviceInfoBean deviceInfoBean) {
            if (t77.f83923b.equals(deviceInfoBean.getMac())) {
                return;
            }
            if (!BluetoothUtil.isBluetoothEnable()) {
                ToastUtils.showShort(EyevueDeviceListActivity.this.getString(C2531R.string.eyevue_bluetooth_is_close));
                return;
            }
            EyevueDeviceListActivity.this.f18556c = true;
            ModUtils.bleCore.disconnect();
            ModUtils.bleCore.connect(deviceInfoBean.getMac());
            DeviceListDatabase.getDatabase(EyevueDeviceListActivity.this).getDeviceListDao().updateTime(deviceInfoBean.getMac(), System.currentTimeMillis());
            EyevueDeviceListActivity.this.f18555b.setConnectingAddress(deviceInfoBean.getMac());
        }

        @Override // p000.k84.InterfaceC8229d
        public void onLongClick(DeviceInfoBean deviceInfoBean) {
            EyevueDeviceListActivity.this.showRemoveBondDialog(deviceInfoBean.getMac());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.connect.EyevueDeviceListActivity$b */
    public class C2768b implements fzd.InterfaceC6044c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18560a;

        public C2768b(final String val$mac) {
            this.f18560a = val$mac;
        }

        @Override // p000.fzd.InterfaceC6044c
        public void onAgree() {
            DeviceListDatabase.getDatabase(EyevueDeviceListActivity.this).getDeviceListDao().deleteByMac(this.f18560a);
            BluetoothDevice curBluetoothDevice = ModUtils.bleCore.getCurBluetoothDevice();
            if (t77.f83923b.equals(this.f18560a) || (curBluetoothDevice != null && this.f18560a.equals(curBluetoothDevice.getAddress()))) {
                ModUtils.sendViaBle().resetFactory();
                ModUtils.bleCore.disconnect();
            }
            BluetoothDevice remoteDevice = BluetoothUtil.getRemoteDevice(this.f18560a);
            if (remoteDevice != null) {
                BluetoothUtil.removeBond(remoteDevice);
            }
            if (EyevueDeviceListActivity.this.f18555b != null) {
                EyevueDeviceListActivity.this.f18555b.setDeviceList(EyevueDeviceListActivity.this.f18554a.getAll());
            }
        }

        @Override // p000.fzd.InterfaceC6044c
        public void onDisagree() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(i91 i91Var) {
        String str = i91Var.f46089a;
        str.hashCode();
        if (str.equals(i91.f46088f) || str.equals(i91.f46087e)) {
            if (this.f18556c) {
                this.f18556c = false;
                return;
            }
            k84 k84Var = this.f18555b;
            if (k84Var != null) {
                k84Var.setConnectingAddress("");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRemoveBondDialog(String mac) {
        fzd fzdVar = this.f18557d;
        if (fzdVar != null) {
            fzdVar.dismiss();
            this.f18557d = null;
        }
        if (TextUtils.isEmpty(mac)) {
            return;
        }
        if (this.f18557d == null) {
            this.f18557d = new fzd(this, new C2768b(mac));
        }
        fzd fzdVar2 = this.f18557d;
        if (fzdVar2 == null || fzdVar2.isShowing()) {
            return;
        }
        this.f18557d.show();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C2246ca getViewBinding() {
        return C2246ca.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        zgb.defaultCenter().subscribeStrongly(i91.class, this.f18558e);
        this.f18554a = DeviceListDatabase.getDatabase(this).getDeviceListDao();
        ((C2246ca) this.binding).f16053c.setTitle(getString(C2531R.string.string_device_list));
        ((C2246ca) this.binding).f16053c.hideBottomLine();
        this.f18555b = new k84(this, this.f18554a.getAll());
        ((C2246ca) this.binding).f16052b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((C2246ca) this.binding).f16052b.setAdapter(this.f18555b);
        this.f18555b.setOnItemClickListener(new C2767a());
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(i91.class, this.f18558e);
    }
}
