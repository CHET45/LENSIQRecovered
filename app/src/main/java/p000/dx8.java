package p000;

/* JADX INFO: loaded from: classes5.dex */
public class dx8<T> implements eid<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f31245c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f31246a;

    /* JADX INFO: renamed from: b */
    public volatile eid<T> f31247b;

    public dx8(T t) {
        this.f31246a = f31245c;
        this.f31246a = t;
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public boolean m9519a() {
        return this.f31246a != f31245c;
    }

    @Override // p000.eid
    public T get() {
        T t = (T) this.f31246a;
        Object obj = f31245c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = (T) this.f31246a;
                    if (t == obj) {
                        t = this.f31247b.get();
                        this.f31246a = t;
                        this.f31247b = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }

    public dx8(eid<T> eidVar) {
        this.f31246a = f31245c;
        this.f31247b = eidVar;
    }
}
