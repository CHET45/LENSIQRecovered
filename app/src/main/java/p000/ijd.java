package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ijd implements tog {

    /* JADX INFO: renamed from: a */
    public static final List<Exception> f47208a = Collections.emptyList();

    @Override // p000.tog
    public List<Exception> validateTestClass(rog rogVar) {
        if (rogVar.isPublic()) {
            return f47208a;
        }
        return Collections.singletonList(new Exception("The class " + rogVar.getName() + " is not public."));
    }
}
