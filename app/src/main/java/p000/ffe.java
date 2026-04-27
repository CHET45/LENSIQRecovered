package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public class ffe {

    /* JADX INFO: renamed from: a */
    public final List<BluetoothGattService> f36442a;

    /* JADX INFO: renamed from: ffe$a */
    public class C5773a implements n8d<BluetoothGattService> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f36443a;

        public C5773a(UUID uuid) {
            this.f36443a = uuid;
        }

        @Override // p000.n8d
        public boolean test(BluetoothGattService bluetoothGattService) {
            return bluetoothGattService.getUuid().equals(this.f36443a);
        }
    }

    /* JADX INFO: renamed from: ffe$b */
    public class CallableC5774b implements Callable<BluetoothGattCharacteristic> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f36445a;

        public CallableC5774b(UUID uuid) {
            this.f36445a = uuid;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public BluetoothGattCharacteristic call() {
            Iterator<BluetoothGattService> it = ffe.this.f36442a.iterator();
            while (it.hasNext()) {
                BluetoothGattCharacteristic characteristic = it.next().getCharacteristic(this.f36445a);
                if (characteristic != null) {
                    return characteristic;
                }
            }
            throw new u41(this.f36445a);
        }
    }

    /* JADX INFO: renamed from: ffe$c */
    public class C5775c implements sy6<BluetoothGattService, BluetoothGattCharacteristic> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f36447a;

        public C5775c(UUID uuid) {
            this.f36447a = uuid;
        }

        @Override // p000.sy6
        public BluetoothGattCharacteristic apply(BluetoothGattService bluetoothGattService) {
            BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(this.f36447a);
            if (characteristic != null) {
                return characteristic;
            }
            throw new u41(this.f36447a);
        }
    }

    /* JADX INFO: renamed from: ffe$d */
    public class C5776d implements sy6<BluetoothGattCharacteristic, BluetoothGattDescriptor> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f36449a;

        public C5776d(UUID uuid) {
            this.f36449a = uuid;
        }

        @Override // p000.sy6
        public BluetoothGattDescriptor apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f36449a);
            if (descriptor != null) {
                return descriptor;
            }
            throw new a51(this.f36449a);
        }
    }

    /* JADX INFO: renamed from: ffe$e */
    public class C5777e implements sy6<BluetoothGattCharacteristic, BluetoothGattDescriptor> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f36451a;

        public C5777e(UUID uuid) {
            this.f36451a = uuid;
        }

        @Override // p000.sy6
        public BluetoothGattDescriptor apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f36451a);
            if (descriptor != null) {
                return descriptor;
            }
            throw new a51(this.f36451a);
        }
    }

    /* JADX INFO: renamed from: ffe$f */
    public class C5778f implements sy6<BluetoothGattService, BluetoothGattCharacteristic> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f36453a;

        public C5778f(UUID uuid) {
            this.f36453a = uuid;
        }

        @Override // p000.sy6
        public BluetoothGattCharacteristic apply(BluetoothGattService bluetoothGattService) {
            return bluetoothGattService.getCharacteristic(this.f36453a);
        }
    }

    public ffe(List<BluetoothGattService> list) {
        this.f36442a = list;
    }

    public List<BluetoothGattService> getBluetoothGattServices() {
        return this.f36442a;
    }

    public kjf<BluetoothGattCharacteristic> getCharacteristic(@efb UUID uuid) {
        return kjf.fromCallable(new CallableC5774b(uuid));
    }

    public kjf<BluetoothGattDescriptor> getDescriptor(UUID uuid, UUID uuid2) {
        return getCharacteristic(uuid).map(new C5776d(uuid2));
    }

    public kjf<BluetoothGattService> getService(@efb UUID uuid) {
        return vkb.fromIterable(this.f36442a).filter(new C5773a(uuid)).firstElement().switchIfEmpty(kjf.error(new o51(uuid)));
    }

    public kjf<BluetoothGattCharacteristic> getCharacteristic(@efb UUID uuid, @efb UUID uuid2) {
        return getService(uuid).map(new C5775c(uuid2));
    }

    public kjf<BluetoothGattDescriptor> getDescriptor(UUID uuid, UUID uuid2, UUID uuid3) {
        return getService(uuid).map(new C5778f(uuid2)).map(new C5777e(uuid3));
    }
}
