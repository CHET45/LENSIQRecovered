package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n633#1:1835\n634#1:1839\n636#1,2:1841\n638#1,4:1844\n642#1:1851\n643#1:1855\n644#1:1857\n645#1,4:1860\n651#1:1865\n652#1,8:1867\n633#1:1875\n634#1:1879\n636#1,2:1881\n638#1,4:1884\n642#1:1891\n643#1:1895\n644#1:1897\n645#1,4:1900\n651#1:1905\n652#1,8:1907\n363#1,6:1917\n373#1,3:1924\n376#1,9:1928\n363#1,6:1937\n373#1,3:1944\n376#1,9:1948\n363#1,6:1957\n373#1,3:1964\n376#1,9:1968\n391#1,4:1977\n363#1,6:1981\n373#1,3:1988\n376#1,2:1992\n396#1,2:1994\n379#1,6:1996\n398#1:2002\n391#1,4:2003\n363#1,6:2007\n373#1,3:2014\n376#1,2:2018\n396#1,2:2020\n379#1,6:2022\n398#1:2028\n391#1,4:2029\n363#1,6:2033\n373#1,3:2040\n376#1,2:2044\n396#1,2:2046\n379#1,6:2048\n398#1:2054\n633#1:2055\n634#1:2059\n636#1,2:2061\n638#1,4:2064\n642#1:2071\n643#1:2075\n644#1:2077\n645#1,4:2080\n651#1:2085\n652#1,8:2087\n633#1:2095\n634#1:2099\n636#1,2:2101\n638#1,4:2104\n642#1:2111\n643#1:2115\n644#1:2117\n645#1,4:2120\n651#1:2125\n652#1,8:2127\n418#1,3:2135\n363#1,6:2138\n373#1,3:2145\n376#1,2:2149\n422#1,2:2151\n379#1,6:2153\n424#1:2159\n391#1,4:2160\n363#1,6:2164\n373#1,3:2171\n376#1,2:2175\n396#1,2:2177\n379#1,6:2179\n398#1:2185\n391#1,4:2186\n363#1,6:2190\n373#1,3:2197\n376#1,2:2201\n396#1,2:2203\n379#1,6:2205\n398#1:2211\n391#1,4:2212\n363#1,6:2216\n373#1,3:2223\n376#1,2:2227\n396#1,2:2229\n379#1,6:2231\n398#1:2237\n391#1,4:2238\n363#1,6:2242\n373#1,3:2249\n376#1,2:2253\n396#1,2:2255\n379#1,6:2257\n398#1:2263\n1589#2,3:1836\n1603#2:1840\n1599#2:1843\n1779#2,3:1848\n1793#2,3:1852\n1717#2:1856\n1705#2:1858\n1699#2:1859\n1712#2:1864\n1802#2:1866\n1589#2,3:1876\n1603#2:1880\n1599#2:1883\n1779#2,3:1888\n1793#2,3:1892\n1717#2:1896\n1705#2:1898\n1699#2:1899\n1712#2:1904\n1802#2:1906\n1810#2:1915\n1672#2:1916\n1810#2:1923\n1672#2:1927\n1810#2:1943\n1672#2:1947\n1810#2:1963\n1672#2:1967\n1810#2:1987\n1672#2:1991\n1810#2:2013\n1672#2:2017\n1810#2:2039\n1672#2:2043\n1589#2,3:2056\n1603#2:2060\n1599#2:2063\n1779#2,3:2068\n1793#2,3:2072\n1717#2:2076\n1705#2:2078\n1699#2:2079\n1712#2:2084\n1802#2:2086\n1589#2,3:2096\n1603#2:2100\n1599#2:2103\n1779#2,3:2108\n1793#2,3:2112\n1717#2:2116\n1705#2:2118\n1699#2:2119\n1712#2:2124\n1802#2:2126\n1810#2:2144\n1672#2:2148\n1810#2:2170\n1672#2:2174\n1810#2:2196\n1672#2:2200\n1810#2:2222\n1672#2:2226\n1810#2:2248\n1672#2:2252\n1645#2:2264\n1589#2,3:2265\n1603#2:2268\n1599#2:2269\n1779#2,3:2270\n1793#2,3:2273\n1717#2:2276\n1705#2:2277\n1699#2:2278\n1712#2:2279\n1802#2:2280\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n330#1:1835\n330#1:1839\n330#1:1841,2\n330#1:1844,4\n330#1:1851\n330#1:1855\n330#1:1857\n330#1:1860,4\n330#1:1865\n330#1:1867,8\n340#1:1875\n340#1:1879\n340#1:1881,2\n340#1:1884,4\n340#1:1891\n340#1:1895\n340#1:1897\n340#1:1900,4\n340#1:1905\n340#1:1907,8\n394#1:1917,6\n394#1:1924,3\n394#1:1928,9\n407#1:1937,6\n407#1:1944,3\n407#1:1948,9\n420#1:1957,6\n420#1:1964,3\n420#1:1968,9\n430#1:1977,4\n430#1:1981,6\n430#1:1988,3\n430#1:1992,2\n430#1:1994,2\n430#1:1996,6\n430#1:2002\n440#1:2003,4\n440#1:2007,6\n440#1:2014,3\n440#1:2018,2\n440#1:2020,2\n440#1:2022,6\n440#1:2028\n456#1:2029,4\n456#1:2033,6\n456#1:2040,3\n456#1:2044,2\n456#1:2046,2\n456#1:2048,6\n456#1:2054\n466#1:2055\n466#1:2059\n466#1:2061,2\n466#1:2064,4\n466#1:2071\n466#1:2075\n466#1:2077\n466#1:2080,4\n466#1:2085\n466#1:2087,8\n472#1:2095\n472#1:2099\n472#1:2101,2\n472#1:2104,4\n472#1:2111\n472#1:2115\n472#1:2117\n472#1:2120,4\n472#1:2125\n472#1:2127,8\n479#1:2135,3\n479#1:2138,6\n479#1:2145,3\n479#1:2149,2\n479#1:2151,2\n479#1:2153,6\n479#1:2159\n506#1:2160,4\n506#1:2164,6\n506#1:2171,3\n506#1:2175,2\n506#1:2177,2\n506#1:2179,6\n506#1:2185\n533#1:2186,4\n533#1:2190,6\n533#1:2197,3\n533#1:2201,2\n533#1:2203,2\n533#1:2205,6\n533#1:2211\n562#1:2212,4\n562#1:2216,6\n562#1:2223,3\n562#1:2227,2\n562#1:2229,2\n562#1:2231,6\n562#1:2237\n588#1:2238,4\n588#1:2242,6\n588#1:2249,3\n588#1:2253,2\n588#1:2255,2\n588#1:2257,6\n588#1:2263\n330#1:1836,3\n330#1:1840\n330#1:1843\n330#1:1848,3\n330#1:1852,3\n330#1:1856\n330#1:1858\n330#1:1859\n330#1:1864\n330#1:1866\n340#1:1876,3\n340#1:1880\n340#1:1883\n340#1:1888,3\n340#1:1892,3\n340#1:1896\n340#1:1898\n340#1:1899\n340#1:1904\n340#1:1906\n368#1:1915\n375#1:1916\n394#1:1923\n394#1:1927\n407#1:1943\n407#1:1947\n420#1:1963\n420#1:1967\n430#1:1987\n430#1:1991\n440#1:2013\n440#1:2017\n456#1:2039\n456#1:2043\n466#1:2056,3\n466#1:2060\n466#1:2063\n466#1:2068,3\n466#1:2072,3\n466#1:2076\n466#1:2078\n466#1:2079\n466#1:2084\n466#1:2086\n472#1:2096,3\n472#1:2100\n472#1:2103\n472#1:2108,3\n472#1:2112,3\n472#1:2116\n472#1:2118\n472#1:2119\n472#1:2124\n472#1:2126\n479#1:2144\n479#1:2148\n506#1:2170\n506#1:2174\n533#1:2196\n533#1:2200\n562#1:2222\n562#1:2226\n588#1:2248\n588#1:2252\n605#1:2264\n633#1:2265,3\n634#1:2268\n637#1:2269\n641#1:2270,3\n642#1:2273,3\n643#1:2276\n644#1:2277\n644#1:2278\n648#1:2279\n651#1:2280\n*E\n"})
public abstract class boe<K, V> {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public long[] f14264a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public Object[] f14265b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public Object[] f14266c;

