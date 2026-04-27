package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class h77 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: h77$a */
    public class C6733a<T> implements InterfaceC6734b<T> {

        /* JADX INFO: renamed from: a */
        public volatile T f42713a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC6734b f42714b;

        public C6733a(InterfaceC6734b interfaceC6734b) {
            this.f42714b = interfaceC6734b;
        }

        @Override // p000.h77.InterfaceC6734b
        public T get() {
            if (this.f42713a == null) {
                synchronized (this) {
                    try {
                        if (this.f42713a == null) {
                            this.f42713a = (T) t7d.checkNotNull(this.f42714b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f42713a;
        }
    }

    /* JADX INFO: renamed from: h77$b */
    public interface InterfaceC6734b<T> {
        T get();
    }

    private h77() {
    }

    public static <T> InterfaceC6734b<T> memorize(InterfaceC6734b<T> interfaceC6734b) {
        return new C6733a(interfaceC6734b);
    }
}
