package p000;

import android.adservices.customaudience.CustomAudienceManager;
import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 31, version = 9)
@p7e({p7e.EnumC10826a.f69934a})
public final class jb3 extends nc3 {
    /* JADX WARN: Illegal instructions before constructor call */
    public jb3(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        CustomAudienceManager customAudienceManager = CustomAudienceManager.get(context);
        md8.checkNotNullExpressionValue(customAudienceManager, "get(context)");
        super(customAudienceManager);
    }
}
