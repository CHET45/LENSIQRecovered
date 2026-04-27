package p000;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class nqb {

    /* JADX INFO: renamed from: nqb$a */
    public static final class C9989a<T> implements nfg<or2<T>> {

        /* JADX INFO: renamed from: a */
        public final vkb<T> f65284a;

        /* JADX INFO: renamed from: b */
        public final int f65285b;

        /* JADX INFO: renamed from: c */
        public final boolean f65286c;

        public C9989a(vkb<T> parent, int bufferSize, boolean eagerTruncate) {
            this.f65284a = parent;
            this.f65285b = bufferSize;
            this.f65286c = eagerTruncate;
        }

        @Override // p000.nfg
        public or2<T> get() {
            return this.f65284a.replay(this.f65285b, this.f65286c);
        }
    }

    /* JADX INFO: renamed from: nqb$b */
    public static final class C9990b<T> implements nfg<or2<T>> {

        /* JADX INFO: renamed from: a */
        public final vkb<T> f65287a;

        /* JADX INFO: renamed from: b */
        public final int f65288b;

        /* JADX INFO: renamed from: c */
        public final long f65289c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f65290d;

        /* JADX INFO: renamed from: e */
        public final woe f65291e;

        /* JADX INFO: renamed from: f */
        public final boolean f65292f;

        public C9990b(vkb<T> parent, int bufferSize, long time, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
            this.f65287a = parent;
            this.f65288b = bufferSize;
            this.f65289c = time;
            this.f65290d = unit;
            this.f65291e = scheduler;
            this.f65292f = eagerTruncate;
        }

        @Override // p000.nfg
        public or2<T> get() {
            return this.f65287a.replay(this.f65288b, this.f65289c, this.f65290d, this.f65291e, this.f65292f);
        }
    }

    /* JADX INFO: renamed from: nqb$c */
    public static final class C9991c<T, U> implements sy6<T, wub<U>> {

        /* JADX INFO: renamed from: a */
        public final sy6<? super T, ? extends Iterable<? extends U>> f65293a;

        public C9991c(sy6<? super T, ? extends Iterable<? extends U>> mapper) {
            this.f65293a = mapper;
        }

        @Override // p000.sy6
        public wub<U> apply(T t) throws Throwable {
            Iterable<? extends U> iterableApply = this.f65293a.apply(t);
            Objects.requireNonNull(iterableApply, "The mapper returned a null Iterable");
            return new spb(iterableApply);
        }
    }

    /* JADX INFO: renamed from: nqb$d */
    public static final class C9992d<U, R, T> implements sy6<U, R> {

        /* JADX INFO: renamed from: a */
        public final i11<? super T, ? super U, ? extends R> f65294a;

        /* JADX INFO: renamed from: b */
        public final T f65295b;

        public C9992d(i11<? super T, ? super U, ? extends R> combiner, T t) {
            this.f65294a = combiner;
            this.f65295b = t;
        }

        @Override // p000.sy6
        public R apply(U u) throws Throwable {
            return this.f65294a.apply(this.f65295b, u);
        }
    }

    /* JADX INFO: renamed from: nqb$e */
    public static final class C9993e<T, R, U> implements sy6<T, wub<R>> {

        /* JADX INFO: renamed from: a */
        public final i11<? super T, ? super U, ? extends R> f65296a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends U>> f65297b;

        public C9993e(i11<? super T, ? super U, ? extends R> combiner, sy6<? super T, ? extends wub<? extends U>> mapper) {
            this.f65296a = combiner;
            this.f65297b = mapper;
        }

        @Override // p000.sy6
        public wub<R> apply(final T t) throws Throwable {
            wub<? extends U> wubVarApply = this.f65297b.apply(t);
            Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
            return new hrb(wubVarApply, new C9992d(this.f65296a, t));
        }
    }

    /* JADX INFO: renamed from: nqb$f */
    public static final class C9994f<T, U> implements sy6<T, wub<T>> {

        /* JADX INFO: renamed from: a */
        public final sy6<? super T, ? extends wub<U>> f65298a;

        public C9994f(sy6<? super T, ? extends wub<U>> itemDelay) {
            this.f65298a = itemDelay;
        }

        @Override // p000.sy6
        public wub<T> apply(final T v) throws Throwable {
            wub<U> wubVarApply = this.f65298a.apply(v);
            Objects.requireNonNull(wubVarApply, "The itemDelay returned a null ObservableSource");
            return new mvb(wubVarApply, 1L).map(r07.justFunction(v)).defaultIfEmpty(v);
        }
    }

    /* JADX INFO: renamed from: nqb$g */
    public enum EnumC9995g implements sy6<Object, Object> {
        INSTANCE;

        @Override // p000.sy6
        public Object apply(Object t) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: nqb$h */
    public static final class C9996h<T> implements InterfaceC7776j8 {

        /* JADX INFO: renamed from: a */
        public final pxb<T> f65301a;

        public C9996h(pxb<T> observer) {
            this.f65301a = observer;
        }

        @Override // p000.InterfaceC7776j8
        public void run() {
            this.f65301a.onComplete();
        }
    }

    /* JADX INFO: renamed from: nqb$i */
    public static final class C9997i<T> implements uu2<Throwable> {

        /* JADX INFO: renamed from: a */
        public final pxb<T> f65302a;

        public C9997i(pxb<T> observer) {
            this.f65302a = observer;
        }

        @Override // p000.uu2
        public void accept(Throwable v) {
            this.f65302a.onError(v);
        }
    }

    /* JADX INFO: renamed from: nqb$j */
    public static final class C9998j<T> implements uu2<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<T> f65303a;

        public C9998j(pxb<T> observer) {
            this.f65303a = observer;
        }

        @Override // p000.uu2
        public void accept(T v) {
            this.f65303a.onNext(v);
        }
    }

    /* JADX INFO: renamed from: nqb$k */
    public static final class C9999k<T> implements nfg<or2<T>> {

        /* JADX INFO: renamed from: a */
        public final vkb<T> f65304a;

        public C9999k(vkb<T> parent) {
            this.f65304a = parent;
        }

        @Override // p000.nfg
        public or2<T> get() {
            return this.f65304a.replay();
        }
    }

    /* JADX INFO: renamed from: nqb$l */
    public static final class C10000l<T, S> implements i11<S, qy4<T>, S> {

        /* JADX INFO: renamed from: a */
        public final e11<S, qy4<T>> f65305a;

        public C10000l(e11<S, qy4<T>> consumer) {
            this.f65305a = consumer;
        }

        @Override // p000.i11
        public S apply(S t1, qy4<T> t2) throws Throwable {
            this.f65305a.accept(t1, t2);
            return t1;
        }
    }

    /* JADX INFO: renamed from: nqb$m */
    public static final class C10001m<T, S> implements i11<S, qy4<T>, S> {

        /* JADX INFO: renamed from: a */
        public final uu2<qy4<T>> f65306a;

        public C10001m(uu2<qy4<T>> consumer) {
            this.f65306a = consumer;
        }

        @Override // p000.i11
        public S apply(S t1, qy4<T> t2) throws Throwable {
            this.f65306a.accept(t2);
            return t1;
        }
    }

    /* JADX INFO: renamed from: nqb$n */
    public static final class C10002n<T> implements nfg<or2<T>> {

        /* JADX INFO: renamed from: a */
        public final vkb<T> f65307a;

        /* JADX INFO: renamed from: b */
        public final long f65308b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f65309c;

        /* JADX INFO: renamed from: d */
        public final woe f65310d;

        /* JADX INFO: renamed from: e */
        public final boolean f65311e;

        public C10002n(vkb<T> parent, long time, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
            this.f65307a = parent;
            this.f65308b = time;
            this.f65309c = unit;
            this.f65310d = scheduler;
            this.f65311e = eagerTruncate;
        }

        @Override // p000.nfg
        public or2<T> get() {
            return this.f65307a.replay(this.f65308b, this.f65309c, this.f65310d, this.f65311e);
        }
    }

    private nqb() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> sy6<T, wub<U>> flatMapIntoIterable(final sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        return new C9991c(mapper);
    }

    public static <T, U, R> sy6<T, wub<R>> flatMapWithCombiner(final sy6<? super T, ? extends wub<? extends U>> mapper, final i11<? super T, ? super U, ? extends R> combiner) {
        return new C9993e(combiner, mapper);
    }

    public static <T, U> sy6<T, wub<T>> itemDelay(final sy6<? super T, ? extends wub<U>> itemDelay) {
        return new C9994f(itemDelay);
    }

    public static <T> InterfaceC7776j8 observerOnComplete(pxb<T> observer) {
        return new C9996h(observer);
    }

    public static <T> uu2<Throwable> observerOnError(pxb<T> observer) {
        return new C9997i(observer);
    }

    public static <T> uu2<T> observerOnNext(pxb<T> observer) {
        return new C9998j(observer);
    }

    public static <T> nfg<or2<T>> replaySupplier(final vkb<T> parent) {
        return new C9999k(parent);
    }

    public static <T, S> i11<S, qy4<T>, S> simpleBiGenerator(e11<S, qy4<T>> consumer) {
        return new C10000l(consumer);
    }

    public static <T, S> i11<S, qy4<T>, S> simpleGenerator(uu2<qy4<T>> consumer) {
        return new C10001m(consumer);
    }

    public static <T> nfg<or2<T>> replaySupplier(final vkb<T> parent, final int bufferSize, boolean eagerTruncate) {
        return new C9989a(parent, bufferSize, eagerTruncate);
    }

    public static <T> nfg<or2<T>> replaySupplier(final vkb<T> parent, final int bufferSize, final long time, final TimeUnit unit, final woe scheduler, boolean eagerTruncate) {
        return new C9990b(parent, bufferSize, time, unit, scheduler, eagerTruncate);
    }

    public static <T> nfg<or2<T>> replaySupplier(final vkb<T> parent, final long time, final TimeUnit unit, final woe scheduler, boolean eagerTruncate) {
        return new C10002n(parent, time, unit, scheduler, eagerTruncate);
    }
}
