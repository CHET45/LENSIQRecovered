package p000;

import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 1000000, version = 4)
@p7e({p7e.EnumC10826a.f69934a})
public final class t30 extends z30 {
    /* JADX WARN: Illegal instructions before constructor call */
    public t30(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) r30.m20952a());
        md8.checkNotNullExpressionValue(systemService, "context.getSystemService…SetIdManager::class.java)");
        super(s30.m21670a(systemService));
    }
}
