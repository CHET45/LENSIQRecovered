package p000;

import android.content.Context;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public enum kgg {
    SURFACE_0(C3146R.dimen.m3_sys_elevation_level0),
    SURFACE_1(C3146R.dimen.m3_sys_elevation_level1),
    SURFACE_2(C3146R.dimen.m3_sys_elevation_level2),
    SURFACE_3(C3146R.dimen.m3_sys_elevation_level3),
    SURFACE_4(C3146R.dimen.m3_sys_elevation_level4),
    SURFACE_5(C3146R.dimen.m3_sys_elevation_level5);


    /* JADX INFO: renamed from: a */
    public final int f54033a;

    kgg(@xc4 int i) {
        this.f54033a = i;
    }

    @g92
    public static int getColorForElevation(@efb Context context, @yc4 float f) {
        return new fy4(context).compositeOverlay(ow9.getColor(context, C3146R.attr.colorSurface, 0), f);
    }

    @g92
    public int getColor(@efb Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.f54033a));
    }
}
