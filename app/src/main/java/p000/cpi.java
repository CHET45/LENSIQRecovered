package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class cpi {

    /* JADX INFO: renamed from: a */
    public static final String f26745a = "cpi";

    /* JADX INFO: renamed from: cpi$a */
    public static class C4455a {
        private C4455a() {
        }

        @efb
        /* JADX INFO: renamed from: a */
        public static Rect m8652a(@efb WindowManager windowManager) {
            int i;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            Rect rect = new Rect();
            int i2 = realSizeForDisplay.x;
            if (i2 == 0 || (i = realSizeForDisplay.y) == 0) {
                defaultDisplay.getRectSize(rect);
            } else {
                rect.right = i2;
                rect.bottom = i;
            }
            return rect;
        }

        private static Point getRealSizeForDisplay(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
            } catch (IllegalAccessException e) {
                Log.w(cpi.f26745a, e);
            } catch (NoSuchMethodException e2) {
                Log.w(cpi.f26745a, e2);
            } catch (InvocationTargetException e3) {
                Log.w(cpi.f26745a, e3);
            }
            return point;
        }
    }

    /* JADX INFO: renamed from: cpi$b */
    @c5e(api = 17)
    public static class C4456b {
        private C4456b() {
        }

        @efb
        /* JADX INFO: renamed from: a */
        public static Rect m8653a(@efb WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* JADX INFO: renamed from: cpi$c */
    @c5e(api = 30)
    public static class C4457c {
        private C4457c() {
        }

        @efb
        /* JADX INFO: renamed from: a */
        public static Rect m8654a(@efb WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    private cpi() {
    }

    @efb
    public static Rect getCurrentWindowBounds(@efb Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? C4457c.m8654a(windowManager) : C4456b.m8653a(windowManager);
    }
}