    /* JADX INFO: renamed from: d */
    @un8
    public int f14267d;

    /* JADX INFO: renamed from: e */
    @un8
    public int f14268e;

    /* JADX INFO: renamed from: boe$a */
    public class C1964a implements Map<K, V>, uo8 {

        /* JADX INFO: renamed from: boe$a$a */
        @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n1726#2,3:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1\n*L\n712#1:1835,3\n*E\n"})
        public static final class a implements Set<Map.Entry<? extends K, ? extends V>>, uo8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boe<K, V> f14270a;

            /* JADX INFO: renamed from: boe$a$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", m4010f = "ScatterMap.kt", m4011i = {0, 0, 0, 0, 0, 0, 0}, m4012l = {701}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m4015s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n*L\n699#1:1835,6\n699#1:1842,3\n699#1:1846,9\n699#1:1841\n699#1:1845\n*E\n"})
            public static final class C16412a extends t7e implements gz6<xye<? super Map.Entry<? extends K, ? extends V>>, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: C */
                public int f14271C;

                /* JADX INFO: renamed from: F */
                public /* synthetic */ Object f14272F;

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ boe<K, V> f14273H;

                /* JADX INFO: renamed from: a */
                public Object f14274a;

                /* JADX INFO: renamed from: b */
                public Object f14275b;

