package p000;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@c5e(22)
public class ndg {

    /* JADX INFO: renamed from: a */
    public static Method f64078a;

    /* JADX INFO: renamed from: ndg$a */
    @c5e(29)
    public static class C9796a {
        private C9796a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m17857a(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    private ndg() {
    }

    public static int getSlotIndex(int i) {
        if (i == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return C9796a.m17857a(i);
        }
        try {
            if (f64078a == null) {
                Method declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                f64078a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f64078a.invoke(null, Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
