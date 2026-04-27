package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p000.nrd;
import p000.z64;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 16 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 17 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 18 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1504:1\n1055#1,2:1525\n1225#1,3:1527\n1045#1,6:1531\n1228#1,7:1537\n1057#1,4:1544\n1055#1,2:2056\n1225#1,3:2058\n1045#1,6:2061\n1228#1,7:2067\n1057#1,4:2074\n1055#1,2:2087\n1225#1,10:2089\n1057#1,4:2099\n1055#1,2:2196\n1225#1,10:2198\n1057#1,4:2208\n1055#1,2:2213\n1225#1,10:2215\n1057#1,4:2225\n1055#1,2:2230\n1225#1,10:2232\n1057#1,4:2242\n1225#1,10:2246\n89#2:1505\n89#2:1513\n89#2:1514\n89#2:1530\n89#2:1548\n89#2:1565\n89#2:1566\n89#2:2018\n89#2:2055\n89#2:2195\n89#2:2212\n89#2:2229\n89#2:2256\n89#2:2259\n89#2:2260\n89#2:2261\n89#2:2332\n50#3,7:1506\n50#3,7:1549\n50#3,7:2324\n93#4,2:1515\n33#4,4:1517\n95#4,2:1521\n38#4:1523\n97#4:1524\n110#4,2:2078\n33#4,6:2080\n112#4:2086\n33#4,4:2320\n38#4:2331\n174#5,5:1556\n180#5,3:1562\n174#5,5:2103\n180#5,3:2109\n174#5,5:2115\n180#5,3:2121\n174#5,5:2336\n180#5,3:2342\n1#6:1561\n1#6:2108\n1#6:2120\n1#6:2317\n1#6:2341\n48#7,3:1567\n53#7:1597\n55#7:1600\n48#7,3:1637\n53#7:1703\n55#7:1733\n267#8,4:1570\n237#8,7:1574\n248#8,3:1582\n251#8,2:1586\n272#8,2:1588\n254#8,6:1590\n274#8:1596\n267#8,4:1606\n237#8,7:1610\n248#8,3:1618\n251#8,2:1622\n272#8,2:1624\n254#8,6:1626\n274#8:1632\n267#8,4:1640\n237#8,7:1644\n248#8,3:1652\n251#8,2:1656\n272#8:1658\n267#8,4:1664\n237#8,7:1668\n248#8,3:1676\n251#8,2:1680\n272#8,2:1682\n254#8,6:1684\n274#8:1690\n273#8:1695\n254#8,6:1696\n274#8:1702\n267#8,4:1705\n237#8,7:1709\n248#8,3:1717\n251#8,2:1721\n272#8,2:1723\n254#8,6:1725\n274#8:1731\n237#8,7:1757\n248#8,3:1765\n251#8,2:1769\n254#8,6:1775\n237#8,7:1821\n248#8,3:1829\n251#8,2:1833\n254#8,6:1839\n237#8,16:1885\n254#8,6:1905\n237#8,7:1930\n248#8,3:1938\n251#8,2:1942\n254#8,6:1948\n267#8,4:1987\n237#8,7:1991\n248#8,3:1999\n251#8,2:2003\n272#8,2:2005\n254#8,6:2007\n274#8:2013\n267#8,4:2024\n237#8,7:2028\n248#8,3:2036\n251#8,2:2040\n272#8,2:2042\n254#8,6:2044\n274#8:2050\n237#8,16:2151\n254#8,6:2171\n267#8,4:2268\n237#8,7:2272\n248#8,3:2280\n251#8,2:2284\n272#8:2286\n273#8:2289\n254#8,6:2290\n274#8:2296\n1810#9:1581\n1672#9:1585\n1810#9:1617\n1672#9:1621\n1810#9:1651\n1672#9:1655\n1810#9:1675\n1672#9:1679\n1810#9:1716\n1672#9:1720\n1810#9:1742\n1672#9:1746\n1810#9:1764\n1672#9:1768\n1810#9:1806\n1672#9:1810\n1810#9:1828\n1672#9:1832\n1810#9:1870\n1672#9:1874\n1810#9:1937\n1672#9:1941\n1810#9:1965\n1672#9:1969\n1810#9:1998\n1672#9:2002\n1810#9:2035\n1672#9:2039\n1810#9:2136\n1672#9:2140\n1810#9:2279\n1672#9:2283\n1855#10,2:1598\n1855#10:1704\n1856#10:1732\n77#11,5:1601\n85#11,4:1633\n77#11,5:1659\n85#11,4:1691\n138#11:1734\n139#11,5:1750\n144#11,5:1782\n152#11:1797\n138#11:1798\n139#11,5:1814\n144#11,5:1846\n152#11:1861\n138#11:1862\n139#11,5:1878\n144#11,5:1912\n152#11:1927\n77#11,5:1982\n85#11,4:2014\n77#11,5:2019\n85#11,4:2051\n138#11:2128\n139#11,5:2144\n144#11,5:2178\n152#11:2193\n91#11:2262\n77#11,5:2263\n92#11,2:2287\n85#11,10:2297\n1047#12:1735\n1049#12:1749\n1050#12,3:1787\n1053#12:1796\n1047#12:1799\n1049#12:1813\n1050#12,3:1851\n1053#12:1860\n1047#12:1863\n1049#12:1877\n1050#12,3:1917\n1053#12:1926\n1047#12:2129\n1049#12:2143\n1050#12,3:2183\n1053#12:2192\n363#13,6:1736\n373#13,3:1743\n376#13,2:1747\n379#13,6:1790\n363#13,6:1800\n373#13,3:1807\n376#13,2:1811\n379#13,6:1854\n363#13,6:1864\n373#13,3:1871\n376#13,2:1875\n379#13,6:1920\n363#13,6:2130\n373#13,3:2137\n376#13,2:2141\n379#13,6:2186\n842#14,2:1755\n845#14,4:1771\n849#14:1781\n842#14,2:1819\n845#14,4:1835\n849#14:1845\n842#14,2:1883\n845#14,4:1901\n849#14:1911\n842#14,2:1928\n845#14,4:1944\n849#14:1954\n842#14,2:2149\n845#14,4:2167\n849#14:2177\n50#15:1955\n50#15:1973\n415#16,3:1956\n373#16,6:1959\n383#16,3:1966\n386#16,2:1970\n419#16:1972\n420#16:1974\n389#16,6:1975\n421#16:1981\n46#17,3:2112\n50#17:2124\n46#17,3:2125\n50#17:2194\n46#17,3:2333\n50#17:2345\n13579#18,2:2257\n11653#18,9:2307\n13579#18:2316\n13580#18:2318\n11662#18:2319\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n731#1:1525,2\n731#1:1527,3\n734#1:1531,6\n731#1:1537,7\n731#1:1544,4\n940#1:2056,2\n940#1:2058,3\n941#1:2061,6\n940#1:2067,7\n940#1:2074,4\n961#1:2087,2\n961#1:2089,10\n961#1:2099,4\n1012#1:2196,2\n1012#1:2198,10\n1012#1:2208,4\n1021#1:2213,2\n1021#1:2215,10\n1021#1:2225,4\n1031#1:2230,2\n1031#1:2232,10\n1031#1:2242,4\n1056#1:2246,10\n632#1:1505\n654#1:1513\n671#1:1514\n732#1:1530\n751#1:1548\n797#1:1565\n818#1:1566\n928#1:2018\n938#1:2055\n1011#1:2195\n1020#1:2212\n1030#1:2229\n1073#1:2256\n1079#1:2259\n1114#1:2260\n1141#1:2261\n1253#1:2332\n647#1:1506,7\n752#1:1549,7\n1215#1:2324,7\n678#1:1515,2\n678#1:1517,4\n678#1:1521,2\n678#1:1523\n678#1:1524\n960#1:2078,2\n960#1:2080,6\n960#1:2086\n1213#1:2320,4\n1213#1:2331\n782#1:1556,5\n782#1:1562,3\n969#1:2103,5\n969#1:2109,3\n983#1:2115,5\n983#1:2121,3\n1260#1:2336,5\n1260#1:2342,3\n782#1:1561\n969#1:2108\n983#1:2120\n1212#1:2317\n1260#1:2341\n828#1:1567,3\n828#1:1597\n828#1:1600\n855#1:1637,3\n855#1:1703\n855#1:1733\n828#1:1570,4\n828#1:1574,7\n828#1:1582,3\n828#1:1586,2\n828#1:1588,2\n828#1:1590,6\n828#1:1596\n840#1:1606,4\n840#1:1610,7\n840#1:1618,3\n840#1:1622,2\n840#1:1624,2\n840#1:1626,6\n840#1:1632\n855#1:1640,4\n855#1:1644,7\n855#1:1652,3\n855#1:1656,2\n855#1:1658\n860#1:1664,4\n860#1:1668,7\n860#1:1676,3\n860#1:1680,2\n860#1:1682,2\n860#1:1684,6\n860#1:1690\n855#1:1695\n855#1:1696,6\n855#1:1702\n860#1:1705,4\n860#1:1709,7\n860#1:1717,3\n860#1:1721,2\n860#1:1723,2\n860#1:1725,6\n860#1:1731\n869#1:1757,7\n869#1:1765,3\n869#1:1769,2\n869#1:1775,6\n875#1:1821,7\n875#1:1829,3\n875#1:1833,2\n875#1:1839,6\n882#1:1885,16\n882#1:1905,6\n884#1:1930,7\n884#1:1938,3\n884#1:1942,2\n884#1:1948,6\n920#1:1987,4\n920#1:1991,7\n920#1:1999,3\n920#1:2003,2\n920#1:2005,2\n920#1:2007,6\n920#1:2013\n933#1:2024,4\n933#1:2028,7\n933#1:2036,3\n933#1:2040,2\n933#1:2042,2\n933#1:2044,6\n933#1:2050\n998#1:2151,16\n998#1:2171,6\n1170#1:2268,4\n1170#1:2272,7\n1170#1:2280,3\n1170#1:2284,2\n1170#1:2286\n1170#1:2289\n1170#1:2290,6\n1170#1:2296\n828#1:1581\n828#1:1585\n840#1:1617\n840#1:1621\n855#1:1651\n855#1:1655\n860#1:1675\n860#1:1679\n860#1:1716\n860#1:1720\n869#1:1742\n869#1:1746\n869#1:1764\n869#1:1768\n875#1:1806\n875#1:1810\n875#1:1828\n875#1:1832\n882#1:1870\n882#1:1874\n884#1:1937\n884#1:1941\n905#1:1965\n905#1:1969\n920#1:1998\n920#1:2002\n933#1:2035\n933#1:2039\n998#1:2136\n998#1:2140\n1170#1:2279\n1170#1:2283\n828#1:1598,2\n855#1:1704\n855#1:1732\n840#1:1601,5\n840#1:1633,4\n860#1:1659,5\n860#1:1691,4\n869#1:1734\n869#1:1750,5\n869#1:1782,5\n869#1:1797\n875#1:1798\n875#1:1814,5\n875#1:1846,5\n875#1:1861\n882#1:1862\n882#1:1878,5\n882#1:1912,5\n882#1:1927\n920#1:1982,5\n920#1:2014,4\n933#1:2019,5\n933#1:2051,4\n998#1:2128\n998#1:2144,5\n998#1:2178,5\n998#1:2193\n1170#1:2262\n1170#1:2263,5\n1170#1:2287,2\n1170#1:2297,10\n869#1:1735\n869#1:1749\n869#1:1787,3\n869#1:1796\n875#1:1799\n875#1:1813\n875#1:1851,3\n875#1:1860\n882#1:1863\n882#1:1877\n882#1:1917,3\n882#1:1926\n998#1:2129\n998#1:2143\n998#1:2183,3\n998#1:2192\n869#1:1736,6\n869#1:1743,3\n869#1:1747,2\n869#1:1790,6\n875#1:1800,6\n875#1:1807,3\n875#1:1811,2\n875#1:1854,6\n882#1:1864,6\n882#1:1871,3\n882#1:1875,2\n882#1:1920,6\n998#1:2130,6\n998#1:2137,3\n998#1:2141,2\n998#1:2186,6\n869#1:1755,2\n869#1:1771,4\n869#1:1781\n875#1:1819,2\n875#1:1835,4\n875#1:1845\n882#1:1883,2\n882#1:1901,4\n882#1:1911\n884#1:1928,2\n884#1:1944,4\n884#1:1954\n998#1:2149,2\n998#1:2167,4\n998#1:2177\n896#1:1955\n907#1:1973\n905#1:1956,3\n905#1:1959,6\n905#1:1966,3\n905#1:1970,2\n905#1:1972\n905#1:1974\n905#1:1975,6\n905#1:1981\n979#1:2112,3\n979#1:2124\n996#1:2125,3\n996#1:2194\n1256#1:2333,3\n1256#1:2345\n1074#1:2257,2\n1212#1:2307,9\n1212#1:2316\n1212#1:2318\n1212#1:2319\n*E\n"})
@e0g(parameters = 0)
public final class hn2 implements sz2, h9e, vsd, zn2 {

