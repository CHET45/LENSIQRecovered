package p000;

/* JADX INFO: loaded from: classes7.dex */
public class p75 {
    public static void illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}
