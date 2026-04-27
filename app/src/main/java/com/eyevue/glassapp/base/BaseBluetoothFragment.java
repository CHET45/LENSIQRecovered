package com.eyevue.glassapp.base;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1143j;
import com.blankj.utilcode.util.C2469b;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.dialogs.WaitingDialog;
import com.eyevue.glassapp.helper.AiWebSocketManager;
import com.eyevue.glassapp.utils.PermissionUtil;
import com.eyevue.glassapp.view.auth.EyevueLoginActivity;
import com.eyevue.glassapp.view.guidance.EyevueGuideActivity;
import com.eyevue.glassapp.view.p008qr.EyevueBindDeviceActivity;
import com.watchfun.base.BaseActivity;
import com.watchfun.base.BaseApplication;
import com.watchfun.base.BaseFragment;
import com.watchfun.theme.C4032a;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p000.AbstractC11416qc;
import p000.C9278mc;
import p000.InterfaceC5717fc;
import p000.b87;
import p000.ek9;
import p000.fpi;
import p000.i00;
import p000.j8i;
import p000.kr7;
import p000.l3h;
import p000.mc2;
import p000.mf4;
import p000.nm2;
import p000.p43;
import p000.qt2;
import p000.t77;
import p000.u77;
import p000.v21;
import p000.vfe;
import p000.wi9;
import p000.xnc;
import p000.yfb;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseBluetoothFragment<T extends j8i> extends BaseFragment {
    private static final String TAG = "BaseBluetoothFragment";
    protected T binding;
    private WaitingDialog customLoadingDialog;
    private boolean isRegisterReceiver;
    protected BaseActivity mActivity;
    private v21 mBindingDeviceDialog;
    private InterfaceC2567e mBluetoothSettingsListener;
    protected nm2 mDisposables;
    private b87 mGoSettingSetTipDialog;
    public boolean isConnectBt = false;
    private final AbstractC11416qc<String[]> mBtPermissionLauncher = registerForActivityResult(new C9278mc.k(), new InterfaceC5717fc() { // from class: oq0
        @Override // p000.InterfaceC5717fc
        public final void onActivityResult(Object obj) {
            this.f68291a.lambda$new$0((Map) obj);
        }
    });
    private final BroadcastReceiver mReceiver = new C2565c();

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseBluetoothFragment$a */
    public class C2563a implements b87.InterfaceC1776a {
        public C2563a() {
        }

        @Override // p000.b87.InterfaceC1776a
        public void onOk() {
            BaseBluetoothFragment.this.startReceiver();
            BaseBluetoothFragment.this.openBluetoothSettings();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseBluetoothFragment$b */
    public class C2564b implements v21.InterfaceC13819a {
        public C2564b() {
        }

        @Override // p000.v21.InterfaceC13819a
        public void onOk() {
            BaseBluetoothFragment.this.startActivity(new Intent(BaseBluetoothFragment.this.getActivity(), (Class<?>) EyevueBindDeviceActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseBluetoothFragment$c */
    public class C2565c extends BroadcastReceiver {
        public C2565c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            zi9.m26850d(BaseBluetoothFragment.TAG, "配对成功: action名称 = " + action);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                if (bluetoothDevice != null) {
                    String name = bluetoothDevice.getName();
                    String address = bluetoothDevice.getAddress();
                    zi9.m26850d(BaseBluetoothFragment.TAG, "配对成功: 名称 = " + name + ", MAC地址 = " + address);
                    if (intExtra == 10) {
                        zi9.m26850d(BaseBluetoothFragment.TAG, "配对取消或未配对: 名称 = " + name);
                        if (BaseBluetoothFragment.this.mBluetoothSettingsListener != null) {
                            BaseBluetoothFragment.this.mBluetoothSettingsListener.onBondFail();
                            return;
                        }
                        return;
                    }
                    if (intExtra != 12) {
                        return;
                    }
                    zi9.m26850d(BaseBluetoothFragment.TAG, "配对成功: 名称 = " + name + ", MAC地址 = " + address);
                    if (BaseBluetoothFragment.this.mBluetoothSettingsListener != null) {
                        BaseBluetoothFragment.this.mBluetoothSettingsListener.onBondSuccess(bluetoothDevice);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra2 == 10) {
                    zi9.m26850d(BaseBluetoothFragment.TAG, "蓝牙已关闭");
                    if (BaseBluetoothFragment.this.mBluetoothSettingsListener != null) {
                        BaseBluetoothFragment.this.mBluetoothSettingsListener.onBondFail();
                    }
                    ModUtils.bleCore.disconnect();
                    return;
                }
                if (intExtra2 != 12) {
                    return;
                }
                zi9.m26850d(BaseBluetoothFragment.TAG, "蓝牙已开启");
                if (PermissionUtil.isHasScanPermission(BaseBluetoothFragment.this.getActivity()) && PermissionUtil.isHasConnectPermission(BaseBluetoothFragment.this.getActivity())) {
                    BaseBluetoothFragment.this.searBoundDevice();
                    return;
                }
                return;
            }
            if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (intExtra3 == 0) {
                    zi9.m26850d(BaseBluetoothFragment.TAG, "A2DP 设备已断开连接");
                    if (BaseBluetoothFragment.this.mBluetoothSettingsListener != null) {
                        BaseBluetoothFragment.this.mBluetoothSettingsListener.onBondFail();
                        return;
                    }
                    return;
                }
                if (intExtra3 != 2) {
                    zi9.m26850d(BaseBluetoothFragment.TAG, "A2DP 设备连接状态变化: " + intExtra3);
                    return;
                }
                zi9.m26850d(BaseBluetoothFragment.TAG, "A2DP 设备已连接");
                if (PermissionUtil.isHasScanPermission(BaseBluetoothFragment.this.getActivity()) && PermissionUtil.isHasConnectPermission(BaseBluetoothFragment.this.getActivity())) {
                    BaseBluetoothFragment.this.searBoundDevice();
                    return;
                }
                return;
            }
            if ("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED".equals(action)) {
                int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 11);
                zi9.m26850d(BaseBluetoothFragment.TAG, "A2DP playingState =" + intExtra4);
                if (intExtra4 == 10) {
                    zi9.m26850d(BaseBluetoothFragment.TAG, "A2DP 音频正在播放 =" + bluetoothDevice.getName());
                    return;
                }
                if (intExtra4 == 11) {
                    zi9.m26850d(BaseBluetoothFragment.TAG, "A2DP 音频已暂停");
                    return;
                }
                zi9.m26850d(BaseBluetoothFragment.TAG, "A2DP 播放状态变化: " + intExtra4);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseBluetoothFragment$d */
    public class C2566d implements BluetoothProfile.ServiceListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BluetoothAdapter f18240a;

        public C2566d(final BluetoothAdapter val$bluetoothAdapter) {
            this.f18240a = val$bluetoothAdapter;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int profile, BluetoothProfile proxy) {
            if (profile == 2) {
                List<BluetoothDevice> connectedDevices = proxy.getConnectedDevices();
                zi9.m26850d(BaseBluetoothFragment.TAG, "设备使用 A2DP。数量 ：= " + connectedDevices);
                if (!mc2.isEmpty(connectedDevices)) {
                    BluetoothDevice bluetoothDevice = connectedDevices.get(0);
                    zi9.m26850d(BaseBluetoothFragment.TAG, "设备使用 A2DP: activeDevice 名称 = " + bluetoothDevice.getName() + "GlobalVariableContent.deviceAddress =========" + t77.f83923b);
                    zi9.m26850d(BaseBluetoothFragment.TAG, "设备使用 A2DP: activeDevice 名称 = " + bluetoothDevice.getAddress() + "GlobalVariableContent.deviceAddress =========" + t77.f83923b);
                    if (BaseBluetoothFragment.this.mBluetoothSettingsListener != null) {
                        BaseBluetoothFragment.this.mBluetoothSettingsListener.onGetFirstDeviceSuccess(bluetoothDevice);
                    }
                    zi9.m26850d(BaseBluetoothFragment.TAG, "设备使用 A2DP: activeDevice 名称 33333333333333333= " + bluetoothDevice.getAddress() + "GlobalVariableContent.deviceAddress =========" + t77.f83923b);
                    if (!t77.f83923b.equals(bluetoothDevice.getAddress())) {
                        zi9.m26850d(BaseBluetoothFragment.TAG, "GlobalVariableContent.deviceAddress = " + bluetoothDevice.getName() + "GlobalVariableContent.deviceAddress =========" + t77.f83923b);
                        if (BaseBluetoothFragment.this.mBluetoothSettingsListener != null) {
                            BaseBluetoothFragment.this.mBluetoothSettingsListener.searBoundDeviceSuccess(bluetoothDevice);
                            BaseBluetoothFragment.this.onDeviceConnected();
                            return;
                        }
                        return;
                    }
                } else if (BaseBluetoothFragment.this.mBluetoothSettingsListener != null) {
                    BaseBluetoothFragment.this.mBluetoothSettingsListener.onBondFail();
                }
                this.f18240a.closeProfileProxy(2, proxy);
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int profile) {
            zi9.m26850d(BaseBluetoothFragment.TAG, "A2DP 服务断开");
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.base.BaseBluetoothFragment$e */
    public interface InterfaceC2567e {
        void onBondFail();

        void onBondSuccess(BluetoothDevice device);

        void onGetFirstDeviceSuccess(BluetoothDevice activeDevice);

        void searBoundDeviceSuccess(BluetoothDevice device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Map map) {
        if (Build.VERSION.SDK_INT >= 31) {
            Boolean bool = (Boolean) map.get(xnc.f98625v);
            Boolean bool2 = Boolean.TRUE;
            if (bool == bool2) {
                bool = (Boolean) map.get(xnc.f98624u);
            }
            if (bool == null) {
                return;
            }
            if (bool != bool2) {
                l3h.showToastShort(getString(C2531R.string.eyevue_user_denies_permissions));
                return;
            }
            zi9.m26850d(TAG, "mBtPermissionLauncher ==PermissionUtil.checkGpsProviderEnable(this)======" + PermissionUtil.checkGpsProviderEnable(getActivity()));
            showGoSettingDialog();
        }
    }

    private void toLoginActivity(ek9 mode) {
        vfe.getInstance().putBoolean("KEY_RETRY_CONNECT_FIRST", true);
        Intent intent = new Intent(getActivity(), (Class<?>) EyevueLoginActivity.class);
        intent.putExtra(qt2.f75577a, 2);
        intent.putExtra(qt2.f75578b, mode.getCode());
        startActivity(intent);
    }

    public void addDevice() {
        if (PermissionUtil.isHasScanPermission(getActivity()) && PermissionUtil.isHasConnectPermission(getActivity())) {
            openBluetoothSettings();
        } else if (Build.VERSION.SDK_INT >= 31) {
            if (PermissionUtil.isHasScanPermission(getActivity()) && PermissionUtil.isHasConnectPermission(getActivity())) {
                return;
            }
            this.mBtPermissionLauncher.launch(new String[]{xnc.f98624u, xnc.f98625v});
        }
    }

    @Override // com.watchfun.base.BaseFragment, p000.wu0
    public void addNetDisposable(mf4 disposable) {
        if (this.mDisposables == null) {
            this.mDisposables = new nm2();
        }
        this.mDisposables.add(disposable);
    }

    public boolean checkAuth() {
        int i = t77.f83936o;
        String str = t77.f83938q;
        String str2 = t77.f83939r;
        if (i != 0) {
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    return true;
                }
                showBindDeviceDialog();
                return false;
            }
            if (i == 2) {
                showBindDeviceDialog();
                return false;
            }
        }
        return true;
    }

    public void dismissBindDeviceDialog() {
        v21 v21Var = this.mBindingDeviceDialog;
        if (v21Var != null) {
            if (v21Var.isShowing()) {
                this.mBindingDeviceDialog.dismiss();
            }
            this.mBindingDeviceDialog = null;
        }
    }

    public void dismissGoSettingDialog() {
        b87 b87Var = this.mGoSettingSetTipDialog;
        if (b87Var != null) {
            if (b87Var.isShowing()) {
                this.mGoSettingSetTipDialog.dismiss();
            }
            this.mGoSettingSetTipDialog = null;
        }
    }

    public void dismissLoadingView() {
        WaitingDialog waitingDialog = this.customLoadingDialog;
        if (waitingDialog != null) {
            waitingDialog.dismiss();
        }
    }

    @Override // com.watchfun.base.BaseFragment
    public void dispose() {
        nm2 nm2Var = this.mDisposables;
        if (nm2Var != null) {
            nm2Var.dispose();
            this.mDisposables.clear();
        }
    }

    @Override // com.watchfun.base.BaseFragment
    public View findView(@kr7 int resId) {
        return this.binding.getRoot().findViewById(resId);
    }

    @Override // com.watchfun.base.BaseFragment, p000.wu0
    public String getPageName() {
        return "";
    }

    @Override // com.watchfun.base.BaseFragment
    public View getRootView() {
        return this.binding.getRoot();
    }

    @Override // com.watchfun.base.BaseFragment, p000.wu0
    public AbstractC1143j getViewLifecycle() {
        return getLifecycle();
    }

    @Override // com.watchfun.base.BaseFragment
    public void initListener() {
    }

    @Override // com.watchfun.base.BaseFragment
    public void initView() {
    }

    @Override // com.watchfun.base.BaseFragment
    public boolean isFragmentValid() {
        return !isDetached() && isAdded();
    }

    @Override // com.watchfun.base.BaseFragment
    public abstract void loadData();

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@yfb Context context) {
        super.onAttach(context);
        this.mActivity = (BaseActivity) context;
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(@yfb LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T t = this.binding;
        if (t == null) {
            this.binding = (T) provideViewBinding(viewGroup);
            initView();
            initListener();
        } else {
            ViewGroup viewGroup2 = (ViewGroup) t.getRoot().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.binding.getRoot());
            }
        }
        return this.binding.getRoot();
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.isRegisterReceiver) {
            requireActivity().unregisterReceiver(this.mReceiver);
            this.isRegisterReceiver = false;
        }
        dispose();
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    public void onDeviceConnected() {
        String str = t77.f83923b;
        String str2 = t77.f83922a;
        StringBuilder sb = new StringBuilder();
        sb.append("mac ==========");
        sb.append(str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String valueEncoded = fpi.getValueEncoded(str2);
        String string = vfe.getInstance().getString(vfe.C14037b.f90986p);
        boolean z = vfe.getInstance().getBoolean("IS_FOLLOW_SYSTEM", true);
        if (TextUtils.isEmpty(string) || z) {
            string = Locale.getDefault().toString();
        }
        String str3 = string;
        String string2 = vfe.getInstance().getString("KEY_UID");
        if (TextUtils.isEmpty(string2)) {
            string2 = UUID.randomUUID().toString();
        }
        String str4 = string2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deviceName ==========");
        sb2.append(valueEncoded);
        wi9.initLogConfig(i00.f45339L, i00.f45338K, BaseApplication.getInstance().getString(C2531R.string.app_name), str4, str3, str, valueEncoded, C2469b.getAppVersionName());
        wi9.initEventConfig(i00.f45339L, i00.f45340M, BaseApplication.getInstance().getString(C2531R.string.app_name), str4, str3, str, valueEncoded, C2469b.getAppVersionName());
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentFirstVisible() {
        loadData();
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment
    public void onFragmentResume() {
        super.onFragmentResume();
    }

    @Override // com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    public void openBluetoothSettings() {
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // com.watchfun.base.BaseFragment
    public abstract T provideViewBinding(ViewGroup container);

    @Override // com.watchfun.base.BaseFragment
    public void replaceFragmentReload(int containerId, String fragmentName, Bundle bundle) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(fragmentName);
        if (fragmentFindFragmentByTag == null && fragmentName != null) {
            try {
                fragmentFindFragmentByTag = (Fragment) Class.forName(fragmentName).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (fragmentFindFragmentByTag != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            if (bundle != null) {
                fragmentFindFragmentByTag.setArguments(bundle);
            }
            fragmentTransactionBeginTransaction.replace(containerId, fragmentFindFragmentByTag);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public void searBoundDevice() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
            zi9.m26850d(TAG, "pairedDevices 数量 ：= " + bondedDevices);
            if (getActivity() == null || bondedDevices.isEmpty()) {
                zi9.m26850d(TAG, "没有已配对设备");
            } else {
                defaultAdapter.getProfileProxy(getActivity(), new C2566d(defaultAdapter), 2);
            }
        }
    }

    public void setOnBluetoothSettingsListener(InterfaceC2567e listener) {
        this.mBluetoothSettingsListener = listener;
    }

    public void setStatusBarHeight() {
        View viewFindView = findView(C2531R.id.status_bar_height);
        if (viewFindView != null) {
            C4032a.addMarginTopEqualStatusBarHeight(viewFindView);
        }
    }

    public void showBindDeviceDialog() {
        dismissBindDeviceDialog();
        if (this.mBindingDeviceDialog == null) {
            this.mBindingDeviceDialog = new v21(getActivity(), new C2564b());
        }
        if (this.mBindingDeviceDialog.isShowing()) {
            return;
        }
        this.mBindingDeviceDialog.show();
    }

    public void showGoSettingDialog() {
        dismissGoSettingDialog();
        if (this.mGoSettingSetTipDialog == null) {
            this.mGoSettingSetTipDialog = new b87(getActivity(), new C2563a());
        }
        if (this.mGoSettingSetTipDialog.isShowing()) {
            return;
        }
        this.mGoSettingSetTipDialog.show();
    }

    public void showGuideAct() {
        String str = t77.f83923b + p43.f69617m + u77.f86971o;
        if (vfe.getInstance().getBoolean(str, true)) {
            startActivity(new Intent(requireActivity(), (Class<?>) EyevueGuideActivity.class));
            vfe.getInstance().putBoolean(str, false);
        }
    }

    public void showLoadingView() {
        if (this.customLoadingDialog == null) {
            this.customLoadingDialog = new WaitingDialog(false);
        }
        this.customLoadingDialog.show(getParentFragmentManager(), "base");
    }

    public void startReceiver() {
        zi9.m26850d(TAG, "配对成功: startReceiver = ");
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        requireActivity().registerReceiver(this.mReceiver, intentFilter);
        this.isRegisterReceiver = true;
    }

    public void startToTransView(Intent intent, ek9 mode) {
        int i = t77.f83936o;
        String str = t77.f83938q;
        vfe.getInstance().putBoolean("SP_KEY_SUPPORT_TRANS_STATUS", true);
        String str2 = t77.f83939r;
        String str3 = t77.f83923b;
        if (i == 0) {
            AiWebSocketManager.getInstance().setCanUseAi(false);
            AiWebSocketManager.getInstance().stopAi();
            if (this.isConnectBt) {
                toTrans(intent, mode);
                return;
            } else {
                showGoSettingDialog();
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (i == 2) {
                showBindDeviceDialog();
                return;
            } else {
                l3h.showToastShort(str);
                return;
            }
        }
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            l3h.showToastShort(getString(C2531R.string.eyevue_add_device_dialog_tip));
        } else {
            showBindDeviceDialog();
        }
    }

    public void toTrans(Intent intent, ek9 mode) {
        String string = vfe.getInstance().getString("KEY_TOKEN");
        boolean z = vfe.getInstance().getBoolean("SP_KEY_TRANS_LOGIN_SKIP", false);
        if (z) {
            startActivity(intent);
        } else if (TextUtils.isEmpty(string) || z) {
            toLoginActivity(mode);
        } else {
            startActivity(intent);
        }
    }
}
