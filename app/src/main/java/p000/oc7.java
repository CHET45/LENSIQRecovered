package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.aaf;
import p000.da8;
import p000.fb8;
import p000.fta;
import p000.n4g;
import p000.p42;
import p000.q42;
import p000.r42;
import p000.rn1;
import p000.y5g;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
public final class oc7 {

    /* JADX INFO: renamed from: A */
    public static final long f67119A;

    /* JADX INFO: renamed from: B */
    public static final long f67120B = Long.MAX_VALUE;

    /* JADX INFO: renamed from: C */
    public static final long f67121C;

    /* JADX INFO: renamed from: D */
    public static final long f67122D;

    /* JADX INFO: renamed from: E */
    public static final long f67123E = Long.MAX_VALUE;

    /* JADX INFO: renamed from: F */
    public static final rid f67124F;

    /* JADX INFO: renamed from: G */
    public static final rid f67125G;

    /* JADX INFO: renamed from: H */
    public static final String f67126H = "pick_first";

    /* JADX INFO: renamed from: I */
    public static final rn1.C12165c<Boolean> f67127I;

    /* JADX INFO: renamed from: J */
    public static final q42 f67128J;

    /* JADX INFO: renamed from: K */
    public static final aaf.InterfaceC0124d<Executor> f67129K;

    /* JADX INFO: renamed from: L */
    public static final aaf.InterfaceC0124d<ScheduledExecutorService> f67130L;

    /* JADX INFO: renamed from: M */
    public static final lfg<d5g> f67131M;

    /* JADX INFO: renamed from: e */
    public static final fta.AbstractC5971i<String> f67136e;

    /* JADX INFO: renamed from: f */
    public static final fta.AbstractC5971i<byte[]> f67137f;

    /* JADX INFO: renamed from: g */
    public static final fta.AbstractC5971i<String> f67138g;

    /* JADX INFO: renamed from: h */
    public static final fta.AbstractC5971i<byte[]> f67139h;

    /* JADX INFO: renamed from: i */
    public static final fta.AbstractC5971i<String> f67140i;

    /* JADX INFO: renamed from: j */
    public static final fta.AbstractC5971i<String> f67141j;

    /* JADX INFO: renamed from: k */
    public static final fta.AbstractC5971i<String> f67142k;

    /* JADX INFO: renamed from: l */
    public static final fta.AbstractC5971i<String> f67143l;

    /* JADX INFO: renamed from: m */
    public static final int f67144m = 80;

    /* JADX INFO: renamed from: n */
    public static final int f67145n = 443;

    /* JADX INFO: renamed from: o */
    public static final String f67146o = "application/grpc";

    /* JADX INFO: renamed from: p */
    public static final String f67147p = "POST";

    /* JADX INFO: renamed from: q */
    public static final String f67148q = "trailers";

    /* JADX INFO: renamed from: s */
    public static final String f67150s = "grpc-encoding";

    /* JADX INFO: renamed from: t */
    public static final String f67151t = "grpc-accept-encoding";

    /* JADX INFO: renamed from: u */
    public static final String f67152u = "content-encoding";

    /* JADX INFO: renamed from: v */
    public static final String f67153v = "accept-encoding";

    /* JADX INFO: renamed from: w */
    public static final int f67154w = 4194304;

    /* JADX INFO: renamed from: x */
    public static final int f67155x = 8192;

    /* JADX INFO: renamed from: y */
    public static final azf f67156y;

    /* JADX INFO: renamed from: z */
    public static final String f67157z = "1.62.2";