    /* JADX INFO: renamed from: d2 */
    public static final int f44155d2 = 8;

    /* JADX INFO: renamed from: C */
    @yfb
    public final u6b<ssd> f44156C;

    /* JADX INFO: renamed from: F */
    @yfb
    public final u6b<ssd> f44157F;

    /* JADX INFO: renamed from: H */
    @yfb
    public final wqe<Object, z64<?>> f44158H;

    /* JADX INFO: renamed from: L */
    @yfb
    public final wt1 f44159L;

    /* JADX INFO: renamed from: M */
    @yfb
    public final wt1 f44160M;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public final vn2 f44161M1;

    /* JADX INFO: renamed from: N */
    @yfb
    public final wqe<Object, ssd> f44162N;

    /* JADX INFO: renamed from: Q */
    @yfb
    public wqe<ssd, Object> f44163Q;

    /* JADX INFO: renamed from: V1 */
    @yfb
    public final em2 f44164V1;

    /* JADX INFO: renamed from: X */
    public boolean f44165X;

    /* JADX INFO: renamed from: Y */
    @gib
    public hn2 f44166Y;

    /* JADX INFO: renamed from: Z */
    public int f44167Z;

    /* JADX INFO: renamed from: Z1 */
    @gib
    public final e13 f44168Z1;

