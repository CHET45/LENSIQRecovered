package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.UUID;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
public final class gm9 implements uee.InterfaceC13519c {

    /* JADX INFO: renamed from: a */
    public final bs2 f40189a;

    /* JADX INFO: renamed from: b */
    public final uee f40190b;

    /* JADX INFO: renamed from: c */
    public final m6c f40191c;

    /* JADX INFO: renamed from: d */
    public kjf<BluetoothGattCharacteristic> f40192d;

    /* JADX INFO: renamed from: e */
    public hlc f40193e;

    /* JADX INFO: renamed from: f */
    public uee.InterfaceC13521e f40194f = new qw7();

    /* JADX INFO: renamed from: g */
    public uee.InterfaceC13522f f40195g = new wdb();

    /* JADX INFO: renamed from: h */
    public byte[] f40196h;

    /* JADX INFO: renamed from: gm9$a */
    public class C6379a implements sy6<ffe, oof<? extends BluetoothGattCharacteristic>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f40197a;

        public C6379a(UUID uuid) {
            this.f40197a = uuid;
        }

        @Override // p000.sy6
        public oof<? extends BluetoothGattCharacteristic> apply(ffe ffeVar) throws Exception {
            return ffeVar.getCharacteristic(this.f40197a);
        }
    }

    /* JADX INFO: renamed from: gm9$b */
    public class C6380b implements sy6<BluetoothGattCharacteristic, vkb<byte[]>> {
        public C6380b() {
        }

        @Override // p000.sy6
        public vkb<byte[]> apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            gm9 gm9Var = gm9.this;
            return gm9Var.f40189a.queue(gm9Var.f40191c.provideLongWriteOperation(bluetoothGattCharacteristic, gm9Var.f40194f, gm9Var.f40195g, gm9Var.f40193e, gm9Var.f40196h));
        }
    }

    @b28
    public gm9(bs2 bs2Var, v1b v1bVar, uee ueeVar, m6c m6cVar) {
        this.f40189a = bs2Var;
        this.f40193e = v1bVar;
        this.f40190b = ueeVar;
        this.f40191c = m6cVar;
    }

    @Override // p000.uee.InterfaceC13519c
    public vkb<byte[]> build() {
        kjf<BluetoothGattCharacteristic> kjfVar = this.f40192d;
        if (kjfVar == null) {
            throw new IllegalArgumentException("setCharacteristicUuid() or setCharacteristic() needs to be called before build()");
        }
        if (this.f40196h != null) {
            return kjfVar.flatMapObservable(new C6380b());
        }
        throw new IllegalArgumentException("setBytes() needs to be called before build()");
    }

    @Override // p000.uee.InterfaceC13519c
    public uee.InterfaceC13519c setBytes(@efb byte[] bArr) {
        this.f40196h = bArr;
        return this;
    }

    @Override // p000.uee.InterfaceC13519c
    public uee.InterfaceC13519c setCharacteristic(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f40192d = kjf.just(bluetoothGattCharacteristic);
        return this;
    }

    @Override // p000.uee.InterfaceC13519c
    public uee.InterfaceC13519c setCharacteristicUuid(@efb UUID uuid) {
        this.f40192d = this.f40190b.discoverServices().flatMap(new C6379a(uuid));
        return this;
    }

    @Override // p000.uee.InterfaceC13519c
    public uee.InterfaceC13519c setMaxBatchSize(int i) {
        this.f40193e = new vt2(i);
        return this;
    }

    @Override // p000.uee.InterfaceC13519c
    public uee.InterfaceC13519c setWriteOperationAckStrategy(@efb uee.InterfaceC13521e interfaceC13521e) {
        this.f40194f = interfaceC13521e;
        return this;
    }

    @Override // p000.uee.InterfaceC13519c
    public uee.InterfaceC13519c setWriteOperationRetryStrategy(@efb uee.InterfaceC13522f interfaceC13522f) {
        this.f40195g = interfaceC13522f;
        return this;
    }
}
