package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class opd {

    /* JADX INFO: renamed from: a */
    public static final float f68271a = -1.0f;

    /* JADX INFO: renamed from: b */
    public static final int f68272b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f68273c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f68274d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f68275e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f68276f = 3;

    /* JADX INFO: renamed from: g */
    public static final String f68277g = t0i.intToStringMaxRadix(0);

    @ovh
    public static opd fromBundle(Bundle bundle) {
        int i = bundle.getInt(f68277g, -1);
        if (i == 0) {
            return hj7.fromBundle(bundle);
        }
        if (i == 1) {
            return qnc.fromBundle(bundle);
        }
        if (i == 2) {
            return n1g.fromBundle(bundle);
        }
        if (i == 3) {
            return lzg.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i);
    }

    public abstract boolean isRated();

    @ovh
    public abstract Bundle toBundle();
}
