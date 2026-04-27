package p000;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import p000.e5e;
import p000.p7e;

/* JADX INFO: renamed from: if */
/* JADX INFO: loaded from: classes3.dex */
@e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
@dwf({"SMAP\nAdIdManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AdIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon\n*L\n45#1:54,11\n*E\n"})
@p7e({p7e.EnumC10826a.f69934a})
@igg({"ClassVerificationFailure", "NewApi"})
public class C7261if extends AbstractC15036xe {

    /* JADX INFO: renamed from: b */
    @yfb
    public final AdIdManager f46713b;

    /* JADX INFO: renamed from: if$a */
    @ck3(m4009c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", m4010f = "AdIdManagerImplCommon.kt", m4011i = {}, m4012l = {40}, m4013m = "getAdId$suspendImpl", m4014n = {}, m4015s = {})
    public static final class a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f46714a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f46715b;

        /* JADX INFO: renamed from: d */
        public int f46717d;

        public a(zy2<? super a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f46715b = obj;
            this.f46717d |= Integer.MIN_VALUE;
            return C7261if.m12997a(C7261if.this, this);
        }
    }

    public C7261if(@yfb AdIdManager adIdManager) {
        md8.checkNotNullParameter(adIdManager, "mAdIdManager");
        this.f46713b = adIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.ih4
    @p000.j5e("android.permission.ACCESS_ADSERVICES_AD_ID")
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m12997a(p000.C7261if r4, p000.zy2<? super p000.C14563we> r5) {
        /*
            boolean r0 = r5 instanceof p000.C7261if.a
            if (r0 == 0) goto L13
            r0 = r5
            if$a r0 = (p000.C7261if.a) r0
            int r1 = r0.f46717d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46717d = r1
            goto L18
        L13:
            if$a r0 = new if$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f46715b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46717d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f46714a
            if r4 = (p000.C7261if) r4
            p000.y7e.throwOnFailure(r5)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r5)
            r0.f46714a = r4
            r0.f46717d = r3
            java.lang.Object r5 = r4.getAdIdAsyncInternal(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            android.adservices.adid.AdId r5 = p000.C5278ef.m9909a(r5)
            we r4 = r4.convertResponse(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7261if.m12997a(if, zy2):java.lang.Object");
    }

    private final C14563we convertResponse(AdId adId) {
        String adId2 = adId.getAdId();
        md8.checkNotNullExpressionValue(adId2, "response.adId");
        return new C14563we(adId2, adId.isLimitAdTrackingEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @j5e("android.permission.ACCESS_ADSERVICES_AD_ID")
    public final Object getAdIdAsyncInternal(zy2<? super AdId> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        this.f46713b.getAdId(new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @Override // p000.AbstractC15036xe
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_AD_ID")
    public Object getAdId(@yfb zy2<? super C14563we> zy2Var) {
        return m12997a(this, zy2Var);
    }
}
