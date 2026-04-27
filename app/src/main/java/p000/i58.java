package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class i58 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C7152a f45789c = new C7152a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f45790a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f45791b;

    /* JADX INFO: renamed from: i58$a */
    public static final class C7152a {

        /* JADX INFO: renamed from: i58$a$a */
        @ck3(m4009c = "com.google.firebase.sessions.InstallationId$Companion", m4010f = "InstallationId.kt", m4011i = {0, 1}, m4012l = {31, 39}, m4013m = "create", m4014n = {"firebaseInstallations", "authToken"}, m4015s = {"L$0", "L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f45792a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f45793b;

            /* JADX INFO: renamed from: d */
            public int f45795d;

            public a(zy2<? super a> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                this.f45793b = obj;
                this.f45795d |= Integer.MIN_VALUE;
                return C7152a.this.create(null, this);
            }
        }

        public /* synthetic */ C7152a(jt3 jt3Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [uy5] */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, uy5] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object create(@p000.yfb p000.uy5 r9, @p000.yfb p000.zy2<? super p000.i58> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof p000.i58.C7152a.a
                if (r0 == 0) goto L13
                r0 = r10
                i58$a$a r0 = (p000.i58.C7152a.a) r0
                int r1 = r0.f45795d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f45795d = r1
                goto L18
            L13:
                i58$a$a r0 = new i58$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f45793b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f45795d
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                java.lang.String r6 = ""
                if (r2 == 0) goto L48
                if (r2 == r5) goto L3e
                if (r2 != r4) goto L36
                java.lang.Object r9 = r0.f45792a
                java.lang.String r9 = (java.lang.String) r9
                p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Exception -> L34
                goto L85
            L34:
                r10 = move-exception
                goto L8c
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f45792a
                uy5 r9 = (p000.uy5) r9
                p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6a
            L48:
                p000.y7e.throwOnFailure(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.getToken(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "getToken(...)"
                p000.md8.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.f45792a = r9     // Catch: java.lang.Exception -> L46
                r0.f45795d = r5     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = p000.ung.await(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                return r1
            L60:
                k58 r10 = (p000.k58) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.getToken()     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L71
            L6a:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r3, r2, r10)
                r10 = r9
                r9 = r6
            L71:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "getId(...)"
                p000.md8.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f45792a = r9     // Catch: java.lang.Exception -> L34
                r0.f45795d = r4     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = p000.ung.await(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L85
                return r1
            L85:
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                if (r10 != 0) goto L8a
                goto L91
            L8a:
                r6 = r10
                goto L91
            L8c:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r3, r0, r10)
            L91:
                i58 r10 = new i58
                r0 = 0
                r10.<init>(r6, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.i58.C7152a.create(uy5, zy2):java.lang.Object");
        }

        private C7152a() {
        }
    }

    public /* synthetic */ i58(String str, String str2, jt3 jt3Var) {
        this(str, str2);
    }

    @yfb
    public final String getAuthToken() {
        return this.f45791b;
    }

    @yfb
    public final String getFid() {
        return this.f45790a;
    }

    private i58(String str, String str2) {
        this.f45790a = str;
        this.f45791b = str2;
    }
}
