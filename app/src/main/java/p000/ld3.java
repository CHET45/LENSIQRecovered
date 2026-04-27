package p000;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ld3 {

    /* JADX INFO: renamed from: a */
    public static final int f57229a = -1;

    /* JADX INFO: renamed from: b */
    public static final int f57230b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f57231c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f57232d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f57233e = 4;

    /* JADX INFO: renamed from: f */
    public static final String f57234f = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: g */
    public static final String f57235g = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: h */
    public static final String f57236h = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: i */
    public static final String f57237i = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: j */
    public static final String f57238j = t0i.intToStringMaxRadix(4);

    private ld3() {
    }

    public static ArrayList<Bundle> bundleCustomSpans(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (mce mceVar : (mce[]) spanned.getSpans(0, spanned.length(), mce.class)) {
            arrayList.add(spanToBundle(spanned, mceVar, 1, mceVar.toBundle()));
        }
        for (frg frgVar : (frg[]) spanned.getSpans(0, spanned.length(), frg.class)) {
            arrayList.add(spanToBundle(spanned, frgVar, 2, frgVar.toBundle()));
        }
        for (ql7 ql7Var : (ql7[]) spanned.getSpans(0, spanned.length(), ql7.class)) {
            arrayList.add(spanToBundle(spanned, ql7Var, 3, null));
        }
        for (yfi yfiVar : (yfi[]) spanned.getSpans(0, spanned.length(), yfi.class)) {
            arrayList.add(spanToBundle(spanned, yfiVar, 4, yfiVar.toBundle()));
        }
        return arrayList;
    }

    private static Bundle spanToBundle(Spanned spanned, Object obj, int i, @hib Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f57234f, spanned.getSpanStart(obj));
        bundle2.putInt(f57235g, spanned.getSpanEnd(obj));
        bundle2.putInt(f57236h, spanned.getSpanFlags(obj));
        bundle2.putInt(f57237i, i);
        if (bundle != null) {
            bundle2.putBundle(f57238j, bundle);
        }
        return bundle2;
    }

    public static void unbundleAndApplyCustomSpan(Bundle bundle, Spannable spannable) {
        int i = bundle.getInt(f57234f);
        int i2 = bundle.getInt(f57235g);
        int i3 = bundle.getInt(f57236h);
        int i4 = bundle.getInt(f57237i, -1);
        Bundle bundle2 = bundle.getBundle(f57238j);
        if (i4 == 1) {
            spannable.setSpan(mce.fromBundle((Bundle) v80.checkNotNull(bundle2)), i, i2, i3);
            return;
        }
        if (i4 == 2) {
            spannable.setSpan(frg.fromBundle((Bundle) v80.checkNotNull(bundle2)), i, i2, i3);
        } else if (i4 == 3) {
            spannable.setSpan(new ql7(), i, i2, i3);
        } else {
            if (i4 != 4) {
                return;
            }
            spannable.setSpan(yfi.fromBundle((Bundle) v80.checkNotNull(bundle2)), i, i2, i3);
        }
    }
}