                /* JADX INFO: renamed from: c */
                public int f14276c;

                /* JADX INFO: renamed from: d */
                public int f14277d;

                /* JADX INFO: renamed from: e */
                public int f14278e;

                /* JADX INFO: renamed from: f */
                public int f14279f;

                /* JADX INFO: renamed from: m */
                public long f14280m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16412a(boe<K, V> boeVar, zy2<? super C16412a> zy2Var) {
                    super(2, zy2Var);
                    this.f14273H = boeVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    C16412a c16412a = new C16412a(this.f14273H, zy2Var);
                    c16412a.f14272F = obj;
                    return c16412a;
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb xye<? super Map.Entry<? extends K, ? extends V>> xyeVar, @gib zy2<? super bth> zy2Var) {
                    return ((C16412a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0067). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0098 -> B:20:0x009b). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009e -> B:22:0x009f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ab -> B:27:0x00ac). Please report as a decompilation issue!!! */
                @Override // p000.tq0
                @p000.gib
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r22) {
                    /*
                        r21 = this;
                        r0 = r21
                        java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f14271C
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r5) goto L2a
                        int r2 = r0.f14279f
                        int r6 = r0.f14278e
                        long r7 = r0.f14280m
                        int r9 = r0.f14277d
                        int r10 = r0.f14276c
                        java.lang.Object r11 = r0.f14275b
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f14274a
                        boe r12 = (p000.boe) r12
                        java.lang.Object r13 = r0.f14272F
                        xye r13 = (p000.xye) r13
                        p000.y7e.throwOnFailure(r22)
                        goto L9b
                    L2a:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L32:
                        p000.y7e.throwOnFailure(r22)
                        java.lang.Object r2 = r0.f14272F
                        xye r2 = (p000.xye) r2
                        boe<K, V> r6 = r0.f14273H
                        long[] r7 = r6.f14264a
                        int r8 = r7.length
                        int r8 = r8 + (-2)
                        if (r8 < 0) goto Lb2
                        r9 = 0
                    L43:
                        r10 = r7[r9]
                        long r12 = ~r10
                        r14 = 7
                        long r12 = r12 << r14
                        long r12 = r12 & r10
                        r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r12 = r12 & r14
                        int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                        if (r12 == 0) goto Lab
                        int r12 = r9 - r8
                        int r12 = ~r12
                        int r12 = r12 >>> 31
                        int r12 = 8 - r12
                        r13 = r2
                        r2 = 0
                        r18 = r12
                        r12 = r6
                        r6 = r18
                        r19 = r10
                        r11 = r7
                        r10 = r8
                        r7 = r19
                    L67:
                        if (r2 >= r6) goto La3
                        r14 = 255(0xff, double:1.26E-321)
                        long r14 = r14 & r7
                        r16 = 128(0x80, double:6.3E-322)
                        int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                        if (r14 >= 0) goto L9e
                        int r14 = r9 << 3
                        int r14 = r14 + r2
                        ms9 r15 = new ms9
                        java.lang.Object[] r3 = r12.f14265b
                        r3 = r3[r14]
                        java.lang.Object[] r4 = r12.f14266c
                        r4 = r4[r14]
                        r15.<init>(r3, r4)
                        r0.f14272F = r13
                        r0.f14274a = r12
                        r0.f14275b = r11
                        r0.f14276c = r10
                        r0.f14277d = r9
                        r0.f14280m = r7
                        r0.f14278e = r6
                        r0.f14279f = r2
                        r0.f14271C = r5
                        java.lang.Object r3 = r13.yield(r15, r0)
                        if (r3 != r1) goto L9b
                        return r1
                    L9b:
                        r3 = 8
                        goto L9f
                    L9e:
                        r3 = r4
                    L9f:
                        long r7 = r7 >> r3
                        int r2 = r2 + r5
                        r4 = r3
                        goto L67
                    La3:
                        r3 = r4
                        if (r6 != r3) goto Lb2
                        r8 = r10
                        r7 = r11
                        r6 = r12
                        r2 = r13
                        goto Lac
                    Lab:
                        r3 = r4
                    Lac:
                        if (r9 == r8) goto Lb2
                        int r9 = r9 + 1
                        r4 = r3
                        goto L43
                    Lb2:
                        bth r1 = p000.bth.f14751a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.boe.C1964a.a.C16412a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public a(boe<K, V> boeVar) {
                this.f14270a = boeVar;
            }

            @Override // java.util.Set, java.util.Collection
            public /* bridge */ /* synthetic */ boolean add(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    return contains((Map.Entry) obj);
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                boe<K, V> boeVar = this.f14270a;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!md8.areEqual(boeVar.get((K) entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            }

            public int getSize() {
                return this.f14270a.f14268e;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f14270a.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @yfb
            public Iterator<Map.Entry<K, V>> iterator() {
                return bze.iterator(new C16412a(this.f14270a, null));
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return f82.toArray(this);
            }

            public boolean add(Map.Entry<? extends K, ? extends V> entry) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public boolean contains(@yfb Map.Entry<? extends K, ? extends V> entry) {
                md8.checkNotNullParameter(entry, "element");
                return md8.areEqual(this.f14270a.get(entry.getKey()), entry.getValue());
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                md8.checkNotNullParameter(tArr, "array");
                return (T[]) f82.toArray(this, tArr);
            }
        }

        /* JADX INFO: renamed from: boe$a$b */
        @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n1726#2,3:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1\n*L\n731#1:1835,3\n*E\n"})
        public static final class b implements Set<K>, uo8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boe<K, V> f14281a;

            /* JADX INFO: renamed from: boe$a$b$a */
            @ck3(m4009c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", m4010f = "ScatterMap.kt", m4011i = {0, 0, 0, 0, 0, 0, 0, 0}, m4012l = {726}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, m4015s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n405#2,3:1835\n363#2,6:1838\n373#2,3:1845\n376#2,2:1849\n409#2,2:1851\n379#2,6:1853\n411#2:1859\n1810#3:1844\n1672#3:1848\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1$iterator$1\n*L\n725#1:1835,3\n725#1:1838,6\n725#1:1845,3\n725#1:1849,2\n725#1:1851,2\n725#1:1853,6\n725#1:1859\n725#1:1844\n725#1:1848\n*E\n"})
            public static final class a extends t7e implements gz6<xye<? super K>, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: C */
                public int f14282C;

                /* JADX INFO: renamed from: F */
                public /* synthetic */ Object f14283F;

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ boe<K, V> f14284H;

                /* JADX INFO: renamed from: a */
                public Object f14285a;

                /* JADX INFO: renamed from: b */
                public Object f14286b;

                /* JADX INFO: renamed from: c */
                public int f14287c;

                /* JADX INFO: renamed from: d */
                public int f14288d;

                /* JADX INFO: renamed from: e */
                public int f14289e;

                /* JADX INFO: renamed from: f */
                public int f14290f;

                /* JADX INFO: renamed from: m */
                public long f14291m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boe<K, V> boeVar, zy2<? super a> zy2Var) {
                    super(2, zy2Var);
                    this.f14284H = boeVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    a aVar = new a(this.f14284H, zy2Var);
                    aVar.f14283F = obj;
                    return aVar;
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb xye<? super K> xyeVar, @gib zy2<? super bth> zy2Var) {
                    return ((a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:23:0x0098). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:14:0x0066). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please report as a decompilation issue!!! */
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
                        int r2 = r0.f14282C
                        r3 = 0
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r5) goto L2a
                        int r2 = r0.f14290f
                        int r6 = r0.f14289e
                        long r7 = r0.f14291m
                        int r9 = r0.f14288d
                        int r10 = r0.f14287c
                        java.lang.Object r11 = r0.f14286b
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f14285a
                        java.lang.Object[] r12 = (java.lang.Object[]) r12
                        java.lang.Object r13 = r0.f14283F
                        xye r13 = (p000.xye) r13
                        p000.y7e.throwOnFailure(r21)
                        goto L8f
                    L2a:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L32:
                        p000.y7e.throwOnFailure(r21)
                        java.lang.Object r2 = r0.f14283F
                        xye r2 = (p000.xye) r2
                        boe<K, V> r6 = r0.f14284H
                        java.lang.Object[] r7 = r6.f14265b
                        long[] r6 = r6.f14264a
                        int r8 = r6.length
                        int r8 = r8 + (-2)
                        if (r8 < 0) goto L9d
                        r9 = r3
                    L45:
                        r10 = r6[r9]
                        long r12 = ~r10
                        r14 = 7
                        long r12 = r12 << r14
                        long r12 = r12 & r10
                        r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r12 = r12 & r14
                        int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                        if (r12 == 0) goto L98
                        int r12 = r9 - r8
                        int r12 = ~r12
                        int r12 = r12 >>> 31
                        int r12 = 8 - r12
                        r13 = r2
                        r2 = r3
                        r18 = r10
                        r11 = r6
                        r10 = r8
                        r6 = r12
                        r12 = r7
                        r7 = r18
                    L66:
                        if (r2 >= r6) goto L92
                        r14 = 255(0xff, double:1.26E-321)
                        long r14 = r14 & r7
                        r16 = 128(0x80, double:6.3E-322)
                        int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                        if (r14 >= 0) goto L8f
                        int r14 = r9 << 3
                        int r14 = r14 + r2
                        r14 = r12[r14]
                        r0.f14283F = r13
                        r0.f14285a = r12
                        r0.f14286b = r11
                        r0.f14287c = r10
                        r0.f14288d = r9
                        r0.f14291m = r7
                        r0.f14289e = r6
                        r0.f14290f = r2
                        r0.f14282C = r5
                        java.lang.Object r14 = r13.yield(r14, r0)
                        if (r14 != r1) goto L8f
                        return r1
                    L8f:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L66
                    L92:
                        if (r6 != r4) goto L9d
                        r8 = r10
                        r6 = r11
                        r7 = r12
                        r2 = r13
                    L98:
                        if (r9 == r8) goto L9d
                        int r9 = r9 + 1
                        goto L45
                    L9d:
                        bth r1 = p000.bth.f14751a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.boe.C1964a.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public b(boe<K, V> boeVar) {
                this.f14281a = boeVar;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(K k) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends K> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.f14281a.containsKey(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                boe<K, V> boeVar = this.f14281a;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (!boeVar.containsKey((K) it.next())) {
                        return false;
                    }
                }
                return true;
            }

            public int getSize() {
                return this.f14281a.f14268e;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f14281a.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @yfb
            public Iterator<K> iterator() {
                return bze.iterator(new a(this.f14281a, null));
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

        /* JADX INFO: renamed from: boe$a$c */
        @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n1726#2,3:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1\n*L\n749#1:1835,3\n*E\n"})
        public static final class c implements Collection<V>, uo8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boe<K, V> f14292a;

            /* JADX INFO: renamed from: boe$a$c$a */
            @ck3(m4009c = "androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1", m4010f = "ScatterMap.kt", m4011i = {0, 0, 0, 0, 0, 0, 0, 0}, m4012l = {744}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, m4015s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
            @dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n418#2,3:1835\n363#2,6:1838\n373#2,3:1845\n376#2,2:1849\n422#2,2:1851\n379#2,6:1853\n424#2:1859\n1810#3:1844\n1672#3:1848\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n*L\n743#1:1835,3\n743#1:1838,6\n743#1:1845,3\n743#1:1849,2\n743#1:1851,2\n743#1:1853,6\n743#1:1859\n743#1:1844\n743#1:1848\n*E\n"})
            public static final class a extends t7e implements gz6<xye<? super V>, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: C */
                public int f14293C;

                /* JADX INFO: renamed from: F */
                public /* synthetic */ Object f14294F;

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ boe<K, V> f14295H;

                /* JADX INFO: renamed from: a */
                public Object f14296a;

                /* JADX INFO: renamed from: b */
                public Object f14297b;

                /* JADX INFO: renamed from: c */
                public int f14298c;

                /* JADX INFO: renamed from: d */
                public int f14299d;

                /* JADX INFO: renamed from: e */
                public int f14300e;

                /* JADX INFO: renamed from: f */
                public int f14301f;

                /* JADX INFO: renamed from: m */
                public long f14302m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boe<K, V> boeVar, zy2<? super a> zy2Var) {
                    super(2, zy2Var);
                    this.f14295H = boeVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    a aVar = new a(this.f14295H, zy2Var);
                    aVar.f14294F = obj;
                    return aVar;
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb xye<? super V> xyeVar, @gib zy2<? super bth> zy2Var) {
                    return ((a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:23:0x0098). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:14:0x0066). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please report as a decompilation issue!!! */
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
                        int r2 = r0.f14293C
                        r3 = 0
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r5) goto L2a
                        int r2 = r0.f14301f
                        int r6 = r0.f14300e
                        long r7 = r0.f14302m
                        int r9 = r0.f14299d
                        int r10 = r0.f14298c
                        java.lang.Object r11 = r0.f14297b
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f14296a
                        java.lang.Object[] r12 = (java.lang.Object[]) r12
                        java.lang.Object r13 = r0.f14294F
                        xye r13 = (p000.xye) r13
                        p000.y7e.throwOnFailure(r21)
                        goto L8f
                    L2a:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L32:
                        p000.y7e.throwOnFailure(r21)
                        java.lang.Object r2 = r0.f14294F
                        xye r2 = (p000.xye) r2
                        boe<K, V> r6 = r0.f14295H
                        java.lang.Object[] r7 = r6.f14266c
                        long[] r6 = r6.f14264a
                        int r8 = r6.length
                        int r8 = r8 + (-2)
                        if (r8 < 0) goto L9d
                        r9 = r3
                    L45:
                        r10 = r6[r9]
                        long r12 = ~r10
                        r14 = 7
                        long r12 = r12 << r14
                        long r12 = r12 & r10
                        r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r12 = r12 & r14
                        int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                        if (r12 == 0) goto L98
                        int r12 = r9 - r8
                        int r12 = ~r12
                        int r12 = r12 >>> 31
                        int r12 = 8 - r12
                        r13 = r2
                        r2 = r3
                        r18 = r10
                        r11 = r6
                        r10 = r8
                        r6 = r12
                        r12 = r7
                        r7 = r18
                    L66:
                        if (r2 >= r6) goto L92
                        r14 = 255(0xff, double:1.26E-321)
                        long r14 = r14 & r7
                        r16 = 128(0x80, double:6.3E-322)
                        int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                        if (r14 >= 0) goto L8f
                        int r14 = r9 << 3
                        int r14 = r14 + r2
                        r14 = r12[r14]
                        r0.f14294F = r13
                        r0.f14296a = r12
                        r0.f14297b = r11
                        r0.f14298c = r10
                        r0.f14299d = r9
                        r0.f14302m = r7
                        r0.f14300e = r6
                        r0.f14301f = r2
                        r0.f14293C = r5
                        java.lang.Object r14 = r13.yield(r14, r0)
                        if (r14 != r1) goto L8f
                        return r1
                    L8f:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L66
                    L92:
                        if (r6 != r4) goto L9d
                        r8 = r10
                        r6 = r11
                        r7 = r12
                        r2 = r13
                    L98:
                        if (r9 == r8) goto L9d
                        int r9 = r9 + 1
                        goto L45
                    L9d:
                        bth r1 = p000.bth.f14751a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.boe.C1964a.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public c(boe<K, V> boeVar) {
                this.f14292a = boeVar;
            }

            @Override // java.util.Collection
            public boolean add(V v) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends V> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.f14292a.containsValue(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(@yfb Collection<? extends Object> collection) {
                md8.checkNotNullParameter(collection, "elements");
                Collection<? extends Object> collection2 = collection;
                boe<K, V> boeVar = this.f14292a;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (!boeVar.containsValue((V) it.next())) {
                        return false;
                    }
                }
                return true;
            }

            public int getSize() {
                return this.f14292a.f14268e;
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f14292a.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            @yfb
            public Iterator<V> iterator() {
                return bze.iterator(new a(this.f14292a, null));
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeIf(Predicate<? super V> predicate) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

        public C1964a() {
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return boe.this.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return boe.this.containsValue(obj);
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return getEntries();
        }

        @Override // java.util.Map
        @gib
        public V get(Object obj) {
            return boe.this.get(obj);
        }

        @yfb
        public Set<Map.Entry<K, V>> getEntries() {
            return new a(boe.this);
        }

        @yfb
        public Set<K> getKeys() {
            return new b(boe.this);
        }

        public int getSize() {
            return boe.this.f14268e;
        }

        @yfb
        public Collection<V> getValues() {
            return new c(boe.this);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return boe.this.isEmpty();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<K> keySet() {
            return getKeys();
        }

        @Override // java.util.Map
        public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V put(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V putIfAbsent(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V replace(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<V> values() {
            return getValues();
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean replace(K k, V v, V v2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ boe(jt3 jt3Var) {
        this();
    }

    @yjd
    public static /* synthetic */ void getKeys$annotations() {
    }

    @yjd
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @yjd
    public static /* synthetic */ void getValues$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(boe boeVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, gz6 gz6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            gz6Var = null;
        }
        return boeVar.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, gz6Var);
    }

    public final boolean all(@yfb gz6<? super K, ? super V, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        Object[] objArr = this.f14265b;
        Object[] objArr2 = this.f14266c;
        long[] jArr = this.f14264a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!gz6Var.invoke(objArr[i4], objArr2[i4]).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any() {
        return this.f14268e != 0;
    }

    @yfb
    public final String asDebugString$collection() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append("metadata=[");
        int capacity = getCapacity();
        for (int i = 0; i < capacity; i++) {
            long j = (this.f14264a[i >> 3] >> ((i & 7) << 3)) & 255;
            if (j == 128) {
                sb.append("Empty");
            } else if (j == 254) {
                sb.append("Deleted");
            } else {
                sb.append(j);
            }
            sb.append(", ");
        }
        sb.append("], ");
        sb.append("keys=[");
        int length = this.f14265b.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(this.f14265b[i2]);
            sb.append(", ");
        }
        sb.append("], ");
        sb.append("values=[");
        int length2 = this.f14266c.length;
        for (int i3 = 0; i3 < length2; i3++) {
            sb.append(this.f14266c[i3]);
            sb.append(", ");
        }
        sb.append("]");
        sb.append('}');
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @yfb
    public final Map<K, V> asMap() {
        return new C1964a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(K r18) {
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
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boe.contains(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(K r18) {
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
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boe.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(V r15) {
        /*
            r14 = this;
            java.lang.Object[] r0 = r14.f14266c
            long[] r1 = r14.f14264a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L48
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
            if (r7 == 0) goto L43
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L41
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            boolean r10 = p000.md8.areEqual(r15, r10)
            if (r10 == 0) goto L3d
            r15 = 1
            return r15
        L3d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L41:
            if (r7 != r8) goto L48
        L43:
            if (r4 == r2) goto L48
            int r4 = r4 + 1
            goto Lb
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boe.containsValue(java.lang.Object):boolean");
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@p000.gib java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p000.boe
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            boe r1 = (p000.boe) r1
            int r3 = r1.getSize()
            int r5 = r18.getSize()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.f14265b
            java.lang.Object[] r5 = r0.f14266c
            long[] r6 = r0.f14264a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L78
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L73
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L71
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6d
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L62
            java.lang.Object r14 = r1.get(r15)
            if (r14 != 0) goto L61
            boolean r14 = r1.containsKey(r15)
            if (r14 != 0) goto L6d
        L61:
            return r4
        L62:
            java.lang.Object r15 = r1.get(r15)
            boolean r14 = p000.md8.areEqual(r14, r15)
            if (r14 != 0) goto L6d
            return r4
        L6d:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L41
        L71:
            if (r11 != r12) goto L78
        L73:
            if (r8 == r7) goto L78
            int r8 = r8 + 1
            goto L27
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boe.equals(java.lang.Object):boolean");
    }

    public final int findKeyIndex$collection(K k) {
        int i = 0;
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f14267d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f14264a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * coe.f17281k) ^ j;
            for (long j3 = (~j2) & (j2 - coe.f17281k) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (md8.areEqual(this.f14265b[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void forEach(@yfb gz6<? super K, ? super V, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        Object[] objArr = this.f14265b;
        Object[] objArr2 = this.f14266c;
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
                        gz6Var.invoke(objArr[i4], objArr2[i4]);
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

    @yjd
    public final void forEachIndexed(@yfb qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
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
                        qy6Var.invoke(Integer.valueOf((i << 3) + i3));
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

    public final void forEachKey(@yfb qy6<? super K, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        Object[] objArr = this.f14265b;
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
                        qy6Var.invoke(objArr[(i << 3) + i3]);
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

    public final void forEachValue(@yfb qy6<? super V, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        Object[] objArr = this.f14266c;
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
                        qy6Var.invoke(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(K r14) {
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
            java.lang.Object[] r14 = r13.f14266c
            r14 = r14[r10]
            goto L74
        L73:
            r14 = 0
        L74:
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boe.get(java.lang.Object):java.lang.Object");
    }

    public final int getCapacity() {
        return this.f14267d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(K r14, V r15) {
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
            if (r4 == 0) goto L74
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.f14266c
            r14 = r14[r10]
            return r14
        L73:
            return r15
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boe.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final V getOrElse(K k, @yfb ny6<? extends V> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        V v = get(k);
        return v == null ? ny6Var.invoke() : v;
    }

    public final int getSize() {
        return this.f14268e;
    }

    public int hashCode() {
        Object[] objArr = this.f14265b;
        Object[] objArr2 = this.f14266c;
        long[] jArr = this.f14264a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    i = iHashCode;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f14268e == 0;
    }

    public final boolean isNotEmpty() {
        return this.f14268e != 0;
    }

    @yfb
    @yn8
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final boolean none() {
        return this.f14268e == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[PHI: r8
  0x007a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r18.isEmpty()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.lang.Object[] r2 = r0.f14265b
            java.lang.Object[] r3 = r0.f14266c
            long[] r4 = r0.f14264a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7f
            r6 = 0
            r7 = r6
            r8 = r7
        L23:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L7a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3d:
            if (r13 >= r11) goto L78
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L74
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L55
            r15 = r16
        L55:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L61
            r14 = r16
        L61:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f14268e
            if (r8 >= r14) goto L74
            r14 = 44
            r1.append(r14)
            r14 = 32
            r1.append(r14)
        L74:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L78:
            if (r11 != r12) goto L7f
        L7a:
            if (r7 == r5) goto L7f
            int r7 = r7 + 1
            goto L23
        L7f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "s.append('}').toString()"
            p000.md8.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boe.toString():java.lang.String");
    }

    private boe() {
        this.f14264a = coe.f17275e;
        Object[] objArr = cv2.f27725c;
        this.f14265b = objArr;
        this.f14266c = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(@p000.yfb p000.gz6<? super K, ? super V, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            p000.md8.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.f14265b
            java.lang.Object[] r3 = r0.f14266c
            long[] r4 = r0.f14264a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5b
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L56
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L54
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L50
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L50
            r1 = 1
            return r1
        L50:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L54:
            if (r10 != r11) goto L5b
        L56:
            if (r7 == r5) goto L5b
            int r7 = r7 + 1
            goto L16
        L5b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boe.any(gz6):boolean");
    }

    public final int count(@yfb gz6<? super K, ? super V, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        Object[] objArr = this.f14265b;
        Object[] objArr2 = this.f14266c;
        long[] jArr = this.f14264a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (gz6Var.invoke(objArr[i6], objArr2[i6]).booleanValue()) {
                                i3++;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib gz6<? super K, ? super V, ? extends CharSequence> gz6Var) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr5 = this.f14265b;
        Object[] objArr6 = this.f14266c;
        long[] jArr = this.f14264a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr5[i7];
                            objArr3 = objArr5;
                            Object obj2 = objArr6[i7];
                            objArr4 = objArr6;
                            if (i3 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            if (gz6Var == null) {
                                sb.append(obj);
                                sb.append('=');
                                sb.append(obj2);
                            } else {
                                sb.append(gz6Var.invoke(obj, obj2));
                            }
                            i3++;
                        } else {
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                        }
                        j >>= 8;
                        i6++;
                        objArr6 = objArr4;
                        objArr5 = objArr3;
                    }
                    objArr = objArr5;
                    objArr2 = objArr6;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    objArr2 = objArr6;
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
                objArr6 = objArr2;
                objArr5 = objArr;
            }
            sb.append(charSequence3);
        } else {
            sb.append(charSequence3);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
