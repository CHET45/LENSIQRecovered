package p000;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w81 extends a91 {

    /* JADX INFO: renamed from: A */
    public C14470b f93550A;

    /* JADX INFO: renamed from: B */
    public final BluetoothProfile.ServiceListener f93551B;

    /* JADX INFO: renamed from: y */
    public BluetoothHeadset f93552y;

    /* JADX INFO: renamed from: z */
    public BluetoothA2dp f93553z;

    /* JADX INFO: renamed from: w81$a */
    public class C14469a implements BluetoothProfile.ServiceListener {
        public C14469a() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            dh8.m9157i(w81.this.f90274a, "onServiceConnected", "profile : " + i);
            if (2 == i) {
                w81.this.f93553z = (BluetoothA2dp) bluetoothProfile;
            } else if (1 == i) {
                w81.this.f93552y = (BluetoothHeadset) bluetoothProfile;
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
            dh8.m9157i(w81.this.f90274a, "onServiceDisconnected", "profile : " + i);
            if (2 == i) {
                w81.this.f93553z = null;
            } else if (1 == i) {
                w81.this.f93552y = null;
            }
        }
    }

    /* JADX INFO: renamed from: w81$b */
    public class C14470b extends BroadcastReceiver {
        private C14470b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (TextUtils.isEmpty(action) || bluetoothDevice == null) {
                    return;
                }
                Objects.requireNonNull(action);
                switch (action) {
                    case "android.bluetooth.device.action.UUID":
                        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
                        if (parcelableArrayExtra == null) {
                            dh8.m9157i(w81.this.f90274a, "ACTION_UUID", "No uuids.");
                            break;
                        } else {
                            ParcelUuid[] parcelUuidArr = new ParcelUuid[parcelableArrayExtra.length];
                            for (int i = 0; i < parcelableArrayExtra.length; i++) {
                                parcelUuidArr[i] = ParcelUuid.fromString(parcelableArrayExtra[i].toString());
                                dh8.m9152d(w81.this.f90274a, "ACTION_UUID", "uuid : " + parcelUuidArr[i].toString());
                            }
                            break;
                        }
                        break;
                    case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED":
                        try {
                            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            dh8.m9157i(w81.this.f90274a, "HFP#ACTION_CONNECTION_STATE_CHANGED", "device : " + w81.this.m23866z(bluetoothDevice) + ", state : " + intExtra);
                            w81.this.onHfpStatus(bluetoothDevice, intExtra);
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                        break;
                    case "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED":
                        try {
                            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            dh8.m9157i(w81.this.f90274a, "A2DP#ACTION_CONNECTION_STATE_CHANGED", "device : " + w81.this.m23866z(bluetoothDevice) + ", state : " + intExtra2);
                            w81.this.onA2dpStatus(bluetoothDevice, intExtra2);
                            break;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                        break;
                }
            }
        }

        public /* synthetic */ C14470b(w81 w81Var, C14469a c14469a) {
            this();
        }
    }

    public w81(Context context) {
        super(context);
        this.f93551B = new C14469a();
        m24405a(context);
        m24404a();
    }

    /* JADX INFO: renamed from: a */
    private void m24405a(Context context) {
        if (context == null) {
            return;
        }
        BluetoothAdapter bluetoothAdapter = this.f90275b;
        if (bluetoothAdapter == null) {
            dh8.m9155e(this.f90274a, "init", "The device does not support Bluetooth function.");
            return;
        }
        if (this.f93553z == null) {
            try {
                if (!bluetoothAdapter.getProfileProxy(context, this.f93551B, 2)) {
                    dh8.m9155e(this.f90274a, "init", "Failed to obtain a2dp manager.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f93552y == null) {
            try {
                if (this.f90275b.getProfileProxy(context, this.f93551B, 1)) {
                    return;
                }
                dh8.m9155e(this.f90274a, "init", "Failed to obtain hfp manager.");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m24408b(String str, BluetoothDevice bluetoothDevice) {
        if (m24409c(str, bluetoothDevice)) {
            return true;
        }
        if (this.f93552y != null) {
            return false;
        }
        dh8.m9161w(this.f90274a, str, "No hfp manager.");
        return true;
    }

    /* JADX INFO: renamed from: c */
    private boolean m24409c(String str, BluetoothDevice bluetoothDevice) {
        if (!kc2.checkHasConnectPermission(this.f90279f)) {
            dh8.m9161w(this.f90274a, str, "Missing connect permissions.");
            return true;
        }
        if (bluetoothDevice == null) {
            dh8.m9161w(this.f90274a, str, "Device is null.");
            return true;
        }
        if (v91.isBluetoothEnable()) {
            return false;
        }
        dh8.m9161w(this.f90274a, str, "Bluetooth is off.");
        return true;
    }

    /* JADX INFO: renamed from: M */
    public boolean m24410M(String str) {
        return disconnectFromA2dp(v91.getRemoteDevice(str));
    }

    /* JADX INFO: renamed from: N */
    public BluetoothHeadset m24411N() {
        return this.f93552y;
    }

    /* JADX INFO: renamed from: O */
    public BluetoothA2dp m24412O() {
        return this.f93553z;
    }

    public boolean deviceHasA2dp(BluetoothDevice bluetoothDevice) {
        return v91.deviceHasProfile(this.f90279f, bluetoothDevice, x81.f97150q);
    }

    public boolean deviceHasHfp(BluetoothDevice bluetoothDevice) {
        return v91.deviceHasProfile(this.f90279f, bluetoothDevice, x81.f97149p);
    }

    @igg({"MissingPermission"})
    public boolean disconnectByProfiles(BluetoothDevice bluetoothDevice) {
        boolean zDisconnectFromHfp = false;
        if (m24409c("disconnectByProfiles", bluetoothDevice)) {
            return false;
        }
        dh8.m9152d(this.f90274a, "disconnectByProfiles", "device : " + m23866z(bluetoothDevice));
        if (bluetoothDevice.getType() != 2) {
            int iIsConnectedByA2dp = isConnectedByA2dp(bluetoothDevice);
            if (iIsConnectedByA2dp == 2) {
                zDisconnectFromHfp = disconnectFromA2dp(bluetoothDevice);
                dh8.m9157i(this.f90274a, "disconnectByProfiles", "disconnectFromA2dp : " + zDisconnectFromHfp);
            }
            int iIsConnectedByHfp = isConnectedByHfp(bluetoothDevice);
            if (iIsConnectedByHfp == 2) {
                zDisconnectFromHfp = disconnectFromHfp(bluetoothDevice);
                dh8.m9157i(this.f90274a, "disconnectByProfiles", "disconnectFromHfp : " + zDisconnectFromHfp);
            }
            if (iIsConnectedByA2dp == 0 && iIsConnectedByHfp == 0) {
                dh8.m9152d(this.f90274a, "disconnectByProfiles", "Classic Bluetooth is disconnected.");
                return true;
            }
        }
        return zDisconnectFromHfp;
    }

    public boolean disconnectFromA2dp(BluetoothDevice bluetoothDevice) {
        if (m24406a("disconnectFromA2dp", bluetoothDevice)) {
            return false;
        }
        int iIsConnectedByA2dp = isConnectedByA2dp(bluetoothDevice);
        dh8.m9152d(this.f90274a, "disconnectFromA2dp", "deviceA2dpStatus : " + iIsConnectedByA2dp);
        if (iIsConnectedByA2dp == 0) {
            dh8.m9152d(this.f90274a, "disconnectFromA2dp", "A2dp is disconnected.");
            return true;
        }
        boolean zDisconnectDeviceA2dp = iIsConnectedByA2dp == 2 ? v91.disconnectDeviceA2dp(this.f90279f, this.f93553z, bluetoothDevice) : false;
        dh8.m9152d(this.f90274a, "disconnectFromA2dp", " -------------> " + zDisconnectDeviceA2dp);
        return zDisconnectDeviceA2dp;
    }

    public boolean disconnectFromHfp(BluetoothDevice bluetoothDevice) {
        if (m24408b("disconnectFromHfp", bluetoothDevice)) {
            return false;
        }
        int iIsConnectedByHfp = isConnectedByHfp(bluetoothDevice);
        dh8.m9152d(this.f90274a, "disconnectFromHfp", "deviceHfpStatus : " + iIsConnectedByHfp);
        if (iIsConnectedByHfp == 0) {
            dh8.m9157i(this.f90274a, "disconnectFromHfp", "Hfp is disconnected");
            return true;
        }
        boolean zDisconnectDeviceHfp = iIsConnectedByHfp == 2 ? v91.disconnectDeviceHfp(this.f90279f, this.f93552y, bluetoothDevice) : false;
        dh8.m9157i(this.f90274a, "disconnectFromHfp", " ----> " + zDisconnectDeviceHfp);
        return zDisconnectDeviceHfp;
    }

    @igg({"MissingPermission"})
    public List<BluetoothDevice> getDevicesConnectedByProfile() {
        if (!kc2.checkHasConnectPermission(this.f90279f)) {
            return null;
        }
        BluetoothHeadset bluetoothHeadset = this.f93552y;
        List<BluetoothDevice> connectedDevices = bluetoothHeadset != null ? bluetoothHeadset.getConnectedDevices() : null;
        ArrayList arrayList = connectedDevices != null ? new ArrayList(connectedDevices) : null;
        BluetoothA2dp bluetoothA2dp = this.f93553z;
        if (bluetoothA2dp != null) {
            connectedDevices = bluetoothA2dp.getConnectedDevices();
        }
        if (connectedDevices != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(connectedDevices);
        }
        return arrayList;
    }

    @igg({"MissingPermission"})
    public int isConnectedByA2dp(BluetoothDevice bluetoothDevice) {
        if (m24406a("isConnectedByA2dp", bluetoothDevice)) {
            return 0;
        }
        List<BluetoothDevice> connectedDevices = this.f93553z.getConnectedDevices();
        if (connectedDevices != null) {
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    dh8.m9152d(this.f90274a, "isConnectedByA2dp", " ----> Connected");
                    return 2;
                }
            }
        }
        int connectionState = this.f93553z.getConnectionState(bluetoothDevice);
        dh8.m9152d(this.f90274a, "isConnectedByA2dp", "state : " + connectionState);
        return connectionState;
    }

    @igg({"MissingPermission"})
    public int isConnectedByHfp(BluetoothDevice bluetoothDevice) {
        if (m24408b("isConnectedByHfp", bluetoothDevice)) {
            return 0;
        }
        List<BluetoothDevice> connectedDevices = this.f93552y.getConnectedDevices();
        if (connectedDevices != null) {
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    dh8.m9152d(this.f90274a, "isConnectedByHfp", "Hfp service is connected.");
                    return 2;
                }
            }
        }
        int connectionState = this.f93552y.getConnectionState(bluetoothDevice);
        dh8.m9152d(this.f90274a, "isConnectedByHfp", "state : " + connectionState);
        return connectionState;
    }

    @igg({"MissingPermission"})
    public int isConnectedByProfile(BluetoothDevice bluetoothDevice) {
        if (m24409c("isConnectedByProfile", bluetoothDevice)) {
            return 0;
        }
        BluetoothHeadset bluetoothHeadset = this.f93552y;
        if (bluetoothHeadset == null || this.f93553z == null) {
            dh8.m9161w(this.f90274a, "isConnectedByProfile", "No hfp manager or a2dp manager.");
            return 0;
        }
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        if (connectedDevices != null) {
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    dh8.m9152d(this.f90274a, "isConnectedByProfile", "Hfp service is connected.");
                    return 2;
                }
            }
        }
        List<BluetoothDevice> connectedDevices2 = this.f93553z.getConnectedDevices();
        if (connectedDevices2 != null) {
            Iterator<BluetoothDevice> it2 = connectedDevices2.iterator();
            while (it2.hasNext()) {
                if (it2.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    dh8.m9152d(this.f90274a, "isConnectedByProfile", "A2dp service is connected.");
                    return 2;
                }
            }
        }
        return 0;
    }

    @Override // p000.a91, p000.v81, p000.mq7
    public void release() {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        super.release();
        m24407b();
        BluetoothA2dp bluetoothA2dp = this.f93553z;
        if (bluetoothA2dp != null && (bluetoothAdapter2 = this.f90275b) != null) {
            bluetoothAdapter2.closeProfileProxy(2, bluetoothA2dp);
            this.f93553z = null;
        }
        BluetoothHeadset bluetoothHeadset = this.f93552y;
        if (bluetoothHeadset == null || (bluetoothAdapter = this.f90275b) == null) {
            return;
        }
        bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
        this.f93552y = null;
    }

    /* JADX INFO: renamed from: b */
    private void m24407b() {
        Context context;
        C14470b c14470b = this.f93550A;
        if (c14470b == null || (context = this.f90279f) == null) {
            return;
        }
        context.unregisterReceiver(c14470b);
        this.f93550A = null;
    }

    public boolean disconnectFromHfp(String str) {
        return disconnectFromHfp(v91.getRemoteDevice(str));
    }

    /* JADX INFO: renamed from: a */
    private boolean m24406a(String str, BluetoothDevice bluetoothDevice) {
        if (m24409c(str, bluetoothDevice)) {
            return true;
        }
        if (this.f93553z != null) {
            return false;
        }
        dh8.m9161w(this.f90274a, str, "No a2dp manager.");
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m24404a() {
        if (this.f93550A != null || this.f90279f == null) {
            return;
        }
        this.f93550A = new C14470b(this, null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        this.f90279f.registerReceiver(this.f93550A, intentFilter);
    }
}
