package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class x39 extends bne<jfe, BluetoothAdapter.LeScanCallback> {

    /* JADX INFO: renamed from: b */
    @hib
    public final Set<UUID> f96123b;

    /* JADX INFO: renamed from: c */
    public final nne f96124c;

    /* JADX INFO: renamed from: x39$a */
    public class C14893a implements BluetoothAdapter.LeScanCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lob f96125a;

        public C14893a(lob lobVar) {
            this.f96125a = lobVar;
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (x39.this.f96123b != null && kfe.isAtLeast(3)) {
                kfe.m14722d("%s, name=%s, rssi=%d, data=%s", pj9.commonMacMessage(bluetoothDevice.getAddress()), bluetoothDevice.getName(), Integer.valueOf(i), pj9.bytesToHex(bArr));
            }
            x39 x39Var = x39.this;
            if (x39Var.f96123b == null || x39Var.f96124c.extractUUIDs(bArr).containsAll(x39.this.f96123b)) {
                this.f96125a.onNext(new jfe(bluetoothDevice, i, bArr));
            }
        }
    }

    public x39(UUID[] uuidArr, hee heeVar, nne nneVar) {
        super(heeVar);
        this.f96124c = nneVar;
        if (uuidArr == null || uuidArr.length <= 0) {
            this.f96123b = null;
            return;
        }
        HashSet hashSet = new HashSet(uuidArr.length);
        this.f96123b = hashSet;
        Collections.addAll(hashSet, uuidArr);
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public BluetoothAdapter.LeScanCallback mo3262c(lob<jfe> lobVar) {
        return new C14893a(lobVar);
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean mo3263d(hee heeVar, BluetoothAdapter.LeScanCallback leScanCallback) {
        if (this.f96123b == null) {
            kfe.m14722d("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        return heeVar.startLegacyLeScan(leScanCallback);
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo3264e(hee heeVar, BluetoothAdapter.LeScanCallback leScanCallback) {
        heeVar.stopLegacyLeScan(leScanCallback);
    }

    @efb
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LegacyScanOperation{");
        if (this.f96123b == null) {
            str = "";
        } else {
            str = "ALL_MUST_MATCH -> uuids=" + pj9.getUuidSetToLog(this.f96123b);
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
