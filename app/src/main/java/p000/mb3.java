package p000;

import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"NewApi", "ClassVerificationFailure"})
@e5e(extension = 1000000, version = 4)
@p7e({p7e.EnumC10826a.f69934a})
public final class mb3 extends nc3 {
    /* JADX WARN: Illegal instructions before constructor call */
    public mb3(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) kb3.m14644a());
        md8.checkNotNullExpressionValue(systemService, "context.getSystemService…ger::class.java\n        )");
        super(lb3.m16075a(systemService));
    }
}
