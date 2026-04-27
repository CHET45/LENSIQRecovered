package p000;

import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n*L\n495#1:539,10\n*E\n"})
public abstract class cde {

    /* JADX INFO: renamed from: a */
    @yfb
    public final y7b f16299a = e8b.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: b */
    @yfb
    public final ve2<bth> f16300b = xe2.CompletableDeferred$default(null, 1, null);

    /* JADX INFO: renamed from: cde$a */
    @ck3(m4009c = "androidx.datastore.core.RunOnce", m4010f = "DataStoreImpl.kt", m4011i = {0, 0, 1, 1}, m4012l = {Videoio.CAP_PROP_XI_TRG_DELAY, 497}, m4013m = "runIfNeeded", m4014n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C2280a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f16301a;

        /* JADX INFO: renamed from: b */
        public Object f16302b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16303c;

        /* JADX INFO: renamed from: e */
        public int f16305e;

        public C2280a(zy2<? super C2280a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f16303c = obj;
            this.f16305e |= Integer.MIN_VALUE;
            return cde.this.runIfNeeded(this);
        }
    }

    @gib
    /* JADX INFO: renamed from: a */
    public abstract Object mo3903a(@yfb zy2<? super bth> zy2Var);

    @gib
    public final Object awaitComplete(@yfb zy2<? super bth> zy2Var) {
        Object objAwait = this.f16300b.await(zy2Var);
        return objAwait == pd8.getCOROUTINE_SUSPENDED() ? objAwait : bth.f14751a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runIfNeeded(@p000.yfb p000.zy2<? super p000.bth> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p000.cde.C2280a
            if (r0 == 0) goto L13
            r0 = r7
            cde$a r0 = (p000.cde.C2280a) r0
            int r1 = r0.f16305e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16305e = r1
            goto L18
        L13:
            cde$a r0 = new cde$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16303c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16305e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f16302b
            y7b r1 = (p000.y7b) r1
            java.lang.Object r0 = r0.f16301a
            cde r0 = (p000.cde) r0
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.f16302b
            y7b r2 = (p000.y7b) r2
            java.lang.Object r4 = r0.f16301a
            cde r4 = (p000.cde) r4
            p000.y7e.throwOnFailure(r7)
            r7 = r2
            goto L6a
        L4c:
            p000.y7e.throwOnFailure(r7)
            ve2<bth> r7 = r6.f16300b
            boolean r7 = r7.isCompleted()
            if (r7 == 0) goto L5a
            bth r7 = p000.bth.f14751a
            return r7
        L5a:
            y7b r7 = r6.f16299a
            r0.f16301a = r6
            r0.f16302b = r7
            r0.f16305e = r4
            java.lang.Object r2 = r7.lock(r5, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r4 = r6
        L6a:
            ve2<bth> r2 = r4.f16300b     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            bth r0 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L78
            r7.unlock(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.f16301a = r4     // Catch: java.lang.Throwable -> L78
            r0.f16302b = r7     // Catch: java.lang.Throwable -> L78
            r0.f16305e = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.mo3903a(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            ve2<bth> r7 = r0.f16300b     // Catch: java.lang.Throwable -> L35
            bth r0 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L35
            r7.complete(r0)     // Catch: java.lang.Throwable -> L35
            r1.unlock(r5)
            return r0
        L96:
            r1.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cde.runIfNeeded(zy2):java.lang.Object");
    }
}
