package p000;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.content.Context;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 1000000, version = 11)
@p7e({p7e.EnumC10826a.f69934a})
public final class b5h extends h5h {
    /* JADX WARN: Illegal instructions before constructor call */
    public b5h(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) z4h.m26565a());
        md8.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(a5h.m159a(systemService));
    }

    @Override // p000.h5h
    @yfb
    public GetTopicsRequest convertRequest$ads_adservices_release(@yfb g57 g57Var) {
        md8.checkNotNullParameter(g57Var, "request");
        return l57.f56197a.convertRequestWithRecordObservation$ads_adservices_release(g57Var);
    }

    @Override // p000.h5h
    @yfb
    @yg5.InterfaceC15649b
    public m57 convertResponse$ads_adservices_release(@yfb GetTopicsResponse getTopicsResponse) {
        md8.checkNotNullParameter(getTopicsResponse, "response");
        return x57.f96820a.convertResponseWithEncryptedTopics$ads_adservices_release(getTopicsResponse);
    }
}
