package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class c78 implements mdd {
    @Override // p000.mdd
    public Object createFromBundle(Bundle bundle) {
        return Integer.valueOf(bundle.getInt(cf8.f16414c));
    }

    @Override // p000.mdd
    public boolean writeToBundle(Bundle bundle, Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        bundle.putInt(cf8.f16414c, ((Integer) obj).intValue());
        return true;
    }
}
