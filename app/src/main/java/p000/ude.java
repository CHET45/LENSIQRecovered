package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ude {

    /* JADX INFO: renamed from: a */
    public final Set<Class<?>> f87761a = new HashSet();

    /* JADX INFO: renamed from: a */
    public Class<?> m23276a(Class<?> cls) throws o18 {
        if (this.f87761a.add(cls)) {
            return cls;
        }
        throw new o18(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
    }

    /* JADX INFO: renamed from: b */
    public void m23277b(Class<?> cls) {
        this.f87761a.remove(cls);
    }

    public abstract tde runnerForClass(Class<?> cls) throws Throwable;

    public List<tde> runners(Class<?> cls, Class<?>[] clsArr) throws o18 {
        m23276a(cls);
        try {
            return runners(clsArr);
        } finally {
            m23277b(cls);
        }
    }

    public tde safeRunnerForClass(Class<?> cls) {
        try {
            return runnerForClass(cls);
        } catch (Throwable th) {
            return new h55(cls, th);
        }
    }

    public List<tde> runners(Class<?> cls, List<Class<?>> list) throws o18 {
        return runners(cls, (Class<?>[]) list.toArray(new Class[0]));
    }

    private List<tde> runners(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clsArr) {
            tde tdeVarSafeRunnerForClass = safeRunnerForClass(cls);
            if (tdeVarSafeRunnerForClass != null) {
                arrayList.add(tdeVarSafeRunnerForClass);
            }
        }
        return arrayList;
    }
}
