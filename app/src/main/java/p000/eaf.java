package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@qpf
@dwf({"SMAP\nSharedSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedSessionRepository.kt\ncom/google/firebase/sessions/SharedSessionRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n1863#2,2:258\n*S KotlinDebug\n*F\n+ 1 SharedSessionRepository.kt\ncom/google/firebase/sessions/SharedSessionRepositoryImpl\n*L\n199#1:258,2\n*E\n"})
public final class eaf implements daf {

    /* JADX INFO: renamed from: b */
    @yfb
    public final f6f f32378b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final l5f f32379c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final i5f f32380d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final r0h f32381e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final ai3<a5f> f32382f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final scd f32383g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final e13 f32384h;

    /* JADX INFO: renamed from: i */
    public a5f f32385i;

    /* JADX INFO: renamed from: j */
    public boolean f32386j;

    /* JADX INFO: renamed from: k */
    @yfb
    public EnumC5220b f32387k;

    /* JADX INFO: renamed from: l */
    @yfb
    public String f32388l;

    /* JADX INFO: renamed from: eaf$a */
    @ck3(m4009c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", m4010f = "SharedSessionRepository.kt", m4011i = {}, m4012l = {94}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5219a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f32389a;

        /* JADX INFO: renamed from: eaf$a$a */
        @ck3(m4009c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", m4010f = "SharedSessionRepository.kt", m4011i = {}, m4012l = {92}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements kz6<t66<? super a5f>, Throwable, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f32391a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f32392b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f32393c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ eaf f32394d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(eaf eafVar, zy2<? super a> zy2Var) {
                super(3, zy2Var);
                this.f32394d = eafVar;
            }

            @Override // p000.kz6
            public final Object invoke(t66<? super a5f> t66Var, Throwable th, zy2<? super bth> zy2Var) {
                a aVar = new a(this.f32394d, zy2Var);
                aVar.f32392b = t66Var;
                aVar.f32393c = th;
                return aVar.invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f32391a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    t66 t66Var = (t66) this.f32392b;
                    Throwable th = (Throwable) this.f32393c;
                    a5f a5fVar = new a5f(this.f32394d.f32379c.generateNewSession(null), (wzg) null, (Map) null, 4, (jt3) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Init session datastore failed with exception message: ");
                    sb.append(th.getMessage());
                    sb.append(". Emit fallback session ");
                    sb.append(a5fVar.getSessionDetails().getSessionId());
                    this.f32392b = null;
                    this.f32391a = 1;
                    if (t66Var.emit(a5fVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: eaf$a$b */
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ eaf f32395a;

            public b(eaf eafVar) {
                this.f32395a = eafVar;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit((a5f) obj, (zy2<? super bth>) zy2Var);
            }

            public final Object emit(a5f a5fVar, zy2<? super bth> zy2Var) {
                this.f32395a.setLocalSessionData$com_google_firebase_firebase_sessions(a5fVar);
                Object objNotifySubscribers = this.f32395a.notifySubscribers(a5fVar.getSessionDetails().getSessionId(), EnumC5220b.f32396a, zy2Var);
                return objNotifySubscribers == pd8.getCOROUTINE_SUSPENDED() ? objNotifySubscribers : bth.f14751a;
            }
        }

        public C5219a(zy2<? super C5219a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return eaf.this.new C5219a(zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5219a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f32389a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56 y56VarM28222catch = c76.m28222catch(eaf.this.f32382f.getData(), new a(eaf.this, null));
                b bVar = new b(eaf.this);
                this.f32389a = 1;
                if (y56VarM28222catch.collect(bVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: eaf$b */
    public static final class EnumC5220b {

        /* JADX INFO: renamed from: a */
        public static final EnumC5220b f32396a = new EnumC5220b("GENERAL", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC5220b f32397b = new EnumC5220b("FALLBACK", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC5220b[] f32398c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ v35 f32399d;

        private static final /* synthetic */ EnumC5220b[] $values() {
            return new EnumC5220b[]{f32396a, f32397b};
        }

        static {
            EnumC5220b[] enumC5220bArr$values = $values();
            f32398c = enumC5220bArr$values;
            f32399d = x35.enumEntries(enumC5220bArr$values);
        }

        private EnumC5220b(String str, int i) {
        }

        @yfb
        public static v35<EnumC5220b> getEntries() {
            return f32399d;
        }

        public static EnumC5220b valueOf(String str) {
            return (EnumC5220b) Enum.valueOf(EnumC5220b.class, str);
        }

        public static EnumC5220b[] values() {
            return (EnumC5220b[]) f32398c.clone();
        }
    }

    /* JADX INFO: renamed from: eaf$c */
    public /* synthetic */ class C5221c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32400a;

        static {
            int[] iArr = new int[EnumC5220b.values().length];
            try {
                iArr[EnumC5220b.f32396a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5220b.f32397b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32400a = iArr;
        }
    }

    /* JADX INFO: renamed from: eaf$d */
    @ck3(m4009c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", m4010f = "SharedSessionRepository.kt", m4011i = {}, m4012l = {112}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5222d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f32401a;

        /* JADX INFO: renamed from: eaf$d$a */
        @ck3(m4009c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", m4010f = "SharedSessionRepository.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<a5f, zy2<? super a5f>, Object> {

            /* JADX INFO: renamed from: a */
            public int f32403a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f32404b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ eaf f32405c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(eaf eafVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f32405c = eafVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                a aVar = new a(this.f32405c, zy2Var);
                aVar.f32404b = obj;
                return aVar;
            }

            @Override // p000.gz6
            public final Object invoke(a5f a5fVar, zy2<? super a5f> zy2Var) {
                return ((a) create(a5fVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f32403a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                return a5f.copy$default((a5f) this.f32404b, null, this.f32405c.f32381e.currentTime(), null, 5, null);
            }
        }

        public C5222d(zy2<? super C5222d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return eaf.this.new C5222d(zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5222d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f32401a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    ai3 ai3Var = eaf.this.f32382f;
                    a aVar = new a(eaf.this, null);
                    this.f32401a = 1;
                    if (ai3Var.updateData(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("App backgrounded, failed to update data. Message: ");
                sb.append(e.getMessage());
                eaf eafVar = eaf.this;
                eafVar.setLocalSessionData$com_google_firebase_firebase_sessions(a5f.copy$default(eafVar.getLocalSessionData$com_google_firebase_firebase_sessions(), null, eaf.this.f32381e.currentTime(), null, 5, null));
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: eaf$e */
    @ck3(m4009c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", m4010f = "SharedSessionRepository.kt", m4011i = {}, m4012l = {135, 186}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5223e extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f32406a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ a5f f32408c;

        /* JADX INFO: renamed from: eaf$e$a */
        @ck3(m4009c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", m4010f = "SharedSessionRepository.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<a5f, zy2<? super a5f>, Object> {

            /* JADX INFO: renamed from: a */
            public int f32409a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f32410b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ eaf f32411c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(eaf eafVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f32411c = eafVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                a aVar = new a(this.f32411c, zy2Var);
                aVar.f32410b = obj;
                return aVar;
            }

            @Override // p000.gz6
            public final Object invoke(a5f a5fVar, zy2<? super a5f> zy2Var) {
                return ((a) create(a5fVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f32409a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                a5f a5fVar = (a5f) this.f32410b;
                boolean zIsSessionExpired = this.f32411c.isSessionExpired(a5fVar);
                boolean zIsColdStart = this.f32411c.isColdStart(a5fVar);
                boolean zIsMyProcessStale = this.f32411c.isMyProcessStale(a5fVar);
                Map<String, rcd> mapGenerateProcessDataMap = zIsColdStart ? this.f32411c.f32383g.generateProcessDataMap() : zIsMyProcessStale ? this.f32411c.f32383g.updateProcessDataMap(a5fVar.getProcessDataMap()) : a5fVar.getProcessDataMap();
                d5f sessionDetails = zIsColdStart ? null : a5fVar.getSessionDetails();
                if (!zIsSessionExpired && !zIsColdStart) {
                    return zIsMyProcessStale ? a5f.copy$default(a5fVar, null, null, this.f32411c.f32383g.updateProcessDataMap(mapGenerateProcessDataMap), 3, null) : a5fVar;
                }
                d5f d5fVarGenerateNewSession = this.f32411c.f32379c.generateNewSession(sessionDetails);
                this.f32411c.f32380d.mayLogSession(d5fVarGenerateNewSession);
                this.f32411c.f32383g.onSessionGenerated();
                return a5fVar.copy(d5fVarGenerateNewSession, null, mapGenerateProcessDataMap);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5223e(a5f a5fVar, zy2<? super C5223e> zy2Var) {
            super(2, zy2Var);
            this.f32408c = a5fVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return eaf.this.new C5223e(this.f32408c, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5223e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f32406a;
            try {
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("App foregrounded, failed to update data. Message: ");
                sb.append(e.getMessage());
                if (eaf.this.isSessionExpired(this.f32408c)) {
                    d5f d5fVarGenerateNewSession = eaf.this.f32379c.generateNewSession(this.f32408c.getSessionDetails());
                    eaf.this.setLocalSessionData$com_google_firebase_firebase_sessions(a5f.copy$default(this.f32408c, d5fVarGenerateNewSession, null, null, 4, null));
                    eaf.this.f32380d.mayLogSession(d5fVarGenerateNewSession);
                    eaf eafVar = eaf.this;
                    String sessionId = d5fVarGenerateNewSession.getSessionId();
                    EnumC5220b enumC5220b = EnumC5220b.f32397b;
                    this.f32406a = 2;
                    if (eafVar.notifySubscribers(sessionId, enumC5220b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            if (i == 0) {
                y7e.throwOnFailure(obj);
                ai3 ai3Var = eaf.this.f32382f;
                a aVar = new a(eaf.this, null);
                this.f32406a = 1;
                if (ai3Var.updateData(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    return bth.f14751a;
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: eaf$f */
    @ck3(m4009c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", m4010f = "SharedSessionRepository.kt", m4011i = {0, 0}, m4012l = {tpc.f85549b}, m4013m = "notifySubscribers", m4014n = {"sessionId", "type"}, m4015s = {"L$0", "L$1"})
    public static final class C5224f extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f32412a;

        /* JADX INFO: renamed from: b */
        public Object f32413b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f32414c;

        /* JADX INFO: renamed from: e */
        public int f32416e;

        public C5224f(zy2<? super C5224f> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f32414c = obj;
            this.f32416e |= Integer.MIN_VALUE;
            return eaf.this.notifySubscribers(null, null, this);
        }
    }

    @a28
    public eaf(@yfb f6f f6fVar, @yfb l5f l5fVar, @yfb i5f i5fVar, @yfb r0h r0hVar, @yfb ai3<a5f> ai3Var, @yfb scd scdVar, @ao0 @yfb e13 e13Var) {
        md8.checkNotNullParameter(f6fVar, "sessionsSettings");
        md8.checkNotNullParameter(l5fVar, "sessionGenerator");
        md8.checkNotNullParameter(i5fVar, "sessionFirelogPublisher");
        md8.checkNotNullParameter(r0hVar, "timeProvider");
        md8.checkNotNullParameter(ai3Var, "sessionDataStore");
        md8.checkNotNullParameter(scdVar, "processDataManager");
        md8.checkNotNullParameter(e13Var, "backgroundDispatcher");
        this.f32378b = f6fVar;
        this.f32379c = l5fVar;
        this.f32380d = i5fVar;
        this.f32381e = r0hVar;
        this.f32382f = ai3Var;
        this.f32383g = scdVar;
        this.f32384h = e13Var;
        this.f32387k = EnumC5220b.f32396a;
        this.f32388l = "";
        fg1.launch$default(y13.CoroutineScope(e13Var), null, null, new C5219a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isColdStart(a5f a5fVar) {
        Map<String, rcd> processDataMap = a5fVar.getProcessDataMap();
        if (processDataMap != null) {
            return this.f32383g.isColdStart(processDataMap);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMyProcessStale(a5f a5fVar) {
        Map<String, rcd> processDataMap = a5fVar.getProcessDataMap();
        if (processDataMap == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No process data for ");
            sb.append(this.f32383g.getMyProcessName());
            return true;
        }
        boolean zIsMyProcessStale = this.f32383g.isMyProcessStale(processDataMap);
        if (zIsMyProcessStale) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Process ");
            sb2.append(this.f32383g.getMyProcessName());
            sb2.append(" is stale");
        }
        return zIsMyProcessStale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSessionExpired(a5f a5fVar) {
        wzg backgroundTime = a5fVar.getBackgroundTime();
        if (backgroundTime == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Session ");
            sb.append(a5fVar.getSessionDetails().getSessionId());
            sb.append(" has not backgrounded yet");
            return false;
        }
        boolean z = bt4.m28058compareToLRDsOJo(this.f32381e.currentTime().m33148minus5sfh64U(backgroundTime), this.f32378b.m28895getSessionRestartTimeoutUwyO8pc()) > 0;
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Session ");
            sb2.append(a5fVar.getSessionDetails().getSessionId());
            sb2.append(" is expired");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object notifySubscribers(java.lang.String r6, p000.eaf.EnumC5220b r7, p000.zy2<? super p000.bth> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p000.eaf.C5224f
            if (r0 == 0) goto L13
            r0 = r8
            eaf$f r0 = (p000.eaf.C5224f) r0
            int r1 = r0.f32416e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32416e = r1
            goto L18
        L13:
            eaf$f r0 = new eaf$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32414c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32416e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f32413b
            r7 = r6
            eaf$b r7 = (p000.eaf.EnumC5220b) r7
            java.lang.Object r6 = r0.f32412a
            java.lang.String r6 = (java.lang.String) r6
            p000.y7e.throwOnFailure(r8)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            p000.y7e.throwOnFailure(r8)
            r5.f32387k = r7
            java.lang.String r8 = r5.f32388l
            boolean r8 = p000.md8.areEqual(r8, r6)
            if (r8 == 0) goto L4a
            bth r6 = p000.bth.f14751a
            return r6
        L4a:
            r5.f32388l = r6
            iz5 r8 = p000.iz5.f48941a
            r0.f32412a = r6
            r0.f32413b = r7
            r0.f32416e = r3
            java.lang.Object r8 = r8.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L67:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r8.next()
            c6f r0 = (p000.c6f) r0
            c6f$b r1 = new c6f$b
            r1.<init>(r6)
            r0.onSessionChanged(r1)
            int[] r1 = p000.eaf.C5221c.f32400a
            int r2 = r7.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "Notified "
            if (r1 == r3) goto La8
            r4 = 2
            if (r1 != r4) goto La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            c6f$a r0 = r0.getSessionSubscriberName()
            r1.append(r0)
            java.lang.String r0 = " of new fallback session "
            r1.append(r0)
            r1.append(r6)
            goto L67
        La2:
            ceb r6 = new ceb
            r6.<init>()
            throw r6
        La8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            c6f$a r0 = r0.getSessionSubscriberName()
            r1.append(r0)
            java.lang.String r0 = " of new session "
            r1.append(r0)
            r1.append(r6)
            goto L67
        Lc0:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.eaf.notifySubscribers(java.lang.String, eaf$b, zy2):java.lang.Object");
    }

    @Override // p000.daf
    public void appBackground() {
        this.f32386j = false;
        if (this.f32385i == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("App backgrounded on ");
        sb.append(this.f32383g.getMyProcessName());
        fg1.launch$default(y13.CoroutineScope(this.f32384h), null, null, new C5222d(null), 3, null);
    }

    @Override // p000.daf
    public void appForeground() {
        this.f32386j = true;
        if (this.f32385i == null) {
            return;
        }
        a5f localSessionData$com_google_firebase_firebase_sessions = getLocalSessionData$com_google_firebase_firebase_sessions();
        StringBuilder sb = new StringBuilder();
        sb.append("App foregrounded on ");
        sb.append(this.f32383g.getMyProcessName());
        if (isSessionExpired(localSessionData$com_google_firebase_firebase_sessions) || isMyProcessStale(localSessionData$com_google_firebase_firebase_sessions)) {
            fg1.launch$default(y13.CoroutineScope(this.f32384h), null, null, new C5223e(localSessionData$com_google_firebase_firebase_sessions, null), 3, null);
        }
    }

    @yfb
    public final a5f getLocalSessionData$com_google_firebase_firebase_sessions() {
        a5f a5fVar = this.f32385i;
        if (a5fVar != null) {
            return a5fVar;
        }
        md8.throwUninitializedPropertyAccessException("localSessionData");
        return null;
    }

    @yfb
    /* JADX INFO: renamed from: getPreviousNotificationType$com_google_firebase_firebase_sessions */
    public final EnumC5220b m9841xf2d03053() {
        return this.f32387k;
    }

    @Override // p000.daf
    public boolean isInForeground() {
        return this.f32386j;
    }

    public final void setLocalSessionData$com_google_firebase_firebase_sessions(@yfb a5f a5fVar) {
        md8.checkNotNullParameter(a5fVar, "<set-?>");
        this.f32385i = a5fVar;
    }

    /* JADX INFO: renamed from: setPreviousNotificationType$com_google_firebase_firebase_sessions */
    public final void m9842x97c9d05f(@yfb EnumC5220b enumC5220b) {
        md8.checkNotNullParameter(enumC5220b, "<set-?>");
        this.f32387k = enumC5220b;
    }
}
