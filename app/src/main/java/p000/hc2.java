package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public abstract class hc2 {
    public static hc2 compile(String pattern) {
        return rwc.m21588a(pattern);
    }

    public static boolean isPcreLike() {
        return rwc.m21593f();
    }

    public abstract int flags();

    public abstract gc2 matcher(CharSequence t);

    public abstract String pattern();

    public abstract String toString();
}
