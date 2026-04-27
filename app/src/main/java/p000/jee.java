package p000;

import android.content.Context;
import com.polidea.rxandroidble3.scan.ScanFilter;
import com.polidea.rxandroidble3.scan.ScanSettings;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jee {

    /* JADX INFO: renamed from: jee$a */
    public enum EnumC7881a {
        BLUETOOTH_NOT_AVAILABLE,
        LOCATION_PERMISSION_NOT_GRANTED,
        BLUETOOTH_NOT_ENABLED,
        LOCATION_SERVICES_NOT_ENABLED,
        READY
    }

    public static jee create(@efb Context context) {
        return qe3.builder().applicationContext(context.getApplicationContext()).build().rxBleClient();
    }

    @Deprecated
    public static void setLogLevel(int i) {
        kfe.setLogLevel(i);
    }

    public static void updateLogOptions(ki9 ki9Var) {
        kfe.updateLogOptions(ki9Var);
    }

    public abstract go0 getBackgroundScanner();

    public abstract yee getBleDevice(@efb String str);

    public abstract Set<yee> getBondedDevices();

    public abstract Set<yee> getConnectedPeripherals();

    public abstract String[] getRecommendedConnectRuntimePermissions();

    public abstract String[] getRecommendedScanRuntimePermissions();

    public abstract EnumC7881a getState();

    public abstract boolean isConnectRuntimePermissionGranted();

    public abstract boolean isScanRuntimePermissionGranted();

    public abstract vkb<EnumC7881a> observeStateChanges();

    public abstract vkb<pne> scanBleDevices(ScanSettings scanSettings, ScanFilter... scanFilterArr);

    @Deprecated
    public abstract vkb<mfe> scanBleDevices(@hib UUID... uuidArr);
}
