package p000;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p000.ap8;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,747:1\n1#2:748\n*E\n"})
public final class cs9<K, V> implements Map<K, V>, Serializable, ap8 {

    /* JADX INFO: renamed from: M1 */
    public static final int f27271M1 = -1;

    /* JADX INFO: renamed from: Q */
    @yfb
    public static final C4480a f27272Q = new C4480a(null);

    /* JADX INFO: renamed from: V1 */
    @yfb
    public static final cs9 f27273V1;

    /* JADX INFO: renamed from: X */
    public static final int f27274X = -1640531527;

    /* JADX INFO: renamed from: Y */
    public static final int f27275Y = 8;

    /* JADX INFO: renamed from: Z */
    public static final int f27276Z = 2;

    /* JADX INFO: renamed from: C */
    public int f27277C;

    /* JADX INFO: renamed from: F */
    public int f27278F;

    /* JADX INFO: renamed from: H */
    @gib
    public fs9<K> f27279H;

    /* JADX INFO: renamed from: L */
    @gib
    public gs9<V> f27280L;

    /* JADX INFO: renamed from: M */
    @gib
    public es9<K, V> f27281M;

    /* JADX INFO: renamed from: N */
    public boolean f27282N;

    /* JADX INFO: renamed from: a */
    @yfb
    public K[] f27283a;

    /* JADX INFO: renamed from: b */
    @gib
    public V[] f27284b;

    /* JADX INFO: renamed from: c */
    @yfb
    public int[] f27285c;

    /* JADX INFO: renamed from: d */
    @yfb
    public int[] f27286d;

    /* JADX INFO: renamed from: e */
    public int f27287e;

    /* JADX INFO: renamed from: f */
    public int f27288f;

    /* JADX INFO: renamed from: m */
    public int f27289m;

