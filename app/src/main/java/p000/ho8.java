package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class ho8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ho8 f44404a = new ho8();

    private ho8() {
    }

    @yfb
    public final <T extends cai> T createViewModel(@yfb Class<T> cls) throws InvocationTargetException {
        md8.checkNotNullParameter(cls, "modelClass");
        try {
            T tNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            md8.checkNotNullExpressionValue(tNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return tNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
