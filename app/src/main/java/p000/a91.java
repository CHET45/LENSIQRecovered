package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a91 extends v81 {

    /* JADX INFO: renamed from: w */
    public static final int f672w = 4660;

    /* JADX INFO: renamed from: x */
    public static final int f673x = 4661;

    /* JADX INFO: renamed from: m */
    public final List<BluetoothDevice> f674m;

    /* JADX INFO: renamed from: n */
    public final List<BluetoothDevice> f675n;

    /* JADX INFO: renamed from: o */
    public C0098b f676o;

    /* JADX INFO: renamed from: p */
    public BluetoothLeScanner f677p;

    /* JADX INFO: renamed from: q */
    public volatile int f678q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f679r;

    /* JADX INFO: renamed from: s */
    public volatile boolean f680s;

    /* JADX INFO: renamed from: t */
    public final Handler f681t;

    /* JADX INFO: renamed from: u */
    public final BluetoothAdapter.LeScanCallback f682u;

    /* JADX INFO: renamed from: v */
    @c5e(21)
    public final ScanCallback f683v;

    /* JADX INFO: renamed from: a91$a */
    public class C0097a extends ScanCallback {
        public C0097a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            super.onScanFailed(i);
            a91.this.onError(mjb.buildError(8194, i, "Scan ble error."));
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            if (scanResult == null || scanResult.getScanRecord() == null) {
                return;
            }
            a91.this.m211a(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), scanResult.isConnectable());
        }
    }

    /* JADX INFO: renamed from: a91$b */
    public class C0098b extends BroadcastReceiver {
        private C0098b() {
        }

        @Override // android.content.BroadcastReceiver
        @igg({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            switch (action) {
                case "android.bluetooth.adapter.action.DISCOVERY_FINISHED":
                    dh8.m9152d(a91.this.f90274a, "ACTION_DISCOVERY_FINISHED", "---->");
                    a91.this.m212a(false);
                    break;
                case "android.bluetooth.adapter.action.DISCOVERY_STARTED":
                    dh8.m9152d(a91.this.f90274a, "ACTION_DISCOVERY_STARTED", "---->");
                    if (!a91.this.m222J()) {
                        a91.this.m212a(true);
                        break;
                    }
                    break;
                case "android.bluetooth.device.action.FOUND":
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice != null && !a91.this.m215a("ACTION_FOUND", true)) {
                        boolean z = (a91.this.f678q == 1 && bluetoothDevice.getType() != 2) || (a91.this.f678q == 0 && bluetoothDevice.getType() != 1) || a91.this.f678q == 2;
                        short shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) 0);
                        if (z && !a91.this.f675n.contains(bluetoothDevice)) {
                            a91.this.f675n.add(bluetoothDevice);
                            a91.this.f90278e.onDiscovery(bluetoothDevice, new n51().setRssi(shortExtra).setEnableConnect(true));
                            break;
                        }
                    }
                    break;
            }
        }

        public /* synthetic */ C0098b(a91 a91Var, C0097a c0097a) {
            this();
        }
    }

    public a91(Context context) {
        super(context);
        this.f674m = new ArrayList();
        this.f675n = new ArrayList();
        this.f679r = false;
        this.f680s = false;
        this.f681t = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: y81
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f100716a.m213a(message);
            }
        });
        this.f682u = new BluetoothAdapter.LeScanCallback() { // from class: z81
            @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
            public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                this.f104364a.m210a(bluetoothDevice, i, bArr);
            }
        };
        this.f683v = new C0097a();
        BluetoothAdapter bluetoothAdapter = this.f90275b;
        if (bluetoothAdapter != null) {
            this.f677p = bluetoothAdapter.getBluetoothLeScanner();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean m213a(Message message) {
        int i = message.what;
        if (i == 4660) {
            dh8.m9157i(this.f90274a, "MSG_STOP_EDR", "stopDeviceScan");
            stopDeviceScan();
            return false;
        }
        if (i != 4661) {
            return false;
        }
        dh8.m9157i(this.f90274a, "MSG_STOP_BLE", "stopBLEScan");
        stopBLEScan();
        return false;
    }

    @igg({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    private boolean m218b(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || !kc2.checkHasConnectPermission(this.f90279f)) {
            return false;
        }
        return bluetoothDevice.getType() == 2 || bluetoothDevice.getType() == 3;
    }

    /* JADX INFO: renamed from: c */
    private boolean m219c() {
        return v91.isBluetoothEnable();
    }

    /* JADX INFO: renamed from: d */
    private void m220d() {
        m209a(0);
        this.f679r = false;
        this.f680s = false;
        this.f674m.clear();
        this.f675n.clear();
    }

    /* JADX INFO: renamed from: I */
    public boolean m221I() {
        return this.f679r;
    }

    /* JADX INFO: renamed from: J */
    public boolean m222J() {
        return this.f680s;
    }

    public ArrayList<BluetoothDevice> getDiscoveredBluetoothDevices() {
        return this.f678q == 0 ? new ArrayList<>(this.f674m) : new ArrayList<>(this.f675n);
    }

    public int getScanType() {
        return this.f678q;
    }

    public boolean isScanning() {
        return this.f680s || this.f679r;
    }

    @Override // p000.v81
    public void onAdapterStatus(boolean z, boolean z2) {
        super.onAdapterStatus(z, z2);
        if (z) {
            return;
        }
        if (isScanning()) {
            m212a(false);
        }
        m220d();
    }

    @Override // p000.v81, p000.mq7
    public void release() {
        super.release();
        m216b();
        stopDeviceScan();
        stopBLEScan();
        m220d();
        this.f681t.removeCallbacksAndMessages(null);
    }

    @igg({"MissingPermission"})
    public int startBLEScan(long j) {
        if (m214a("startBLEScan")) {
            return u45.f86783g;
        }
        if (m222J()) {
            dh8.m9152d(this.f90274a, "startBLEScan", "stopDeviceScan");
            if (stopDeviceScan() == 0) {
                int i = 0;
                do {
                    SystemClock.sleep(30L);
                    i += 30;
                    if (i > 300) {
                        break;
                    }
                } while (this.f90275b.isDiscovering());
            }
        }
        m209a(0);
        if (j <= 0) {
            j = 8000;
        }
        if (m221I()) {
            dh8.m9157i(this.f90274a, "startBLEScan", "scanning ble ..... timeout = " + j);
            BluetoothLeScanner bluetoothLeScanner = this.f677p;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.flushPendingScanResults(this.f683v);
            }
            this.f681t.removeMessages(4661);
            this.f681t.sendEmptyMessageDelayed(4661, j);
            m212a(true);
            return 0;
        }
        if (this.f677p != null) {
            this.f677p.startScan(new ArrayList(), new ScanSettings.Builder().setScanMode(this.f90280g.getBleScanMode()).setMatchMode(1).build(), this.f683v);
            dh8.m9152d(this.f90274a, "startBLEScan", "startScan : true");
        } else {
            boolean zStartLeScan = this.f90275b.startLeScan(this.f682u);
            dh8.m9152d(this.f90274a, "startBLEScan", "startLeScan : " + zStartLeScan);
            if (!zStartLeScan) {
                return 8194;
            }
        }
        dh8.m9157i(this.f90274a, "startBLEScan", "Ready to scan, timeout : " + j);
        this.f681t.removeMessages(4661);
        this.f681t.sendEmptyMessageDelayed(4661, j);
        m212a(true);
        return 0;
    }

    @igg({"MissingPermission"})
    public int startDeviceScan(long j, int i) {
        if (i == 0) {
            return startBLEScan(j);
        }
        if (m214a("startDeviceScan")) {
            return u45.f86783g;
        }
        if (m221I()) {
            stopBLEScan();
            dh8.m9157i(this.f90274a, "startDeviceScan", "stopBLEScan.");
            SystemClock.sleep(100L);
        }
        m209a(i);
        long j2 = j <= 0 ? 8000L : j;
        if (m222J()) {
            dh8.m9152d(this.f90274a, "startDeviceScan", "scanning br/edr ..... timeout = " + j);
            this.f681t.removeMessages(4660);
            this.f681t.sendEmptyMessageDelayed(4660, j2);
            m212a(true);
            return 0;
        }
        m208a();
        boolean zStartDiscovery = this.f90275b.startDiscovery();
        dh8.m9152d(this.f90274a, "startDeviceScan", "startDiscovery : " + zStartDiscovery);
        if (!zStartDiscovery) {
            m216b();
            return 8194;
        }
        this.f681t.removeMessages(4660);
        this.f681t.sendEmptyMessageDelayed(4660, j2);
        m212a(true);
        return 0;
    }

    @igg({"MissingPermission"})
    public int stopBLEScan() {
        if (m215a("stopBLEScan", true)) {
            return u45.f86783g;
        }
        if (!m221I()) {
            this.f90278e.onDiscoveryStatus(true, false);
            return 0;
        }
        try {
            BluetoothLeScanner bluetoothLeScanner = this.f677p;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.f683v);
                dh8.m9152d(this.f90274a, "stopBLEScan", "stopScan");
            } else {
                this.f90275b.stopLeScan(this.f682u);
                dh8.m9152d(this.f90274a, "stopBLEScan", "stopLeScan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f681t.removeMessages(4661);
        m212a(false);
        return 0;
    }

    @igg({"MissingPermission"})
    public int stopDeviceScan() {
        if (m215a("stopDeviceScan", true)) {
            return u45.f86783g;
        }
        if (!m222J()) {
            this.f90278e.onDiscoveryStatus(false, false);
            return 0;
        }
        boolean zCancelDiscovery = this.f90275b.cancelDiscovery();
        dh8.m9161w(this.f90274a, "stopDeviceScan", "cancelDiscovery = " + zCancelDiscovery);
        if (!zCancelDiscovery) {
            return 8194;
        }
        this.f681t.removeMessages(4660);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private void m217b(boolean z) {
        List<BluetoothDevice> systemConnectedBtDeviceList = v91.getSystemConnectedBtDeviceList(this.f90279f);
        if (systemConnectedBtDeviceList == null || systemConnectedBtDeviceList.isEmpty()) {
            return;
        }
        for (BluetoothDevice bluetoothDevice : systemConnectedBtDeviceList) {
            if (z && m218b(bluetoothDevice)) {
                if (!this.f674m.contains(bluetoothDevice)) {
                    this.f674m.add(bluetoothDevice);
                    this.f90278e.onDiscovery(bluetoothDevice, new n51());
                }
            } else if (!z && !m218b(bluetoothDevice) && !this.f675n.contains(bluetoothDevice)) {
                this.f675n.add(bluetoothDevice);
                this.f90278e.onDiscovery(bluetoothDevice, new n51());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m209a(int i) {
        this.f678q = i;
    }

    /* JADX INFO: renamed from: a */
    private boolean m214a(String str) {
        return m215a(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m215a(String str, boolean z) {
        if (!kc2.checkHasScanPermission(this.f90279f)) {
            dh8.m9161w(this.f90274a, str, "Missing bluetooth scan permissions.");
            return true;
        }
        if (!z && !kc2.checkHasLocationPermission(this.f90279f)) {
            dh8.m9161w(this.f90274a, str, "Missing location permissions.");
            return true;
        }
        if (!v91.isBluetoothEnable()) {
            dh8.m9161w(this.f90274a, str, "Bluetooth is off.");
            return true;
        }
        if (this.f90275b != null) {
            return false;
        }
        dh8.m9161w(this.f90274a, str, "The device is not supported bluetooth.");
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m216b() {
        Context context;
        C0098b c0098b = this.f676o;
        if (c0098b == null || (context = this.f90279f) == null) {
            return;
        }
        context.unregisterReceiver(c0098b);
        this.f676o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m210a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        m211a(bluetoothDevice, i, bArr, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public void m211a(BluetoothDevice bluetoothDevice, int i, byte[] bArr, boolean z) {
        if (bluetoothDevice == null || m215a("filterDevice", true) || this.f674m.contains(bluetoothDevice)) {
            return;
        }
        this.f674m.add(bluetoothDevice);
        this.f90278e.onDiscovery(bluetoothDevice, new n51().setRawData(bArr).setRssi(i).setEnableConnect(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m212a(boolean z) {
        boolean z2 = this.f678q == 0;
        dh8.m9157i(this.f90274a, "notifyDiscoveryStatus", "scanType : " + this.f678q + ", bStart : " + z);
        if (z) {
            if (z2) {
                this.f679r = true;
                this.f674m.clear();
            } else {
                this.f680s = true;
                this.f675n.clear();
            }
        } else if (z2) {
            this.f679r = false;
        } else {
            this.f680s = false;
            this.f681t.removeMessages(4660);
            m216b();
        }
        this.f90278e.onDiscoveryStatus(z2, z);
        if (!z) {
            m209a(0);
        } else {
            m217b(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m208a() {
        if (this.f676o != null || this.f90279f == null) {
            return;
        }
        this.f676o = new C0098b(this, null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        this.f90279f.registerReceiver(this.f676o, intentFilter);
    }
}
