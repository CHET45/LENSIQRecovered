package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@xx4
public final class lk9 {

    /* JADX INFO: renamed from: a */
    public static final lfg<ik9> f57985a;

    /* JADX INFO: renamed from: lk9$a */
    public class C8866a implements lfg<ik9> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.lfg
        public ik9 get() {
            return new mk9();
        }
    }

    /* JADX INFO: renamed from: lk9$b */
    public class C8867b implements lfg<ik9> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.lfg
        public ik9 get() {
            return new C8868c(null);
        }
    }

    /* JADX INFO: renamed from: lk9$c */
    public static final class C8868c extends AtomicLong implements ik9 {
        private C8868c() {
        }

        @Override // p000.ik9
        public void add(long x) {
            getAndAdd(x);
        }

        @Override // p000.ik9
        public void increment() {
            getAndIncrement();
        }

        @Override // p000.ik9
        public long sum() {
            return get();
        }

        public /* synthetic */ C8868c(C8866a c8866a) {
            this();
        }
    }

    static {
        lfg<ik9> c8867b;
        try {
            new mk9();
            c8867b = new C8866a();
        } catch (Throwable unused) {
            c8867b = new C8867b();
        }
        f57985a = c8867b;
    }

    public static ik9 create() {
        return f57985a.get();
    }
}
