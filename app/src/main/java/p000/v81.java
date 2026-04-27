package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v81 implements op7, mq7 {

    /* JADX INFO: renamed from: b */
    public final BluetoothAdapter f90275b;

    /* JADX INFO: renamed from: c */
    public final s94 f90276c;

    /* JADX INFO: renamed from: d */
    public final qb2 f90277d;

    /* JADX INFO: renamed from: e */
    public final af1 f90278e;

    /* JADX INFO: renamed from: f */
    public final Context f90279f;

    /* JADX INFO: renamed from: h */
    public volatile BluetoothDevice f90281h;

    /* JADX INFO: renamed from: i */
    public volatile tp7 f90282i;

    /* JADX INFO: renamed from: j */
    public sp7 f90283j;

    /* JADX INFO: renamed from: k */
    public C13932b f90284k;

    /* JADX INFO: renamed from: l */
    public final boolean f90285l;

    /* JADX INFO: renamed from: a */
    public String f90274a = getClass().getSimpleName();

    /* JADX INFO: renamed from: g */
    public j91 f90280g = j91.createDefault();

    /* JADX INFO: renamed from: v81$b */
    public class C13932b extends BroadcastReceiver {
        private C13932b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothAdapter bluetoothAdapter;
            if (intent == null || !"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) || (bluetoothAdapter = v81.this.f90275b) == null) {
                return;
            }
            int state = bluetoothAdapter.getState();
            dh8.m9157i(v81.this.f90274a, "ACTION_STATE_CHANGED", "state : " + state);
            if (10 == state) {
                v81 v81Var = v81.this;
                v81Var.f90278e.onAdapterStatus(false, v81Var.f90285l);
            } else if (12 == state) {
                v81 v81Var2 = v81.this;
                v81Var2.f90278e.onAdapterStatus(true, v81Var2.f90285l);
            }
        }
    }

    public v81(Context context) {
        this.f90279f = (Context) kc2.checkNotNull(context, "Context can not be null.");
        kc2.setMainContext(context);
        this.f90275b = BluetoothAdapter.getDefaultAdapter();
        this.f90276c = new s94();
        this.f90277d = new qb2();
        this.f90285l = v91.hasBle(context);
        this.f90278e = new af1();
        m23858a();
    }

    /* JADX INFO: renamed from: a */
    private void m23858a() {
        if (this.f90284k != null || this.f90279f == null) {
            return;
        }
        this.f90284k = new C13932b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.f90279f.registerReceiver(this.f90284k, intentFilter);
    }

    /* JADX INFO: renamed from: A */
    public void m23863A(BluetoothDevice bluetoothDevice) {
        this.f90281h = bluetoothDevice;
    }

    public boolean checkDeviceIsCertify(BluetoothDevice bluetoothDevice) {
        return !this.f90280g.isUseAuthDevice() || this.f90276c.isAuthBtDevice(bluetoothDevice);
    }

    @Override // p000.mq7
    public void configure(j91 j91Var) {
        this.f90280g = (j91) kc2.checkNotNull(j91Var, "configure must not null.");
        dh8.m9152d(this.f90274a, "configure", "" + j91Var);
        this.f90283j = j91Var.getSnGenerator();
    }

    public j91 getBluetoothOption() {
        return this.f90280g;
    }

    public ob2 getCacheCommand(BluetoothDevice bluetoothDevice, xs0 xs0Var) {
        if (xs0Var == null) {
            return null;
        }
        return this.f90277d.getCommand(bluetoothDevice, xs0Var.getOpCode(), xs0Var.getOpCodeSn());
    }

    public boolean isConnectedDevice() {
        return m23864x() != null;
    }

    public void onA2dpStatus(BluetoothDevice bluetoothDevice, int i) {
        this.f90278e.onA2dpStatus(bluetoothDevice, i);
    }

    public void onAdapterStatus(boolean z, boolean z2) {
        this.f90278e.onAdapterStatus(z, z2);
    }

    public void onBleDataBlockChanged(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f90278e.onBleDataBlockChanged(bluetoothDevice, i, i2);
    }

    @Override // p000.op7
    public void onBtDeviceConnection(BluetoothDevice bluetoothDevice, int i) {
        this.f90278e.onBtDeviceConnection(bluetoothDevice, i);
    }

    public void onConnection(BluetoothDevice bluetoothDevice, int i) {
        this.f90278e.onConnection(bluetoothDevice, i);
    }

    @Override // p000.op7
    public void onError(cr0 cr0Var) {
        this.f90278e.onError(cr0Var);
    }

    public void onHfpStatus(BluetoothDevice bluetoothDevice, int i) {
        this.f90278e.onHfpStatus(bluetoothDevice, i);
    }

    public boolean registerBluetoothCallback(np7 np7Var) {
        return this.f90278e.addCallback(np7Var);
    }

    public void release() {
        dh8.m9157i(this.f90274a, "release", ">>>>>>");
        m23861b();
        this.f90276c.clear();
        this.f90277d.release();
        this.f90278e.release();
        sp7 sp7Var = this.f90283j;
        if (sp7Var != null) {
            if (sp7Var instanceof esf) {
                ((esf) sp7Var).destroy();
            }
            this.f90283j = null;
        }
    }

    public void removeCacheCommand(BluetoothDevice bluetoothDevice, xs0 xs0Var) {
        this.f90277d.removeCommandBase(bluetoothDevice, xs0Var);
    }

    public void sendCommandAsync(ob2 ob2Var, rb2 rb2Var) {
        sendCommandAsync(m23864x(), ob2Var, getBluetoothOption().getTimeoutMs(), rb2Var);
    }

    public void sendCommandResponse(ob2 ob2Var) {
        sendCommandResponse(m23864x(), ob2Var);
    }

    public boolean unregisterBluetoothCallback(np7 np7Var) {
        return this.f90278e.removeCallback(np7Var);
    }

    /* JADX INFO: renamed from: x */
    public BluetoothDevice m23864x() {
        BluetoothDevice connectedDevice = getConnectedDevice();
        if (this.f90281h == null) {
            this.f90281h = connectedDevice;
        } else if (connectedDevice != null && !v91.deviceEquals(connectedDevice, this.f90281h)) {
            this.f90281h = connectedDevice;
        }
        return this.f90281h;
    }

    /* JADX INFO: renamed from: y */
    public void m23865y(BluetoothDevice bluetoothDevice, ob2 ob2Var) {
        this.f90278e.onReceiveCommand(bluetoothDevice, ob2Var);
    }

    /* JADX INFO: renamed from: z */
    public String m23866z(BluetoothDevice bluetoothDevice) {
        return v91.printBtDeviceInfo(this.f90279f, bluetoothDevice);
    }

    /* JADX INFO: renamed from: b */
    private void m23861b() {
        Context context;
        C13932b c13932b = this.f90284k;
        if (c13932b == null || (context = this.f90279f) == null) {
            return;
        }
        context.unregisterReceiver(c13932b);
        this.f90284k = null;
    }

    public boolean isConnectedDevice(BluetoothDevice bluetoothDevice) {
        return v91.deviceEquals(m23864x(), bluetoothDevice);
    }

    public void sendCommandAsync(ob2 ob2Var, int i, rb2 rb2Var) {
        sendCommandAsync(m23864x(), ob2Var, i, rb2Var);
    }

    public void sendCommandResponse(BluetoothDevice bluetoothDevice, ob2 ob2Var) {
        m23859a(bluetoothDevice, ob2Var, 0, getBluetoothOption().getTimeoutMs(), null);
    }

    public void sendCommandAsync(BluetoothDevice bluetoothDevice, ob2 ob2Var, int i, rb2 rb2Var) {
        m23859a(bluetoothDevice, ob2Var, 1, i, rb2Var);
    }

    /* JADX INFO: renamed from: a */
    private void m23860a(cr0 cr0Var, rb2 rb2Var) {
        dh8.m9161w(this.f90274a, "cbCommandError", "callback : " + rb2Var + ", " + cr0Var);
        if (rb2Var != null) {
            rb2Var.onErrCode(cr0Var);
        } else {
            errorEventCallback(cr0Var);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23859a(BluetoothDevice bluetoothDevice, ob2 ob2Var, int i, int i2, rb2 rb2Var) {
        if (bluetoothDevice == null) {
            bluetoothDevice = m23864x();
        }
        if (bluetoothDevice == null) {
            m23860a(mjb.buildError(u45.f86784h), rb2Var);
            return;
        }
        if (ob2Var == null) {
            m23860a(mjb.buildError(4097), rb2Var);
            return;
        }
        if (!checkDeviceIsCertify(bluetoothDevice)) {
            m23860a(mjb.buildError(u45.f86773M), rb2Var);
            return;
        }
        if (this.f90282i == null) {
            dh8.m9152d(this.f90274a, "sendCommandAsync", "No data processor.");
            m23860a(mjb.buildError(u45.f86784h, "No data processor."), rb2Var);
            return;
        }
        if (i == 1) {
            ob2Var.setOpCodeSn(m23857a(bluetoothDevice));
            this.f90277d.putCommandBase(bluetoothDevice, ob2Var);
        }
        xs0 xs0VarConvert2BasePacket = qhc.convert2BasePacket(ob2Var, i);
        if (xs0VarConvert2BasePacket == null) {
            m23860a(mjb.buildError(u45.f86790n), rb2Var);
            return;
        }
        qg3 callback = new qg3().setType(0).setDevice(bluetoothDevice).setBasePacket(xs0VarConvert2BasePacket).setTimeoutMs(i2).setCallback(rb2Var);
        dh8.m9152d(this.f90274a, "sendRcspCommand", "addSendData :: cmdType : " + i + ", " + callback);
        this.f90282i.addSendData(callback);
    }

    /* JADX INFO: renamed from: a */
    private int m23857a(BluetoothDevice bluetoothDevice) {
        if (this.f90283j == null) {
            this.f90283j = new esf();
        }
        return this.f90283j.getRcspCmdSeq(bluetoothDevice);
    }
}
