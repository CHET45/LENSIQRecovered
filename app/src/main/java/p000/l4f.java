package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class l4f {

    /* JADX INFO: renamed from: a */
    public final bs2 f56144a;

    /* JADX INFO: renamed from: b */
    public final BluetoothGatt f56145b;

    /* JADX INFO: renamed from: c */
    public final m6c f56146c;

    /* JADX INFO: renamed from: d */
    public kjf<ffe> f56147d;

    /* JADX INFO: renamed from: e */
    public final ncg<y1h> f56148e = r01.create().toSerialized();

    /* JADX INFO: renamed from: f */
    public boolean f56149f = false;

    /* JADX INFO: renamed from: l4f$a */
    public class C8605a implements uu2<lf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f56150a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TimeUnit f56151b;

        public C8605a(long j, TimeUnit timeUnit) {
            this.f56150a = j;
            this.f56151b = timeUnit;
        }

        @Override // p000.uu2
        public void accept(lf4 lf4Var) {
            l4f.this.f56148e.onNext(new y1h(this.f56150a, this.f56151b, mpe.computation()));
        }
    }

    /* JADX INFO: renamed from: l4f$b */
    public class C8606b implements InterfaceC7776j8 {
        public C8606b() {
        }

        @Override // p000.InterfaceC7776j8
        public void run() {
            l4f.this.f56149f = true;
        }
    }

    /* JADX INFO: renamed from: l4f$c */
    public class C8607c implements InterfaceC7776j8 {
        public C8607c() {
        }

        @Override // p000.InterfaceC7776j8
        public void run() {
            l4f.this.m15305b();
        }
    }

    /* JADX INFO: renamed from: l4f$d */
    public class C8608d implements sy6<List<BluetoothGattService>, ffe> {
        @Override // p000.sy6
        public ffe apply(List<BluetoothGattService> list) {
            return new ffe(list);
        }
    }

    /* JADX INFO: renamed from: l4f$e */
    public class C8609e implements n8d<List<BluetoothGattService>> {
        public C8609e() {
        }

        @Override // p000.n8d
        public boolean test(List<BluetoothGattService> list) {
            return list.size() > 0;
        }
    }

    /* JADX INFO: renamed from: l4f$f */
    public class CallableC8610f implements Callable<List<BluetoothGattService>> {
        public CallableC8610f() {
        }

        @Override // java.util.concurrent.Callable
        public List<BluetoothGattService> call() {
            return l4f.this.f56145b.getServices();
        }
    }

    /* JADX INFO: renamed from: l4f$g */
    public class C8611g implements sy6<y1h, kjf<ffe>> {
        public C8611g() {
        }

        @Override // p000.sy6
        public kjf<ffe> apply(y1h y1hVar) {
            return l4f.this.f56144a.queue(l4f.this.f56146c.provideServiceDiscoveryOperation(y1hVar.f100095a, y1hVar.f100096b)).firstOrError();
        }
    }

    @b28
    public l4f(bs2 bs2Var, BluetoothGatt bluetoothGatt, m6c m6cVar) {
        this.f56144a = bs2Var;
        this.f56145b = bluetoothGatt;
        this.f56146c = m6cVar;
        m15305b();
    }

    private r4a<List<BluetoothGattService>> getListOfServicesFromGatt() {
        return kjf.fromCallable(new CallableC8610f()).filter(new C8609e());
    }

    @efb
    private kjf<y1h> getTimeoutConfiguration() {
        return this.f56148e.firstOrError();
    }

    @efb
    private sy6<y1h, kjf<ffe>> scheduleActualDiscoveryWithTimeout() {
        return new C8611g();
    }

    @efb
    private static sy6<List<BluetoothGattService>, ffe> wrapIntoRxBleDeviceServices() {
        return new C8608d();
    }

    /* JADX INFO: renamed from: a */
    public kjf<ffe> m15304a(long j, TimeUnit timeUnit) {
        return this.f56149f ? this.f56147d : this.f56147d.doOnSubscribe(new C8605a(j, timeUnit));
    }

    /* JADX INFO: renamed from: b */
    public void m15305b() {
        this.f56149f = false;
        this.f56147d = getListOfServicesFromGatt().map(wrapIntoRxBleDeviceServices()).switchIfEmpty((oof<? extends R>) getTimeoutConfiguration().flatMap(scheduleActualDiscoveryWithTimeout())).doOnSuccess(r07.actionConsumer(new C8606b())).doOnError(r07.actionConsumer(new C8607c())).cache();
    }
}
