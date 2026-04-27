package p000;

/* JADX INFO: loaded from: classes8.dex */
public class as7 extends ude {
    @Override // p000.ude
    public tde runnerForClass(Class<?> cls) {
        if (cls.getAnnotation(rr7.class) != null) {
            return new bs7(cls);
        }
        return null;
    }
}
