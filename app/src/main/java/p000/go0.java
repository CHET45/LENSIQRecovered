package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.polidea.rxandroidble3.scan.ScanFilter;
import com.polidea.rxandroidble3.scan.ScanSettings;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c5e(26)
public interface go0 {
    List<pne> onScanResultReceived(@efb Intent intent);

    @c5e(26)
    void scanBleDeviceInBackground(@efb PendingIntent pendingIntent, ScanSettings scanSettings, ScanFilter... scanFilterArr);

    @c5e(26)
    void stopBackgroundBleScan(@efb PendingIntent pendingIntent);
}
