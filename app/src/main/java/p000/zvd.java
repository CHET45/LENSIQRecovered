package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zvd {
    /* JADX INFO: renamed from: a */
    public abstract Object mo12819a() throws Throwable;

    public Object run() throws Throwable {
        try {
            return mo12819a();
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }
}
