package p000;

import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.e5e;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
@dwf({"SMAP\nCustomAudienceManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n314#2,11:160\n*S KotlinDebug\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon\n*L\n44#1:149,11\n67#1:160,11\n*E\n"})
@p7e({p7e.EnumC10826a.f69934a})
@igg({"NewApi", "ClassVerificationFailure"})
public class nc3 extends hb3 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final CustomAudienceManager f63943b;

    /* JADX INFO: renamed from: nc3$a */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    public static final class C9775a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f63944a = new a(null);

        /* JADX INFO: renamed from: nc3$a$a */
        @dwf({"SMAP\nCustomAudienceManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n*S KotlinDebug\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion\n*L\n137#1:149,11\n*E\n"})
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @gib
            @ih4
            @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            public final Object fetchAndJoinCustomAudience(@yfb CustomAudienceManager customAudienceManager, @yfb qq5 qq5Var, @yfb zy2<? super bth> zy2Var) {
                fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
                fq1Var.initCancellability();
                customAudienceManager.fetchAndJoinCustomAudience(qq5Var.convertToAdServices$ads_adservices_release(), new p63(), k8c.asOutcomeReceiver(fq1Var));
                Object result = fq1Var.getResult();
                if (result == pd8.getCOROUTINE_SUSPENDED()) {
                    jk3.probeCoroutineSuspended(zy2Var);
                }
                return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
            }

            private a() {
            }
        }

        private C9775a() {
        }
    }

    public nc3(@yfb CustomAudienceManager customAudienceManager) {
        md8.checkNotNullParameter(customAudienceManager, "customAudienceManager");
        this.f63943b = customAudienceManager;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m17839a(nc3 nc3Var, qq5 qq5Var, zy2<? super bth> zy2Var) {
        C2307ch c2307ch = C2307ch.f16504a;
        if (c2307ch.adServicesVersion() < 10 && c2307ch.extServicesVersionS() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        Object objFetchAndJoinCustomAudience = C9775a.f63944a.fetchAndJoinCustomAudience(nc3Var.f63943b, qq5Var, zy2Var);
        return objFetchAndJoinCustomAudience == pd8.getCOROUTINE_SUSPENDED() ? objFetchAndJoinCustomAudience : bth.f14751a;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m17840c(nc3 nc3Var, vj8 vj8Var, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        nc3Var.m17842b().joinCustomAudience(nc3Var.convertJoinRequest(vj8Var), new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    private final List<AdData> convertAds(List<C12034re> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C12034re> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    private final CustomAudience convertCustomAudience(gb3 gb3Var) {
        CustomAudience.Builder trustedBiddingData = dc3.m9063a().setActivationTime(gb3Var.getActivationTime()).setAds(convertAds(gb3Var.getAds())).setBiddingLogicUri(gb3Var.getBiddingLogicUri()).setBuyer(gb3Var.getBuyer().convertToAdServices$ads_adservices_release()).setDailyUpdateUri(gb3Var.getDailyUpdateUri()).setExpirationTime(gb3Var.getExpirationTime()).setName(gb3Var.getName()).setTrustedBiddingData(convertTrustedSignals(gb3Var.getTrustedBiddingSignals()));
        C1886bh userBiddingSignals = gb3Var.getUserBiddingSignals();
        CustomAudience customAudienceBuild = trustedBiddingData.setUserBiddingSignals(userBiddingSignals != null ? userBiddingSignals.convertToAdServices$ads_adservices_release() : null).build();
        md8.checkNotNullExpressionValue(customAudienceBuild, "Builder()\n            .s…s())\n            .build()");
        return customAudienceBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JoinCustomAudienceRequest convertJoinRequest(vj8 vj8Var) {
        JoinCustomAudienceRequest joinCustomAudienceRequestBuild = cc3.m3890a().setCustomAudience(convertCustomAudience(vj8Var.getCustomAudience())).build();
        md8.checkNotNullExpressionValue(joinCustomAudienceRequestBuild, "Builder()\n            .s…ce))\n            .build()");
        return joinCustomAudienceRequestBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LeaveCustomAudienceRequest convertLeaveRequest(o39 o39Var) {
        LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = ac3.m419a().setBuyer(o39Var.getBuyer().convertToAdServices$ads_adservices_release()).setName(o39Var.getName()).build();
        md8.checkNotNullExpressionValue(leaveCustomAudienceRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return leaveCustomAudienceRequestBuild;
    }

    private final TrustedBiddingData convertTrustedSignals(ijh ijhVar) {
        if (ijhVar == null) {
            return null;
        }
        return bc3.m3031a().setTrustedBiddingKeys(ijhVar.getTrustedBiddingKeys()).setTrustedBiddingUri(ijhVar.getTrustedBiddingUri()).build();
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m17841d(nc3 nc3Var, o39 o39Var, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        nc3Var.m17842b().leaveCustomAudience(nc3Var.convertLeaveRequest(o39Var), new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final CustomAudienceManager m17842b() {
        return this.f63943b;
    }

    @Override // p000.hb3
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object fetchAndJoinCustomAudience(@yfb qq5 qq5Var, @yfb zy2<? super bth> zy2Var) {
        return m17839a(this, qq5Var, zy2Var);
    }

    @Override // p000.hb3
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object joinCustomAudience(@yfb vj8 vj8Var, @yfb zy2<? super bth> zy2Var) {
        return m17840c(this, vj8Var, zy2Var);
    }

    @Override // p000.hb3
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object leaveCustomAudience(@yfb o39 o39Var, @yfb zy2<? super bth> zy2Var) {
        return m17841d(this, o39Var, zy2Var);
    }
}