    /* JADX INFO: renamed from: cs9$a */
    public static final class C4480a {
        public /* synthetic */ C4480a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeHashSize(int i) {
            return Integer.highestOneBit(kpd.coerceAtLeast(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeShift(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        @yfb
        public final cs9 getEmpty$kotlin_stdlib() {
            return cs9.f27273V1;
        }

        private C4480a() {
        }
    }

    /* JADX INFO: renamed from: cs9$b */
    public static final class C4481b<K, V> extends C4483d<K, V> implements Iterator<Map.Entry<K, V>>, xo8 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4481b(@yfb cs9<K, V> cs9Var) {
            super(cs9Var);
            md8.checkNotNullParameter(cs9Var, "map");
        }

        public final void nextAppendString(@yfb StringBuilder sb) {
            md8.checkNotNullParameter(sb, "sb");
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f27288f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().f27283a[getLastIndex$kotlin_stdlib()];
            if (obj == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = getMap$kotlin_stdlib().f27284b;
            md8.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            if (obj2 == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f27288f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().f27283a[getLastIndex$kotlin_stdlib()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = getMap$kotlin_stdlib().f27284b;
            md8.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return iHashCode2;
        }

        @Override // java.util.Iterator
        @yfb
        public C4482c<K, V> next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f27288f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            C4482c<K, V> c4482c = new C4482c<>(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return c4482c;
        }
    }

    /* JADX INFO: renamed from: cs9$c */
    public static final class C4482c<K, V> implements Map.Entry<K, V>, ap8.InterfaceC1546a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final cs9<K, V> f27290a;

        /* JADX INFO: renamed from: b */
        public final int f27291b;

        /* JADX INFO: renamed from: c */
        public final int f27292c;

        public C4482c(@yfb cs9<K, V> cs9Var, int i) {
            md8.checkNotNullParameter(cs9Var, "map");
            this.f27290a = cs9Var;
            this.f27291b = i;
            this.f27292c = cs9Var.f27277C;
        }

        private final void checkForComodification() {
            if (this.f27290a.f27277C != this.f27292c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(@gib Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (md8.areEqual(entry.getKey(), getKey()) && md8.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            checkForComodification();
            return (K) this.f27290a.f27283a[this.f27291b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            checkForComodification();
            Object[] objArr = this.f27290a.f27284b;
            md8.checkNotNull(objArr);
            return (V) objArr[this.f27291b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            checkForComodification();
            this.f27290a.checkIsMutable$kotlin_stdlib();
            Object[] objArrAllocateValuesArray = this.f27290a.allocateValuesArray();
            int i = this.f27291b;
            V v2 = (V) objArrAllocateValuesArray[i];
            objArrAllocateValuesArray[i] = v;
            return v2;
        }

        @yfb
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: cs9$d */
    @dwf({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,747:1\n1#2:748\n*E\n"})
    public static class C4483d<K, V> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final cs9<K, V> f27293a;

        /* JADX INFO: renamed from: b */
        public int f27294b;

        /* JADX INFO: renamed from: c */
        public int f27295c;

        /* JADX INFO: renamed from: d */
        public int f27296d;

        public C4483d(@yfb cs9<K, V> cs9Var) {
            md8.checkNotNullParameter(cs9Var, "map");
            this.f27293a = cs9Var;
            this.f27295c = -1;
            this.f27296d = cs9Var.f27277C;
            initNext$kotlin_stdlib();
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (this.f27293a.f27277C != this.f27296d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int getIndex$kotlin_stdlib() {
            return this.f27294b;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.f27295c;
        }

        @yfb
        public final cs9<K, V> getMap$kotlin_stdlib() {
            return this.f27293a;
        }

        public final boolean hasNext() {
            return this.f27294b < this.f27293a.f27288f;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.f27294b < this.f27293a.f27288f) {
                int[] iArr = this.f27293a.f27285c;
                int i = this.f27294b;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.f27294b = i + 1;
                }
            }
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.f27295c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f27293a.checkIsMutable$kotlin_stdlib();
            this.f27293a.removeEntryAt(this.f27295c);
            this.f27295c = -1;
            this.f27296d = this.f27293a.f27277C;
        }

        public final void setIndex$kotlin_stdlib(int i) {
            this.f27294b = i;
        }

        public final void setLastIndex$kotlin_stdlib(int i) {
            this.f27295c = i;
        }
    }

    /* JADX INFO: renamed from: cs9$e */
    public static final class C4484e<K, V> extends C4483d<K, V> implements Iterator<K>, xo8 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4484e(@yfb cs9<K, V> cs9Var) {
            super(cs9Var);
            md8.checkNotNullParameter(cs9Var, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f27288f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            K k = (K) getMap$kotlin_stdlib().f27283a[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return k;
        }
    }

    /* JADX INFO: renamed from: cs9$f */
    public static final class C4485f<K, V> extends C4483d<K, V> implements Iterator<V>, xo8 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4485f(@yfb cs9<K, V> cs9Var) {
            super(cs9Var);
            md8.checkNotNullParameter(cs9Var, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f27288f) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object[] objArr = getMap$kotlin_stdlib().f27284b;
            md8.checkNotNull(objArr);
            V v = (V) objArr[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return v;
        }
    }

    static {
        cs9 cs9Var = new cs9(0);
        cs9Var.f27282N = true;
        f27273V1 = cs9Var;
    }

    private cs9(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f27283a = kArr;
        this.f27284b = vArr;
        this.f27285c = iArr;
        this.f27286d = iArr2;
        this.f27287e = i;
        this.f27288f = i2;
        this.f27289m = f27272Q.computeShift(getHashSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.f27284b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) i89.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
        this.f27284b = vArr2;
        return vArr2;
    }

    private final void compact(boolean z) {
        int i;
        V[] vArr = this.f27284b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f27288f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f27285c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.f27283a;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f27286d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        i89.resetRange(this.f27283a, i3, i);
        if (vArr != null) {
            i89.resetRange(vArr, i3, this.f27288f);
        }
        this.f27288f = i3;
    }

    private final boolean contentEquals(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void ensureCapacity(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > getCapacity$kotlin_stdlib()) {
            int iNewCapacity$kotlin_stdlib = AbstractC7110i2.Companion.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), i);
            this.f27283a = (K[]) i89.copyOfUninitializedElements(this.f27283a, iNewCapacity$kotlin_stdlib);
            V[] vArr = this.f27284b;
            this.f27284b = vArr != null ? (V[]) i89.copyOfUninitializedElements(vArr, iNewCapacity$kotlin_stdlib) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f27285c, iNewCapacity$kotlin_stdlib);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f27285c = iArrCopyOf;
            int iComputeHashSize = f27272Q.computeHashSize(iNewCapacity$kotlin_stdlib);
            if (iComputeHashSize > getHashSize()) {
                rehash(iComputeHashSize);
            }
        }
    }

    private final void ensureExtraCapacity(int i) {
        if (shouldCompact(i)) {
            compact(true);
        } else {
            ensureCapacity(this.f27288f + i);
        }
    }

    private final int findKey(K k) {
        int iHash = hash(k);
        int i = this.f27287e;
        while (true) {
            int i2 = this.f27286d[iHash];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (md8.areEqual(this.f27283a[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
        }
    }

    private final int findValue(V v) {
        int i = this.f27288f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f27285c[i] >= 0) {
                V[] vArr = this.f27284b;
                md8.checkNotNull(vArr);
                if (md8.areEqual(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.f27286d.length;
    }

    private final int hash(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.f27289m;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (putEntry(it.next())) {
                z = true;
            }
        }
        return z;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] vArrAllocateValuesArray = allocateValuesArray();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrAllocateValuesArray[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        if (md8.areEqual(entry.getValue(), vArrAllocateValuesArray[i])) {
            return false;
        }
        vArrAllocateValuesArray[i] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i) {
        int iHash = hash(this.f27283a[i]);
        int i2 = this.f27287e;
        while (true) {
            int[] iArr = this.f27286d;
            if (iArr[iHash] == 0) {
                iArr[iHash] = i + 1;
                this.f27285c[i] = iHash;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
        }
    }

    private final void registerModification() {
        this.f27277C++;
    }

    private final void rehash(int i) {
        registerModification();
        int i2 = 0;
        if (this.f27288f > size()) {
            compact(false);
        }
        this.f27286d = new int[i];
        this.f27289m = f27272Q.computeShift(i);
        while (i2 < this.f27288f) {
            int i3 = i2 + 1;
            if (!putRehash(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeEntryAt(int i) {
        i89.resetAt(this.f27283a, i);
        V[] vArr = this.f27284b;
        if (vArr != null) {
            i89.resetAt(vArr, i);
        }
        removeHashAt(this.f27285c[i]);
        this.f27285c[i] = -1;
        this.f27278F = size() - 1;
        registerModification();
    }

    private final void removeHashAt(int i) {
        int iCoerceAtMost = kpd.coerceAtMost(this.f27287e * 2, getHashSize() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? getHashSize() - 1 : i - 1;
            i2++;
            if (i2 > this.f27287e) {
                this.f27286d[i3] = 0;
                return;
            }
            int[] iArr = this.f27286d;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((hash(this.f27283a[i5]) - i) & (getHashSize() - 1)) >= i2) {
                    this.f27286d[i3] = i4;
                    this.f27285c[i5] = i3;
                }
                iCoerceAtMost--;
            }
            i3 = i;
            i2 = 0;
            iCoerceAtMost--;
        } while (iCoerceAtMost >= 0);
        this.f27286d[i3] = -1;
    }

    private final boolean shouldCompact(int i) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i2 = this.f27288f;
        int i3 = capacity$kotlin_stdlib - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= getCapacity$kotlin_stdlib() / 4;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f27282N) {
            return new l1f(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iHash = hash(k);
            int iCoerceAtMost = kpd.coerceAtMost(this.f27287e * 2, getHashSize() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f27286d[iHash];
                if (i2 <= 0) {
                    if (this.f27288f < getCapacity$kotlin_stdlib()) {
                        int i3 = this.f27288f;
                        int i4 = i3 + 1;
                        this.f27288f = i4;
                        this.f27283a[i3] = k;
                        this.f27285c[i3] = iHash;
                        this.f27286d[iHash] = i4;
                        this.f27278F = size() + 1;
                        registerModification();
                        if (i > this.f27287e) {
                            this.f27287e = i;
                        }
                        return i3;
                    }
                    ensureExtraCapacity(1);
                } else {
                    if (md8.areEqual(this.f27283a[i2 - 1], k)) {
                        return -i2;
                    }
                    i++;
                    if (i > iCoerceAtMost) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    iHash = iHash == 0 ? getHashSize() - 1 : iHash - 1;
                }
            }
        }
    }

    @yfb
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.f27282N = true;
        if (size() > 0) {
            return this;
        }
        cs9 cs9Var = f27273V1;
        md8.checkNotNull(cs9Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return cs9Var;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.f27282N) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.f27288f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f27285c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f27286d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        i89.resetRange(this.f27283a, 0, this.f27288f);
        V[] vArr = this.f27284b;
        if (vArr != null) {
            i89.resetRange(vArr, 0, this.f27288f);
        }
        this.f27278F = 0;
        this.f27288f = 0;
        registerModification();
    }

    public final boolean containsAllEntries$kotlin_stdlib(@yfb Collection<?> collection) {
        md8.checkNotNullParameter(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@yfb Map.Entry<? extends K, ? extends V> entry) {
        md8.checkNotNullParameter(entry, "entry");
        int iFindKey = findKey(entry.getKey());
        if (iFindKey < 0) {
            return false;
        }
        V[] vArr = this.f27284b;
        md8.checkNotNull(vArr);
        return md8.areEqual(vArr[iFindKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    @yfb
    public final C4481b<K, V> entriesIterator$kotlin_stdlib() {
        return new C4481b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@gib Object obj) {
        return obj == this || ((obj instanceof Map) && contentEquals((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @gib
    public V get(Object obj) {
        int iFindKey = findKey(obj);
        if (iFindKey < 0) {
            return null;
        }
        V[] vArr = this.f27284b;
        md8.checkNotNull(vArr);
        return vArr[iFindKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.f27283a.length;
    }

    @yfb
    public Set<Map.Entry<K, V>> getEntries() {
        es9<K, V> es9Var = this.f27281M;
        if (es9Var != null) {
            return es9Var;
        }
        es9<K, V> es9Var2 = new es9<>(this);
        this.f27281M = es9Var2;
        return es9Var2;
    }

    @yfb
    public Set<K> getKeys() {
        fs9<K> fs9Var = this.f27279H;
        if (fs9Var != null) {
            return fs9Var;
        }
        fs9<K> fs9Var2 = new fs9<>(this);
        this.f27279H = fs9Var2;
        return fs9Var2;
    }

    public int getSize() {
        return this.f27278F;
    }

    @yfb
    public Collection<V> getValues() {
        gs9<V> gs9Var = this.f27280L;
        if (gs9Var != null) {
            return gs9Var;
        }
        gs9<V> gs9Var2 = new gs9<>(this);
        this.f27280L = gs9Var2;
        return gs9Var2;
    }

    @Override // java.util.Map
    public int hashCode() {
        C4481b<K, V> c4481bEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iNextHashCode$kotlin_stdlib = 0;
        while (c4481bEntriesIterator$kotlin_stdlib.hasNext()) {
            iNextHashCode$kotlin_stdlib += c4481bEntriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return iNextHashCode$kotlin_stdlib;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.f27282N;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @yfb
    public final C4484e<K, V> keysIterator$kotlin_stdlib() {
        return new C4484e<>(this);
    }

    @Override // java.util.Map
    @gib
    public V put(K k, V v) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(k);
        V[] vArrAllocateValuesArray = allocateValuesArray();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrAllocateValuesArray[iAddKey$kotlin_stdlib] = v;
            return null;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        V v2 = vArrAllocateValuesArray[i];
        vArrAllocateValuesArray[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public void putAll(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNullParameter(map, ymh.InterfaceC15729h.f102263c);
        checkIsMutable$kotlin_stdlib();
        putAllEntries(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @gib
    public V remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iFindKey = findKey(obj);
        if (iFindKey < 0) {
            return null;
        }
        V[] vArr = this.f27284b;
        md8.checkNotNull(vArr);
        V v = vArr[iFindKey];
        removeEntryAt(iFindKey);
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(@yfb Map.Entry<? extends K, ? extends V> entry) {
        md8.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iFindKey = findKey(entry.getKey());
        if (iFindKey < 0) {
            return false;
        }
        V[] vArr = this.f27284b;
        md8.checkNotNull(vArr);
        if (!md8.areEqual(vArr[iFindKey], entry.getValue())) {
            return false;
        }
        removeEntryAt(iFindKey);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K k) {
        checkIsMutable$kotlin_stdlib();
        int iFindKey = findKey(k);
        if (iFindKey < 0) {
            return false;
        }
        removeEntryAt(iFindKey);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V v) {
        checkIsMutable$kotlin_stdlib();
        int iFindValue = findValue(v);
        if (iFindValue < 0) {
            return false;
        }
        removeEntryAt(iFindValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C4481b<K, V> c4481bEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (c4481bEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            c4481bEntriesIterator$kotlin_stdlib.nextAppendString(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @yfb
    public final C4485f<K, V> valuesIterator$kotlin_stdlib() {
        return new C4485f<>(this);
    }

    public cs9() {
        this(8);
    }

    public cs9(int i) {
        this(i89.arrayOfUninitializedElements(i), null, new int[i], new int[f27272Q.computeHashSize(i)], 2, 0);
    }
}
