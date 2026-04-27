package p000;

import android.bluetooth.BluetoothGattDescriptor;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class ri1 {

    /* JADX INFO: renamed from: ri1$a */
    public class C12102a implements n8d<qi1<UUID>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f78371a;

        public C12102a(UUID uuid) {
            this.f78371a = uuid;
        }

        @Override // p000.n8d
        public boolean test(qi1<UUID> qi1Var) {
            return qi1Var.f74482a.equals(this.f78371a);
        }
    }

    /* JADX INFO: renamed from: ri1$b */
    public class C12103b implements sy6<qi1<?>, byte[]> {
        @Override // p000.sy6
        public byte[] apply(qi1<?> qi1Var) {
            return qi1Var.f74483b;
        }
    }

    /* JADX INFO: renamed from: ri1$c */
    public class C12104c implements n8d<qi1<BluetoothGattDescriptor>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BluetoothGattDescriptor f78372a;

        public C12104c(BluetoothGattDescriptor bluetoothGattDescriptor) {
            this.f78372a = bluetoothGattDescriptor;
        }

        @Override // p000.n8d
        public boolean test(qi1<BluetoothGattDescriptor> qi1Var) {
            return qi1Var.f74482a.equals(this.f78372a);
        }
    }

    private ri1() {
    }

    public static n8d<? super qi1<UUID>> characteristicUUIDPredicate(UUID uuid) {
        return new C12102a(uuid);
    }

    public static n8d<? super qi1<BluetoothGattDescriptor>> descriptorPredicate(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new C12104c(bluetoothGattDescriptor);
    }

    public static sy6<qi1<?>, byte[]> getBytesFromAssociation() {
        return new C12103b();
    }
}
