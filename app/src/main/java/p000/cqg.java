package p000;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class cqg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final cqg f27109a = new cqg();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final Layout.Alignment f27110b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final Layout.Alignment f27111c;

    /* JADX INFO: renamed from: d */
    public static final int f27112d = 0;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (md8.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (md8.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f27110b = alignment;
        f27111c = alignment2;
    }

    private cqg() {
    }

    @yfb
    public final Layout.Alignment get(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : f27111c : f27110b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
