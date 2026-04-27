package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
public interface m6c {
    gs2 provideConnectionPriorityChangeOperation(int i, long j, TimeUnit timeUnit);

    mw1 provideLongWriteOperation(BluetoothGattCharacteristic bluetoothGattCharacteristic, uee.InterfaceC13521e interfaceC13521e, uee.InterfaceC13522f interfaceC13522f, hlc hlcVar, byte[] bArr);

    @c5e(21)
    y1b provideMtuChangeOperation(int i);

    pw1 provideReadCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic);

    n74 provideReadDescriptor(BluetoothGattDescriptor bluetoothGattDescriptor);

    zqd provideRssiReadOperation();

    r4f provideServiceDiscoveryOperation(long j, TimeUnit timeUnit);

    qw1 provideWriteCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    q74 provideWriteDescriptor(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr);
}
