package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes8.dex */
public class efg extends wh8 {
    public efg(Class<?> cls) throws Throwable {
        super(testFromSuiteMethod(cls));
    }

    public static pog testFromSuiteMethod(Class<?> cls) throws Exception {
        try {
            Method method = cls.getMethod(ku0.f55318b, null);
            if (Modifier.isStatic(method.getModifiers())) {
                return (pog) method.invoke(null, null);
            }
            throw new Exception(cls.getName() + ".suite() must be static");
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
