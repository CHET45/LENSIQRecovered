package p000;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class r4f extends ynf<ffe> {

    /* JADX INFO: renamed from: e */
    public final BluetoothGatt f77025e;

    /* JADX INFO: renamed from: f */
    public final qj9 f77026f;

    public r4f(gfe gfeVar, BluetoothGatt bluetoothGatt, qj9 qj9Var, y1h y1hVar) {
        super(bluetoothGatt, gfeVar, i51.f45760c, y1hVar);
        this.f77025e = bluetoothGatt;
        this.f77026f = qj9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCallback$0(ffe ffeVar) throws Throwable {
        this.f77026f.log(ffeVar, this.f77025e.getDevice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ffe lambda$timeoutFallbackProcedure$1(BluetoothGatt bluetoothGatt) throws Exception {
        return new ffe(bluetoothGatt.getServices());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ kjf lambda$timeoutFallbackProcedure$2(final BluetoothGatt bluetoothGatt, Long l) throws Throwable {
        return kjf.fromCallable(new Callable() { // from class: o4f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r4f.lambda$timeoutFallbackProcedure$1(bluetoothGatt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ oof lambda$timeoutFallbackProcedure$3(final BluetoothGatt bluetoothGatt, woe woeVar) throws Throwable {
        return bluetoothGatt.getServices().size() == 0 ? kjf.error(new d51(bluetoothGatt, i51.f45760c)) : kjf.timer(5L, TimeUnit.SECONDS, woeVar).flatMap(new sy6() { // from class: n4f
            @Override // p000.sy6
            public final Object apply(Object obj) {
                return r4f.lambda$timeoutFallbackProcedure$2(bluetoothGatt, (Long) obj);
            }
        });
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: c */
    public kjf<ffe> mo11830c(gfe gfeVar) {
        return gfeVar.getOnServicesDiscovered().firstOrError().doOnSuccess(new uu2() { // from class: p4f
            @Override // p000.uu2
            public final void accept(Object obj) throws Throwable {
                this.f69643a.lambda$getCallback$0((ffe) obj);
            }
        });
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: d */
    public boolean mo11831d(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.discoverServices();
    }

    @Override // p000.ynf
    @efb
    /* JADX INFO: renamed from: e */
    public kjf<ffe> mo21015e(final BluetoothGatt bluetoothGatt, gfe gfeVar, final woe woeVar) {
        return kjf.defer(new nfg() { // from class: q4f
            @Override // p000.nfg
            public final Object get() {
                return r4f.lambda$timeoutFallbackProcedure$3(bluetoothGatt, woeVar);
            }
        });
    }

    @Override // p000.ynf
    public String toString() {
        return "ServiceDiscoveryOperation{" + super.toString() + '}';
    }
}
