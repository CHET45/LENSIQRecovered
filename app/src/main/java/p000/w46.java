package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class w46 implements mdd {
    @Override // p000.mdd
    public Object createFromBundle(Bundle bundle) {
        return Float.valueOf(bundle.getFloat(cf8.f16414c));
    }

    @Override // p000.mdd
    public boolean writeToBundle(Bundle bundle, Object obj) {
        if (!(obj instanceof Float)) {
            return false;
        }
        bundle.putFloat(cf8.f16414c, ((Float) obj).floatValue());
        return true;
    }
}
