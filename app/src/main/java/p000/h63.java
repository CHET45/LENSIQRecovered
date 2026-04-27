package p000;

import android.content.Context;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class h63 {

    /* JADX INFO: renamed from: a */
    public static final String f42470a = "cct";

    public static h63 create(Context context, g52 g52Var, g52 g52Var2) {
        return new ok0(context, g52Var, g52Var2, "cct");
    }

    public abstract Context getApplicationContext();

    @efb
    public abstract String getBackendName();

    public abstract g52 getMonotonicClock();

    public abstract g52 getWallClock();

    public static h63 create(Context context, g52 g52Var, g52 g52Var2, String str) {
        return new ok0(context, g52Var, g52Var2, str);
    }
}
