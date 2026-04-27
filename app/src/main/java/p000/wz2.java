package p000;

import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public abstract class wz2<A, B> implements lz6<A, B> {

    /* JADX INFO: renamed from: a */
    public final boolean f95831a;

    /* JADX INFO: renamed from: b */
    @RetainedWith
    @wx1
    @ez8
    public transient wz2<B, A> f95832b;

    /* JADX INFO: renamed from: wz2$a */
    public class C14844a implements Iterable<B> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f95833a;

        /* JADX INFO: renamed from: wz2$a$a */
        public class a implements Iterator<B> {

            /* JADX INFO: renamed from: a */
            public final Iterator<? extends A> f95835a;

            public a() {
                this.f95835a = C14844a.this.f95833a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f95835a.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) wz2.this.convert(this.f95835a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f95835a.remove();
            }
        }

        public C14844a(final Iterable val$fromIterable) {
            this.f95833a = val$fromIterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: wz2$b */
    public static final class C14845b<A, B, C> extends wz2<A, C> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        public final wz2<A, B> f95837c;

        /* JADX INFO: renamed from: d */
        public final wz2<B, C> f95838d;

        public C14845b(wz2<A, B> first, wz2<B, C> second) {
            this.f95837c = first;
            this.f95838d = second;
        }

        @Override // p000.wz2
        @wx1
        /* JADX INFO: renamed from: a */
        public A mo24878a(@wx1 C c) {
            return (A) this.f95837c.mo24878a(this.f95838d.mo24878a(c));
        }

        @Override // p000.wz2
        @wx1
        /* JADX INFO: renamed from: b */
        public C mo24879b(@wx1 A a) {
            return (C) this.f95838d.mo24879b(this.f95837c.mo24879b(a));
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: d */
        public A mo13178d(C c) {
            throw new AssertionError();
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: e */
        public C mo13179e(A a) {
            throw new AssertionError();
        }

        @Override // p000.wz2, p000.lz6
        public boolean equals(@wx1 Object object) {
            if (!(object instanceof C14845b)) {
                return false;
            }
            C14845b c14845b = (C14845b) object;
            return this.f95837c.equals(c14845b.f95837c) && this.f95838d.equals(c14845b.f95838d);
        }

        public int hashCode() {
            return (this.f95837c.hashCode() * 31) + this.f95838d.hashCode();
        }

        public String toString() {
            return this.f95837c + ".andThen(" + this.f95838d + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: wz2$c */
    public static final class C14846c<A, B> extends wz2<A, B> implements Serializable {

        /* JADX INFO: renamed from: c */
        public final lz6<? super A, ? extends B> f95839c;

        /* JADX INFO: renamed from: d */
        public final lz6<? super B, ? extends A> f95840d;

        public /* synthetic */ C14846c(lz6 lz6Var, lz6 lz6Var2, C14844a c14844a) {
            this(lz6Var, lz6Var2);
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: d */
        public A mo13178d(B b) {
            return this.f95840d.apply(b);
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: e */
        public B mo13179e(A a) {
            return this.f95839c.apply(a);
        }

        @Override // p000.wz2, p000.lz6
        public boolean equals(@wx1 Object object) {
            if (!(object instanceof C14846c)) {
                return false;
            }
            C14846c c14846c = (C14846c) object;
            return this.f95839c.equals(c14846c.f95839c) && this.f95840d.equals(c14846c.f95840d);
        }

        public int hashCode() {
            return (this.f95839c.hashCode() * 31) + this.f95840d.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f95839c + ", " + this.f95840d + c0b.f15434d;
        }

        private C14846c(lz6<? super A, ? extends B> forwardFunction, lz6<? super B, ? extends A> backwardFunction) {
            this.f95839c = (lz6) v7d.checkNotNull(forwardFunction);
            this.f95840d = (lz6) v7d.checkNotNull(backwardFunction);
        }
    }

    /* JADX INFO: renamed from: wz2$d */
    public static final class C14847d<T> extends wz2<T, T> implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final C14847d<?> f95841c = new C14847d<>();
        private static final long serialVersionUID = 0;

        private C14847d() {
        }

        private Object readResolve() {
            return f95841c;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: c */
        public <S> wz2<T, S> mo24880c(wz2<T, S> otherConverter) {
            return (wz2) v7d.checkNotNull(otherConverter, "otherConverter");
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: d */
        public T mo13178d(T t) {
            return t;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: e */
        public T mo13179e(T t) {
            return t;
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // p000.wz2
        public C14847d<T> reverse() {
            return this;
        }
    }

    /* JADX INFO: renamed from: wz2$e */
    public static final class C14848e<A, B> extends wz2<B, A> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        public final wz2<A, B> f95842c;

        public C14848e(wz2<A, B> original) {
            this.f95842c = original;
        }

        @Override // p000.wz2
        @wx1
        /* JADX INFO: renamed from: a */
        public B mo24878a(@wx1 A a) {
            return this.f95842c.mo24879b(a);
        }

        @Override // p000.wz2
        @wx1
        /* JADX INFO: renamed from: b */
        public A mo24879b(@wx1 B b) {
            return this.f95842c.mo24878a(b);
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: d */
        public B mo13178d(A a) {
            throw new AssertionError();
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: e */
        public A mo13179e(B b) {
            throw new AssertionError();
        }

        @Override // p000.wz2, p000.lz6
        public boolean equals(@wx1 Object object) {
            if (object instanceof C14848e) {
                return this.f95842c.equals(((C14848e) object).f95842c);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f95842c.hashCode();
        }

        @Override // p000.wz2
        public wz2<A, B> reverse() {
            return this.f95842c;
        }

        public String toString() {
            return this.f95842c + ".reverse()";
        }
    }

    public wz2() {
        this(true);
    }

    public static <A, B> wz2<A, B> from(lz6<? super A, ? extends B> forwardFunction, lz6<? super B, ? extends A> backwardFunction) {
        return new C14846c(forwardFunction, backwardFunction, null);
    }

    public static <T> wz2<T, T> identity() {
        return C14847d.f95841c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wx1
    private A unsafeDoBackward(@wx1 B b) {
        return (A) mo13178d(uib.m23370a(b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wx1
    private B unsafeDoForward(@wx1 A a) {
        return (B) mo13179e(uib.m23370a(a));
    }

    @wx1
    /* JADX INFO: renamed from: a */
    public A mo24878a(@wx1 B b) {
        if (!this.f95831a) {
            return unsafeDoBackward(b);
        }
        if (b == null) {
            return null;
        }
        return (A) v7d.checkNotNull(mo13178d(b));
    }

    public final <C> wz2<A, C> andThen(wz2<B, C> secondConverter) {
        return mo24880c(secondConverter);
    }

    @Override // p000.lz6
    @Deprecated
    @p28(replacement = "this.convert(a)")
    public final B apply(A a) {
        return convert(a);
    }

    @wx1
    /* JADX INFO: renamed from: b */
    public B mo24879b(@wx1 A a) {
        if (!this.f95831a) {
            return unsafeDoForward(a);
        }
        if (a == null) {
            return null;
        }
        return (B) v7d.checkNotNull(mo13179e(a));
    }

    /* JADX INFO: renamed from: c */
    public <C> wz2<A, C> mo24880c(wz2<B, C> secondConverter) {
        return new C14845b(this, (wz2) v7d.checkNotNull(secondConverter));
    }

    @wx1
    public final B convert(@wx1 A a) {
        return mo24879b(a);
    }

    public Iterable<B> convertAll(Iterable<? extends A> fromIterable) {
        v7d.checkNotNull(fromIterable, "fromIterable");
        return new C14844a(fromIterable);
    }

    @vp6
    /* JADX INFO: renamed from: d */
    public abstract A mo13178d(B b);

    @vp6
    /* JADX INFO: renamed from: e */
    public abstract B mo13179e(A a);

    @Override // p000.lz6
    public boolean equals(@wx1 Object object) {
        return super.equals(object);
    }

    @zx1
    public wz2<B, A> reverse() {
        wz2<B, A> wz2Var = this.f95832b;
        if (wz2Var != null) {
            return wz2Var;
        }
        C14848e c14848e = new C14848e(this);
        this.f95832b = c14848e;
        return c14848e;
    }

    public wz2(boolean handleNullAutomatically) {
        this.f95831a = handleNullAutomatically;
    }
}
