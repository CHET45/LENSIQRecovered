package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes6.dex */
public class cne extends bne<ife, BluetoothAdapter.LeScanCallback> {

    /* JADX INFO: renamed from: b */
    @efb
    public final lb8 f17088b;

    /* JADX INFO: renamed from: c */
    @efb
    public final z05 f17089c;

    /* JADX INFO: renamed from: cne$a */
    public class C2408a implements BluetoothAdapter.LeScanCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lob f17090a;

        public C2408a(lob lobVar) {
            this.f17090a = lobVar;
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (!cne.this.f17089c.isEmpty() && kfe.isAtLeast(3) && kfe.getShouldLogScannedPeripherals()) {
                kfe.m14722d("%s, name=%s, rssi=%d, data=%s", pj9.commonMacMessage(bluetoothDevice.getAddress()), bluetoothDevice.getName(), Integer.valueOf(i), pj9.bytesToHex(bArr));
            }
            ife ifeVarCreate = cne.this.f17088b.create(bluetoothDevice, i, bArr);
            if (cne.this.f17089c.matches(ifeVarCreate)) {
                this.f17090a.onNext(ifeVarCreate);
            }
        }
    }

    public cne(@efb hee heeVar, @efb lb8 lb8Var, @efb z05 z05Var) {
        super(heeVar);
        this.f17088b = lb8Var;
        this.f17089c = z05Var;
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public BluetoothAdapter.LeScanCallback mo3262c(lob<ife> lobVar) {
        return new C2408a(lobVar);
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean mo3263d(hee heeVar, BluetoothAdapter.LeScanCallback leScanCallback) {
        if (this.f17089c.isEmpty()) {
            kfe.m14722d("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        return heeVar.startLegacyLeScan(leScanCallback);
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo3264e(hee heeVar, BluetoothAdapter.LeScanCallback leScanCallback) {
        heeVar.stopLegacyLeScan(leScanCallback);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ScanOperationApi18{");
        if (this.f17089c.isEmpty()) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> " + this.f17089c;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
