package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class ss1 extends AbstractC13291tz {

    /* JADX INFO: renamed from: b */
    public static final Set<Class<? extends Annotation>> f82735b = Collections.unmodifiableSet(new HashSet(Arrays.asList(lx0.class, InterfaceC5330ej.class, kx0.class, InterfaceC4798dj.class)));

    private void addErrorMessage(List<Exception> list, Class<?> cls) {
        list.add(new Exception(String.format("@%s can not be combined with @Category", cls.getSimpleName())));
    }

    @Override // p000.AbstractC13291tz
    public List<Exception> validateAnnotatedMethod(ow6 ow6Var) {
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : ow6Var.getAnnotations()) {
            for (Class<? extends Annotation> cls : f82735b) {
                if (annotation.annotationType().isAssignableFrom(cls)) {
                    addErrorMessage(arrayList, cls);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
