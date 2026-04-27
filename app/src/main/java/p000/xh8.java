package p000;

/* JADX INFO: loaded from: classes8.dex */
public class xh8 extends ude {
    /* JADX INFO: renamed from: c */
    public boolean m25141c(Class<?> cls) {
        return qog.class.isAssignableFrom(cls);
    }

    @Override // p000.ude
    public tde runnerForClass(Class<?> cls) throws Throwable {
        if (m25141c(cls)) {
            return new wh8(cls);
        }
        return null;
    }
}
