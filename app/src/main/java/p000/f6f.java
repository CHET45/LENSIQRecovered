package p000;

import com.google.firebase.sessions.InterfaceC3625b;
import p000.bt4;

/* JADX INFO: loaded from: classes5.dex */
@qpf
public final class f6f {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C5639a f35508c = new C5639a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final p7f f35509a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final p7f f35510b;

    /* JADX INFO: renamed from: f6f$a */
    public static final class C5639a {
        public /* synthetic */ C5639a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final f6f getInstance() {
            return ((InterfaceC3625b) xy5.getApp(hw5.f45141a).get(InterfaceC3625b.class)).getSessionsSettings();
        }

        private C5639a() {
        }
    }

    /* JADX INFO: renamed from: f6f$b */
    @ck3(m4009c = "com.google.firebase.sessions.settings.SessionsSettings", m4010f = "SessionsSettings.kt", m4011i = {0}, m4012l = {98, 99}, m4013m = "updateSettings", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C5640b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f35511a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f35512b;

        /* JADX INFO: renamed from: d */
        public int f35514d;

        public C5640b(zy2<? super C5640b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f35512b = obj;
            this.f35514d |= Integer.MIN_VALUE;
            return f6f.this.updateSettings(this);
        }
    }

    @a28
    public f6f(@rd9 @yfb p7f p7fVar, @yfb @ryd p7f p7fVar2) {
        md8.checkNotNullParameter(p7fVar, "localOverrideSettings");
        md8.checkNotNullParameter(p7fVar2, "remoteSettings");
        this.f35509a = p7fVar;
        this.f35510b = p7fVar2;
    }

    private final boolean isValidSamplingRate(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    /* JADX INFO: renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m28894isValidSessionRestartTimeoutLRDsOJo(long j) {
        return bt4.m28086isPositiveimpl(j) && bt4.m28081isFiniteimpl(j);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.f35509a.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.f35510b.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m28895getSessionRestartTimeoutUwyO8pc() {
        bt4 bt4VarMo31700getSessionRestartTimeoutFghU774 = this.f35509a.mo31700getSessionRestartTimeoutFghU774();
        if (bt4VarMo31700getSessionRestartTimeoutFghU774 != null) {
            long jM28105unboximpl = bt4VarMo31700getSessionRestartTimeoutFghU774.m28105unboximpl();
            if (m28894isValidSessionRestartTimeoutLRDsOJo(jM28105unboximpl)) {
                return jM28105unboximpl;
            }
        }
        bt4 bt4VarMo31700getSessionRestartTimeoutFghU7742 = this.f35510b.mo31700getSessionRestartTimeoutFghU774();
        if (bt4VarMo31700getSessionRestartTimeoutFghU7742 != null) {
            long jM28105unboximpl2 = bt4VarMo31700getSessionRestartTimeoutFghU7742.m28105unboximpl();
            if (m28894isValidSessionRestartTimeoutLRDsOJo(jM28105unboximpl2)) {
                return jM28105unboximpl2;
            }
        }
        bt4.C2044a c2044a = bt4.f14711b;
        return ft4.toDuration(30, lt4.f58685f);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.f35509a.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.f35510b.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateSettings(@p000.yfb p000.zy2<? super p000.bth> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.f6f.C5640b
            if (r0 == 0) goto L13
            r0 = r6
            f6f$b r0 = (p000.f6f.C5640b) r0
            int r1 = r0.f35514d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35514d = r1
            goto L18
        L13:
            f6f$b r0 = new f6f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35512b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35514d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p000.y7e.throwOnFailure(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f35511a
            f6f r2 = (p000.f6f) r2
            p000.y7e.throwOnFailure(r6)
            goto L4d
        L3c:
            p000.y7e.throwOnFailure(r6)
            p7f r6 = r5.f35509a
            r0.f35511a = r5
            r0.f35514d = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            p7f r6 = r2.f35510b
            r2 = 0
            r0.f35511a = r2
            r0.f35514d = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f6f.updateSettings(zy2):java.lang.Object");
    }
}
