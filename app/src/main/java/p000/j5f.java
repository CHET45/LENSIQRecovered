package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
@qpf
@dwf({"SMAP\nSessionFirelogPublisher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionFirelogPublisher.kt\ncom/google/firebase/sessions/SessionFirelogPublisherImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n2632#2,3:130\n*S KotlinDebug\n*F\n+ 1 SessionFirelogPublisher.kt\ncom/google/firebase/sessions/SessionFirelogPublisherImpl\n*L\n99#1:130,3\n*E\n"})
public final class j5f implements i5f {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C7746a f49565g = new C7746a(null);

    /* JADX INFO: renamed from: h */
    public static final double f49566h = Math.random();

    /* JADX INFO: renamed from: b */
    @yfb
    public final lw5 f49567b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final uy5 f49568c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final f6f f49569d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final x55 f49570e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final e13 f49571f;

    /* JADX INFO: renamed from: j5f$a */
    public static final class C7746a {
        public /* synthetic */ C7746a(jt3 jt3Var) {
            this();
        }

        private C7746a() {
        }
    }

    /* JADX INFO: renamed from: j5f$b */
    @ck3(m4009c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", m4010f = "SessionFirelogPublisher.kt", m4011i = {2}, m4012l = {70, 71, 77}, m4013m = "invokeSuspend", m4014n = {"installationId"}, m4015s = {"L$0"})
    public static final class C7747b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ d5f f49573F;

        /* JADX INFO: renamed from: a */
        public Object f49574a;

        /* JADX INFO: renamed from: b */
        public Object f49575b;

        /* JADX INFO: renamed from: c */
        public Object f49576c;

        /* JADX INFO: renamed from: d */
        public Object f49577d;

        /* JADX INFO: renamed from: e */
        public Object f49578e;

        /* JADX INFO: renamed from: f */
        public Object f49579f;

        /* JADX INFO: renamed from: m */
        public int f49580m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7747b(d5f d5fVar, zy2<? super C7747b> zy2Var) {
            super(2, zy2Var);
            this.f49573F = d5fVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return j5f.this.new C7747b(this.f49573F, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C7747b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r10.f49580m
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r10.f49579f
                f6f r0 = (p000.f6f) r0
                java.lang.Object r1 = r10.f49578e
                d5f r1 = (p000.d5f) r1
                java.lang.Object r2 = r10.f49577d
                lw5 r2 = (p000.lw5) r2
                java.lang.Object r3 = r10.f49576c
                f5f r3 = (p000.f5f) r3
                java.lang.Object r4 = r10.f49575b
                j5f r4 = (p000.j5f) r4
                java.lang.Object r5 = r10.f49574a
                i58 r5 = (p000.i58) r5
                p000.y7e.throwOnFailure(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L9d
            L35:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L3d:
                p000.y7e.throwOnFailure(r11)
                goto L6c
            L41:
                p000.y7e.throwOnFailure(r11)
                goto L53
            L45:
                p000.y7e.throwOnFailure(r11)
                j5f r11 = p000.j5f.this
                r10.f49580m = r4
                java.lang.Object r11 = p000.j5f.access$shouldLogSession(r11, r10)
                if (r11 != r0) goto L53
                return r0
            L53:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb0
                i58$a r11 = p000.i58.f45789c
                j5f r1 = p000.j5f.this
                uy5 r1 = p000.j5f.access$getFirebaseInstallations$p(r1)
                r10.f49580m = r3
                java.lang.Object r11 = r11.create(r1, r10)
                if (r11 != r0) goto L6c
                return r0
            L6c:
                r5 = r11
                i58 r5 = (p000.i58) r5
                j5f r4 = p000.j5f.this
                f5f r3 = p000.f5f.f35386a
                lw5 r11 = p000.j5f.access$getFirebaseApp$p(r4)
                d5f r1 = r10.f49573F
                j5f r6 = p000.j5f.this
                f6f r6 = p000.j5f.access$getSessionSettings$p(r6)
                iz5 r7 = p000.iz5.f48941a
                r10.f49574a = r5
                r10.f49575b = r4
                r10.f49576c = r3
                r10.f49577d = r11
                r10.f49578e = r1
                r10.f49579f = r6
                r10.f49580m = r2
                java.lang.Object r2 = r7.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r10)
                if (r2 != r0) goto L96
                return r0
            L96:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L9d:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.getFid()
                java.lang.String r6 = r5.getAuthToken()
                r5 = r11
                e5f r11 = r0.buildSession(r1, r2, r3, r4, r5, r6)
                p000.j5f.access$attemptLoggingSessionEvent(r7, r11)
            Lb0:
                bth r11 = p000.bth.f14751a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.j5f.C7747b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: j5f$c */
    @ck3(m4009c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m4010f = "SessionFirelogPublisher.kt", m4011i = {0, 1}, m4012l = {98, 104}, m4013m = "shouldLogSession", m4014n = {"this", "this"}, m4015s = {"L$0", "L$0"})
    public static final class C7748c extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f49581a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f49582b;

        /* JADX INFO: renamed from: d */
        public int f49584d;

        public C7748c(zy2<? super C7748c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f49582b = obj;
            this.f49584d |= Integer.MIN_VALUE;
            return j5f.this.shouldLogSession(this);
        }
    }

    @a28
    public j5f(@yfb lw5 lw5Var, @yfb uy5 uy5Var, @yfb f6f f6fVar, @yfb x55 x55Var, @ao0 @yfb e13 e13Var) {
        md8.checkNotNullParameter(lw5Var, "firebaseApp");
        md8.checkNotNullParameter(uy5Var, "firebaseInstallations");
        md8.checkNotNullParameter(f6fVar, "sessionSettings");
        md8.checkNotNullParameter(x55Var, "eventGDTLogger");
        md8.checkNotNullParameter(e13Var, "backgroundDispatcher");
        this.f49567b = lw5Var;
        this.f49568c = uy5Var;
        this.f49569d = f6fVar;
        this.f49570e = x55Var;
        this.f49571f = e13Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(e5f e5fVar) {
        try {
            this.f49570e.log(e5fVar);
        } catch (RuntimeException e) {
            Log.e(dz5.f31354d, "Error logging Session Start event to DataTransport: ", e);
        }
    }

    private final boolean shouldCollectEvents() {
        return f49566h <= this.f49569d.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object shouldLogSession(p000.zy2<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p000.j5f.C7748c
            if (r0 == 0) goto L13
            r0 = r8
            j5f$c r0 = (p000.j5f.C7748c) r0
            int r1 = r0.f49584d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49584d = r1
            goto L18
        L13:
            j5f$c r0 = new j5f$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f49582b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49584d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f49581a
            j5f r0 = (p000.j5f) r0
            p000.y7e.throwOnFailure(r8)
            goto L8c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f49581a
            j5f r2 = (p000.j5f) r2
            p000.y7e.throwOnFailure(r8)
            goto L52
        L41:
            p000.y7e.throwOnFailure(r8)
            iz5 r8 = p000.iz5.f48941a
            r0.f49581a = r7
            r0.f49584d = r5
            java.lang.Object r8 = r8.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            r2 = r7
        L52:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r6 = r8 instanceof java.util.Collection
            if (r6 == 0) goto L68
            r6 = r8
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L68
            goto La9
        L68:
            java.util.Iterator r8 = r8.iterator()
        L6c:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto La9
            java.lang.Object r6 = r8.next()
            c6f r6 = (p000.c6f) r6
            boolean r6 = r6.isDataCollectionEnabled()
            if (r6 == 0) goto L6c
            f6f r8 = r2.f49569d
            r0.f49581a = r2
            r0.f49584d = r3
            java.lang.Object r8 = r8.updateSettings(r0)
            if (r8 != r1) goto L8b
            return r1
        L8b:
            r0 = r2
        L8c:
            f6f r8 = r0.f49569d
            boolean r8 = r8.getSessionsEnabled()
            if (r8 != 0) goto L99
            java.lang.Boolean r8 = p000.wc1.boxBoolean(r4)
            return r8
        L99:
            boolean r8 = r0.shouldCollectEvents()
            if (r8 != 0) goto La4
            java.lang.Boolean r8 = p000.wc1.boxBoolean(r4)
            return r8
        La4:
            java.lang.Boolean r8 = p000.wc1.boxBoolean(r5)
            return r8
        La9:
            java.lang.Boolean r8 = p000.wc1.boxBoolean(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j5f.shouldLogSession(zy2):java.lang.Object");
    }

    @Override // p000.i5f
    public void mayLogSession(@yfb d5f d5fVar) {
        md8.checkNotNullParameter(d5fVar, "sessionDetails");
        fg1.launch$default(y13.CoroutineScope(this.f49571f), null, null, new C7747b(d5fVar, null), 3, null);
    }
}
