package p000;

import android.adservices.adselection.AdSelectionManager;
import android.content.Context;
import p000.p7e;

/* JADX INFO: renamed from: ig */
/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 31, version = 9)
@p7e({p7e.EnumC10826a.f69934a})
public final class C7267ig extends C13535ug {
    /* JADX WARN: Illegal instructions before constructor call */
    public C7267ig(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        AdSelectionManager adSelectionManager = AdSelectionManager.get(context);
        md8.checkNotNullExpressionValue(adSelectionManager, "get(context)");
        super(adSelectionManager);
    }
}
