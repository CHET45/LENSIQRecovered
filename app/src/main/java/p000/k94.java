package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.jieli.jl_bt_ota.impl.AbstractC3831a;
import com.jieli.jl_bt_ota.util.ParseDataUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class k94 {

    /* JADX INFO: renamed from: h */
    public static final String f52843h = "DeviceReConnectManager";

    /* JADX INFO: renamed from: i */
    public static final int f52844i = 3000;

    /* JADX INFO: renamed from: j */
    public static final int f52845j = 20000;

    /* JADX INFO: renamed from: k */
    public static final int f52846k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f52847l = 30000;

    /* JADX INFO: renamed from: m */
    public static long f52848m = 65000;

    /* JADX INFO: renamed from: n */
    public static final int f52849n = 2000;

    /* JADX INFO: renamed from: o */
    public static final int f52850o = 37973;

    /* JADX INFO: renamed from: p */
    public static final int f52851p = 37974;

    /* JADX INFO: renamed from: q */
    public static final int f52852q = 37975;

    /* JADX INFO: renamed from: a */
    public final Context f52853a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3831a f52854b;

    /* JADX INFO: renamed from: c */
    public volatile lqd f52855c;

    /* JADX INFO: renamed from: d */
    public long f52856d = 0;

    /* JADX INFO: renamed from: e */
    public final Map<String, n51> f52857e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Handler f52858f = new Handler(Looper.getMainLooper(), new C8242a());

    /* JADX INFO: renamed from: g */
    public final oe1 f52859g;

    /* JADX INFO: renamed from: k94$a */
    public class C8242a implements Handler.Callback {
        public C8242a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@efb Message message) {
            switch (message.what) {
                case k94.f52850o /* 37973 */:
                    k94.this.m14583b();
                    break;
                case k94.f52851p /* 37974 */:
                    dh8.m9161w(k94.f52843h, "MSG_RECONNECT_DEVICE_TIMEOUT", "" + k94.this.f52855c);
                    if (k94.this.f52855c != null) {
                        k94.this.f52855c.setState(0);
                        k94 k94Var = k94.this;
                        k94Var.m14578a(mjb.buildError(u45.f86769I, k94Var.f52855c.toString()));
                    }
                    break;
                case k94.f52852q /* 37975 */:
                    dh8.m9161w(k94.f52843h, "MSG_CONNECT_DEVICE_TIMEOUT", "" + k94.this.f52855c);
                    if (k94.this.f52855c != null) {
                        k94.this.f52855c.setState(0);
                        k94 k94Var2 = k94.this;
                        k94Var2.m14579a(k94Var2.f52855c.getAddress());
                    }
                    break;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: k94$b */
    public class C8243b extends oe1 {
        public C8243b() {
        }

        @Override // p000.oe1, p000.np7
        public void onAdapterStatus(boolean z, boolean z2) {
            if (z || !k94.this.isDeviceReconnecting()) {
                return;
            }
            dh8.m9152d(k94.f52843h, "onAdapterStatus", "bluetooth is off.");
        }

        @Override // p000.oe1, p000.np7
        public void onConnection(BluetoothDevice bluetoothDevice, int i) {
            byte[] rawData;
            if (bluetoothDevice == null || !k94.this.isDeviceReconnecting() || i == 3) {
                return;
            }
            boolean z = k94.this.f52858f.hasMessages(k94.f52852q) || k94.this.m14591f();
            dh8.m9152d(k94.f52843h, "onConnection", "isConnecting: " + z + ", status = " + i);
            if (z) {
                n51 n51Var = (n51) k94.this.f52857e.get(bluetoothDevice.getAddress());
                if (n51Var != null) {
                    dh8.m9152d(k94.f52843h, "onConnection", "bleScanMessage: " + n51Var);
                    rawData = n51Var.getRawData();
                } else {
                    rawData = null;
                }
                boolean zM14580a = k94.this.m14580a(bluetoothDevice, rawData);
                dh8.m9161w(k94.f52843h, "onConnection", kc2.formatString("device : %s, status : %d, isReConnectDevice : %s", k94.this.m14582b(bluetoothDevice), Integer.valueOf(i), Boolean.valueOf(zM14580a)));
                if (zM14580a) {
                    if (k94.this.f52855c != null) {
                        k94.this.f52855c.setState(0);
                    }
                    k94.this.f52858f.removeMessages(k94.f52852q);
                    if (i == 1 || i == 4) {
                        dh8.m9152d(k94.f52843h, "onConnection", "reconnect device success.");
                        k94.this.stopReconnectTask();
                    } else if (i == 2 || i == 0) {
                        dh8.m9157i(k94.f52843h, "onConnection", "connect device failed.");
                        k94.this.m14579a(bluetoothDevice.getAddress());
                    }
                }
            }
        }

        @Override // p000.oe1, p000.np7
        public void onDiscovery(BluetoothDevice bluetoothDevice, n51 n51Var) {
            byte[] rawData;
            if (bluetoothDevice == null || !k94.this.isDeviceReconnecting()) {
                return;
            }
            if (n51Var != null) {
                k94.this.f52857e.put(bluetoothDevice.getAddress(), n51Var);
                rawData = n51Var.getRawData();
            } else {
                rawData = null;
            }
            boolean zM14580a = k94.this.m14580a(bluetoothDevice, rawData);
            dh8.m9152d(k94.f52843h, "onDiscovery", kc2.formatString("isReConnectDevice : %s, device : %s", Boolean.valueOf(zM14580a), k94.this.m14582b(bluetoothDevice)));
            if (zM14580a) {
                k94.this.m14577a(bluetoothDevice);
                k94.this.m14594g();
            }
        }

        @Override // p000.oe1, p000.np7
        public void onDiscoveryStatus(boolean z, boolean z2) {
            dh8.m9152d(k94.f52843h, "onDiscoveryStatus", "bStart : " + z2);
            if (!k94.this.isDeviceReconnecting() || k94.this.m14591f()) {
                return;
            }
            if (!z2) {
                dh8.m9152d(k94.f52843h, "onDiscoveryStatus", "ready start scan");
                k94.this.f52858f.removeMessages(k94.f52850o);
                k94.this.f52858f.sendEmptyMessageDelayed(k94.f52850o, 1000L);
            } else {
                if (k94.this.f52855c == null || k94.this.f52855c.getState() != 0) {
                    return;
                }
                k94.this.f52855c.setState(1);
            }
        }
    }

    public k94(@efb Context context, @efb AbstractC3831a abstractC3831a) {
        C8243b c8243b = new C8243b();
        this.f52859g = c8243b;
        this.f52853a = context;
        this.f52854b = abstractC3831a;
        abstractC3831a.registerBluetoothCallback(c8243b);
    }

    /* JADX INFO: renamed from: c */
    private long m14585c() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    private long m14587d() {
        long jM14585c = f52848m - (m14585c() - this.f52856d);
        if (jM14585c < 0) {
            return 0L;
        }
        return jM14585c;
    }

    /* JADX INFO: renamed from: e */
    private lqd m14589e() {
        if (this.f52855c == null) {
            return null;
        }
        return this.f52855c.cloneObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public boolean m14591f() {
        return m14589e() != null && m14589e().getState() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m14594g() {
        dh8.m9152d(f52843h, "stopScan", "---->");
        this.f52854b.stopBLEScan();
        this.f52854b.stopDeviceScan();
    }

    public String getReconnectAddress() {
        lqd lqdVarM14589e = m14589e();
        if (lqdVarM14589e == null) {
            return null;
        }
        return lqdVarM14589e.getAddress();
    }

    public boolean isDeviceReconnecting() {
        return this.f52858f.hasMessages(f52851p);
    }

    public boolean isWaitingForUpdate() {
        return m14589e() != null;
    }

    public void release() {
        setReConnectDevMsg(null);
        stopReconnectTask();
        this.f52854b.unregisterBluetoothCallback(this.f52859g);
        this.f52858f.removeCallbacksAndMessages(null);
    }

    public void setReConnectDevMsg(lqd lqdVar) {
        if (this.f52855c != lqdVar) {
            this.f52855c = lqdVar;
            this.f52857e.clear();
            dh8.m9152d(f52843h, "setReConnectDevMsg", "" + lqdVar);
        }
    }

    public void setReconnectAddress(String str) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            setReConnectDevMsg(null);
            return;
        }
        if (this.f52855c == null) {
            setReConnectDevMsg(new lqd(this.f52854b.getBluetoothOption().getPriority(), str));
            return;
        }
        this.f52855c.setAddress(str);
        dh8.m9152d(f52843h, "setReconnectAddress", "" + this.f52855c);
    }

    public void setReconnectUseADV(boolean z) {
        if (this.f52855c != null) {
            this.f52855c.setUseADV(z);
        }
    }

    public void startReconnectTask() {
        if (isDeviceReconnecting()) {
            return;
        }
        String str = f52843h;
        dh8.m9157i(str, "startReconnectTask", "start....");
        m14576a(m14585c());
        dh8.m9157i(str, "startReconnectTask", "timeout = " + f52848m);
        this.f52858f.sendEmptyMessageDelayed(f52851p, f52848m);
        this.f52858f.sendEmptyMessage(f52850o);
    }

    public void stopReconnectTask() {
        boolean zIsDeviceReconnecting = isDeviceReconnecting();
        boolean zIsWaitingForUpdate = isWaitingForUpdate();
        dh8.m9157i(f52843h, "stopReconnectTask", "isReconnecting : " + zIsDeviceReconnecting + ", isWaitingForUpdate : " + zIsWaitingForUpdate);
        m14576a(0L);
        setReConnectDevMsg(null);
        m14594g();
        this.f52858f.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m14580a(BluetoothDevice bluetoothDevice, byte[] bArr) {
        lqd lqdVarM14589e;
        if (bluetoothDevice == null || (lqdVarM14589e = m14589e()) == null) {
            return false;
        }
        String address = lqdVarM14589e.getAddress();
        if (!BluetoothAdapter.checkBluetoothAddress(address)) {
            return false;
        }
        String str = f52843h;
        dh8.m9152d(str, "checkIsReconnectDevice", "device : " + m14582b(bluetoothDevice));
        if (!lqdVarM14589e.isUseADV()) {
            return address.equals(bluetoothDevice.getAddress());
        }
        dh8.m9152d(str, "checkIsReconnectDevice", "advertiseRawData : " + pk1.byte2HexStr(bArr));
        n51 oTAFlagFilterWithBroad = ParseDataUtil.parseOTAFlagFilterWithBroad(bArr, ch8.f16534E);
        if (oTAFlagFilterWithBroad == null) {
            return false;
        }
        dh8.m9152d(str, "checkIsReconnectDevice", "" + oTAFlagFilterWithBroad);
        return address.equalsIgnoreCase(oTAFlagFilterWithBroad.getOldBleAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m14583b() {
        int iStartBLEScan;
        lqd lqdVarM14589e = m14589e();
        if (lqdVarM14589e == null) {
            dh8.m9161w(f52843h, "doReconnectTask", "reConnectDevMsg is null.");
            stopReconnectTask();
            return;
        }
        if (!v91.isBluetoothEnable()) {
            dh8.m9161w(f52843h, "doReconnectTask", "Bluetooth is close.");
            this.f52858f.removeMessages(f52850o);
            this.f52858f.sendEmptyMessageDelayed(f52850o, 3000L);
            return;
        }
        if (lqdVarM14589e.getState() == 2) {
            dh8.m9161w(f52843h, "doReconnectTask", "Task is connecting. " + lqdVarM14589e);
            if (this.f52858f.hasMessages(f52852q)) {
                return;
            }
            this.f52858f.sendEmptyMessageDelayed(f52852q, 30000L);
            return;
        }
        boolean zIsConnectedDevice = this.f52854b.isConnectedDevice();
        String str = f52843h;
        dh8.m9157i(str, "doReconnectTask", lqdVarM14589e + ", isDevConnected : " + zIsConnectedDevice);
        if (zIsConnectedDevice) {
            dh8.m9157i(str, "doReconnectTask", "device is connected. " + lqdVarM14589e + ", device = " + this.f52854b.getConnectedDevice());
            return;
        }
        BluetoothDevice bluetoothDeviceM14581b = m14581b(lqdVarM14589e.getAddress());
        dh8.m9161w(str, "doReconnectTask", "connectedDevice : " + m14582b(bluetoothDeviceM14581b));
        if (bluetoothDeviceM14581b != null) {
            m14577a(bluetoothDeviceM14581b);
            return;
        }
        if (lqdVarM14589e.isUseADV() && lqdVarM14589e.getWay() != 0) {
            lqdVarM14589e.setWay(0);
        }
        if (this.f52854b.isScanning()) {
            int scanType = this.f52854b.getScanType();
            boolean z = scanType == 2;
            if (!z) {
                z = (lqdVarM14589e.getWay() == 1 && scanType == 1) || (lqdVarM14589e.getWay() == 0 && scanType == 0);
            }
            dh8.m9157i(str, "doReconnectTask", "isScanOk : " + z + ", scanType = " + scanType);
            if (z) {
                return;
            }
            m14594g();
            SystemClock.sleep(100L);
        }
        long jM14587d = m14587d();
        dh8.m9152d(str, "doReconnectTask", "leftTime ： " + jM14587d + ", beginTaskTime : " + this.f52856d);
        if (jM14587d >= f52848m - 40000 || lqdVarM14589e.isUseADV()) {
            long jMin = Math.min(jM14587d, 20000L);
            if (lqdVarM14589e.getWay() == 1) {
                iStartBLEScan = this.f52854b.startDeviceScan(jMin, 1);
                dh8.m9157i(str, "doReconnectTask", "startDeviceScan : " + iStartBLEScan + ", scanTime = " + jMin);
            } else {
                iStartBLEScan = this.f52854b.startBLEScan(jMin);
                dh8.m9157i(str, "doReconnectTask", "startBLEScan : " + iStartBLEScan + ", scanTime = " + jMin);
            }
        } else {
            int i = lqdVarM14589e.getWay() == 1 ? 0 : 2;
            long j = jM14587d - 3000;
            if (j > 0) {
                jM14587d = j;
            }
            iStartBLEScan = this.f52854b.startDeviceScan(jM14587d, i);
            dh8.m9157i(str, "doReconnectTask", "startDeviceScan : " + iStartBLEScan + ", way = " + i + ", timeout = " + jM14587d);
        }
        if (iStartBLEScan != 0) {
            this.f52858f.removeMessages(f52850o);
            this.f52858f.sendEmptyMessageDelayed(f52850o, 3000L);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14576a(long j) {
        this.f52856d = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m14577a(BluetoothDevice bluetoothDevice) {
        String str = f52843h;
        dh8.m9152d(str, "connectBtDevice", this.f52855c + ", device : " + bluetoothDevice);
        if (this.f52855c == null || this.f52855c.getState() == 2) {
            return;
        }
        this.f52855c.setState(2);
        long jM14587d = m14587d();
        dh8.m9157i(str, "connectBtDevice", "left time = " + jM14587d);
        if (jM14587d <= 2000) {
            this.f52858f.removeMessages(f52851p);
            this.f52858f.sendEmptyMessageDelayed(f52851p, 31000L);
            dh8.m9157i(str, "connectBtDevice", "reset time >>> ");
        }
        this.f52858f.removeMessages(f52852q);
        this.f52858f.sendEmptyMessageDelayed(f52852q, 30000L);
        this.f52854b.connectBluetoothDevice(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m14578a(cr0 cr0Var) {
        if (cr0Var == null) {
            return;
        }
        if (this.f52854b.isOTA()) {
            this.f52854b.errorEventCallback(cr0Var);
        }
        stopReconnectTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m14579a(String str) {
        long jM14587d = m14587d();
        String str2 = f52843h;
        dh8.m9152d(str2, "dealWithConnectFailed", "address : " + str + ", Left Time = " + jM14587d);
        if (jM14587d <= 2000) {
            dh8.m9157i(str2, "dealWithConnectFailed", "time not enough.");
            m14578a(mjb.buildError(u45.f86770J, str));
        } else {
            dh8.m9157i(str2, "dealWithConnectFailed", "resume reconnect task.");
            this.f52858f.removeMessages(f52850o);
            this.f52858f.sendEmptyMessage(f52850o);
        }
    }

    /* JADX INFO: renamed from: b */
    private BluetoothDevice m14581b(String str) {
        List<BluetoothDevice> systemConnectedBtDeviceList;
        if (BluetoothAdapter.checkBluetoothAddress(str) && (systemConnectedBtDeviceList = v91.getSystemConnectedBtDeviceList(this.f52853a)) != null && !systemConnectedBtDeviceList.isEmpty()) {
            for (BluetoothDevice bluetoothDevice : systemConnectedBtDeviceList) {
                if (str.equals(bluetoothDevice.getAddress())) {
                    return bluetoothDevice;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m14582b(BluetoothDevice bluetoothDevice) {
        return v91.printBtDeviceInfo(this.f52853a, bluetoothDevice);
    }
}
