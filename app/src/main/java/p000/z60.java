package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface z60 {

    /* JADX INFO: renamed from: a */
    public static final int f104275a = 65536;

    void clearMemory();

    <T> T get(int i, Class<T> cls);

    <T> T getExact(int i, Class<T> cls);

    <T> void put(T t);

    @Deprecated
    <T> void put(T t, Class<T> cls);

    void trimMemory(int i);
}
