package p000;

import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p000.fta;
import p000.p42;
import p000.q42;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j8e<ReqT> implements o42 {

    /* JADX INFO: renamed from: A */
    @gdi
    public static final fta.AbstractC5971i<String> f49820A;

    /* JADX INFO: renamed from: B */
    @gdi
    public static final fta.AbstractC5971i<String> f49821B;

    /* JADX INFO: renamed from: C */
    public static final n4g f49822C;

    /* JADX INFO: renamed from: D */
    public static Random f49823D;

    /* JADX INFO: renamed from: a */
    public final rua<ReqT, ?> f49824a;

    /* JADX INFO: renamed from: b */
    public final Executor f49825b;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f49827d;

    /* JADX INFO: renamed from: e */
    public final fta f49828e;

    /* JADX INFO: renamed from: f */
    @eib
    public final u8e f49829f;

    /* JADX INFO: renamed from: g */
    @eib
    public final ij7 f49830g;

    /* JADX INFO: renamed from: h */
    public final boolean f49831h;

    /* JADX INFO: renamed from: j */
    public final C7805u f49833j;

    /* JADX INFO: renamed from: k */
    public final long f49834k;

    /* JADX INFO: renamed from: l */
    public final long f49835l;

    /* JADX INFO: renamed from: m */
    @eib
    public final C7789e0 f49836m;

    /* JADX INFO: renamed from: s */
    public C7810z f49842s;

    /* JADX INFO: renamed from: t */
    @vc7("lock")
    public long f49843t;

    /* JADX INFO: renamed from: u */
    public p42 f49844u;

    /* JADX INFO: renamed from: v */
    @vc7("lock")
    public C7806v f49845v;

    /* JADX INFO: renamed from: w */
    @vc7("lock")
    public C7806v f49846w;

    /* JADX INFO: renamed from: x */
    public long f49847x;

    /* JADX INFO: renamed from: y */
    public n4g f49848y;

    /* JADX INFO: renamed from: z */
    public boolean f49849z;

    /* JADX INFO: renamed from: c */
    public final Executor f49826c = new thg(new C7780a());

    /* JADX INFO: renamed from: i */
    public final Object f49832i = new Object();

    /* JADX INFO: renamed from: n */
    @vc7("lock")
    public final y48 f49837n = new y48();

    /* JADX INFO: renamed from: o */
    public volatile C7783b0 f49838o = new C7783b0(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f49839p = new AtomicBoolean();

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f49840q = new AtomicInteger();

    /* JADX INFO: renamed from: r */
    public final AtomicInteger f49841r = new AtomicInteger();

    /* JADX INFO: renamed from: j8e$a */
    public class C7780a implements Thread.UncaughtExceptionHandler {
        public C7780a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw n4g.fromThrowable(th).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown.").asRuntimeException();
        }
    }

    /* JADX INFO: renamed from: j8e$a0 */
    public class C7781a0 implements InterfaceC7803s {
        public C7781a0() {
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.start(new C7785c0(c7787d0));
        }
    }

    /* JADX INFO: renamed from: j8e$b */
    public class C7782b implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f49852a;

        public C7782b(String str) {
            this.f49852a = str;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.setAuthority(this.f49852a);
        }
    }

    /* JADX INFO: renamed from: j8e$b0 */
    public static final class C7783b0 {

        /* JADX INFO: renamed from: a */
        public final boolean f49854a;

        /* JADX INFO: renamed from: b */
        @eib
        public final List<InterfaceC7803s> f49855b;

        /* JADX INFO: renamed from: c */
        public final Collection<C7787d0> f49856c;

        /* JADX INFO: renamed from: d */
        public final Collection<C7787d0> f49857d;

        /* JADX INFO: renamed from: e */
        public final int f49858e;

        /* JADX INFO: renamed from: f */
        @eib
        public final C7787d0 f49859f;

        /* JADX INFO: renamed from: g */
        public final boolean f49860g;

        /* JADX INFO: renamed from: h */
        public final boolean f49861h;

        public C7783b0(@eib List<InterfaceC7803s> list, Collection<C7787d0> collection, Collection<C7787d0> collection2, @eib C7787d0 c7787d0, boolean z, boolean z2, boolean z3, int i) {
            this.f49855b = list;
            this.f49856c = (Collection) v7d.checkNotNull(collection, "drainedSubstreams");
            this.f49859f = c7787d0;
            this.f49857d = collection2;
            this.f49860g = z;
            this.f49854a = z2;
            this.f49861h = z3;
            this.f49858e = i;
            v7d.checkState(!z2 || list == null, "passThrough should imply buffer is null");
            v7d.checkState((z2 && c7787d0 == null) ? false : true, "passThrough should imply winningSubstream != null");
            v7d.checkState(!z2 || (collection.size() == 1 && collection.contains(c7787d0)) || (collection.size() == 0 && c7787d0.f49884b), "passThrough should imply winningSubstream is drained");
            v7d.checkState((z && c7787d0 == null) ? false : true, "cancelled should imply committed");
        }

        @dy1
        /* JADX INFO: renamed from: a */
        public C7783b0 m13887a(C7787d0 c7787d0) {
            Collection collectionUnmodifiableCollection;
            v7d.checkState(!this.f49861h, "hedging frozen");
            v7d.checkState(this.f49859f == null, "already committed");
            if (this.f49857d == null) {
                collectionUnmodifiableCollection = Collections.singleton(c7787d0);
            } else {
                ArrayList arrayList = new ArrayList(this.f49857d);
                arrayList.add(c7787d0);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new C7783b0(this.f49855b, this.f49856c, collectionUnmodifiableCollection, this.f49859f, this.f49860g, this.f49854a, this.f49861h, this.f49858e + 1);
        }

        @dy1
        /* JADX INFO: renamed from: b */
        public C7783b0 m13888b() {
            return new C7783b0(this.f49855b, this.f49856c, this.f49857d, this.f49859f, true, this.f49854a, this.f49861h, this.f49858e);
        }

        @dy1
        /* JADX INFO: renamed from: c */
        public C7783b0 m13889c(C7787d0 c7787d0) {
            List<InterfaceC7803s> list;
            boolean z;
            Collection collectionEmptyList;
            v7d.checkState(this.f49859f == null, "Already committed");
            List<InterfaceC7803s> list2 = this.f49855b;
            if (this.f49856c.contains(c7787d0)) {
                collectionEmptyList = Collections.singleton(c7787d0);
                list = null;
                z = true;
            } else {
                list = list2;
                z = false;
                collectionEmptyList = Collections.emptyList();
            }
            return new C7783b0(list, collectionEmptyList, this.f49857d, c7787d0, this.f49860g, z, this.f49861h, this.f49858e);
        }

        @dy1
        /* JADX INFO: renamed from: d */
        public C7783b0 m13890d() {
            return this.f49861h ? this : new C7783b0(this.f49855b, this.f49856c, this.f49857d, this.f49859f, this.f49860g, this.f49854a, true, this.f49858e);
        }

        @dy1
        /* JADX INFO: renamed from: e */
        public C7783b0 m13891e(C7787d0 c7787d0) {
            ArrayList arrayList = new ArrayList(this.f49857d);
            arrayList.remove(c7787d0);
            return new C7783b0(this.f49855b, this.f49856c, Collections.unmodifiableCollection(arrayList), this.f49859f, this.f49860g, this.f49854a, this.f49861h, this.f49858e);
        }

        @dy1
        /* JADX INFO: renamed from: f */
        public C7783b0 m13892f(C7787d0 c7787d0, C7787d0 c7787d02) {
            ArrayList arrayList = new ArrayList(this.f49857d);
            arrayList.remove(c7787d0);
            arrayList.add(c7787d02);
            return new C7783b0(this.f49855b, this.f49856c, Collections.unmodifiableCollection(arrayList), this.f49859f, this.f49860g, this.f49854a, this.f49861h, this.f49858e);
        }

        @dy1
        /* JADX INFO: renamed from: g */
        public C7783b0 m13893g(C7787d0 c7787d0) {
            c7787d0.f49884b = true;
            if (!this.f49856c.contains(c7787d0)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f49856c);
            arrayList.remove(c7787d0);
            return new C7783b0(this.f49855b, Collections.unmodifiableCollection(arrayList), this.f49857d, this.f49859f, this.f49860g, this.f49854a, this.f49861h, this.f49858e);
        }

        @dy1
        /* JADX INFO: renamed from: h */
        public C7783b0 m13894h(C7787d0 c7787d0) {
            Collection collectionUnmodifiableCollection;
            v7d.checkState(!this.f49854a, "Already passThrough");
            if (c7787d0.f49884b) {
                collectionUnmodifiableCollection = this.f49856c;
            } else if (this.f49856c.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(c7787d0);
            } else {
                ArrayList arrayList = new ArrayList(this.f49856c);
                arrayList.add(c7787d0);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = collectionUnmodifiableCollection;
            C7787d0 c7787d02 = this.f49859f;
            boolean z = c7787d02 != null;
            List<InterfaceC7803s> list = this.f49855b;
            if (z) {
                v7d.checkState(c7787d02 == c7787d0, "Another RPC attempt has already committed");
                list = null;
            }
            return new C7783b0(list, collection, this.f49857d, this.f49859f, this.f49860g, z, this.f49861h, this.f49858e);
        }
    }

    /* JADX INFO: renamed from: j8e$c */
    public class RunnableC7784c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f49862a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7787d0 f49863b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Future f49864c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Future f49865d;

        public RunnableC7784c(Collection collection, C7787d0 c7787d0, Future future, Future future2) {
            this.f49862a = collection;
            this.f49863b = c7787d0;
            this.f49864c = future;
            this.f49865d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C7787d0 c7787d0 : this.f49862a) {
                if (c7787d0 != this.f49863b) {
                    c7787d0.f49883a.cancel(j8e.f49822C);
                }
            }
            Future future = this.f49864c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f49865d;
            if (future2 != null) {
                future2.cancel(false);
            }
            j8e.this.mo13883N();
        }
    }

    /* JADX INFO: renamed from: j8e$c0 */
    public final class C7785c0 implements p42 {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ boolean f49867c = false;

        /* JADX INFO: renamed from: a */
        public final C7787d0 f49868a;

        /* JADX INFO: renamed from: j8e$c0$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fta f49870a;

            public a(fta ftaVar) {
                this.f49870a = ftaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                j8e.this.f49844u.headersRead(this.f49870a);
            }
        }

        /* JADX INFO: renamed from: j8e$c0$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7787d0 f49872a;

            /* JADX INFO: renamed from: j8e$c0$b$a */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    j8e.this.drain(bVar.f49872a);
                }
            }

            public b(C7787d0 c7787d0) {
                this.f49872a = c7787d0;
            }

            @Override // java.lang.Runnable
            public void run() {
                j8e.this.f49825b.execute(new a());
            }
        }

        /* JADX INFO: renamed from: j8e$c0$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j8e.this.f49849z = true;
                j8e.this.f49844u.closed(j8e.this.f49842s.f49933a, j8e.this.f49842s.f49934b, j8e.this.f49842s.f49935c);
            }
        }

        /* JADX INFO: renamed from: j8e$c0$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7787d0 f49876a;

            public d(C7787d0 c7787d0) {
                this.f49876a = c7787d0;
            }

            @Override // java.lang.Runnable
            public void run() {
                j8e.this.drain(this.f49876a);
            }
        }

        /* JADX INFO: renamed from: j8e$c0$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y5g.InterfaceC15496a f49878a;

            public e(y5g.InterfaceC15496a interfaceC15496a) {
                this.f49878a = interfaceC15496a;
            }

            @Override // java.lang.Runnable
            public void run() {
                j8e.this.f49844u.messagesAvailable(this.f49878a);
            }
        }

        /* JADX INFO: renamed from: j8e$c0$f */
        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j8e.this.f49849z) {
                    return;
                }
                j8e.this.f49844u.onReady();
            }
        }

        public C7785c0(C7787d0 c7787d0) {
            this.f49868a = c7787d0;
        }

        @eib
        private Integer getPushbackMills(fta ftaVar) {
            String str = (String) ftaVar.get(j8e.f49821B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private C7807w makeHedgingDecision(n4g n4gVar, fta ftaVar) {
            Integer pushbackMills = getPushbackMills(ftaVar);
            boolean zContains = j8e.this.f49830g.f47176c.contains(n4gVar.getCode());
            boolean z = (j8e.this.f49836m == null || (!zContains && (pushbackMills == null || pushbackMills.intValue() >= 0))) ? false : !j8e.this.f49836m.m13896b();
            if (zContains && !z && !n4gVar.isOk() && pushbackMills != null && pushbackMills.intValue() > 0) {
                pushbackMills = 0;
            }
            return new C7807w(zContains && !z, pushbackMills);
        }

        private C7809y makeRetryDecision(n4g n4gVar, fta ftaVar) {
            long nanos = 0;
            boolean z = false;
            if (j8e.this.f49829f == null) {
                return new C7809y(false, 0L);
            }
            boolean zContains = j8e.this.f49829f.f87075f.contains(n4gVar.getCode());
            Integer pushbackMills = getPushbackMills(ftaVar);
            boolean z2 = (j8e.this.f49836m == null || (!zContains && (pushbackMills == null || pushbackMills.intValue() >= 0))) ? false : !j8e.this.f49836m.m13896b();
            if (j8e.this.f49829f.f87070a > this.f49868a.f49886d + 1 && !z2) {
                if (pushbackMills == null) {
                    if (zContains) {
                        nanos = (long) (j8e.this.f49847x * j8e.f49823D.nextDouble());
                        j8e.this.f49847x = Math.min((long) (r10.f49847x * j8e.this.f49829f.f87073d), j8e.this.f49829f.f87072c);
                        z = true;
                    }
                } else if (pushbackMills.intValue() >= 0) {
                    nanos = TimeUnit.MILLISECONDS.toNanos(pushbackMills.intValue());
                    j8e j8eVar = j8e.this;
                    j8eVar.f49847x = j8eVar.f49829f.f87071b;
                    z = true;
                }
            }
            return new C7809y(z, nanos);
        }

        @Override // p000.p42
        public void closed(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
            C7806v c7806v;
            synchronized (j8e.this.f49832i) {
                j8e j8eVar = j8e.this;
                j8eVar.f49838o = j8eVar.f49838o.m13893g(this.f49868a);
                j8e.this.f49837n.append(n4gVar.getCode());
            }
            if (j8e.this.f49841r.decrementAndGet() == Integer.MIN_VALUE) {
                j8e.this.f49826c.execute(new c());
                return;
            }
            C7787d0 c7787d0 = this.f49868a;
            if (c7787d0.f49885c) {
                j8e.this.commitAndRun(c7787d0);
                if (j8e.this.f49838o.f49859f == this.f49868a) {
                    j8e.this.safeCloseMasterListener(n4gVar, enumC10788a, ftaVar);
                    return;
                }
                return;
            }
            p42.EnumC10788a enumC10788a2 = p42.EnumC10788a.MISCARRIED;
            if (enumC10788a == enumC10788a2 && j8e.this.f49840q.incrementAndGet() > 1000) {
                j8e.this.commitAndRun(this.f49868a);
                if (j8e.this.f49838o.f49859f == this.f49868a) {
                    j8e.this.safeCloseMasterListener(n4g.f63272s.withDescription("Too many transparent retries. Might be a bug in gRPC").withCause(n4gVar.asRuntimeException()), enumC10788a, ftaVar);
                    return;
                }
                return;
            }
            if (j8e.this.f49838o.f49859f == null) {
                if (enumC10788a == enumC10788a2 || (enumC10788a == p42.EnumC10788a.REFUSED && j8e.this.f49839p.compareAndSet(false, true))) {
                    C7787d0 c7787d0CreateSubstream = j8e.this.createSubstream(this.f49868a.f49886d, true);
                    if (c7787d0CreateSubstream == null) {
                        return;
                    }
                    if (j8e.this.f49831h) {
                        synchronized (j8e.this.f49832i) {
                            j8e j8eVar2 = j8e.this;
                            j8eVar2.f49838o = j8eVar2.f49838o.m13892f(this.f49868a, c7787d0CreateSubstream);
                        }
                    }
                    j8e.this.f49825b.execute(new d(c7787d0CreateSubstream));
                    return;
                }
                if (enumC10788a != p42.EnumC10788a.DROPPED) {
                    j8e.this.f49839p.set(true);
                    if (j8e.this.f49831h) {
                        C7807w c7807wMakeHedgingDecision = makeHedgingDecision(n4gVar, ftaVar);
                        if (c7807wMakeHedgingDecision.f49925a) {
                            j8e.this.pushbackHedging(c7807wMakeHedgingDecision.f49926b);
                        }
                        synchronized (j8e.this.f49832i) {
                            try {
                                j8e j8eVar3 = j8e.this;
                                j8eVar3.f49838o = j8eVar3.f49838o.m13891e(this.f49868a);
                                if (c7807wMakeHedgingDecision.f49925a) {
                                    j8e j8eVar4 = j8e.this;
                                    if (!j8eVar4.hasPotentialHedging(j8eVar4.f49838o)) {
                                        if (!j8e.this.f49838o.f49857d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        C7809y c7809yMakeRetryDecision = makeRetryDecision(n4gVar, ftaVar);
                        if (c7809yMakeRetryDecision.f49931a) {
                            C7787d0 c7787d0CreateSubstream2 = j8e.this.createSubstream(this.f49868a.f49886d + 1, false);
                            if (c7787d0CreateSubstream2 == null) {
                                return;
                            }
                            synchronized (j8e.this.f49832i) {
                                j8e j8eVar5 = j8e.this;
                                c7806v = new C7806v(j8eVar5.f49832i);
                                j8eVar5.f49845v = c7806v;
                            }
                            c7806v.m13901c(j8e.this.f49827d.schedule(new b(c7787d0CreateSubstream2), c7809yMakeRetryDecision.f49932b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                } else if (j8e.this.f49831h) {
                    j8e.this.freezeHedging();
                }
            }
            j8e.this.commitAndRun(this.f49868a);
            if (j8e.this.f49838o.f49859f == this.f49868a) {
                j8e.this.safeCloseMasterListener(n4gVar, enumC10788a, ftaVar);
            }
        }

        @Override // p000.p42
        public void headersRead(fta ftaVar) {
            if (this.f49868a.f49886d > 0) {
                fta.AbstractC5971i<String> abstractC5971i = j8e.f49820A;
                ftaVar.discardAll(abstractC5971i);
                ftaVar.put(abstractC5971i, String.valueOf(this.f49868a.f49886d));
            }
            j8e.this.commitAndRun(this.f49868a);
            if (j8e.this.f49838o.f49859f == this.f49868a) {
                if (j8e.this.f49836m != null) {
                    j8e.this.f49836m.m13897c();
                }
                j8e.this.f49826c.execute(new a(ftaVar));
            }
        }

        @Override // p000.y5g
        public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
            C7783b0 c7783b0 = j8e.this.f49838o;
            v7d.checkState(c7783b0.f49859f != null, "Headers should be received prior to messages.");
            if (c7783b0.f49859f != this.f49868a) {
                oc7.m18574b(interfaceC15496a);
            } else {
                j8e.this.f49826c.execute(new e(interfaceC15496a));
            }
        }

        @Override // p000.y5g
        public void onReady() {
            if (j8e.this.isReady()) {
                j8e.this.f49826c.execute(new f());
            }
        }
    }

    /* JADX INFO: renamed from: j8e$d */
    public class C7786d implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ go2 f49881a;

        public C7786d(go2 go2Var) {
            this.f49881a = go2Var;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.setCompressor(this.f49881a);
        }
    }

    /* JADX INFO: renamed from: j8e$d0 */
    public static final class C7787d0 {

        /* JADX INFO: renamed from: a */
        public o42 f49883a;

        /* JADX INFO: renamed from: b */
        public boolean f49884b;

        /* JADX INFO: renamed from: c */
        public boolean f49885c;

        /* JADX INFO: renamed from: d */
        public final int f49886d;

        public C7787d0(int i) {
            this.f49886d = i;
        }
    }

    /* JADX INFO: renamed from: j8e$e */
    public class C7788e implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sj3 f49887a;

        public C7788e(sj3 sj3Var) {
            this.f49887a = sj3Var;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.setDeadline(this.f49887a);
        }
    }

    /* JADX INFO: renamed from: j8e$e0 */
    public static final class C7789e0 {

        /* JADX INFO: renamed from: e */
        public static final int f49889e = 1000;

        /* JADX INFO: renamed from: a */
        public final int f49890a;

        /* JADX INFO: renamed from: b */
        public final int f49891b;

        /* JADX INFO: renamed from: c */
        public final int f49892c;

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f49893d;

        public C7789e0(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f49893d = atomicInteger;
            this.f49892c = (int) (f2 * 1000.0f);
            int i = (int) (f * 1000.0f);
            this.f49890a = i;
            this.f49891b = i / 2;
            atomicInteger.set(i);
        }

        @gdi
        /* JADX INFO: renamed from: a */
        public boolean m13895a() {
            return this.f49893d.get() > this.f49891b;
        }

        @gdi
        /* JADX INFO: renamed from: b */
        public boolean m13896b() {
            int i;
            int i2;
            do {
                i = this.f49893d.get();
                if (i == 0) {
                    return false;
                }
                i2 = i - 1000;
            } while (!this.f49893d.compareAndSet(i, Math.max(i2, 0)));
            return i2 > this.f49891b;
        }

        @gdi
        /* JADX INFO: renamed from: c */
        public void m13897c() {
            int i;
            int i2;
            do {
                i = this.f49893d.get();
                i2 = this.f49890a;
                if (i == i2) {
                    return;
                }
            } while (!this.f49893d.compareAndSet(i, Math.min(this.f49892c + i, i2)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7789e0)) {
                return false;
            }
            C7789e0 c7789e0 = (C7789e0) obj;
            return this.f49890a == c7789e0.f49890a && this.f49892c == c7789e0.f49892c;
        }

        public int hashCode() {
            return okb.hashCode(Integer.valueOf(this.f49890a), Integer.valueOf(this.f49892c));
        }
    }

    /* JADX INFO: renamed from: j8e$f */
    public class C7790f implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bm3 f49894a;

        public C7790f(bm3 bm3Var) {
            this.f49894a = bm3Var;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.setDecompressorRegistry(this.f49894a);
        }
    }

    /* JADX INFO: renamed from: j8e$g */
    public class C7791g implements InterfaceC7803s {
        public C7791g() {
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.flush();
        }
    }

    /* JADX INFO: renamed from: j8e$h */
    public class C7792h implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f49897a;

        public C7792h(boolean z) {
            this.f49897a = z;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.setFullStreamDecompression(this.f49897a);
        }
    }

    /* JADX INFO: renamed from: j8e$i */
    public class C7793i implements InterfaceC7803s {
        public C7793i() {
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.halfClose();
        }
    }

    /* JADX INFO: renamed from: j8e$j */
    public class C7794j implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f49900a;

        public C7794j(int i) {
            this.f49900a = i;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.setMaxInboundMessageSize(this.f49900a);
        }
    }

    /* JADX INFO: renamed from: j8e$k */
    public class C7795k implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f49902a;

        public C7795k(int i) {
            this.f49902a = i;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.setMaxOutboundMessageSize(this.f49902a);
        }
    }

    /* JADX INFO: renamed from: j8e$l */
    public class C7796l implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f49904a;

        public C7796l(boolean z) {
            this.f49904a = z;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.setMessageCompression(this.f49904a);
        }
    }

    /* JADX INFO: renamed from: j8e$m */
    public class C7797m implements InterfaceC7803s {
        public C7797m() {
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.optimizeForDirectExecutor();
        }
    }

    /* JADX INFO: renamed from: j8e$n */
    public class C7798n implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f49907a;

        public C7798n(int i) {
            this.f49907a = i;
        }

        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.request(this.f49907a);
        }
    }

    /* JADX INFO: renamed from: j8e$o */
    public class C7799o implements InterfaceC7803s {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f49909a;

        public C7799o(Object obj) {
            this.f49909a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.j8e.InterfaceC7803s
        public void runWith(C7787d0 c7787d0) {
            c7787d0.f49883a.writeMessage(j8e.this.f49824a.streamRequest(this.f49909a));
            c7787d0.f49883a.flush();
        }
    }

    /* JADX INFO: renamed from: j8e$p */
    public class C7800p extends q42.AbstractC11305a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ q42 f49911a;

        public C7800p(q42 q42Var) {
            this.f49911a = q42Var;
        }

        @Override // p000.q42.AbstractC11305a
        public q42 newClientStreamTracer(q42.C11306b c11306b, fta ftaVar) {
            return this.f49911a;
        }
    }

    /* JADX INFO: renamed from: j8e$q */
    public class RunnableC7801q implements Runnable {
        public RunnableC7801q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j8e.this.f49849z) {
                return;
            }
            j8e.this.f49844u.onReady();
        }
    }

    /* JADX INFO: renamed from: j8e$r */
    public class RunnableC7802r implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n4g f49914a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ p42.EnumC10788a f49915b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fta f49916c;

        public RunnableC7802r(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
            this.f49914a = n4gVar;
            this.f49915b = enumC10788a;
            this.f49916c = ftaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j8e.this.f49849z = true;
            j8e.this.f49844u.closed(this.f49914a, this.f49915b, this.f49916c);
        }
    }

    /* JADX INFO: renamed from: j8e$s */
    public interface InterfaceC7803s {
        void runWith(C7787d0 c7787d0);
    }

    /* JADX INFO: renamed from: j8e$t */
    public class C7804t extends q42 {

        /* JADX INFO: renamed from: b */
        public final C7787d0 f49918b;

        /* JADX INFO: renamed from: c */
        @vc7("lock")
        public long f49919c;

        public C7804t(C7787d0 c7787d0) {
            this.f49918b = c7787d0;
        }

        @Override // p000.g6g
        public void outboundWireSize(long j) {
            if (j8e.this.f49838o.f49859f != null) {
                return;
            }
            synchronized (j8e.this.f49832i) {
                try {
                    if (j8e.this.f49838o.f49859f == null && !this.f49918b.f49884b) {
                        long j2 = this.f49919c + j;
                        this.f49919c = j2;
                        if (j2 <= j8e.this.f49843t) {
                            return;
                        }
                        if (this.f49919c > j8e.this.f49834k) {
                            this.f49918b.f49885c = true;
                        } else {
                            long jM13898a = j8e.this.f49833j.m13898a(this.f49919c - j8e.this.f49843t);
                            j8e.this.f49843t = this.f49919c;
                            if (jM13898a > j8e.this.f49835l) {
                                this.f49918b.f49885c = true;
                            }
                        }
                        C7787d0 c7787d0 = this.f49918b;
                        Runnable runnableCommit = c7787d0.f49885c ? j8e.this.commit(c7787d0) : null;
                        if (runnableCommit != null) {
                            runnableCommit.run();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: j8e$u */
    public static final class C7805u {

        /* JADX INFO: renamed from: a */
        public final AtomicLong f49921a = new AtomicLong();

        @gdi
        /* JADX INFO: renamed from: a */
        public long m13898a(long j) {
            return this.f49921a.addAndGet(j);
        }
    }

    /* JADX INFO: renamed from: j8e$v */
    public static final class C7806v {

        /* JADX INFO: renamed from: a */
        public final Object f49922a;

        /* JADX INFO: renamed from: b */
        @vc7("lock")
        public Future<?> f49923b;

        /* JADX INFO: renamed from: c */
        @vc7("lock")
        public boolean f49924c;

        public C7806v(Object obj) {
            this.f49922a = obj;
        }

        @vc7("lock")
        /* JADX INFO: renamed from: a */
        public boolean m13899a() {
            return this.f49924c;
        }

        @wx1
        @vc7("lock")
        /* JADX INFO: renamed from: b */
        public Future<?> m13900b() {
            this.f49924c = true;
            return this.f49923b;
        }

        /* JADX INFO: renamed from: c */
        public void m13901c(Future<?> future) {
            synchronized (this.f49922a) {
                try {
                    if (!this.f49924c) {
                        this.f49923b = future;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j8e$w */
    public static final class C7807w {

        /* JADX INFO: renamed from: a */
        public final boolean f49925a;

        /* JADX INFO: renamed from: b */
        @eib
        public final Integer f49926b;

        public C7807w(boolean z, @eib Integer num) {
            this.f49925a = z;
            this.f49926b = num;
        }
    }

    /* JADX INFO: renamed from: j8e$x */
    public final class RunnableC7808x implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C7806v f49927a;

        /* JADX INFO: renamed from: j8e$x$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7787d0 f49929a;

            public a(C7787d0 c7787d0) {
                this.f49929a = c7787d0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7806v c7806v;
                boolean z;
                synchronized (j8e.this.f49832i) {
                    try {
                        c7806v = null;
                        if (RunnableC7808x.this.f49927a.m13899a()) {
                            z = true;
                        } else {
                            j8e j8eVar = j8e.this;
                            j8eVar.f49838o = j8eVar.f49838o.m13887a(this.f49929a);
                            j8e j8eVar2 = j8e.this;
                            if (j8eVar2.hasPotentialHedging(j8eVar2.f49838o) && (j8e.this.f49836m == null || j8e.this.f49836m.m13895a())) {
                                j8e j8eVar3 = j8e.this;
                                c7806v = new C7806v(j8eVar3.f49832i);
                                j8eVar3.f49846w = c7806v;
                            } else {
                                j8e j8eVar4 = j8e.this;
                                j8eVar4.f49838o = j8eVar4.f49838o.m13890d();
                                j8e.this.f49846w = null;
                            }
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    this.f49929a.f49883a.start(new C7785c0(this.f49929a));
                    this.f49929a.f49883a.cancel(n4g.f63259f.withDescription("Unneeded hedging"));
                } else {
                    if (c7806v != null) {
                        c7806v.m13901c(j8e.this.f49827d.schedule(new RunnableC7808x(c7806v), j8e.this.f49830g.f47175b, TimeUnit.NANOSECONDS));
                    }
                    j8e.this.drain(this.f49929a);
                }
            }
        }

        public RunnableC7808x(C7806v c7806v) {
            this.f49927a = c7806v;
        }

        @Override // java.lang.Runnable
        public void run() {
            j8e j8eVar = j8e.this;
            C7787d0 c7787d0CreateSubstream = j8eVar.createSubstream(j8eVar.f49838o.f49858e, false);
            if (c7787d0CreateSubstream == null) {
                return;
            }
            j8e.this.f49825b.execute(new a(c7787d0CreateSubstream));
        }
    }

    /* JADX INFO: renamed from: j8e$y */
    public static final class C7809y {

        /* JADX INFO: renamed from: a */
        public final boolean f49931a;

        /* JADX INFO: renamed from: b */
        public final long f49932b;

        public C7809y(boolean z, long j) {
            this.f49931a = z;
            this.f49932b = j;
        }
    }

    /* JADX INFO: renamed from: j8e$z */
    public static final class C7810z {

        /* JADX INFO: renamed from: a */
        public final n4g f49933a;

        /* JADX INFO: renamed from: b */
        public final p42.EnumC10788a f49934b;

        /* JADX INFO: renamed from: c */
        public final fta f49935c;

        public C7810z(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
            this.f49933a = n4gVar;
            this.f49934b = enumC10788a;
            this.f49935c = ftaVar;
        }
    }

    static {
        fta.InterfaceC5967e<String> interfaceC5967e = fta.f37690f;
        f49820A = fta.AbstractC5971i.m11174of("grpc-previous-rpc-attempts", interfaceC5967e);
        f49821B = fta.AbstractC5971i.m11174of("grpc-retry-pushback-ms", interfaceC5967e);
        f49822C = n4g.f63259f.withDescription("Stream thrown away because RetriableStream committed");
        f49823D = new Random();
    }

    public j8e(rua<ReqT, ?> ruaVar, fta ftaVar, C7805u c7805u, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, @eib u8e u8eVar, @eib ij7 ij7Var, @eib C7789e0 c7789e0) {
        this.f49824a = ruaVar;
        this.f49833j = c7805u;
        this.f49834k = j;
        this.f49835l = j2;
        this.f49825b = executor;
        this.f49827d = scheduledExecutorService;
        this.f49828e = ftaVar;
        this.f49829f = u8eVar;
        if (u8eVar != null) {
            this.f49847x = u8eVar.f87071b;
        }
        this.f49830g = ij7Var;
        v7d.checkArgument(u8eVar == null || ij7Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f49831h = ij7Var != null;
        this.f49836m = c7789e0;
    }

    @gdi
    /* JADX INFO: renamed from: Q */
    public static void m13855Q(Random random) {
        f49823D = random;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @dy1
    @eib
    public Runnable commit(C7787d0 c7787d0) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f49832i) {
            try {
                if (this.f49838o.f49859f != null) {
                    return null;
                }
                Collection<C7787d0> collection = this.f49838o.f49856c;
                this.f49838o = this.f49838o.m13889c(c7787d0);
                this.f49833j.m13898a(-this.f49843t);
                C7806v c7806v = this.f49845v;
                if (c7806v != null) {
                    Future<?> futureM13900b = c7806v.m13900b();
                    this.f49845v = null;
                    future = futureM13900b;
                } else {
                    future = null;
                }
                C7806v c7806v2 = this.f49846w;
                if (c7806v2 != null) {
                    Future<?> futureM13900b2 = c7806v2.m13900b();
                    this.f49846w = null;
                    future2 = futureM13900b2;
                } else {
                    future2 = null;
                }
                return new RunnableC7784c(collection, c7787d0, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void commitAndRun(C7787d0 c7787d0) {
        Runnable runnableCommit = commit(c7787d0);
        if (runnableCommit != null) {
            this.f49825b.execute(runnableCommit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @eib
    public C7787d0 createSubstream(int i, boolean z) {
        int i2;
        do {
            i2 = this.f49841r.get();
            if (i2 < 0) {
                return null;
            }
        } while (!this.f49841r.compareAndSet(i2, i2 + 1));
        C7787d0 c7787d0 = new C7787d0(i);
        c7787d0.f49883a = mo13882M(m13886R(this.f49828e, i), new C7800p(new C7804t(c7787d0)), i, z);
        return c7787d0;
    }

    private void delayOrExecute(InterfaceC7803s interfaceC7803s) {
        Collection<C7787d0> collection;
        synchronized (this.f49832i) {
            try {
                if (!this.f49838o.f49854a) {
                    this.f49838o.f49855b.add(interfaceC7803s);
                }
                collection = this.f49838o.f49856c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<C7787d0> it = collection.iterator();
        while (it.hasNext()) {
            interfaceC7803s.runWith(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        r8.f49826c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r9.f49883a.start(new p000.j8e.C7785c0(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r0 = r9.f49883a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r8.f49838o.f49859f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r9 = r8.f49848y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r9 = p000.j8e.f49822C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r0.cancel(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r4 = (p000.j8e.InterfaceC7803s) r0.next();
        r4.runWith(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r4 instanceof p000.j8e.C7781a0) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r4 = r8.f49838o;
        r5 = r4.f49859f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.f49860g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drain(p000.j8e.C7787d0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f49832i
            monitor-enter(r4)
            j8e$b0 r5 = r8.f49838o     // Catch: java.lang.Throwable -> L11
            j8e$d0 r6 = r5.f49859f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L11:
            r9 = move-exception
            goto Lb0
        L14:
            boolean r6 = r5.f49860g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L1a:
            java.util.List<j8e$s> r6 = r5.f49855b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5b
            j8e$b0 r0 = r5.m13894h(r9)     // Catch: java.lang.Throwable -> L11
            r8.f49838o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.isReady()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            j8e$q r1 = new j8e$q     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r9 = r8.f49826c
            r9.execute(r1)
            return
        L3e:
            if (r2 != 0) goto L4a
            o42 r0 = r9.f49883a
            j8e$c0 r1 = new j8e$c0
            r1.<init>(r9)
            r0.start(r1)
        L4a:
            o42 r0 = r9.f49883a
            j8e$b0 r1 = r8.f49838o
            j8e$d0 r1 = r1.f49859f
            if (r1 != r9) goto L55
            n4g r9 = r8.f49848y
            goto L57
        L55:
            n4g r9 = p000.j8e.f49822C
        L57:
            r0.cancel(r9)
            return
        L5b:
            boolean r6 = r9.f49884b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L61
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L61:
            int r6 = r0 + 128
            java.util.List<j8e$s> r7 = r5.f49855b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List<j8e$s> r5 = r5.f49855b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List<j8e$s> r5 = r5.f49855b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            j8e$s r4 = (p000.j8e.InterfaceC7803s) r4
            r4.runWith(r9)
            boolean r4 = r4 instanceof p000.j8e.C7781a0
            if (r4 == 0) goto La0
            r2 = 1
        La0:
            j8e$b0 r4 = r8.f49838o
            j8e$d0 r5 = r4.f49859f
            if (r5 == 0) goto La9
            if (r5 == r9) goto La9
            goto Lad
        La9:
            boolean r4 = r4.f49860g
            if (r4 == 0) goto L8c
        Lad:
            r0 = r6
            goto L4
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j8e.drain(j8e$d0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void freezeHedging() {
        Future<?> future;
        synchronized (this.f49832i) {
            try {
                C7806v c7806v = this.f49846w;
                future = null;
                if (c7806v != null) {
                    Future<?> futureM13900b = c7806v.m13900b();
                    this.f49846w = null;
                    future = futureM13900b;
                }
                this.f49838o = this.f49838o.m13890d();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @vc7("lock")
    public boolean hasPotentialHedging(C7783b0 c7783b0) {
        return c7783b0.f49859f == null && c7783b0.f49858e < this.f49830g.f47174a && !c7783b0.f49861h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushbackHedging(@eib Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            freezeHedging();
            return;
        }
        synchronized (this.f49832i) {
            try {
                C7806v c7806v = this.f49846w;
                if (c7806v == null) {
                    return;
                }
                Future<?> futureM13900b = c7806v.m13900b();
                C7806v c7806v2 = new C7806v(this.f49832i);
                this.f49846w = c7806v2;
                if (futureM13900b != null) {
                    futureM13900b.cancel(false);
                }
                c7806v2.m13901c(this.f49827d.schedule(new RunnableC7808x(c7806v2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeCloseMasterListener(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
        this.f49842s = new C7810z(n4gVar, enumC10788a, ftaVar);
        if (this.f49841r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f49826c.execute(new RunnableC7802r(n4gVar, enumC10788a, ftaVar));
        }
    }

    /* JADX INFO: renamed from: M */
    public abstract o42 mo13882M(fta ftaVar, q42.AbstractC11305a abstractC11305a, int i, boolean z);

    /* JADX INFO: renamed from: N */
    public abstract void mo13883N();

    @dy1
    @eib
    /* JADX INFO: renamed from: O */
    public abstract n4g mo13884O();

    /* JADX INFO: renamed from: P */
    public final void m13885P(ReqT reqt) {
        C7783b0 c7783b0 = this.f49838o;
        if (c7783b0.f49854a) {
            c7783b0.f49859f.f49883a.writeMessage(this.f49824a.streamRequest(reqt));
        } else {
            delayOrExecute(new C7799o(reqt));
        }
    }

    @gdi
    /* JADX INFO: renamed from: R */
    public final fta m13886R(fta ftaVar, int i) {
        fta ftaVar2 = new fta();
        ftaVar2.merge(ftaVar);
        if (i > 0) {
            ftaVar2.put(f49820A, String.valueOf(i));
        }
        return ftaVar2;
    }

    @Override // p000.o42
    public void appendTimeoutInsight(y48 y48Var) {
        C7783b0 c7783b0;
        synchronized (this.f49832i) {
            y48Var.appendKeyValue("closed", this.f49837n);
            c7783b0 = this.f49838o;
        }
        if (c7783b0.f49859f != null) {
            y48 y48Var2 = new y48();
            c7783b0.f49859f.f49883a.appendTimeoutInsight(y48Var2);
            y48Var.appendKeyValue("committed", y48Var2);
            return;
        }
        y48 y48Var3 = new y48();
        for (C7787d0 c7787d0 : c7783b0.f49856c) {
            y48 y48Var4 = new y48();
            c7787d0.f49883a.appendTimeoutInsight(y48Var4);
            y48Var3.append(y48Var4);
        }
        y48Var.appendKeyValue("open", y48Var3);
    }

    @Override // p000.o42
    public final void cancel(n4g n4gVar) {
        C7787d0 c7787d0;
        C7787d0 c7787d02 = new C7787d0(0);
        c7787d02.f49883a = new pfb();
        Runnable runnableCommit = commit(c7787d02);
        if (runnableCommit != null) {
            synchronized (this.f49832i) {
                this.f49838o = this.f49838o.m13894h(c7787d02);
            }
            runnableCommit.run();
            safeCloseMasterListener(n4gVar, p42.EnumC10788a.PROCESSED, new fta());
            return;
        }
        synchronized (this.f49832i) {
            try {
                if (this.f49838o.f49856c.contains(this.f49838o.f49859f)) {
                    c7787d0 = this.f49838o.f49859f;
                } else {
                    this.f49848y = n4gVar;
                    c7787d0 = null;
                }
                this.f49838o = this.f49838o.m13888b();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7787d0 != null) {
            c7787d0.f49883a.cancel(n4gVar);
        }
    }

    @Override // p000.n5g
    public final void flush() {
        C7783b0 c7783b0 = this.f49838o;
        if (c7783b0.f49854a) {
            c7783b0.f49859f.f49883a.flush();
        } else {
            delayOrExecute(new C7791g());
        }
    }

    @Override // p000.o42
    public final sc0 getAttributes() {
        return this.f49838o.f49859f != null ? this.f49838o.f49859f.f49883a.getAttributes() : sc0.f81180c;
    }

    @Override // p000.o42
    public final void halfClose() {
        delayOrExecute(new C7793i());
    }

    @Override // p000.n5g
    public final boolean isReady() {
        Iterator<C7787d0> it = this.f49838o.f49856c.iterator();
        while (it.hasNext()) {
            if (it.next().f49883a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.n5g
    public void optimizeForDirectExecutor() {
        delayOrExecute(new C7797m());
    }

    @Override // p000.n5g
    public final void request(int i) {
        C7783b0 c7783b0 = this.f49838o;
        if (c7783b0.f49854a) {
            c7783b0.f49859f.f49883a.request(i);
        } else {
            delayOrExecute(new C7798n(i));
        }
    }

    @Override // p000.o42
    public final void setAuthority(String str) {
        delayOrExecute(new C7782b(str));
    }

    @Override // p000.n5g
    public final void setCompressor(go2 go2Var) {
        delayOrExecute(new C7786d(go2Var));
    }

    @Override // p000.o42
    public final void setDeadline(sj3 sj3Var) {
        delayOrExecute(new C7788e(sj3Var));
    }

    @Override // p000.o42
    public final void setDecompressorRegistry(bm3 bm3Var) {
        delayOrExecute(new C7790f(bm3Var));
    }

    @Override // p000.o42
    public final void setFullStreamDecompression(boolean z) {
        delayOrExecute(new C7792h(z));
    }

    @Override // p000.o42
    public final void setMaxInboundMessageSize(int i) {
        delayOrExecute(new C7794j(i));
    }

    @Override // p000.o42
    public final void setMaxOutboundMessageSize(int i) {
        delayOrExecute(new C7795k(i));
    }

    @Override // p000.n5g
    public final void setMessageCompression(boolean z) {
        delayOrExecute(new C7796l(z));
    }

    @Override // p000.o42
    public final void start(p42 p42Var) {
        C7806v c7806v;
        C7789e0 c7789e0;
        this.f49844u = p42Var;
        n4g n4gVarMo13884O = mo13884O();
        if (n4gVarMo13884O != null) {
            cancel(n4gVarMo13884O);
            return;
        }
        synchronized (this.f49832i) {
            this.f49838o.f49855b.add(new C7781a0());
        }
        C7787d0 c7787d0CreateSubstream = createSubstream(0, false);
        if (c7787d0CreateSubstream == null) {
            return;
        }
        if (this.f49831h) {
            synchronized (this.f49832i) {
                try {
                    this.f49838o = this.f49838o.m13887a(c7787d0CreateSubstream);
                    if (hasPotentialHedging(this.f49838o) && ((c7789e0 = this.f49836m) == null || c7789e0.m13895a())) {
                        c7806v = new C7806v(this.f49832i);
                        this.f49846w = c7806v;
                    } else {
                        c7806v = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c7806v != null) {
                c7806v.m13901c(this.f49827d.schedule(new RunnableC7808x(c7806v), this.f49830g.f47175b, TimeUnit.NANOSECONDS));
            }
        }
        drain(c7787d0CreateSubstream);
    }

    @Override // p000.n5g
    public final void writeMessage(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }
}
