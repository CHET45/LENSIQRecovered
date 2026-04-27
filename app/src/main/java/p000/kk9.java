package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7(emulated = true)
public final class kk9 {

    /* JADX INFO: renamed from: a */
    public static final lfg<jk9> f54552a;

    /* JADX INFO: renamed from: kk9$a */
    public class C8434a implements lfg<jk9> {
        @Override // p000.lfg
        public jk9 get() {
            return new nk9();
        }
    }

    /* JADX INFO: renamed from: kk9$b */
    public class C8435b implements lfg<jk9> {
        @Override // p000.lfg
        public jk9 get() {
            return new C8436c(null);
        }
    }

    /* JADX INFO: renamed from: kk9$c */
    public static final class C8436c extends AtomicLong implements jk9 {
        private C8436c() {
        }

        @Override // p000.jk9
        public void add(long x) {
            getAndAdd(x);
        }

        @Override // p000.jk9
        public void increment() {
            getAndIncrement();
        }

        @Override // p000.jk9
        public long sum() {
            return get();
        }

        public /* synthetic */ C8436c(C8434a c8434a) {
            this();
        }
    }

    static {
        lfg<jk9> c8435b;
        try {
            new nk9();
            c8435b = new C8434a();
        } catch (Throwable unused) {
            c8435b = new C8435b();
        }
        f54552a = c8435b;
    }

    public static jk9 create() {
        return f54552a.get();
    }
}