    /* JADX INFO: renamed from: a */
    public static final Logger f67132a = Logger.getLogger(oc7.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Set<n4g.EnumC9694b> f67133b = Collections.unmodifiableSet(EnumSet.of(n4g.EnumC9694b.OK, n4g.EnumC9694b.INVALID_ARGUMENT, n4g.EnumC9694b.NOT_FOUND, n4g.EnumC9694b.ALREADY_EXISTS, n4g.EnumC9694b.FAILED_PRECONDITION, n4g.EnumC9694b.ABORTED, n4g.EnumC9694b.OUT_OF_RANGE, n4g.EnumC9694b.DATA_LOSS));

    /* JADX INFO: renamed from: c */
    public static final Charset f67134c = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: r */
    public static final String f67149r = "grpc-timeout";

    /* JADX INFO: renamed from: d */
    public static final fta.AbstractC5971i<Long> f67135d = fta.AbstractC5971i.m11174of(f67149r, new C10307k());

    /* JADX INFO: renamed from: oc7$a */
    public class C10297a implements rid {
        @Override // p000.rid
        @eib
        public qid proxyFor(SocketAddress socketAddress) {
            return null;
        }
    }

    /* JADX INFO: renamed from: oc7$b */
    public class C10298b extends q42 {
    }

    /* JADX INFO: renamed from: oc7$c */
    public class C10299c implements aaf.InterfaceC0124d<Executor> {

        /* JADX INFO: renamed from: a */
        public static final String f67158a = "grpc-default-executor";

        public String toString() {
            return f67158a;
        }

        @Override // p000.aaf.InterfaceC0124d
        public void close(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // p000.aaf.InterfaceC0124d
        public Executor create() {
            return Executors.newCachedThreadPool(oc7.getThreadFactory("grpc-default-executor-%d", true));
        }
    }

    /* JADX INFO: renamed from: oc7$d */
    public class C10300d implements aaf.InterfaceC0124d<ScheduledExecutorService> {
        @Override // p000.aaf.InterfaceC0124d
        public void close(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // p000.aaf.InterfaceC0124d
        public ScheduledExecutorService create() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, oc7.getThreadFactory("grpc-timer-%d", true));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    /* JADX INFO: renamed from: oc7$e */
    public class C10301e implements lfg<d5g> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.lfg
        public d5g get() {
            return d5g.createUnstarted();
        }
    }

    /* JADX INFO: renamed from: oc7$f */
    public class C10302f implements r42 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ q42.AbstractC11305a f67159a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ r42 f67160b;

        public C10302f(q42.AbstractC11305a abstractC11305a, r42 r42Var) {
            this.f67159a = abstractC11305a;
            this.f67160b = r42Var;
        }

        @Override // p000.ac8
        public cb8 getLogId() {
            return this.f67160b.getLogId();
        }

        @Override // p000.xa8
        public ja9<da8.C4695l> getStats() {
            return this.f67160b.getStats();
        }

        @Override // p000.r42
        public o42 newStream(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr) {
            q42 q42VarNewClientStreamTracer = this.f67159a.newClientStreamTracer(q42.C11306b.newBuilder().setCallOptions(rn1Var).build(), ftaVar);
            v7d.checkState(q42VarArr[q42VarArr.length - 1] == oc7.f67128J, "lb tracer already assigned");
            q42VarArr[q42VarArr.length - 1] = q42VarNewClientStreamTracer;
            return this.f67160b.newStream(ruaVar, ftaVar, rn1Var, q42VarArr);
        }

        @Override // p000.r42
        public void ping(r42.InterfaceC11878a interfaceC11878a, Executor executor) {
            this.f67160b.ping(interfaceC11878a, executor);
        }
    }

    /* JADX INFO: renamed from: oc7$g */
    public static final class C10303g implements fb8.InterfaceC5712a<byte[]> {
        private C10303g() {
        }

        public /* synthetic */ C10303g(C10297a c10297a) {
            this();
        }

        @Override // p000.fta.InterfaceC5975m
        public byte[] parseAsciiString(byte[] bArr) {
            return bArr;
        }

        @Override // p000.fta.InterfaceC5975m
        public byte[] toAsciiString(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX INFO: renamed from: oc7$h */
    public static class C10304h {

        /* JADX INFO: renamed from: a */
        public static final char[] f67161a = "0123456789ABCDEF".toCharArray();

        /* JADX INFO: renamed from: b */
        public static final Set<Character> f67162b = Collections.unmodifiableSet(new HashSet(Arrays.asList('-', '_', Character.valueOf(a18.f100c), '~')));

        /* JADX INFO: renamed from: c */
        public static final Set<Character> f67163c = Collections.unmodifiableSet(new HashSet(Arrays.asList('!', Character.valueOf(xnh.f98712c), '&', '\'', '(', ')', '*', '+', Character.valueOf(C4584d2.f28238g), ';', '=')));

        /* JADX INFO: renamed from: d */
        public static final Set<Character> f67164d = Collections.unmodifiableSet(new HashSet(Arrays.asList(':', Character.valueOf(C4584d2.f28242k), Character.valueOf(C4584d2.f28243l), '@')));

        public static String encodeAuthority(String str) {
            v7d.checkNotNull(str, "authority");
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (shouldEscape(str.charAt(i2))) {
                    i++;
                }
            }
            if (i == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((i * 2) + length);
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if (shouldEscape(cCharAt)) {
                    sb.append('%');
                    char[] cArr = f67161a;
                    sb.append(cArr[cCharAt >>> 4]);
                    sb.append(cArr[cCharAt & 15]);
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        }

        private static boolean shouldEscape(char c) {
            if (c > 127) {
                return false;
            }
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
                return ((c >= '0' && c <= '9') || f67162b.contains(Character.valueOf(c)) || f67163c.contains(Character.valueOf(c)) || f67164d.contains(Character.valueOf(c))) ? false : true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: oc7$i */
    @uw7
    public static final class C10305i {

        /* JADX INFO: renamed from: a */
        public final String f67165a;

        /* JADX INFO: renamed from: b */
        public final String f67166b;

        public /* synthetic */ C10305i(String str, String str2, C10297a c10297a) {
            this(str, str2);
        }

        public String getImplementationVersion() {
            return this.f67166b;
        }

        public String getUserAgent() {
            return this.f67165a;
        }

        public String toString() {
            return this.f67165a + C2473f.f17566z + this.f67166b;
        }

        private C10305i(String str, String str2) {
            this.f67165a = (String) v7d.checkNotNull(str, "userAgentName");
            this.f67166b = (String) v7d.checkNotNull(str2, "implementationVersion");
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: oc7$j */
    public static final class EnumC10306j {

        /* JADX INFO: renamed from: C */
        public static final EnumC10306j f67167C;

        /* JADX INFO: renamed from: F */
        public static final EnumC10306j f67168F;

        /* JADX INFO: renamed from: H */
        public static final EnumC10306j f67169H;

        /* JADX INFO: renamed from: L */
        public static final EnumC10306j f67170L;

        /* JADX INFO: renamed from: M */
        public static final EnumC10306j f67171M;

        /* JADX INFO: renamed from: M1 */
        public static final /* synthetic */ EnumC10306j[] f67172M1;

        /* JADX INFO: renamed from: N */
        public static final EnumC10306j f67173N;

        /* JADX INFO: renamed from: Q */
        public static final EnumC10306j f67174Q;

        /* JADX INFO: renamed from: X */
        public static final EnumC10306j f67175X;

        /* JADX INFO: renamed from: Y */
        public static final EnumC10306j f67176Y;

        /* JADX INFO: renamed from: Z */
        public static final EnumC10306j[] f67177Z;

        /* JADX INFO: renamed from: c */
        public static final EnumC10306j f67178c;

        /* JADX INFO: renamed from: d */
        public static final EnumC10306j f67179d;

        /* JADX INFO: renamed from: e */
        public static final EnumC10306j f67180e;

        /* JADX INFO: renamed from: f */
        public static final EnumC10306j f67181f;

        /* JADX INFO: renamed from: m */
        public static final EnumC10306j f67182m;

        /* JADX INFO: renamed from: a */
        public final int f67183a;

        /* JADX INFO: renamed from: b */
        public final n4g f67184b;

        static {
            n4g n4gVar = n4g.f63273t;
            EnumC10306j enumC10306j = new EnumC10306j("NO_ERROR", 0, 0, n4gVar);
            f67178c = enumC10306j;
            n4g n4gVar2 = n4g.f63272s;
            EnumC10306j enumC10306j2 = new EnumC10306j("PROTOCOL_ERROR", 1, 1, n4gVar2);
            f67179d = enumC10306j2;
            EnumC10306j enumC10306j3 = new EnumC10306j("INTERNAL_ERROR", 2, 2, n4gVar2);
            f67180e = enumC10306j3;
            EnumC10306j enumC10306j4 = new EnumC10306j("FLOW_CONTROL_ERROR", 3, 3, n4gVar2);
            f67181f = enumC10306j4;
            EnumC10306j enumC10306j5 = new EnumC10306j("SETTINGS_TIMEOUT", 4, 4, n4gVar2);
            f67182m = enumC10306j5;
            EnumC10306j enumC10306j6 = new EnumC10306j("STREAM_CLOSED", 5, 5, n4gVar2);
            f67167C = enumC10306j6;
            EnumC10306j enumC10306j7 = new EnumC10306j("FRAME_SIZE_ERROR", 6, 6, n4gVar2);
            f67168F = enumC10306j7;
            EnumC10306j enumC10306j8 = new EnumC10306j("REFUSED_STREAM", 7, 7, n4gVar);
            f67169H = enumC10306j8;
            EnumC10306j enumC10306j9 = new EnumC10306j("CANCEL", 8, 8, n4g.f63259f);
            f67170L = enumC10306j9;
            EnumC10306j enumC10306j10 = new EnumC10306j("COMPRESSION_ERROR", 9, 9, n4gVar2);
            f67171M = enumC10306j10;
            EnumC10306j enumC10306j11 = new EnumC10306j("CONNECT_ERROR", 10, 10, n4gVar2);
            f67173N = enumC10306j11;
            EnumC10306j enumC10306j12 = new EnumC10306j("ENHANCE_YOUR_CALM", 11, 11, n4g.f63267n.withDescription("Bandwidth exhausted"));
            f67174Q = enumC10306j12;
            EnumC10306j enumC10306j13 = new EnumC10306j("INADEQUATE_SECURITY", 12, 12, n4g.f63265l.withDescription("Permission denied as protocol is not secure enough to call"));
            f67175X = enumC10306j13;
            EnumC10306j enumC10306j14 = new EnumC10306j("HTTP_1_1_REQUIRED", 13, 13, n4g.f63260g);
            f67176Y = enumC10306j14;
            f67172M1 = new EnumC10306j[]{enumC10306j, enumC10306j2, enumC10306j3, enumC10306j4, enumC10306j5, enumC10306j6, enumC10306j7, enumC10306j8, enumC10306j9, enumC10306j10, enumC10306j11, enumC10306j12, enumC10306j13, enumC10306j14};
            f67177Z = buildHttp2CodeMap();
        }

        private EnumC10306j(String str, int i, int i2, n4g n4gVar) {
            this.f67183a = i2;
            String str2 = "HTTP/2 error code: " + name();
            if (n4gVar.getDescription() != null) {
                str2 = str2 + " (" + n4gVar.getDescription() + c0b.f15434d;
            }
            this.f67184b = n4gVar.withDescription(str2);
        }

        private static EnumC10306j[] buildHttp2CodeMap() {
            EnumC10306j[] enumC10306jArrValues = values();
            EnumC10306j[] enumC10306jArr = new EnumC10306j[((int) enumC10306jArrValues[enumC10306jArrValues.length - 1].code()) + 1];
            for (EnumC10306j enumC10306j : enumC10306jArrValues) {
                enumC10306jArr[(int) enumC10306j.code()] = enumC10306j;
            }
            return enumC10306jArr;
        }

        public static EnumC10306j forCode(long j) {
            EnumC10306j[] enumC10306jArr = f67177Z;
            if (j >= enumC10306jArr.length || j < 0) {
                return null;
            }
            return enumC10306jArr[(int) j];
        }

        public static n4g statusForCode(long j) {
            EnumC10306j enumC10306jForCode = forCode(j);
            if (enumC10306jForCode != null) {
                return enumC10306jForCode.status();
            }
            return n4g.fromCodeValue(f67180e.status().getCode().value()).withDescription("Unrecognized HTTP/2 error code: " + j);
        }

        public static EnumC10306j valueOf(String str) {
            return (EnumC10306j) Enum.valueOf(EnumC10306j.class, str);
        }

        public static EnumC10306j[] values() {
            return (EnumC10306j[]) f67172M1.clone();
        }

        public long code() {
            return this.f67183a;
        }

        public n4g status() {
            return this.f67184b;
        }
    }

    /* JADX INFO: renamed from: oc7$k */
    @gdi
    public static class C10307k implements fta.InterfaceC5967e<Long> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.fta.InterfaceC5967e
        public Long parseAsciiString(String str) {
            v7d.checkArgument(str.length() > 0, "empty timeout");
            v7d.checkArgument(str.length() <= 9, "bad timeout format");
            long j = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j));
            }
            if (cCharAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
            }
            if (cCharAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
            }
            if (cCharAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
            }
            if (cCharAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
            }
            if (cCharAt == 'n') {
                return Long.valueOf(j);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
        }

        @Override // p000.fta.InterfaceC5967e
        public String toAsciiString(Long l) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l.longValue() < 100000000) {
                return l + "n";
            }
            if (l.longValue() < 100000000000L) {
                return timeUnit.toMicros(l.longValue()) + "u";
            }
            if (l.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l.longValue()) + "m";
            }
            if (l.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l.longValue()) + k95.f53020R4;
            }
            if (l.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l.longValue()) + "M";
            }
            return timeUnit.toHours(l.longValue()) + "H";
        }
    }

