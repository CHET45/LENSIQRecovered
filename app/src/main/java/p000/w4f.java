package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes7.dex */
public final class w4f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: w4f$a */
    public class C14387a<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC14388b f93257a;

        public C14387a(InterfaceC14388b interfaceC14388b) {
            this.f93257a = interfaceC14388b;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            int priority = this.f93257a.getPriority(t) - this.f93257a.getPriority(t2);
            return priority != 0 ? priority : t.getClass().getName().compareTo(t2.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: w4f$b */
    public interface InterfaceC14388b<T> {
        int getPriority(T t);

        boolean isAvailable(T t);
    }

    private w4f() {
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static <T> Iterable<T> m24334a(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            Object objCreateForHardCoded = createForHardCoded(cls, it.next());
            if (objCreateForHardCoded != null) {
                arrayList.add(objCreateForHardCoded);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m24335b(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static <T> T createForHardCoded(Class<T> cls, Class<?> cls2) {
        try {
            return (T) cls2.asSubclass(cls).getConstructor(null).newInstance(null);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }

    @gdi
    public static <T> Iterable<T> getCandidatesViaServiceLoader(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
        return !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
    }

    public static <T> T load(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, InterfaceC14388b<T> interfaceC14388b) {
        List listLoadAll = loadAll(cls, iterable, classLoader, interfaceC14388b);
        if (listLoadAll.isEmpty()) {
            return null;
        }
        return (T) listLoadAll.get(0);
    }

    public static <T> List<T> loadAll(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, InterfaceC14388b<T> interfaceC14388b) {
        Iterable iterableM24334a = m24335b(classLoader) ? m24334a(cls, iterable) : getCandidatesViaServiceLoader(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        for (T t : iterableM24334a) {
            if (interfaceC14388b.isAvailable(t)) {
                arrayList.add(t);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new C14387a(interfaceC14388b)));
        return Collections.unmodifiableList(arrayList);
    }
}
