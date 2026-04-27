package p000;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import com.polidea.rxandroidble3.scan.ScanFilter;
import com.polidea.rxandroidble3.scan.ScanSettings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c5e(21)
public class dne extends bne<ife, ScanCallback> {

    /* JADX INFO: renamed from: b */
    @efb
    public final lb8 f30226b;

    /* JADX INFO: renamed from: c */
    @efb
    public final C15808yu f30227c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ScanSettings f30228d;

    /* JADX INFO: renamed from: e */
    @efb
    public final z05 f30229e;

    /* JADX INFO: renamed from: f */
    @hib
    public final ScanFilter[] f30230f;

    /* JADX INFO: renamed from: m */
    @hib
    public lob<ife> f30231m;

    /* JADX INFO: renamed from: dne$a */
    public class C4886a extends ScanCallback {
        public C4886a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            lob lobVar;
            Iterator<ScanResult> it = list.iterator();
            while (it.hasNext()) {
                ife ifeVarCreate = dne.this.f30226b.create(it.next());
                if (dne.this.f30229e.matches(ifeVarCreate) && (lobVar = dne.this.f30231m) != null) {
                    lobVar.onNext(ifeVarCreate);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            lob lobVar = dne.this.f30231m;
            if (lobVar != null) {
                lobVar.tryOnError(new m51(dne.m9278h(i)));
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            lob lobVar;
            if (!dne.this.f30229e.isEmpty() && kfe.isAtLeast(3) && kfe.getShouldLogScannedPeripherals()) {
                ScanRecord scanRecord = scanResult.getScanRecord();
                kfe.m14722d("%s, name=%s, rssi=%d, data=%s", pj9.commonMacMessage(scanResult.getDevice().getAddress()), scanResult.getDevice().getName(), Integer.valueOf(scanResult.getRssi()), pj9.bytesToHex(scanRecord != null ? scanRecord.getBytes() : null));
            }
            ife ifeVarCreate = dne.this.f30226b.create(i, scanResult);
            if (!dne.this.f30229e.matches(ifeVarCreate) || (lobVar = dne.this.f30231m) == null) {
                return;
            }
            lobVar.onNext(ifeVarCreate);
        }
    }

    public dne(@efb hee heeVar, @efb lb8 lb8Var, @efb C15808yu c15808yu, @efb ScanSettings scanSettings, @efb z05 z05Var, @hib ScanFilter[] scanFilterArr) {
        super(heeVar);
        this.f30226b = lb8Var;
        this.f30228d = scanSettings;
        this.f30229e = z05Var;
        this.f30230f = scanFilterArr;
        this.f30227c = c15808yu;
        this.f30231m = null;
    }

    /* JADX INFO: renamed from: h */
    public static int m9278h(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 6;
        }
        if (i == 3) {
            return 7;
        }
        if (i == 4) {
            return 8;
        }
        if (i == 5) {
            return 9;
        }
        kfe.m14730w("Encountered unknown scanning error code: %d -> check android.bluetooth.le.ScanCallback", new Object[0]);
        return Integer.MAX_VALUE;
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ScanCallback mo3262c(lob<ife> lobVar) {
        this.f30231m = lobVar;
        return new C4886a();
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo3263d(hee heeVar, ScanCallback scanCallback) {
        if (this.f30229e.isEmpty()) {
            kfe.m14722d("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        heeVar.startLeScan(this.f30227c.toNativeFilters(this.f30230f), this.f30227c.toNativeSettings(this.f30228d), scanCallback);
        return true;
    }

    @Override // p000.bne
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo3264e(hee heeVar, ScanCallback scanCallback) {
        heeVar.stopLeScan(scanCallback);
        lob<ife> lobVar = this.f30231m;
        if (lobVar != null) {
            lobVar.onComplete();
            this.f30231m = null;
        }
    }

    public String toString() {
        String str;
        ScanFilter[] scanFilterArr = this.f30230f;
        boolean z = scanFilterArr == null || scanFilterArr.length == 0;
        boolean zIsEmpty = this.f30229e.isEmpty();
        StringBuilder sb = new StringBuilder();
        sb.append("ScanOperationApi21{");
        String str2 = "";
        if (z) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> nativeFilters=" + Arrays.toString(this.f30230f);
        }
        sb.append(str);
        sb.append((z || zIsEmpty) ? "" : " and then ");
        if (!zIsEmpty) {
            str2 = "ANY_MUST_MATCH -> " + this.f30229e;
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }
}
