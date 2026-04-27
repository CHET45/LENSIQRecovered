package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.connection.RealConnection;
import p000.i4f;
import p000.kx7;
import p000.pu1;
import p000.q42;
import p000.sc0;
import p000.thg;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class l8c extends zb9 {

    /* JADX INFO: renamed from: p */
    public static final sc0.C12516c<C8715b> f56780p = sc0.C12516c.create("addressTrackerKey");

    /* JADX INFO: renamed from: g */
    @gdi
    public final C8716c f56781g;

    /* JADX INFO: renamed from: h */
    public final thg f56782h;

    /* JADX INFO: renamed from: i */
    public final zb9.AbstractC16069f f56783i;

    /* JADX INFO: renamed from: j */
    public final v87 f56784j;

    /* JADX INFO: renamed from: k */
    public q0h f56785k;

    /* JADX INFO: renamed from: l */
    public final ScheduledExecutorService f56786l;

    /* JADX INFO: renamed from: m */
    public thg.C13053d f56787m;

    /* JADX INFO: renamed from: n */
    public Long f56788n;

    /* JADX INFO: renamed from: o */
    public final pu1 f56789o;

    /* JADX INFO: renamed from: l8c$b */
    public static class C8715b {

        /* JADX INFO: renamed from: a */
        public C8720g f56790a;

        /* JADX INFO: renamed from: b */
        public volatile a f56791b;

        /* JADX INFO: renamed from: c */
        public a f56792c;

        /* JADX INFO: renamed from: d */
        public Long f56793d;

        /* JADX INFO: renamed from: e */
        public int f56794e;

        /* JADX INFO: renamed from: f */
        public final Set<C8722i> f56795f = new HashSet();

        /* JADX INFO: renamed from: l8c$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public AtomicLong f56796a;

            /* JADX INFO: renamed from: b */
            public AtomicLong f56797b;

            private a() {
                this.f56796a = new AtomicLong();
                this.f56797b = new AtomicLong();
            }

            /* JADX INFO: renamed from: a */
            public void m15990a() {
                this.f56796a.set(0L);
                this.f56797b.set(0L);
            }
        }

        public C8715b(C8720g c8720g) {
            this.f56791b = new a();
            this.f56792c = new a();
            this.f56790a = c8720g;
        }

        @gdi
        /* JADX INFO: renamed from: b */
        public long m15973b() {
            return this.f56791b.f56796a.get() + this.f56791b.f56797b.get();
        }

        /* JADX INFO: renamed from: c */
        public boolean m15974c(C8722i c8722i) {
            if (m15986o() && !c8722i.m16004e()) {
                c8722i.m16003d();
            } else if (!m15986o() && c8722i.m16004e()) {
                c8722i.m16006g();
            }
            c8722i.m16005f(this);
            return this.f56795f.add(c8722i);
        }

        /* JADX INFO: renamed from: d */
        public boolean m15975d(C8722i c8722i) {
            return this.f56795f.contains(c8722i);
        }

        /* JADX INFO: renamed from: e */
        public void m15976e() {
            int i = this.f56794e;
            this.f56794e = i == 0 ? 0 : i - 1;
        }

        /* JADX INFO: renamed from: f */
        public void m15977f(long j) {
            this.f56793d = Long.valueOf(j);
            this.f56794e++;
            Iterator<C8722i> it = this.f56795f.iterator();
            while (it.hasNext()) {
                it.next().m16003d();
            }
        }

        /* JADX INFO: renamed from: g */
        public double m15978g() {
            return this.f56792c.f56797b.get() / m15980i();
        }

        @gdi
        /* JADX INFO: renamed from: h */
        public Set<C8722i> m15979h() {
            return dy7.copyOf((Collection) this.f56795f);
        }

        /* JADX INFO: renamed from: i */
        public long m15980i() {
            return this.f56792c.f56796a.get() + this.f56792c.f56797b.get();
        }

        /* JADX INFO: renamed from: j */
        public void m15981j(boolean z) {
            C8720g c8720g = this.f56790a;
            if (c8720g.f56810e == null && c8720g.f56811f == null) {
                return;
            }
            if (z) {
                this.f56791b.f56796a.getAndIncrement();
            } else {
                this.f56791b.f56797b.getAndIncrement();
            }
        }

        /* JADX INFO: renamed from: k */
        public boolean m15982k(C8722i c8722i) {
            c8722i.m16002c();
            return this.f56795f.remove(c8722i);
        }

        /* JADX INFO: renamed from: l */
        public void m15983l() {
            this.f56791b.m15990a();
            this.f56792c.m15990a();
        }

        /* JADX INFO: renamed from: m */
        public void m15984m() {
            this.f56794e = 0;
        }

        public boolean maxEjectionTimeElapsed(long j) {
            return j > this.f56793d.longValue() + Math.min(this.f56790a.f56807b.longValue() * ((long) this.f56794e), Math.max(this.f56790a.f56807b.longValue(), this.f56790a.f56808c.longValue()));
        }

        /* JADX INFO: renamed from: n */
        public void m15985n(C8720g c8720g) {
            this.f56790a = c8720g;
        }

        /* JADX INFO: renamed from: o */
        public boolean m15986o() {
            return this.f56793d != null;
        }

        /* JADX INFO: renamed from: p */
        public double m15987p() {
            return this.f56792c.f56796a.get() / m15980i();
        }

        /* JADX INFO: renamed from: q */
        public void m15988q() {
            this.f56792c.m15990a();
            a aVar = this.f56791b;
            this.f56791b = this.f56792c;
            this.f56792c = aVar;
        }

        /* JADX INFO: renamed from: r */
        public void m15989r() {
            v7d.checkState(this.f56793d != null, "not currently ejected");
            this.f56793d = null;
            Iterator<C8722i> it = this.f56795f.iterator();
            while (it.hasNext()) {
                it.next().m16006g();
            }
        }

        public String toString() {
            return "AddressTracker{subchannels=" + this.f56795f + '}';
        }
    }

    /* JADX INFO: renamed from: l8c$c */
    public static class C8716c extends qs6<SocketAddress, C8715b> {

        /* JADX INFO: renamed from: a */
        public final Map<SocketAddress, C8715b> f56798a = new HashMap();

        @Override // p000.qs6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Map<SocketAddress, C8715b> mo8967m() {
            return this.f56798a;
        }

        /* JADX INFO: renamed from: k */
        public void m15991k() {
            for (C8715b c8715b : this.f56798a.values()) {
                if (c8715b.m15986o()) {
                    c8715b.m15989r();
                }
                c8715b.m15984m();
            }
        }

        /* JADX INFO: renamed from: l */
        public double m15992l() {
            if (this.f56798a.isEmpty()) {
                return 0.0d;
            }
            Iterator<C8715b> it = this.f56798a.values().iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i2++;
                if (it.next().m15986o()) {
                    i++;
                }
            }
            return (((double) i) / ((double) i2)) * 100.0d;
        }

        /* JADX INFO: renamed from: m */
        public void m15993m(Long l) {
            for (C8715b c8715b : this.f56798a.values()) {
                if (!c8715b.m15986o()) {
                    c8715b.m15976e();
                }
                if (c8715b.m15986o() && c8715b.maxEjectionTimeElapsed(l.longValue())) {
                    c8715b.m15989r();
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m15994n(C8720g c8720g, Collection<SocketAddress> collection) {
            for (SocketAddress socketAddress : collection) {
                if (!this.f56798a.containsKey(socketAddress)) {
                    this.f56798a.put(socketAddress, new C8715b(c8720g));
                }
            }
        }

        /* JADX INFO: renamed from: o */
        public void m15995o() {
            Iterator<C8715b> it = this.f56798a.values().iterator();
            while (it.hasNext()) {
                it.next().m15983l();
            }
        }

        /* JADX INFO: renamed from: p */
        public void m15996p() {
            Iterator<C8715b> it = this.f56798a.values().iterator();
            while (it.hasNext()) {
                it.next().m15988q();
            }
        }

        /* JADX INFO: renamed from: q */
        public void m15997q(C8720g c8720g) {
            Iterator<C8715b> it = this.f56798a.values().iterator();
            while (it.hasNext()) {
                it.next().m15985n(c8720g);
            }
        }
    }

    /* JADX INFO: renamed from: l8c$d */
    public class C8717d extends ms6 {

        /* JADX INFO: renamed from: a */
        public zb9.AbstractC16069f f56799a;

        public C8717d(zb9.AbstractC16069f abstractC16069f) {
            this.f56799a = new si7(abstractC16069f);
        }

        @Override // p000.ms6
        /* JADX INFO: renamed from: a */
        public zb9.AbstractC16069f mo8856a() {
            return this.f56799a;
        }

        @Override // p000.ms6, p000.zb9.AbstractC16069f
        public zb9.AbstractC16073j createSubchannel(zb9.C16065b c16065b) {
            C8722i c8722i = l8c.this.new C8722i(c16065b, this.f56799a);
            List<s45> addresses = c16065b.getAddresses();
            if (l8c.hasSingleAddress(addresses) && l8c.this.f56781g.containsKey(addresses.get(0).getAddresses().get(0))) {
                C8715b c8715b = l8c.this.f56781g.get(addresses.get(0).getAddresses().get(0));
                c8715b.m15974c(c8722i);
                if (c8715b.f56793d != null) {
                    c8722i.m16003d();
                }
            }
            return c8722i;
        }

        @Override // p000.ms6, p000.zb9.AbstractC16069f
        public void updateBalancingState(ws2 ws2Var, zb9.AbstractC16074k abstractC16074k) {
            this.f56799a.updateBalancingState(ws2Var, l8c.this.new C8721h(abstractC16074k));
        }
    }

    /* JADX INFO: renamed from: l8c$e */
    public class RunnableC8718e implements Runnable {

        /* JADX INFO: renamed from: a */
        public C8720g f56801a;

        /* JADX INFO: renamed from: b */
        public pu1 f56802b;

        public RunnableC8718e(C8720g c8720g, pu1 pu1Var) {
            this.f56801a = c8720g;
            this.f56802b = pu1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            l8c l8cVar = l8c.this;
            l8cVar.f56788n = Long.valueOf(l8cVar.f56785k.currentTimeNanos());
            l8c.this.f56781g.m15996p();
            for (InterfaceC8723j interfaceC8723j : InterfaceC8723j.forConfig(this.f56801a, this.f56802b)) {
                l8c l8cVar2 = l8c.this;
                interfaceC8723j.ejectOutliers(l8cVar2.f56781g, l8cVar2.f56788n.longValue());
            }
            l8c l8cVar3 = l8c.this;
            l8cVar3.f56781g.m15993m(l8cVar3.f56788n);
        }
    }

    /* JADX INFO: renamed from: l8c$f */
    public static class C8719f implements InterfaceC8723j {

        /* JADX INFO: renamed from: a */
        public final C8720g f56804a;

        /* JADX INFO: renamed from: b */
        public final pu1 f56805b;

        public C8719f(C8720g c8720g, pu1 pu1Var) {
            this.f56804a = c8720g;
            this.f56805b = pu1Var;
        }

        @Override // p000.l8c.InterfaceC8723j
        public void ejectOutliers(C8716c c8716c, long j) {
            List<C8715b> listTrackersWithVolume = l8c.trackersWithVolume(c8716c, this.f56804a.f56811f.f56823d.intValue());
            if (listTrackersWithVolume.size() < this.f56804a.f56811f.f56822c.intValue() || listTrackersWithVolume.size() == 0) {
                return;
            }
            for (C8715b c8715b : listTrackersWithVolume) {
                if (c8716c.m15992l() >= this.f56804a.f56809d.intValue()) {
                    return;
                }
                if (c8715b.m15980i() >= this.f56804a.f56811f.f56823d.intValue()) {
                    if (c8715b.m15978g() > ((double) this.f56804a.f56811f.f56820a.intValue()) / 100.0d) {
                        this.f56805b.log(pu1.EnumC11124a.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", c8715b, Double.valueOf(c8715b.m15978g()));
                        if (new Random().nextInt(100) < this.f56804a.f56811f.f56821b.intValue()) {
                            c8715b.m15977f(j);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l8c$g */
    public static final class C8720g {

        /* JADX INFO: renamed from: a */
        public final Long f56806a;

        /* JADX INFO: renamed from: b */
        public final Long f56807b;

        /* JADX INFO: renamed from: c */
        public final Long f56808c;

        /* JADX INFO: renamed from: d */
        public final Integer f56809d;

        /* JADX INFO: renamed from: e */
        public final c f56810e;

        /* JADX INFO: renamed from: f */
        public final b f56811f;

        /* JADX INFO: renamed from: g */
        public final i4f.C7146b f56812g;

        /* JADX INFO: renamed from: l8c$g$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public Long f56813a = Long.valueOf(RealConnection.IDLE_CONNECTION_HEALTHY_NS);

            /* JADX INFO: renamed from: b */
            public Long f56814b = 30000000000L;

            /* JADX INFO: renamed from: c */
            public Long f56815c = 300000000000L;

            /* JADX INFO: renamed from: d */
            public Integer f56816d = 10;

            /* JADX INFO: renamed from: e */
            public c f56817e;

            /* JADX INFO: renamed from: f */
            public b f56818f;

            /* JADX INFO: renamed from: g */
            public i4f.C7146b f56819g;

            public C8720g build() {
                v7d.checkState(this.f56819g != null);
                return new C8720g(this.f56813a, this.f56814b, this.f56815c, this.f56816d, this.f56817e, this.f56818f, this.f56819g);
            }

            public a setBaseEjectionTimeNanos(Long l) {
                v7d.checkArgument(l != null);
                this.f56814b = l;
                return this;
            }

            public a setChildPolicy(i4f.C7146b c7146b) {
                v7d.checkState(c7146b != null);
                this.f56819g = c7146b;
                return this;
            }

            public a setFailurePercentageEjection(b bVar) {
                this.f56818f = bVar;
                return this;
            }

            public a setIntervalNanos(Long l) {
                v7d.checkArgument(l != null);
                this.f56813a = l;
                return this;
            }

            public a setMaxEjectionPercent(Integer num) {
                v7d.checkArgument(num != null);
                this.f56816d = num;
                return this;
            }

            public a setMaxEjectionTimeNanos(Long l) {
                v7d.checkArgument(l != null);
                this.f56815c = l;
                return this;
            }

            public a setSuccessRateEjection(c cVar) {
                this.f56817e = cVar;
                return this;
            }
        }

        /* JADX INFO: renamed from: l8c$g$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public final Integer f56820a;

            /* JADX INFO: renamed from: b */
            public final Integer f56821b;

            /* JADX INFO: renamed from: c */
            public final Integer f56822c;

            /* JADX INFO: renamed from: d */
            public final Integer f56823d;

            /* JADX INFO: renamed from: l8c$g$b$a */
            public static class a {

                /* JADX INFO: renamed from: a */
                public Integer f56824a = 85;

                /* JADX INFO: renamed from: b */
                public Integer f56825b = 100;

                /* JADX INFO: renamed from: c */
                public Integer f56826c = 5;

                /* JADX INFO: renamed from: d */
                public Integer f56827d = 50;

                public b build() {
                    return new b(this.f56824a, this.f56825b, this.f56826c, this.f56827d);
                }

                public a setEnforcementPercentage(Integer num) {
                    boolean z = false;
                    v7d.checkArgument(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z = true;
                    }
                    v7d.checkArgument(z);
                    this.f56825b = num;
                    return this;
                }

                public a setMinimumHosts(Integer num) {
                    v7d.checkArgument(num != null);
                    v7d.checkArgument(num.intValue() >= 0);
                    this.f56826c = num;
                    return this;
                }

                public a setRequestVolume(Integer num) {
                    v7d.checkArgument(num != null);
                    v7d.checkArgument(num.intValue() >= 0);
                    this.f56827d = num;
                    return this;
                }

                public a setThreshold(Integer num) {
                    boolean z = false;
                    v7d.checkArgument(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z = true;
                    }
                    v7d.checkArgument(z);
                    this.f56824a = num;
                    return this;
                }
            }

            public b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f56820a = num;
                this.f56821b = num2;
                this.f56822c = num3;
                this.f56823d = num4;
            }
        }

        /* JADX INFO: renamed from: l8c$g$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public final Integer f56828a;

            /* JADX INFO: renamed from: b */
            public final Integer f56829b;

            /* JADX INFO: renamed from: c */
            public final Integer f56830c;

            /* JADX INFO: renamed from: d */
            public final Integer f56831d;

            /* JADX INFO: renamed from: l8c$g$c$a */
            public static final class a {

                /* JADX INFO: renamed from: a */
                public Integer f56832a = 1900;

                /* JADX INFO: renamed from: b */
                public Integer f56833b = 100;

                /* JADX INFO: renamed from: c */
                public Integer f56834c = 5;

                /* JADX INFO: renamed from: d */
                public Integer f56835d = 100;

                public c build() {
                    return new c(this.f56832a, this.f56833b, this.f56834c, this.f56835d);
                }

                public a setEnforcementPercentage(Integer num) {
                    boolean z = false;
                    v7d.checkArgument(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z = true;
                    }
                    v7d.checkArgument(z);
                    this.f56833b = num;
                    return this;
                }

                public a setMinimumHosts(Integer num) {
                    v7d.checkArgument(num != null);
                    v7d.checkArgument(num.intValue() >= 0);
                    this.f56834c = num;
                    return this;
                }

                public a setRequestVolume(Integer num) {
                    v7d.checkArgument(num != null);
                    v7d.checkArgument(num.intValue() >= 0);
                    this.f56835d = num;
                    return this;
                }

                public a setStdevFactor(Integer num) {
                    v7d.checkArgument(num != null);
                    this.f56832a = num;
                    return this;
                }
            }

            public c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f56828a = num;
                this.f56829b = num2;
                this.f56830c = num3;
                this.f56831d = num4;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m15998a() {
            return (this.f56810e == null && this.f56811f == null) ? false : true;
        }

        private C8720g(Long l, Long l2, Long l3, Integer num, c cVar, b bVar, i4f.C7146b c7146b) {
            this.f56806a = l;
            this.f56807b = l2;
            this.f56808c = l3;
            this.f56809d = num;
            this.f56810e = cVar;
            this.f56811f = bVar;
            this.f56812g = c7146b;
        }
    }

    /* JADX INFO: renamed from: l8c$h */
    public class C8721h extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final zb9.AbstractC16074k f56836a;

        /* JADX INFO: renamed from: l8c$h$a */
        public class a extends q42.AbstractC11305a {

            /* JADX INFO: renamed from: a */
            public final C8715b f56838a;

            /* JADX INFO: renamed from: b */
            @eib
            public final q42.AbstractC11305a f56839b;

            /* JADX INFO: renamed from: l8c$h$a$a, reason: collision with other inner class name */
            public class C16473a extends jr6 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ q42 f56841b;

                public C16473a(q42 q42Var) {
                    this.f56841b = q42Var;
                }

                @Override // p000.jr6
                /* JADX INFO: renamed from: a */
                public q42 mo14254a() {
                    return this.f56841b;
                }

                @Override // p000.jr6, p000.g6g
                public void streamClosed(n4g n4gVar) {
                    a.this.f56838a.m15981j(n4gVar.isOk());
                    mo14254a().streamClosed(n4gVar);
                }
            }

            /* JADX INFO: renamed from: l8c$h$a$b */
            public class b extends q42 {
                public b() {
                }

                @Override // p000.g6g
                public void streamClosed(n4g n4gVar) {
                    a.this.f56838a.m15981j(n4gVar.isOk());
                }
            }

            public a(C8715b c8715b, @eib q42.AbstractC11305a abstractC11305a) {
                this.f56838a = c8715b;
                this.f56839b = abstractC11305a;
            }

            @Override // p000.q42.AbstractC11305a
            public q42 newClientStreamTracer(q42.C11306b c11306b, fta ftaVar) {
                q42.AbstractC11305a abstractC11305a = this.f56839b;
                return abstractC11305a != null ? new C16473a(abstractC11305a.newClientStreamTracer(c11306b, ftaVar)) : new b();
            }
        }

        public C8721h(zb9.AbstractC16074k abstractC16074k) {
            this.f56836a = abstractC16074k;
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            zb9.C16070g c16070gPickSubchannel = this.f56836a.pickSubchannel(abstractC16071h);
            zb9.AbstractC16073j subchannel = c16070gPickSubchannel.getSubchannel();
            return subchannel != null ? zb9.C16070g.withSubchannel(subchannel, new a((C8715b) subchannel.getAttributes().get(l8c.f56780p), c16070gPickSubchannel.getStreamTracerFactory())) : c16070gPickSubchannel;
        }
    }

    /* JADX INFO: renamed from: l8c$i */
    public class C8722i extends vt6 {

        /* JADX INFO: renamed from: a */
        public final zb9.AbstractC16073j f56844a;

        /* JADX INFO: renamed from: b */
        public C8715b f56845b;

        /* JADX INFO: renamed from: c */
        public boolean f56846c;

        /* JADX INFO: renamed from: d */
        public xs2 f56847d;

        /* JADX INFO: renamed from: e */
        public zb9.InterfaceC16075l f56848e;

        /* JADX INFO: renamed from: f */
        public final pu1 f56849f;

        /* JADX INFO: renamed from: l8c$i$a */
        public class a implements zb9.InterfaceC16075l {

            /* JADX INFO: renamed from: a */
            public final zb9.InterfaceC16075l f56851a;

            public a(zb9.InterfaceC16075l interfaceC16075l) {
                this.f56851a = interfaceC16075l;
            }

            @Override // p000.zb9.InterfaceC16075l
            public void onSubchannelState(xs2 xs2Var) {
                C8722i.this.f56847d = xs2Var;
                if (C8722i.this.f56846c) {
                    return;
                }
                this.f56851a.onSubchannelState(xs2Var);
            }
        }

        public C8722i(zb9.C16065b c16065b, zb9.AbstractC16069f abstractC16069f) {
            zb9.C16065b.b<zb9.InterfaceC16075l> bVar = zb9.f104684c;
            zb9.InterfaceC16075l interfaceC16075l = (zb9.InterfaceC16075l) c16065b.getOption(bVar);
            if (interfaceC16075l != null) {
                this.f56848e = interfaceC16075l;
                this.f56844a = abstractC16069f.createSubchannel(c16065b.toBuilder().addOption(bVar, new a(interfaceC16075l)).build());
            } else {
                this.f56844a = abstractC16069f.createSubchannel(c16065b);
            }
            this.f56849f = this.f56844a.getChannelLogger();
        }

        /* JADX INFO: renamed from: c */
        public void m16002c() {
            this.f56845b = null;
        }

        /* JADX INFO: renamed from: d */
        public void m16003d() {
            this.f56846c = true;
            this.f56848e.onSubchannelState(xs2.forTransientFailure(n4g.f63273t));
            this.f56849f.log(pu1.EnumC11124a.INFO, "Subchannel ejected: {0}", this);
        }

        @Override // p000.vt6
        public zb9.AbstractC16073j delegate() {
            return this.f56844a;
        }

        /* JADX INFO: renamed from: e */
        public boolean m16004e() {
            return this.f56846c;
        }

        /* JADX INFO: renamed from: f */
        public void m16005f(C8715b c8715b) {
            this.f56845b = c8715b;
        }

        /* JADX INFO: renamed from: g */
        public void m16006g() {
            this.f56846c = false;
            xs2 xs2Var = this.f56847d;
            if (xs2Var != null) {
                this.f56848e.onSubchannelState(xs2Var);
                this.f56849f.log(pu1.EnumC11124a.INFO, "Subchannel unejected: {0}", this);
            }
        }

        @Override // p000.vt6, p000.zb9.AbstractC16073j
        public sc0 getAttributes() {
            return this.f56845b != null ? this.f56844a.getAttributes().toBuilder().set(l8c.f56780p, this.f56845b).build() : this.f56844a.getAttributes();
        }

        @Override // p000.vt6, p000.zb9.AbstractC16073j
        public void shutdown() {
            C8715b c8715b = this.f56845b;
            if (c8715b != null) {
                c8715b.m15982k(this);
            }
            super.shutdown();
        }

        @Override // p000.vt6, p000.zb9.AbstractC16073j
        public void start(zb9.InterfaceC16075l interfaceC16075l) {
            if (this.f56848e != null) {
                super.start(interfaceC16075l);
            } else {
                this.f56848e = interfaceC16075l;
                super.start(new a(interfaceC16075l));
            }
        }

        @Override // p000.vt6
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f56844a.getAllAddresses() + '}';
        }

        @Override // p000.vt6, p000.zb9.AbstractC16073j
        public void updateAddresses(List<s45> list) {
            if (l8c.hasSingleAddress(getAllAddresses()) && l8c.hasSingleAddress(list)) {
                if (l8c.this.f56781g.containsValue(this.f56845b)) {
                    this.f56845b.m15982k(this);
                }
                SocketAddress socketAddress = list.get(0).getAddresses().get(0);
                if (l8c.this.f56781g.containsKey(socketAddress)) {
                    l8c.this.f56781g.get(socketAddress).m15974c(this);
                }
            } else if (!l8c.hasSingleAddress(getAllAddresses()) || l8c.hasSingleAddress(list)) {
                if (!l8c.hasSingleAddress(getAllAddresses()) && l8c.hasSingleAddress(list)) {
                    SocketAddress socketAddress2 = list.get(0).getAddresses().get(0);
                    if (l8c.this.f56781g.containsKey(socketAddress2)) {
                        l8c.this.f56781g.get(socketAddress2).m15974c(this);
                    }
                }
            } else if (l8c.this.f56781g.containsKey(getAddresses().getAddresses().get(0))) {
                C8715b c8715b = l8c.this.f56781g.get(getAddresses().getAddresses().get(0));
                c8715b.m15982k(this);
                c8715b.m15983l();
            }
            this.f56844a.updateAddresses(list);
        }
    }

    /* JADX INFO: renamed from: l8c$j */
    public interface InterfaceC8723j {
        @eib
        static List<InterfaceC8723j> forConfig(C8720g c8720g, pu1 pu1Var) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            if (c8720g.f56810e != null) {
                c8541aBuilder.add(new C8724k(c8720g, pu1Var));
            }
            if (c8720g.f56811f != null) {
                c8541aBuilder.add(new C8719f(c8720g, pu1Var));
            }
            return c8541aBuilder.build();
        }

        void ejectOutliers(C8716c c8716c, long j);
    }

    /* JADX INFO: renamed from: l8c$k */
    public static class C8724k implements InterfaceC8723j {

        /* JADX INFO: renamed from: a */
        public final C8720g f56853a;

        /* JADX INFO: renamed from: b */
        public final pu1 f56854b;

        public C8724k(C8720g c8720g, pu1 pu1Var) {
            v7d.checkArgument(c8720g.f56810e != null, "success rate ejection config is null");
            this.f56853a = c8720g;
            this.f56854b = pu1Var;
        }

        @gdi
        /* JADX INFO: renamed from: a */
        public static double m16007a(Collection<Double> collection) {
            Iterator<Double> it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += it.next().doubleValue();
            }
            return dDoubleValue / ((double) collection.size());
        }

        @gdi
        /* JADX INFO: renamed from: b */
        public static double m16008b(Collection<Double> collection, double d) {
            Iterator<Double> it = collection.iterator();
            double d2 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = it.next().doubleValue() - d;
                d2 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d2 / ((double) collection.size()));
        }

        @Override // p000.l8c.InterfaceC8723j
        public void ejectOutliers(C8716c c8716c, long j) {
            List<C8715b> listTrackersWithVolume = l8c.trackersWithVolume(c8716c, this.f56853a.f56810e.f56831d.intValue());
            if (listTrackersWithVolume.size() < this.f56853a.f56810e.f56830c.intValue() || listTrackersWithVolume.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listTrackersWithVolume.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((C8715b) it.next()).m15987p()));
            }
            double dM16007a = m16007a(arrayList);
            double dM16008b = m16008b(arrayList, dM16007a);
            double dIntValue = dM16007a - (((double) (this.f56853a.f56810e.f56828a.intValue() / 1000.0f)) * dM16008b);
            for (C8715b c8715b : listTrackersWithVolume) {
                if (c8716c.m15992l() >= this.f56853a.f56809d.intValue()) {
                    return;
                }
                if (c8715b.m15987p() < dIntValue) {
                    this.f56854b.log(pu1.EnumC11124a.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", c8715b, Double.valueOf(c8715b.m15987p()), Double.valueOf(dM16007a), Double.valueOf(dM16008b), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < this.f56853a.f56810e.f56829b.intValue()) {
                        c8715b.m15977f(j);
                    }
                }
            }
        }
    }

    public l8c(zb9.AbstractC16069f abstractC16069f, q0h q0hVar) {
        pu1 channelLogger = abstractC16069f.getChannelLogger();
        this.f56789o = channelLogger;
        C8717d c8717d = new C8717d((zb9.AbstractC16069f) v7d.checkNotNull(abstractC16069f, "helper"));
        this.f56783i = c8717d;
        this.f56784j = new v87(c8717d);
        this.f56781g = new C8716c();
        this.f56782h = (thg) v7d.checkNotNull(abstractC16069f.getSynchronizationContext(), "syncContext");
        this.f56786l = (ScheduledExecutorService) v7d.checkNotNull(abstractC16069f.getScheduledExecutorService(), "timeService");
        this.f56785k = q0hVar;
        channelLogger.log(pu1.EnumC11124a.DEBUG, "OutlierDetection lb created.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasSingleAddress(List<s45> list) {
        Iterator<s45> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().getAddresses().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<C8715b> trackersWithVolume(C8716c c8716c, int i) {
        ArrayList arrayList = new ArrayList();
        for (C8715b c8715b : c8716c.values()) {
            if (c8715b.m15980i() >= i) {
                arrayList.add(c8715b);
            }
        }
        return arrayList;
    }

    @Override // p000.zb9
    public n4g acceptResolvedAddresses(zb9.C16072i c16072i) {
        this.f56789o.log(pu1.EnumC11124a.DEBUG, "Received resolution result: {0}", c16072i);
        C8720g c8720g = (C8720g) c16072i.getLoadBalancingPolicyConfig();
        ArrayList arrayList = new ArrayList();
        Iterator<s45> it = c16072i.getAddresses().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getAddresses());
        }
        this.f56781g.keySet().retainAll(arrayList);
        this.f56781g.m15997q(c8720g);
        this.f56781g.m15994n(c8720g, arrayList);
        this.f56784j.switchTo(c8720g.f56812g.getProvider());
        if (c8720g.m15998a()) {
            Long lValueOf = this.f56788n == null ? c8720g.f56806a : Long.valueOf(Math.max(0L, c8720g.f56806a.longValue() - (this.f56785k.currentTimeNanos() - this.f56788n.longValue())));
            thg.C13053d c13053d = this.f56787m;
            if (c13053d != null) {
                c13053d.cancel();
                this.f56781g.m15995o();
            }
            this.f56787m = this.f56782h.scheduleWithFixedDelay(new RunnableC8718e(c8720g, this.f56789o), lValueOf.longValue(), c8720g.f56806a.longValue(), TimeUnit.NANOSECONDS, this.f56786l);
        } else {
            thg.C13053d c13053d2 = this.f56787m;
            if (c13053d2 != null) {
                c13053d2.cancel();
                this.f56788n = null;
                this.f56781g.m15991k();
            }
        }
        this.f56784j.handleResolvedAddresses(c16072i.toBuilder().setLoadBalancingPolicyConfig(c8720g.f56812g.getConfig()).build());
        return n4g.f63258e;
    }

    @Override // p000.zb9
    public void handleNameResolutionError(n4g n4gVar) {
        this.f56784j.handleNameResolutionError(n4gVar);
    }

    @Override // p000.zb9
    public void shutdown() {
        this.f56784j.shutdown();
    }
}
