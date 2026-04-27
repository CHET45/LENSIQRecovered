package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
@qpf
public final class e7f implements c7f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f32051a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final r0h f32052b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ai3<y4f> f32053c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final AtomicReference<y4f> f32054d;

    /* JADX INFO: renamed from: e7f$a */
    @ck3(m4009c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", m4010f = "SettingsCache.kt", m4011i = {}, m4012l = {73}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5161a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f32055a;

        /* JADX INFO: renamed from: e7f$a$a */
        public /* synthetic */ class a implements t66, g07 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AtomicReference<y4f> f32057a;

            public a(AtomicReference<y4f> atomicReference) {
                this.f32057a = atomicReference;
            }

            public final Object emit(y4f y4fVar, zy2<? super bth> zy2Var) {
                Object objInvokeSuspend$set = C5161a.invokeSuspend$set(this.f32057a, y4fVar, zy2Var);
                return objInvokeSuspend$set == pd8.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$set : bth.f14751a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof t66) && (obj instanceof g07)) {
                    return md8.areEqual(getFunctionDelegate(), ((g07) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p000.g07
            public final uy6<?> getFunctionDelegate() {
                return new C8813lh(2, this.f32057a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit((y4f) obj, (zy2<? super bth>) zy2Var);
            }
        }

        public C5161a(zy2<? super C5161a> zy2Var) {
            super(2, zy2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$set(AtomicReference atomicReference, y4f y4fVar, zy2 zy2Var) {
            atomicReference.set(y4fVar);
            return bth.f14751a;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return e7f.this.new C5161a(zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5161a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f32055a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56 data = e7f.this.f32053c.getData();
                a aVar = new a(e7f.this.f32054d);
                this.f32055a = 1;
                if (data.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: e7f$b */
    @ck3(m4009c = "com.google.firebase.sessions.settings.SettingsCacheImpl", m4010f = "SettingsCache.kt", m4011i = {}, m4012l = {107}, m4013m = "removeConfigs$com_google_firebase_firebase_sessions", m4014n = {}, m4015s = {})
    public static final class C5162b extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32058a;

        /* JADX INFO: renamed from: c */
        public int f32060c;

        public C5162b(zy2<? super C5162b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f32058a = obj;
            this.f32060c |= Integer.MIN_VALUE;
            return e7f.this.removeConfigs$com_google_firebase_firebase_sessions(this);
        }
    }

    /* JADX INFO: renamed from: e7f$c */
    @ck3(m4009c = "com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2", m4010f = "SettingsCache.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5163c extends ugg implements gz6<y4f, zy2<? super y4f>, Object> {

        /* JADX INFO: renamed from: a */
        public int f32061a;

        public C5163c(zy2<? super C5163c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C5163c(zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(y4f y4fVar, zy2<? super y4f> zy2Var) {
            return ((C5163c) create(y4fVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f32061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return z4f.f104155a.getDefaultValue();
        }
    }

    /* JADX INFO: renamed from: e7f$d */
    @ck3(m4009c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", m4010f = "SettingsCache.kt", m4011i = {}, m4012l = {64}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5164d extends ugg implements gz6<x13, zy2<? super y4f>, Object> {

        /* JADX INFO: renamed from: a */
        public int f32062a;

        public C5164d(zy2<? super C5164d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return e7f.this.new C5164d(zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super y4f> zy2Var) {
            return ((C5164d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f32062a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56 data = e7f.this.f32053c.getData();
                this.f32062a = 1;
                obj = c76.first(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: e7f$e */
    @ck3(m4009c = "com.google.firebase.sessions.settings.SettingsCacheImpl", m4010f = "SettingsCache.kt", m4011i = {}, m4012l = {98}, m4013m = "updateConfigs", m4014n = {}, m4015s = {})
    public static final class C5165e extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32064a;

        /* JADX INFO: renamed from: c */
        public int f32066c;

        public C5165e(zy2<? super C5165e> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f32064a = obj;
            this.f32066c |= Integer.MIN_VALUE;
            return e7f.this.updateConfigs(null, this);
        }
    }

    /* JADX INFO: renamed from: e7f$f */
    @ck3(m4009c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", m4010f = "SettingsCache.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5166f extends ugg implements gz6<y4f, zy2<? super y4f>, Object> {

        /* JADX INFO: renamed from: a */
        public int f32067a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y4f f32068b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5166f(y4f y4fVar, zy2<? super C5166f> zy2Var) {
            super(2, zy2Var);
            this.f32068b = y4fVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C5166f(this.f32068b, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(y4f y4fVar, zy2<? super y4f> zy2Var) {
            return ((C5166f) create(y4fVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f32067a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return this.f32068b;
        }
    }

    @a28
    public e7f(@ao0 @yfb e13 e13Var, @yfb r0h r0hVar, @yfb ai3<y4f> ai3Var) {
        md8.checkNotNullParameter(e13Var, "backgroundDispatcher");
        md8.checkNotNullParameter(r0hVar, "timeProvider");
        md8.checkNotNullParameter(ai3Var, "sessionConfigsDataStore");
        this.f32051a = e13Var;
        this.f32052b = r0hVar;
        this.f32053c = ai3Var;
        this.f32054d = new AtomicReference<>();
        fg1.launch$default(y13.CoroutineScope(e13Var), null, null, new C5161a(null), 3, null);
    }

    private final y4f getSessionConfigs() {
        if (this.f32054d.get() == null) {
            v7b.m23844a(this.f32054d, null, eg1.runBlocking$default(null, new C5164d(null), 1, null));
        }
        y4f y4fVar = this.f32054d.get();
        md8.checkNotNullExpressionValue(y4fVar, "get(...)");
        return y4fVar;
    }

    @Override // p000.c7f
    public boolean hasCacheExpired() {
        Long cacheUpdatedTimeSeconds = getSessionConfigs().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = getSessionConfigs().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.f32052b.currentTime().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    @p000.fdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object removeConfigs$com_google_firebase_firebase_sessions(@p000.yfb p000.zy2<java.lang.Object> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.e7f.C5162b
            if (r0 == 0) goto L13
            r0 = r6
            e7f$b r0 = (p000.e7f.C5162b) r0
            int r1 = r0.f32060c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32060c = r1
            goto L18
        L13:
            e7f$b r0 = new e7f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32058a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32060c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.y7e.throwOnFailure(r6)     // Catch: java.io.IOException -> L29
            goto L62
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            p000.y7e.throwOnFailure(r6)
            ai3<y4f> r6 = r5.f32053c     // Catch: java.io.IOException -> L29
            e7f$c r2 = new e7f$c     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r4)     // Catch: java.io.IOException -> L29
            r0.f32060c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r6.updateData(r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L62
            return r1
        L47:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove config values: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "FirebaseSessions"
            int r6 = android.util.Log.w(r0, r6)
            java.lang.Integer r6 = p000.wc1.boxInt(r6)
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e7f.removeConfigs$com_google_firebase_firebase_sessions(zy2):java.lang.Object");
    }

    @Override // p000.c7f
    @gib
    public Integer sessionRestartTimeout() {
        return getSessionConfigs().getSessionTimeoutSeconds();
    }

    @Override // p000.c7f
    @gib
    public Double sessionSamplingRate() {
        return getSessionConfigs().getSessionSamplingRate();
    }

    @Override // p000.c7f
    @gib
    public Boolean sessionsEnabled() {
        return getSessionConfigs().getSessionsEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.c7f
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateConfigs(@p000.yfb p000.y4f r6, @p000.yfb p000.zy2<? super p000.bth> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.e7f.C5165e
            if (r0 == 0) goto L13
            r0 = r7
            e7f$e r0 = (p000.e7f.C5165e) r0
            int r1 = r0.f32066c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32066c = r1
            goto L18
        L13:
            e7f$e r0 = new e7f$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32064a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32066c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.y7e.throwOnFailure(r7)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            p000.y7e.throwOnFailure(r7)
            ai3<y4f> r7 = r5.f32053c     // Catch: java.io.IOException -> L29
            e7f$f r2 = new e7f$f     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L29
            r0.f32066c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r7.updateData(r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to update config values: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L5d:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e7f.updateConfigs(y4f, zy2):java.lang.Object");
    }
}
