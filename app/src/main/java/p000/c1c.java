package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Header;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.opencv.videoio.Videoio;
import p000.da8;
import p000.gv6;
import p000.i75;
import p000.i8c;
import p000.k0c;
import p000.n4g;
import p000.oc7;
import p000.rhh;
import p000.u0c;
import p000.vp8;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
public final class c1c implements c4f, i75.InterfaceC7171a, i8c.InterfaceC7187d {

    /* JADX INFO: renamed from: C */
    public static final int f15463C = 4369;

    /* JADX INFO: renamed from: E */
    public static final int f15465E = 57005;

    /* JADX INFO: renamed from: a */
    public final C2152b f15479a;

    /* JADX INFO: renamed from: c */
    public final rhh f15481c;

    /* JADX INFO: renamed from: d */
    public final cb8 f15482d;

    /* JADX INFO: renamed from: e */
    public Socket f15483e;

    /* JADX INFO: renamed from: f */
    public e4f f15484f;

    /* JADX INFO: renamed from: g */
    public Executor f15485g;

    /* JADX INFO: renamed from: h */
    public ScheduledExecutorService f15486h;

    /* JADX INFO: renamed from: i */
    public sc0 f15487i;

    /* JADX INFO: renamed from: j */
    public vp8 f15488j;

    /* JADX INFO: renamed from: k */
    public h4a f15489k;

    /* JADX INFO: renamed from: l */
    public ScheduledFuture<?> f15490l;

    /* JADX INFO: renamed from: m */
    public final up8 f15491m;

    /* JADX INFO: renamed from: o */
    @vc7("lock")
    public boolean f15493o;

    /* JADX INFO: renamed from: p */
    @vc7("lock")
    public boolean f15494p;

    /* JADX INFO: renamed from: q */
    @vc7("lock")
    public boolean f15495q;

    /* JADX INFO: renamed from: r */
    @vc7("lock")
    public da8.C4689f f15496r;

    /* JADX INFO: renamed from: s */
    @vc7("lock")
    public i75 f15497s;

    /* JADX INFO: renamed from: t */
    @vc7("lock")
    public i8c f15498t;

    /* JADX INFO: renamed from: v */
    @vc7("lock")
    public int f15500v;

    /* JADX INFO: renamed from: x */
    @vc7("lock")
    public n4g f15502x;

    /* JADX INFO: renamed from: y */
    @vc7("lock")
    public ScheduledFuture<?> f15503y;

    /* JADX INFO: renamed from: z */
    @vc7("lock")
    public ScheduledFuture<?> f15504z;

    /* JADX INFO: renamed from: B */
    public static final Logger f15462B = Logger.getLogger(c1c.class.getName());

    /* JADX INFO: renamed from: D */
    public static final long f15464D = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: F */
    public static final ByteString f15466F = ByteString.encodeUtf8(Header.TARGET_METHOD_UTF8);

    /* JADX INFO: renamed from: G */
    public static final ByteString f15467G = ByteString.encodeUtf8("CONNECT");

    /* JADX INFO: renamed from: H */
    public static final ByteString f15468H = ByteString.encodeUtf8("POST");

    /* JADX INFO: renamed from: I */
    public static final ByteString f15469I = ByteString.encodeUtf8(Header.TARGET_SCHEME_UTF8);

    /* JADX INFO: renamed from: J */
    public static final ByteString f15470J = ByteString.encodeUtf8(Header.TARGET_PATH_UTF8);

