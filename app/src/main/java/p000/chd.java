package p000;

import android.adservices.signals.ProtectedSignalsManager;
import android.adservices.signals.UpdateSignalsRequest;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15650c
@dwf({"SMAP\nProtectedSignalsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectedSignalsManagerImpl.kt\nandroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,55:1\n314#2,11:56\n*S KotlinDebug\n*F\n+ 1 ProtectedSignalsManagerImpl.kt\nandroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl\n*L\n40#1:56,11\n*E\n"})
@p7e({p7e.EnumC10826a.f69934a})
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 1000000, version = 12)
public class chd extends wgd {

    /* JADX INFO: renamed from: c */
    @yfb
    public final ProtectedSignalsManager f16562c;

    public chd(@yfb ProtectedSignalsManager protectedSignalsManager) {
        md8.checkNotNullParameter(protectedSignalsManager, "protectedSignalsManager");
        this.f16562c = protectedSignalsManager;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m3942a(chd chdVar, lwh lwhVar, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        chdVar.f16562c.updateSignals(chdVar.convertUpdateRequest(lwhVar), new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateSignalsRequest convertUpdateRequest(lwh lwhVar) {
        bhd.m3181a();
        UpdateSignalsRequest updateSignalsRequestBuild = ahd.m584a(lwhVar.getUpdateUri()).build();
        md8.checkNotNullExpressionValue(updateSignalsRequestBuild, "Builder(request.updateUri).build()");
        return updateSignalsRequestBuild;
    }

    @Override // p000.wgd
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    public Object updateSignals(@yfb lwh lwhVar, @yfb zy2<? super bth> zy2Var) {
        return m3942a(this, lwhVar, zy2Var);
    }
}
