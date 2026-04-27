package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class nn0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final nn0 f65059a = new nn0();

    private nn0() {
    }

    @gib
    public final <T> T getManager(@yfb Context context, @yfb String str, @yfb qy6<? super Context, ? extends T> qy6Var) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "tag");
        md8.checkNotNullParameter(qy6Var, "manager");
        try {
            return qy6Var.invoke(context);
        } catch (NoClassDefFoundError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find adservices code, check manifest for uses-library tag, versionS=");
            sb.append(C2307ch.f16504a.extServicesVersionS());
            return null;
        }
    }
}
