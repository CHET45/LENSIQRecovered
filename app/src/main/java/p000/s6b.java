package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1834:1\n1268#1,2:2003\n1272#1,5:2011\n1268#1,2:2042\n1272#1,5:2050\n1268#1,2:2067\n1272#1,5:2075\n1#2:1835\n1656#3,6:1836\n1810#3:1854\n1672#3:1858\n1589#3,3:1871\n1603#3:1875\n1599#3:1878\n1779#3,3:1883\n1793#3,3:1887\n1717#3:1891\n1705#3:1893\n1699#3:1894\n1712#3:1899\n1802#3:1901\n1589#3,3:1911\n1603#3:1915\n1599#3:1918\n1779#3,3:1923\n1793#3,3:1927\n1717#3:1931\n1705#3:1933\n1699#3:1934\n1712#3:1939\n1802#3:1941\n1810#3:1956\n1672#3:1960\n1810#3:1981\n1672#3:1985\n1656#3,6:2005\n1656#3,6:2016\n1589#3,3:2022\n1599#3:2025\n1603#3:2026\n1779#3,3:2027\n1793#3,3:2030\n1717#3:2033\n1705#3:2034\n1699#3:2035\n1712#3:2036\n1802#3:2037\n1666#3:2038\n1645#3:2039\n1664#3:2040\n1645#3:2041\n1656#3,6:2044\n1779#3,3:2055\n1810#3:2058\n1699#3:2059\n1669#3:2060\n1645#3:2061\n1589#3,3:2062\n1599#3:2065\n1603#3:2066\n1656#3,6:2069\n1656#3,6:2080\n1656#3,6:2086\n215#4,2:1842\n391#5,4:1844\n363#5,6:1848\n373#5,3:1855\n376#5,2:1859\n396#5,2:1861\n379#5,6:1863\n398#5:1869\n633#5:1870\n634#5:1874\n636#5,2:1876\n638#5,4:1879\n642#5:1886\n643#5:1890\n644#5:1892\n645#5,4:1895\n651#5:1900\n652#5,8:1902\n633#5:1910\n634#5:1914\n636#5,2:1916\n638#5,4:1919\n642#5:1926\n643#5:1930\n644#5:1932\n645#5,4:1935\n651#5:1940\n652#5,8:1942\n363#5,6:1950\n373#5,3:1957\n376#5,9:1961\n267#6,4:1970\n237#6,7:1974\n248#6,3:1982\n251#6,2:1986\n272#6,2:1988\n254#6,6:1990\n274#6:1996\n305#7,6:1997\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2003,2\n1113#1:2011,5\n1180#1:2042,2\n1180#1:2050,5\n1255#1:2067,2\n1255#1:2075,5\n848#1:1836,6\n972#1:1854\n972#1:1858\n1021#1:1871,3\n1021#1:1875\n1021#1:1878\n1021#1:1883,3\n1021#1:1887,3\n1021#1:1891\n1021#1:1893\n1021#1:1894\n1021#1:1899\n1021#1:1901\n1033#1:1911,3\n1033#1:1915\n1033#1:1918\n1033#1:1923,3\n1033#1:1927,3\n1033#1:1931\n1033#1:1933\n1033#1:1934\n1033#1:1939\n1033#1:1941\n1047#1:1956\n1047#1:1960\n1093#1:1981\n1093#1:1985\n1113#1:2005,6\n1129#1:2016,6\n1145#1:2022,3\n1146#1:2025\n1147#1:2026\n1154#1:2027,3\n1155#1:2030,3\n1156#1:2033\n1157#1:2034\n1157#1:2035\n1161#1:2036\n1164#1:2037\n1173#1:2038\n1173#1:2039\n1179#1:2040\n1179#1:2041\n1180#1:2044,6\n1195#1:2055,3\n1196#1:2058\n1198#1:2059\n1250#1:2060\n1250#1:2061\n1252#1:2062,3\n1253#1:2065\n1255#1:2066\n1255#1:2069,6\n1269#1:2080,6\n1275#1:2086,6\n963#1:1842,2\n972#1:1844,4\n972#1:1848,6\n972#1:1855,3\n972#1:1859,2\n972#1:1861,2\n972#1:1863,6\n972#1:1869\n1021#1:1870\n1021#1:1874\n1021#1:1876,2\n1021#1:1879,4\n1021#1:1886\n1021#1:1890\n1021#1:1892\n1021#1:1895,4\n1021#1:1900\n1021#1:1902,8\n1033#1:1910\n1033#1:1914\n1033#1:1916,2\n1033#1:1919,4\n1033#1:1926\n1033#1:1930\n1033#1:1932\n1033#1:1935,4\n1033#1:1940\n1033#1:1942,8\n1047#1:1950,6\n1047#1:1957,3\n1047#1:1961,9\n1093#1:1970,4\n1093#1:1974,7\n1093#1:1982,3\n1093#1:1986,2\n1093#1:1988,2\n1093#1:1990,6\n1093#1:1996\n1102#1:1997,6\n*E\n"})
public final class s6b<K, V> extends boe<K, V> {

    /* JADX INFO: renamed from: f */
    public int f80798f;

    /* JADX INFO: renamed from: s6b$a */
    @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1834:1\n215#2,2:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1574#1:1835,2\n*E\n"})
    public final class C12466a extends boe<K, V>.C1964a implements Map<K, V>, ap8 {