    /* JADX INFO: renamed from: K */
    public static final ByteString f15471K = ByteString.encodeUtf8(Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: L */
    public static final ByteString f15472L = ByteString.encodeUtf8("connection");

    /* JADX INFO: renamed from: M */
    public static final ByteString f15473M = ByteString.encodeUtf8("host");

    /* JADX INFO: renamed from: N */
    public static final ByteString f15474N = ByteString.encodeUtf8("te");

    /* JADX INFO: renamed from: O */
    public static final ByteString f15475O = ByteString.encodeUtf8(oc7.f67148q);

    /* JADX INFO: renamed from: P */
    public static final ByteString f15476P = ByteString.encodeUtf8("content-type");

    /* JADX INFO: renamed from: Q */
    public static final ByteString f15477Q = ByteString.encodeUtf8("content-length");

    /* JADX INFO: renamed from: b */
    public final v2i f15480b = new um7();

    /* JADX INFO: renamed from: n */
    public final Object f15492n = new Object();

    /* JADX INFO: renamed from: u */
    @vc7("lock")
    public final Map<Integer, InterfaceC2156f> f15499u = new TreeMap();

    /* JADX INFO: renamed from: w */
    @vc7("lock")
    public int f15501w = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: A */
    @vc7("lock")
    public Long f15478A = null;

    /* JADX INFO: renamed from: c1c$a */
    public class C2151a extends xr6 {
        public C2151a(kv6 kv6Var) {
            super(kv6Var);
        }

        @Override // p000.xr6, p000.kv6
        public void data(boolean z, int i, Buffer buffer, int i2) throws IOException {
            c1c.this.f15491m.resetCounters();
            super.data(z, i, buffer, i2);
        }

        @Override // p000.xr6, p000.kv6
        public void headers(int i, List<ei7> list) throws IOException {
            c1c.this.f15491m.resetCounters();
            super.headers(i, list);
        }

        @Override // p000.xr6, p000.kv6
        public void synReply(boolean z, int i, List<ei7> list) throws IOException {
            c1c.this.f15491m.resetCounters();
            super.synReply(z, i, list);
        }
    }

    /* JADX INFO: renamed from: c1c$b */
    public static final class C2152b {

        /* JADX INFO: renamed from: a */
        public final List<? extends y3f.AbstractC15412a> f15506a;

        /* JADX INFO: renamed from: b */
        public final gkb<Executor> f15507b;

        /* JADX INFO: renamed from: c */
        public final gkb<ScheduledExecutorService> f15508c;

        /* JADX INFO: renamed from: d */
        public final rhh.C12098b f15509d;

        /* JADX INFO: renamed from: e */
        public final we7 f15510e;

        /* JADX INFO: renamed from: f */
        public final long f15511f;

        /* JADX INFO: renamed from: g */
        public final long f15512g;

        /* JADX INFO: renamed from: h */
        public final int f15513h;

        /* JADX INFO: renamed from: i */
        public final int f15514i;

        /* JADX INFO: renamed from: j */
        public final int f15515j;

        /* JADX INFO: renamed from: k */
        public final long f15516k;

        /* JADX INFO: renamed from: l */
        public final boolean f15517l;

        /* JADX INFO: renamed from: m */
        public final long f15518m;

        /* JADX INFO: renamed from: n */
        public final long f15519n;

        /* JADX INFO: renamed from: o */
        public final long f15520o;

        public C2152b(s0c s0cVar, List<? extends y3f.AbstractC15412a> list) {
            this.f15506a = (List) v7d.checkNotNull(list, "streamTracerFactories");
            this.f15507b = (gkb) v7d.checkNotNull(s0cVar.f80327e, "transportExecutorPool");
            this.f15508c = (gkb) v7d.checkNotNull(s0cVar.f80328f, "scheduledExecutorServicePool");
            this.f15509d = (rhh.C12098b) v7d.checkNotNull(s0cVar.f80326d, "transportTracerFactory");
            this.f15510e = (we7) v7d.checkNotNull(s0cVar.f80325c, "handshakerSocketFactory");
            this.f15511f = s0cVar.f80330h;
            this.f15512g = s0cVar.f80331i;
            this.f15513h = s0cVar.f80332j;
            this.f15514i = s0cVar.f80334l;
            this.f15515j = s0cVar.f80333k;
            this.f15516k = s0cVar.f80335m;
            this.f15517l = s0cVar.f80336n;
            this.f15518m = s0cVar.f80337o;
            this.f15519n = s0cVar.f80338p;
            this.f15520o = s0cVar.f80339q;
        }
    }

    /* JADX INFO: renamed from: c1c$c */
    public class RunnableC2153c implements gv6.InterfaceC6593a, Runnable {

        /* JADX INFO: renamed from: a */
        public final k0c f15521a = new k0c(Level.FINE, (Class<?>) c1c.class);

        /* JADX INFO: renamed from: b */
        public final gv6 f15522b;

        /* JADX INFO: renamed from: c */
        public boolean f15523c;

        /* JADX INFO: renamed from: d */
        public int f15524d;

        public RunnableC2153c(gv6 gv6Var) {
            this.f15522b = gv6Var;
        }

        private void connectionError(w45 w45Var, String str) {
            c1c.this.abruptShutdown(w45Var, str, oc7.EnumC10306j.statusForCode(w45Var.f93214a).withDescription(String.format("HTTP2 connection error: %s '%s'", w45Var, str)), false);
        }

        private int headerBlockSize(List<ei7> list) {
            long size = 0;
            for (int i = 0; i < list.size(); i++) {
                ei7 ei7Var = list.get(i);
                size += (long) (ei7Var.f33074a.size() + 32 + ei7Var.f33075b.size());
            }
            return (int) Math.min(size, 2147483647L);
        }

        private void respondWithGrpcError(int i, boolean z, n4g.EnumC9694b enumC9694b, String str) {
            fta ftaVar = new fta();
            ftaVar.put(tb8.f84152b, enumC9694b.toStatus());
            ftaVar.put(tb8.f84151a, str);
            List<ei7> listCreateResponseTrailers = ji7.createResponseTrailers(ftaVar, false);
            synchronized (c1c.this.f15492n) {
                try {
                    c1c.this.f15497s.synReply(true, i, listCreateResponseTrailers);
                    if (!z) {
                        c1c.this.f15497s.rstStream(i, w45.NO_ERROR);
                    }
                    c1c.this.f15497s.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void respondWithHttpError(int i, boolean z, int i2, n4g.EnumC9694b enumC9694b, String str) {
            fta ftaVar = new fta();
            ftaVar.put(tb8.f84152b, enumC9694b.toStatus());
            ftaVar.put(tb8.f84151a, str);
            List<ei7> listCreateHttpResponseHeaders = ji7.createHttpResponseHeaders(i2, "text/plain; charset=utf-8", ftaVar);
            Buffer bufferWriteUtf8 = new Buffer().writeUtf8(str);
            synchronized (c1c.this.f15492n) {
                try {
                    final C2154d c2154d = new C2154d(i, c1c.this.f15492n, c1c.this.f15498t, c1c.this.f15479a.f15513h);
                    if (c1c.this.f15499u.isEmpty()) {
                        c1c.this.f15491m.onTransportActive();
                        if (c1c.this.f15489k != null) {
                            c1c.this.f15489k.onTransportActive();
                        }
                    }
                    c1c.this.f15499u.put(Integer.valueOf(i), c2154d);
                    if (z) {
                        c2154d.inboundDataReceived(new Buffer(), 0, 0, true);
                    }
                    c1c.this.f15497s.headers(i, listCreateHttpResponseHeaders);
                    c1c.this.f15498t.data(true, c2154d.getOutboundFlowState(), bufferWriteUtf8, true);
                    c1c.this.f15498t.notifyWhenNoPendingData(c2154d.getOutboundFlowState(), new Runnable() { // from class: d1c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f28223a.lambda$respondWithHttpError$0(c2154d);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: rstOkAtEndOfHttpError, reason: merged with bridge method [inline-methods] */
        public void lambda$respondWithHttpError$0(C2154d c2154d) {
            synchronized (c1c.this.f15492n) {
                try {
                    if (!c2154d.hasReceivedEndOfStream()) {
                        c1c.this.f15497s.rstStream(c2154d.f15526a, w45.NO_ERROR);
                    }
                    c1c.this.m3627S(c2154d.f15526a, true);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void streamError(int i, w45 w45Var, String str) {
            if (w45Var == w45.PROTOCOL_ERROR) {
                c1c.f15462B.log(Level.FINE, "Responding with RST_STREAM {0}: {1}", new Object[]{w45Var, str});
            }
            synchronized (c1c.this.f15492n) {
                try {
                    c1c.this.f15497s.rstStream(i, w45Var);
                    c1c.this.f15497s.flush();
                    InterfaceC2156f interfaceC2156f = (InterfaceC2156f) c1c.this.f15499u.get(Integer.valueOf(i));
                    if (interfaceC2156f != null) {
                        interfaceC2156f.transportReportStatus(n4g.f63272s.withDescription(String.format("Responded with RST_STREAM %s: %s", w45Var, str)));
                        c1c.this.m3627S(i, false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void ackSettings() {
        }

        @Override // p000.gv6.InterfaceC6593a
        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j) {
        }

        @Override // p000.gv6.InterfaceC6593a
        public void data(boolean z, int i, BufferedSource bufferedSource, int i2, int i3) throws IOException {
            this.f15521a.m14427a(k0c.EnumC8155a.INBOUND, i, bufferedSource.getBuffer(), i2, z);
            if (i == 0) {
                connectionError(w45.PROTOCOL_ERROR, "Stream 0 is reserved for control messages. RFC7540 section 5.1.1");
                return;
            }
            if ((i & 1) == 0) {
                connectionError(w45.PROTOCOL_ERROR, "Clients cannot open even numbered streams. RFC7540 section 5.1.1");
                return;
            }
            long j = i2;
            bufferedSource.require(j);
            synchronized (c1c.this.f15492n) {
                try {
                    InterfaceC2156f interfaceC2156f = (InterfaceC2156f) c1c.this.f15499u.get(Integer.valueOf(i));
                    if (interfaceC2156f == null) {
                        bufferedSource.skip(j);
                        streamError(i, w45.STREAM_CLOSED, "Received data for closed stream");
                        return;
                    }
                    if (interfaceC2156f.hasReceivedEndOfStream()) {
                        bufferedSource.skip(j);
                        streamError(i, w45.STREAM_CLOSED, "Received DATA for half-closed (remote) stream. RFC7540 section 5.1");
                        return;
                    }
                    if (interfaceC2156f.inboundWindowAvailable() < i3) {
                        bufferedSource.skip(j);
                        streamError(i, w45.FLOW_CONTROL_ERROR, "Received DATA size exceeded window size. RFC7540 section 6.9");
                        return;
                    }
                    Buffer buffer = new Buffer();
                    buffer.write(bufferedSource.getBuffer(), j);
                    interfaceC2156f.inboundDataReceived(buffer, i2, i3 - i2, z);
                    int i4 = this.f15524d + i3;
                    this.f15524d = i4;
                    if (i4 >= c1c.this.f15479a.f15513h * 0.5f) {
                        synchronized (c1c.this.f15492n) {
                            c1c.this.f15497s.windowUpdate(0, this.f15524d);
                            c1c.this.f15497s.flush();
                        }
                        this.f15524d = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void goAway(int i, w45 w45Var, ByteString byteString) {
            this.f15521a.m14428b(k0c.EnumC8155a.INBOUND, i, w45Var, byteString);
            n4g n4gVarWithDescription = oc7.EnumC10306j.statusForCode(w45Var.f93214a).withDescription(String.format("Received GOAWAY: %s '%s'", w45Var, byteString.utf8()));
            if (!w45.NO_ERROR.equals(w45Var)) {
                c1c.f15462B.log(Level.WARNING, "Received GOAWAY: {0} {1}", new Object[]{w45Var, byteString.utf8()});
            }
            synchronized (c1c.this.f15492n) {
                c1c.this.f15502x = n4gVarWithDescription;
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void headers(boolean z, boolean z2, int i, int i2, List<ei7> list, li7 li7Var) {
            int iHeaderFind;
            this.f15521a.m14429c(k0c.EnumC8155a.INBOUND, i, list, z2);
            if ((i & 1) == 0) {
                connectionError(w45.PROTOCOL_ERROR, "Clients cannot open even numbered streams. RFC7540 section 5.1.1");
                return;
            }
            synchronized (c1c.this.f15492n) {
                try {
                    if (i > c1c.this.f15501w) {
                        return;
                    }
                    boolean z3 = i > c1c.this.f15500v;
                    if (z3) {
                        c1c.this.f15500v = i;
                    }
                    int iHeaderBlockSize = headerBlockSize(list);
                    if (iHeaderBlockSize > c1c.this.f15479a.f15515j) {
                        respondWithHttpError(i, z2, Videoio.CAP_PROP_XI_DECIMATION_SELECTOR, n4g.EnumC9694b.RESOURCE_EXHAUSTED, String.format(Locale.US, "Request metadata larger than %d: %d", Integer.valueOf(c1c.this.f15479a.f15515j), Integer.valueOf(iHeaderBlockSize)));
                        return;
                    }
                    c1c.headerRemove(list, ByteString.EMPTY);
                    ByteString byteString = null;
                    ByteString byteString2 = null;
                    ByteString byteString3 = null;
                    ByteString byteString4 = null;
                    while (list.size() > 0 && list.get(0).f33074a.getByte(0) == 58) {
                        ei7 ei7VarRemove = list.remove(0);
                        if (c1c.f15466F.equals(ei7VarRemove.f33074a) && byteString == null) {
                            byteString = ei7VarRemove.f33075b;
                        } else if (c1c.f15469I.equals(ei7VarRemove.f33074a) && byteString2 == null) {
                            byteString2 = ei7VarRemove.f33075b;
                        } else if (c1c.f15470J.equals(ei7VarRemove.f33074a) && byteString3 == null) {
                            byteString3 = ei7VarRemove.f33075b;
                        } else {
                            if (!c1c.f15471K.equals(ei7VarRemove.f33074a) || byteString4 != null) {
                                streamError(i, w45.PROTOCOL_ERROR, "Unexpected pseudo header. RFC7540 section 8.1.2.1");
                                return;
                            }
                            byteString4 = ei7VarRemove.f33075b;
                        }
                    }
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        if (list.get(i3).f33074a.getByte(0) == 58) {
                            streamError(i, w45.PROTOCOL_ERROR, "Pseudo header not before regular headers. RFC7540 section 8.1.2.1");
                            return;
                        }
                    }
                    if (!c1c.f15467G.equals(byteString) && z3 && (byteString == null || byteString2 == null || byteString3 == null)) {
                        streamError(i, w45.PROTOCOL_ERROR, "Missing required pseudo header. RFC7540 section 8.1.2.3");
                        return;
                    }
                    if (c1c.headerContains(list, c1c.f15472L)) {
                        streamError(i, w45.PROTOCOL_ERROR, "Connection-specific headers not permitted. RFC7540 section 8.1.2.2");
                        return;
                    }
                    if (!z3) {
                        if (!z2) {
                            streamError(i, w45.PROTOCOL_ERROR, "Headers disallowed in the middle of the stream. RFC7540 section 8.1");
                            return;
                        }
                        synchronized (c1c.this.f15492n) {
                            try {
                                InterfaceC2156f interfaceC2156f = (InterfaceC2156f) c1c.this.f15499u.get(Integer.valueOf(i));
                                if (interfaceC2156f == null) {
                                    streamError(i, w45.STREAM_CLOSED, "Received headers for closed stream");
                                    return;
                                } else if (interfaceC2156f.hasReceivedEndOfStream()) {
                                    streamError(i, w45.STREAM_CLOSED, "Received HEADERS for half-closed (remote) stream. RFC7540 section 5.1");
                                    return;
                                } else {
                                    interfaceC2156f.inboundDataReceived(new Buffer(), 0, 0, true);
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    if (byteString4 == null && (iHeaderFind = c1c.headerFind(list, c1c.f15473M, 0)) != -1) {
                        if (c1c.headerFind(list, c1c.f15473M, iHeaderFind + 1) != -1) {
                            respondWithHttpError(i, z2, 400, n4g.EnumC9694b.INTERNAL, "Multiple host headers disallowed. RFC7230 section 5.4");
                            return;
                        }
                        byteString4 = list.get(iHeaderFind).f33075b;
                    }
                    ByteString byteString5 = byteString4;
                    c1c.headerRemove(list, c1c.f15473M);
                    if (byteString3.size() == 0 || byteString3.getByte(0) != 47) {
                        respondWithHttpError(i, z2, 404, n4g.EnumC9694b.UNIMPLEMENTED, "Expected path to start with /: " + c1c.asciiString(byteString3));
                        return;
                    }
                    String strSubstring = c1c.asciiString(byteString3).substring(1);
                    ByteString byteStringHeaderGetRequiredSingle = c1c.headerGetRequiredSingle(list, c1c.f15476P);
                    if (byteStringHeaderGetRequiredSingle == null) {
                        respondWithHttpError(i, z2, Videoio.CAP_PROP_XI_AEAG, n4g.EnumC9694b.INTERNAL, "Content-Type is missing or duplicated");
                        return;
                    }
                    String strAsciiString = c1c.asciiString(byteStringHeaderGetRequiredSingle);
                    if (!oc7.isGrpcContentType(strAsciiString)) {
                        respondWithHttpError(i, z2, Videoio.CAP_PROP_XI_AEAG, n4g.EnumC9694b.INTERNAL, "Content-Type is not supported: " + strAsciiString);
                        return;
                    }
                    if (!c1c.f15468H.equals(byteString)) {
                        respondWithHttpError(i, z2, Videoio.CAP_PROP_XI_TRG_SOFTWARE, n4g.EnumC9694b.INTERNAL, "HTTP Method is not supported: " + c1c.asciiString(byteString));
                        return;
                    }
                    ByteString byteStringHeaderGetRequiredSingle2 = c1c.headerGetRequiredSingle(list, c1c.f15474N);
                    if (!c1c.f15475O.equals(byteStringHeaderGetRequiredSingle2)) {
                        respondWithGrpcError(i, z2, n4g.EnumC9694b.INTERNAL, String.format("Expected header TE: %s, but %s is received. Some intermediate proxy may not support trailers", c1c.asciiString(c1c.f15475O), byteStringHeaderGetRequiredSingle2 == null ? "<missing>" : c1c.asciiString(byteStringHeaderGetRequiredSingle2)));
                        return;
                    }
                    c1c.headerRemove(list, c1c.f15477Q);
                    fta ftaVarConvertHeaders = h1i.convertHeaders(list);
                    k4g k4gVarNewServerContext = k4g.newServerContext(c1c.this.f15479a.f15506a, strSubstring, ftaVarConvertHeaders);
                    synchronized (c1c.this.f15492n) {
                        try {
                            c1c c1cVar = c1c.this;
                            u0c.C13310b c13310b = new u0c.C13310b(c1cVar, i, c1cVar.f15479a.f15514i, k4gVarNewServerContext, c1c.this.f15492n, c1c.this.f15497s, c1c.this.f15498t, c1c.this.f15479a.f15513h, c1c.this.f15481c, strSubstring);
                            u0c u0cVar = new u0c(c13310b, c1c.this.f15487i, byteString5 != null ? c1c.asciiString(byteString5) : null, k4gVarNewServerContext, c1c.this.f15481c);
                            if (c1c.this.f15499u.isEmpty()) {
                                c1c.this.f15491m.onTransportActive();
                                if (c1c.this.f15489k != null) {
                                    c1c.this.f15489k.onTransportActive();
                                }
                            }
                            c1c.this.f15499u.put(Integer.valueOf(i), c13310b);
                            c1c.this.f15484f.streamCreated(u0cVar, strSubstring, ftaVarConvertHeaders);
                            c13310b.onStreamAllocated();
                            if (z2) {
                                c13310b.inboundDataReceived(new Buffer(), 0, 0, z2);
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void ping(boolean z, int i, int i2) {
            if (!c1c.this.f15491m.pingAcceptable()) {
                c1c.this.abruptShutdown(w45.ENHANCE_YOUR_CALM, "too_many_pings", n4g.f63267n.withDescription("Too many pings from client"), false);
                return;
            }
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            if (!z) {
                this.f15521a.m14430d(k0c.EnumC8155a.INBOUND, j);
                synchronized (c1c.this.f15492n) {
                    c1c.this.f15497s.ping(true, i, i2);
                    c1c.this.f15497s.flush();
                }
                return;
            }
            this.f15521a.m14431e(k0c.EnumC8155a.INBOUND, j);
            if (57005 == j) {
                return;
            }
            if (4369 == j) {
                c1c.this.triggerGracefulSecondGoaway();
                return;
            }
            c1c.f15462B.log(Level.INFO, "Received unexpected ping ack: " + j);
        }

        @Override // p000.gv6.InterfaceC6593a
        public void priority(int i, int i2, int i3, boolean z) {
            this.f15521a.logPriority(k0c.EnumC8155a.INBOUND, i, i2, i3, z);
        }

        @Override // p000.gv6.InterfaceC6593a
        public void pushPromise(int i, int i2, List<ei7> list) throws IOException {
            this.f15521a.m14432f(k0c.EnumC8155a.INBOUND, i, i2, list);
            connectionError(w45.PROTOCOL_ERROR, "PUSH_PROMISE only allowed on peer-initiated streams. RFC7540 section 6.6");
        }

        @Override // p000.gv6.InterfaceC6593a
        public void rstStream(int i, w45 w45Var) {
            this.f15521a.m14433g(k0c.EnumC8155a.INBOUND, i, w45Var);
            if (!w45.NO_ERROR.equals(w45Var) && !w45.CANCEL.equals(w45Var) && !w45.STREAM_CLOSED.equals(w45Var)) {
                c1c.f15462B.log(Level.INFO, "Received RST_STREAM: " + w45Var);
            }
            n4g n4gVarWithDescription = oc7.EnumC10306j.statusForCode(w45Var.f93214a).withDescription("RST_STREAM");
            synchronized (c1c.this.f15492n) {
                try {
                    InterfaceC2156f interfaceC2156f = (InterfaceC2156f) c1c.this.f15499u.get(Integer.valueOf(i));
                    if (interfaceC2156f != null) {
                        interfaceC2156f.inboundRstReceived(n4gVarWithDescription);
                        c1c.this.m3627S(i, false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            InputStream inputStream;
            n4g n4gVarWithDescription;
            InputStream inputStream2;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpServerTransport");
            try {
                try {
                    this.f15522b.readConnectionPreface();
                } catch (Throwable th) {
                    try {
                        c1c.f15462B.log(Level.WARNING, "Error decoding HTTP/2 frames", th);
                        c1c.this.abruptShutdown(w45.INTERNAL_ERROR, "Error in frame decoder", n4g.f63272s.withDescription("Error decoding HTTP/2 frames").withCause(th), false);
                        inputStream = c1c.this.f15483e.getInputStream();
                    } catch (Throwable th2) {
                        try {
                            oc7.exhaust(c1c.this.f15483e.getInputStream());
                        } catch (IOException unused) {
                        }
                        oc7.closeQuietly(c1c.this.f15483e);
                        c1c.this.terminated();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            } catch (IOException unused2) {
            }
            if (this.f15522b.nextFrame(this)) {
                if (this.f15523c) {
                    while (this.f15522b.nextFrame(this)) {
                        if (c1c.this.f15488j != null) {
                            c1c.this.f15488j.onDataReceived();
                        }
                    }
                    synchronized (c1c.this.f15492n) {
                        n4gVarWithDescription = c1c.this.f15502x;
                    }
                    if (n4gVarWithDescription == null) {
                        n4gVarWithDescription = n4g.f63273t.withDescription("TCP connection closed or IOException");
                    }
                    c1c.this.abruptShutdown(w45.INTERNAL_ERROR, "I/O failure", n4gVarWithDescription, false);
                    inputStream = c1c.this.f15483e.getInputStream();
                    oc7.exhaust(inputStream);
                } else {
                    connectionError(w45.PROTOCOL_ERROR, "First HTTP/2 frame must be SETTINGS. RFC7540 section 3.5");
                    inputStream2 = c1c.this.f15483e.getInputStream();
                }
                oc7.closeQuietly(c1c.this.f15483e);
                c1c.this.terminated();
                Thread.currentThread().setName(name);
                return;
            }
            connectionError(w45.INTERNAL_ERROR, "Failed to read initial SETTINGS");
            inputStream2 = c1c.this.f15483e.getInputStream();
            oc7.exhaust(inputStream2);
            oc7.closeQuietly(c1c.this.f15483e);
            c1c.this.terminated();
            Thread.currentThread().setName(name);
        }

        @Override // p000.gv6.InterfaceC6593a
        public void settings(boolean z, b7f b7fVar) {
            boolean zInitialOutboundWindowSize;
            this.f15521a.m14434h(k0c.EnumC8155a.INBOUND, b7fVar);
            synchronized (c1c.this.f15492n) {
                try {
                    if (e1c.isSet(b7fVar, 7)) {
                        zInitialOutboundWindowSize = c1c.this.f15498t.initialOutboundWindowSize(e1c.get(b7fVar, 7));
                    } else {
                        zInitialOutboundWindowSize = false;
                    }
                    c1c.this.f15497s.ackSettings(b7fVar);
                    c1c.this.f15497s.flush();
                    if (!this.f15523c) {
                        this.f15523c = true;
                        c1c c1cVar = c1c.this;
                        c1cVar.f15487i = c1cVar.f15484f.transportReady(c1c.this.f15487i);
                    }
                    if (zInitialOutboundWindowSize) {
                        c1c.this.f15498t.writeStreams();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void windowUpdate(int i, long j) {
            this.f15521a.m14436j(k0c.EnumC8155a.INBOUND, i, j);
            synchronized (c1c.this.f15492n) {
                try {
                    if (i == 0) {
                        c1c.this.f15498t.windowUpdate(null, (int) j);
                    } else {
                        InterfaceC2156f interfaceC2156f = (InterfaceC2156f) c1c.this.f15499u.get(Integer.valueOf(i));
                        if (interfaceC2156f != null) {
                            c1c.this.f15498t.windowUpdate(interfaceC2156f.getOutboundFlowState(), (int) j);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c1c$d */
    public static class C2154d implements InterfaceC2156f, i8c.InterfaceC7185b {

        /* JADX INFO: renamed from: a */
        public final int f15526a;

        /* JADX INFO: renamed from: b */
        public final Object f15527b;

        /* JADX INFO: renamed from: c */
        public final i8c.C7186c f15528c;

        /* JADX INFO: renamed from: d */
        @vc7("lock")
        public int f15529d;

        /* JADX INFO: renamed from: e */
        @vc7("lock")
        public boolean f15530e;

        public C2154d(int i, Object obj, i8c i8cVar, int i2) {
            this.f15526a = i;
            this.f15527b = obj;
            this.f15528c = i8cVar.createState(this, i);
            this.f15529d = i2;
        }

        @Override // p000.c1c.InterfaceC2156f
        public i8c.C7186c getOutboundFlowState() {
            i8c.C7186c c7186c;
            synchronized (this.f15527b) {
                c7186c = this.f15528c;
            }
            return c7186c;
        }

        @Override // p000.c1c.InterfaceC2156f
        public boolean hasReceivedEndOfStream() {
            boolean z;
            synchronized (this.f15527b) {
                z = this.f15530e;
            }
            return z;
        }

        @Override // p000.c1c.InterfaceC2156f
        public void inboundDataReceived(Buffer buffer, int i, int i2, boolean z) {
            synchronized (this.f15527b) {
                if (z) {
                    try {
                        this.f15530e = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f15529d -= i + i2;
                try {
                    buffer.skip(buffer.size());
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            }
        }

        @Override // p000.c1c.InterfaceC2156f
        public void inboundRstReceived(n4g n4gVar) {
        }

        @Override // p000.c1c.InterfaceC2156f
        public int inboundWindowAvailable() {
            int i;
            synchronized (this.f15527b) {
                i = this.f15529d;
            }
            return i;
        }

        @Override // p000.i8c.InterfaceC7185b
        public void onSentBytes(int i) {
        }

        @Override // p000.c1c.InterfaceC2156f
        public void transportReportStatus(n4g n4gVar) {
        }
    }

    /* JADX INFO: renamed from: c1c$e */
    public final class C2155e implements vp8.InterfaceC14210d {
        private C2155e() {
        }

        @Override // p000.vp8.InterfaceC14210d
        public void onPingTimeout() {
            synchronized (c1c.this.f15492n) {
                c1c.this.f15502x = n4g.f63273t.withDescription("Keepalive failed. Considering connection dead");
                oc7.closeQuietly(c1c.this.f15483e);
            }
        }

        @Override // p000.vp8.InterfaceC14210d
        public void ping() {
            synchronized (c1c.this.f15492n) {
                c1c.this.f15497s.ping(false, 0, c1c.f15465E);
                c1c.this.f15497s.flush();
            }
            c1c.this.f15481c.reportKeepAliveSent();
        }

        public /* synthetic */ C2155e(c1c c1cVar, C2151a c2151a) {
            this();
        }
    }

    /* JADX INFO: renamed from: c1c$f */
    public interface InterfaceC2156f {
        i8c.C7186c getOutboundFlowState();

        boolean hasReceivedEndOfStream();

        void inboundDataReceived(Buffer buffer, int i, int i2, boolean z);

        void inboundRstReceived(n4g n4gVar);

        int inboundWindowAvailable();

        void transportReportStatus(n4g n4gVar);
    }

    public c1c(C2152b c2152b, Socket socket) {
        this.f15479a = (C2152b) v7d.checkNotNull(c2152b, "config");
        this.f15483e = (Socket) v7d.checkNotNull(socket, "bareSocket");
        rhh rhhVarCreate = c2152b.f15509d.create();
        this.f15481c = rhhVarCreate;
        rhhVarCreate.setFlowControlWindowReader(new rhh.InterfaceC12099c() { // from class: a1c
            @Override // p000.rhh.InterfaceC12099c
            public final rhh.C12100d read() {
                return this.f130a.readFlowControlWindow();
            }
        });
        this.f15482d = cb8.allocate((Class<?>) c1c.class, this.f15483e.getRemoteSocketAddress().toString());
        this.f15485g = c2152b.f15507b.getObject();
        this.f15486h = c2152b.f15508c.getObject();
        this.f15491m = new up8(c2152b.f15517l, c2152b.f15518m, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void abruptShutdown(w45 w45Var, String str, n4g n4gVar, boolean z) {
        synchronized (this.f15492n) {
            try {
                if (this.f15493o) {
                    return;
                }
                this.f15493o = true;
                this.f15502x = n4gVar;
                ScheduledFuture<?> scheduledFuture = this.f15503y;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f15503y = null;
                }
                for (Map.Entry<Integer, InterfaceC2156f> entry : this.f15499u.entrySet()) {
                    if (z) {
                        this.f15497s.rstStream(entry.getKey().intValue(), w45.CANCEL);
                    }
                    entry.getValue().transportReportStatus(n4gVar);
                }
                this.f15499u.clear();
                this.f15497s.goAway(this.f15500v, w45Var, str.getBytes(oc7.f67134c));
                this.f15501w = this.f15500v;
                this.f15497s.close();
                this.f15504z = this.f15486h.schedule(new w0c(this), 1L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String asciiString(ByteString byteString) {
        for (int i = 0; i < byteString.size(); i++) {
            if (byteString.getByte(i) < 0) {
                return byteString.string(oc7.f67134c);
            }
        }
        return byteString.utf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean headerContains(List<ei7> list, ByteString byteString) {
        return headerFind(list, byteString, 0) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int headerFind(List<ei7> list, ByteString byteString, int i) {
        while (i < list.size()) {
            if (list.get(i).f33074a.equals(byteString)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString headerGetRequiredSingle(List<ei7> list, ByteString byteString) {
        int iHeaderFind = headerFind(list, byteString, 0);
        if (iHeaderFind != -1 && headerFind(list, byteString, iHeaderFind + 1) == -1) {
            return list.get(iHeaderFind).f33075b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void headerRemove(List<ei7> list, ByteString byteString) {
        int iHeaderFind = 0;
        while (true) {
            iHeaderFind = headerFind(list, byteString, iHeaderFind);
            if (iHeaderFind == -1) {
                return;
            } else {
                list.remove(iHeaderFind);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startIo$1() {
        shutdown(Long.valueOf(this.f15479a.f15520o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rhh.C12100d readFlowControlWindow() {
        rhh.C12100d c12100d;
        synchronized (this.f15492n) {
            c12100d = new rhh.C12100d(this.f15498t == null ? -1L : r1.windowUpdate(null, 0), (long) (this.f15479a.f15513h * 0.5f));
        }
        return c12100d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: startIo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void lambda$start$0(p000.t2f r15) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.c1c.lambda$start$0(t2f):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void terminated() {
        synchronized (this.f15492n) {
            try {
                ScheduledFuture<?> scheduledFuture = this.f15504z;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f15504z = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        vp8 vp8Var = this.f15488j;
        if (vp8Var != null) {
            vp8Var.onTransportTermination();
        }
        h4a h4aVar = this.f15489k;
        if (h4aVar != null) {
            h4aVar.onTransportTermination();
        }
        ScheduledFuture<?> scheduledFuture2 = this.f15490l;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
        this.f15485g = this.f15479a.f15507b.returnObject(this.f15485g);
        this.f15486h = this.f15479a.f15508c.returnObject(this.f15486h);
        this.f15484f.transportTerminated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerForcefulClose() {
        oc7.closeQuietly(this.f15483e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerGracefulSecondGoaway() {
        synchronized (this.f15492n) {
            try {
                ScheduledFuture<?> scheduledFuture = this.f15503y;
                if (scheduledFuture == null) {
                    return;
                }
                scheduledFuture.cancel(false);
                this.f15503y = null;
                this.f15497s.goAway(this.f15500v, w45.NO_ERROR, new byte[0]);
                this.f15501w = this.f15500v;
                if (this.f15499u.isEmpty()) {
                    this.f15497s.close();
                } else {
                    this.f15497s.flush();
                }
                if (this.f15478A != null) {
                    this.f15504z = this.f15486h.schedule(new w0c(this), this.f15478A.longValue(), TimeUnit.NANOSECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m3627S(int i, boolean z) {
        synchronized (this.f15492n) {
            try {
                this.f15499u.remove(Integer.valueOf(i));
                if (this.f15499u.isEmpty()) {
                    this.f15491m.onTransportIdle();
                    h4a h4aVar = this.f15489k;
                    if (h4aVar != null) {
                        h4aVar.onTransportIdle();
                    }
                }
                if (this.f15494p && this.f15499u.isEmpty()) {
                    this.f15497s.close();
                } else if (z) {
                    this.f15497s.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.i8c.InterfaceC7187d
    public i8c.C7186c[] getActiveStreams() {
        i8c.C7186c[] c7186cArr;
        synchronized (this.f15492n) {
            try {
                c7186cArr = new i8c.C7186c[this.f15499u.size()];
                Iterator<InterfaceC2156f> it = this.f15499u.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    c7186cArr[i] = it.next().getOutboundFlowState();
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7186cArr;
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        return this.f15482d;
    }

    @Override // p000.c4f
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.f15486h;
    }

    @Override // p000.xa8
    public ja9<da8.C4695l> getStats() {
        ja9<da8.C4695l> ja9VarImmediateFuture;
        synchronized (this.f15492n) {
            ja9VarImmediateFuture = w17.immediateFuture(new da8.C4695l(this.f15481c.getStats(), this.f15483e.getLocalSocketAddress(), this.f15483e.getRemoteSocketAddress(), h1i.m12081b(this.f15483e), this.f15496r));
        }
        return ja9VarImmediateFuture;
    }

    @Override // p000.i75.InterfaceC7171a
    public void onException(Throwable th) {
        v7d.checkNotNull(th, "failureCause");
        abruptShutdown(w45.INTERNAL_ERROR, "I/O failure", n4g.f63273t.withCause(th), false);
    }

    @Override // p000.c4f
    public void shutdown() {
        shutdown(null);
    }

    @Override // p000.c4f
    public void shutdownNow(n4g n4gVar) {
        synchronized (this.f15492n) {
            try {
                if (this.f15497s != null) {
                    abruptShutdown(w45.NO_ERROR, "", n4gVar, true);
                } else {
                    this.f15495q = true;
                    oc7.closeQuietly(this.f15483e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void start(e4f e4fVar) {
        this.f15484f = (e4f) v7d.checkNotNull(e4fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        final t2f t2fVar = new t2f(this.f15485g);
        t2fVar.execute(new Runnable() { // from class: b1c
            @Override // java.lang.Runnable
            public final void run() {
                this.f12406a.lambda$start$0(t2fVar);
            }
        });
    }

    private void shutdown(@eib Long l) {
        synchronized (this.f15492n) {
            try {
                if (!this.f15494p && !this.f15493o) {
                    this.f15494p = true;
                    this.f15478A = l;
                    if (this.f15497s == null) {
                        this.f15495q = true;
                        oc7.closeQuietly(this.f15483e);
                    } else {
                        this.f15503y = this.f15486h.schedule(new Runnable() { // from class: z0c
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f103637a.triggerGracefulSecondGoaway();
                            }
                        }, f15464D, TimeUnit.NANOSECONDS);
                        this.f15497s.goAway(Integer.MAX_VALUE, w45.NO_ERROR, new byte[0]);
                        this.f15497s.ping(false, 0, f15463C);
                        this.f15497s.flush();
                    }
                }
            } finally {
            }
        }
    }
}
