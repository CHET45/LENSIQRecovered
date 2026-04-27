package p000;

import android.content.Context;
import p000.p7e;

/* JADX INFO: renamed from: lg */
/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 1000000, version = 4)
@p7e({p7e.EnumC10826a.f69934a})
public final class C8807lg extends C13535ug {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8807lg(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) C7893jg.m14078a());
        md8.checkNotNullExpressionValue(systemService, "context.getSystemService…ctionManager::class.java)");
        super(C8356kg.m14733a(systemService));
    }
}
