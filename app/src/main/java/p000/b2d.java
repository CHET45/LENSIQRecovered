package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class b2d {

    /* JADX INFO: renamed from: b */
    public static final int f12464b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f12465c = 1000;

    /* JADX INFO: renamed from: d */
    public static final int f12466d = 1001;

    /* JADX INFO: renamed from: e */
    public static final int f12467e = 1002;

    /* JADX INFO: renamed from: f */
    public static final int f12468f = 1003;

    /* JADX INFO: renamed from: g */
    public static final int f12469g = 1004;

    /* JADX INFO: renamed from: h */
    public static final int f12470h = 1006;

    /* JADX INFO: renamed from: i */
    public static final int f12471i = 1007;

    /* JADX INFO: renamed from: j */
    public static final int f12472j = 1008;

    /* JADX INFO: renamed from: k */
    public static final int f12473k = 1009;

    /* JADX INFO: renamed from: l */
    public static final int f12474l = 1010;

    /* JADX INFO: renamed from: m */
    public static final int f12475m = 1011;

    /* JADX INFO: renamed from: n */
    public static final int f12476n = 1012;

    /* JADX INFO: renamed from: o */
    public static final int f12477o = 1013;

    /* JADX INFO: renamed from: p */
    public static final int f12478p = 1014;

    /* JADX INFO: renamed from: q */
    public static final int f12479q = 1015;

    /* JADX INFO: renamed from: r */
    public static final int f12480r = 1016;

    /* JADX INFO: renamed from: s */
    public static final int f12481s = 1017;

    /* JADX INFO: renamed from: t */
    public static final int f12482t = 1018;

    /* JADX INFO: renamed from: u */
    public static final int f12483u = 1019;

    /* JADX INFO: renamed from: v */
    public static final int f12484v = 1020;

    /* JADX INFO: renamed from: w */
    public static final int f12485w = 1021;

    /* JADX INFO: renamed from: x */
    public static final int f12486x = 1000;

    /* JADX INFO: renamed from: a */
    public final PointerIcon f12487a;

    /* JADX INFO: renamed from: b2d$a */
    @c5e(24)
    public static class C1705a {
        private C1705a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static PointerIcon m2815a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static PointerIcon m2816b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static PointerIcon m2817c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    private b2d(PointerIcon pointerIcon) {
        this.f12487a = pointerIcon;
    }

    @efb
    public static b2d create(@efb Bitmap bitmap, float f, float f2) {
        return new b2d(C1705a.m2815a(bitmap, f, f2));
    }

    @efb
    public static b2d getSystemIcon(@efb Context context, int i) {
        return new b2d(C1705a.m2816b(context, i));
    }

    @efb
    public static b2d load(@efb Resources resources, int i) {
        return new b2d(C1705a.m2817c(resources, i));
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public Object getPointerIcon() {
        return this.f12487a;
    }
}
