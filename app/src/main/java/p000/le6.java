package p000;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class le6 {

    /* JADX INFO: renamed from: le6$a */
    public static final class C8785a<T> implements nfg<mr2<T>> {

        /* JADX INFO: renamed from: a */
        public final l86<T> f57352a;

        /* JADX INFO: renamed from: b */
        public final int f57353b;

        /* JADX INFO: renamed from: c */
        public final boolean f57354c;

        public C8785a(l86<T> parent, int bufferSize, boolean eagerTruncate) {
            this.f57352a = parent;
            this.f57353b = bufferSize;
            this.f57354c = eagerTruncate;
        }

        @Override // p000.nfg
        public mr2<T> get() {
            return this.f57352a.replay(this.f57353b, this.f57354c);
        }
    }

    /* JADX INFO: renamed from: le6$b */
    public static final class C8786b<T> implements nfg<mr2<T>> {

        /* JADX INFO: renamed from: a */
        public final l86<T> f57355a;

        /* JADX INFO: renamed from: b */
        public final int f57356b;

        /* JADX INFO: renamed from: c */
        public final long f57357c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f57358d;

        /* JADX INFO: renamed from: e */
        public final woe f57359e;

        /* JADX INFO: renamed from: f */
        public final boolean f57360f;

        public C8786b(l86<T> parent, int bufferSize, long time, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
            this.f57355a = parent;
            this.f57356b = bufferSize;
            this.f57357c = time;
            this.f57358d = unit;
            this.f57359e = scheduler;
            this.f57360f = eagerTruncate;
        }

        @Override // p000.nfg
        public mr2<T> get() {
            return this.f57355a.replay(this.f57356b, this.f57357c, this.f57358d, this.f57359e, this.f57360f);
        }
    }

    /* JADX INFO: renamed from: le6$c */
    public static final class C8787c<T, U> implements sy6<T, zjd<U>> {

        /* JADX INFO: renamed from: a */
        public final sy6<? super T, ? extends Iterable<? extends U>> f57361a;

        public C8787c(sy6<? super T, ? extends Iterable<? extends U>> mapper) {
            this.f57361a = mapper;
        }

        @Override // p000.sy6
        public zjd<U> apply(T t) throws Throwable {
            Iterable<? extends U> iterableApply = this.f57361a.apply(t);
            Objects.requireNonNull(iterableApply, "The mapper returned a null Iterable");
            return new qd6(iterableApply);
        }
    }

    /* JADX INFO: renamed from: le6$d */
    public static final class C8788d<U, R, T> implements sy6<U, R> {

        /* JADX INFO: renamed from: a */
        public final i11<? super T, ? super U, ? extends R> f57362a;

        /* JADX INFO: renamed from: b */
        public final T f57363b;

        public C8788d(i11<? super T, ? super U, ? extends R> combiner, T t) {
            this.f57362a = combiner;
            this.f57363b = t;
        }

        @Override // p000.sy6
        public R apply(U u) throws Throwable {
            return this.f57362a.apply(this.f57363b, u);
        }
    }

    /* JADX INFO: renamed from: le6$e */
    public static final class C8789e<T, R, U> implements sy6<T, zjd<R>> {

        /* JADX INFO: renamed from: a */
        public final i11<? super T, ? super U, ? extends R> f57364a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<? extends U>> f57365b;

        public C8789e(i11<? super T, ? super U, ? extends R> combiner, sy6<? super T, ? extends zjd<? extends U>> mapper) {
            this.f57364a = combiner;
            this.f57365b = mapper;
        }

        @Override // p000.sy6
        public zjd<R> apply(final T t) throws Throwable {
            zjd<? extends U> zjdVarApply = this.f57365b.apply(t);
            Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
            return new hf6(zjdVarApply, new C8788d(this.f57364a, t));
        }
    }

    /* JADX INFO: renamed from: le6$f */
    public static final class C8790f<T, U> implements sy6<T, zjd<T>> {

        /* JADX INFO: renamed from: a */
        public final sy6<? super T, ? extends zjd<U>> f57366a;

        public C8790f(sy6<? super T, ? extends zjd<U>> itemDelay) {
            this.f57366a = itemDelay;
        }

        @Override // p000.sy6
        public zjd<T> apply(final T v) throws Throwable {
            zjd<U> zjdVarApply = this.f57366a.apply(v);
            Objects.requireNonNull(zjdVarApply, "The itemDelay returned a null Publisher");
            return new hk6(zjdVarApply, 1L).map(r07.justFunction(v)).defaultIfEmpty(v);
        }
    }

    /* JADX INFO: renamed from: le6$g */
    public static final class C8791g<T> implements nfg<mr2<T>> {

        /* JADX INFO: renamed from: a */
        public final l86<T> f57367a;

        public C8791g(l86<T> parent) {
            this.f57367a = parent;
        }

        @Override // p000.nfg
        public mr2<T> get() {
            return this.f57367a.replay();
        }
    }

    /* JADX INFO: renamed from: le6$h */
    public enum EnumC8792h implements uu2<fdg> {
        INSTANCE;

        @Override // p000.uu2
        public void accept(fdg t) {
            t.request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: le6$i */
    public static final class C8793i<T, S> implements i11<S, qy4<T>, S> {

        /* JADX INFO: renamed from: a */
        public final e11<S, qy4<T>> f57370a;

        public C8793i(e11<S, qy4<T>> consumer) {
            this.f57370a = consumer;
        }

        @Override // p000.i11
        public S apply(S t1, qy4<T> t2) throws Throwable {
            this.f57370a.accept(t1, t2);
            return t1;
        }
    }

    /* JADX INFO: renamed from: le6$j */
    public static final class C8794j<T, S> implements i11<S, qy4<T>, S> {

        /* JADX INFO: renamed from: a */
        public final uu2<qy4<T>> f57371a;

        public C8794j(uu2<qy4<T>> consumer) {
            this.f57371a = consumer;
        }

        @Override // p000.i11
        public S apply(S t1, qy4<T> t2) throws Throwable {
            this.f57371a.accept(t2);
            return t1;
        }
    }

    /* JADX INFO: renamed from: le6$k */
    public static final class C8795k<T> implements InterfaceC7776j8 {

        /* JADX INFO: renamed from: a */
        public final ycg<T> f57372a;

        public C8795k(ycg<T> subscriber) {
            this.f57372a = subscriber;
        }

        @Override // p000.InterfaceC7776j8
        public void run() {
            this.f57372a.onComplete();
        }
    }

    /* JADX INFO: renamed from: le6$l */
    public static final class C8796l<T> implements uu2<Throwable> {

        /* JADX INFO: renamed from: a */
        public final ycg<T> f57373a;

        public C8796l(ycg<T> subscriber) {
            this.f57373a = subscriber;
        }

        @Override // p000.uu2
        public void accept(Throwable v) {
            this.f57373a.onError(v);
        }
    }

    /* JADX INFO: renamed from: le6$m */
    public static final class C8797m<T> implements uu2<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<T> f57374a;

        public C8797m(ycg<T> subscriber) {
            this.f57374a = subscriber;
        }

        @Override // p000.uu2
        public void accept(T v) {
            this.f57374a.onNext(v);
        }
    }

    /* JADX INFO: renamed from: le6$n */
    public static final class C8798n<T> implements nfg<mr2<T>> {

        /* JADX INFO: renamed from: a */
        public final l86<T> f57375a;

        /* JADX INFO: renamed from: b */
        public final long f57376b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f57377c;

        /* JADX INFO: renamed from: d */
        public final woe f57378d;

        /* JADX INFO: renamed from: e */
        public final boolean f57379e;

        public C8798n(l86<T> parent, long time, TimeUnit unit, woe scheduler, boolean eagerTruncate) {
            this.f57375a = parent;
            this.f57376b = time;
            this.f57377c = unit;
            this.f57378d = scheduler;
            this.f57379e = eagerTruncate;
        }

        @Override // p000.nfg
        public mr2<T> get() {
            return this.f57375a.replay(this.f57376b, this.f57377c, this.f57378d, this.f57379e);
        }
    }

    private le6() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> sy6<T, zjd<U>> flatMapIntoIterable(final sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        return new C8787c(mapper);
    }

    public static <T, U, R> sy6<T, zjd<R>> flatMapWithCombiner(final sy6<? super T, ? extends zjd<? extends U>> mapper, final i11<? super T, ? super U, ? extends R> combiner) {
        return new C8789e(combiner, mapper);
    }

    public static <T, U> sy6<T, zjd<T>> itemDelay(final sy6<? super T, ? extends zjd<U>> itemDelay) {
        return new C8790f(itemDelay);
    }

    public static <T> nfg<mr2<T>> replaySupplier(final l86<T> parent) {
        return new C8791g(parent);
    }

    public static <T, S> i11<S, qy4<T>, S> simpleBiGenerator(e11<S, qy4<T>> consumer) {
        return new C8793i(consumer);
    }

    public static <T, S> i11<S, qy4<T>, S> simpleGenerator(uu2<qy4<T>> consumer) {
        return new C8794j(consumer);
    }

    public static <T> InterfaceC7776j8 subscriberOnComplete(ycg<T> subscriber) {
        return new C8795k(subscriber);
    }

    public static <T> uu2<Throwable> subscriberOnError(ycg<T> subscriber) {
        return new C8796l(subscriber);
    }

    public static <T> uu2<T> subscriberOnNext(ycg<T> subscriber) {
        return new C8797m(subscriber);
    }

    public static <T> nfg<mr2<T>> replaySupplier(final l86<T> parent, final int bufferSize, boolean eagerTruncate) {
        return new C8785a(parent, bufferSize, eagerTruncate);
    }

    public static <T> nfg<mr2<T>> replaySupplier(final l86<T> parent, final int bufferSize, final long time, final TimeUnit unit, final woe scheduler, boolean eagerTruncate) {
        return new C8786b(parent, bufferSize, time, unit, scheduler, eagerTruncate);
    }

    public static <T> nfg<mr2<T>> replaySupplier(final l86<T> parent, final long time, final TimeUnit unit, final woe scheduler, boolean eagerTruncate) {
        return new C8798n(parent, time, unit, scheduler, eagerTruncate);
    }
}
