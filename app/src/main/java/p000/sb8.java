package p000;

import java.util.List;
import p000.w4f;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class sb8 {

    /* JADX INFO: renamed from: sb8$a */
    public interface InterfaceC12506a<T> extends w4f.InterfaceC14388b<T> {
    }

    private sb8() {
    }

    @gdi
    public static <T> Iterable<T> getCandidatesViaHardCoded(Class<T> cls, Iterable<Class<?>> iterable) {
        return w4f.m24334a(cls, iterable);
    }

    @gdi
    public static <T> Iterable<T> getCandidatesViaServiceLoader(Class<T> cls, ClassLoader classLoader) {
        return w4f.getCandidatesViaServiceLoader(cls, classLoader);
    }

    public static boolean isAndroid(ClassLoader classLoader) {
        return w4f.m24335b(classLoader);
    }

    public static <T> T load(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, InterfaceC12506a<T> interfaceC12506a) {
        return (T) w4f.load(cls, iterable, classLoader, interfaceC12506a);
    }

    public static <T> List<T> loadAll(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, InterfaceC12506a<T> interfaceC12506a) {
        return w4f.loadAll(cls, iterable, classLoader, interfaceC12506a);
    }
}
