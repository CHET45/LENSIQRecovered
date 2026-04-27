package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.c6f;
import p000.y7b;

/* JADX INFO: loaded from: classes5.dex */
@dwf({"SMAP\nFirebaseSessionsDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,100:1\n462#2:101\n412#2:102\n1246#3,2:103\n1249#3:116\n116#4,11:105\n*S KotlinDebug\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n*L\n75#1:101\n75#1:102\n75#1:103,2\n75#1:116\n76#1:105,11\n*E\n"})
public final class iz5 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final iz5 f48941a = new iz5();

    /* JADX INFO: renamed from: b */
    public static final Map<c6f.EnumC2215a, C7671a> f48942b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: iz5$a */
    public static final class C7671a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final y7b f48943a;

        /* JADX INFO: renamed from: b */
        @gib
        public c6f f48944b;

        public C7671a(@yfb y7b y7bVar, @gib c6f c6fVar) {
            md8.checkNotNullParameter(y7bVar, "mutex");
            this.f48943a = y7bVar;
            this.f48944b = c6fVar;
        }

        public static /* synthetic */ C7671a copy$default(C7671a c7671a, y7b y7bVar, c6f c6fVar, int i, Object obj) {
            if ((i & 1) != 0) {
                y7bVar = c7671a.f48943a;
            }
            if ((i & 2) != 0) {
                c6fVar = c7671a.f48944b;
            }
            return c7671a.copy(y7bVar, c6fVar);
        }

        @yfb
        public final y7b component1() {
            return this.f48943a;
        }

        @gib
        public final c6f component2() {
            return this.f48944b;
        }

        @yfb
        public final C7671a copy(@yfb y7b y7bVar, @gib c6f c6fVar) {
            md8.checkNotNullParameter(y7bVar, "mutex");
            return new C7671a(y7bVar, c6fVar);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7671a)) {
                return false;
            }
            C7671a c7671a = (C7671a) obj;
            return md8.areEqual(this.f48943a, c7671a.f48943a) && md8.areEqual(this.f48944b, c7671a.f48944b);
        }

        @yfb
        public final y7b getMutex() {
            return this.f48943a;
        }

        @gib
        public final c6f getSubscriber() {
            return this.f48944b;
        }

        public int hashCode() {
            int iHashCode = this.f48943a.hashCode() * 31;
            c6f c6fVar = this.f48944b;
            return iHashCode + (c6fVar == null ? 0 : c6fVar.hashCode());
        }

        public final void setSubscriber(@gib c6f c6fVar) {
            this.f48944b = c6fVar;
        }

        @yfb
        public String toString() {
            return "Dependency(mutex=" + this.f48943a + ", subscriber=" + this.f48944b + ')';
        }

        public /* synthetic */ C7671a(y7b y7bVar, c6f c6fVar, int i, jt3 jt3Var) {
            this(y7bVar, (i & 2) != 0 ? null : c6fVar);
        }
    }

    /* JADX INFO: renamed from: iz5$b */
    @ck3(m4009c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", m4010f = "FirebaseSessionsDependencies.kt", m4011i = {0, 0, 0}, m4012l = {110}, m4013m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", m4014n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$2", "L$3"})
    public static final class C7672b extends cz2 {

        /* JADX INFO: renamed from: F */
        public int f48946F;

        /* JADX INFO: renamed from: a */
        public Object f48947a;

        /* JADX INFO: renamed from: b */
        public Object f48948b;

        /* JADX INFO: renamed from: c */
        public Object f48949c;

        /* JADX INFO: renamed from: d */
        public Object f48950d;

        /* JADX INFO: renamed from: e */
        public Object f48951e;

        /* JADX INFO: renamed from: f */
        public Object f48952f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f48953m;

        public C7672b(zy2<? super C7672b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f48953m = obj;
            this.f48946F |= Integer.MIN_VALUE;
            return iz5.this.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
        }
    }

    private iz5() {
    }

    @do8
    public static final void addDependency(@yfb c6f.EnumC2215a enumC2215a) {
        md8.checkNotNullParameter(enumC2215a, "subscriberName");
        Map<c6f.EnumC2215a, C7671a> map = f48942b;
        if (map.containsKey(enumC2215a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dependency ");
            sb.append(enumC2215a);
            sb.append(" already added.");
            return;
        }
        md8.checkNotNullExpressionValue(map, "dependencies");
        map.put(enumC2215a, new C7671a(e8b.Mutex(true), null, 2, 0 == true ? 1 : 0));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dependency to ");
        sb2.append(enumC2215a);
        sb2.append(" added.");
    }

    private final C7671a getDependency(c6f.EnumC2215a enumC2215a) {
        Map<c6f.EnumC2215a, C7671a> map = f48942b;
        md8.checkNotNullExpressionValue(map, "dependencies");
        C7671a c7671a = map.get(enumC2215a);
        if (c7671a != null) {
            md8.checkNotNullExpressionValue(c7671a, "getOrElse(...)");
            return c7671a;
        }
        throw new IllegalStateException("Cannot get dependency " + enumC2215a + ". Dependencies should be added at class load time.");
    }

    @do8
    public static final void register(@yfb c6f c6fVar) {
        md8.checkNotNullParameter(c6fVar, "subscriber");
        c6f.EnumC2215a sessionSubscriberName = c6fVar.getSessionSubscriberName();
        C7671a dependency = f48941a.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Subscriber ");
            sb.append(sessionSubscriberName);
            sb.append(" already registered.");
            return;
        }
        dependency.setSubscriber(c6fVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Subscriber ");
        sb2.append(sessionSubscriberName);
        sb2.append(" registered.");
        y7b.C15538a.unlock$default(dependency.getMutex(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@p000.yfb p000.zy2<? super java.util.Map<p000.c6f.EnumC2215a, ? extends p000.c6f>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p000.iz5.C7672b
            if (r0 == 0) goto L13
            r0 = r11
            iz5$b r0 = (p000.iz5.C7672b) r0
            int r1 = r0.f48946F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48946F = r1
            goto L18
        L13:
            iz5$b r0 = new iz5$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f48953m
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f48946F
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f48952f
            java.lang.Object r5 = r0.f48951e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f48950d
            y7b r6 = (p000.y7b) r6
            java.lang.Object r7 = r0.f48949c
            c6f$a r7 = (p000.c6f.EnumC2215a) r7
            java.lang.Object r8 = r0.f48948b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f48947a
            java.util.Map r9 = (java.util.Map) r9
            p000.y7e.throwOnFailure(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            p000.y7e.throwOnFailure(r11)
            java.util.Map<c6f$a, iz5$a> r11 = p000.iz5.f48942b
            java.lang.String r2 = "dependencies"
            p000.md8.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = p000.wt9.mapCapacity(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            c6f$a r7 = (p000.c6f.EnumC2215a) r7
            java.lang.Object r11 = r11.getValue()
            iz5$a r11 = (p000.iz5.C7671a) r11
            y7b r6 = r11.getMutex()
            r0.f48947a = r5
            r0.f48948b = r8
            r0.f48949c = r7
            r0.f48950d = r6
            r0.f48951e = r5
            r0.f48952f = r2
            r0.f48946F = r3
            java.lang.Object r11 = r6.lock(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            iz5 r11 = p000.iz5.f48941a     // Catch: java.lang.Throwable -> Lb0
            c6f r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.unlock(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.unlock(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iz5.getRegisteredSubscribers$com_google_firebase_firebase_sessions(zy2):java.lang.Object");
    }

    @yfb
    @fdi
    public final c6f getSubscriber$com_google_firebase_firebase_sessions(@yfb c6f.EnumC2215a enumC2215a) {
        md8.checkNotNullParameter(enumC2215a, "subscriberName");
        c6f subscriber = getDependency(enumC2215a).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + enumC2215a + " has not been registered.");
    }

    @fdi
    public final void reset$com_google_firebase_firebase_sessions() {
        f48942b.clear();
    }
}
