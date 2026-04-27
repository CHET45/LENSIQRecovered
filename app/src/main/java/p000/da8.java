package p000;

import java.net.SocketAddress;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class da8 {

    /* JADX INFO: renamed from: f */
    public static final Logger f28913f = Logger.getLogger(da8.class.getName());

    /* JADX INFO: renamed from: g */
    public static final da8 f28914g = new da8();

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ boolean f28915h = false;

    /* JADX INFO: renamed from: a */
    public final ConcurrentNavigableMap<Long, xa8<C4693j>> f28916a = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentNavigableMap<Long, xa8<C4685b>> f28917b = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: c */
    public final ConcurrentMap<Long, xa8<C4685b>> f28918c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final ConcurrentMap<Long, xa8<C4695l>> f28919d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public final ConcurrentMap<Long, C4691h> f28920e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: da8$b */
    @uw7
    public static final class C4685b {

        /* JADX INFO: renamed from: a */
        public final String f28921a;

        /* JADX INFO: renamed from: b */
        public final ws2 f28922b;

        /* JADX INFO: renamed from: c */
        @eib
        public final C4686c f28923c;

        /* JADX INFO: renamed from: d */
        public final long f28924d;

        /* JADX INFO: renamed from: e */
        public final long f28925e;

        /* JADX INFO: renamed from: f */
        public final long f28926f;

        /* JADX INFO: renamed from: g */
        public final long f28927g;

        /* JADX INFO: renamed from: h */
        public final List<ac8> f28928h;

        /* JADX INFO: renamed from: i */
        public final List<ac8> f28929i;

        /* JADX INFO: renamed from: da8$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public String f28930a;

            /* JADX INFO: renamed from: b */
            public ws2 f28931b;

            /* JADX INFO: renamed from: c */
            public C4686c f28932c;

            /* JADX INFO: renamed from: d */
            public long f28933d;

            /* JADX INFO: renamed from: e */
            public long f28934e;

            /* JADX INFO: renamed from: f */
            public long f28935f;

            /* JADX INFO: renamed from: g */
            public long f28936g;

            /* JADX INFO: renamed from: h */
            public List<ac8> f28937h = Collections.emptyList();

            /* JADX INFO: renamed from: i */
            public List<ac8> f28938i = Collections.emptyList();

            public C4685b build() {
                return new C4685b(this.f28930a, this.f28931b, this.f28932c, this.f28933d, this.f28934e, this.f28935f, this.f28936g, this.f28937h, this.f28938i);
            }

            public a setCallsFailed(long j) {
                this.f28935f = j;
                return this;
            }

            public a setCallsStarted(long j) {
                this.f28933d = j;
                return this;
            }

            public a setCallsSucceeded(long j) {
                this.f28934e = j;
                return this;
            }

            public a setChannelTrace(C4686c c4686c) {
                this.f28932c = c4686c;
                return this;
            }

            public a setLastCallStartedNanos(long j) {
                this.f28936g = j;
                return this;
            }

            public a setSockets(List<ac8> list) {
                v7d.checkState(this.f28937h.isEmpty());
                this.f28938i = Collections.unmodifiableList((List) v7d.checkNotNull(list));
                return this;
            }

            public a setState(ws2 ws2Var) {
                this.f28931b = ws2Var;
                return this;
            }

            public a setSubchannels(List<ac8> list) {
                v7d.checkState(this.f28938i.isEmpty());
                this.f28937h = Collections.unmodifiableList((List) v7d.checkNotNull(list));
                return this;
            }

            public a setTarget(String str) {
                this.f28930a = str;
                return this;
            }
        }

        private C4685b(String str, ws2 ws2Var, @eib C4686c c4686c, long j, long j2, long j3, long j4, List<ac8> list, List<ac8> list2) {
            v7d.checkState(list.isEmpty() || list2.isEmpty(), "channels can have subchannels only, subchannels can have either sockets OR subchannels, neither can have both");
            this.f28921a = str;
            this.f28922b = ws2Var;
            this.f28923c = c4686c;
            this.f28924d = j;
            this.f28925e = j2;
            this.f28926f = j3;
            this.f28927g = j4;
            this.f28928h = (List) v7d.checkNotNull(list);
            this.f28929i = (List) v7d.checkNotNull(list2);
        }
    }

    /* JADX INFO: renamed from: da8$c */
    @uw7
    public static final class C4686c {

        /* JADX INFO: renamed from: a */
        public final long f28939a;

        /* JADX INFO: renamed from: b */
        public final long f28940b;

        /* JADX INFO: renamed from: c */
        public final List<b> f28941c;

        /* JADX INFO: renamed from: da8$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Long f28942a;

            /* JADX INFO: renamed from: b */
            public Long f28943b;

            /* JADX INFO: renamed from: c */
            public List<b> f28944c = Collections.emptyList();

            public C4686c build() {
                v7d.checkNotNull(this.f28942a, "numEventsLogged");
                v7d.checkNotNull(this.f28943b, "creationTimeNanos");
                return new C4686c(this.f28942a.longValue(), this.f28943b.longValue(), this.f28944c);
            }

            public a setCreationTimeNanos(long j) {
                this.f28943b = Long.valueOf(j);
                return this;
            }

            public a setEvents(List<b> list) {
                this.f28944c = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a setNumEventsLogged(long j) {
                this.f28942a = Long.valueOf(j);
                return this;
            }
        }

        /* JADX INFO: renamed from: da8$c$b */
        @uw7
        public static final class b {

            /* JADX INFO: renamed from: a */
            public final String f28945a;

            /* JADX INFO: renamed from: b */
            public final EnumC16427b f28946b;

            /* JADX INFO: renamed from: c */
            public final long f28947c;

            /* JADX INFO: renamed from: d */
            @eib
            public final ac8 f28948d;

            /* JADX INFO: renamed from: e */
            @eib
            public final ac8 f28949e;

            /* JADX INFO: renamed from: da8$c$b$a */
            public static final class a {

                /* JADX INFO: renamed from: a */
                public String f28950a;

                /* JADX INFO: renamed from: b */
                public EnumC16427b f28951b;

                /* JADX INFO: renamed from: c */
                public Long f28952c;

                /* JADX INFO: renamed from: d */
                public ac8 f28953d;

                /* JADX INFO: renamed from: e */
                public ac8 f28954e;

                public b build() {
                    v7d.checkNotNull(this.f28950a, "description");
                    v7d.checkNotNull(this.f28951b, "severity");
                    v7d.checkNotNull(this.f28952c, "timestampNanos");
                    v7d.checkState(this.f28953d == null || this.f28954e == null, "at least one of channelRef and subchannelRef must be null");
                    return new b(this.f28950a, this.f28951b, this.f28952c.longValue(), this.f28953d, this.f28954e);
                }

                public a setChannelRef(ac8 ac8Var) {
                    this.f28953d = ac8Var;
                    return this;
                }

                public a setDescription(String str) {
                    this.f28950a = str;
                    return this;
                }

                public a setSeverity(EnumC16427b enumC16427b) {
                    this.f28951b = enumC16427b;
                    return this;
                }

                public a setSubchannelRef(ac8 ac8Var) {
                    this.f28954e = ac8Var;
                    return this;
                }

                public a setTimestampNanos(long j) {
                    this.f28952c = Long.valueOf(j);
                    return this;
                }
            }

            /* JADX INFO: renamed from: da8$c$b$b, reason: collision with other inner class name */
            public enum EnumC16427b {
                CT_UNKNOWN,
                CT_INFO,
                CT_WARNING,
                CT_ERROR
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return okb.equal(this.f28945a, bVar.f28945a) && okb.equal(this.f28946b, bVar.f28946b) && this.f28947c == bVar.f28947c && okb.equal(this.f28948d, bVar.f28948d) && okb.equal(this.f28949e, bVar.f28949e);
            }

            public int hashCode() {
                return okb.hashCode(this.f28945a, this.f28946b, Long.valueOf(this.f28947c), this.f28948d, this.f28949e);
            }

            public String toString() {
                return yya.toStringHelper(this).add("description", this.f28945a).add("severity", this.f28946b).add("timestampNanos", this.f28947c).add("channelRef", this.f28948d).add("subchannelRef", this.f28949e).toString();
            }

            private b(String str, EnumC16427b enumC16427b, long j, @eib ac8 ac8Var, @eib ac8 ac8Var2) {
                this.f28945a = str;
                this.f28946b = (EnumC16427b) v7d.checkNotNull(enumC16427b, "severity");
                this.f28947c = j;
                this.f28948d = ac8Var;
                this.f28949e = ac8Var2;
            }
        }

        private C4686c(long j, long j2, List<b> list) {
            this.f28939a = j;
            this.f28940b = j2;
            this.f28941c = list;
        }
    }

    /* JADX INFO: renamed from: da8$d */
    public static final class C4687d {

        /* JADX INFO: renamed from: a */
        public final String f28960a;

        /* JADX INFO: renamed from: b */
        @eib
        public final Object f28961b;

        public C4687d(String str, @eib Object obj) {
            this.f28960a = (String) v7d.checkNotNull(str);
            v7d.checkState(obj == null || obj.getClass().getName().endsWith("com.google.protobuf.Any"), "the 'any' object must be of type com.google.protobuf.Any");
            this.f28961b = obj;
        }
    }

    /* JADX INFO: renamed from: da8$e */
    public static final class C4688e {

        /* JADX INFO: renamed from: a */
        public final List<xa8<C4685b>> f28962a;

        /* JADX INFO: renamed from: b */
        public final boolean f28963b;

        public C4688e(List<xa8<C4685b>> list, boolean z) {
            this.f28962a = (List) v7d.checkNotNull(list);
            this.f28963b = z;
        }
    }

    /* JADX INFO: renamed from: da8$g */
    public static final class C4690g {

        /* JADX INFO: renamed from: a */
        public final List<xa8<C4693j>> f28966a;

        /* JADX INFO: renamed from: b */
        public final boolean f28967b;

        public C4690g(List<xa8<C4693j>> list, boolean z) {
            this.f28966a = (List) v7d.checkNotNull(list);
            this.f28967b = z;
        }
    }

    /* JADX INFO: renamed from: da8$h */
    public static final class C4691h extends ConcurrentSkipListMap<Long, xa8<C4695l>> {
        private static final long serialVersionUID = -7883772124944661414L;

        private C4691h() {
        }
    }

    /* JADX INFO: renamed from: da8$i */
    public static final class C4692i {

        /* JADX INFO: renamed from: a */
        public final List<ac8> f28968a;

        /* JADX INFO: renamed from: b */
        public final boolean f28969b;

        public C4692i(List<ac8> list, boolean z) {
            this.f28968a = list;
            this.f28969b = z;
        }
    }

    /* JADX INFO: renamed from: da8$j */
    @uw7
    public static final class C4693j {

        /* JADX INFO: renamed from: a */
        public final long f28970a;

        /* JADX INFO: renamed from: b */
        public final long f28971b;

        /* JADX INFO: renamed from: c */
        public final long f28972c;

        /* JADX INFO: renamed from: d */
        public final long f28973d;

        /* JADX INFO: renamed from: e */
        public final List<xa8<C4695l>> f28974e;

        /* JADX INFO: renamed from: da8$j$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f28975a;

            /* JADX INFO: renamed from: b */
            public long f28976b;

            /* JADX INFO: renamed from: c */
            public long f28977c;

            /* JADX INFO: renamed from: d */
            public long f28978d;

            /* JADX INFO: renamed from: e */
            public List<xa8<C4695l>> f28979e = new ArrayList();

            public a addListenSockets(List<xa8<C4695l>> list) {
                v7d.checkNotNull(list, "listenSockets");
                Iterator<xa8<C4695l>> it = list.iterator();
                while (it.hasNext()) {
                    this.f28979e.add((xa8) v7d.checkNotNull(it.next(), "null listen socket"));
                }
                return this;
            }

            public C4693j build() {
                return new C4693j(this.f28975a, this.f28976b, this.f28977c, this.f28978d, this.f28979e);
            }

            public a setCallsFailed(long j) {
                this.f28977c = j;
                return this;
            }

            public a setCallsStarted(long j) {
                this.f28975a = j;
                return this;
            }

            public a setCallsSucceeded(long j) {
                this.f28976b = j;
                return this;
            }

            public a setLastCallStartedNanos(long j) {
                this.f28978d = j;
                return this;
            }
        }

        public C4693j(long j, long j2, long j3, long j4, List<xa8<C4695l>> list) {
            this.f28970a = j;
            this.f28971b = j2;
            this.f28972c = j3;
            this.f28973d = j4;
            this.f28974e = (List) v7d.checkNotNull(list);
        }
    }

    /* JADX INFO: renamed from: da8$k */
    public static final class C4694k {

        /* JADX INFO: renamed from: a */
        public final Map<String, String> f28980a;

        /* JADX INFO: renamed from: b */
        @eib
        public final Integer f28981b;

        /* JADX INFO: renamed from: c */
        @eib
        public final Integer f28982c;

        /* JADX INFO: renamed from: d */
        @eib
        public final C4696m f28983d;

        /* JADX INFO: renamed from: da8$k$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final Map<String, String> f28984a = new HashMap();

            /* JADX INFO: renamed from: b */
            public C4696m f28985b;

            /* JADX INFO: renamed from: c */
            public Integer f28986c;

            /* JADX INFO: renamed from: d */
            public Integer f28987d;

            public a addOption(String str, String str2) {
                this.f28984a.put(str, (String) v7d.checkNotNull(str2));
                return this;
            }

            public C4694k build() {
                return new C4694k(this.f28986c, this.f28987d, this.f28985b, this.f28984a);
            }

            public a setSocketOptionLingerSeconds(Integer num) {
                this.f28987d = num;
                return this;
            }

            public a setSocketOptionTimeoutMillis(Integer num) {
                this.f28986c = num;
                return this;
            }

            public a setTcpInfo(C4696m c4696m) {
                this.f28985b = c4696m;
                return this;
            }

            public a addOption(String str, int i) {
                this.f28984a.put(str, Integer.toString(i));
                return this;
            }

            public a addOption(String str, boolean z) {
                this.f28984a.put(str, Boolean.toString(z));
                return this;
            }
        }

        public C4694k(@eib Integer num, @eib Integer num2, @eib C4696m c4696m, Map<String, String> map) {
            v7d.checkNotNull(map);
            this.f28981b = num;
            this.f28982c = num2;
            this.f28983d = c4696m;
            this.f28980a = Collections.unmodifiableMap(new HashMap(map));
        }
    }

    /* JADX INFO: renamed from: da8$l */
    public static final class C4695l {

        /* JADX INFO: renamed from: a */
        @eib
        public final C4698o f28988a;

        /* JADX INFO: renamed from: b */
        @eib
        public final SocketAddress f28989b;

        /* JADX INFO: renamed from: c */
        @eib
        public final SocketAddress f28990c;

        /* JADX INFO: renamed from: d */
        public final C4694k f28991d;

        /* JADX INFO: renamed from: e */
        @eib
        public final C4689f f28992e;

        public C4695l(C4698o c4698o, @eib SocketAddress socketAddress, @eib SocketAddress socketAddress2, C4694k c4694k, C4689f c4689f) {
            this.f28988a = c4698o;
            this.f28989b = (SocketAddress) v7d.checkNotNull(socketAddress, "local socket");
            this.f28990c = socketAddress2;
            this.f28991d = (C4694k) v7d.checkNotNull(c4694k);
            this.f28992e = c4689f;
        }
    }

    /* JADX INFO: renamed from: da8$m */
    public static final class C4696m {

        /* JADX INFO: renamed from: A */
        public final int f28993A;

        /* JADX INFO: renamed from: B */
        public final int f28994B;

        /* JADX INFO: renamed from: C */
        public final int f28995C;

        /* JADX INFO: renamed from: a */
        public final int f28996a;

        /* JADX INFO: renamed from: b */
        public final int f28997b;

        /* JADX INFO: renamed from: c */
        public final int f28998c;

        /* JADX INFO: renamed from: d */
        public final int f28999d;

        /* JADX INFO: renamed from: e */
        public final int f29000e;

        /* JADX INFO: renamed from: f */
        public final int f29001f;

        /* JADX INFO: renamed from: g */
        public final int f29002g;

        /* JADX INFO: renamed from: h */
        public final int f29003h;

        /* JADX INFO: renamed from: i */
        public final int f29004i;

        /* JADX INFO: renamed from: j */
        public final int f29005j;

        /* JADX INFO: renamed from: k */
        public final int f29006k;

        /* JADX INFO: renamed from: l */
        public final int f29007l;

        /* JADX INFO: renamed from: m */
        public final int f29008m;

        /* JADX INFO: renamed from: n */
        public final int f29009n;

        /* JADX INFO: renamed from: o */
        public final int f29010o;

        /* JADX INFO: renamed from: p */
        public final int f29011p;

        /* JADX INFO: renamed from: q */
        public final int f29012q;

        /* JADX INFO: renamed from: r */
        public final int f29013r;

        /* JADX INFO: renamed from: s */
        public final int f29014s;

        /* JADX INFO: renamed from: t */
        public final int f29015t;

        /* JADX INFO: renamed from: u */
        public final int f29016u;

        /* JADX INFO: renamed from: v */
        public final int f29017v;

        /* JADX INFO: renamed from: w */
        public final int f29018w;

        /* JADX INFO: renamed from: x */
        public final int f29019x;

        /* JADX INFO: renamed from: y */
        public final int f29020y;

        /* JADX INFO: renamed from: z */
        public final int f29021z;

        /* JADX INFO: renamed from: da8$m$a */
        public static final class a {

            /* JADX INFO: renamed from: A */
            public int f29022A;

            /* JADX INFO: renamed from: B */
            public int f29023B;

            /* JADX INFO: renamed from: C */
            public int f29024C;

            /* JADX INFO: renamed from: a */
            public int f29025a;

            /* JADX INFO: renamed from: b */
            public int f29026b;

            /* JADX INFO: renamed from: c */
            public int f29027c;

            /* JADX INFO: renamed from: d */
            public int f29028d;

            /* JADX INFO: renamed from: e */
            public int f29029e;

            /* JADX INFO: renamed from: f */
            public int f29030f;

            /* JADX INFO: renamed from: g */
            public int f29031g;

            /* JADX INFO: renamed from: h */
            public int f29032h;

            /* JADX INFO: renamed from: i */
            public int f29033i;

            /* JADX INFO: renamed from: j */
            public int f29034j;

            /* JADX INFO: renamed from: k */
            public int f29035k;

            /* JADX INFO: renamed from: l */
            public int f29036l;

            /* JADX INFO: renamed from: m */
            public int f29037m;

            /* JADX INFO: renamed from: n */
            public int f29038n;

            /* JADX INFO: renamed from: o */
            public int f29039o;

            /* JADX INFO: renamed from: p */
            public int f29040p;

            /* JADX INFO: renamed from: q */
            public int f29041q;

            /* JADX INFO: renamed from: r */
            public int f29042r;

            /* JADX INFO: renamed from: s */
            public int f29043s;

            /* JADX INFO: renamed from: t */
            public int f29044t;

            /* JADX INFO: renamed from: u */
            public int f29045u;

            /* JADX INFO: renamed from: v */
            public int f29046v;

            /* JADX INFO: renamed from: w */
            public int f29047w;

            /* JADX INFO: renamed from: x */
            public int f29048x;

            /* JADX INFO: renamed from: y */
            public int f29049y;

            /* JADX INFO: renamed from: z */
            public int f29050z;

            public C4696m build() {
                return new C4696m(this.f29025a, this.f29026b, this.f29027c, this.f29028d, this.f29029e, this.f29030f, this.f29031g, this.f29032h, this.f29033i, this.f29034j, this.f29035k, this.f29036l, this.f29037m, this.f29038n, this.f29039o, this.f29040p, this.f29041q, this.f29042r, this.f29043s, this.f29044t, this.f29045u, this.f29046v, this.f29047w, this.f29048x, this.f29049y, this.f29050z, this.f29022A, this.f29023B, this.f29024C);
            }

            public a setAdvmss(int i) {
                this.f29023B = i;
                return this;
            }

            public a setAto(int i) {
                this.f29034j = i;
                return this;
            }

            public a setBackoff(int i) {
                this.f29029e = i;
                return this;
            }

            public a setCaState(int i) {
                this.f29026b = i;
                return this;
            }

            public a setFackets(int i) {
                this.f29041q = i;
                return this;
            }

            public a setLastAckRecv(int i) {
                this.f29045u = i;
                return this;
            }

            public a setLastAckSent(int i) {
                this.f29043s = i;
                return this;
            }

            public a setLastDataRecv(int i) {
                this.f29044t = i;
                return this;
            }

            public a setLastDataSent(int i) {
                this.f29042r = i;
                return this;
            }

            public a setLost(int i) {
                this.f29039o = i;
                return this;
            }

            public a setOptions(int i) {
                this.f29030f = i;
                return this;
            }

            public a setPmtu(int i) {
                this.f29046v = i;
                return this;
            }

            public a setProbes(int i) {
                this.f29028d = i;
                return this;
            }

            public a setRcvMss(int i) {
                this.f29036l = i;
                return this;
            }

            public a setRcvSsthresh(int i) {
                this.f29047w = i;
                return this;
            }

            public a setRcvWscale(int i) {
                this.f29032h = i;
                return this;
            }

            public a setReordering(int i) {
                this.f29024C = i;
                return this;
            }

            public a setRetrans(int i) {
                this.f29040p = i;
                return this;
            }

            public a setRetransmits(int i) {
                this.f29027c = i;
                return this;
            }

            public a setRto(int i) {
                this.f29033i = i;
                return this;
            }

            public a setRtt(int i) {
                this.f29048x = i;
                return this;
            }

            public a setRttvar(int i) {
                this.f29049y = i;
                return this;
            }

            public a setSacked(int i) {
                this.f29038n = i;
                return this;
            }

            public a setSndCwnd(int i) {
                this.f29022A = i;
                return this;
            }

            public a setSndMss(int i) {
                this.f29035k = i;
                return this;
            }

            public a setSndSsthresh(int i) {
                this.f29050z = i;
                return this;
            }

            public a setSndWscale(int i) {
                this.f29031g = i;
                return this;
            }

            public a setState(int i) {
                this.f29025a = i;
                return this;
            }

            public a setUnacked(int i) {
                this.f29037m = i;
                return this;
            }
        }

        public C4696m(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
            this.f28996a = i;
            this.f28997b = i2;
            this.f28998c = i3;
            this.f28999d = i4;
            this.f29000e = i5;
            this.f29001f = i6;
            this.f29002g = i7;
            this.f29003h = i8;
            this.f29004i = i9;
            this.f29005j = i10;
            this.f29006k = i11;
            this.f29007l = i12;
            this.f29008m = i13;
            this.f29009n = i14;
            this.f29010o = i15;
            this.f29011p = i16;
            this.f29012q = i17;
            this.f29013r = i18;
            this.f29014s = i19;
            this.f29015t = i20;
            this.f29016u = i21;
            this.f29017v = i22;
            this.f29018w = i23;
            this.f29019x = i24;
            this.f29020y = i25;
            this.f29021z = i26;
            this.f28993A = i27;
            this.f28994B = i28;
            this.f28995C = i29;
        }
    }

    /* JADX INFO: renamed from: da8$o */
    @uw7
    public static final class C4698o {

        /* JADX INFO: renamed from: a */
        public final long f29054a;

        /* JADX INFO: renamed from: b */
        public final long f29055b;

        /* JADX INFO: renamed from: c */
        public final long f29056c;

        /* JADX INFO: renamed from: d */
        public final long f29057d;

        /* JADX INFO: renamed from: e */
        public final long f29058e;

        /* JADX INFO: renamed from: f */
        public final long f29059f;

        /* JADX INFO: renamed from: g */
        public final long f29060g;

        /* JADX INFO: renamed from: h */
        public final long f29061h;

        /* JADX INFO: renamed from: i */
        public final long f29062i;

        /* JADX INFO: renamed from: j */
        public final long f29063j;

        /* JADX INFO: renamed from: k */
        public final long f29064k;

        /* JADX INFO: renamed from: l */
        public final long f29065l;

        public C4698o(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
            this.f29054a = j;
            this.f29055b = j2;
            this.f29056c = j3;
            this.f29057d = j4;
            this.f29058e = j5;
            this.f29059f = j6;
            this.f29060g = j7;
            this.f29061h = j8;
            this.f29062i = j9;
            this.f29063j = j10;
            this.f29064k = j11;
            this.f29065l = j12;
        }
    }

    @gdi
    public da8() {
    }

    private static <T extends xa8<?>> void add(Map<Long, T> map, T t) {
        map.put(Long.valueOf(t.getLogId().getId()), t);
    }

    private static <T extends xa8<?>> boolean contains(Map<Long, T> map, cb8 cb8Var) {
        return map.containsKey(Long.valueOf(cb8Var.getId()));
    }

    private xa8<C4695l> getServerSocket(long j) {
        Iterator<C4691h> it = this.f28920e.values().iterator();
        while (it.hasNext()) {
            xa8<C4695l> xa8Var = it.next().get(Long.valueOf(j));
            if (xa8Var != null) {
                return xa8Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: id */
    public static long m9004id(ac8 ac8Var) {
        return ac8Var.getLogId().getId();
    }

    public static da8 instance() {
        return f28914g;
    }

    private static <T extends xa8<?>> void remove(Map<Long, T> map, T t) {
        map.remove(Long.valueOf(m9004id(t)));
    }

    public void addClientSocket(xa8<C4695l> xa8Var) {
        add(this.f28919d, xa8Var);
    }

    public void addListenSocket(xa8<C4695l> xa8Var) {
        add(this.f28919d, xa8Var);
    }

    public void addRootChannel(xa8<C4685b> xa8Var) {
        add(this.f28917b, xa8Var);
    }

    public void addServer(xa8<C4693j> xa8Var) {
        this.f28920e.put(Long.valueOf(m9004id(xa8Var)), new C4691h());
        add(this.f28916a, xa8Var);
    }

    public void addServerSocket(xa8<C4693j> xa8Var, xa8<C4695l> xa8Var2) {
        add(this.f28920e.get(Long.valueOf(m9004id(xa8Var))), xa8Var2);
    }

    public void addSubchannel(xa8<C4685b> xa8Var) {
        add(this.f28918c, xa8Var);
    }

    @gdi
    public boolean containsClientSocket(cb8 cb8Var) {
        return contains(this.f28919d, cb8Var);
    }

    @gdi
    public boolean containsServer(cb8 cb8Var) {
        return contains(this.f28916a, cb8Var);
    }

    @gdi
    public boolean containsSubchannel(cb8 cb8Var) {
        return contains(this.f28918c, cb8Var);
    }

    @eib
    public xa8<C4685b> getChannel(long j) {
        return this.f28917b.get(Long.valueOf(j));
    }

    public xa8<C4685b> getRootChannel(long j) {
        return this.f28917b.get(Long.valueOf(j));
    }

    public C4688e getRootChannels(long j, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<xa8<C4685b>> it = this.f28917b.tailMap(Long.valueOf(j)).values().iterator();
        while (it.hasNext() && arrayList.size() < i) {
            arrayList.add(it.next());
        }
        return new C4688e(arrayList, !it.hasNext());
    }

    @eib
    public xa8<C4693j> getServer(long j) {
        return this.f28916a.get(Long.valueOf(j));
    }

    @eib
    public C4692i getServerSockets(long j, long j2, int i) {
        C4691h c4691h = this.f28920e.get(Long.valueOf(j));
        if (c4691h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<xa8<C4695l>> it = c4691h.tailMap(Long.valueOf(j2)).values().iterator();
        while (arrayList.size() < i && it.hasNext()) {
            arrayList.add(it.next());
        }
        return new C4692i(arrayList, !it.hasNext());
    }

    public C4690g getServers(long j, int i) {
        ArrayList arrayList = new ArrayList(i);
        Iterator<xa8<C4693j>> it = this.f28916a.tailMap(Long.valueOf(j)).values().iterator();
        while (it.hasNext() && arrayList.size() < i) {
            arrayList.add(it.next());
        }
        return new C4690g(arrayList, !it.hasNext());
    }

    @eib
    public xa8<C4695l> getSocket(long j) {
        xa8<C4695l> xa8Var = this.f28919d.get(Long.valueOf(j));
        return xa8Var != null ? xa8Var : getServerSocket(j);
    }

    @eib
    public xa8<C4685b> getSubchannel(long j) {
        return this.f28918c.get(Long.valueOf(j));
    }

    public void removeClientSocket(xa8<C4695l> xa8Var) {
        remove(this.f28919d, xa8Var);
    }

    public void removeListenSocket(xa8<C4695l> xa8Var) {
        remove(this.f28919d, xa8Var);
    }

    public void removeRootChannel(xa8<C4685b> xa8Var) {
        remove(this.f28917b, xa8Var);
    }

    public void removeServer(xa8<C4693j> xa8Var) {
        remove(this.f28916a, xa8Var);
        this.f28920e.remove(Long.valueOf(m9004id(xa8Var)));
    }

    public void removeServerSocket(xa8<C4693j> xa8Var, xa8<C4695l> xa8Var2) {
        remove(this.f28920e.get(Long.valueOf(m9004id(xa8Var))), xa8Var2);
    }

    public void removeSubchannel(xa8<C4685b> xa8Var) {
        remove(this.f28918c, xa8Var);
    }

    /* JADX INFO: renamed from: da8$f */
    public static final class C4689f {

        /* JADX INFO: renamed from: a */
        @eib
        public final C4697n f28964a;

        /* JADX INFO: renamed from: b */
        @eib
        public final C4687d f28965b;

        public C4689f(C4697n c4697n) {
            this.f28964a = (C4697n) v7d.checkNotNull(c4697n);
            this.f28965b = null;
        }

        public C4689f(C4687d c4687d) {
            this.f28964a = null;
            this.f28965b = (C4687d) v7d.checkNotNull(c4687d);
        }
    }

    /* JADX INFO: renamed from: da8$n */
    @uw7
    public static final class C4697n {

        /* JADX INFO: renamed from: a */
        public final String f29051a;

        /* JADX INFO: renamed from: b */
        @eib
        public final Certificate f29052b;

        /* JADX INFO: renamed from: c */
        @eib
        public final Certificate f29053c;

        public C4697n(String str, Certificate certificate, Certificate certificate2) {
            this.f29051a = str;
            this.f29052b = certificate;
            this.f29053c = certificate2;
        }

        public C4697n(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                da8.f28913f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e);
            }
            this.f29051a = cipherSuite;
            this.f29052b = certificate2;
            this.f29053c = certificate;
        }
    }
}
