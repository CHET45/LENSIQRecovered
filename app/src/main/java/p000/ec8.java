package p000;

import p000.ft9;
import p000.gt9;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
@yg8
public final class ec8 {

    /* JADX INFO: renamed from: ec8$b */
    public static class C5252b {

        /* JADX INFO: renamed from: a */
        public final ft9 f32616a;

        /* JADX INFO: renamed from: b */
        public boolean f32617b;

        public <E> dc8<E> build() {
            if (!this.f32617b) {
                this.f32616a.weakKeys();
            }
            return new C5254d(this.f32616a);
        }

        public C5252b concurrencyLevel(int concurrencyLevel) {
            this.f32616a.concurrencyLevel(concurrencyLevel);
            return this;
        }

        public C5252b strong() {
            this.f32617b = true;
            return this;
        }

        @jd7("java.lang.ref.WeakReference")
        public C5252b weak() {
            this.f32617b = false;
            return this;
        }

        private C5252b() {
            this.f32616a = new ft9();
            this.f32617b = true;
        }
    }

    /* JADX INFO: renamed from: ec8$c */
    public static class C5253c<E> implements lz6<E, E> {

        /* JADX INFO: renamed from: a */
        public final dc8<E> f32618a;

        public C5253c(dc8<E> interner) {
            this.f32618a = interner;
        }

        @Override // p000.lz6
        public E apply(E input) {
            return this.f32618a.intern(input);
        }

        @Override // p000.lz6
        public boolean equals(@wx1 Object other) {
            if (other instanceof C5253c) {
                return this.f32618a.equals(((C5253c) other).f32618a);
            }
            return false;
        }

        public int hashCode() {
            return this.f32618a.hashCode();
        }
    }

    /* JADX INFO: renamed from: ec8$d */
    @gdi
    public static final class C5254d<E> implements dc8<E> {

        /* JADX INFO: renamed from: a */
        @gdi
        public final gt9<E, ft9.EnumC5962a, ?, ?> f32619a;

        @Override // p000.dc8
        public E intern(E e) {
            E e2;
            do {
                gt9.InterfaceC6513j interfaceC6513jM11868f = this.f32619a.m11868f(e);
                if (interfaceC6513jM11868f != null && (e2 = (E) interfaceC6513jM11868f.getKey()) != null) {
                    return e2;
                }
            } while (this.f32619a.putIfAbsent(e, ft9.EnumC5962a.VALUE) != null);
            return e;
        }

        private C5254d(ft9 mapMaker) {
            this.f32619a = gt9.m11863e(mapMaker.m11156f(r45.equals()));
        }
    }

    private ec8() {
    }

    public static <E> lz6<E, E> asFunction(dc8<E> interner) {
        return new C5253c((dc8) v7d.checkNotNull(interner));
    }

    public static C5252b newBuilder() {
        return new C5252b();
    }

    public static <E> dc8<E> newStrongInterner() {
        return newBuilder().strong().build();
    }

    @jd7("java.lang.ref.WeakReference")
    public static <E> dc8<E> newWeakInterner() {
        return newBuilder().weak().build();
    }
}
