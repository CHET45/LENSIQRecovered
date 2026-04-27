package p000;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes8.dex */
public class z1i extends Exception {
    public z1i(nw6<?> nw6Var, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", cls.getSimpleName(), nw6Var.getName(), str));
    }
}
