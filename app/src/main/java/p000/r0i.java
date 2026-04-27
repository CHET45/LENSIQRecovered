package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.C3603f;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public class r0i {

    /* JADX INFO: renamed from: a */
    public static final int f76729a = 20;

    /* JADX INFO: renamed from: b */
    public static final String f76730b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    /* JADX INFO: renamed from: c */
    public static final Random f76731c = new SecureRandom();

    /* JADX INFO: renamed from: d */
    public static final Continuation<Void, Void> f76732d = new Continuation() { // from class: b0i
        @Override // com.google.android.gms.tasks.Continuation
        public final Object then(Task task) {
            return r0i.lambda$static$0(task);
        }
    };

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: r0i$a */
    public class C11838a<V> implements Iterator<V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f76733a;

        public C11838a(Iterator it) {
            this.f76733a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f76733a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((Map.Entry) this.f76733a.next()).getValue();
        }
    }

    @hib
    private static <T> T advanceIterator(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String autoId() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sb.append(f76730b.charAt(f76731c.nextInt(62)));
        }
        return sb.toString();
    }

    public static List<Object> collectUpdateArguments(int i, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        Collections.addAll(arrayList, objArr);
        for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
            Object obj3 = arrayList.get(i2);
            if (!(obj3 instanceof String) && !(obj3 instanceof xr5)) {
                throw new IllegalArgumentException("Excepted field name at argument position " + (i2 + i + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
            }
        }
        return arrayList;
    }

    public static <T extends Comparable<T>> Comparator<T> comparator() {
        return new Comparator() { // from class: l0i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        };
    }

    public static int compareBooleans(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return Integer.compare(bArr.length, bArr2.length);
    }

    public static int compareByteStrings(vj1 vj1Var, vj1 vj1Var2) {
        int iMin = Math.min(vj1Var.size(), vj1Var2.size());
        for (int i = 0; i < iMin; i++) {
            int iByteAt = vj1Var.byteAt(i) & 255;
            int iByteAt2 = vj1Var2.byteAt(i) & 255;
            if (iByteAt < iByteAt2) {
                return -1;
            }
            if (iByteAt > iByteAt2) {
                return 1;
            }
        }
        return Integer.compare(vj1Var.size(), vj1Var2.size());
    }

    public static int compareDoubles(double d, double d2) {
        return yib.firestoreCompareDoubles(d, d2);
    }

    public static int compareMixed(double d, long j) {
        return yib.firestoreCompareDoubleWithLong(d, j);
    }

    public static int compareUtf8Strings(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2) {
                return Character.isSurrogate(cCharAt) == Character.isSurrogate(cCharAt2) ? Character.compare(cCharAt, cCharAt2) : Character.isSurrogate(cCharAt) ? 1 : -1;
            }
        }
        return Integer.compare(str.length(), str2.length());
    }

    private static Exception convertStatusException(Exception exc) {
        return exc instanceof q4g ? exceptionFromStatus(((q4g) exc).getStatus()) : exc instanceof v4g ? exceptionFromStatus(((v4g) exc).getStatus()) : exc;
    }

    public static Exception convertThrowableToException(Throwable th) {
        return th instanceof Exception ? convertStatusException((Exception) th) : new Exception(th);
    }

    @igg({"ThreadPoolCreation"})
    public static void crashMainThread(final RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yzh
            @Override // java.lang.Runnable
            public final void run() {
                r0i.lambda$crashMainThread$1(runtimeException);
            }
        });
    }

    public static <T> void diffCollections(Collection<T> collection, Collection<T> collection2, Comparator<T> comparator, su2<T> su2Var, su2<T> su2Var2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        diffCollections(arrayList.iterator(), arrayList2.iterator(), comparator, su2Var, su2Var2);
    }

    public static C3603f exceptionFromStatus(n4g n4gVar) {
        q4g q4gVarAsException = n4gVar.asException();
        return new C3603f(q4gVarAsException.getMessage(), C3603f.a.fromValue(n4gVar.getCode().value()), q4gVarAsException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> firstNEntries(Map<K, V> map, int i, final Comparator<V> comparator) {
        if (map.size() <= i) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: i0i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return r0i.lambda$firstNEntries$4(comparator, (Map.Entry) obj, (Map.Entry) obj2);
            }
        });
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            map2.put(((Map.Entry) arrayList.get(i2)).getKey(), ((Map.Entry) arrayList.get(i2)).getValue());
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$crashMainThread$1(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$firstNEntries$4(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return comparator.compare(entry.getValue(), entry2.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$static$0(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception excConvertStatusException = convertStatusException(task.getException());
        if (excConvertStatusException instanceof C3603f) {
            throw excConvertStatusException;
        }
        throw new C3603f(excConvertStatusException.getMessage(), C3603f.a.UNKNOWN, excConvertStatusException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$values$3(Iterable iterable) {
        return new C11838a(iterable.iterator());
    }

    public static StringBuilder repeatSequence(CharSequence charSequence, int i, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            sb.append(charSequence);
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String toDebugString(vj1 vj1Var) {
        int size = vj1Var.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i = 0; i < size; i++) {
            byte bByteAt = vj1Var.byteAt(i);
            sb.append(Character.forDigit((bByteAt & 255) >>> 4, 16));
            sb.append(Character.forDigit(bByteAt & 15, 16));
        }
        return sb.toString();
    }

    public static String typeName(@hib Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    public static <K, V> Iterable<V> values(final Iterable<Map.Entry<K, V>> iterable) {
        return new Iterable() { // from class: n0i
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return r0i.lambda$values$3(iterable);
            }
        };
    }

    public static Continuation<Void, Void> voidErrorTransformer() {
        return f76732d;
    }

    public static <T extends Comparable<T>> void diffCollections(SortedSet<T> sortedSet, SortedSet<T> sortedSet2, su2<T> su2Var, su2<T> su2Var2) {
        diffCollections(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new Comparator() { // from class: f0i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        }, su2Var, su2Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> void diffCollections(java.util.Iterator<T> r6, java.util.Iterator<T> r7, java.util.Comparator<? super T> r8, p000.su2<T> r9, p000.su2<T> r10) {
        /*
            java.lang.Object r0 = advanceIterator(r6)
            java.lang.Object r1 = advanceIterator(r7)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L20
            if (r1 == 0) goto L20
            int r4 = r8.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L26
        L1b:
            if (r4 <= 0) goto L1e
            goto L23
        L1e:
            r3 = r2
            goto L26
        L20:
            if (r0 == 0) goto L23
            goto L26
        L23:
            r5 = r3
            r3 = r2
            r2 = r5
        L26:
            if (r2 == 0) goto L30
            r9.accept(r1)
            java.lang.Object r1 = advanceIterator(r7)
            goto L8
        L30:
            if (r3 == 0) goto L3a
            r10.accept(r0)
            java.lang.Object r0 = advanceIterator(r6)
            goto L8
        L3a:
            java.lang.Object r0 = advanceIterator(r6)
            java.lang.Object r1 = advanceIterator(r7)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r0i.diffCollections(java.util.Iterator, java.util.Iterator, java.util.Comparator, su2, su2):void");
    }
}