    static {
        fta.InterfaceC5967e<String> interfaceC5967e = fta.f37690f;
        f67136e = fta.AbstractC5971i.m11174of(f67150s, interfaceC5967e);
        C10297a c10297a = null;
        f67137f = fb8.keyOf(f67151t, new C10303g(c10297a));
        f67138g = fta.AbstractC5971i.m11174of(f67152u, interfaceC5967e);
        f67139h = fb8.keyOf(f67153v, new C10303g(c10297a));
        f67140i = fta.AbstractC5971i.m11174of("content-length", interfaceC5967e);
        f67141j = fta.AbstractC5971i.m11174of("content-type", interfaceC5967e);
        f67142k = fta.AbstractC5971i.m11174of("te", interfaceC5967e);
        f67143l = fta.AbstractC5971i.m11174of("user-agent", interfaceC5967e);
        f67156y = azf.m2775on(C4584d2.f28238g).trimResults();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f67119A = timeUnit.toNanos(20L);
        f67121C = TimeUnit.HOURS.toNanos(2L);
        f67122D = timeUnit.toNanos(20L);
        f67124F = new sid();
        f67125G = new C10297a();
        f67127I = rn1.C12165c.create("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f67128J = new C10298b();
        f67129K = new C10299c();
        f67130L = new C10300d();
        f67131M = new C10301e();
    }

    private oc7() {
    }

    public static String authorityFromHostAndPort(String str, int i) {
        try {
            return new URI(null, null, str, i, null, null, null).getAuthority();
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid host or port: " + str + C2473f.f17566z + i, e);
        }
    }

    public static URI authorityToUri(String str) {
        v7d.checkNotNull(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid authority: " + str, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18574b(y5g.InterfaceC15496a interfaceC15496a) {
        while (true) {
            InputStream next = interfaceC15496a.next();
            if (next == null) {
                return;
            } else {
                closeQuietly(next);
            }
        }
    }

    @eib
    /* JADX INFO: renamed from: c */
    public static r42 m18575c(zb9.C16070g c16070g, boolean z) {
        zb9.AbstractC16073j subchannel = c16070g.getSubchannel();
        r42 r42VarObtainActiveTransport = subchannel != null ? ((jhh) subchannel.getInternalSubchannel()).obtainActiveTransport() : null;
        if (r42VarObtainActiveTransport != null) {
            q42.AbstractC11305a streamTracerFactory = c16070g.getStreamTracerFactory();
            return streamTracerFactory == null ? r42VarObtainActiveTransport : new C10302f(streamTracerFactory, r42VarObtainActiveTransport);
        }
        if (!c16070g.getStatus().isOk()) {
            if (c16070g.isDrop()) {
                return new ep5(replaceInappropriateControlPlaneStatus(c16070g.getStatus()), p42.EnumC10788a.DROPPED);
            }
            if (!z) {
                return new ep5(replaceInappropriateControlPlaneStatus(c16070g.getStatus()), p42.EnumC10788a.PROCESSED);
            }
        }
        return null;
    }

    public static String checkAuthority(String str) {
        v7d.checkArgument(authorityToUri(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    public static void closeQuietly(@eib Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            f67132a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T> boolean m18576d(Iterable<T> iterable, T t) {
        if (iterable instanceof Collection) {
            try {
                return ((Collection) iterable).contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            if (okb.equal(it.next(), t)) {
                return true;
            }
        }
        return false;
    }

    public static void exhaust(InputStream inputStream) throws IOException {
        while (inputStream.read(new byte[256]) != -1) {
        }
    }

    public static q42[] getClientStreamTracers(rn1 rn1Var, fta ftaVar, int i, boolean z) {
        List<q42.AbstractC11305a> streamTracerFactories = rn1Var.getStreamTracerFactories();
        int size = streamTracerFactories.size();
        q42[] q42VarArr = new q42[size + 1];
        q42.C11306b c11306bBuild = q42.C11306b.newBuilder().setCallOptions(rn1Var).setPreviousAttempts(i).setIsTransparentRetry(z).build();
        for (int i2 = 0; i2 < streamTracerFactories.size(); i2++) {
            q42VarArr[i2] = streamTracerFactories.get(i2).newClientStreamTracer(c11306bBuild, ftaVar);
        }
        q42VarArr[size] = f67128J;
        return q42VarArr;
    }

    public static boolean getFlag(String str, boolean z) {
        String property = System.getenv(str);
        if (property == null) {
            property = System.getProperty(str);
        }
        return z ? u8g.isNullOrEmpty(property) || Boolean.parseBoolean(property) : !u8g.isNullOrEmpty(property) && Boolean.parseBoolean(property);
    }

    public static C10305i getGrpcBuildVersion() {
        return new C10305i("gRPC Java", f67157z, null);
    }

    public static String getGrpcUserAgent(String str, @eib String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append(f67157z);
        return sb.toString();
    }

    public static String getHost(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory getThreadFactory(String str, boolean z) {
        return new txg().setDaemon(z).setNameFormat(str).build();
    }

    private static n4g.EnumC9694b httpStatusToGrpcCode(int i) {
        if (i >= 100 && i < 200) {
            return n4g.EnumC9694b.INTERNAL;
        }
        if (i != 400) {
            if (i == 401) {
                return n4g.EnumC9694b.UNAUTHENTICATED;
            }
            if (i == 403) {
                return n4g.EnumC9694b.PERMISSION_DENIED;
            }
            if (i == 404) {
                return n4g.EnumC9694b.UNIMPLEMENTED;
            }
            if (i != 429) {
                if (i != 431) {
                    switch (i) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return n4g.EnumC9694b.UNKNOWN;
                    }
                }
            }
            return n4g.EnumC9694b.UNAVAILABLE;
        }
        return n4g.EnumC9694b.INTERNAL;
    }

    public static n4g httpStatusToGrpcStatus(int i) {
        return httpStatusToGrpcCode(i).toStatus().withDescription("HTTP status code " + i);
    }

    public static boolean isGrpcContentType(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.startsWith(f67146o)) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char cCharAt = lowerCase.charAt(16);
        return cCharAt == '+' || cCharAt == ';';
    }

    public static n4g replaceInappropriateControlPlaneStatus(n4g n4gVar) {
        v7d.checkArgument(n4gVar != null);
        if (!f67133b.contains(n4gVar.getCode())) {
            return n4gVar;
        }
        return n4g.f63272s.withDescription("Inappropriate status code from control plane: " + n4gVar.getCode() + C2473f.f17566z + n4gVar.getDescription()).withCause(n4gVar.getCause());
    }

    public static boolean shouldBeCountedForInUse(rn1 rn1Var) {
        return !Boolean.TRUE.equals(rn1Var.getOption(f67127I));
    }
}