        /* JADX INFO: renamed from: s6b$a$a */
        @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n1726#2,3:1835\n363#3,6:1838\n373#3,3:1845\n376#3,9:1849\n363#3,6:1858\n373#3,3:1865\n376#3,9:1869\n633#3:1878\n634#3:1882\n636#3,2:1884\n638#3,4:1887\n642#3:1894\n643#3:1898\n644#3:1900\n645#3,4:1903\n651#3:1908\n652#3,8:1910\n1810#4:1844\n1672#4:1848\n1810#4:1864\n1672#4:1868\n1589#4,3:1879\n1603#4:1883\n1599#4:1886\n1779#4,3:1891\n1793#4,3:1895\n1717#4:1899\n1705#4:1901\n1699#4:1902\n1712#4:1907\n1802#4:1909\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n*L\n1342#1:1835,3\n1360#1:1838,6\n1360#1:1845,3\n1360#1:1849,9\n1382#1:1858,6\n1382#1:1865,3\n1382#1:1869,9\n1397#1:1878\n1397#1:1882\n1397#1:1884,2\n1397#1:1887,4\n1397#1:1894\n1397#1:1898\n1397#1:1900\n1397#1:1903,4\n1397#1:1908\n1397#1:1910,8\n1360#1:1844\n1360#1:1848\n1382#1:1864\n1382#1:1868\n1397#1:1879,3\n1397#1:1883\n1397#1:1886\n1397#1:1891,3\n1397#1:1895,3\n1397#1:1899\n1397#1:1901\n1397#1:1902\n1397#1:1907\n1397#1:1909\n*E\n"})
        public static final class a implements Set<Map.Entry<K, V>>, fp8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ s6b<K, V> f80800a;

            /* JADX INFO: renamed from: s6b$a$a$a, reason: collision with other inner class name */
            public static final class C16521a implements Iterator<Map.Entry<K, V>>, xo8 {

                /* JADX INFO: renamed from: a */
                @yfb
                public Iterator<? extends Map.Entry<K, V>> f80801a;

                /* JADX INFO: renamed from: b */
                public int f80802b = -1;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ s6b<K, V> f80803c;

                /* JADX INFO: renamed from: s6b$a$a$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", m4010f = "ScatterMap.kt", m4011i = {0, 0, 0, 0, 0, 0, 0}, m4012l = {1312}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m4015s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
                @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n*L\n1310#1:1835,6\n1310#1:1842,3\n1310#1:1846,9\n1310#1:1841\n1310#1:1845\n*E\n"})
                public static final class C16522a extends t7e implements gz6<xye<? super Map.Entry<K, V>>, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: C */
                    public long f80804C;

                    /* JADX INFO: renamed from: F */
                    public int f80805F;

                    /* JADX INFO: renamed from: H */
                    public /* synthetic */ Object f80806H;

                    /* JADX INFO: renamed from: L */
                    public final /* synthetic */ s6b<K, V> f80807L;

                    /* JADX INFO: renamed from: M */
                    public final /* synthetic */ C16521a f80808M;

                    /* JADX INFO: renamed from: a */
                    public Object f80809a;

                    /* JADX INFO: renamed from: b */
                    public Object f80810b;

                    /* JADX INFO: renamed from: c */
                    public Object f80811c;

                    /* JADX INFO: renamed from: d */
                    public int f80812d;

                    /* JADX INFO: renamed from: e */
                    public int f80813e;

                    /* JADX INFO: renamed from: f */
                    public int f80814f;

