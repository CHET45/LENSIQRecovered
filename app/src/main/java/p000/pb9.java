package p000;

/* JADX INFO: loaded from: classes6.dex */
public final class pb9 {
    public static dq2 config() {
        return qb9.get().config();
    }

    public static <T> ukb<T> get(@efb String str, @efb Class<T> cls) {
        return qb9.get().with(str, cls);
    }

    public static wmb config(@efb String str) {
        return qb9.get().config(str);
    }

    public static <T> ukb<T> get(@efb String str) {
        return get(str, Object.class);
    }

    public static <T extends ob9> ukb<T> get(@efb Class<T> cls) {
        return get(cls.getName(), cls);
    }
}
