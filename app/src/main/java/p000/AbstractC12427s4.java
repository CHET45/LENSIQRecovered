package p000;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p000.fta;
import p000.ga0;
import p000.m5g;
import p000.m5g.InterfaceC9150b;
import p000.n4g;

/* JADX INFO: renamed from: s4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12427s4<ReqT, RespT, CallbackT extends m5g.InterfaceC9150b> implements m5g<CallbackT> {

    /* JADX INFO: renamed from: n */
    public static final long f80589n;

    /* JADX INFO: renamed from: o */
    public static final long f80590o;

    /* JADX INFO: renamed from: p */
    public static final double f80591p = 1.5d;

    /* JADX INFO: renamed from: q */
    public static final long f80592q;

    /* JADX INFO: renamed from: r */
    public static final long f80593r;

    /* JADX INFO: renamed from: s */
    public static final long f80594s;

    /* JADX INFO: renamed from: a */
    @hib
    public ga0.C6179b f80595a;

    /* JADX INFO: renamed from: b */
    @hib
    public ga0.C6179b f80596b;

    /* JADX INFO: renamed from: c */
    public final tz5 f80597c;

    /* JADX INFO: renamed from: d */
    public final rua<ReqT, RespT> f80598d;

    /* JADX INFO: renamed from: f */
    public final ga0 f80600f;

    /* JADX INFO: renamed from: g */
    public final ga0.EnumC6181d f80601g;

    /* JADX INFO: renamed from: h */
    public final ga0.EnumC6181d f80602h;

    /* JADX INFO: renamed from: k */
    public w22<ReqT, RespT> f80605k;

    /* JADX INFO: renamed from: l */
    public final hi5 f80606l;

    /* JADX INFO: renamed from: m */
    public final CallbackT f80607m;

    /* JADX INFO: renamed from: i */
    public m5g.EnumC9149a f80603i = m5g.EnumC9149a.Initial;

    /* JADX INFO: renamed from: j */
    public long f80604j = 0;

    /* JADX INFO: renamed from: e */
    public final AbstractC12427s4<ReqT, RespT, CallbackT>.b f80599e = new b();

    /* JADX INFO: renamed from: s4$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public final long f80608a;

        public a(long j) {
            this.f80608a = j;
        }

        /* JADX INFO: renamed from: a */
        public void m21707a(Runnable runnable) {
            AbstractC12427s4.this.f80600f.verifyIsCurrentThread();
            if (AbstractC12427s4.this.f80604j == this.f80608a) {
                runnable.run();
            } else {
                fj9.debug(AbstractC12427s4.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: s4$b */
    @fdi
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC12427s4.this.handleIdleCloseTimer();
        }
    }

    /* JADX INFO: renamed from: s4$c */
    public class c implements gz7<RespT> {

        /* JADX INFO: renamed from: a */
        public final AbstractC12427s4<ReqT, RespT, CallbackT>.a f80611a;

        /* JADX INFO: renamed from: b */
        public int f80612b = 0;

        public c(AbstractC12427s4<ReqT, RespT, CallbackT>.a aVar) {
            this.f80611a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClose$3(n4g n4gVar) {
            if (n4gVar.isOk()) {
                fj9.debug(AbstractC12427s4.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(AbstractC12427s4.this)));
            } else {
                fj9.warn(AbstractC12427s4.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(AbstractC12427s4.this)), n4gVar);
            }
            AbstractC12427s4.this.m21704g(n4gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onHeaders$0(fta ftaVar) {
            if (fj9.isDebugEnabled()) {
                HashMap map = new HashMap();
                for (String str : ftaVar.keys()) {
                    if (zi3.f105123e.contains(str.toLowerCase(Locale.ENGLISH))) {
                        map.put(str, (String) ftaVar.get(fta.AbstractC5971i.m11174of(str, fta.f37690f)));
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                fj9.debug(AbstractC12427s4.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(AbstractC12427s4.this)), map);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNext$1(int i, Object obj) {
            if (fj9.isDebugEnabled()) {
                fj9.debug(AbstractC12427s4.this.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(AbstractC12427s4.this)), Integer.valueOf(i), obj);
            }
            if (i == 1) {
                AbstractC12427s4.this.onFirst(obj);
            } else {
                AbstractC12427s4.this.onNext(obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOpen$2() {
            fj9.debug(AbstractC12427s4.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(AbstractC12427s4.this)));
            AbstractC12427s4.this.onOpen();
        }

        @Override // p000.gz7
        public void onClose(final n4g n4gVar) {
            this.f80611a.m21707a(new Runnable() { // from class: w4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93184a.lambda$onClose$3(n4gVar);
                }
            });
        }

        @Override // p000.gz7
        public void onHeaders(final fta ftaVar) {
            this.f80611a.m21707a(new Runnable() { // from class: u4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86745a.lambda$onHeaders$0(ftaVar);
                }
            });
        }

        @Override // p000.gz7
        public void onNext(final RespT respt) {
            final int i = this.f80612b + 1;
            this.f80611a.m21707a(new Runnable() { // from class: t4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83668a.lambda$onNext$1(i, respt);
                }
            });
            this.f80612b = i;
        }

        @Override // p000.gz7
        public void onOpen() {
            this.f80611a.m21707a(new Runnable() { // from class: v4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89859a.lambda$onOpen$2();
                }
            });
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f80589n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f80590o = timeUnit2.toMillis(1L);
        f80592q = timeUnit2.toMillis(1L);
        f80593r = timeUnit.toMillis(10L);
        f80594s = timeUnit.toMillis(10L);
    }

    public AbstractC12427s4(tz5 tz5Var, rua<ReqT, RespT> ruaVar, ga0 ga0Var, ga0.EnumC6181d enumC6181d, ga0.EnumC6181d enumC6181d2, ga0.EnumC6181d enumC6181d3, CallbackT callbackt) {
        this.f80597c = tz5Var;
        this.f80598d = ruaVar;
        this.f80600f = ga0Var;
        this.f80601g = enumC6181d2;
        this.f80602h = enumC6181d3;
        this.f80607m = callbackt;
        this.f80606l = new hi5(ga0Var, enumC6181d, f80589n, 1.5d, f80590o);
    }

    private void cancelHealthCheck() {
        ga0.C6179b c6179b = this.f80595a;
        if (c6179b != null) {
            c6179b.cancel();
            this.f80595a = null;
        }
    }

    private void cancelIdleCheck() {
        ga0.C6179b c6179b = this.f80596b;
        if (c6179b != null) {
            c6179b.cancel();
            this.f80596b = null;
        }
    }

    private void close(m5g.EnumC9149a enumC9149a, n4g n4gVar) {
        r80.hardAssert(isStarted(), "Only started streams should be closed.", new Object[0]);
        m5g.EnumC9149a enumC9149a2 = m5g.EnumC9149a.Error;
        r80.hardAssert(enumC9149a == enumC9149a2 || n4gVar.isOk(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f80600f.verifyIsCurrentThread();
        if (zi3.isMissingSslCiphers(n4gVar)) {
            r0i.crashMainThread(new IllegalStateException(zi3.f105122d, n4gVar.getCause()));
        }
        cancelIdleCheck();
        cancelHealthCheck();
        this.f80606l.cancel();
        this.f80604j++;
        n4g.EnumC9694b code = n4gVar.getCode();
        if (code == n4g.EnumC9694b.OK) {
            this.f80606l.reset();
        } else if (code == n4g.EnumC9694b.RESOURCE_EXHAUSTED) {
            fj9.debug(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f80606l.resetToMax();
        } else if (code == n4g.EnumC9694b.UNAUTHENTICATED && this.f80603i != m5g.EnumC9149a.Healthy) {
            this.f80597c.invalidateToken();
        } else if (code == n4g.EnumC9694b.UNAVAILABLE && ((n4gVar.getCause() instanceof UnknownHostException) || (n4gVar.getCause() instanceof ConnectException))) {
            this.f80606l.setTemporaryMaxDelay(f80594s);
        }
        if (enumC9149a != enumC9149a2) {
            fj9.debug(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            mo18120i();
        }
        if (this.f80605k != null) {
            if (n4gVar.isOk()) {
                fj9.debug(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                try {
                    this.f80605k.halfClose();
                } catch (IllegalStateException e) {
                    fj9.debug(getClass().getSimpleName(), "(%x) Closing stream client-side result in exception: [%s]", Integer.valueOf(System.identityHashCode(this)), e);
                }
            }
            this.f80605k = null;
        }
        this.f80603i = enumC9149a;
        this.f80607m.onClose(n4gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIdleCloseTimer() {
        if (isOpen()) {
            close(m5g.EnumC9149a.Initial, n4g.f63258e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOpen$0() {
        if (isOpen()) {
            this.f80603i = m5g.EnumC9149a.Healthy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performBackoff$1() {
        m5g.EnumC9149a enumC9149a = this.f80603i;
        r80.hardAssert(enumC9149a == m5g.EnumC9149a.Backoff, "State should still be backoff but was %s", enumC9149a);
        this.f80603i = m5g.EnumC9149a.Initial;
        start();
        r80.hardAssert(isStarted(), "Stream should have started", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOpen() {
        this.f80603i = m5g.EnumC9149a.Open;
        this.f80607m.onOpen();
        if (this.f80595a == null) {
            this.f80595a = this.f80600f.enqueueAfterDelay(this.f80602h, f80593r, new Runnable() { // from class: r4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76998a.lambda$onOpen$0();
                }
            });
        }
    }

    private void performBackoff() {
        r80.hardAssert(this.f80603i == m5g.EnumC9149a.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f80603i = m5g.EnumC9149a.Backoff;
        this.f80606l.backoffAndRun(new Runnable() { // from class: q4
            @Override // java.lang.Runnable
            public final void run() {
                this.f73175a.lambda$performBackoff$1();
            }
        });
    }

    @fdi
    /* JADX INFO: renamed from: g */
    public void m21704g(n4g n4gVar) {
        r80.hardAssert(isStarted(), "Can't handle server close on non-started stream!", new Object[0]);
        close(m5g.EnumC9149a.Error, n4gVar);
    }

    /* JADX INFO: renamed from: h */
    public void m21705h() {
        if (isOpen() && this.f80596b == null) {
            this.f80596b = this.f80600f.enqueueAfterDelay(this.f80601g, f80592q, this.f80599e);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo18120i() {
    }

    @Override // p000.m5g
    public void inhibitBackoff() {
        r80.hardAssert(!isStarted(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f80600f.verifyIsCurrentThread();
        this.f80603i = m5g.EnumC9149a.Initial;
        this.f80606l.reset();
    }

    @Override // p000.m5g
    public boolean isOpen() {
        this.f80600f.verifyIsCurrentThread();
        m5g.EnumC9149a enumC9149a = this.f80603i;
        return enumC9149a == m5g.EnumC9149a.Open || enumC9149a == m5g.EnumC9149a.Healthy;
    }

    @Override // p000.m5g
    public boolean isStarted() {
        this.f80600f.verifyIsCurrentThread();
        m5g.EnumC9149a enumC9149a = this.f80603i;
        return enumC9149a == m5g.EnumC9149a.Starting || enumC9149a == m5g.EnumC9149a.Backoff || isOpen();
    }

    /* JADX INFO: renamed from: j */
    public void m21706j(ReqT reqt) {
        this.f80600f.verifyIsCurrentThread();
        fj9.debug(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), reqt);
        cancelIdleCheck();
        this.f80605k.sendMessage(reqt);
    }

    public abstract void onFirst(RespT respt);

    public abstract void onNext(RespT respt);

    @Override // p000.m5g
    public void start() {
        this.f80600f.verifyIsCurrentThread();
        r80.hardAssert(this.f80605k == null, "Last call still set", new Object[0]);
        r80.hardAssert(this.f80596b == null, "Idle timer still set", new Object[0]);
        m5g.EnumC9149a enumC9149a = this.f80603i;
        if (enumC9149a == m5g.EnumC9149a.Error) {
            performBackoff();
            return;
        }
        r80.hardAssert(enumC9149a == m5g.EnumC9149a.Initial, "Already started", new Object[0]);
        this.f80605k = this.f80597c.m22937f(this.f80598d, new c(new a(this.f80604j)));
        this.f80603i = m5g.EnumC9149a.Starting;
    }

    @Override // p000.m5g
    public void stop() {
        if (isStarted()) {
            close(m5g.EnumC9149a.Initial, n4g.f63258e);
        }
    }
}
