package p000;

import com.google.j2objc.annotations.RetainedWith;
import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.w17;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use ClosingFuture.from(Futures.immediate*Future)")
@yg8
@qx4
public final class f62<V> {

    /* JADX INFO: renamed from: d */
    public static final Logger f35397d = Logger.getLogger(f62.class.getName());

    /* JADX INFO: renamed from: a */
    public final AtomicReference<EnumC5628x> f35398a;

    /* JADX INFO: renamed from: b */
    public final C5618n f35399b;

    /* JADX INFO: renamed from: c */
    public final dm6<V> f35400c;

    /* JADX INFO: renamed from: f62$a */
    public class RunnableC5605a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5630z f35401a;

        public RunnableC5605a(final InterfaceC5630z val$consumer) {
            this.f35401a = val$consumer;
        }

        @Override // java.lang.Runnable
        public void run() {
            f62.provideValueAndCloser(this.f35401a, f62.this);
        }
    }

    /* JADX INFO: renamed from: f62$b */
    public static /* synthetic */ class C5606b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35403a;

        static {
            int[] iArr = new int[EnumC5628x.values().length];
            f35403a = iArr;
            try {
                iArr[EnumC5628x.SUBSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35403a[EnumC5628x.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35403a[EnumC5628x.WILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35403a[EnumC5628x.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35403a[EnumC5628x.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35403a[EnumC5628x.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: f62$c */
    public class C5607c implements c17<Closeable> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Executor f35405b;

        public C5607c(final Executor val$closingExecutor) {
            this.f35405b = val$closingExecutor;
        }

        @Override // p000.c17
        public void onFailure(Throwable t) {
        }

        @Override // p000.c17
        public void onSuccess(@wx1 Closeable result) {
            f62.this.f35399b.f35420a.eventuallyClose(result, this.f35405b);
        }
    }

    /* JADX INFO: renamed from: f62$d */
    public class CallableC5608d implements Callable<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5619o f35406a;

        public CallableC5608d(final InterfaceC5619o val$callable) {
            this.f35406a = val$callable;
        }

        @Override // java.util.concurrent.Callable
        @agc
        public V call() throws Exception {
            return (V) this.f35406a.call(f62.this.f35399b.f35420a);
        }

        public String toString() {
            return this.f35406a.toString();
        }
    }

    /* JADX INFO: renamed from: f62$e */
    public class C5609e implements l90<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5616l f35408a;

        public C5609e(final InterfaceC5616l val$callable) {
            this.f35408a = val$callable;
        }

        @Override // p000.l90
        public ja9<V> call() throws Exception {
            C5618n c5618n = new C5618n(null);
            try {
                f62<V> f62VarCall = this.f35408a.call(c5618n.f35420a);
                f62VarCall.becomeSubsumedInto(f62.this.f35399b);
                return f62VarCall.f35400c;
            } finally {
                f62.this.f35399b.m10645b(c5618n, xya.directExecutor());
            }
        }

        public String toString() {
            return this.f35408a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* JADX INFO: renamed from: f62$f */
    public class C5610f<U> implements v90<V, U> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5620p f35410a;

        public C5610f(final InterfaceC5620p val$function) {
            this.f35410a = val$function;
        }

        @Override // p000.v90
        public ja9<U> apply(V input) throws Exception {
            return f62.this.f35399b.m10647d(this.f35410a, input);
        }

        public String toString() {
            return this.f35410a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* JADX INFO: renamed from: f62$g */
    public class C5611g<U> implements v90<V, U> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5617m f35412a;

        public C5611g(final InterfaceC5617m val$function) {
            this.f35412a = val$function;
        }

        @Override // p000.v90
        public ja9<U> apply(V input) throws Exception {
            return f62.this.f35399b.m10646c(this.f35412a, input);
        }

        public String toString() {
            return this.f35412a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* JADX INFO: renamed from: f62$h */
    public class C5612h<U> implements InterfaceC5617m<V, U> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v90 f35414a;

        public C5612h(final v90 val$function) {
            this.f35414a = val$function;
        }

        @Override // p000.f62.InterfaceC5617m
        public f62<U> apply(C5626v closer, V input) throws Exception {
            return f62.from(this.f35414a.apply(input));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* JADX INFO: renamed from: f62$i */
    public class C5613i<W, X> implements v90<X, W> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5620p f35415a;

        public C5613i(final InterfaceC5620p val$fallback) {
            this.f35415a = val$fallback;
        }

        public String toString() {
            return this.f35415a.toString();
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lja9<TW;>; */
        @Override // p000.v90
        public ja9 apply(Throwable exception) throws Exception {
            return f62.this.f35399b.m10647d(this.f35415a, exception);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* JADX INFO: renamed from: f62$j */
    public class C5614j<W, X> implements v90<X, W> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5617m f35417a;

        public C5614j(final InterfaceC5617m val$fallback) {
            this.f35417a = val$fallback;
        }

        public String toString() {
            return this.f35417a.toString();
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lja9<TW;>; */
        @Override // p000.v90
        public ja9 apply(Throwable exception) throws Exception {
            return f62.this.f35399b.m10646c(this.f35417a, exception);
        }
    }

    /* JADX INFO: renamed from: f62$k */
    public class RunnableC5615k implements Runnable {
        public RunnableC5615k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f62 f62Var = f62.this;
            EnumC5628x enumC5628x = EnumC5628x.WILL_CLOSE;
            EnumC5628x enumC5628x2 = EnumC5628x.CLOSING;
            f62Var.checkAndUpdateState(enumC5628x, enumC5628x2);
            f62.this.close();
            f62.this.checkAndUpdateState(enumC5628x2, EnumC5628x.CLOSED);
        }
    }

    /* JADX INFO: renamed from: f62$l */
    public interface InterfaceC5616l<V> {
        f62<V> call(C5626v closer) throws Exception;
    }

    /* JADX INFO: renamed from: f62$m */
    public interface InterfaceC5617m<T, U> {
        f62<U> apply(C5626v closer, @agc T input) throws Exception;
    }

    /* JADX INFO: renamed from: f62$o */
    public interface InterfaceC5619o<V> {
        @agc
        V call(C5626v closer) throws Exception;
    }

    /* JADX INFO: renamed from: f62$p */
    public interface InterfaceC5620p<T, U> {
        @agc
        U apply(C5626v closer, @agc T input) throws Exception;
    }

    /* JADX INFO: renamed from: f62$q */
    @jh4("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class C5621q {

        /* JADX INFO: renamed from: a */
        public final C5618n f35423a;

        /* JADX INFO: renamed from: b */
        public final boolean f35424b;

        /* JADX INFO: renamed from: c */
        public final kx7<f62<?>> f35425c;

        /* JADX INFO: renamed from: f62$q$a */
        public class a implements Callable<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d f35426a;

            public a(final d val$combiningCallable) {
                this.f35426a = val$combiningCallable;
            }

            @Override // java.util.concurrent.Callable
            @agc
            public V call() throws Exception {
                return (V) new C5627w(C5621q.this.f35425c, null).call(this.f35426a, C5621q.this.f35423a);
            }

            public String toString() {
                return this.f35426a.toString();
            }
        }

        /* JADX INFO: renamed from: f62$q$b */
        public class b implements l90<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c f35428a;

            public b(final c val$combiningCallable) {
                this.f35428a = val$combiningCallable;
            }

            @Override // p000.l90
            public ja9<V> call() throws Exception {
                return new C5627w(C5621q.this.f35425c, null).callAsync(this.f35428a, C5621q.this.f35423a);
            }

            public String toString() {
                return this.f35428a.toString();
            }
        }

        /* JADX INFO: renamed from: f62$q$c */
        public interface c<V> {
            f62<V> call(C5626v closer, C5627w peeker) throws Exception;
        }

        /* JADX INFO: renamed from: f62$q$d */
        public interface d<V> {
            @agc
            V call(C5626v closer, C5627w peeker) throws Exception;
        }

        public /* synthetic */ C5621q(boolean z, Iterable iterable, C5607c c5607c) {
            this(z, iterable);
        }

        private w17.C14345c<Object> futureCombiner() {
            return this.f35424b ? w17.whenAllSucceed(inputFutures()) : w17.whenAllComplete(inputFutures());
        }

        private kx7<dm6<?>> inputFutures() {
            return em6.from(this.f35425c).transform(new lz6() { // from class: g62
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return f62.m10636b((f62) obj);
                }
            }).toList();
        }

        public <V> f62<V> call(final d<V> combiningCallable, Executor executor) {
            f62<V> f62Var = new f62<>(futureCombiner().call(new a(combiningCallable), executor), (C5607c) null);
            f62Var.f35399b.m10645b(this.f35423a, xya.directExecutor());
            return f62Var;
        }

        public <V> f62<V> callAsync(final c<V> combiningCallable, Executor executor) {
            f62<V> f62Var = new f62<>(futureCombiner().callAsync(new b(combiningCallable), executor), (C5607c) null);
            f62Var.f35399b.m10645b(this.f35423a, xya.directExecutor());
            return f62Var;
        }

        private C5621q(boolean allMustSucceed, Iterable<? extends f62<?>> inputs) {
            this.f35423a = new C5618n(null);
            this.f35424b = allMustSucceed;
            this.f35425c = kx7.copyOf(inputs);
            Iterator<? extends f62<?>> it = inputs.iterator();
            while (it.hasNext()) {
                it.next().becomeSubsumedInto(this.f35423a);
            }
        }
    }

    /* JADX INFO: renamed from: f62$r */
    public static final class C5622r<V1, V2> extends C5621q {

        /* JADX INFO: renamed from: d */
        public final f62<V1> f35430d;

        /* JADX INFO: renamed from: e */
        public final f62<V2> f35431e;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* JADX INFO: renamed from: f62$r$a */
        public class a<U> implements C5621q.d<U> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d f35432a;

            public a(final d val$function) {
                this.f35432a = val$function;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.f62.C5621q.d
            @agc
            public U call(C5626v c5626v, C5627w c5627w) throws Exception {
                return (U) this.f35432a.apply(c5626v, c5627w.getDone(C5622r.this.f35430d), c5627w.getDone(C5622r.this.f35431e));
            }

            public String toString() {
                return this.f35432a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* JADX INFO: renamed from: f62$r$b */
        public class b<U> implements C5621q.c<U> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c f35434a;

            public b(final c val$function) {
                this.f35434a = val$function;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.f62.C5621q.c
            public f62<U> call(C5626v closer, C5627w peeker) throws Exception {
                return this.f35434a.apply(closer, peeker.getDone(C5622r.this.f35430d), peeker.getDone(C5622r.this.f35431e));
            }

            public String toString() {
                return this.f35434a.toString();
            }
        }

        /* JADX INFO: renamed from: f62$r$c */
        public interface c<V1, V2, U> {
            f62<U> apply(C5626v closer, @agc V1 value1, @agc V2 value2) throws Exception;
        }

        /* JADX INFO: renamed from: f62$r$d */
        public interface d<V1, V2, U> {
            @agc
            U apply(C5626v closer, @agc V1 value1, @agc V2 value2) throws Exception;
        }

        public /* synthetic */ C5622r(f62 f62Var, f62 f62Var2, C5607c c5607c) {
            this(f62Var, f62Var2);
        }

        public <U> f62<U> call(d<V1, V2, U> dVar, Executor executor) {
            return call(new a(dVar), executor);
        }

        public <U> f62<U> callAsync(c<V1, V2, U> cVar, Executor executor) {
            return callAsync(new b(cVar), executor);
        }

        private C5622r(f62<V1> future1, f62<V2> future2) {
            super(true, kx7.m15112of((f62<V2>) future1, future2), null);
            this.f35430d = future1;
            this.f35431e = future2;
        }
    }

    /* JADX INFO: renamed from: f62$s */
    public static final class C5623s<V1, V2, V3> extends C5621q {

        /* JADX INFO: renamed from: d */
        public final f62<V1> f35436d;

        /* JADX INFO: renamed from: e */
        public final f62<V2> f35437e;

        /* JADX INFO: renamed from: f */
        public final f62<V3> f35438f;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* JADX INFO: renamed from: f62$s$a */
        public class a<U> implements C5621q.d<U> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d f35439a;

            public a(final d val$function) {
                this.f35439a = val$function;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.f62.C5621q.d
            @agc
            public U call(C5626v c5626v, C5627w c5627w) throws Exception {
                return (U) this.f35439a.apply(c5626v, c5627w.getDone(C5623s.this.f35436d), c5627w.getDone(C5623s.this.f35437e), c5627w.getDone(C5623s.this.f35438f));
            }

            public String toString() {
                return this.f35439a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* JADX INFO: renamed from: f62$s$b */
        public class b<U> implements C5621q.c<U> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c f35441a;

            public b(final c val$function) {
                this.f35441a = val$function;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.f62.C5621q.c
            public f62<U> call(C5626v closer, C5627w peeker) throws Exception {
                return this.f35441a.apply(closer, peeker.getDone(C5623s.this.f35436d), peeker.getDone(C5623s.this.f35437e), peeker.getDone(C5623s.this.f35438f));
            }

            public String toString() {
                return this.f35441a.toString();
            }
        }

        /* JADX INFO: renamed from: f62$s$c */
        public interface c<V1, V2, V3, U> {
            f62<U> apply(C5626v closer, @agc V1 value1, @agc V2 value2, @agc V3 value3) throws Exception;
        }

        /* JADX INFO: renamed from: f62$s$d */
        public interface d<V1, V2, V3, U> {
            @agc
            U apply(C5626v closer, @agc V1 value1, @agc V2 value2, @agc V3 value3) throws Exception;
        }

        public /* synthetic */ C5623s(f62 f62Var, f62 f62Var2, f62 f62Var3, C5607c c5607c) {
            this(f62Var, f62Var2, f62Var3);
        }

        public <U> f62<U> call(d<V1, V2, V3, U> dVar, Executor executor) {
            return call(new a(dVar), executor);
        }

        public <U> f62<U> callAsync(c<V1, V2, V3, U> cVar, Executor executor) {
            return callAsync(new b(cVar), executor);
        }

        private C5623s(f62<V1> future1, f62<V2> future2, f62<V3> future3) {
            super(true, kx7.m15113of((f62<V3>) future1, (f62<V3>) future2, future3), null);
            this.f35436d = future1;
            this.f35437e = future2;
            this.f35438f = future3;
        }
    }

    /* JADX INFO: renamed from: f62$t */
    public static final class C5624t<V1, V2, V3, V4> extends C5621q {

        /* JADX INFO: renamed from: d */
        public final f62<V1> f35443d;

        /* JADX INFO: renamed from: e */
        public final f62<V2> f35444e;

        /* JADX INFO: renamed from: f */
        public final f62<V3> f35445f;

        /* JADX INFO: renamed from: g */
        public final f62<V4> f35446g;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* JADX INFO: renamed from: f62$t$a */
        public class a<U> implements C5621q.d<U> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d f35447a;

            public a(final d val$function) {
                this.f35447a = val$function;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.f62.C5621q.d
            @agc
            public U call(C5626v c5626v, C5627w c5627w) throws Exception {
                return (U) this.f35447a.apply(c5626v, c5627w.getDone(C5624t.this.f35443d), c5627w.getDone(C5624t.this.f35444e), c5627w.getDone(C5624t.this.f35445f), c5627w.getDone(C5624t.this.f35446g));
            }

            public String toString() {
                return this.f35447a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* JADX INFO: renamed from: f62$t$b */
        public class b<U> implements C5621q.c<U> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c f35449a;

            public b(final c val$function) {
                this.f35449a = val$function;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.f62.C5621q.c
            public f62<U> call(C5626v closer, C5627w peeker) throws Exception {
                return this.f35449a.apply(closer, peeker.getDone(C5624t.this.f35443d), peeker.getDone(C5624t.this.f35444e), peeker.getDone(C5624t.this.f35445f), peeker.getDone(C5624t.this.f35446g));
            }

            public String toString() {
                return this.f35449a.toString();
            }
        }

        /* JADX INFO: renamed from: f62$t$c */
        public interface c<V1, V2, V3, V4, U> {
            f62<U> apply(C5626v closer, @agc V1 value1, @agc V2 value2, @agc V3 value3, @agc V4 value4) throws Exception;
        }

        /* JADX INFO: renamed from: f62$t$d */
        public interface d<V1, V2, V3, V4, U> {
            @agc
            U apply(C5626v closer, @agc V1 value1, @agc V2 value2, @agc V3 value3, @agc V4 value4) throws Exception;
        }

        public /* synthetic */ C5624t(f62 f62Var, f62 f62Var2, f62 f62Var3, f62 f62Var4, C5607c c5607c) {
            this(f62Var, f62Var2, f62Var3, f62Var4);
        }

        public <U> f62<U> call(d<V1, V2, V3, V4, U> dVar, Executor executor) {
            return call(new a(dVar), executor);
        }

        public <U> f62<U> callAsync(c<V1, V2, V3, V4, U> cVar, Executor executor) {
            return callAsync(new b(cVar), executor);
        }

        private C5624t(f62<V1> future1, f62<V2> future2, f62<V3> future3, f62<V4> future4) {
            super(true, kx7.m15114of((f62<V4>) future1, (f62<V4>) future2, (f62<V4>) future3, future4), null);
            this.f35443d = future1;
            this.f35444e = future2;
            this.f35445f = future3;
            this.f35446g = future4;
        }
    }

    /* JADX INFO: renamed from: f62$u */
    public static final class C5625u<V1, V2, V3, V4, V5> extends C5621q {

        /* JADX INFO: renamed from: d */
        public final f62<V1> f35451d;

        /* JADX INFO: renamed from: e */
        public final f62<V2> f35452e;

        /* JADX INFO: renamed from: f */
        public final f62<V3> f35453f;

        /* JADX INFO: renamed from: g */
        public final f62<V4> f35454g;

        /* JADX INFO: renamed from: h */
        public final f62<V5> f35455h;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* JADX INFO: renamed from: f62$u$a */
        public class a<U> implements C5621q.d<U> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d f35456a;

            public a(final d val$function) {
                this.f35456a = val$function;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.f62.C5621q.d
            @agc
            public U call(C5626v c5626v, C5627w c5627w) throws Exception {
                return (U) this.f35456a.apply(c5626v, c5627w.getDone(C5625u.this.f35451d), c5627w.getDone(C5625u.this.f35452e), c5627w.getDone(C5625u.this.f35453f), c5627w.getDone(C5625u.this.f35454g), c5627w.getDone(C5625u.this.f35455h));
            }

            public String toString() {
                return this.f35456a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* JADX INFO: renamed from: f62$u$b */
        public class b<U> implements C5621q.c<U> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c f35458a;

            public b(final c val$function) {
                this.f35458a = val$function;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.f62.C5621q.c
            public f62<U> call(C5626v closer, C5627w peeker) throws Exception {
                return this.f35458a.apply(closer, peeker.getDone(C5625u.this.f35451d), peeker.getDone(C5625u.this.f35452e), peeker.getDone(C5625u.this.f35453f), peeker.getDone(C5625u.this.f35454g), peeker.getDone(C5625u.this.f35455h));
            }

            public String toString() {
                return this.f35458a.toString();
            }
        }

        /* JADX INFO: renamed from: f62$u$c */
        public interface c<V1, V2, V3, V4, V5, U> {
            f62<U> apply(C5626v closer, @agc V1 value1, @agc V2 value2, @agc V3 value3, @agc V4 value4, @agc V5 value5) throws Exception;
        }

        /* JADX INFO: renamed from: f62$u$d */
        public interface d<V1, V2, V3, V4, V5, U> {
            @agc
            U apply(C5626v closer, @agc V1 value1, @agc V2 value2, @agc V3 value3, @agc V4 value4, @agc V5 value5) throws Exception;
        }

        public /* synthetic */ C5625u(f62 f62Var, f62 f62Var2, f62 f62Var3, f62 f62Var4, f62 f62Var5, C5607c c5607c) {
            this(f62Var, f62Var2, f62Var3, f62Var4, f62Var5);
        }

        public <U> f62<U> call(d<V1, V2, V3, V4, V5, U> dVar, Executor executor) {
            return call(new a(dVar), executor);
        }

        public <U> f62<U> callAsync(c<V1, V2, V3, V4, V5, U> cVar, Executor executor) {
            return callAsync(new b(cVar), executor);
        }

        private C5625u(f62<V1> future1, f62<V2> future2, f62<V3> future3, f62<V4> future4, f62<V5> future5) {
            super(true, kx7.m15115of((f62<V5>) future1, (f62<V5>) future2, (f62<V5>) future3, (f62<V5>) future4, future5), null);
            this.f35451d = future1;
            this.f35452e = future2;
            this.f35453f = future3;
            this.f35454g = future4;
            this.f35455h = future5;
        }
    }

    /* JADX INFO: renamed from: f62$v */
    public static final class C5626v {

        /* JADX INFO: renamed from: a */
        @RetainedWith
        public final C5618n f35460a;

        public C5626v(C5618n list) {
            this.f35460a = list;
        }

        @op1
        @agc
        public <C extends Closeable> C eventuallyClose(@agc C closeable, Executor closingExecutor) {
            v7d.checkNotNull(closingExecutor);
            if (closeable != null) {
                this.f35460a.m10645b(closeable, closingExecutor);
            }
            return closeable;
        }
    }

    /* JADX INFO: renamed from: f62$w */
    public static final class C5627w {

        /* JADX INFO: renamed from: a */
        public final kx7<f62<?>> f35461a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f35462b;

        public /* synthetic */ C5627w(kx7 kx7Var, C5607c c5607c) {
            this(kx7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @agc
        public <V> V call(C5621q.d<V> combiner, C5618n closeables) throws Exception {
            this.f35462b = true;
            C5618n c5618n = new C5618n(null);
            try {
                return combiner.call(c5618n.f35420a, this);
            } finally {
                closeables.m10645b(c5618n, xya.directExecutor());
                this.f35462b = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <V> dm6<V> callAsync(C5621q.c<V> combiner, C5618n closeables) throws Exception {
            this.f35462b = true;
            C5618n c5618n = new C5618n(null);
            try {
                f62<V> f62VarCall = combiner.call(c5618n.f35420a, this);
                f62VarCall.becomeSubsumedInto(closeables);
                return f62VarCall.f35400c;
            } finally {
                closeables.m10645b(c5618n, xya.directExecutor());
                this.f35462b = false;
            }
        }

        @agc
        public final <D> D getDone(f62<D> f62Var) throws ExecutionException {
            v7d.checkState(this.f35462b);
            v7d.checkArgument(this.f35461a.contains(f62Var));
            return (D) w17.getDone(f62Var.f35400c);
        }

        private C5627w(kx7<f62<?>> futures) {
            this.f35461a = (kx7) v7d.checkNotNull(futures);
        }
    }

    /* JADX INFO: renamed from: f62$x */
    public enum EnumC5628x {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    /* JADX INFO: renamed from: f62$y */
    public static final class C5629y<V> {

        /* JADX INFO: renamed from: a */
        public final f62<? extends V> f35470a;

        public C5629y(f62<? extends V> closingFuture) {
            this.f35470a = (f62) v7d.checkNotNull(closingFuture);
        }

        public void closeAsync() {
            this.f35470a.close();
        }

        @agc
        public V get() throws ExecutionException {
            return (V) w17.getDone(this.f35470a.f35400c);
        }
    }

    /* JADX INFO: renamed from: f62$z */
    public interface InterfaceC5630z<V> {
        void accept(C5629y<V> valueAndCloser);
    }

    public /* synthetic */ f62(ja9 ja9Var, C5607c c5607c) {
        this(ja9Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ dm6 m10636b(f62 f62Var) {
        return f62Var.f35400c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void becomeSubsumedInto(C5618n otherCloseables) {
        checkAndUpdateState(EnumC5628x.OPEN, EnumC5628x.SUBSUMED);
        otherCloseables.m10645b(this.f35399b, xya.directExecutor());
    }

    private <X extends Throwable, W extends V> f62<V> catchingAsyncMoreGeneric(Class<X> cls, InterfaceC5617m<? super X, W> interfaceC5617m, Executor executor) {
        v7d.checkNotNull(interfaceC5617m);
        return (f62<V>) derive(this.f35400c.catchingAsync(cls, new C5614j(interfaceC5617m), executor));
    }

    private <X extends Throwable, W extends V> f62<V> catchingMoreGeneric(Class<X> cls, InterfaceC5620p<? super X, W> interfaceC5620p, Executor executor) {
        v7d.checkNotNull(interfaceC5620p);
        return (f62<V>) derive(this.f35400c.catchingAsync(cls, new C5613i(interfaceC5620p), executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndUpdateState(EnumC5628x oldState, EnumC5628x newState) {
        v7d.checkState(compareAndUpdateState(oldState, newState), "Expected state to be %s, but it was %s", oldState, newState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void close() {
        f35397d.log(Level.FINER, "closing {0}", this);
        this.f35399b.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(@wx1 final Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: e62
                @Override // java.lang.Runnable
                public final void run() {
                    f62.lambda$closeQuietly$0(closeable);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger logger = f35397d;
            Level level = Level.WARNING;
            if (logger.isLoggable(level)) {
                logger.log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
            }
            closeQuietly(closeable, xya.directExecutor());
        }
    }

    private boolean compareAndUpdateState(EnumC5628x oldState, EnumC5628x newState) {
        return v7b.m23844a(this.f35398a, oldState, newState);
    }

    private <U> f62<U> derive(dm6<U> future) {
        f62<U> f62Var = new f62<>(future);
        becomeSubsumedInto(f62Var.f35399b);
        return f62Var;
    }

    @Deprecated
    public static <C extends Closeable> f62<C> eventuallyClosing(ja9<C> future, final Executor closingExecutor) {
        v7d.checkNotNull(closingExecutor);
        f62<C> f62Var = new f62<>(w17.nonCancellationPropagating(future));
        w17.addCallback(future, new C5607c(closingExecutor), xya.directExecutor());
        return f62Var;
    }

    public static <V> f62<V> from(ja9<V> future) {
        return new f62<>(future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$closeQuietly$0(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException | RuntimeException e) {
            f35397d.log(Level.WARNING, "thrown by close()", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <C, V extends C> void provideValueAndCloser(InterfaceC5630z<C> consumer, f62<V> closingFuture) {
        consumer.accept(new C5629y<>(closingFuture));
    }

    public static <V> f62<V> submit(InterfaceC5619o<V> callable, Executor executor) {
        return new f62<>(callable, executor);
    }

    public static <V> f62<V> submitAsync(InterfaceC5616l<V> callable, Executor executor) {
        return new f62<>(callable, executor);
    }

    public static C5621q whenAllComplete(Iterable<? extends f62<?>> futures) {
        return new C5621q(false, futures, null);
    }

    public static C5621q whenAllSucceed(Iterable<? extends f62<?>> futures) {
        return new C5621q(true, futures, null);
    }

    public static <V, U> InterfaceC5617m<V, U> withoutCloser(final v90<V, U> function) {
        v7d.checkNotNull(function);
        return new C5612h(function);
    }

    @op1
    public boolean cancel(boolean mayInterruptIfRunning) {
        f35397d.log(Level.FINER, "cancelling {0}", this);
        boolean zCancel = this.f35400c.cancel(mayInterruptIfRunning);
        if (zCancel) {
            close();
        }
        return zCancel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> f62<V> catching(Class<X> exceptionType, InterfaceC5620p<? super X, ? extends V> fallback, Executor executor) {
        return catchingMoreGeneric(exceptionType, fallback, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> f62<V> catchingAsync(Class<X> exceptionType, InterfaceC5617m<? super X, ? extends V> fallback, Executor executor) {
        return catchingAsyncMoreGeneric(exceptionType, fallback, executor);
    }

    public void finalize() {
        if (this.f35398a.get().equals(EnumC5628x.OPEN)) {
            f35397d.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            finishToFuture();
        }
    }

    public dm6<V> finishToFuture() {
        if (!compareAndUpdateState(EnumC5628x.OPEN, EnumC5628x.WILL_CLOSE)) {
            switch (C5606b.f35403a[this.f35398a.get().ordinal()]) {
                case 1:
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                case 2:
                    throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot call finishToFuture() twice");
                case 6:
                    throw new AssertionError();
            }
        }
        f35397d.log(Level.FINER, "will close {0}", this);
        this.f35400c.addListener(new RunnableC5615k(), xya.directExecutor());
        return this.f35400c;
    }

    public void finishToValueAndCloser(final InterfaceC5630z<? super V> consumer, Executor executor) {
        v7d.checkNotNull(consumer);
        if (compareAndUpdateState(EnumC5628x.OPEN, EnumC5628x.WILL_CREATE_VALUE_AND_CLOSER)) {
            this.f35400c.addListener(new RunnableC5605a(consumer), executor);
            return;
        }
        int i = C5606b.f35403a[this.f35398a.get().ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new AssertionError(this.f35398a);
        }
        throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
    }

    @gdi
    /* JADX INFO: renamed from: i */
    public CountDownLatch m10643i() {
        return this.f35399b.m10648e();
    }

    public ja9<?> statusFuture() {
        return w17.nonCancellationPropagating(this.f35400c.transform(p07.constant(null), xya.directExecutor()));
    }

    public String toString() {
        return yya.toStringHelper(this).add("state", this.f35398a.get()).addValue(this.f35400c).toString();
    }

    public <U> f62<U> transform(final InterfaceC5620p<? super V, U> function, Executor executor) {
        v7d.checkNotNull(function);
        return derive(this.f35400c.transformAsync(new C5610f(function), executor));
    }

    public <U> f62<U> transformAsync(final InterfaceC5617m<? super V, U> function, Executor executor) {
        v7d.checkNotNull(function);
        return derive(this.f35400c.transformAsync(new C5611g(function), executor));
    }

    /* JADX INFO: renamed from: f62$n */
    public static final class C5618n extends IdentityHashMap<Closeable, Executor> implements Closeable {

        /* JADX INFO: renamed from: a */
        public final C5626v f35420a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f35421b;

        /* JADX INFO: renamed from: c */
        @wx1
        public volatile CountDownLatch f35422c;

        private C5618n() {
            this.f35420a = new C5626v(this);
        }

        /* JADX INFO: renamed from: b */
        public void m10645b(@wx1 Closeable closeable, Executor executor) {
            v7d.checkNotNull(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f35421b) {
                        f62.closeQuietly(closeable, executor);
                    } else {
                        put(closeable, executor);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public <V, U> dm6<U> m10646c(InterfaceC5617m<V, U> transformation, @agc V input) throws Exception {
            C5618n c5618n = new C5618n();
            try {
                f62<U> f62VarApply = transformation.apply(c5618n.f35420a, input);
                f62VarApply.becomeSubsumedInto(c5618n);
                return f62VarApply.f35400c;
            } finally {
                m10645b(c5618n, xya.directExecutor());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f35421b) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f35421b) {
                        return;
                    }
                    this.f35421b = true;
                    for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                        f62.closeQuietly(entry.getKey(), entry.getValue());
                    }
                    clear();
                    if (this.f35422c != null) {
                        this.f35422c.countDown();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public <V, U> ja9<U> m10647d(InterfaceC5620p<? super V, U> transformation, @agc V input) throws Exception {
            C5618n c5618n = new C5618n();
            try {
                return w17.immediateFuture(transformation.apply(c5618n.f35420a, input));
            } finally {
                m10645b(c5618n, xya.directExecutor());
            }
        }

        /* JADX INFO: renamed from: e */
        public CountDownLatch m10648e() {
            if (this.f35421b) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                try {
                    if (this.f35421b) {
                        return new CountDownLatch(0);
                    }
                    v7d.checkState(this.f35422c == null);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.f35422c = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ C5618n(C5607c c5607c) {
            this();
        }
    }

    private f62(ja9<V> future) {
        this.f35398a = new AtomicReference<>(EnumC5628x.OPEN);
        this.f35399b = new C5618n(null);
        this.f35400c = dm6.from(future);
    }

    public static C5621q whenAllComplete(f62<?> future1, f62<?>... moreFutures) {
        return whenAllComplete(eb9.asList(future1, moreFutures));
    }

    public static <V1, V2> C5622r<V1, V2> whenAllSucceed(f62<V1> future1, f62<V2> future2) {
        return new C5622r<>(future1, future2, null);
    }

    public static <V1, V2, V3> C5623s<V1, V2, V3> whenAllSucceed(f62<V1> future1, f62<V2> future2, f62<V3> future3) {
        return new C5623s<>(future1, future2, future3, null);
    }

    public static <V1, V2, V3, V4> C5624t<V1, V2, V3, V4> whenAllSucceed(f62<V1> future1, f62<V2> future2, f62<V3> future3, f62<V4> future4) {
        return new C5624t<>(future1, future2, future3, future4, null);
    }

    public static <V1, V2, V3, V4, V5> C5625u<V1, V2, V3, V4, V5> whenAllSucceed(f62<V1> future1, f62<V2> future2, f62<V3> future3, f62<V4> future4, f62<V5> future5) {
        return new C5625u<>(future1, future2, future3, future4, future5, null);
    }

    private f62(final InterfaceC5619o<V> callable, Executor executor) {
        this.f35398a = new AtomicReference<>(EnumC5628x.OPEN);
        this.f35399b = new C5618n(null);
        v7d.checkNotNull(callable);
        jjh jjhVarM14138r = jjh.m14138r(new CallableC5608d(callable));
        executor.execute(jjhVarM14138r);
        this.f35400c = jjhVarM14138r;
    }

    public static C5621q whenAllSucceed(f62<?> future1, f62<?> future2, f62<?> future3, f62<?> future4, f62<?> future5, f62<?> future6, f62<?>... moreFutures) {
        return whenAllSucceed(em6.m10123of(future1, future2, future3, future4, future5, future6).append(moreFutures));
    }

    private f62(final InterfaceC5616l<V> callable, Executor executor) {
        this.f35398a = new AtomicReference<>(EnumC5628x.OPEN);
        this.f35399b = new C5618n(null);
        v7d.checkNotNull(callable);
        jjh jjhVarM14136p = jjh.m14136p(new C5609e(callable));
        executor.execute(jjhVarM14136p);
        this.f35400c = jjhVarM14136p;
    }
}
