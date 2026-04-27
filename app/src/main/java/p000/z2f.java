package p000;

import androidx.core.app.NotificationCompat;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.b72;
import p000.fta;
import p000.fx2;
import p000.w2f;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public final class z2f<ReqT, RespT> extends w2f<ReqT, RespT> {

    /* JADX INFO: renamed from: n */
    public static final Logger f103882n = Logger.getLogger(z2f.class.getName());

    /* JADX INFO: renamed from: o */
    @gdi
    public static final String f103883o = "Too many responses";

    /* JADX INFO: renamed from: p */
    @gdi
    public static final String f103884p = "Completed without a response";

    /* JADX INFO: renamed from: a */
    public final w3f f103885a;

    /* JADX INFO: renamed from: b */
    public final rua<ReqT, RespT> f103886b;

    /* JADX INFO: renamed from: c */
    public final plg f103887c;

    /* JADX INFO: renamed from: d */
    public final fx2.C6016e f103888d;

    /* JADX INFO: renamed from: e */
    public final byte[] f103889e;

    /* JADX INFO: renamed from: f */
    public final bm3 f103890f;

    /* JADX INFO: renamed from: g */
    public final ho2 f103891g;

    /* JADX INFO: renamed from: h */
    public vn1 f103892h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f103893i;

    /* JADX INFO: renamed from: j */
    public boolean f103894j;

    /* JADX INFO: renamed from: k */
    public boolean f103895k;

    /* JADX INFO: renamed from: l */
    public go2 f103896l;

    /* JADX INFO: renamed from: m */
    public boolean f103897m;

    /* JADX INFO: renamed from: z2f$a */
    @gdi
    public static final class C15957a<ReqT> implements x3f {

        /* JADX INFO: renamed from: a */
        public final z2f<ReqT, ?> f103898a;

        /* JADX INFO: renamed from: b */
        public final w2f.AbstractC14368a<ReqT> f103899b;

        /* JADX INFO: renamed from: c */
        public final fx2.C6016e f103900c;

        /* JADX INFO: renamed from: z2f$a$a */
        public class a implements fx2.InterfaceC6018g {
            public a() {
            }

            @Override // p000.fx2.InterfaceC6018g
            public void cancelled(fx2 fx2Var) {
                if (fx2Var.cancellationCause() != null) {
                    C15957a.this.f103898a.f103893i = true;
                }
            }
        }

        public C15957a(z2f<ReqT, ?> z2fVar, w2f.AbstractC14368a<ReqT> abstractC14368a, fx2.C6016e c6016e) {
            this.f103898a = (z2f) v7d.checkNotNull(z2fVar, NotificationCompat.CATEGORY_CALL);
            this.f103899b = (w2f.AbstractC14368a) v7d.checkNotNull(abstractC14368a, "listener must not be null");
            fx2.C6016e c6016e2 = (fx2.C6016e) v7d.checkNotNull(c6016e, "context");
            this.f103900c = c6016e2;
            c6016e2.addListener(new a(), xya.directExecutor());
        }

        private void closedInternal(n4g n4gVar) {
            v4g v4gVarAsRuntimeException = null;
            try {
                if (n4gVar.isOk()) {
                    this.f103899b.onComplete();
                } else {
                    this.f103898a.f103893i = true;
                    this.f103899b.onCancel();
                    v4gVarAsRuntimeException = tb8.asRuntimeException(n4g.f63259f.withDescription("RPC cancelled"), null, false);
                }
                this.f103900c.cancel(v4gVarAsRuntimeException);
            } catch (Throwable th) {
                this.f103900c.cancel(null);
                throw th;
            }
        }

        private void messagesAvailableInternal(y5g.InterfaceC15496a interfaceC15496a) {
            if (this.f103898a.f103893i) {
                oc7.m18574b(interfaceC15496a);
                return;
            }
            while (true) {
                try {
                    InputStream next = interfaceC15496a.next();
                    if (next == null) {
                        return;
                    }
                    try {
                        this.f103899b.onMessage((ReqT) this.f103898a.f103886b.parseRequest(next));
                        next.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    oc7.m18574b(interfaceC15496a);
                    bzg.throwIfUnchecked(th);
                    throw new RuntimeException(th);
                }
            }
        }

        @Override // p000.x3f
        public void closed(n4g n4gVar) {
            nng nngVarTraceTask = tnc.traceTask("ServerStreamListener.closed");
            try {
                tnc.attachTag(this.f103898a.f103887c);
                closedInternal(n4gVar);
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p000.x3f
        public void halfClosed() {
            nng nngVarTraceTask = tnc.traceTask("ServerStreamListener.halfClosed");
            try {
                tnc.attachTag(this.f103898a.f103887c);
                if (this.f103898a.f103893i) {
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                } else {
                    this.f103899b.onHalfClose();
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p000.y5g
        public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
            nng nngVarTraceTask = tnc.traceTask("ServerStreamListener.messagesAvailable");
            try {
                tnc.attachTag(this.f103898a.f103887c);
                messagesAvailableInternal(interfaceC15496a);
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p000.y5g
        public void onReady() {
            nng nngVarTraceTask = tnc.traceTask("ServerStreamListener.onReady");
            try {
                tnc.attachTag(this.f103898a.f103887c);
                if (this.f103898a.f103893i) {
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                } else {
                    this.f103899b.onReady();
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public z2f(w3f w3fVar, rua<ReqT, RespT> ruaVar, fta ftaVar, fx2.C6016e c6016e, bm3 bm3Var, ho2 ho2Var, vn1 vn1Var, plg plgVar) {
        this.f103885a = w3fVar;
        this.f103886b = ruaVar;
        this.f103888d = c6016e;
        this.f103889e = (byte[]) ftaVar.get(oc7.f67137f);
        this.f103890f = bm3Var;
        this.f103891g = ho2Var;
        this.f103892h = vn1Var;
        vn1Var.reportCallStarted();
        this.f103887c = plgVar;
    }

    private void closeInternal(n4g n4gVar, fta ftaVar) {
        v7d.checkState(!this.f103895k, "call already closed");
        try {
            this.f103895k = true;
            if (n4gVar.isOk() && this.f103886b.getType().serverSendsOneMessage() && !this.f103897m) {
                handleInternalError(n4g.f63272s.withDescription(f103884p).asRuntimeException());
            } else {
                this.f103885a.close(n4gVar, ftaVar);
            }
        } finally {
            this.f103892h.reportCallEnded(n4gVar.isOk());
        }
    }

    private void handleInternalError(Throwable th) {
        f103882n.log(Level.WARNING, "Cancelling the stream because of internal error", th);
        this.f103885a.cancel(th instanceof v4g ? ((v4g) th).getStatus() : n4g.f63272s.withCause(th).withDescription("Internal error so cancelling stream."));
        this.f103892h.reportCallEnded(false);
    }

    private void sendHeadersInternal(fta ftaVar) {
        byte[] bArr;
        v7d.checkState(!this.f103894j, "sendHeaders has already been called");
        v7d.checkState(!this.f103895k, "call is closed");
        ftaVar.discardAll(oc7.f67140i);
        fta.AbstractC5971i<String> abstractC5971i = oc7.f67136e;
        ftaVar.discardAll(abstractC5971i);
        if (this.f103896l == null || (bArr = this.f103889e) == null || !oc7.m18576d(oc7.f67156y.split(new String(bArr, oc7.f67134c)), this.f103896l.getMessageEncoding())) {
            this.f103896l = b72.C1761b.f12832a;
        }
        ftaVar.put(abstractC5971i, this.f103896l.getMessageEncoding());
        this.f103885a.setCompressor(this.f103896l);
        fta.AbstractC5971i<byte[]> abstractC5971i2 = oc7.f67137f;
        ftaVar.discardAll(abstractC5971i2);
        byte[] rawAdvertisedMessageEncodings = ma8.getRawAdvertisedMessageEncodings(this.f103890f);
        if (rawAdvertisedMessageEncodings.length != 0) {
            ftaVar.put(abstractC5971i2, rawAdvertisedMessageEncodings);
        }
        this.f103894j = true;
        this.f103885a.writeHeaders(ftaVar, true ^ getMethodDescriptor().getType().serverSendsOneMessage());
    }

    private void sendMessageInternal(RespT respt) {
        v7d.checkState(this.f103894j, "sendHeaders has not been called");
        v7d.checkState(!this.f103895k, "call is closed");
        if (this.f103886b.getType().serverSendsOneMessage() && this.f103897m) {
            handleInternalError(n4g.f63272s.withDescription(f103883o).asRuntimeException());
            return;
        }
        this.f103897m = true;
        try {
            this.f103885a.writeMessage(this.f103886b.streamResponse(respt));
            if (getMethodDescriptor().getType().serverSendsOneMessage()) {
                return;
            }
            this.f103885a.flush();
        } catch (Error e) {
            close(n4g.f63259f.withDescription("Server sendMessage() failed with Error"), new fta());
            throw e;
        } catch (RuntimeException e2) {
            handleInternalError(e2);
        }
    }

    @Override // p000.w2f
    public void close(n4g n4gVar, fta ftaVar) {
        nng nngVarTraceTask = tnc.traceTask("ServerCall.close");
        try {
            tnc.attachTag(this.f103887c);
            closeInternal(n4gVar, ftaVar);
            if (nngVarTraceTask != null) {
                nngVarTraceTask.close();
            }
        } catch (Throwable th) {
            if (nngVarTraceTask != null) {
                try {
                    nngVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public x3f m26531e(w2f.AbstractC14368a<ReqT> abstractC14368a) {
        return new C15957a(this, abstractC14368a, this.f103888d);
    }

    @Override // p000.w2f
    public sc0 getAttributes() {
        return this.f103885a.getAttributes();
    }

    @Override // p000.w2f
    public String getAuthority() {
        return this.f103885a.getAuthority();
    }

    @Override // p000.w2f
    public rua<ReqT, RespT> getMethodDescriptor() {
        return this.f103886b;
    }

    @Override // p000.w2f
    public eue getSecurityLevel() {
        eue eueVar;
        sc0 attributes = getAttributes();
        return (attributes == null || (eueVar = (eue) attributes.get(dc7.f29283a)) == null) ? super.getSecurityLevel() : eueVar;
    }

    @Override // p000.w2f
    public boolean isCancelled() {
        return this.f103893i;
    }

    @Override // p000.w2f
    public boolean isReady() {
        if (this.f103895k) {
            return false;
        }
        return this.f103885a.isReady();
    }

    @Override // p000.w2f
    public void request(int i) {
        nng nngVarTraceTask = tnc.traceTask("ServerCall.request");
        try {
            tnc.attachTag(this.f103887c);
            this.f103885a.request(i);
            if (nngVarTraceTask != null) {
                nngVarTraceTask.close();
            }
        } catch (Throwable th) {
            if (nngVarTraceTask != null) {
                try {
                    nngVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p000.w2f
    public void sendHeaders(fta ftaVar) {
        nng nngVarTraceTask = tnc.traceTask("ServerCall.sendHeaders");
        try {
            tnc.attachTag(this.f103887c);
            sendHeadersInternal(ftaVar);
            if (nngVarTraceTask != null) {
                nngVarTraceTask.close();
            }
        } catch (Throwable th) {
            if (nngVarTraceTask != null) {
                try {
                    nngVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p000.w2f
    public void sendMessage(RespT respt) {
        nng nngVarTraceTask = tnc.traceTask("ServerCall.sendMessage");
        try {
            tnc.attachTag(this.f103887c);
            sendMessageInternal(respt);
            if (nngVarTraceTask != null) {
                nngVarTraceTask.close();
            }
        } catch (Throwable th) {
            if (nngVarTraceTask != null) {
                try {
                    nngVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p000.w2f
    public void setCompression(String str) {
        v7d.checkState(!this.f103894j, "sendHeaders has been called");
        go2 go2VarLookupCompressor = this.f103891g.lookupCompressor(str);
        this.f103896l = go2VarLookupCompressor;
        v7d.checkArgument(go2VarLookupCompressor != null, "Unable to find compressor by name %s", str);
    }

    @Override // p000.w2f
    public void setMessageCompression(boolean z) {
        this.f103885a.setMessageCompression(z);
    }
}
