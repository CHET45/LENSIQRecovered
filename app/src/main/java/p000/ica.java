package p000;

import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 1000000, version = 5)
@p7e({p7e.EnumC10826a.f69934a})
public final class ica extends qca {
    /* JADX WARN: Illegal instructions before constructor call */
    public ica(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) gca.m11496a());
        md8.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
        super(hca.m12310a(systemService));
    }
}
