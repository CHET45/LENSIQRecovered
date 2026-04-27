package p000;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import p000.e5e;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
@dwf({"SMAP\nTopicsManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,62:1\n314#2,11:63\n*S KotlinDebug\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n*L\n46#1:63,11\n*E\n"})
@p7e({p7e.EnumC10826a.f69934a})
@igg({"NewApi"})
public class h5h extends v4h {

    /* JADX INFO: renamed from: b */
    @yfb
    public final TopicsManager f42427b;

    /* JADX INFO: renamed from: h5h$a */
    @ck3(m4009c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", m4010f = "TopicsManagerImplCommon.kt", m4011i = {}, m4012l = {40}, m4013m = "getTopics$suspendImpl", m4014n = {}, m4015s = {})
    public static final class C6717a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f42428a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f42429b;

        /* JADX INFO: renamed from: d */
        public int f42431d;

        public C6717a(zy2<? super C6717a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f42429b = obj;
            this.f42431d |= Integer.MIN_VALUE;
            return h5h.m12166a(h5h.this, null, this);
        }
    }

    public h5h(@yfb TopicsManager topicsManager) {
        md8.checkNotNullParameter(topicsManager, "mTopicsManager");
        this.f42427b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.ih4
    @p000.j5e("android.permission.ACCESS_ADSERVICES_TOPICS")
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m12166a(p000.h5h r4, p000.g57 r5, p000.zy2<? super p000.m57> r6) {
        /*
            boolean r0 = r6 instanceof p000.h5h.C6717a
            if (r0 == 0) goto L13
            r0 = r6
            h5h$a r0 = (p000.h5h.C6717a) r0
            int r1 = r0.f42431d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42431d = r1
            goto L18
        L13:
            h5h$a r0 = new h5h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f42429b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f42431d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f42428a
            h5h r4 = (p000.h5h) r4
            p000.y7e.throwOnFailure(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.convertRequest$ads_adservices_release(r5)
            r0.f42428a = r4
            r0.f42431d = r3
            java.lang.Object r6 = r4.getTopicsAsyncInternal(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = p000.f5h.m10633a(r6)
            m57 r4 = r4.convertResponse$ads_adservices_release(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h5h.m12166a(h5h, g57, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @j5e("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object getTopicsAsyncInternal(GetTopicsRequest getTopicsRequest, zy2<? super GetTopicsResponse> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        this.f42427b.getTopics(getTopicsRequest, new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @yfb
    public GetTopicsRequest convertRequest$ads_adservices_release(@yfb g57 g57Var) {
        md8.checkNotNullParameter(g57Var, "request");
        return l57.f56197a.convertRequestWithoutRecordObservation$ads_adservices_release(g57Var);
    }

    @yfb
    public m57 convertResponse$ads_adservices_release(@yfb GetTopicsResponse getTopicsResponse) {
        md8.checkNotNullParameter(getTopicsResponse, "response");
        return x57.f96820a.convertResponse$ads_adservices_release(getTopicsResponse);
    }

    @Override // p000.v4h
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_TOPICS")
    public Object getTopics(@yfb g57 g57Var, @yfb zy2<? super m57> zy2Var) {
        return m12166a(this, g57Var, zy2Var);
    }
}
