package p000;

import p000.w2f;

/* JADX INFO: loaded from: classes7.dex */
public final class c3f {

    /* JADX INFO: renamed from: a */
    @gdi
    public static final String f15693a = "Too many requests";

    /* JADX INFO: renamed from: b */
    @gdi
    public static final String f15694b = "Half-closed without a request";

    /* JADX INFO: renamed from: c3f$a */
    public interface InterfaceC2185a<ReqT, RespT> extends InterfaceC2190f<ReqT, RespT> {
        @Override // p000.c3f.InterfaceC2190f
        c6g<ReqT> invoke(c6g<RespT> c6gVar);
    }

    /* JADX INFO: renamed from: c3f$b */
    public interface InterfaceC2186b<ReqT, RespT> extends InterfaceC2190f<ReqT, RespT> {
        @Override // p000.c3f.InterfaceC2190f
        c6g<ReqT> invoke(c6g<RespT> c6gVar);
    }

    /* JADX INFO: renamed from: c3f$c */
    public static class C2187c<V> implements c6g<V> {
        @Override // p000.c6g
        public void onCompleted() {
        }

        @Override // p000.c6g
        public void onError(Throwable th) {
        }

        @Override // p000.c6g
        public void onNext(V v) {
        }
    }

    /* JADX INFO: renamed from: c3f$d */
    public static final class C2188d<ReqT, RespT> extends b3f<RespT> {

        /* JADX INFO: renamed from: a */
        public final w2f<ReqT, RespT> f15695a;

        /* JADX INFO: renamed from: b */
        public final boolean f15696b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f15697c;

        /* JADX INFO: renamed from: d */
        public boolean f15698d;

        /* JADX INFO: renamed from: f */
        public boolean f15700f;

        /* JADX INFO: renamed from: g */
        public Runnable f15701g;

        /* JADX INFO: renamed from: h */
        public Runnable f15702h;

        /* JADX INFO: renamed from: k */
        public Runnable f15705k;

        /* JADX INFO: renamed from: e */
        public boolean f15699e = true;

        /* JADX INFO: renamed from: i */
        public boolean f15703i = false;

        /* JADX INFO: renamed from: j */
        public boolean f15704j = false;

