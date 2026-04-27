package p000;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class d62 implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4628c f28499d;

    /* JADX INFO: renamed from: a */
    @gdi
    public final InterfaceC4628c f28500a;

    /* JADX INFO: renamed from: b */
    public final Deque<Closeable> f28501b = new ArrayDeque(4);

    /* JADX INFO: renamed from: c */
    @wx1
    public Throwable f28502c;

    /* JADX INFO: renamed from: d62$a */
    @gdi
    public static final class C4626a implements InterfaceC4628c {

        /* JADX INFO: renamed from: a */
        public static final C4626a f28503a = new C4626a();

        @Override // p000.d62.InterfaceC4628c
        public void suppress(Closeable closeable, Throwable thrown, Throwable suppressed) {
            w52.f93273a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, suppressed);
        }
    }

    /* JADX INFO: renamed from: d62$b */
    @gdi
    public static final class C4627b implements InterfaceC4628c {

        /* JADX INFO: renamed from: a */
        public final Method f28504a;

        private C4627b(Method addSuppressed) {
            this.f28504a = addSuppressed;
        }

        @wx1
        /* JADX INFO: renamed from: a */
        public static C4627b m8931a() {
            try {
                return new C4627b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // p000.d62.InterfaceC4628c
        public void suppress(Closeable closeable, Throwable thrown, Throwable suppressed) {
            if (thrown == suppressed) {
                return;
            }
            try {
                this.f28504a.invoke(thrown, suppressed);
            } catch (Throwable unused) {
                C4626a.f28503a.suppress(closeable, thrown, suppressed);
            }
        }
    }

    /* JADX INFO: renamed from: d62$c */
    @gdi
    public interface InterfaceC4628c {
        void suppress(Closeable closeable, Throwable thrown, Throwable suppressed);
    }

    static {
        InterfaceC4628c interfaceC4628cM8931a = C4627b.m8931a();
        if (interfaceC4628cM8931a == null) {
            interfaceC4628cM8931a = C4626a.f28503a;
        }
        f28499d = interfaceC4628cM8931a;
    }

    @gdi
    public d62(InterfaceC4628c suppressor) {
        this.f28500a = (InterfaceC4628c) v7d.checkNotNull(suppressor);
    }

    public static d62 create() {
        return new d62(f28499d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th = this.f28502c;
        while (!this.f28501b.isEmpty()) {
            Closeable closeableRemoveFirst = this.f28501b.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f28500a.suppress(closeableRemoveFirst, th, th2);
                }
            }
        }
        if (this.f28502c != null || th == null) {
            return;
        }
        bzg.propagateIfPossible(th, IOException.class);
        throw new AssertionError(th);
    }

    @op1
    @jgc
    public <C extends Closeable> C register(@jgc C closeable) {
        if (closeable != null) {
            this.f28501b.addFirst(closeable);
        }
        return closeable;
    }

    public RuntimeException rethrow(Throwable e) throws Throwable {
        v7d.checkNotNull(e);
        this.f28502c = e;
        bzg.propagateIfPossible(e, IOException.class);
        throw new RuntimeException(e);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable e, Class<X> declaredType) throws Exception {
        v7d.checkNotNull(e);
        this.f28502c = e;
        bzg.propagateIfPossible(e, IOException.class);
        bzg.propagateIfPossible(e, declaredType);
        throw new RuntimeException(e);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable e, Class<X1> declaredType1, Class<X2> declaredType2) throws Exception {
        v7d.checkNotNull(e);
        this.f28502c = e;
        bzg.propagateIfPossible(e, IOException.class);
        bzg.propagateIfPossible(e, declaredType1, declaredType2);
        throw new RuntimeException(e);
    }
}