    /* JADX INFO: renamed from: a */
    @yfb
    public final dn2 f44169a;

    /* JADX INFO: renamed from: a2 */
    public final boolean f44170a2;

    /* JADX INFO: renamed from: b */
    @yfb
    public final p40<?> f44171b;

    /* JADX INFO: renamed from: b2 */
    public boolean f44172b2;

    /* JADX INFO: renamed from: c */
    @yfb
    public final AtomicReference<Object> f44173c;

    /* JADX INFO: renamed from: c2 */
    @yfb
    public gz6<? super zl2, ? super Integer, bth> f44174c2;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Object f44175d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Set<eyd> f44176e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final mrf f44177f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final wqe<Object, ssd> f44178m;

    /* JADX INFO: renamed from: hn2$a */
    @dwf({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1504:1\n1#2:1505\n46#3,5:1506\n46#3,3:1511\n50#3:1520\n46#3,3:1521\n50#3:1530\n46#3,5:1531\n33#4,6:1514\n33#4,6:1524\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1339#1:1506,5\n1361#1:1511,3\n1361#1:1520\n1372#1:1521,3\n1372#1:1530\n1383#1:1531,5\n1362#1:1514,6\n1373#1:1524,6\n*E\n"})
    public static final class C6912a implements dyd {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Set<eyd> f44179a;

        /* JADX INFO: renamed from: e */
        @gib
        public u6b<pl2> f44183e;

        /* JADX INFO: renamed from: g */
        @yfb
        public final g5b f44185g;

        /* JADX INFO: renamed from: h */
        @yfb
        public final g5b f44186h;

        /* JADX INFO: renamed from: b */
        @yfb
        public final List<eyd> f44180b = new ArrayList();

        /* JADX INFO: renamed from: c */
        @yfb
        public final List<Object> f44181c = new ArrayList();

        /* JADX INFO: renamed from: d */
        @yfb
        public final List<ny6<bth>> f44182d = new ArrayList();

        /* JADX INFO: renamed from: f */
        @yfb
        public final List<Object> f44184f = new ArrayList();

        public C6912a(@yfb Set<eyd> set) {
            this.f44179a = set;
            int i = 0;
            int i2 = 1;
            jt3 jt3Var = null;
            this.f44185g = new g5b(i, i2, jt3Var);
            this.f44186h = new g5b(i, i2, jt3Var);
        }

        private final void processPendingLeaving(int i) {
            if (this.f44184f.isEmpty()) {
                return;
            }
            int i2 = 0;
            jt3 jt3Var = null;
            int i3 = 0;
            List listMutableListOf = null;
            g5b g5bVar = null;
            g5b g5bVar2 = null;
            while (true) {
                int i4 = 1;
                if (i3 >= this.f44186h.getSize()) {
                    break;
                }
                if (i <= this.f44186h.get(i3)) {
                    Object objRemove = this.f44184f.remove(i3);
                    int iRemoveAt = this.f44186h.removeAt(i3);
                    int iRemoveAt2 = this.f44185g.removeAt(i3);
                    if (listMutableListOf == null) {
                        listMutableListOf = l82.mutableListOf(objRemove);
                        g5bVar2 = new g5b(i2, i4, jt3Var);
                        g5bVar2.add(iRemoveAt);
                        g5bVar = new g5b(i2, i4, jt3Var);
                        g5bVar.add(iRemoveAt2);
                    } else {
                        md8.checkNotNull(g5bVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        md8.checkNotNull(g5bVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        listMutableListOf.add(objRemove);
                        g5bVar2.add(iRemoveAt);
                        g5bVar.add(iRemoveAt2);
                    }
                } else {
                    i3++;
                }
            }
            if (listMutableListOf != null) {
                md8.checkNotNull(g5bVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                md8.checkNotNull(g5bVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = listMutableListOf.size() - 1;
                while (i2 < size) {
                    int i5 = i2 + 1;
                    int size2 = listMutableListOf.size();
                    for (int i6 = i5; i6 < size2; i6++) {
                        int i7 = g5bVar2.get(i2);
                        int i8 = g5bVar2.get(i6);
                        if (i7 < i8 || (i8 == i7 && g5bVar.get(i2) < g5bVar.get(i6))) {
                            in2.swap(listMutableListOf, i2, i6);
                            in2.swap(g5bVar, i2, i6);
                            in2.swap(g5bVar2, i2, i6);
                        }
                    }
                    i2 = i5;
                }
                this.f44181c.addAll(listMutableListOf);
            }
        }

        private final void recordLeaving(Object obj, int i, int i2, int i3) {
            processPendingLeaving(i);
            if (i3 < 0 || i3 >= i) {
                this.f44181c.add(obj);
                return;
            }
            this.f44184f.add(obj);
            this.f44185g.add(i2);
            this.f44186h.add(i3);
        }

        @Override // p000.dyd
        public void deactivating(@yfb pl2 pl2Var, int i, int i2, int i3) {
            recordLeaving(pl2Var, i, i2, i3);
        }

        public final void dispatchAbandons() {
            if (this.f44179a.isEmpty()) {
                return;
            }
            Object objBeginSection = q5h.f73293a.beginSection("Compose:abandons");
            try {
                Iterator<eyd> it = this.f44179a.iterator();
                while (it.hasNext()) {
                    eyd next = it.next();
                    it.remove();
                    next.onAbandoned();
                }
                bth bthVar = bth.f14751a;
                q5h.f73293a.endSection(objBeginSection);
            } catch (Throwable th) {
                q5h.f73293a.endSection(objBeginSection);
                throw th;
            }
        }

        public final void dispatchRememberObservers() {
            processPendingLeaving(Integer.MIN_VALUE);
            if (!this.f44181c.isEmpty()) {
                Object objBeginSection = q5h.f73293a.beginSection("Compose:onForgotten");
                try {
                    u6b<pl2> u6bVar = this.f44183e;
                    for (int size = this.f44181c.size() - 1; -1 < size; size--) {
                        Object obj = this.f44181c.get(size);
                        if (obj instanceof eyd) {
                            this.f44179a.remove(obj);
                            ((eyd) obj).onForgotten();
                        }
                        if (obj instanceof pl2) {
                            if (u6bVar == null || !u6bVar.contains((pl2) obj)) {
                                ((pl2) obj).onDeactivate();
                            } else {
                                ((pl2) obj).onRelease();
                            }
                        }
                    }
                    bth bthVar = bth.f14751a;
                    q5h.f73293a.endSection(objBeginSection);
                } finally {
                }
            }
            if (this.f44180b.isEmpty()) {
                return;
            }
            Object objBeginSection2 = q5h.f73293a.beginSection("Compose:onRemembered");
            try {
                List<eyd> list = this.f44180b;
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    eyd eydVar = list.get(i);
                    this.f44179a.remove(eydVar);
                    eydVar.onRemembered();
                }
                bth bthVar2 = bth.f14751a;
                q5h.f73293a.endSection(objBeginSection2);
            } finally {
            }
        }

        public final void dispatchSideEffects() {
            if (this.f44182d.isEmpty()) {
                return;
            }
            Object objBeginSection = q5h.f73293a.beginSection("Compose:sideeffects");
            try {
                List<ny6<bth>> list = this.f44182d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke();
                }
                this.f44182d.clear();
                bth bthVar = bth.f14751a;
                q5h.f73293a.endSection(objBeginSection);
            } catch (Throwable th) {
                q5h.f73293a.endSection(objBeginSection);
                throw th;
            }
        }

        @Override // p000.dyd
        public void forgetting(@yfb eyd eydVar, int i, int i2, int i3) {
            recordLeaving(eydVar, i, i2, i3);
        }

        @Override // p000.dyd
        public void releasing(@yfb pl2 pl2Var, int i, int i2, int i3) {
            u6b<pl2> u6bVarMutableScatterSetOf = this.f44183e;
            if (u6bVarMutableScatterSetOf == null) {
                u6bVarMutableScatterSetOf = eoe.mutableScatterSetOf();
                this.f44183e = u6bVarMutableScatterSetOf;
            }
            u6bVarMutableScatterSetOf.plusAssign(pl2Var);
            recordLeaving(pl2Var, i, i2, i3);
        }

        @Override // p000.dyd
        public void remembering(@yfb eyd eydVar) {
            this.f44180b.add(eydVar);
        }

        @Override // p000.dyd
        public void sideEffect(@yfb ny6<bth> ny6Var) {
            this.f44182d.add(ny6Var);
        }
    }

    /* JADX INFO: renamed from: hn2$b */
    @dwf({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$observe$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1504:1\n89#2:1505\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$observe$2\n*L\n660#1:1505\n*E\n"})
    public static final class C6913b implements un2 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tn2 f44188b;

        public C6913b(tn2 tn2Var) {
            this.f44188b = tn2Var;
        }

        @Override // p000.un2
        public void dispose() {
            Object obj = hn2.this.f44175d;
            hn2 hn2Var = hn2.this;
            tn2 tn2Var = this.f44188b;
            synchronized (obj) {
                try {
                    if (md8.areEqual(hn2Var.getObserverHolder$runtime_release().getObserver(), tn2Var)) {
                        hn2Var.getObserverHolder$runtime_release().setObserver(null);
                        hn2Var.getObserverHolder$runtime_release().setRoot(false);
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public hn2(@yfb dn2 dn2Var, @yfb p40<?> p40Var, @gib e13 e13Var) {
        this.f44169a = dn2Var;
        this.f44171b = p40Var;
        jt3 jt3Var = null;
        this.f44173c = new AtomicReference<>(null);
        this.f44175d = new Object();
        int i = 0;
        int i2 = 1;
        Set<eyd> setAsMutableSet = new u6b(i, i2, jt3Var).asMutableSet();
        this.f44176e = setAsMutableSet;
        mrf mrfVar = new mrf();
        if (dn2Var.getCollectingCallByInformation$runtime_release()) {
            mrfVar.collectCalledByInformation();
        }
        if (dn2Var.getCollectingSourceInformation$runtime_release()) {
            mrfVar.collectSourceInformation();
        }
        this.f44177f = mrfVar;
        this.f44178m = new wqe<>();
        this.f44156C = new u6b<>(i, i2, jt3Var);
        this.f44157F = new u6b<>(i, i2, jt3Var);
        this.f44158H = new wqe<>();
        wt1 wt1Var = new wt1();
        this.f44159L = wt1Var;
        wt1 wt1Var2 = new wt1();
        this.f44160M = wt1Var2;
        this.f44162N = new wqe<>();
        this.f44163Q = new wqe<>();
        this.f44161M1 = new vn2(null, false, 3, null);
        em2 em2Var = new em2(p40Var, dn2Var, mrfVar, setAsMutableSet, wt1Var, wt1Var2, this);
        dn2Var.registerComposer$runtime_release(em2Var);
        this.f44164V1 = em2Var;
        this.f44168Z1 = e13Var;
        this.f44170a2 = dn2Var instanceof wsd;
        this.f44174c2 = wk2.f94475a.m32994getLambda1$runtime_release();
    }

    private final void addPendingInvalidationsLocked(Object obj, boolean z) {
        Object obj2 = this.f44178m.getMap().get(obj);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof u6b)) {
            ssd ssdVar = (ssd) obj2;
            if (this.f44162N.remove(obj, ssdVar) || ssdVar.invalidateForResult(obj) == ie8.IGNORED) {
                return;
            }
            if (!ssdVar.isConditional() || z) {
                this.f44156C.add(ssdVar);
                return;
            } else {
                this.f44157F.add(ssdVar);
                return;
            }
        }
        u6b u6bVar = (u6b) obj2;
        Object[] objArr = u6bVar.f30278b;
        long[] jArr = u6bVar.f30277a;
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
                        ssd ssdVar2 = (ssd) objArr[(i << 3) + i3];
                        if (!this.f44162N.remove(obj, ssdVar2) && ssdVar2.invalidateForResult(obj) != ie8.IGNORED) {
                            if (!ssdVar2.isConditional() || z) {
                                this.f44156C.add(ssdVar2);
                            } else {
                                this.f44157F.add(ssdVar2);
                            }
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void applyChangesInLocked(p000.wt1 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hn2.applyChangesInLocked(wt1):void");
    }

    private final void cleanUpDerivedStateObservations() {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        boolean zIsEmpty;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        s6b<Object, Object> map = this.f44158H.getMap();
        long[] jArr5 = map.f14264a;
        int length = jArr5.length - 2;
        char c = 7;
        long j = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j2 = jArr5[i6];
                if ((((~j2) << c) & j2 & j) != j) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j2 & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj = map.f14265b[i9];
                            Object obj2 = map.f14266c[i9];
                            if (obj2 instanceof u6b) {
                                md8.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                u6b u6bVar = (u6b) obj2;
                                Object[] objArr2 = u6bVar.f30278b;
                                long[] jArr6 = u6bVar.f30277a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i2 = length;
                                if (length2 >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j3 = jArr6[i10];
                                        i3 = i6;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                int i13 = i12;
                                                Object[] objArr4 = objArr3;
                                                if ((j3 & 255) < 128) {
                                                    int i14 = (i10 << 3) + i13;
                                                    jArr4 = jArr6;
                                                    if (!this.f44178m.contains((z64) objArr4[i14])) {
                                                        u6bVar.removeElementAt(i14);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j3 >>= 8;
                                                i12 = i13 + 1;
                                                jArr6 = jArr4;
                                                objArr3 = objArr4;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i11 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr6 = jArr3;
                                        objArr2 = objArr;
                                        i6 = i3;
                                        c = 7;
                                    }
                                } else {
                                    i3 = i6;
                                }
                                zIsEmpty = u6bVar.isEmpty();
                            } else {
                                jArr2 = jArr5;
                                i2 = length;
                                i3 = i6;
                                md8.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                zIsEmpty = !this.f44178m.contains((z64) obj2);
                            }
                            if (zIsEmpty) {
                                map.removeValueAt(i9);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr5;
                            i2 = length;
                            i3 = i6;
                            i4 = i5;
                        }
                        j2 >>= i4;
                        i8++;
                        i5 = i4;
                        jArr5 = jArr2;
                        length = i2;
                        i6 = i3;
                        c = 7;
                    }
                    jArr = jArr5;
                    int i15 = length;
                    int i16 = i6;
                    if (i7 != i5) {
                        break;
                    }
                    length = i15;
                    i = i16;
                } else {
                    jArr = jArr5;
                    i = i6;
                }
                if (i == length) {
                    break;
                }
                i6 = i + 1;
                jArr5 = jArr;
                c = 7;
                j = -9187201950435737472L;
                i5 = 8;
            }
        }
        if (!this.f44157F.isNotEmpty()) {
            return;
        }
        u6b<ssd> u6bVar2 = this.f44157F;
        Object[] objArr5 = u6bVar2.f30278b;
        long[] jArr7 = u6bVar2.f30277a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j4 = jArr7[i17];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j4 & 255) < 128) {
                        int i20 = (i17 << 3) + i19;
                        if (!((ssd) objArr5[i20]).isConditional()) {
                            u6bVar2.removeElementAt(i20);
                        }
                    }
                    j4 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    private final void composeInitial(gz6<? super zl2, ? super Integer, bth> gz6Var) {
        if (this.f44172b2) {
            a8d.throwIllegalStateException("The composition is disposed");
        }
        this.f44174c2 = gz6Var;
        this.f44169a.composeInitial$runtime_release(this, gz6Var);
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.f44173c.getAndSet(in2.f47574a);
        if (andSet != null) {
            if (md8.areEqual(andSet, in2.f47574a)) {
                gm2.composeRuntimeError("pending composition has not been applied");
                throw new us8();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                gm2.composeRuntimeError("corrupt pendingModifications drain: " + this.f44173c);
                throw new us8();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.f44173c.getAndSet(null);
        if (md8.areEqual(andSet, in2.f47574a)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            gm2.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new us8();
        }
        gm2.composeRuntimeError("corrupt pendingModifications drain: " + this.f44173c);
        throw new us8();
    }

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    private final boolean getAreChildrenComposing() {
        return this.f44164V1.getAreChildrenComposing$runtime_release();
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    private final <T> T guardChanges(ny6<? extends T> ny6Var) throws Exception {
        try {
            try {
                T tInvoke = ny6Var.invoke();
                o28.finallyStart(1);
                o28.finallyEnd(1);
                return tInvoke;
            } catch (Throwable th) {
                o28.finallyStart(1);
                if (!this.f44176e.isEmpty()) {
                    new C6912a(this.f44176e).dispatchAbandons();
                }
                o28.finallyEnd(1);
                throw th;
            }
        } catch (Exception e) {
            abandonChanges();
            throw e;
        }
    }

    private final <T> T guardInvalidationsLocked(qy6<? super wqe<ssd, Object>, ? extends T> qy6Var) throws Exception {
        wqe<ssd, Object> wqeVarTakeInvalidations = takeInvalidations();
        try {
            return qy6Var.invoke(wqeVarTakeInvalidations);
        } catch (Exception e) {
            this.f44163Q = wqeVarTakeInvalidations;
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae A[Catch: all -> 0x001e, EDGE_INSN: B:66:0x00ae->B:52:0x00ae BREAK  A[LOOP:0: B:33:0x0067->B:48:0x00a6], EDGE_INSN: B:67:0x00ae->B:52:0x00ae BREAK  A[LOOP:0: B:33:0x0067->B:48:0x00a6], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0033, B:23:0x003e, B:25:0x0042, B:26:0x004b, B:28:0x0057, B:30:0x005b, B:33:0x0067, B:35:0x0077, B:37:0x0083, B:39:0x008d, B:44:0x009c, B:48:0x00a6, B:49:0x00a9, B:52:0x00ae), top: B:64:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p000.ie8 invalidateChecked(p000.ssd r21, p000.C5897fo r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hn2.invalidateChecked(ssd, fo, java.lang.Object):ie8");
    }

    private final void invalidateScopeOfLocked(Object obj) {
        Object obj2 = this.f44178m.getMap().get(obj);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof u6b)) {
            ssd ssdVar = (ssd) obj2;
            if (ssdVar.invalidateForResult(obj) == ie8.IMMINENT) {
                this.f44162N.add(obj, ssdVar);
                return;
            }
            return;
        }
        u6b u6bVar = (u6b) obj2;
        Object[] objArr = u6bVar.f30278b;
        long[] jArr = u6bVar.f30277a;
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
                        ssd ssdVar2 = (ssd) objArr[(i << 3) + i3];
                        if (ssdVar2.invalidateForResult(obj) == ie8.IMMINENT) {
                            this.f44162N.add(obj, ssdVar2);
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

    private final tn2 observer() {
        vn2 vn2Var = this.f44161M1;
        if (vn2Var.getRoot()) {
            return vn2Var.getObserver();
        }
        vn2 observerHolder$runtime_release = this.f44169a.getObserverHolder$runtime_release();
        tn2 observer = observerHolder$runtime_release != null ? observerHolder$runtime_release.getObserver() : null;
        if (!md8.areEqual(observer, vn2Var.getObserver())) {
            vn2Var.setObserver(observer);
        }
        return observer;
    }

    private final wqe<ssd, Object> takeInvalidations() {
        wqe<ssd, Object> wqeVar = this.f44163Q;
        this.f44163Q = new wqe<>();
        return wqeVar;
    }

    private final <T> T trackAbandonedValues(ny6<? extends T> ny6Var) {
        try {
            T tInvoke = ny6Var.invoke();
            o28.finallyStart(1);
            o28.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            o28.finallyStart(1);
            if (!this.f44176e.isEmpty()) {
                new C6912a(this.f44176e).dispatchAbandons();
            }
            o28.finallyEnd(1);
            throw th;
        }
    }

    private final boolean tryImminentInvalidation(ssd ssdVar, Object obj) {
        return isComposing() && this.f44164V1.tryImminentInvalidation$runtime_release(ssdVar, obj);
    }

    private final void validateRecomposeScopeAnchors(mrf mrfVar) {
        Object[] slots = mrfVar.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            ssd ssdVar = obj instanceof ssd ? (ssd) obj : null;
            if (ssdVar != null) {
                arrayList.add(ssdVar);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ssd ssdVar2 = (ssd) arrayList.get(i);
            C5897fo anchor = ssdVar2.getAnchor();
            if (anchor != null && !mrfVar.slotsOf$runtime_release(anchor.toIndexFor(mrfVar)).contains(ssdVar2)) {
                a8d.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + ssdVar2 + " encountered, scope found at " + e80.indexOf((ssd[]) mrfVar.getSlots(), ssdVar2));
            }
        }
    }

    @Override // p000.sz2
    public void abandonChanges() {
        this.f44173c.set(null);
        this.f44159L.clear();
        this.f44160M.clear();
        if (this.f44176e.isEmpty()) {
            return;
        }
        new C6912a(this.f44176e).dispatchAbandons();
    }

    @Override // p000.sz2
    public void applyChanges() {
        synchronized (this.f44175d) {
            try {
                applyChangesInLocked(this.f44159L);
                drainPendingModificationsLocked();
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f44176e.isEmpty()) {
                            new C6912a(this.f44176e).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.sz2
    public void applyLateChanges() {
        synchronized (this.f44175d) {
            try {
                if (this.f44160M.isNotEmpty()) {
                    applyChangesInLocked(this.f44160M);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f44176e.isEmpty()) {
                            new C6912a(this.f44176e).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.sz2
    public void changesApplied() {
        synchronized (this.f44175d) {
            try {
                this.f44164V1.changesApplied$runtime_release();
                if (!this.f44176e.isEmpty()) {
                    new C6912a(this.f44176e).dispatchAbandons();
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f44176e.isEmpty()) {
                            new C6912a(this.f44176e).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.sz2
    public void composeContent(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        wqe<ssd, Object> wqeVarTakeInvalidations;
        try {
            synchronized (this.f44175d) {
                try {
                    drainPendingModificationsForCompositionLocked();
                    wqeVarTakeInvalidations = takeInvalidations();
                    tn2 tn2VarObserver = observer();
                    if (tn2VarObserver != null) {
                        Map<ssd, Set<Object>> mapAsMap = wqeVarTakeInvalidations.asMap();
                        md8.checkNotNull(mapAsMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        tn2VarObserver.onBeginComposition(this, mapAsMap);
                    }
                    this.f44164V1.composeContent$runtime_release(wqeVarTakeInvalidations, gz6Var);
                    if (tn2VarObserver != null) {
                        tn2VarObserver.onEndComposition(this);
                        bth bthVar = bth.f14751a;
                    }
                } catch (Exception e) {
                    this.f44163Q = wqeVarTakeInvalidations;
                    throw e;
                } finally {
                }
            }
        } finally {
        }
    }

    public final int composerStacksSizes$runtime_release() {
        return this.f44164V1.stacksSize$runtime_release();
    }

    @Override // p000.h9e
    public void deactivate() {
        synchronized (this.f44175d) {
            try {
                boolean z = this.f44177f.getGroupsSize() > 0;
                if (z || !this.f44176e.isEmpty()) {
                    q5h q5hVar = q5h.f73293a;
                    Object objBeginSection = q5hVar.beginSection("Compose:deactivate");
                    try {
                        C6912a c6912a = new C6912a(this.f44176e);
                        if (z) {
                            this.f44171b.onBeginChanges();
                            prf prfVarOpenWriter = this.f44177f.openWriter();
                            try {
                                gm2.deactivateCurrentGroup(prfVarOpenWriter, c6912a);
                                bth bthVar = bth.f14751a;
                                prfVarOpenWriter.close(true);
                                this.f44171b.onEndChanges();
                                c6912a.dispatchRememberObservers();
                            } catch (Throwable th) {
                                prfVarOpenWriter.close(false);
                                throw th;
                            }
                        }
                        c6912a.dispatchAbandons();
                        bth bthVar2 = bth.f14751a;
                        q5hVar.endSection(objBeginSection);
                    } catch (Throwable th2) {
                        q5h.f73293a.endSection(objBeginSection);
                        throw th2;
                    }
                }
                this.f44178m.clear();
                this.f44158H.clear();
                this.f44163Q.clear();
                this.f44159L.clear();
                this.f44160M.clear();
                this.f44164V1.deactivate$runtime_release();
                bth bthVar3 = bth.f14751a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p000.sz2
    public <R> R delegateInvalidations(@gib sz2 sz2Var, int i, @yfb ny6<? extends R> ny6Var) {
        if (sz2Var == null || md8.areEqual(sz2Var, this) || i < 0) {
            return ny6Var.invoke();
        }
        this.f44166Y = (hn2) sz2Var;
        this.f44167Z = i;
        try {
            return ny6Var.invoke();
        } finally {
            this.f44166Y = null;
            this.f44167Z = 0;
        }
    }

    @Override // p000.cn2
    public void dispose() {
        synchronized (this.f44175d) {
            try {
                if (this.f44164V1.isComposing$runtime_release()) {
                    a8d.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f44172b2) {
                    this.f44172b2 = true;
                    this.f44174c2 = wk2.f94475a.m32995getLambda2$runtime_release();
                    wt1 deferredChanges$runtime_release = this.f44164V1.getDeferredChanges$runtime_release();
                    if (deferredChanges$runtime_release != null) {
                        applyChangesInLocked(deferredChanges$runtime_release);
                    }
                    boolean z = this.f44177f.getGroupsSize() > 0;
                    if (z || !this.f44176e.isEmpty()) {
                        C6912a c6912a = new C6912a(this.f44176e);
                        if (z) {
                            this.f44171b.onBeginChanges();
                            prf prfVarOpenWriter = this.f44177f.openWriter();
                            try {
                                gm2.removeCurrentGroup(prfVarOpenWriter, c6912a);
                                bth bthVar = bth.f14751a;
                                prfVarOpenWriter.close(true);
                                this.f44171b.clear();
                                this.f44171b.onEndChanges();
                                c6912a.dispatchRememberObservers();
                            } catch (Throwable th) {
                                prfVarOpenWriter.close(false);
                                throw th;
                            }
                        }
                        c6912a.dispatchAbandons();
                    }
                    this.f44164V1.dispose$runtime_release();
                }
                bth bthVar2 = bth.f14751a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f44169a.unregisterComposition$runtime_release(this);
    }

    @Override // p000.sz2
    public void disposeUnusedMovableContent(@yfb h0b h0bVar) {
        C6912a c6912a = new C6912a(this.f44176e);
        prf prfVarOpenWriter = h0bVar.getSlotTable$runtime_release().openWriter();
        try {
            gm2.removeCurrentGroup(prfVarOpenWriter, c6912a);
            bth bthVar = bth.f14751a;
            prfVarOpenWriter.close(true);
            c6912a.dispatchRememberObservers();
        } catch (Throwable th) {
            prfVarOpenWriter.close(false);
            throw th;
        }
    }

    @yfb
    public final gz6<zl2, Integer, bth> getComposable() {
        return this.f44174c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zn2
    @gib
    public <T> T getCompositionService(@yfb yn2<T> yn2Var) {
        if (md8.areEqual(yn2Var, in2.getCompositionImplServiceKey())) {
            return this;
        }
        return null;
    }

    @yfb
    @dpg
    public final List<ssd> getConditionalScopes$runtime_release() {
        return v82.toList(this.f44157F.asSet());
    }

    @yfb
    @dpg
    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.f44158H.getMap().asMap().keySet();
    }

    @Override // p000.cn2
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.f44175d) {
            z = this.f44163Q.getSize() > 0;
        }
        return z;
    }

    @Override // p000.sz2
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.f44175d) {
            hasPendingChanges$runtime_release = this.f44164V1.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @yfb
    @dpg
    public final Set<Object> getObservedObjects$runtime_release() {
        return this.f44178m.getMap().asMap().keySet();
    }

    @yfb
    public final vn2 getObserverHolder$runtime_release() {
        return this.f44161M1;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.f44165X;
    }

    @yfb
    public final e13 getRecomposeContext() {
        e13 e13Var = this.f44168Z1;
        return e13Var == null ? this.f44169a.getRecomposeCoroutineContext$runtime_release() : e13Var;
    }

    @yfb
    public final mrf getSlotTable$runtime_release() {
        return this.f44177f;
    }

    @Override // p000.sz2
    public void insertMovableContent(@yfb List<scc<i0b, i0b>> list) {
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!md8.areEqual(list.get(i).getFirst().getComposition$runtime_release(), this)) {
                break;
            } else {
                i++;
            }
        }
        gm2.runtimeCheck(z);
        try {
            this.f44164V1.insertMovableContentReferences(list);
            bth bthVar = bth.f14751a;
        } finally {
        }
    }

    @Override // p000.vsd
    @yfb
    public ie8 invalidate(@yfb ssd ssdVar, @gib Object obj) {
        hn2 hn2Var;
        if (ssdVar.getDefaultsInScope()) {
            ssdVar.setDefaultsInvalid(true);
        }
        C5897fo anchor = ssdVar.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return ie8.IGNORED;
        }
        if (this.f44177f.ownsAnchor(anchor)) {
            return !ssdVar.getCanRecompose() ? ie8.IGNORED : invalidateChecked(ssdVar, anchor, obj);
        }
        synchronized (this.f44175d) {
            hn2Var = this.f44166Y;
        }
        return (hn2Var == null || !hn2Var.tryImminentInvalidation(ssdVar, obj)) ? ie8.IGNORED : ie8.IMMINENT;
    }

    @Override // p000.sz2
    public void invalidateAll() {
        synchronized (this.f44175d) {
            try {
                for (Object obj : this.f44177f.getSlots()) {
                    ssd ssdVar = obj instanceof ssd ? (ssd) obj : null;
                    if (ssdVar != null) {
                        ssdVar.invalidate();
                    }
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidateGroupsWithKey(int i) {
        List<ssd> listInvalidateGroupsWithKey$runtime_release;
        synchronized (this.f44175d) {
            listInvalidateGroupsWithKey$runtime_release = this.f44177f.invalidateGroupsWithKey$runtime_release(i);
        }
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (listInvalidateGroupsWithKey$runtime_release.get(i2).invalidateForResult(null) != ie8.IGNORED) {
                }
            }
            return;
        }
        if (this.f44164V1.forceRecomposeScopes$runtime_release()) {
            this.f44169a.invalidate$runtime_release(this);
        }
    }

    @Override // p000.sz2
    public boolean isComposing() {
        return this.f44164V1.isComposing$runtime_release();
    }

    @Override // p000.cn2
    public boolean isDisposed() {
        return this.f44172b2;
    }

    public final boolean isRoot() {
        return this.f44170a2;
    }

    @yfb
    public final un2 observe$runtime_release(@yfb tn2 tn2Var) {
        synchronized (this.f44175d) {
            this.f44161M1.setObserver(tn2Var);
            this.f44161M1.setRoot(true);
            bth bthVar = bth.f14751a;
        }
        return new C6913b(tn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // p000.sz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean observesAnyOf(@p000.yfb java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof p000.foe
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            foe r15 = (p000.foe) r15
            doe r15 = r15.getSet$runtime_release()
            java.lang.Object[] r0 = r15.f30278b
            long[] r15 = r15.f30277a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            wqe<java.lang.Object, ssd> r11 = r14.f44178m
            boolean r11 = r11.contains(r10)
            if (r11 != 0) goto L50
            wqe<java.lang.Object, z64<?>> r11 = r14.f44158H
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            wqe<java.lang.Object, ssd> r3 = r14.f44178m
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L7c
            wqe<java.lang.Object, z64<?>> r3 = r14.f44158H
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hn2.observesAnyOf(java.util.Set):boolean");
    }

    @Override // p000.sz2
    public void prepareCompose(@yfb ny6<bth> ny6Var) {
        this.f44164V1.prepareCompose$runtime_release(ny6Var);
    }

    @Override // p000.sz2
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.f44175d) {
            try {
                drainPendingModificationsForCompositionLocked();
                try {
                    wqe<ssd, Object> wqeVarTakeInvalidations = takeInvalidations();
                    try {
                        tn2 tn2VarObserver = observer();
                        if (tn2VarObserver != null) {
                            Map<ssd, Set<Object>> mapAsMap = wqeVarTakeInvalidations.asMap();
                            md8.checkNotNull(mapAsMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                            tn2VarObserver.onBeginComposition(this, mapAsMap);
                        }
                        zRecompose$runtime_release = this.f44164V1.recompose$runtime_release(wqeVarTakeInvalidations);
                        if (!zRecompose$runtime_release) {
                            drainPendingModificationsLocked();
                        }
                        if (tn2VarObserver != null) {
                            tn2VarObserver.onEndComposition(this);
                        }
                    } catch (Exception e) {
                        this.f44163Q = wqeVarTakeInvalidations;
                        throw e;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // p000.vsd
    public void recomposeScopeReleased(@yfb ssd ssdVar) {
        this.f44165X = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.sz2
    public void recordModificationsOf(@yfb Set<? extends Object> set) {
        Object obj;
        Object objPlus;
        do {
            obj = this.f44173c.get();
            if (obj == null ? true : md8.areEqual(obj, in2.f47574a)) {
                objPlus = set;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f44173c).toString());
                }
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = u70.plus((Set<? extends Object>[]) obj, set);
            }
        } while (!v7b.m23844a(this.f44173c, obj, objPlus));
        if (obj == null) {
            synchronized (this.f44175d) {
                drainPendingModificationsLocked();
                bth bthVar = bth.f14751a;
            }
        }
    }

    @Override // p000.sz2, p000.vsd
    public void recordReadOf(@yfb Object obj) {
        ssd currentRecomposeScope$runtime_release;
        long[] jArr;
        long[] jArr2;
        int i;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.f44164V1.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(obj)) {
            return;
        }
        if (obj instanceof y2g) {
            nrd.C10025a c10025a = nrd.f65391b;
            ((y2g) obj).m33360recordReadInh_f27i8$runtime_release(nrd.m31201constructorimpl(1));
        }
        this.f44178m.add(obj, currentRecomposeScope$runtime_release);
        if (obj instanceof z64) {
            z64<?> z64Var = (z64) obj;
            z64.InterfaceC16015a<?> currentRecord = z64Var.getCurrentRecord();
            this.f44158H.removeScope(obj);
            zjb<x2g> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.f105299b;
            long[] jArr3 = dependencies.f105298a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j & 255) < 128) {
                                x2g x2gVar = (x2g) objArr[(i2 << 3) + i5];
                                if (x2gVar instanceof y2g) {
                                    nrd.C10025a c10025a2 = nrd.f65391b;
                                    jArr2 = jArr3;
                                    ((y2g) x2gVar).m33360recordReadInh_f27i8$runtime_release(nrd.m31201constructorimpl(1));
                                } else {
                                    jArr2 = jArr3;
                                }
                                this.f44158H.add(x2gVar, obj);
                                i = 8;
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            currentRecomposeScope$runtime_release.recordDerivedStateValue(z64Var, currentRecord.getCurrentValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // p000.sz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void recordWriteOf(@p000.yfb java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f44175d
            monitor-enter(r0)
            r14.invalidateScopeOfLocked(r15)     // Catch: java.lang.Throwable -> L53
            wqe<java.lang.Object, z64<?>> r1 = r14.f44158H     // Catch: java.lang.Throwable -> L53
            s6b r1 = r1.getMap()     // Catch: java.lang.Throwable -> L53
            java.lang.Object r15 = r1.get(r15)     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L65
            boolean r1 = r15 instanceof p000.u6b     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L60
            u6b r15 = (p000.u6b) r15     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r1 = r15.f30278b     // Catch: java.lang.Throwable -> L53
            long[] r15 = r15.f30277a     // Catch: java.lang.Throwable -> L53
            int r2 = r15.length     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L23:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L53
            long r7 = ~r5     // Catch: java.lang.Throwable -> L53
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L53
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L3d:
            if (r9 >= r7) goto L59
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L53
            z64 r10 = (p000.z64) r10     // Catch: java.lang.Throwable -> L53
            r14.invalidateScopeOfLocked(r10)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r15 = move-exception
            goto L69
        L55:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L3d
        L59:
            if (r7 != r8) goto L65
        L5b:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L23
        L60:
            z64 r15 = (p000.z64) r15     // Catch: java.lang.Throwable -> L53
            r14.invalidateScopeOfLocked(r15)     // Catch: java.lang.Throwable -> L53
        L65:
            bth r15 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)
            return
        L69:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hn2.recordWriteOf(java.lang.Object):void");
    }

    public final void removeDerivedStateObservation$runtime_release(@yfb z64<?> z64Var) {
        if (this.f44178m.contains(z64Var)) {
            return;
        }
        this.f44158H.removeScope(z64Var);
    }

    public final void removeObservation$runtime_release(@yfb Object obj, @yfb ssd ssdVar) {
        this.f44178m.remove(obj, ssdVar);
    }

    public final void setComposable(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        this.f44174c2 = gz6Var;
    }

    @Override // p000.cn2
    public void setContent(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        composeInitial(gz6Var);
    }

    @Override // p000.h9e
    public void setContentWithReuse(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        this.f44164V1.startReuseFromRoot();
        composeInitial(gz6Var);
        this.f44164V1.endReuseFromRoot();
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.f44165X = z;
    }

    @Override // p000.sz2
    public void verifyConsistent() {
        synchronized (this.f44175d) {
            try {
                if (!isComposing()) {
                    this.f44164V1.verifyConsistent$runtime_release();
                    this.f44177f.verifyWellFormed();
                    validateRecomposeScopeAnchors(this.f44177f);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180 A[EDGE_INSN: B:69:0x0180->B:221:0x0111 BREAK  A[LOOP:13: B:59:0x0146->B:70:0x0182]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hn2.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    public /* synthetic */ hn2(dn2 dn2Var, p40 p40Var, e13 e13Var, int i, jt3 jt3Var) {
        this(dn2Var, p40Var, (i & 4) != 0 ? null : e13Var);
    }
}
