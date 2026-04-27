package p000;

import android.content.Context;
import p000.p7e;

/* JADX INFO: renamed from: cf */
/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 1000000, version = 4)
@p7e({p7e.EnumC10826a.f69934a})
public final class C2295cf extends C7261if {
    /* JADX WARN: Illegal instructions before constructor call */
    public C2295cf(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) C0198af.m446a());
        md8.checkNotNullExpressionValue(systemService, "context.getSystemService….AdIdManager::class.java)");
        super(C1872bf.m3088a(systemService));
    }
}
