package p000;

import com.blankj.utilcode.util.C2481n;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class k52 {
    private k52() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <T> T deepClone(T t, Type type) {
        try {
            return (T) C2481n.m4242G(C2481n.m4279Y0(t), type);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
