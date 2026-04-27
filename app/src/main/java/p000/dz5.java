package p000;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
@qpf
public final class dz5 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C5024b f31353c = new C5024b(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f31354d = "FirebaseSessions";

    /* JADX INFO: renamed from: a */
    @yfb
    public final lw5 f31355a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final f6f f31356b;

    /* JADX INFO: renamed from: dz5$a */
    @ck3(m4009c = "com.google.firebase.sessions.FirebaseSessions$1", m4010f = "FirebaseSessions.kt", m4011i = {}, m4012l = {51, 55}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nFirebaseSessions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n2632#2,3:85\n*S KotlinDebug\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n*L\n52#1:85,3\n*E\n"})
    public static final class C5023a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f31357a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d6f f31359c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5023a(d6f d6fVar, zy2<? super C5023a> zy2Var) {
            super(2, zy2Var);
            this.f31359c = d6fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(d6f d6fVar, String str, az5 az5Var) {
            Log.w(dz5.f31354d, "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            d6fVar.onAppDelete();
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return dz5.this.new C5023a(this.f31359c, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5023a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f31357a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                p000.y7e.throwOnFailure(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p000.y7e.throwOnFailure(r6)
                goto L2e
            L20:
                p000.y7e.throwOnFailure(r6)
                iz5 r6 = p000.iz5.f48941a
                r5.f31357a = r4
                java.lang.Object r6 = r6.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L92
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L92
                java.lang.Object r1 = r6.next()
                c6f r1 = (p000.c6f) r1
                boolean r1 = r1.isDataCollectionEnabled()
                if (r1 == 0) goto L48
                dz5 r6 = p000.dz5.this
                f6f r6 = p000.dz5.access$getSettings$p(r6)
                r5.f31357a = r3
                java.lang.Object r6 = r6.updateSettings(r5)
                if (r6 != r0) goto L69
                return r0
            L69:
                dz5 r6 = p000.dz5.this
                f6f r6 = p000.dz5.access$getSettings$p(r6)
                boolean r6 = r6.getSessionsEnabled()
                if (r6 != 0) goto L7f
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                p000.wc1.boxInt(r6)
                goto L9b
            L7f:
                dz5 r6 = p000.dz5.this
                lw5 r6 = p000.dz5.access$getFirebaseApp$p(r6)
                d6f r0 = r5.f31359c
                cz5 r1 = new cz5
                r1.<init>()
                r6.addLifecycleEventListener(r1)
                bth r6 = p000.bth.f14751a
                goto L9b
            L92:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                p000.wc1.boxInt(r6)
            L9b:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dz5.C5023a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: dz5$b */
    public static final class C5024b {
        public /* synthetic */ C5024b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dz5 getInstance() {
            Object obj = xy5.getApp(hw5.f45141a).get(dz5.class);
            md8.checkNotNullExpressionValue(obj, "get(...)");
            return (dz5) obj;
        }

        private C5024b() {
        }
    }

    @a28
    public dz5(@yfb lw5 lw5Var, @yfb f6f f6fVar, @ao0 @yfb e13 e13Var, @yfb d6f d6fVar) {
        md8.checkNotNullParameter(lw5Var, "firebaseApp");
        md8.checkNotNullParameter(f6fVar, "settings");
        md8.checkNotNullParameter(e13Var, "backgroundDispatcher");
        md8.checkNotNullParameter(d6fVar, "sessionsActivityLifecycleCallbacks");
        this.f31355a = lw5Var;
        this.f31356b = f6fVar;
        Context applicationContext = lw5Var.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(d6fVar);
            fg1.launch$default(y13.CoroutineScope(e13Var), null, null, new C5023a(d6fVar, null), 3, null);
            return;
        }
        Log.e(f31354d, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + a18.f100c);
    }
}
