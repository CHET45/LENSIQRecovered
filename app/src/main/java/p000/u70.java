package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3105:1\n13989#2,14:3106\n14012#2,14:3120\n14035#2,14:3134\n14058#2,14:3148\n14081#2,14:3162\n14104#2,14:3176\n14127#2,14:3190\n14150#2,14:3204\n14173#2,14:3218\n16575#2,14:3232\n16598#2,14:3246\n16621#2,14:3260\n16644#2,14:3274\n16667#2,14:3288\n16690#2,14:3302\n16713#2,14:3316\n16736#2,14:3330\n16759#2,14:3344\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2497#1:3106,14\n2504#1:3120,14\n2511#1:3134,14\n2518#1:3148,14\n2525#1:3162,14\n2532#1:3176,14\n2539#1:3190,14\n2546#1:3204,14\n2553#1:3218,14\n2695#1:3232,14\n2702#1:3246,14\n2709#1:3260,14\n2716#1:3274,14\n2723#1:3288,14\n2730#1:3302,14\n2737#1:3316,14\n2744#1:3330,14\n2751#1:3344,14\n*E\n"})
public class u70 extends t70 {

    /* JADX INFO: renamed from: u70$a */
    public static final class C13382a extends AbstractC7110i2<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f86914a;

        public C13382a(byte[] bArr) {
            this.f86914a = bArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return contains(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f86914a.length;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return indexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f86914a.length == 0;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return lastIndexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        public boolean contains(byte b) {
            return e80.contains(this.f86914a, b);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public Byte get(int i) {
            return Byte.valueOf(this.f86914a[i]);
        }

        public int indexOf(byte b) {
            return e80.indexOf(this.f86914a, b);
        }

        public int lastIndexOf(byte b) {
            return e80.lastIndexOf(this.f86914a, b);
        }
    }

    /* JADX INFO: renamed from: u70$b */
    public static final class C13383b extends AbstractC7110i2<Short> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ short[] f86915a;

        public C13383b(short[] sArr) {
            this.f86915a = sArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return contains(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f86915a.length;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return indexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f86915a.length == 0;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return lastIndexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        public boolean contains(short s) {
            return e80.contains(this.f86915a, s);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public Short get(int i) {
            return Short.valueOf(this.f86915a[i]);
        }

        public int indexOf(short s) {
            return e80.indexOf(this.f86915a, s);
        }

        public int lastIndexOf(short s) {
            return e80.lastIndexOf(this.f86915a, s);
        }
    }

    /* JADX INFO: renamed from: u70$c */
    public static final class C13384c extends AbstractC7110i2<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int[] f86916a;

        public C13384c(int[] iArr) {
            this.f86916a = iArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return contains(((Number) obj).intValue());
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f86916a.length;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return indexOf(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f86916a.length == 0;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return lastIndexOf(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean contains(int i) {
            return e80.contains(this.f86916a, i);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public Integer get(int i) {
            return Integer.valueOf(this.f86916a[i]);
        }

        public int indexOf(int i) {
            return e80.indexOf(this.f86916a, i);
        }

        public int lastIndexOf(int i) {
            return e80.lastIndexOf(this.f86916a, i);
        }
    }

    /* JADX INFO: renamed from: u70$d */
    public static final class C13385d extends AbstractC7110i2<Long> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long[] f86917a;

        public C13385d(long[] jArr) {
            this.f86917a = jArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return contains(((Number) obj).longValue());
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f86917a.length;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return indexOf(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f86917a.length == 0;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return lastIndexOf(((Number) obj).longValue());
            }
            return -1;
        }

        public boolean contains(long j) {
            return e80.contains(this.f86917a, j);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public Long get(int i) {
            return Long.valueOf(this.f86917a[i]);
        }

        public int indexOf(long j) {
            return e80.indexOf(this.f86917a, j);
        }

        public int lastIndexOf(long j) {
            return e80.lastIndexOf(this.f86917a, j);
        }
    }

    /* JADX INFO: renamed from: u70$e */
    @dwf({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3105:1\n12617#2,2:3106\n1742#2,6:3108\n1850#2,6:3114\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3106,2\n201#1:3108,6\n202#1:3114,6\n*E\n"})
    public static final class C13386e extends AbstractC7110i2<Float> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float[] f86918a;

        public C13386e(float[] fArr) {
            this.f86918a = fArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return contains(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f86918a.length;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return indexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f86918a.length == 0;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return lastIndexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        public boolean contains(float f) {
            for (float f2 : this.f86918a) {
                if (Float.floatToIntBits(f2) == Float.floatToIntBits(f)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public Float get(int i) {
            return Float.valueOf(this.f86918a[i]);
        }

        public int indexOf(float f) {
            float[] fArr = this.f86918a;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                    return i;
                }
            }
            return -1;
        }

        public int lastIndexOf(float f) {
            float[] fArr = this.f86918a;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: u70$f */
    @dwf({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3105:1\n12627#2,2:3106\n1754#2,6:3108\n1862#2,6:3114\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3106,2\n215#1:3108,6\n216#1:3114,6\n*E\n"})
    public static final class C13387f extends AbstractC7110i2<Double> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double[] f86919a;

        public C13387f(double[] dArr) {
            this.f86919a = dArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return contains(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f86919a.length;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return indexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f86919a.length == 0;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return lastIndexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        public boolean contains(double d) {
            for (double d2 : this.f86919a) {
                if (Double.doubleToLongBits(d2) == Double.doubleToLongBits(d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public Double get(int i) {
            return Double.valueOf(this.f86919a[i]);
        }

        public int indexOf(double d) {
            double[] dArr = this.f86919a;
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    return i;
                }
            }
            return -1;
        }

        public int lastIndexOf(double d) {
            double[] dArr = this.f86919a;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: u70$g */
    public static final class C13388g extends AbstractC7110i2<Boolean> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean[] f86920a;

        public C13388g(boolean[] zArr) {
            this.f86920a = zArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return contains(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f86920a.length;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return indexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f86920a.length == 0;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return lastIndexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        public boolean contains(boolean z) {
            return e80.contains(this.f86920a, z);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public Boolean get(int i) {
            return Boolean.valueOf(this.f86920a[i]);
        }

        public int indexOf(boolean z) {
            return e80.indexOf(this.f86920a, z);
        }

        public int lastIndexOf(boolean z) {
            return e80.lastIndexOf(this.f86920a, z);
        }
    }

    /* JADX INFO: renamed from: u70$h */
    public static final class C13389h extends AbstractC7110i2<Character> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ char[] f86921a;

        public C13389h(char[] cArr) {
            this.f86921a = cArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return contains(((Character) obj).charValue());
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f86921a.length;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f86921a.length == 0;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean contains(char c) {
            return e80.contains(this.f86921a, c);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public Character get(int i) {
            return Character.valueOf(this.f86921a[i]);
        }

        public int indexOf(char c) {
            return e80.indexOf(this.f86921a, c);
        }

        public int lastIndexOf(char c) {
            return e80.lastIndexOf(this.f86921a, c);
        }
    }

    @yfb
    public static <T> List<T> asList(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        List<T> listM10710a = f80.m10710a(tArr);
        md8.checkNotNullExpressionValue(listM10710a, "asList(...)");
        return listM10710a;
    }

    public static final <T> int binarySearch(@yfb T[] tArr, T t, @yfb Comparator<? super T> comparator, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i, i2);
    }

    @jjf(version = "1.1")
    @t28
    @xn8(name = "contentDeepEqualsInline")
    @ip9
    private static final <T> boolean contentDeepEqualsInline(T[] tArr, T[] tArr2) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(tArr2, "other");
        return dxc.apiVersionIsAtLeast(1, 3, 0) ? t70.contentDeepEquals(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @jjf(version = "1.4")
    @t28
    @xn8(name = "contentDeepEqualsNullable")
    private static final <T> boolean contentDeepEqualsNullable(T[] tArr, T[] tArr2) {
        return dxc.apiVersionIsAtLeast(1, 3, 0) ? t70.contentDeepEquals(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @jjf(version = "1.1")
    @t28
    @xn8(name = "contentDeepHashCodeInline")
    @ip9
    private static final <T> int contentDeepHashCodeInline(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return dxc.apiVersionIsAtLeast(1, 3, 0) ? s70.contentDeepHashCode(tArr) : Arrays.deepHashCode(tArr);
    }

    @jjf(version = "1.4")
    @t28
    @xn8(name = "contentDeepHashCodeNullable")
    private static final <T> int contentDeepHashCodeNullable(T[] tArr) {
        return dxc.apiVersionIsAtLeast(1, 3, 0) ? s70.contentDeepHashCode(tArr) : Arrays.deepHashCode(tArr);
    }

    @jjf(version = "1.1")
    @t28
    @xn8(name = "contentDeepToStringInline")
    @ip9
    private static final <T> String contentDeepToStringInline(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return t70.contentDeepToString(tArr);
        }
        String strDeepToString = Arrays.deepToString(tArr);
        md8.checkNotNullExpressionValue(strDeepToString, "deepToString(...)");
        return strDeepToString;
    }

    @jjf(version = "1.4")
    @t28
    @xn8(name = "contentDeepToStringNullable")
    private static final <T> String contentDeepToStringNullable(T[] tArr) {
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return t70.contentDeepToString(tArr);
        }
        String strDeepToString = Arrays.deepToString(tArr);
        md8.checkNotNullExpressionValue(strDeepToString, "deepToString(...)");
        return strDeepToString;
    }

    @jjf(version = "1.4")
    @t28
    private static final <T> boolean contentEquals(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final <T> int contentHashCode(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final <T> String contentToString(T[] tArr) {
        String string = Arrays.toString(tArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static <T> T[] copyInto(@yfb T[] tArr, @yfb T[] tArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(tArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return copyInto(objArr, objArr2, i, i2, i3);
    }

    @t28
    private static final <T> T[] copyOf(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        md8.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static <T> T[] copyOfRange(@yfb T[] tArr, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        md8.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final <T> T[] copyOfRangeInline(T[] tArr, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return (T[]) copyOfRange(tArr, i, i2);
        }
        if (i2 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
            md8.checkNotNull(tArr2);
            return tArr2;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + tArr.length);
    }

    @t28
    private static final <T> T elementAt(T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr[i];
    }

    public static <T> void fill(@yfb T[] tArr, T t, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        fill(objArr, obj, i, i2);
    }

    @yfb
    public static final <R> List<R> filterIsInstance(@yfb Object[] objArr, @yfb Class<R> cls) {
        md8.checkNotNullParameter(objArr, "<this>");
        md8.checkNotNullParameter(cls, "klass");
        return (List) filterIsInstanceTo(objArr, new ArrayList(), cls);
    }

    @yfb
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@yfb Object[] objArr, @yfb C c, @yfb Class<R> cls) {
        md8.checkNotNullParameter(objArr, "<this>");
        md8.checkNotNullParameter(c, FirebaseAnalytics.C3552d.f23234z);
        md8.checkNotNullParameter(cls, "klass");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Double max(Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return e80.maxOrNull(dArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = e80.getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(t);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t2 = tArr[i];
                    R rInvoke2 = qy6Var.invoke(t2);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t = t2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return t;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object maxWith(Object[] objArr, Comparator comparator) {
        md8.checkNotNullParameter(objArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(objArr, comparator);
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Double min(Double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return e80.minOrNull(dArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = e80.getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(t);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t2 = tArr[i];
                    R rInvoke2 = qy6Var.invoke(t2);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t = t2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return t;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object minWith(Object[] objArr, Comparator comparator) {
        md8.checkNotNullParameter(objArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(objArr, comparator);
    }

    @yfb
    public static <T> T[] plus(@yfb T[] tArr, T t) {
        md8.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        md8.checkNotNull(tArr2);
        return tArr2;
    }

    @t28
    private static final <T> T[] plusElement(T[] tArr, T t) {
        md8.checkNotNullParameter(tArr, "<this>");
        return (T[]) plus(tArr, t);
    }

    public static final void sort(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        sort(comparableArr, i, i2);
    }

    public static final <T> void sortWith(@yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        sortWith(objArr, comparator, i, i2);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final <T> BigDecimal sumOfBigDecimal(T[] tArr, qy6<? super T, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (T t : tArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(t));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final <T> BigInteger sumOfBigInteger(T[] tArr, qy6<? super T, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (T t : tArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(t));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) e80.toCollection(tArr, new TreeSet());
    }

    @yfb
    public static final Byte[] toTypedArray(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @yfb
    public static final List<Byte> asList(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return new C13382a(bArr);
    }

    public static final <T> int binarySearch(@yfb T[] tArr, T t, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        return Arrays.binarySearch(tArr, i, i2, t);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return binarySearch(objArr, obj, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean contentEquals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int contentHashCode(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final String contentToString(byte[] bArr) {
        String string = Arrays.toString(bArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static byte[] copyInto(@yfb byte[] bArr, @yfb byte[] bArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(bArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    @t28
    private static final byte[] copyOf(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @t28
    private static final byte elementAt(byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr[i];
    }

    public static void fill(@yfb byte[] bArr, byte b, int i, int i2) {
        md8.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i, i2, b);
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Float max(Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return e80.maxOrNull(fArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte maxWith(byte[] bArr, Comparator comparator) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    @jjf(version = "1.1")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Float min(Float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return e80.minOrNull(fArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte minWith(byte[] bArr, Comparator comparator) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    public static final void sort(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static <T> void sortWith(@yfb T[] tArr, @yfb Comparator<? super T> comparator, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    @yfb
    public static final SortedSet<Byte> toSortedSet(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return (SortedSet) e80.toCollection(bArr, new TreeSet());
    }

    @yfb
    public static final List<Short> asList(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return new C13383b(sArr);
    }

    public static final int binarySearch(@yfb byte[] bArr, byte b, int i, int i2) {
        md8.checkNotNullParameter(bArr, "<this>");
        return Arrays.binarySearch(bArr, i, i2, b);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return binarySearch(bArr, b, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean contentEquals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int contentHashCode(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final String contentToString(short[] sArr) {
        String string = Arrays.toString(sArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static short[] copyInto(@yfb short[] sArr, @yfb short[] sArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(sArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return copyInto(bArr, bArr2, i, i2, i3);
    }

    @t28
    private static final short[] copyOf(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static byte[] copyOfRange(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        md8.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    @t28
    private static final short elementAt(short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr[i];
    }

    public static void fill(@yfb short[] sArr, short s, int i, int i2) {
        md8.checkNotNullParameter(sArr, "<this>");
        Arrays.fill(sArr, i, i2, s);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        fill(bArr, b, i, i2);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable max(Comparable[] comparableArr) {
        md8.checkNotNullParameter(comparableArr, "<this>");
        return e80.maxOrNull(comparableArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short maxWith(short[] sArr, Comparator comparator) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable min(Comparable[] comparableArr) {
        md8.checkNotNullParameter(comparableArr, "<this>");
        return e80.minOrNull(comparableArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short minWith(short[] sArr, Comparator comparator) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static final void sort(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        sort(bArr, i, i2);
    }

    @yfb
    public static final SortedSet<Short> toSortedSet(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return (SortedSet) e80.toCollection(sArr, new TreeSet());
    }

    @yfb
    public static List<Integer> asList(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return new C13384c(iArr);
    }

    public static final int binarySearch(@yfb short[] sArr, short s, int i, int i2) {
        md8.checkNotNullParameter(sArr, "<this>");
        return Arrays.binarySearch(sArr, i, i2, s);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return binarySearch(sArr, s, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean contentEquals(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int contentHashCode(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final String contentToString(int[] iArr) {
        String string = Arrays.toString(iArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static int[] copyInto(@yfb int[] iArr, @yfb int[] iArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    @t28
    private static final int[] copyOf(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @t28
    private static final int elementAt(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr[i];
    }

    public static void fill(@yfb int[] iArr, int i, int i2, int i3) {
        md8.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Byte max(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return e80.maxOrNull(bArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer maxWith(int[] iArr, Comparator comparator) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Byte min(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return e80.minOrNull(bArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer minWith(int[] iArr, Comparator comparator) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    public static final void sort(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(byte[] bArr, qy6<? super Byte, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (byte b : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Byte.valueOf(b)));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(byte[] bArr, qy6<? super Byte, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (byte b : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Byte.valueOf(b)));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final SortedSet<Integer> toSortedSet(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return (SortedSet) e80.toCollection(iArr, new TreeSet());
    }

    @yfb
    public static final Short[] toTypedArray(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }

    @yfb
    public static List<Long> asList(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return new C13385d(jArr);
    }

    public static final int binarySearch(@yfb int[] iArr, int i, int i2, int i3) {
        md8.checkNotNullParameter(iArr, "<this>");
        return Arrays.binarySearch(iArr, i2, i3, i);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return binarySearch(iArr, i, i2, i3);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean contentEquals(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int contentHashCode(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final String contentToString(long[] jArr) {
        String string = Arrays.toString(jArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static long[] copyInto(@yfb long[] jArr, @yfb long[] jArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(jArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return copyInto(sArr, sArr2, i, i2, i3);
    }

    @t28
    private static final long[] copyOf(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static short[] copyOfRange(@yfb short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i, i2);
        md8.checkNotNullExpressionValue(sArrCopyOfRange, "copyOfRange(...)");
        return sArrCopyOfRange;
    }

    @t28
    private static final long elementAt(long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr[i];
    }

    public static void fill(@yfb long[] jArr, long j, int i, int i2) {
        md8.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        fill(sArr, s, i, i2);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Short max(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return e80.maxOrNull(sArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long maxWith(long[] jArr, Comparator comparator) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Short min(short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return e80.minOrNull(sArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long minWith(long[] jArr, Comparator comparator) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @yfb
    public static byte[] plus(@yfb byte[] bArr, byte b) {
        md8.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b;
        md8.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final void sort(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        sort(sArr, i, i2);
    }

    @yfb
    public static final SortedSet<Long> toSortedSet(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return (SortedSet) e80.toCollection(jArr, new TreeSet());
    }

    @yfb
    public static final List<Float> asList(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return new C13386e(fArr);
    }

    public static final int binarySearch(@yfb long[] jArr, long j, int i, int i2) {
        md8.checkNotNullParameter(jArr, "<this>");
        return Arrays.binarySearch(jArr, i, i2, j);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return binarySearch(jArr, j, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean contentEquals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int contentHashCode(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final String contentToString(float[] fArr) {
        String string = Arrays.toString(fArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static float[] copyInto(@yfb float[] fArr, @yfb float[] fArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(fArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    @t28
    private static final float[] copyOf(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @t28
    private static final float elementAt(float[] fArr, int i) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr[i];
    }

    public static final void fill(@yfb float[] fArr, float f, int i, int i2) {
        md8.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i, i2, f);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Integer max(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return e80.maxOrNull(iArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float maxWith(float[] fArr, Comparator comparator) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Integer min(int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return e80.minOrNull(iArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float minWith(float[] fArr, Comparator comparator) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    public static final void sort(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @yfb
    public static final SortedSet<Float> toSortedSet(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return (SortedSet) e80.toCollection(fArr, new TreeSet());
    }

    @yfb
    public static List<Double> asList(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return new C13387f(dArr);
    }

    public static final int binarySearch(@yfb float[] fArr, float f, int i, int i2) {
        md8.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i, i2, f);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return binarySearch(fArr, f, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean contentEquals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int contentHashCode(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final String contentToString(double[] dArr) {
        String string = Arrays.toString(dArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static final double[] copyInto(@yfb double[] dArr, @yfb double[] dArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(dArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return copyInto(iArr, iArr2, i, i2, i3);
    }

    @t28
    private static final double[] copyOf(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        md8.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static int[] copyOfRange(@yfb int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i, i2);
        md8.checkNotNullExpressionValue(iArrCopyOfRange, "copyOfRange(...)");
        return iArrCopyOfRange;
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final byte[] copyOfRangeInline(byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(bArr, i, i2);
        }
        if (i2 <= bArr.length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
            md8.checkNotNull(bArrCopyOfRange);
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + bArr.length);
    }

    @t28
    private static final double elementAt(double[] dArr, int i) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr[i];
    }

    public static final void fill(@yfb double[] dArr, double d, int i, int i2) {
        md8.checkNotNullParameter(dArr, "<this>");
        Arrays.fill(dArr, i, i2, d);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        fill(iArr, i, i2, i3);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Long max(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return e80.maxOrNull(jArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double maxWith(double[] dArr, Comparator comparator) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Long min(long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return e80.minOrNull(jArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double minWith(double[] dArr, Comparator comparator) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    public static final void sort(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        sort(iArr, i, i2);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(short[] sArr, qy6<? super Short, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (short s : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Short.valueOf(s)));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(short[] sArr, qy6<? super Short, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (short s : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Short.valueOf(s)));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final SortedSet<Double> toSortedSet(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return (SortedSet) e80.toCollection(dArr, new TreeSet());
    }

    @yfb
    public static final Integer[] toTypedArray(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @yfb
    public static final List<Boolean> asList(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return new C13388g(zArr);
    }

    public static final int binarySearch(@yfb double[] dArr, double d, int i, int i2) {
        md8.checkNotNullParameter(dArr, "<this>");
        return Arrays.binarySearch(dArr, i, i2, d);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return binarySearch(dArr, d, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean contentEquals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int contentHashCode(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final String contentToString(boolean[] zArr) {
        String string = Arrays.toString(zArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static final boolean[] copyInto(@yfb boolean[] zArr, @yfb boolean[] zArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(zArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    @t28
    private static final boolean[] copyOf(boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        md8.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @t28
    private static final boolean elementAt(boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr[i];
    }

    public static final void fill(@yfb boolean[] zArr, boolean z, int i, int i2) {
        md8.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i, i2, z);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Float max(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return e80.maxOrNull(fArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b);
        }
        R rInvoke = qy6Var.invoke(Byte.valueOf(b));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b2 = bArr[i];
                R rInvoke2 = qy6Var.invoke(Byte.valueOf(b2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b = b2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean maxWith(boolean[] zArr, Comparator comparator) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Float min(float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return e80.minOrNull(fArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, qy6<? super Byte, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b);
        }
        R rInvoke = qy6Var.invoke(Byte.valueOf(b));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b2 = bArr[i];
                R rInvoke2 = qy6Var.invoke(Byte.valueOf(b2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b = b2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Byte.valueOf(b);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean minWith(boolean[] zArr, Comparator comparator) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @t28
    private static final <T extends Comparable<? super T>> void sort(T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        sort((Object[]) tArr);
    }

    @yfb
    public static final SortedSet<Boolean> toSortedSet(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return (SortedSet) e80.toCollection(zArr, new TreeSet());
    }

    @yfb
    public static final List<Character> asList(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return new C13389h(cArr);
    }

    public static final int binarySearch(@yfb char[] cArr, char c, int i, int i2) {
        md8.checkNotNullParameter(cArr, "<this>");
        return Arrays.binarySearch(cArr, i, i2, c);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return binarySearch(cArr, c, i, i2);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean contentEquals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int contentHashCode(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @jjf(version = "1.4")
    @t28
    private static final String contentToString(char[] cArr) {
        String string = Arrays.toString(cArr);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.3")
    @yfb
    public static char[] copyInto(@yfb char[] cArr, @yfb char[] cArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(cArr2, FirebaseAnalytics.C3552d.f23234z);
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return copyInto(jArr, jArr2, i, i2, i3);
    }

    @t28
    private static final char[] copyOf(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static long[] copyOfRange(@yfb long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i, i2);
        md8.checkNotNullExpressionValue(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    @t28
    private static final char elementAt(char[] cArr, int i) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr[i];
    }

    public static void fill(@yfb char[] cArr, char c, int i, int i2) {
        md8.checkNotNullParameter(cArr, "<this>");
        Arrays.fill(cArr, i, i2, c);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        fill(jArr, j, i, i2);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Double max(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return e80.maxOrNull(dArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character maxWith(char[] cArr, Comparator comparator) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.maxWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Double min(double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return e80.minOrNull(dArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character minWith(char[] cArr, Comparator comparator) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return e80.minWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @yfb
    public static short[] plus(@yfb short[] sArr, short s) {
        md8.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s;
        md8.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static <T> void sort(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        sort(jArr, i, i2);
    }

    @yfb
    public static final SortedSet<Character> toSortedSet(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return (SortedSet) e80.toCollection(cArr, new TreeSet());
    }

    @t28
    private static final byte[] copyOf(byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        md8.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Character max(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return e80.maxOrNull(cArr);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Character min(char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return e80.minOrNull(cArr);
    }

    @jjf(version = "1.4")
    public static final <T extends Comparable<? super T>> void sort(@yfb T[] tArr, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(int[] iArr, qy6<? super Integer, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (int i : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Integer.valueOf(i)));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(int[] iArr, qy6<? super Integer, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (int i : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Integer.valueOf(i)));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final <T> SortedSet<T> toSortedSet(@yfb T[] tArr, @yfb Comparator<? super T> comparator) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) e80.toCollection(tArr, new TreeSet(comparator));
    }

    @yfb
    public static final Long[] toTypedArray(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return copyInto(fArr, fArr2, i, i2, i3);
    }

    @t28
    private static final short[] copyOf(short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i);
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static final float[] copyOfRange(@yfb float[] fArr, int i, int i2) {
        md8.checkNotNullParameter(fArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i, i2);
        md8.checkNotNullExpressionValue(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        fill(fArr, f, i, i2);
    }

    public static final void sort(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "<this>");
        Arrays.sort(bArr, i, i2);
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        sort(fArr, i, i2);
    }

    @t28
    private static final int[] copyOf(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    public static final void sort(@yfb short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "<this>");
        Arrays.sort(sArr, i, i2);
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return copyInto(dArr, dArr2, i, i2, i3);
    }

    @t28
    private static final long[] copyOf(long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static final double[] copyOfRange(@yfb double[] dArr, int i, int i2) {
        md8.checkNotNullParameter(dArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i, i2);
        md8.checkNotNullExpressionValue(dArrCopyOfRange, "copyOfRange(...)");
        return dArrCopyOfRange;
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final short[] copyOfRangeInline(short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(sArr, i, i2);
        }
        if (i2 <= sArr.length) {
            short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i, i2);
            md8.checkNotNull(sArrCopyOfRange);
            return sArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + sArr.length);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        fill(dArr, d, i, i2);
    }

    @yfb
    public static int[] plus(@yfb int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        md8.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static void sort(@yfb int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i, i2);
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        sort(dArr, i, i2);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(long[] jArr, qy6<? super Long, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (long j : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Long.valueOf(j)));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(long[] jArr, qy6<? super Long, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (long j : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Long.valueOf(j)));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final Float[] toTypedArray(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @t28
    private static final float[] copyOf(float[] fArr, int i) {
        md8.checkNotNullParameter(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, i);
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public static void sort(@yfb long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "<this>");
        Arrays.sort(jArr, i, i2);
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return copyInto(zArr, zArr2, i, i2, i3);
    }

    @t28
    private static final double[] copyOf(double[] dArr, int i) {
        md8.checkNotNullParameter(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, i);
        md8.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static final boolean[] copyOfRange(@yfb boolean[] zArr, int i, int i2) {
        md8.checkNotNullParameter(zArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i, i2);
        md8.checkNotNullExpressionValue(zArrCopyOfRange, "copyOfRange(...)");
        return zArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        fill(zArr, z, i, i2);
    }

    public static void sort(@yfb float[] fArr, int i, int i2) {
        md8.checkNotNullParameter(fArr, "<this>");
        Arrays.sort(fArr, i, i2);
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        sort(cArr, i, i2);
    }

    @t28
    private static final boolean[] copyOf(boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
        md8.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    public static final void sort(@yfb double[] dArr, int i, int i2) {
        md8.checkNotNullParameter(dArr, "<this>");
        Arrays.sort(dArr, i, i2);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(float[] fArr, qy6<? super Float, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (float f : fArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Float.valueOf(f)));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(float[] fArr, qy6<? super Float, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (float f : fArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Float.valueOf(f)));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final Double[] toTypedArray(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return copyInto(cArr, cArr2, i, i2, i3);
    }

    @t28
    private static final char[] copyOf(char[] cArr, int i) {
        md8.checkNotNullParameter(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, i);
        md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @jjf(version = "1.3")
    @xn8(name = "copyOfRange")
    @yjd
    @yfb
    public static final char[] copyOfRange(@yfb char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "<this>");
        s70.copyOfRangeToIndexCheck(i2, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i, i2);
        md8.checkNotNullExpressionValue(cArrCopyOfRange, "copyOfRange(...)");
        return cArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        fill(cArr, c, i, i2);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = qy6Var.invoke(Short.valueOf(s));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s2 = sArr[i];
                R rInvoke2 = qy6Var.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, qy6<? super Short, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = qy6Var.invoke(Short.valueOf(s));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s2 = sArr[i];
                R rInvoke2 = qy6Var.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Short.valueOf(s);
    }

    @yfb
    public static long[] plus(@yfb long[] jArr, long j) {
        md8.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j;
        md8.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final void sort(@yfb char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "<this>");
        Arrays.sort(cArr, i, i2);
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        sort(objArr, i, i2);
    }

    @t28
    private static final <T> T[] copyOf(T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        md8.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <T> void sort(@yfb T[] tArr, int i, int i2) {
        md8.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final int[] copyOfRangeInline(int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(iArr, i, i2);
        }
        if (i2 <= iArr.length) {
            int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i, i2);
            md8.checkNotNull(iArrCopyOfRange);
            return iArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + iArr.length);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(double[] dArr, qy6<? super Double, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (double d : dArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Double.valueOf(d)));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(double[] dArr, qy6<? super Double, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (double d : dArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Double.valueOf(d)));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final Boolean[] toTypedArray(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @yfb
    public static final float[] plus(@yfb float[] fArr, float f) {
        md8.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f;
        md8.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(boolean[] zArr, qy6<? super Boolean, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (boolean z : zArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Boolean.valueOf(z)));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(boolean[] zArr, qy6<? super Boolean, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (boolean z : zArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Boolean.valueOf(z)));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final Character[] toTypedArray(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final long[] copyOfRangeInline(long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(jArr, i, i2);
        }
        if (i2 <= jArr.length) {
            long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i, i2);
            md8.checkNotNull(jArrCopyOfRange);
            return jArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + jArr.length);
    }

    @yfb
    public static final double[] plus(@yfb double[] dArr, double d) {
        md8.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d;
        md8.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(char[] cArr, qy6<? super Character, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (char c : cArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Character.valueOf(c)));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(char[] cArr, qy6<? super Character, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (char c : cArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Character.valueOf(c)));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i);
        }
        R rInvoke = qy6Var.invoke(Integer.valueOf(i));
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                R rInvoke2 = qy6Var.invoke(Integer.valueOf(i3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i = i3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, qy6<? super Integer, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i);
        }
        R rInvoke = qy6Var.invoke(Integer.valueOf(i));
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                R rInvoke2 = qy6Var.invoke(Integer.valueOf(i3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i = i3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @yfb
    public static final boolean[] plus(@yfb boolean[] zArr, boolean z) {
        md8.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z;
        md8.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final float[] copyOfRangeInline(float[] fArr, int i, int i2) {
        md8.checkNotNullParameter(fArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(fArr, i, i2);
        }
        if (i2 <= fArr.length) {
            float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i, i2);
            md8.checkNotNull(fArrCopyOfRange);
            return fArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + fArr.length);
    }

    @yfb
    public static final char[] plus(@yfb char[] cArr, char c) {
        md8.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c;
        md8.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = qy6Var.invoke(Long.valueOf(j));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j2 = jArr[i];
                R rInvoke2 = qy6Var.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, qy6<? super Long, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = qy6Var.invoke(Long.valueOf(j));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j2 = jArr[i];
                R rInvoke2 = qy6Var.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Long.valueOf(j);
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final double[] copyOfRangeInline(double[] dArr, int i, int i2) {
        md8.checkNotNullParameter(dArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(dArr, i, i2);
        }
        if (i2 <= dArr.length) {
            double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i, i2);
            md8.checkNotNull(dArrCopyOfRange);
            return dArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + dArr.length);
    }

    @yfb
    public static final <T> T[] plus(@yfb T[] tArr, @yfb Collection<? extends T> collection) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        md8.checkNotNull(tArr2);
        return tArr2;
    }

    @yfb
    public static final byte[] plus(@yfb byte[] bArr, @yfb Collection<Byte> collection) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, collection.size() + length);
        Iterator<Byte> it = collection.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        md8.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final boolean[] copyOfRangeInline(boolean[] zArr, int i, int i2) {
        md8.checkNotNullParameter(zArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(zArr, i, i2);
        }
        if (i2 <= zArr.length) {
            boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i, i2);
            md8.checkNotNull(zArrCopyOfRange);
            return zArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + zArr.length);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int lastIndex = e80.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f);
        }
        R rInvoke = qy6Var.invoke(Float.valueOf(f));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f2 = fArr[i];
                R rInvoke2 = qy6Var.invoke(Float.valueOf(f2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f = f2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, qy6<? super Float, ? extends R> qy6Var) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int lastIndex = e80.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f);
        }
        R rInvoke = qy6Var.invoke(Float.valueOf(f));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f2 = fArr[i];
                R rInvoke2 = qy6Var.invoke(Float.valueOf(f2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f = f2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f);
    }

    @yfb
    public static final short[] plus(@yfb short[] sArr, @yfb Collection<Short> collection) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, collection.size() + length);
        Iterator<Short> it = collection.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        md8.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    @t28
    @xn8(name = "copyOfRangeInline")
    private static final char[] copyOfRangeInline(char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "<this>");
        if (dxc.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(cArr, i, i2);
        }
        if (i2 <= cArr.length) {
            char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i, i2);
            md8.checkNotNull(cArrCopyOfRange);
            return cArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + cArr.length);
    }

    @yfb
    public static final int[] plus(@yfb int[] iArr, @yfb Collection<Integer> collection) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, collection.size() + length);
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        md8.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int lastIndex = e80.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d);
        }
        R rInvoke = qy6Var.invoke(Double.valueOf(d));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d2 = dArr[i];
                R rInvoke2 = qy6Var.invoke(Double.valueOf(d2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d = d2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, qy6<? super Double, ? extends R> qy6Var) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int lastIndex = e80.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d);
        }
        R rInvoke = qy6Var.invoke(Double.valueOf(d));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d2 = dArr[i];
                R rInvoke2 = qy6Var.invoke(Double.valueOf(d2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d = d2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    @yfb
    public static final long[] plus(@yfb long[] jArr, @yfb Collection<Long> collection) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, collection.size() + length);
        Iterator<Long> it = collection.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        md8.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    @yfb
    public static final float[] plus(@yfb float[] fArr, @yfb Collection<Float> collection) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, collection.size() + length);
        Iterator<Float> it = collection.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        md8.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @yfb
    public static final double[] plus(@yfb double[] dArr, @yfb Collection<Double> collection) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, collection.size() + length);
        Iterator<Double> it = collection.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        md8.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = e80.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = qy6Var.invoke(Boolean.valueOf(z));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z2 = zArr[i];
                R rInvoke2 = qy6Var.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = e80.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = qy6Var.invoke(Boolean.valueOf(z));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z2 = zArr[i];
                R rInvoke2 = qy6Var.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }

    @yfb
    public static final boolean[] plus(@yfb boolean[] zArr, @yfb Collection<Boolean> collection) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, collection.size() + length);
        Iterator<Boolean> it = collection.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        md8.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @yfb
    public static final char[] plus(@yfb char[] cArr, @yfb Collection<Character> collection) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(collection, "elements");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, collection.size() + length);
        Iterator<Character> it = collection.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        md8.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = e80.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c);
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(c));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c2 = cArr[i];
                R rInvoke2 = qy6Var.invoke(Character.valueOf(c2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c = c2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int lastIndex = e80.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c);
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(c));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c2 = cArr[i];
                R rInvoke2 = qy6Var.invoke(Character.valueOf(c2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c = c2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(c);
    }

    @yfb
    public static final <T> T[] plus(@yfb T[] tArr, @yfb T[] tArr2) {
        md8.checkNotNullParameter(tArr, "<this>");
        md8.checkNotNullParameter(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        md8.checkNotNull(tArr3);
        return tArr3;
    }

    @yfb
    public static byte[] plus(@yfb byte[] bArr, @yfb byte[] bArr2) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        md8.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    @yfb
    public static short[] plus(@yfb short[] sArr, @yfb short[] sArr2) {
        md8.checkNotNullParameter(sArr, "<this>");
        md8.checkNotNullParameter(sArr2, "elements");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
        md8.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    @yfb
    public static int[] plus(@yfb int[] iArr, @yfb int[] iArr2) {
        md8.checkNotNullParameter(iArr, "<this>");
        md8.checkNotNullParameter(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        md8.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    @yfb
    public static long[] plus(@yfb long[] jArr, @yfb long[] jArr2) {
        md8.checkNotNullParameter(jArr, "<this>");
        md8.checkNotNullParameter(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
        md8.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    @yfb
    public static final float[] plus(@yfb float[] fArr, @yfb float[] fArr2) {
        md8.checkNotNullParameter(fArr, "<this>");
        md8.checkNotNullParameter(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        md8.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @yfb
    public static final double[] plus(@yfb double[] dArr, @yfb double[] dArr2) {
        md8.checkNotNullParameter(dArr, "<this>");
        md8.checkNotNullParameter(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
        md8.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @yfb
    public static final boolean[] plus(@yfb boolean[] zArr, @yfb boolean[] zArr2) {
        md8.checkNotNullParameter(zArr, "<this>");
        md8.checkNotNullParameter(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
        md8.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @yfb
    public static final char[] plus(@yfb char[] cArr, @yfb char[] cArr2) {
        md8.checkNotNullParameter(cArr, "<this>");
        md8.checkNotNullParameter(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
        md8.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }
}
