package p000;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class z4d {

    /* JADX INFO: renamed from: a */
    public static final String f104147a = "PopupWindowCompatApi21";

    /* JADX INFO: renamed from: b */
    public static Method f104148b;

    /* JADX INFO: renamed from: c */
    public static boolean f104149c;

    /* JADX INFO: renamed from: d */
    public static Method f104150d;

    /* JADX INFO: renamed from: e */
    public static boolean f104151e;

    /* JADX INFO: renamed from: f */
    public static Field f104152f;

    /* JADX INFO: renamed from: g */
    public static boolean f104153g;

    /* JADX INFO: renamed from: z4d$a */
    @c5e(23)
    public static class C16003a {
        private C16003a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m26561a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m26562b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m26563c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m26564d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    private z4d() {
    }

    public static boolean getOverlapAnchor(@efb PopupWindow popupWindow) {
        return C16003a.m26561a(popupWindow);
    }

    public static int getWindowLayoutType(@efb PopupWindow popupWindow) {
        return C16003a.m26562b(popupWindow);
    }

    public static void setOverlapAnchor(@efb PopupWindow popupWindow, boolean z) {
        C16003a.m26563c(popupWindow, z);
    }

    public static void setWindowLayoutType(@efb PopupWindow popupWindow, int i) {
        C16003a.m26564d(popupWindow, i);
    }

    public static void showAsDropDown(@efb PopupWindow popupWindow, @efb View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
