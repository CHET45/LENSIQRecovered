package p000;

import android.adservices.appsetid.AppSetIdManager;
import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 31, version = 9)
@p7e({p7e.EnumC10826a.f69934a})
public final class q30 extends z30 {
    /* JADX WARN: Illegal instructions before constructor call */
    public q30(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        AppSetIdManager appSetIdManager = AppSetIdManager.get(context);
        md8.checkNotNullExpressionValue(appSetIdManager, "get(context)");
        super(appSetIdManager);
    }
}
