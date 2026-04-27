package p000;

import android.app.PendingIntent;
import android.bluetooth.le.ScanResult;
import android.content.Intent;
import com.polidea.rxandroidble3.scan.ScanFilter;
import com.polidea.rxandroidble3.scan.ScanSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@omg(26)
public class ho0 implements go0 {

    /* JADX INFO: renamed from: e */
    public static final int f44244e = 0;

    /* JADX INFO: renamed from: a */
    public final hee f44245a;

    /* JADX INFO: renamed from: b */
    public final C15808yu f44246b;

    /* JADX INFO: renamed from: c */
    public final lb8 f44247c;

    /* JADX INFO: renamed from: d */
    public final wb8 f44248d;

    @b28
    public ho0(hee heeVar, C15808yu c15808yu, lb8 lb8Var, wb8 wb8Var) {
        this.f44245a = heeVar;
        this.f44246b = c15808yu;
        this.f44247c = lb8Var;
        this.f44248d = wb8Var;
    }

    private pne convertScanResultToRxAndroidBLEModel(int i, ScanResult scanResult) {
        return this.f44248d.apply(this.f44247c.create(i, scanResult));
    }

    private static List<ScanResult> extractScanResults(@efb Intent intent) {
        return (List) intent.getSerializableExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
    }

    @Override // p000.go0
    public List<pne> onScanResultReceived(@efb Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1);
        int intExtra2 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", 0);
        List<ScanResult> listExtractScanResults = extractScanResults(intent);
        ArrayList arrayList = new ArrayList();
        if (intExtra2 != 0) {
            throw new m51(intExtra2);
        }
        Iterator<ScanResult> it = listExtractScanResults.iterator();
        while (it.hasNext()) {
            arrayList.add(convertScanResultToRxAndroidBLEModel(intExtra, it.next()));
        }
        return arrayList;
    }

    @Override // p000.go0
    @c5e(26)
    public void scanBleDeviceInBackground(@efb PendingIntent pendingIntent, ScanSettings scanSettings, ScanFilter... scanFilterArr) {
        if (!this.f44245a.isBluetoothEnabled()) {
            kfe.m14730w("PendingIntent based scanning is available only when Bluetooth is ON.", new Object[0]);
            throw new m51(1);
        }
        kfe.m14726i("Requesting pending intent based scan.", new Object[0]);
        int iStartLeScan = this.f44245a.startLeScan(this.f44246b.toNativeFilters(scanFilterArr), this.f44246b.toNativeSettings(scanSettings), pendingIntent);
        if (iStartLeScan == 0) {
            return;
        }
        m51 m51Var = new m51(iStartLeScan);
        kfe.m14731w(m51Var, "Failed to start scan", new Object[0]);
        throw m51Var;
    }

    @Override // p000.go0
    @c5e(26)
    public void stopBackgroundBleScan(@efb PendingIntent pendingIntent) {
        if (!this.f44245a.isBluetoothEnabled()) {
            kfe.m14730w("PendingIntent based scanning is available only when Bluetooth is ON.", new Object[0]);
        } else {
            kfe.m14726i("Stopping pending intent based scan.", new Object[0]);
            this.f44245a.stopLeScan(pendingIntent);
        }
    }
}
