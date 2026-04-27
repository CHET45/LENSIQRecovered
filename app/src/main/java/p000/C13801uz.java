package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: uz */
/* JADX INFO: loaded from: classes8.dex */
public class C13801uz {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap<w1i, AbstractC13291tz> f89532a = new ConcurrentHashMap<>();

    public AbstractC13291tz createAnnotationValidator(w1i w1iVar) {
        ConcurrentHashMap<w1i, AbstractC13291tz> concurrentHashMap = f89532a;
        AbstractC13291tz abstractC13291tz = concurrentHashMap.get(w1iVar);
        if (abstractC13291tz != null) {
            return abstractC13291tz;
        }
        Class<? extends AbstractC13291tz> clsValue = w1iVar.value();
        if (clsValue == null) {
            throw new IllegalArgumentException("Can't create validator, value is null in annotation " + w1iVar.getClass().getName());
        }
        try {
            concurrentHashMap.putIfAbsent(w1iVar, clsValue.newInstance());
            return concurrentHashMap.get(w1iVar);
        } catch (Exception e) {
            throw new RuntimeException("Exception received when creating AnnotationValidator class " + clsValue.getName(), e);
        }
    }
}
