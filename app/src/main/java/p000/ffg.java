package p000;

/* JADX INFO: loaded from: classes8.dex */
public class ffg extends ude {
    public boolean hasSuiteMethod(Class<?> cls) {
        try {
            cls.getMethod(ku0.f55318b, null);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    @Override // p000.ude
    public tde runnerForClass(Class<?> cls) throws Throwable {
        if (hasSuiteMethod(cls)) {
            return new efg(cls);
        }
        return null;
    }
}
