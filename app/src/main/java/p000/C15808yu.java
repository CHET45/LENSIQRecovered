package p000;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import com.polidea.rxandroidble3.scan.ScanSettings;
import java.util.ArrayList;
import java.util.List;
import p000.a32;
import p000.p7e;

/* JADX INFO: renamed from: yu */
/* JADX INFO: loaded from: classes6.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class C15808yu {

    /* JADX INFO: renamed from: a */
    public final int f102976a;

    @b28
    public C15808yu(@w8b(a32.C0035h.f252b) int i) {
        this.f102976a = i;
    }

    @c5e(23)
    private static void setMarshmallowSettings(ScanSettings scanSettings, ScanSettings.Builder builder) {
        builder.setCallbackType(scanSettings.getCallbackType()).setMatchMode(scanSettings.getMatchMode()).setNumOfMatches(scanSettings.getNumOfMatches());
    }

    @c5e(21)
    private static ScanFilter toNative(com.polidea.rxandroidble3.scan.ScanFilter scanFilter) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        if (scanFilter.getServiceDataUuid() != null) {
            builder.setServiceData(scanFilter.getServiceDataUuid(), scanFilter.getServiceData(), scanFilter.getServiceDataMask());
        }
        if (scanFilter.getDeviceAddress() != null) {
            builder.setDeviceAddress(scanFilter.getDeviceAddress());
        }
        return builder.setDeviceName(scanFilter.getDeviceName()).setManufacturerData(scanFilter.getManufacturerId(), scanFilter.getManufacturerData(), scanFilter.getManufacturerDataMask()).setServiceUuid(scanFilter.getServiceUuid(), scanFilter.getServiceUuidMask()).build();
    }

    @c5e(21)
    @hib
    public List<ScanFilter> toNativeFilters(com.polidea.rxandroidble3.scan.ScanFilter... scanFilterArr) {
        if (scanFilterArr == null || scanFilterArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(scanFilterArr.length);
        for (com.polidea.rxandroidble3.scan.ScanFilter scanFilter : scanFilterArr) {
            arrayList.add(toNative(scanFilter));
        }
        return arrayList;
    }

    @c5e(21)
    @igg({"NewApi"})
    public android.bluetooth.le.ScanSettings toNativeSettings(com.polidea.rxandroidble3.scan.ScanSettings scanSettings) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (this.f102976a >= 23) {
            setMarshmallowSettings(scanSettings, builder);
            if (this.f102976a >= 26) {
                builder.setLegacy(scanSettings.getLegacy());
            }
        }
        return builder.setReportDelay(scanSettings.getReportDelayMillis()).setScanMode(scanSettings.getScanMode()).build();
    }
}
