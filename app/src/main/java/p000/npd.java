package p000;

import android.os.Bundle;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class npd implements gh1 {

    /* JADX INFO: renamed from: a */
    public static final float f65206a = -1.0f;

    /* JADX INFO: renamed from: b */
    public static final int f65207b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f65208c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f65209d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f65210e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f65211f = 3;

    /* JADX INFO: renamed from: m */
    public static final String f65212m = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: C */
    public static final gh1.InterfaceC6311a<npd> f65205C = new gh1.InterfaceC6311a() { // from class: mpd
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return npd.fromBundle(bundle);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static npd fromBundle(Bundle bundle) {
        int i = bundle.getInt(f65212m, -1);
        if (i == 0) {
            return (npd) gj7.f39936Q.fromBundle(bundle);
        }
        if (i == 1) {
            return (npd) pnc.f71500M.fromBundle(bundle);
        }
        if (i == 2) {
            return (npd) m1g.f59656X.fromBundle(bundle);
        }
        if (i == 3) {
            return (npd) kzg.f55734Q.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i);
    }

    public abstract boolean isRated();
}
