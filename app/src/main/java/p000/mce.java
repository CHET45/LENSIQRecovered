package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class mce implements eu8 {

    /* JADX INFO: renamed from: c */
    public static final String f60561c = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: d */
    public static final String f60562d = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: a */
    public final String f60563a;

    /* JADX INFO: renamed from: b */
    public final int f60564b;

    public mce(String str, int i) {
        this.f60563a = str;
        this.f60564b = i;
    }

    public static mce fromBundle(Bundle bundle) {
        return new mce((String) v80.checkNotNull(bundle.getString(f60561c)), bundle.getInt(f60562d));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(f60561c, this.f60563a);
        bundle.putInt(f60562d, this.f60564b);
        return bundle;
    }
}
