package p000;

import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: jz */
/* JADX INFO: loaded from: classes8.dex */
public class C8145jz extends ude {

    /* JADX INFO: renamed from: c */
    public static final String f52258c = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";

    /* JADX INFO: renamed from: b */
    public final ude f52259b;

    public C8145jz(ude udeVar) {
        this.f52259b = udeVar;
    }

    private Class<?> getEnclosingClassForNonStaticMemberClass(Class<?> cls) {
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public tde buildRunner(Class<? extends tde> cls, Class<?> cls2) throws Exception {
        try {
            try {
                return cls.getConstructor(Class.class).newInstance(cls2);
            } catch (NoSuchMethodException unused) {
                return cls.getConstructor(Class.class, ude.class).newInstance(cls2, this.f52259b);
            }
        } catch (NoSuchMethodException unused2) {
            String simpleName = cls.getSimpleName();
            throw new o18(String.format(f52258c, simpleName, simpleName));
        }
    }

    @Override // p000.ude
    public tde runnerForClass(Class<?> cls) throws Exception {
        Class<?> enclosingClassForNonStaticMemberClass = cls;
        while (enclosingClassForNonStaticMemberClass != null) {
            kde kdeVar = (kde) enclosingClassForNonStaticMemberClass.getAnnotation(kde.class);
            if (kdeVar != null) {
                return buildRunner(kdeVar.value(), cls);
            }
            enclosingClassForNonStaticMemberClass = getEnclosingClassForNonStaticMemberClass(enclosingClassForNonStaticMemberClass);
        }
        return null;
    }
}
