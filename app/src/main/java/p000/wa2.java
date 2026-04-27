package p000;

import android.content.res.ColorStateList;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes4.dex */
public class wa2 {

    /* JADX INFO: renamed from: a */
    public static final int f93789a = 16842910;

    /* JADX INFO: renamed from: b */
    public static final int f93790b = 16842912;

    /* JADX INFO: renamed from: c */
    public static final int f93791c = 16842919;

    public static ColorStateList generateBackColorWithTintColor(final int tintColor) {
        int i = tintColor - (-805306368);
        return new ColorStateList(new int[][]{new int[]{-16842910, 16842912}, new int[]{-16842910}, new int[]{16842912, 16842919}, new int[]{-16842912, 16842919}, new int[]{16842912}, new int[]{-16842912}}, new int[]{tintColor - (-520093696), 268435456, i, 536870912, i, 536870912});
    }

    public static ColorStateList generateThumbColorWithTintColor(final int tintColor) {
        int[][] iArr = {new int[]{-16842910, 16842912}, new int[]{-16842910}, new int[]{16842919, -16842912}, new int[]{16842919, 16842912}, new int[]{16842912}, new int[]{-16842912}};
        int i = tintColor - DrawerLayout.f7539E2;
        return new ColorStateList(iArr, new int[]{tintColor - (-1442840576), -4539718, i, i, tintColor | (-16777216), -1118482});
    }
}
