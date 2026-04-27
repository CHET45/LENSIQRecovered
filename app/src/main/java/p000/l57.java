package p000;

import android.adservices.topics.GetTopicsRequest;
import p000.e5e;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
@p7e({p7e.EnumC10826a.f69934a})
public final class l57 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final l57 f56197a = new l57();

    private l57() {
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 5), @e5e(extension = 31, version = 9)})
    @yfb
    public final GetTopicsRequest convertRequestWithRecordObservation$ads_adservices_release(@yfb g57 g57Var) {
        md8.checkNotNullParameter(g57Var, "request");
        GetTopicsRequest getTopicsRequestBuild = k57.m14527a().setAdsSdkName(g57Var.getAdsSdkName()).setShouldRecordObservation(g57Var.shouldRecordObservation()).build();
        md8.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @yfb
    public final GetTopicsRequest convertRequestWithoutRecordObservation$ads_adservices_release(@yfb g57 g57Var) {
        md8.checkNotNullParameter(g57Var, "request");
        GetTopicsRequest getTopicsRequestBuild = k57.m14527a().setAdsSdkName(g57Var.getAdsSdkName()).build();
        md8.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}