                    /* JADX INFO: renamed from: m */
                    public int f80815m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16522a(s6b<K, V> s6bVar, C16521a c16521a, zy2<? super C16522a> zy2Var) {
                        super(2, zy2Var);
                        this.f80807L = s6bVar;
                        this.f80808M = c16521a;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        C16522a c16522a = new C16522a(this.f80807L, this.f80808M, zy2Var);
                        c16522a.f80806H = obj;
                        return c16522a;
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb xye<? super Map.Entry<K, V>> xyeVar, @gib zy2<? super bth> zy2Var) {
                        return ((C16522a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x0070). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a7 -> B:20:0x00aa). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ad -> B:22:0x00ae). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bf -> B:27:0x00c0). Please report as a decompilation issue!!! */
                    @Override // p000.tq0
                    @p000.gib
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r23) {
                        /*
                            Method dump skipped, instruction units count: 201
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.s6b.C12466a.a.C16521a.C16522a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                public C16521a(s6b<K, V> s6bVar) {
                    this.f80803c = s6bVar;
                    this.f80801a = bze.iterator(new C16522a(s6bVar, this, null));
                }

                public final int getCurrent() {
                    return this.f80802b;
                }

                @yfb
                public final Iterator<Map.Entry<K, V>> getIterator() {
                    return this.f80801a;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f80801a.hasNext();
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i = this.f80802b;
                    if (i != -1) {
                        this.f80803c.removeValueAt(i);
                        this.f80802b = -1;
                    }
                }

                public final void setCurrent(int i) {
                    this.f80802b = i;
                }

                public final void setIterator(@yfb Iterator<? extends Map.Entry<K, V>> it) {
                    md8.checkNotNullParameter(it, "<set-?>");
                    this.f80801a = it;
                }

                @Override // java.util.Iterator
                @yfb
                public Map.Entry<K, V> next() {
                    return this.f80801a.next();
                }
            }

            public a(s6b<K, V> s6bVar) {
                this.f80800a = s6bVar;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(@yfb Collection<? extends Map.Entry<K, V>> collection) {
                md8.checkNotNullParameter(collection, "elements");
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f80800a.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (qlh.isMutableMapEntry(obj)) {
                    return contains((Map.Entry) obj);
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                s6b<K, V> s6bVar = this.f80800a;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!md8.areEqual(s6bVar.get((K) entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            }

            public int getSize() {
                return this.f80800a.f14268e;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f80800a.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @yfb
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C16521a(this.f80800a);
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean remove(Object obj) {
                if (qlh.isMutableMapEntry(obj)) {
                    return remove((Map.Entry) obj);
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(@yfb Collection<? extends Object> collection) {
                boolean z;
                int i;
                md8.checkNotNullParameter(collection, "elements");
                s6b<K, V> s6bVar = this.f80800a;
                long[] jArr = s6bVar.f14264a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((255 & j) < 128) {
                                    int i6 = (i2 << 3) + i5;
                                    Iterator<? extends Object> it = collection.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (md8.areEqual(entry.getKey(), s6bVar.f14265b[i6]) && md8.areEqual(entry.getValue(), s6bVar.f14266c[i6])) {
                                            s6bVar.removeValueAt(i6);
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    i = 8;
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                return z2;
                            }
                        }
                        if (i2 == length) {
                            z = z2;
                            break;
                        }
                        i2++;
                    }
                } else {
                    z = false;
                }
                return z;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(@yfb Collection<? extends Object> collection) {
                boolean z;
                int i;
                md8.checkNotNullParameter(collection, "elements");
                s6b<K, V> s6bVar = this.f80800a;
                long[] jArr = s6bVar.f14264a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((255 & j) < 128) {
                                    int i6 = (i2 << 3) + i5;
                                    Iterator<? extends Object> it = collection.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            s6bVar.removeValueAt(i6);
                                            z2 = true;
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (md8.areEqual(entry.getKey(), s6bVar.f14265b[i6]) && md8.areEqual(entry.getValue(), s6bVar.f14266c[i6])) {
                                            break;
                                        }
                                    }
                                    i = 8;
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                return z2;
                            }
                        }
                        if (i2 == length) {
                            z = z2;
                            break;
                        }
                        i2++;
                    }
                } else {
                    z = false;
                }
                return z;
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return f82.toArray(this);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(@yfb Map.Entry<K, V> entry) {
                md8.checkNotNullParameter(entry, "element");
                throw new UnsupportedOperationException();
            }

            public boolean contains(@yfb Map.Entry<K, V> entry) {
                md8.checkNotNullParameter(entry, "element");
                return md8.areEqual(this.f80800a.get(entry.getKey()), entry.getValue());
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
            
                if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
            
                r15 = -1;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean remove(@p000.yfb java.util.Map.Entry<K, V> r20) {
                /*
                    r19 = this;
                    r0 = r19
                    java.lang.String r1 = "element"
                    r2 = r20
                    p000.md8.checkNotNullParameter(r2, r1)
                    s6b<K, V> r1 = r0.f80800a
                    java.lang.Object r3 = r20.getKey()
                    if (r3 == 0) goto L16
                    int r5 = r3.hashCode()
                    goto L17
                L16:
                    r5 = 0
                L17:
                    r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
                    int r5 = r5 * r6
                    int r6 = r5 << 16
                    r5 = r5 ^ r6
                    r6 = r5 & 127(0x7f, float:1.78E-43)
                    int r7 = r1.f14267d
                    int r5 = r5 >>> 7
                    r5 = r5 & r7
                    r8 = 0
                L26:
                    long[] r9 = r1.f14264a
                    int r10 = r5 >> 3
                    r11 = r5 & 7
                    int r11 = r11 << 3
                    r12 = r9[r10]
                    long r12 = r12 >>> r11
                    r14 = 1
                    int r10 = r10 + r14
                    r15 = r9[r10]
                    int r9 = 64 - r11
                    long r9 = r15 << r9
                    long r14 = (long) r11
                    long r14 = -r14
                    r11 = 63
                    long r14 = r14 >> r11
                    long r9 = r9 & r14
                    long r9 = r9 | r12
                    long r11 = (long) r6
                    r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
                    long r11 = r11 * r13
                    long r11 = r11 ^ r9
                    long r13 = r11 - r13
                    long r11 = ~r11
                    long r11 = r11 & r13
                    r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r11 = r11 & r13
                L52:
                    r17 = 0
                    int r15 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
                    if (r15 == 0) goto L72
                    int r15 = java.lang.Long.numberOfTrailingZeros(r11)
                    int r15 = r15 >> 3
                    int r15 = r15 + r5
                    r15 = r15 & r7
                    java.lang.Object[] r4 = r1.f14265b
                    r4 = r4[r15]
                    boolean r4 = p000.md8.areEqual(r4, r3)
                    if (r4 == 0) goto L6b
                    goto L7c
                L6b:
                    r17 = 1
                    long r17 = r11 - r17
                    long r11 = r11 & r17
                    goto L52
                L72:
                    long r11 = ~r9
                    r4 = 6
                    long r11 = r11 << r4
                    long r9 = r9 & r11
                    long r9 = r9 & r13
                    int r4 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
                    if (r4 == 0) goto L97
                    r15 = -1
                L7c:
                    if (r15 < 0) goto L95
                    s6b<K, V> r1 = r0.f80800a
                    java.lang.Object[] r1 = r1.f14266c
                    r1 = r1[r15]
                    java.lang.Object r2 = r20.getValue()
                    boolean r1 = p000.md8.areEqual(r1, r2)
                    if (r1 == 0) goto L95
                    s6b<K, V> r1 = r0.f80800a
                    r1.removeValueAt(r15)
                    r1 = 1
                    return r1
                L95:
                    r4 = 0
                    return r4
                L97:
                    r4 = 0
                    int r8 = r8 + 8
                    int r5 = r5 + r8
                    r5 = r5 & r7
                    goto L26
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.s6b.C12466a.a.remove(java.util.Map$Entry):boolean");
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                md8.checkNotNullParameter(tArr, "array");
                return (T[]) f82.toArray(this, tArr);
            }
        }

        /* JADX INFO: renamed from: s6b$a$b */
        @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n633#2:1875\n634#2:1879\n636#2,2:1881\n638#2,4:1884\n642#2:1891\n643#2:1895\n644#2:1897\n645#2,4:1900\n651#2:1905\n652#2,8:1907\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1589#3,3:1876\n1603#3:1880\n1599#3:1883\n1779#3,3:1888\n1793#3,3:1892\n1717#3:1896\n1705#3:1898\n1699#3:1899\n1712#3:1904\n1802#3:1906\n1726#4,3:1915\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n*L\n1450#1:1835,6\n1450#1:1842,3\n1450#1:1846,9\n1461#1:1855,6\n1461#1:1862,3\n1461#1:1866,9\n1471#1:1875\n1471#1:1879\n1471#1:1881,2\n1471#1:1884,4\n1471#1:1891\n1471#1:1895\n1471#1:1897\n1471#1:1900,4\n1471#1:1905\n1471#1:1907,8\n1450#1:1841\n1450#1:1845\n1461#1:1861\n1461#1:1865\n1471#1:1876,3\n1471#1:1880\n1471#1:1883\n1471#1:1888,3\n1471#1:1892,3\n1471#1:1896\n1471#1:1898\n1471#1:1899\n1471#1:1904\n1471#1:1906\n1480#1:1915,3\n*E\n"})
        public static final class b implements Set<K>, fp8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ s6b<K, V> f80816a;

            /* JADX INFO: renamed from: s6b$a$b$a */
            public static final class a implements Iterator<K>, xo8 {

                /* JADX INFO: renamed from: a */
                @yfb
                public final Iterator<Integer> f80817a;

                /* JADX INFO: renamed from: b */
                public int f80818b = -1;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ s6b<K, V> f80819c;

                /* JADX INFO: renamed from: s6b$a$b$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", m4010f = "ScatterMap.kt", m4011i = {0, 0, 0, 0, 0, 0, 0}, m4012l = {1415}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m4015s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
                @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n*L\n1414#1:1835,6\n1414#1:1842,3\n1414#1:1846,9\n1414#1:1841\n1414#1:1845\n*E\n"})
                public static final class C16523a extends t7e implements gz6<xye<? super Integer>, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: C */
                    public /* synthetic */ Object f80820C;

                    /* JADX INFO: renamed from: F */
                    public final /* synthetic */ s6b<K, V> f80821F;

                    /* JADX INFO: renamed from: a */
                    public Object f80822a;

                    /* JADX INFO: renamed from: b */
                    public int f80823b;

                    /* JADX INFO: renamed from: c */
                    public int f80824c;

                    /* JADX INFO: renamed from: d */
                    public int f80825d;

                    /* JADX INFO: renamed from: e */
                    public int f80826e;

                    /* JADX INFO: renamed from: f */
                    public long f80827f;

                    /* JADX INFO: renamed from: m */
                    public int f80828m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16523a(s6b<K, V> s6bVar, zy2<? super C16523a> zy2Var) {
                        super(2, zy2Var);
                        this.f80821F = s6bVar;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        C16523a c16523a = new C16523a(this.f80821F, zy2Var);
                        c16523a.f80820C = obj;
                        return c16523a;
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb xye<? super Integer> xyeVar, @gib zy2<? super bth> zy2Var) {
                        return ((C16523a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:23:0x0095). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0063). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:20:0x008c). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0089 -> B:20:0x008c). Please report as a decompilation issue!!! */
                    @Override // p000.tq0
                    @p000.gib
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r21) {
                        /*
                            r20 = this;
                            r0 = r20
                            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                            int r2 = r0.f80828m
                            r3 = 0
                            r4 = 8
                            r5 = 1
                            if (r2 == 0) goto L2e
                            if (r2 != r5) goto L26
                            int r2 = r0.f80826e
                            int r6 = r0.f80825d
                            long r7 = r0.f80827f
                            int r9 = r0.f80824c
                            int r10 = r0.f80823b
                            java.lang.Object r11 = r0.f80822a
                            long[] r11 = (long[]) r11
                            java.lang.Object r12 = r0.f80820C
                            xye r12 = (p000.xye) r12
                            p000.y7e.throwOnFailure(r21)
                            goto L8c
                        L26:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r1
                        L2e:
                            p000.y7e.throwOnFailure(r21)
                            java.lang.Object r2 = r0.f80820C
                            xye r2 = (p000.xye) r2
                            s6b<K, V> r6 = r0.f80821F
                            long[] r6 = r6.f14264a
                            int r7 = r6.length
                            int r7 = r7 + (-2)
                            if (r7 < 0) goto L9a
                            r8 = r3
                        L3f:
                            r9 = r6[r8]
                            long r11 = ~r9
                            r13 = 7
                            long r11 = r11 << r13
                            long r11 = r11 & r9
                            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                            long r11 = r11 & r13
                            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r11 == 0) goto L95
                            int r11 = r8 - r7
                            int r11 = ~r11
                            int r11 = r11 >>> 31
                            int r11 = 8 - r11
                            r12 = r2
                            r2 = r3
                            r17 = r11
                            r11 = r6
                            r6 = r17
                            r18 = r9
                            r10 = r7
                            r9 = r8
                            r7 = r18
                        L63:
                            if (r2 >= r6) goto L8f
                            r13 = 255(0xff, double:1.26E-321)
                            long r13 = r13 & r7
                            r15 = 128(0x80, double:6.3E-322)
                            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                            if (r13 >= 0) goto L8c
                            int r13 = r9 << 3
                            int r13 = r13 + r2
                            java.lang.Integer r13 = p000.wc1.boxInt(r13)
                            r0.f80820C = r12
                            r0.f80822a = r11
                            r0.f80823b = r10
                            r0.f80824c = r9
                            r0.f80827f = r7
                            r0.f80825d = r6
                            r0.f80826e = r2
                            r0.f80828m = r5
                            java.lang.Object r13 = r12.yield(r13, r0)
                            if (r13 != r1) goto L8c
                            return r1
                        L8c:
                            long r7 = r7 >> r4
                            int r2 = r2 + r5
                            goto L63
                        L8f:
                            if (r6 != r4) goto L9a
                            r8 = r9
                            r7 = r10
                            r6 = r11
                            r2 = r12
                        L95:
                            if (r8 == r7) goto L9a
                            int r8 = r8 + 1
                            goto L3f
                        L9a:
                            bth r1 = p000.bth.f14751a
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.s6b.C12466a.b.a.C16523a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                public a(s6b<K, V> s6bVar) {
                    this.f80819c = s6bVar;
                    this.f80817a = bze.iterator(new C16523a(s6bVar, null));
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f80817a.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    int iIntValue = this.f80817a.next().intValue();
                    this.f80818b = iIntValue;
                    return (K) this.f80819c.f14265b[iIntValue];
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i = this.f80818b;
                    if (i >= 0) {
                        this.f80819c.removeValueAt(i);
                        this.f80818b = -1;
                    }
                }
            }

            public b(s6b<K, V> s6bVar) {
                this.f80816a = s6bVar;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(K k) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(@yfb Collection<? extends K> collection) {
                md8.checkNotNullParameter(collection, "elements");
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f80816a.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.f80816a.containsKey(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                s6b<K, V> s6bVar = this.f80816a;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (!s6bVar.containsKey((K) it.next())) {
                        return false;
                    }
                }
                return true;
            }

            public int getSize() {
                return this.f80816a.f14268e;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f80816a.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @yfb
            public Iterator<K> iterator() {
                return new a(this.f80816a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
            
                if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
            
                r12 = -1;
             */
            @Override // java.util.Set, java.util.Collection
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean remove(java.lang.Object r19) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r19
                    s6b<K, V> r2 = r0.f80816a
                    if (r1 == 0) goto Ld
                    int r4 = r19.hashCode()
                    goto Le
                Ld:
                    r4 = 0
                Le:
                    r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
                    int r4 = r4 * r5
                    int r5 = r4 << 16
                    r4 = r4 ^ r5
                    r5 = r4 & 127(0x7f, float:1.78E-43)
                    int r6 = r2.f14267d
                    int r4 = r4 >>> 7
                    r4 = r4 & r6
                    r7 = 0
                L1d:
                    long[] r8 = r2.f14264a
                    int r9 = r4 >> 3
                    r10 = r4 & 7
                    int r10 = r10 << 3
                    r11 = r8[r9]
                    long r11 = r11 >>> r10
                    r13 = 1
                    int r9 = r9 + r13
                    r14 = r8[r9]
                    int r8 = 64 - r10
                    long r8 = r14 << r8
                    long r14 = (long) r10
                    long r14 = -r14
                    r10 = 63
                    long r14 = r14 >> r10
                    long r8 = r8 & r14
                    long r8 = r8 | r11
                    long r10 = (long) r5
                    r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
                    long r10 = r10 * r14
                    long r10 = r10 ^ r8
                    long r14 = r10 - r14
                    long r10 = ~r10
                    long r10 = r10 & r14
                    r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r10 = r10 & r14
                L49:
                    r16 = 0
                    int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
                    if (r12 == 0) goto L69
                    int r12 = java.lang.Long.numberOfTrailingZeros(r10)
                    int r12 = r12 >> 3
                    int r12 = r12 + r4
                    r12 = r12 & r6
                    java.lang.Object[] r3 = r2.f14265b
                    r3 = r3[r12]
                    boolean r3 = p000.md8.areEqual(r3, r1)
                    if (r3 == 0) goto L62
                    goto L73
                L62:
                    r16 = 1
                    long r16 = r10 - r16
                    long r10 = r10 & r16
                    goto L49
                L69:
                    long r10 = ~r8
                    r3 = 6
                    long r10 = r10 << r3
                    long r8 = r8 & r10
                    long r8 = r8 & r14
                    int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
                    if (r3 == 0) goto L7d
                    r12 = -1
                L73:
                    if (r12 < 0) goto L7b
                    s6b<K, V> r1 = r0.f80816a
                    r1.removeValueAt(r12)
                    return r13
                L7b:
                    r3 = 0
                    return r3
                L7d:
                    r3 = 0
                    int r7 = r7 + 8
                    int r4 = r4 + r7
                    r4 = r4 & r6
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.s6b.C12466a.b.remove(java.lang.Object):boolean");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                s6b<K, V> s6bVar = this.f80816a;
                long[] jArr = s6bVar.f14264a;
                int length = jArr.length - 2;
                boolean z = false;
                if (length >= 0) {
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    if (v82.contains(collection, s6bVar.f14265b[i4])) {
                                        s6bVar.removeValueAt(i4);
                                        z2 = true;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return z2;
                            }
                        }
                        if (i == length) {
                            z = z2;
                            break;
                        }
                        i++;
                    }
                }
                return z;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                s6b<K, V> s6bVar = this.f80816a;
                long[] jArr = s6bVar.f14264a;
                int length = jArr.length - 2;
                boolean z = false;
                if (length >= 0) {
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    if (!v82.contains(collection, s6bVar.f14265b[i4])) {
                                        s6bVar.removeValueAt(i4);
                                        z2 = true;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return z2;
                            }
                        }
                        if (i == length) {
                            z = z2;
                            break;
                        }
                        i++;
                    }
                }
                return z;
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return f82.toArray(this);
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                md8.checkNotNullParameter(tArr, "array");
                return (T[]) f82.toArray(this, tArr);
            }
        }

        /* JADX INFO: renamed from: s6b$a$c */
        @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n363#2,6:1875\n373#2,3:1882\n376#2,9:1886\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1810#3:1881\n1672#3:1885\n1726#4,3:1895\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n*L\n1530#1:1835,6\n1530#1:1842,3\n1530#1:1846,9\n1541#1:1855,6\n1541#1:1862,3\n1541#1:1866,9\n1551#1:1875,6\n1551#1:1882,3\n1551#1:1886,9\n1530#1:1841\n1530#1:1845\n1541#1:1861\n1541#1:1865\n1551#1:1881\n1551#1:1885\n1561#1:1895,3\n*E\n"})
        public static final class c implements Collection<V>, vo8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ s6b<K, V> f80829a;

            /* JADX INFO: renamed from: s6b$a$c$a */
            public static final class a implements Iterator<V>, xo8 {

                /* JADX INFO: renamed from: a */
                @yfb
                public final Iterator<Integer> f80830a;

                /* JADX INFO: renamed from: b */
                public int f80831b = -1;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ s6b<K, V> f80832c;

                /* JADX INFO: renamed from: s6b$a$c$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1", m4010f = "ScatterMap.kt", m4011i = {0, 0, 0, 0, 0, 0, 0}, m4012l = {1495}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m4015s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
                @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1\n*L\n1494#1:1835,6\n1494#1:1842,3\n1494#1:1846,9\n1494#1:1841\n1494#1:1845\n*E\n"})
                public static final class C16524a extends t7e implements gz6<xye<? super Integer>, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: C */
                    public /* synthetic */ Object f80833C;

                    /* JADX INFO: renamed from: F */
                    public final /* synthetic */ s6b<K, V> f80834F;

                    /* JADX INFO: renamed from: a */
                    public Object f80835a;

                    /* JADX INFO: renamed from: b */
                    public int f80836b;

                    /* JADX INFO: renamed from: c */
                    public int f80837c;

                    /* JADX INFO: renamed from: d */
                    public int f80838d;

                    /* JADX INFO: renamed from: e */
                    public int f80839e;

                    /* JADX INFO: renamed from: f */
                    public long f80840f;

                    /* JADX INFO: renamed from: m */
                    public int f80841m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16524a(s6b<K, V> s6bVar, zy2<? super C16524a> zy2Var) {
                        super(2, zy2Var);
                        this.f80834F = s6bVar;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        C16524a c16524a = new C16524a(this.f80834F, zy2Var);
                        c16524a.f80833C = obj;
                        return c16524a;
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb xye<? super Integer> xyeVar, @gib zy2<? super bth> zy2Var) {
                        return ((C16524a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:23:0x0095). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0063). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:20:0x008c). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0089 -> B:20:0x008c). Please report as a decompilation issue!!! */
                    @Override // p000.tq0
                    @p000.gib
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r21) {
                        /*
                            r20 = this;
                            r0 = r20
                            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                            int r2 = r0.f80841m
                            r3 = 0
                            r4 = 8
                            r5 = 1
                            if (r2 == 0) goto L2e
                            if (r2 != r5) goto L26
                            int r2 = r0.f80839e
                            int r6 = r0.f80838d
                            long r7 = r0.f80840f
                            int r9 = r0.f80837c
                            int r10 = r0.f80836b
                            java.lang.Object r11 = r0.f80835a
                            long[] r11 = (long[]) r11
                            java.lang.Object r12 = r0.f80833C
                            xye r12 = (p000.xye) r12
                            p000.y7e.throwOnFailure(r21)
                            goto L8c
                        L26:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r1
                        L2e:
                            p000.y7e.throwOnFailure(r21)
                            java.lang.Object r2 = r0.f80833C
                            xye r2 = (p000.xye) r2
                            s6b<K, V> r6 = r0.f80834F
                            long[] r6 = r6.f14264a
                            int r7 = r6.length
                            int r7 = r7 + (-2)
                            if (r7 < 0) goto L9a
                            r8 = r3
                        L3f:
                            r9 = r6[r8]
                            long r11 = ~r9
                            r13 = 7
                            long r11 = r11 << r13
                            long r11 = r11 & r9
                            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                            long r11 = r11 & r13
                            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r11 == 0) goto L95
                            int r11 = r8 - r7
                            int r11 = ~r11
                            int r11 = r11 >>> 31
                            int r11 = 8 - r11
                            r12 = r2
                            r2 = r3
                            r17 = r11
                            r11 = r6
                            r6 = r17
                            r18 = r9
                            r10 = r7
                            r9 = r8
                            r7 = r18
                        L63:
                            if (r2 >= r6) goto L8f
                            r13 = 255(0xff, double:1.26E-321)
                            long r13 = r13 & r7
                            r15 = 128(0x80, double:6.3E-322)
                            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                            if (r13 >= 0) goto L8c
                            int r13 = r9 << 3
                            int r13 = r13 + r2
                            java.lang.Integer r13 = p000.wc1.boxInt(r13)
                            r0.f80833C = r12
                            r0.f80835a = r11
                            r0.f80836b = r10
                            r0.f80837c = r9
                            r0.f80840f = r7
                            r0.f80838d = r6
                            r0.f80839e = r2
                            r0.f80841m = r5
                            java.lang.Object r13 = r12.yield(r13, r0)
                            if (r13 != r1) goto L8c
                            return r1
                        L8c:
                            long r7 = r7 >> r4
                            int r2 = r2 + r5
                            goto L63
                        L8f:
                            if (r6 != r4) goto L9a
                            r8 = r9
                            r7 = r10
                            r6 = r11
                            r2 = r12
                        L95:
                            if (r8 == r7) goto L9a
                            int r8 = r8 + 1
                            goto L3f
                        L9a:
                            bth r1 = p000.bth.f14751a
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.s6b.C12466a.c.a.C16524a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                public a(s6b<K, V> s6bVar) {
                    this.f80832c = s6bVar;
                    this.f80830a = bze.iterator(new C16524a(s6bVar, null));
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f80830a.hasNext();
                }

                @Override // java.util.Iterator
                public V next() {
                    int iIntValue = this.f80830a.next().intValue();
                    this.f80831b = iIntValue;
                    return (V) this.f80832c.f14266c[iIntValue];
                }

                @Override // java.util.Iterator
                public void remove() {
                    int i = this.f80831b;
                    if (i >= 0) {
                        this.f80832c.removeValueAt(i);
                        this.f80831b = -1;
                    }
                }
            }

            public c(s6b<K, V> s6bVar) {
                this.f80829a = s6bVar;
            }

            @Override // java.util.Collection
            public boolean add(V v) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean addAll(@yfb Collection<? extends V> collection) {
                md8.checkNotNullParameter(collection, "elements");
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public void clear() {
                this.f80829a.clear();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.f80829a.containsValue(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                s6b<K, V> s6bVar = this.f80829a;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (!s6bVar.containsValue((V) it.next())) {
                        return false;
                    }
                }
                return true;
            }

            public int getSize() {
                return this.f80829a.f14268e;
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f80829a.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            @yfb
            public Iterator<V> iterator() {
                return new a(this.f80829a);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
            @Override // java.util.Collection
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean remove(java.lang.Object r15) {
                /*
                    r14 = this;
                    s6b<K, V> r0 = r14.f80829a
                    long[] r1 = r0.f14264a
                    int r2 = r1.length
                    int r2 = r2 + (-2)
                    r3 = 0
                    if (r2 < 0) goto L4d
                    r4 = r3
                Lb:
                    r5 = r1[r4]
                    long r7 = ~r5
                    r9 = 7
                    long r7 = r7 << r9
                    long r7 = r7 & r5
                    r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r7 = r7 & r9
                    int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r7 == 0) goto L48
                    int r7 = r4 - r2
                    int r7 = ~r7
                    int r7 = r7 >>> 31
                    r8 = 8
                    int r7 = 8 - r7
                    r9 = r3
                L25:
                    if (r9 >= r7) goto L46
                    r10 = 255(0xff, double:1.26E-321)
                    long r10 = r10 & r5
                    r12 = 128(0x80, double:6.3E-322)
                    int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r10 >= 0) goto L42
                    int r10 = r4 << 3
                    int r10 = r10 + r9
                    java.lang.Object[] r11 = r0.f14266c
                    r11 = r11[r10]
                    boolean r11 = p000.md8.areEqual(r11, r15)
                    if (r11 == 0) goto L42
                    r0.removeValueAt(r10)
                    r15 = 1
                    return r15
                L42:
                    long r5 = r5 >> r8
                    int r9 = r9 + 1
                    goto L25
                L46:
                    if (r7 != r8) goto L4d
                L48:
                    if (r4 == r2) goto L4d
                    int r4 = r4 + 1
                    goto Lb
                L4d:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.s6b.C12466a.c.remove(java.lang.Object):boolean");
            }

            @Override // java.util.Collection
            public boolean removeAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                s6b<K, V> s6bVar = this.f80829a;
                long[] jArr = s6bVar.f14264a;
                int length = jArr.length - 2;
                boolean z = false;
                if (length >= 0) {
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    if (v82.contains(collection, s6bVar.f14266c[i4])) {
                                        s6bVar.removeValueAt(i4);
                                        z2 = true;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return z2;
                            }
                        }
                        if (i == length) {
                            z = z2;
                            break;
                        }
                        i++;
                    }
                }
                return z;
            }

            @Override // java.util.Collection
            public boolean retainAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                s6b<K, V> s6bVar = this.f80829a;
                long[] jArr = s6bVar.f14264a;
                int length = jArr.length - 2;
                boolean z = false;
                if (length >= 0) {
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    if (!v82.contains(collection, s6bVar.f14266c[i4])) {
                                        s6bVar.removeValueAt(i4);
                                        z2 = true;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return z2;
                            }
                        }
                        if (i == length) {
                            z = z2;
                            break;
                        }
                        i++;
                    }
                }
                return z;
            }

            @Override // java.util.Collection
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return f82.toArray(this);
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                md8.checkNotNullParameter(tArr, "array");
                return (T[]) f82.toArray(this, tArr);
            }
        }

        public C12466a() {
            super();
        }

        @Override // p000.boe.C1964a, java.util.Map
        public void clear() {
            s6b.this.clear();
        }

        @Override // p000.boe.C1964a
        @yfb
        public Set<Map.Entry<K, V>> getEntries() {
            return new a(s6b.this);
        }

        @Override // p000.boe.C1964a
        @yfb
        public Set<K> getKeys() {
            return new b(s6b.this);
        }

        @Override // p000.boe.C1964a
        @yfb
        public Collection<V> getValues() {
            return new c(s6b.this);
        }

        @Override // p000.boe.C1964a, java.util.Map
        @gib
        public V put(K k, V v) {
            return s6b.this.put(k, v);
        }

        @Override // p000.boe.C1964a, java.util.Map
        public void putAll(@yfb Map<? extends K, ? extends V> map) {
            md8.checkNotNullParameter(map, ymh.InterfaceC15729h.f102263c);
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // p000.boe.C1964a, java.util.Map
        @gib
        public V remove(Object obj) {
            return s6b.this.remove(obj);
        }
    }

    public s6b() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        if (this.f14267d <= 8 || Long.compareUnsigned(oph.m31533constructorimpl(oph.m31533constructorimpl(this.f14268e) * 32), oph.m31533constructorimpl(oph.m31533constructorimpl(this.f14267d) * 25)) > 0) {
            resizeStorage(coe.nextCapacity(this.f14267d));
        } else {
            resizeStorage(coe.nextCapacity(this.f14267d));
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this.f14267d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f14264a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void initializeGrowth() {
        this.f80798f = coe.loadedCapacity(getCapacity()) - this.f14268e;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = coe.f17275e;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f14264a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        int iMax = i > 0 ? Math.max(7, coe.normalizeCapacity(i)) : 0;
        this.f14267d = iMax;
        initializeMetadata(iMax);
        this.f14265b = new Object[iMax];
        this.f14266c = new Object[iMax];
    }

    private final void resizeStorage(int i) {
        int i2;
        long[] jArr = this.f14264a;
        Object[] objArr = this.f14265b;
        Object[] objArr2 = this.f14266c;
        int i3 = this.f14267d;
        initializeStorage(i);
        Object[] objArr3 = this.f14265b;
        Object[] objArr4 = this.f14266c;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr2 = this.f14264a;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                i2 = i4;
                jArr2[i6] = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                int i8 = this.f14267d;
                int i9 = ((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr2[i10] = (jArr2[i10] & (~(255 << i11))) | (j << i11);
                objArr3[iFindFirstAvailableSlot] = obj;
                objArr4[iFindFirstAvailableSlot] = objArr2[i2];
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    private final void writeMetadata(int i, long j) {
        long[] jArr = this.f14264a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.f14267d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    @yfb
    public final Map<K, V> asMutableMap() {
        return new C12466a();
    }

    public final void clear() {
        this.f14268e = 0;
        long[] jArr = this.f14264a;
        if (jArr != coe.f17275e) {
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f14264a;
            int i = this.f14267d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        u70.fill(this.f14266c, (Object) null, 0, this.f14267d);
        u70.fill(this.f14265b, (Object) null, 0, this.f14267d);
        initializeGrowth();
    }

    public final V compute(K k, @yfb gz6<? super K, ? super V, ? extends V> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "computeBlock");
        int iFindInsertIndex = findInsertIndex(k);
        boolean z = iFindInsertIndex < 0;
        V vInvoke = gz6Var.invoke(k, z ? null : this.f14266c[iFindInsertIndex]);
        if (z) {
            int i = ~iFindInsertIndex;
            this.f14265b[i] = k;
            this.f14266c[i] = vInvoke;
        } else {
            this.f14266c[iFindInsertIndex] = vInvoke;
        }
        return vInvoke;
    }

    @yjd
    public final int findInsertIndex(K k) {
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.f14267d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f14264a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * coe.f17281k);
            for (long j4 = (~j3) & (j3 - coe.f17281k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (md8.areEqual(this.f14265b[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.f80798f == 0 && ((this.f14264a[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this.f14268e++;
                int i10 = this.f80798f;
                long[] jArr2 = this.f14264a;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.f80798f = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                jArr2[i11] = (j5 & (~(255 << i12))) | (j2 << i12);
                int i13 = this.f14267d;
                int i14 = ((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j2 << i16);
                return ~iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public final V getOrPut(K k, @yfb ny6<? extends V> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        V v = get(k);
        if (v != null) {
            return v;
        }
        V vInvoke = ny6Var.invoke();
        set(k, vInvoke);
        return vInvoke;
    }

    public final void minusAssign(K k) {
        remove(k);
    }

    public final void plusAssign(@yfb scc<? extends K, ? extends V> sccVar) {
        md8.checkNotNullParameter(sccVar, "pair");
        set(sccVar.getFirst(), sccVar.getSecond());
    }

    @gib
    public final V put(K k, V v) {
        int iFindInsertIndex = findInsertIndex(k);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.f14266c;
        V v2 = (V) objArr[iFindInsertIndex];
        this.f14265b[iFindInsertIndex] = k;
        objArr[iFindInsertIndex] = v;
        return v2;
    }

    public final void putAll(@yfb scc<? extends K, ? extends V>[] sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        for (scc<? extends K, ? extends V> sccVar : sccVarArr) {
            set(sccVar.component1(), sccVar.component2());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f14267d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f14264a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f14265b
            r11 = r11[r10]
            boolean r11 = p000.md8.areEqual(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s6b.remove(java.lang.Object):java.lang.Object");
    }

    public final void removeIf(@yfb gz6<? super K, ? super V, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        long[] jArr = this.f14264a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (gz6Var.invoke(this.f14265b[i4], this.f14266c[i4]).booleanValue()) {
                            removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @gib
    @yjd
    public final V removeValueAt(int i) {
        this.f14268e--;
        long[] jArr = this.f14264a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.f14267d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.f14265b[i] = null;
        Object[] objArr = this.f14266c;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void set(K k, V v) {
        int iFindInsertIndex = findInsertIndex(k);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.f14265b[iFindInsertIndex] = k;
        this.f14266c[iFindInsertIndex] = v;
    }

    public final int trim() {
        int i = this.f14267d;
        int iNormalizeCapacity = coe.normalizeCapacity(coe.unloadedCapacity(this.f14268e));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this.f14267d;
    }

    public /* synthetic */ s6b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(@yfb K[] kArr) {
        md8.checkNotNullParameter(kArr, "keys");
        for (K k : kArr) {
            remove(k);
        }
    }

    public final void plusAssign(@yfb scc<? extends K, ? extends V>[] sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        putAll(sccVarArr);
    }

    public s6b(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(coe.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final void plusAssign(@yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        md8.checkNotNullParameter(iterable, "pairs");
        putAll(iterable);
    }

    public final void putAll(@yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        md8.checkNotNullParameter(iterable, "pairs");
        for (scc<? extends K, ? extends V> sccVar : iterable) {
            set(sccVar.component1(), sccVar.component2());
        }
    }

    public final void minusAssign(@yfb Iterable<? extends K> iterable) {
        md8.checkNotNullParameter(iterable, "keys");
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@yfb vye<? extends scc<? extends K, ? extends V>> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "pairs");
        putAll(vyeVar);
    }

    public final void plusAssign(@yfb Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, ymh.InterfaceC15729h.f102263c);
        putAll(map);
    }

    public final void putAll(@yfb vye<? extends scc<? extends K, ? extends V>> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "pairs");
        for (scc<? extends K, ? extends V> sccVar : vyeVar) {
            set(sccVar.component1(), sccVar.component2());
        }
    }

    public final void minusAssign(@yfb vye<? extends K> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "keys");
        Iterator<? extends K> it = vyeVar.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@yfb boe<K, V> boeVar) {
        md8.checkNotNullParameter(boeVar, ymh.InterfaceC15729h.f102263c);
        putAll(boeVar);
    }

    public final void putAll(@yfb Map<K, ? extends V> map) {
        md8.checkNotNullParameter(map, ymh.InterfaceC15729h.f102263c);
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@yfb doe<K> doeVar) {
        md8.checkNotNullParameter(doeVar, "keys");
        Object[] objArr = doeVar.f30278b;
        long[] jArr = doeVar.f30277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(K r18, V r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f14267d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f14264a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f14265b
            r15 = r15[r11]
            boolean r15 = p000.md8.areEqual(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L84
            r11 = -1
        L71:
            if (r11 < 0) goto L83
            java.lang.Object[] r1 = r0.f14266c
            r1 = r1[r11]
            r7 = r19
            boolean r1 = p000.md8.areEqual(r1, r7)
            if (r1 == 0) goto L83
            r0.removeValueAt(r11)
            return r12
        L83:
            return r2
        L84:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s6b.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@yfb boe<K, V> boeVar) {
        md8.checkNotNullParameter(boeVar, ymh.InterfaceC15729h.f102263c);
        Object[] objArr = boeVar.f14265b;
        Object[] objArr2 = boeVar.f14266c;
        long[] jArr = boeVar.f14264a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        set(objArr[i4], objArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@yfb ckb<K> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "keys");
        Object[] objArr = ckbVar.f16823a;
        int i = ckbVar.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }
}
