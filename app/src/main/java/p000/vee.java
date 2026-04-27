package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.DeadObjectException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p000.a32;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class vee implements uee {

    /* JADX INFO: renamed from: e */
    public final bs2 f90810e;

    /* JADX INFO: renamed from: f */
    public final gfe f90811f;

    /* JADX INFO: renamed from: g */
    public final BluetoothGatt f90812g;

    /* JADX INFO: renamed from: h */
    public final m6c f90813h;

    /* JADX INFO: renamed from: i */
    public final hid<uee.InterfaceC13519c> f90814i;

    /* JADX INFO: renamed from: j */
    public final woe f90815j;

    /* JADX INFO: renamed from: k */
    public final l4f f90816k;

    /* JADX INFO: renamed from: l */
    public final vgb f90817l;

    /* JADX INFO: renamed from: m */
    public final x1b f90818m;

    /* JADX INFO: renamed from: n */
    public final r74 f90819n;

    /* JADX INFO: renamed from: o */
    public final gs7 f90820o;

    /* JADX INFO: renamed from: vee$a */
    public class C14021a implements sy6<ffe, oof<BluetoothGattDescriptor>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f90821a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UUID f90822b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UUID f90823c;

        public C14021a(UUID uuid, UUID uuid2, UUID uuid3) {
            this.f90821a = uuid;
            this.f90822b = uuid2;
            this.f90823c = uuid3;
        }

        @Override // p000.sy6
        public oof<BluetoothGattDescriptor> apply(ffe ffeVar) {
            return ffeVar.getDescriptor(this.f90821a, this.f90822b, this.f90823c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vee$b */
    public class C14022b<T> extends xnd<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xee f90825a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zbd f90826b;

        /* JADX INFO: renamed from: vee$b$a */
        public class a implements InterfaceC7776j8 {
            public a() {
            }

            @Override // p000.InterfaceC7776j8
            public void run() {
                vee.this.f90811f.setNativeCallback(null);
                vee.this.f90811f.setHiddenNativeCallback(null);
            }
        }

        public C14022b(xee xeeVar, zbd zbdVar) {
            this.f90825a = xeeVar;
            this.f90826b = zbdVar;
        }

        private InterfaceC7776j8 clearNativeCallbackReferenceAction() {
            return new a();
        }

        @Override // p000.xnd
        /* JADX INFO: renamed from: a */
        public void mo3260a(lob<T> lobVar, ynd yndVar) throws Throwable {
            try {
                xee xeeVar = this.f90825a;
                vee veeVar = vee.this;
                vkb<T> vkbVarAsObservable = xeeVar.asObservable(veeVar.f90812g, veeVar.f90811f, veeVar.f90815j);
                if (vkbVarAsObservable == null) {
                    yndVar.release();
                    throw new IllegalArgumentException("The custom operation asObservable method must return a non-null observable");
                }
                vkbVarAsObservable.doOnTerminate(clearNativeCallbackReferenceAction()).subscribe(new znd(lobVar, yndVar));
            } catch (Throwable th) {
                yndVar.release();
                throw th;
            }
        }

        @Override // p000.xnd
        /* JADX INFO: renamed from: b */
        public c51 mo3261b(DeadObjectException deadObjectException) {
            return new b51(deadObjectException, vee.this.f90812g.getDevice().getAddress(), -1);
        }

        @Override // p000.xnd, p000.z5c
        public zbd definedPriority() {
            return this.f90826b;
        }
    }

    /* JADX INFO: renamed from: vee$c */
    public class C14023c implements sy6<ffe, kjf<? extends BluetoothGattCharacteristic>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f90829a;

        public C14023c(UUID uuid) {
            this.f90829a = uuid;
        }

        @Override // p000.sy6
        public kjf<? extends BluetoothGattCharacteristic> apply(ffe ffeVar) {
            return ffeVar.getCharacteristic(this.f90829a);
        }
    }

    /* JADX INFO: renamed from: vee$d */
    public class C14024d implements sy6<BluetoothGattCharacteristic, wub<? extends vkb<byte[]>>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ khb f90831a;

        public C14024d(khb khbVar) {
            this.f90831a = khbVar;
        }

        @Override // p000.sy6
        public vkb<? extends vkb<byte[]>> apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return vee.this.setupNotification(bluetoothGattCharacteristic, this.f90831a);
        }
    }

    /* JADX INFO: renamed from: vee$e */
    public class C14025e implements sy6<BluetoothGattCharacteristic, wub<? extends vkb<byte[]>>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ khb f90833a;

        public C14025e(khb khbVar) {
            this.f90833a = khbVar;
        }

        @Override // p000.sy6
        public vkb<? extends vkb<byte[]>> apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return vee.this.setupIndication(bluetoothGattCharacteristic, this.f90833a);
        }
    }

    /* JADX INFO: renamed from: vee$f */
    public class C14026f implements sy6<BluetoothGattCharacteristic, oof<? extends byte[]>> {
        public C14026f() {
        }

        @Override // p000.sy6
        public oof<? extends byte[]> apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return vee.this.readCharacteristic(bluetoothGattCharacteristic);
        }
    }

    /* JADX INFO: renamed from: vee$g */
    public class C14027g implements sy6<BluetoothGattCharacteristic, oof<? extends byte[]>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f90836a;

        public C14027g(byte[] bArr) {
            this.f90836a = bArr;
        }

        @Override // p000.sy6
        public oof<? extends byte[]> apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return vee.this.writeCharacteristic(bluetoothGattCharacteristic, this.f90836a);
        }
    }

    /* JADX INFO: renamed from: vee$h */
    public class C14028h implements sy6<BluetoothGattDescriptor, oof<byte[]>> {
        public C14028h() {
        }

        @Override // p000.sy6
        public oof<byte[]> apply(BluetoothGattDescriptor bluetoothGattDescriptor) {
            return vee.this.readDescriptor(bluetoothGattDescriptor);
        }
    }

    /* JADX INFO: renamed from: vee$i */
    public class C14029i implements sy6<ffe, oof<BluetoothGattDescriptor>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f90839a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UUID f90840b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UUID f90841c;

        public C14029i(UUID uuid, UUID uuid2, UUID uuid3) {
            this.f90839a = uuid;
            this.f90840b = uuid2;
            this.f90841c = uuid3;
        }

        @Override // p000.sy6
        public oof<BluetoothGattDescriptor> apply(ffe ffeVar) {
            return ffeVar.getDescriptor(this.f90839a, this.f90840b, this.f90841c);
        }
    }

    /* JADX INFO: renamed from: vee$j */
    public class C14030j implements sy6<qi1<BluetoothGattDescriptor>, byte[]> {
        public C14030j() {
        }

        @Override // p000.sy6
        public byte[] apply(qi1<BluetoothGattDescriptor> qi1Var) {
            return qi1Var.f74483b;
        }
    }

    /* JADX INFO: renamed from: vee$k */
    public class C14031k implements sy6<BluetoothGattDescriptor, ph2> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f90844a;

        public C14031k(byte[] bArr) {
            this.f90844a = bArr;
        }

        @Override // p000.sy6
        public ph2 apply(BluetoothGattDescriptor bluetoothGattDescriptor) {
            return vee.this.writeDescriptor(bluetoothGattDescriptor, this.f90844a);
        }
    }

    @b28
    public vee(bs2 bs2Var, gfe gfeVar, BluetoothGatt bluetoothGatt, l4f l4fVar, vgb vgbVar, x1b x1bVar, r74 r74Var, m6c m6cVar, hid<uee.InterfaceC13519c> hidVar, @w8b(a32.C0034g.f249c) woe woeVar, gs7 gs7Var) {
        this.f90810e = bs2Var;
        this.f90811f = gfeVar;
        this.f90812g = bluetoothGatt;
        this.f90816k = l4fVar;
        this.f90817l = vgbVar;
        this.f90818m = x1bVar;
        this.f90819n = r74Var;
        this.f90813h = m6cVar;
        this.f90814i = hidVar;
        this.f90815j = woeVar;
        this.f90820o = gs7Var;
    }

    @Override // p000.uee
    public uee.InterfaceC13519c createNewLongWriteBuilder() {
        return this.f90814i.get();
    }

    @Override // p000.uee
    public kjf<ffe> discoverServices() {
        return this.f90816k.m15304a(20L, TimeUnit.SECONDS);
    }

    @Override // p000.uee
    @Deprecated
    public kjf<BluetoothGattCharacteristic> getCharacteristic(@efb UUID uuid) {
        return discoverServices().flatMap(new C14023c(uuid));
    }

    @Override // p000.uee
    public int getMtu() {
        return this.f90818m.getMtu();
    }

    @Override // p000.uee
    public vkb<es2> observeConnectionParametersUpdates() {
        return this.f90811f.getConnectionParametersUpdates();
    }

    @Override // p000.uee
    public <T> vkb<T> queue(@efb xee<T> xeeVar) {
        return queue(xeeVar, zbd.f104724c);
    }

    @Override // p000.uee
    public kjf<byte[]> readCharacteristic(@efb UUID uuid) {
        return getCharacteristic(uuid).flatMap(new C14026f());
    }

    @Override // p000.uee
    public kjf<byte[]> readDescriptor(@efb UUID uuid, @efb UUID uuid2, @efb UUID uuid3) {
        return discoverServices().flatMap(new C14029i(uuid, uuid2, uuid3)).flatMap(new C14028h());
    }

    @Override // p000.uee
    public kjf<Integer> readRssi() {
        return this.f90810e.queue(this.f90813h.provideRssiReadOperation()).firstOrError();
    }

    @Override // p000.uee
    @c5e(21)
    public xd2 requestConnectionPriority(int i, long j, @efb TimeUnit timeUnit) {
        if (i == 2 || i == 0 || i == 1) {
            return j <= 0 ? xd2.error(new IllegalArgumentException("Delay must be bigger than 0")) : this.f90810e.queue(this.f90813h.provideConnectionPriorityChangeOperation(i, j, timeUnit)).ignoreElements();
        }
        return xd2.error(new IllegalArgumentException("Connection priority must have valid value from BluetoothGatt (received " + i + c0b.f15434d));
    }

    @Override // p000.uee
    @c5e(21)
    public kjf<Integer> requestMtu(int i) {
        return this.f90810e.queue(this.f90813h.provideMtuChangeOperation(i)).firstOrError();
    }

    @Override // p000.uee
    public vkb<vkb<byte[]>> setupIndication(@efb UUID uuid) {
        return setupIndication(uuid, khb.DEFAULT);
    }

    @Override // p000.uee
    public vkb<vkb<byte[]>> setupNotification(@efb UUID uuid) {
        return setupNotification(uuid, khb.DEFAULT);
    }

    @Override // p000.uee
    public kjf<byte[]> writeCharacteristic(@efb UUID uuid, @efb byte[] bArr) {
        return getCharacteristic(uuid).flatMap(new C14027g(bArr));
    }

    @Override // p000.uee
    public xd2 writeDescriptor(@efb UUID uuid, @efb UUID uuid2, @efb UUID uuid3, @efb byte[] bArr) {
        return discoverServices().flatMap(new C14021a(uuid, uuid2, uuid3)).flatMapCompletable(new C14031k(bArr));
    }

    @Override // p000.uee
    public kjf<ffe> discoverServices(long j, @efb TimeUnit timeUnit) {
        return this.f90816k.m15304a(j, timeUnit);
    }

    @Override // p000.uee
    public <T> vkb<T> queue(@efb xee<T> xeeVar, @efb zbd zbdVar) {
        return this.f90810e.queue(new C14022b(xeeVar, zbdVar));
    }

    @Override // p000.uee
    public vkb<vkb<byte[]>> setupIndication(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return setupIndication(bluetoothGattCharacteristic, khb.DEFAULT);
    }

    @Override // p000.uee
    public vkb<vkb<byte[]>> setupNotification(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return setupNotification(bluetoothGattCharacteristic, khb.DEFAULT);
    }

    @Override // p000.uee
    public kjf<byte[]> readCharacteristic(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f90820o.checkAnyPropertyMatches(bluetoothGattCharacteristic, 2).andThen(this.f90810e.queue(this.f90813h.provideReadCharacteristic(bluetoothGattCharacteristic))).firstOrError();
    }

    @Override // p000.uee
    public vkb<vkb<byte[]>> setupIndication(@efb UUID uuid, @efb khb khbVar) {
        return getCharacteristic(uuid).flatMapObservable(new C14025e(khbVar));
    }

    @Override // p000.uee
    public vkb<vkb<byte[]>> setupNotification(@efb UUID uuid, @efb khb khbVar) {
        return getCharacteristic(uuid).flatMapObservable(new C14024d(khbVar));
    }

    @Override // p000.uee
    public kjf<byte[]> writeCharacteristic(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic, @efb byte[] bArr) {
        return this.f90820o.checkAnyPropertyMatches(bluetoothGattCharacteristic, 76).andThen(this.f90810e.queue(this.f90813h.provideWriteCharacteristic(bluetoothGattCharacteristic, bArr))).firstOrError();
    }

    @Override // p000.uee
    public kjf<byte[]> readDescriptor(@efb BluetoothGattDescriptor bluetoothGattDescriptor) {
        return this.f90810e.queue(this.f90813h.provideReadDescriptor(bluetoothGattDescriptor)).firstOrError().map(new C14030j());
    }

    @Override // p000.uee
    public xd2 writeDescriptor(@efb BluetoothGattDescriptor bluetoothGattDescriptor, @efb byte[] bArr) {
        return this.f90819n.m21079a(bluetoothGattDescriptor, bArr);
    }

    @Override // p000.uee
    public vkb<vkb<byte[]>> setupIndication(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic, @efb khb khbVar) {
        return this.f90820o.checkAnyPropertyMatches(bluetoothGattCharacteristic, 32).andThen(this.f90817l.m23954n(bluetoothGattCharacteristic, khbVar, true));
    }

    @Override // p000.uee
    public vkb<vkb<byte[]>> setupNotification(@efb BluetoothGattCharacteristic bluetoothGattCharacteristic, @efb khb khbVar) {
        return this.f90820o.checkAnyPropertyMatches(bluetoothGattCharacteristic, 16).andThen(this.f90817l.m23954n(bluetoothGattCharacteristic, khbVar, false));
    }
}
