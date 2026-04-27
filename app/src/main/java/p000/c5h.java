package p000;

import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 1000000, version = 4)
@p7e({p7e.EnumC10826a.f69934a})
public final class c5h extends h5h {
    /* JADX WARN: Illegal instructions before constructor call */
    public c5h(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) z4h.m26565a());
        md8.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(a5h.m159a(systemService));
    }
}
