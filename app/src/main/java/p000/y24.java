package p000;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@by4
public final class y24 {

    /* JADX INFO: renamed from: a */
    public static final Double f100131a = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: b */
    public static final Float f100132b = Float.valueOf(0.0f);

    private y24() {
    }

    @wx1
    public static <T> T defaultValue(Class<T> cls) {
        v7d.checkNotNull(cls);
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f100132b;
        }
        if (cls == Double.TYPE) {
            return (T) f100131a;
        }
        return null;
    }
}
