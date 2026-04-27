package p000;

import android.bluetooth.BluetoothGatt;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import p000.a32;
import p000.rr2;

/* JADX INFO: loaded from: classes6.dex */
public class ft2 implements at2 {

    /* JADX INFO: renamed from: a */
    public final g42 f37654a;

    /* JADX INFO: renamed from: b */
    public final rr2.InterfaceC12211a f37655b;

    /* JADX INFO: renamed from: c */
    public final woe f37656c;

    @b28
    public ft2(g42 g42Var, rr2.InterfaceC12211a interfaceC12211a, @w8b(a32.C0034g.f250d) woe woeVar) {
        this.f37654a = g42Var;
        this.f37655b = interfaceC12211a;
        this.f37656c = woeVar;
    }

    /* JADX INFO: renamed from: e */
    public static vkb<uee> m11147e(rr2 rr2Var) {
        return rr2Var.gattCallback().observeDisconnect();
    }

    /* JADX INFO: renamed from: f */
    public static vkb<uee> m11148f(final rr2 rr2Var) {
        Objects.requireNonNull(rr2Var);
        return vkb.fromCallable(new Callable() { // from class: ct2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return rr2Var.rxBleConnection();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareConnection$0(Set set, lf4 lf4Var) throws Throwable {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((qs2) it.next()).onConnectionSubscribed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareConnection$1(Set set) throws Throwable {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((qs2) it.next()).onConnectionUnsubscribed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wub lambda$prepareConnection$2(js2 js2Var) throws Throwable {
        rr2 rr2VarBuild = this.f37655b.autoConnect(js2Var.f51650a).suppressOperationChecks(js2Var.f51651b).operationTimeout(js2Var.f51652c).build();
        final Set<qs2> setConnectionSubscriptionWatchers = rr2VarBuild.connectionSubscriptionWatchers();
        return m11148f(rr2VarBuild).mergeWith(m11147e(rr2VarBuild)).delaySubscription(m11149d(rr2VarBuild)).doOnSubscribe(new uu2() { // from class: dt2
            @Override // p000.uu2
            public final void accept(Object obj) throws Throwable {
                ft2.lambda$prepareConnection$0(setConnectionSubscriptionWatchers, (lf4) obj);
            }
        }).doFinally(new InterfaceC7776j8() { // from class: et2
            @Override // p000.InterfaceC7776j8
            public final void run() throws Throwable {
                ft2.lambda$prepareConnection$1(setConnectionSubscriptionWatchers);
            }
        }).subscribeOn(this.f37656c).unsubscribeOn(this.f37656c);
    }

    /* JADX INFO: renamed from: d */
    public vkb<BluetoothGatt> m11149d(rr2 rr2Var) {
        return this.f37654a.queue(rr2Var.connectOperation());
    }

    @Override // p000.at2
    public vkb<uee> prepareConnection(final js2 js2Var) {
        return vkb.defer(new nfg() { // from class: bt2
            @Override // p000.nfg
            public final Object get() {
                return this.f14708a.lambda$prepareConnection$2(js2Var);
            }
        });
    }
}
