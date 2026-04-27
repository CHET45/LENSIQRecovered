package p000;

/* JADX INFO: loaded from: classes5.dex */
@qpf
public final class w55 implements x55 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14392a f93282b = new C14392a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f93283c = "FIREBASE_APPQUALITY_SESSION";

    /* JADX INFO: renamed from: a */
    @yfb
    public final eid<dhh> f93284a;

    /* JADX INFO: renamed from: w55$a */
    public static final class C14392a {
        public /* synthetic */ C14392a(jt3 jt3Var) {
            this();
        }

        private C14392a() {
        }
    }

    @a28
    public w55(@yfb eid<dhh> eidVar) {
        md8.checkNotNullParameter(eidVar, "transportFactoryProvider");
        this.f93284a = eidVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encode(e5f e5fVar) {
        String strEncode = f5f.f35386a.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(e5fVar);
        md8.checkNotNullExpressionValue(strEncode, "encode(...)");
        StringBuilder sb = new StringBuilder();
        sb.append("Session Event Type: ");
        sb.append(e5fVar.getEventType().name());
        byte[] bytes = strEncode.getBytes(xw1.f99524b);
        md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // p000.x55
    public void log(@yfb e5f e5fVar) {
        md8.checkNotNullParameter(e5fVar, "sessionEvent");
        this.f93284a.get().getTransport(f93283c, e5f.class, q15.m19986of("json"), new leh() { // from class: v55
            @Override // p000.leh
            public final Object apply(Object obj) {
                return this.f90005a.encode((e5f) obj);
            }
        }).send(p55.ofData(e5fVar));
    }
}
