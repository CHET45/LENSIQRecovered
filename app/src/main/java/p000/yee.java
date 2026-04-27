package p000;

import android.bluetooth.BluetoothDevice;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
public interface yee {
    vkb<uee> establishConnection(boolean z);

    vkb<uee> establishConnection(boolean z, @efb w1h w1hVar);

    BluetoothDevice getBluetoothDevice();

    uee.EnumC13520d getConnectionState();

    String getMacAddress();

    @hib
    String getName();

    vkb<uee.EnumC13520d> observeConnectionStateChanges();
}
