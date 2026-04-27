package p000;

import android.adservices.adid.AdIdManager;
import android.content.Context;
import p000.p7e;

/* JADX INFO: renamed from: ze */
/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 31, version = 9)
@p7e({p7e.EnumC10826a.f69934a})
public final class C16100ze extends C7261if {
    /* JADX WARN: Illegal instructions before constructor call */
    public C16100ze(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        AdIdManager adIdManager = AdIdManager.get(context);
        md8.checkNotNullExpressionValue(adIdManager, "get(context)");
        super(adIdManager);
    }
}
