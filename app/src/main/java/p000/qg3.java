package p000;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes6.dex */
public class qg3 {

    /* JADX INFO: renamed from: j */
    public static final int f74335j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f74336k = 1;

    /* JADX INFO: renamed from: a */
    public int f74337a;

    /* JADX INFO: renamed from: b */
    public byte[] f74338b;

    /* JADX INFO: renamed from: c */
    public xs0 f74339c;

    /* JADX INFO: renamed from: d */
    public int f74340d;

    /* JADX INFO: renamed from: e */
    public rb2 f74341e;

    /* JADX INFO: renamed from: f */
    public BluetoothDevice f74342f;

    /* JADX INFO: renamed from: g */
    public int f74343g;

    /* JADX INFO: renamed from: h */
    public boolean f74344h;

    /* JADX INFO: renamed from: i */
    public long f74345i;

    public xs0 getBasePacket() {
        return this.f74339c;
    }

    public rb2 getCallback() {
        return this.f74341e;
    }

    public BluetoothDevice getDevice() {
        return this.f74342f;
    }

    public int getReSendCount() {
        return this.f74343g;
    }

    public byte[] getRecvData() {
        return this.f74338b;
    }

    public long getSendTime() {
        return this.f74345i;
    }

    public int getTimeoutMs() {
        return this.f74340d;
    }

    public int getType() {
        return this.f74337a;
    }

    public boolean isSend() {
        return this.f74344h;
    }

    public qg3 setBasePacket(xs0 xs0Var) {
        this.f74339c = xs0Var;
        return this;
    }

    public qg3 setCallback(rb2 rb2Var) {
        this.f74341e = rb2Var;
        return this;
    }

    public qg3 setDevice(BluetoothDevice bluetoothDevice) {
        this.f74342f = bluetoothDevice;
        return this;
    }

    public qg3 setReSendCount(int i) {
        this.f74343g = i;
        return this;
    }

    public qg3 setRecvData(byte[] bArr) {
        this.f74338b = bArr;
        return this;
    }

    public qg3 setSend(boolean z) {
        this.f74344h = z;
        return this;
    }

    public qg3 setSendTime(long j) {
        this.f74345i = j;
        return this;
    }

    public qg3 setTimeoutMs(int i) {
        this.f74340d = i;
        return this;
    }

    public qg3 setType(int i) {
        this.f74337a = i;
        return this;
    }

    public String toString() {
        return "DataInfo{type=" + this.f74337a + ", recvData=" + pk1.byte2HexStr(this.f74338b) + ", basePacket=" + this.f74339c + ", timeoutMs=" + this.f74340d + ", callback=" + this.f74341e + ", device=" + this.f74342f + ", reSendCount=" + this.f74343g + ", isSend=" + this.f74344h + ", sendTime=" + this.f74345i + '}';
    }
}