        public C2188d(w2f<ReqT, RespT> w2fVar, boolean z) {
            this.f15695a = w2fVar;
            this.f15696b = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void freeze() {
            this.f15698d = true;
        }

        @Override // p000.tn1
        public void disableAutoInboundFlowControl() {
            disableAutoRequest();
        }

        @Override // p000.b3f
        public void disableAutoRequest() {
            v7d.checkState(!this.f15698d, "Cannot disable auto flow control after initialization");
            this.f15699e = false;
        }

        @Override // p000.b3f
        public boolean isCancelled() {
            return this.f15695a.isCancelled();
        }

        @Override // p000.b3f, p000.tn1
        public boolean isReady() {
            return this.f15695a.isReady();
        }

        @Override // p000.c6g
        public void onCompleted() {
            this.f15695a.close(n4g.f63258e, new fta());
            this.f15704j = true;
        }

        @Override // p000.c6g
        public void onError(Throwable th) {
            fta ftaVarTrailersFromThrowable = n4g.trailersFromThrowable(th);
            if (ftaVarTrailersFromThrowable == null) {
                ftaVarTrailersFromThrowable = new fta();
            }
            this.f15695a.close(n4g.fromThrowable(th), ftaVarTrailersFromThrowable);
            this.f15703i = true;
        }

        @Override // p000.c6g
        public void onNext(RespT respt) {
            if (this.f15697c && this.f15696b) {
                throw n4g.f63259f.withDescription("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception").asRuntimeException();
            }
            v7d.checkState(!this.f15703i, "Stream was terminated by error, no further calls are allowed");
            v7d.checkState(!this.f15704j, "Stream is already completed, no further calls are allowed");
            if (!this.f15700f) {
                this.f15695a.sendHeaders(new fta());
                this.f15700f = true;
            }
            this.f15695a.sendMessage(respt);
        }

        @Override // p000.b3f, p000.tn1
        public void request(int i) {
            this.f15695a.request(i);
        }

        @Override // p000.b3f
        public void setCompression(String str) {
            this.f15695a.setCompression(str);
        }

        @Override // p000.b3f, p000.tn1
        public void setMessageCompression(boolean z) {
            this.f15695a.setMessageCompression(z);
        }

        @Override // p000.b3f
        public void setOnCancelHandler(Runnable runnable) {
            v7d.checkState(!this.f15698d, "Cannot alter onCancelHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f15702h = runnable;
        }

        @Override // p000.b3f
        public void setOnCloseHandler(Runnable runnable) {
            v7d.checkState(!this.f15698d, "Cannot alter onCloseHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f15705k = runnable;
        }

        @Override // p000.b3f, p000.tn1
        public void setOnReadyHandler(Runnable runnable) {
            v7d.checkState(!this.f15698d, "Cannot alter onReadyHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f15701g = runnable;
        }
    }

    /* JADX INFO: renamed from: c3f$e */
    public interface InterfaceC2189e<ReqT, RespT> extends InterfaceC2193i<ReqT, RespT> {
        @Override // p000.c3f.InterfaceC2193i
        void invoke(ReqT reqt, c6g<RespT> c6gVar);
    }

    /* JADX INFO: renamed from: c3f$f */
    public interface InterfaceC2190f<ReqT, RespT> {
        c6g<ReqT> invoke(c6g<RespT> c6gVar);
    }

    /* JADX INFO: renamed from: c3f$g */
    public static final class C2191g<ReqT, RespT> implements y2f<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2190f<ReqT, RespT> f15706a;

        /* JADX INFO: renamed from: b */
        public final boolean f15707b;

        /* JADX INFO: renamed from: c3f$g$a */
        public final class a extends w2f.AbstractC14368a<ReqT> {

            /* JADX INFO: renamed from: a */
            public final c6g<ReqT> f15708a;

            /* JADX INFO: renamed from: b */
            public final C2188d<ReqT, RespT> f15709b;

            /* JADX INFO: renamed from: c */
            public final w2f<ReqT, RespT> f15710c;

            /* JADX INFO: renamed from: d */
            public boolean f15711d = false;

            public a(c6g<ReqT> c6gVar, C2188d<ReqT, RespT> c2188d, w2f<ReqT, RespT> w2fVar) {
                this.f15708a = c6gVar;
                this.f15709b = c2188d;
                this.f15710c = w2fVar;
            }

            @Override // p000.w2f.AbstractC14368a
            public void onCancel() {
                if (this.f15709b.f15702h != null) {
                    this.f15709b.f15702h.run();
                } else {
                    this.f15709b.f15697c = true;
                }
                if (this.f15711d) {
                    return;
                }
                this.f15708a.onError(n4g.f63259f.withDescription("client cancelled").asRuntimeException());
            }

            @Override // p000.w2f.AbstractC14368a
            public void onComplete() {
                if (this.f15709b.f15705k != null) {
                    this.f15709b.f15705k.run();
                }
            }

            @Override // p000.w2f.AbstractC14368a
            public void onHalfClose() {
                this.f15711d = true;
                this.f15708a.onCompleted();
            }

            @Override // p000.w2f.AbstractC14368a
            public void onMessage(ReqT reqt) {
                this.f15708a.onNext(reqt);
                if (this.f15709b.f15699e) {
                    this.f15710c.request(1);
                }
            }

            @Override // p000.w2f.AbstractC14368a
            public void onReady() {
                if (this.f15709b.f15701g != null) {
                    this.f15709b.f15701g.run();
                }
            }
        }

        public C2191g(InterfaceC2190f<ReqT, RespT> interfaceC2190f, boolean z) {
            this.f15706a = interfaceC2190f;
            this.f15707b = z;
        }

        @Override // p000.y2f
        public w2f.AbstractC14368a<ReqT> startCall(w2f<ReqT, RespT> w2fVar, fta ftaVar) {
            C2188d c2188d = new C2188d(w2fVar, this.f15707b);
            c6g<ReqT> c6gVarInvoke = this.f15706a.invoke(c2188d);
            c2188d.freeze();
            if (c2188d.f15699e) {
                w2fVar.request(1);
            }
            return new a(c6gVarInvoke, c2188d, w2fVar);
        }
    }

    /* JADX INFO: renamed from: c3f$h */
    public interface InterfaceC2192h<ReqT, RespT> extends InterfaceC2193i<ReqT, RespT> {
        @Override // p000.c3f.InterfaceC2193i
        void invoke(ReqT reqt, c6g<RespT> c6gVar);
    }

    /* JADX INFO: renamed from: c3f$i */
    public interface InterfaceC2193i<ReqT, RespT> {
        void invoke(ReqT reqt, c6g<RespT> c6gVar);
    }

    /* JADX INFO: renamed from: c3f$j */
    public static final class C2194j<ReqT, RespT> implements y2f<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2193i<ReqT, RespT> f15713a;

        /* JADX INFO: renamed from: b */
        public final boolean f15714b;

        /* JADX INFO: renamed from: c3f$j$a */
        public final class a extends w2f.AbstractC14368a<ReqT> {

            /* JADX INFO: renamed from: a */
            public final w2f<ReqT, RespT> f15715a;

            /* JADX INFO: renamed from: b */
            public final C2188d<ReqT, RespT> f15716b;

            /* JADX INFO: renamed from: c */
            public boolean f15717c = true;

            /* JADX INFO: renamed from: d */
            public boolean f15718d;

            /* JADX INFO: renamed from: e */
            public ReqT f15719e;

            public a(C2188d<ReqT, RespT> c2188d, w2f<ReqT, RespT> w2fVar) {
                this.f15715a = w2fVar;
                this.f15716b = c2188d;
            }

            @Override // p000.w2f.AbstractC14368a
            public void onCancel() {
                if (this.f15716b.f15702h != null) {
                    this.f15716b.f15702h.run();
                } else {
                    this.f15716b.f15697c = true;
                }
            }

            @Override // p000.w2f.AbstractC14368a
            public void onComplete() {
                if (this.f15716b.f15705k != null) {
                    this.f15716b.f15705k.run();
                }
            }

            @Override // p000.w2f.AbstractC14368a
            public void onHalfClose() {
                if (this.f15717c) {
                    if (this.f15719e == null) {
                        this.f15715a.close(n4g.f63272s.withDescription(c3f.f15694b), new fta());
                        return;
                    }
                    C2194j.this.f15713a.invoke(this.f15719e, this.f15716b);
                    this.f15719e = null;
                    this.f15716b.freeze();
                    if (this.f15718d) {
                        onReady();
                    }
                }
            }

            @Override // p000.w2f.AbstractC14368a
            public void onMessage(ReqT reqt) {
                if (this.f15719e == null) {
                    this.f15719e = reqt;
                } else {
                    this.f15715a.close(n4g.f63272s.withDescription(c3f.f15693a), new fta());
                    this.f15717c = false;
                }
            }

            @Override // p000.w2f.AbstractC14368a
            public void onReady() {
                this.f15718d = true;
                if (this.f15716b.f15701g != null) {
                    this.f15716b.f15701g.run();
                }
            }
        }

        public C2194j(InterfaceC2193i<ReqT, RespT> interfaceC2193i, boolean z) {
            this.f15713a = interfaceC2193i;
            this.f15714b = z;
        }

        @Override // p000.y2f
        public w2f.AbstractC14368a<ReqT> startCall(w2f<ReqT, RespT> w2fVar, fta ftaVar) {
            v7d.checkArgument(w2fVar.getMethodDescriptor().getType().clientSendsOneMessage(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
            C2188d c2188d = new C2188d(w2fVar, this.f15714b);
            w2fVar.request(2);
            return new a(c2188d, w2fVar);
        }
    }

    private c3f() {
    }

    public static <ReqT, RespT> y2f<ReqT, RespT> asyncBidiStreamingCall(InterfaceC2185a<ReqT, RespT> interfaceC2185a) {
        return new C2191g(interfaceC2185a, true);
    }

    public static <ReqT, RespT> y2f<ReqT, RespT> asyncClientStreamingCall(InterfaceC2186b<ReqT, RespT> interfaceC2186b) {
        return new C2191g(interfaceC2186b, false);
    }

    public static <ReqT, RespT> y2f<ReqT, RespT> asyncServerStreamingCall(InterfaceC2189e<ReqT, RespT> interfaceC2189e) {
        return new C2194j(interfaceC2189e, true);
    }

    public static <ReqT, RespT> y2f<ReqT, RespT> asyncUnaryCall(InterfaceC2192h<ReqT, RespT> interfaceC2192h) {
        return new C2194j(interfaceC2192h, false);
    }

    public static <ReqT> c6g<ReqT> asyncUnimplementedStreamingCall(rua<?, ?> ruaVar, c6g<?> c6gVar) {
        asyncUnimplementedUnaryCall(ruaVar, c6gVar);
        return new C2187c();
    }

    public static void asyncUnimplementedUnaryCall(rua<?, ?> ruaVar, c6g<?> c6gVar) {
        v7d.checkNotNull(ruaVar, "methodDescriptor");
        v7d.checkNotNull(c6gVar, "responseObserver");
        c6gVar.onError(n4g.f63271r.withDescription(String.format("Method %s is unimplemented", ruaVar.getFullMethodName())).asRuntimeException());
    }
}
