package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@l42
@p7e({p7e.EnumC10826a.f69935b})
public class lb8 {

    /* JADX INFO: renamed from: a */
    public final nne f57061a;

    /* JADX INFO: renamed from: b */
    public final hf8 f57062b;

    @b28
    public lb8(nne nneVar, hf8 hf8Var) {
        this.f57061a = nneVar;
        this.f57062b = hf8Var;
    }

    @c5e(21)
    private static zme toScanCallbackType(int i) {
        if (i == 1) {
            return zme.CALLBACK_TYPE_ALL_MATCHES;
        }
        if (i == 2) {
            return zme.CALLBACK_TYPE_FIRST_MATCH;
        }
        if (i == 4) {
            return zme.CALLBACK_TYPE_MATCH_LOST;
        }
        kfe.m14730w("Unknown callback type %d -> check android.bluetooth.le.ScanSettings", Integer.valueOf(i));
        return zme.CALLBACK_TYPE_UNKNOWN;
    }

    public ife create(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        return new ife(bluetoothDevice, i, System.nanoTime(), this.f57061a.parseFromBytes(bArr), zme.CALLBACK_TYPE_UNSPECIFIED, gf8.LEGACY_UNKNOWN);
    }

    @c5e(21)
    public ife create(ScanResult scanResult) {
        return new ife(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new mne(scanResult.getScanRecord(), this.f57061a), zme.CALLBACK_TYPE_BATCH, this.f57062b.check(scanResult));
    }

    @c5e(21)
    public ife create(int i, ScanResult scanResult) {
        return new ife(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new mne(scanResult.getScanRecord(), this.f57061a), toScanCallbackType(i), this.f57062b.check(scanResult));
    }
}
