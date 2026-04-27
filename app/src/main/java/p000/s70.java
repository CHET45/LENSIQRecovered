package p000;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class s70 {
    @yfb
    public static final <T> T[] arrayOfNulls(@yfb T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "reference");
        Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    @jjf(version = "1.3")
    @xn8(name = "contentDeepHashCode")
    @yjd
    public static final <T> int contentDeepHashCode(@gib T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @jjf(version = "1.3")
    public static final void copyOfRangeToIndexCheck(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static final /* synthetic */ <T> T[] orEmpty(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        md8.reifiedOperationMarker(0, "T");
        return (T[]) new Object[0];
    }

    @t28
    private static final String toString(byte[] bArr, Charset charset) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] toTypedArray(Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.reifiedOperationMarker(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
