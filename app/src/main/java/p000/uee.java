package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public interface uee {

    /* JADX INFO: renamed from: a */
    public static final int f87829a = 3;

    /* JADX INFO: renamed from: b */
    public static final int f87830b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f87831c = 23;

    /* JADX INFO: renamed from: d */
    public static final int f87832d = 515;

    /* JADX INFO: renamed from: uee$a */
    @c5e(21)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13517a {
    }

    /* JADX INFO: renamed from: uee$b */
    @Deprecated
    public interface InterfaceC13518b {
        kjf<uee> prepareConnection(boolean z);
    }

    /* JADX INFO: renamed from: uee$c */
    public interface InterfaceC13519c {
        vkb<byte[]> build();

        InterfaceC13519c setBytes(@efb byte[] bArr);

        InterfaceC13519c setCharacteristic(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic);

        InterfaceC13519c setCharacteristicUuid(@efb UUID uuid);

        InterfaceC13519c setMaxBatchSize(@h78(from = 1, m12174to = PlaybackStateCompat.ACTION_PLAY_PAUSE) int i);

        InterfaceC13519c setWriteOperationAckStrategy(@efb InterfaceC13521e interfaceC13521e);

        InterfaceC13519c setWriteOperationRetryStrategy(@efb InterfaceC13522f interfaceC13522f);
    }

    /* JADX INFO: renamed from: uee$d */
    public enum EnumC13520d {
        CONNECTING("CONNECTING"),
        CONNECTED("CONNECTED"),
        DISCONNECTED("DISCONNECTED"),
        DISCONNECTING("DISCONNECTING");


        /* JADX INFO: renamed from: a */
        public final String f87838a;

        EnumC13520d(String str) {
            this.f87838a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "RxBleConnectionState{" + this.f87838a + '}';
        }
    }

    /* JADX INFO: renamed from: uee$e */
    public interface InterfaceC13521e extends pwb<Boolean, Boolean> {
    }

    /* JADX INFO: renamed from: uee$f */
    public interface InterfaceC13522f extends pwb<a, a> {

        /* JADX INFO: renamed from: uee$f$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final int f87839a;

            /* JADX INFO: renamed from: b */
            public final h51 f87840b;

            public a(int i, h51 h51Var) {
                this.f87839a = i;
                this.f87840b = h51Var;
            }

            public int getBatchIndex() {
                return this.f87839a;
            }

            public h51 getCause() {
                return this.f87840b;
            }
        }
    }

    InterfaceC13519c createNewLongWriteBuilder();

    kjf<ffe> discoverServices();

    kjf<ffe> discoverServices(@h78(from = 1) long j, @efb TimeUnit timeUnit);

    @Deprecated
    kjf<BluetoothGattCharacteristic> getCharacteristic(@efb UUID uuid);

    int getMtu();

    @c5e(26)
    vkb<es2> observeConnectionParametersUpdates();

    <T> vkb<T> queue(@efb xee<T> xeeVar);

    <T> vkb<T> queue(@efb xee<T> xeeVar, zbd zbdVar);

    kjf<byte[]> readCharacteristic(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic);

    kjf<byte[]> readCharacteristic(@efb UUID uuid);

    kjf<byte[]> readDescriptor(@efb BluetoothGattDescriptor bluetoothGattDescriptor);

    kjf<byte[]> readDescriptor(@efb UUID uuid, @efb UUID uuid2, @efb UUID uuid3);

    kjf<Integer> readRssi();

    @c5e(21)
    xd2 requestConnectionPriority(int i, @h78(from = 1) long j, @efb TimeUnit timeUnit);

    @c5e(21)
    kjf<Integer> requestMtu(@h78(from = 23, m12174to = 515) int i);

    vkb<vkb<byte[]>> setupIndication(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic);

    vkb<vkb<byte[]>> setupIndication(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic, @efb khb khbVar);

    vkb<vkb<byte[]>> setupIndication(@efb UUID uuid);

    vkb<vkb<byte[]>> setupIndication(@efb UUID uuid, @efb khb khbVar);

    vkb<vkb<byte[]>> setupNotification(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic);

    vkb<vkb<byte[]>> setupNotification(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic, @efb khb khbVar);

    vkb<vkb<byte[]>> setupNotification(@efb UUID uuid);

    vkb<vkb<byte[]>> setupNotification(@efb UUID uuid, @efb khb khbVar);

    kjf<byte[]> writeCharacteristic(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic, @efb byte[] bArr);

    kjf<byte[]> writeCharacteristic(@efb UUID uuid, @efb byte[] bArr);

    xd2 writeDescriptor(@efb BluetoothGattDescriptor bluetoothGattDescriptor, @efb byte[] bArr);

    xd2 writeDescriptor(@efb UUID uuid, @efb UUID uuid2, @efb UUID uuid3, @efb byte[] bArr);
}
