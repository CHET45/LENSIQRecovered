package p000;

import android.content.ContentResolver;
import android.provider.Settings;
import p000.p7e;

/* JADX INFO: renamed from: cz */
/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class C4567cz {

    /* JADX INFO: renamed from: a */
    public static float f28066a = 1.0f;

    @fdi
    public static void setDefaultSystemAnimatorDurationScale(float f) {
        f28066a = f;
    }

    public float getSystemAnimatorDurationScale(@efb ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
