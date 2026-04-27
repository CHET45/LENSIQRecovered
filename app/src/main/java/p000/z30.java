package p000;

import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import p000.e5e;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
@dwf({"SMAP\nAppSetIdManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AppSetIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon\n*L\n42#1:54,11\n*E\n"})
@p7e({p7e.EnumC10826a.f69934a})
@igg({"ClassVerificationFailure", "NewApi"})
public class z30 extends o30 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final AppSetIdManager f103946b;

    /* JADX INFO: renamed from: z30$a */
    @ck3(m4009c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", m4010f = "AppSetIdManagerImplCommon.kt", m4011i = {}, m4012l = {38}, m4013m = "getAppSetId$suspendImpl", m4014n = {}, m4015s = {})
    public static final class C15959a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f103947a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f103948b;

        /* JADX INFO: renamed from: d */
        public int f103950d;

        public C15959a(zy2<? super C15959a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f103948b = obj;
            this.f103950d |= Integer.MIN_VALUE;
            return z30.m26547a(z30.this, this);
        }
    }

    public z30(@yfb AppSetIdManager appSetIdManager) {
        md8.checkNotNullParameter(appSetIdManager, "mAppSetIdManager");
        this.f103946b = appSetIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.ih4
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m26547a(p000.z30 r4, p000.zy2<? super p000.n30> r5) {
        /*
            boolean r0 = r5 instanceof p000.z30.C15959a
            if (r0 == 0) goto L13
            r0 = r5
            z30$a r0 = (p000.z30.C15959a) r0
            int r1 = r0.f103950d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103950d = r1
            goto L18
        L13:
            z30$a r0 = new z30$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f103948b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f103950d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f103947a
            z30 r4 = (p000.z30) r4
            p000.y7e.throwOnFailure(r5)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r5)
            r0.f103947a = r4
            r0.f103950d = r3
            java.lang.Object r5 = r4.getAppSetIdAsyncInternal(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            android.adservices.appsetid.AppSetId r5 = p000.w30.m24325a(r5)
            n30 r4 = r4.convertResponse(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z30.m26547a(z30, zy2):java.lang.Object");
    }

    private final n30 convertResponse(AppSetId appSetId) {
        if (appSetId.getScope() == 1) {
            String id = appSetId.getId();
            md8.checkNotNullExpressionValue(id, "response.id");
            return new n30(id, 1);
        }
        String id2 = appSetId.getId();
        md8.checkNotNullExpressionValue(id2, "response.id");
        return new n30(id2, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAppSetIdAsyncInternal(zy2<? super AppSetId> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        this.f103946b.getAppSetId(new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @Override // p000.o30
    @gib
    @ih4
    public Object getAppSetId(@yfb zy2<? super n30> zy2Var) {
        return m26547a(this, zy2Var);
    }
}
