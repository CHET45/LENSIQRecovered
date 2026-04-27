package p000;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 31, version = 9)
@p7e({p7e.EnumC10826a.f69934a})
public final class y4h extends h5h {
    /* JADX WARN: Illegal instructions before constructor call */
    public y4h(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        TopicsManager topicsManager = TopicsManager.get(context);
        md8.checkNotNullExpressionValue(topicsManager, "get(context)");
        super(topicsManager);
    }

    @Override // p000.h5h
    @yfb
    public GetTopicsRequest convertRequest$ads_adservices_release(@yfb g57 g57Var) {
        md8.checkNotNullParameter(g57Var, "request");
        return l57.f56197a.convertRequestWithRecordObservation$ads_adservices_release(g57Var);
    }
}
