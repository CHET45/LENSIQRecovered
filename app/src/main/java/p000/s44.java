package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@igg({"RestrictedApi"})
public class s44<V> extends AbstractC15958z3<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: F */
    public final ScheduledFuture<?> f80624F;

    /* JADX INFO: renamed from: s44$a */
    public class C12430a implements InterfaceC12431b<V> {
        public C12430a() {
        }

        @Override // p000.s44.InterfaceC12431b
        public void set(V v) {
            s44.this.set(v);
        }

        @Override // p000.s44.InterfaceC12431b
        public void setException(Throwable th) {
            s44.this.setException(th);
        }
    }

    /* JADX INFO: renamed from: s44$b */
    public interface InterfaceC12431b<T> {
        void set(T t);

        void setException(Throwable th);
    }

    /* JADX INFO: renamed from: s44$c */
    public interface InterfaceC12432c<T> {
        ScheduledFuture<?> addCompleter(InterfaceC12431b<T> interfaceC12431b);
    }

    public s44(InterfaceC12432c<V> interfaceC12432c) {
        this.f80624F = interfaceC12432c.addCompleter(new C12430a());
    }

    @Override // p000.AbstractC15958z3
    /* JADX INFO: renamed from: a */
    public void mo21714a() {
        this.f80624F.cancel(m26539i());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f80624F.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.f80624F.compareTo(delayed);
    }
}
