package p000;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.opencv.videoio.Videoio;
import p000.dq1;
import p000.jj8;
import p000.ssf;
import p000.usf;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 10 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1646:1\n1299#1,5:1712\n1305#1:1722\n1299#1,5:1735\n1305#1:1745\n1299#1,5:1766\n1305#1:1829\n1208#2:1647\n1187#2,2:1648\n89#3:1650\n89#3:1651\n89#3:1654\n89#3:1656\n89#3:1663\n89#3:1664\n89#3:1665\n89#3:1666\n89#3:1684\n89#3:1685\n89#3:1686\n89#3:1687\n89#3:1688\n89#3:1689\n89#3:1690\n89#3:1697\n89#3:1707\n89#3:1710\n89#3:1711\n89#3:1723\n89#3:1724\n89#3:1774\n89#3:1816\n89#3:1830\n89#3:1853\n89#3:1854\n89#3:1855\n89#3:1856\n89#3:1859\n89#3:1862\n89#3:1863\n89#3:1864\n89#3:1865\n89#3:1866\n89#3:1867\n89#3:1868\n1229#4,2:1652\n1#5:1655\n1#5:1812\n33#6,6:1657\n33#6,6:1667\n33#6,6:1691\n93#6,2:1725\n33#6,4:1727\n95#6,2:1731\n38#6:1733\n97#6:1734\n120#6,3:1746\n33#6,4:1749\n123#6,2:1753\n125#6,2:1762\n38#6:1764\n127#6:1765\n82#6,3:1775\n33#6,4:1778\n85#6,2:1782\n38#6:1784\n87#6:1785\n110#6,2:1786\n33#6,6:1788\n112#6:1794\n110#6,2:1795\n33#6,6:1797\n112#6:1803\n211#6,3:1804\n33#6,4:1807\n214#6:1811\n215#6:1813\n38#6:1814\n216#6:1815\n231#6,3:1817\n64#6,4:1820\n234#6,2:1824\n69#6:1826\n236#6:1827\n82#6,3:1831\n33#6,4:1834\n85#6,2:1838\n38#6:1840\n87#6:1841\n33#6,6:1842\n460#7,11:1673\n735#7,2:1857\n728#7,2:1860\n314#8,9:1698\n323#8,2:1708\n138#9,5:1717\n138#9,5:1740\n138#9,3:1771\n142#9:1828\n138#9,5:1848\n361#10,7:1755\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1121#1:1712,5\n1121#1:1722\n1198#1:1735,5\n1198#1:1745\n1218#1:1766,5\n1218#1:1829\n218#1:1647\n218#1:1648,2\n297#1:1650\n347#1:1651\n441#1:1654\n446#1:1656\n460#1:1663\n469#1:1664\n474#1:1665\n485#1:1666\n497#1:1684\n505#1:1685\n751#1:1686\n781#1:1687\n812#1:1688\n824#1:1689\n841#1:1690\n989#1:1697\n1001#1:1707\n1086#1:1710\n1102#1:1711\n1134#1:1723\n1165#1:1724\n1221#1:1774\n1239#1:1816\n1262#1:1830\n1329#1:1853\n1366#1:1854\n1381#1:1855\n1413#1:1856\n1421#1:1859\n1430#1:1862\n1437#1:1863\n1444#1:1864\n1453#1:1865\n1459#1:1866\n1471#1:1867\n1171#1:1868\n348#1:1652,2\n1236#1:1812\n452#1:1657,6\n491#1:1667,6\n842#1:1691,6\n1166#1:1725,2\n1166#1:1727,4\n1166#1:1731,2\n1166#1:1733\n1166#1:1734\n1215#1:1746,3\n1215#1:1749,4\n1215#1:1753,2\n1215#1:1762,2\n1215#1:1764\n1215#1:1765\n1222#1:1775,3\n1222#1:1778,4\n1222#1:1782,2\n1222#1:1784\n1222#1:1785\n1231#1:1786,2\n1231#1:1788,6\n1231#1:1794\n1231#1:1795,2\n1231#1:1797,6\n1231#1:1803\n1236#1:1804,3\n1236#1:1807,4\n1236#1:1811\n1236#1:1813\n1236#1:1814\n1236#1:1815\n1244#1:1817,3\n1244#1:1820,4\n1244#1:1824,2\n1244#1:1826\n1244#1:1827\n1266#1:1831,3\n1266#1:1834,4\n1266#1:1838,2\n1266#1:1840\n1266#1:1841\n1273#1:1842,6\n495#1:1673,11\n1415#1:1857,2\n1423#1:1860,2\n1000#1:1698,9\n1000#1:1708,2\n1121#1:1717,5\n1198#1:1740,5\n1218#1:1771,3\n1218#1:1828\n1303#1:1848,5\n1215#1:1755,7\n*E\n"})
@e0g(parameters = 0)
public final class wsd extends dn2 {

    /* JADX INFO: renamed from: b */
    public long f95340b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final yd1 f95341c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Object f95342d;

    /* JADX INFO: renamed from: e */
    @gib
    public jj8 f95343e;

    /* JADX INFO: renamed from: f */
    @gib
    public Throwable f95344f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final List<sz2> f95345g;

    /* JADX INFO: renamed from: h */
    @gib
    public List<? extends sz2> f95346h;

    /* JADX INFO: renamed from: i */
    @yfb
    public u6b<Object> f95347i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final f7b<sz2> f95348j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final List<sz2> f95349k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final List<i0b> f95350l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final Map<f0b<Object>, List<i0b>> f95351m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final Map<i0b, h0b> f95352n;

    /* JADX INFO: renamed from: o */
    @gib
    public List<sz2> f95353o;

    /* JADX INFO: renamed from: p */
    @gib
    public Set<sz2> f95354p;

    /* JADX INFO: renamed from: q */
    @gib
    public dq1<? super bth> f95355q;

    /* JADX INFO: renamed from: r */
    public int f95356r;

    /* JADX INFO: renamed from: s */
    public boolean f95357s;

    /* JADX INFO: renamed from: t */
    @gib
    public C14775c f95358t;

    /* JADX INFO: renamed from: u */
    public boolean f95359u;

    /* JADX INFO: renamed from: v */
    @yfb
    public final a7b<EnumC14777e> f95360v;

    /* JADX INFO: renamed from: w */
    @yfb
    public final jg2 f95361w;

    /* JADX INFO: renamed from: x */
    @yfb
    public final e13 f95362x;

    /* JADX INFO: renamed from: y */
    @yfb
    public final C14776d f95363y;

    /* JADX INFO: renamed from: z */
    @yfb
    public static final C14773a f95339z = new C14773a(null);

    /* JADX INFO: renamed from: A */
    public static final int f95336A = 8;

    /* JADX INFO: renamed from: B */
    @yfb
    public static final a7b<lsc<C14776d>> f95337B = n2g.MutableStateFlow(hj5.persistentSetOf());

    /* JADX INFO: renamed from: C */
    @yfb
    public static final AtomicReference<Boolean> f95338C = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: wsd$a */
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n1360#2:1647\n1446#2,5:1648\n1855#2,2:1653\n1855#2,2:1667\n1855#2,2:1669\n1603#2,9:1671\n1855#2:1680\n1856#2:1682\n1612#2:1683\n1603#2,9:1684\n1855#2:1693\n1856#2:1695\n1612#2:1696\n33#3,6:1655\n33#3,6:1661\n1#4:1681\n1#4:1694\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1522#1:1647\n1522#1:1648,5\n1530#1:1653,2\n1539#1:1667,2\n1546#1:1669,2\n1560#1:1671,9\n1560#1:1680\n1560#1:1682\n1560#1:1683\n1565#1:1684,9\n1565#1:1693\n1565#1:1695\n1565#1:1696\n1536#1:1655,6\n1537#1:1661,6\n1560#1:1681\n1565#1:1694\n*E\n"})
    public static final class C14773a {
        public /* synthetic */ C14773a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(C14776d c14776d) {
            lsc lscVar;
            lsc lscVarAdd;
            do {
                lscVar = (lsc) wsd.f95337B.getValue();
                lscVarAdd = lscVar.add(c14776d);
                if (lscVar == lscVarAdd) {
                    return;
                }
            } while (!wsd.f95337B.compareAndSet(lscVar, lscVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(C14776d c14776d) {
            lsc lscVar;
            lsc lscVarRemove;
            do {
                lscVar = (lsc) wsd.f95337B.getValue();
                lscVarRemove = lscVar.remove(c14776d);
                if (lscVar == lscVarRemove) {
                    return;
                }
            } while (!wsd.f95337B.compareAndSet(lscVar, lscVarRemove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) wsd.f95337B.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                C14775c c14775cResetErrorState = ((C14776d) it.next()).resetErrorState();
                if (c14775cResetErrorState != null) {
                    arrayList.add(c14775cResetErrorState);
                }
            }
        }

        @yfb
        public final List<xsd> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) wsd.f95337B.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                xsd currentError = ((C14776d) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        @yfb
        public final l2g<Set<ysd>> getRunningRecomposers() {
            return wsd.f95337B;
        }

        public final void invalidateGroupsWithKey$runtime_release(int i) {
            wsd.f95338C.set(Boolean.TRUE);
            for (C14776d c14776d : (Iterable) wsd.f95337B.getValue()) {
                xsd currentError = c14776d.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    c14776d.resetErrorState();
                    c14776d.invalidateGroupsWithKey(i);
                    c14776d.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@yfb Object obj) {
            wsd.f95338C.set(Boolean.TRUE);
            Iterator it = ((Iterable) wsd.f95337B.getValue()).iterator();
            while (it.hasNext()) {
                ((C14776d) it.next()).resetErrorState();
            }
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C14774b) list.get(i)).resetContent();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C14774b) list.get(i2)).recompose();
            }
            Iterator it2 = ((Iterable) wsd.f95337B.getValue()).iterator();
            while (it2.hasNext()) {
                ((C14776d) it2.next()).retryFailedCompositions();
            }
        }

        @yfb
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            wsd.f95338C.set(Boolean.TRUE);
            Iterable iterable = (Iterable) wsd.f95337B.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                q82.addAll(arrayList, ((C14776d) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z) {
            wsd.f95338C.set(Boolean.valueOf(z));
        }

        private C14773a() {
        }
    }

    /* JADX INFO: renamed from: wsd$b */
    public static final class C14774b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final hn2 f95364a;

        /* JADX INFO: renamed from: b */
        @yfb
        public gz6<? super zl2, ? super Integer, bth> f95365b;

        public C14774b(@yfb hn2 hn2Var) {
            this.f95364a = hn2Var;
            this.f95365b = hn2Var.getComposable();
        }

        public final void clearContent() {
            if (this.f95364a.isRoot()) {
                this.f95364a.setContent(yk2.f101873a.m33386getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.f95364a.isRoot()) {
                this.f95364a.setContent(this.f95365b);
            }
        }

        public final void resetContent() {
            this.f95364a.setComposable(this.f95365b);
        }
    }

    /* JADX INFO: renamed from: wsd$c */
    public static final class C14775c implements xsd {

        /* JADX INFO: renamed from: a */
        public final boolean f95366a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final Exception f95367b;

        public C14775c(boolean z, @yfb Exception exc) {
            this.f95366a = z;
            this.f95367b = exc;
        }

        @Override // p000.xsd
        @yfb
        public Exception getCause() {
            return this.f95367b;
        }

        @Override // p000.xsd
        public boolean getRecoverable() {
            return this.f95366a;
        }
    }

    /* JADX INFO: renamed from: wsd$d */
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n89#2:1647\n89#2:1648\n89#2:1667\n211#3,3:1649\n33#3,4:1652\n214#3:1656\n215#3:1658\n38#3:1659\n216#3:1660\n33#3,6:1661\n211#3,3:1668\n33#3,4:1671\n214#3:1675\n215#3:1677\n38#3:1678\n216#3:1679\n82#3,3:1680\n33#3,4:1683\n85#3:1687\n86#3:1689\n38#3:1690\n87#3:1691\n1#4:1657\n1#4:1676\n1#4:1688\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n373#1:1647\n378#1:1648\n386#1:1667\n382#1:1649,3\n382#1:1652,4\n382#1:1656\n382#1:1658\n382#1:1659\n382#1:1660\n383#1:1661,6\n390#1:1668,3\n390#1:1671,4\n390#1:1675\n390#1:1677\n390#1:1678\n390#1:1679\n391#1:1680,3\n391#1:1683,4\n391#1:1687\n391#1:1689\n391#1:1690\n391#1:1691\n382#1:1657\n390#1:1676\n*E\n"})
    public final class C14776d implements ysd {
        public C14776d() {
        }

        @Override // p000.ysd
        public long getChangeCount() {
            return wsd.this.getChangeCount();
        }

        @gib
        public final xsd getCurrentError() {
            C14775c c14775c;
            Object obj = wsd.this.f95342d;
            wsd wsdVar = wsd.this;
            synchronized (obj) {
                c14775c = wsdVar.f95358t;
            }
            return c14775c;
        }

        @Override // p000.ysd
        public boolean getHasPendingWork() {
            return wsd.this.getHasPendingWork();
        }

        @Override // p000.ysd
        @yfb
        public y56<EnumC14777e> getState() {
            return wsd.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i) {
            List knownCompositions;
            Object obj = wsd.this.f95342d;
            wsd wsdVar = wsd.this;
            synchronized (obj) {
                knownCompositions = wsdVar.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i2 = 0; i2 < size; i2++) {
                sz2 sz2Var = (sz2) knownCompositions.get(i2);
                hn2 hn2Var = sz2Var instanceof hn2 ? (hn2) sz2Var : null;
                if (hn2Var != null) {
                    arrayList.add(hn2Var);
                }
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((hn2) arrayList.get(i3)).invalidateGroupsWithKey(i);
            }
        }

        @gib
        public final C14775c resetErrorState() {
            return wsd.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            wsd.this.retryFailedCompositions();
        }

        @yfb
        public final List<C14774b> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            Object obj = wsd.this.f95342d;
            wsd wsdVar = wsd.this;
            synchronized (obj) {
                knownCompositions = wsdVar.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                sz2 sz2Var = (sz2) knownCompositions.get(i);
                hn2 hn2Var = sz2Var instanceof hn2 ? (hn2) sz2Var : null;
                if (hn2Var != null) {
                    arrayList.add(hn2Var);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C14774b c14774b = new C14774b((hn2) arrayList.get(i2));
                c14774b.clearContent();
                arrayList2.add(c14774b);
            }
            return arrayList2;
        }
    }

    /* JADX INFO: renamed from: wsd$e */
    public enum EnumC14777e {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* JADX INFO: renamed from: wsd$f */
    @ck3(m4009c = "androidx.compose.runtime.Recomposer$awaitIdle$2", m4010f = "Recomposer.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14778f extends ugg implements gz6<EnumC14777e, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f95376a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f95377b;

        public C14778f(zy2<? super C14778f> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14778f c14778f = new C14778f(zy2Var);
            c14778f.f95377b = obj;
            return c14778f;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb EnumC14777e enumC14777e, @gib zy2<? super Boolean> zy2Var) {
            return ((C14778f) create(enumC14777e, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f95376a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(((EnumC14777e) this.f95377b).compareTo(EnumC14777e.Idle) > 0);
        }
    }

    /* JADX INFO: renamed from: wsd$g */
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1646:1\n89#2:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n*L\n146#1:1647\n*E\n"})
    public static final class C14779g extends tt8 implements ny6<bth> {
        public C14779g() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            dq1 dq1VarDeriveStateLocked;
            Object obj = wsd.this.f95342d;
            wsd wsdVar = wsd.this;
            synchronized (obj) {
                dq1VarDeriveStateLocked = wsdVar.deriveStateLocked();
                if (((EnumC14777e) wsdVar.f95360v.getValue()).compareTo(EnumC14777e.ShuttingDown) <= 0) {
                    throw y75.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", wsdVar.f95344f);
                }
            }
            if (dq1VarDeriveStateLocked != null) {
                v7e.C13927a c13927a = v7e.f90266b;
                dq1VarDeriveStateLocked.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
            }
        }
    }

    /* JADX INFO: renamed from: wsd$h */
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1646:1\n89#2:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n251#1:1647\n*E\n"})
    public static final class C14780h extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: wsd$h$a */
        @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n89#2:1647\n1#3:1648\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n*L\n266#1:1647\n*E\n"})
        public static final class a extends tt8 implements qy6<Throwable, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ wsd f95380a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Throwable f95381b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wsd wsdVar, Throwable th) {
                super(1);
                this.f95380a = wsdVar;
                this.f95381b = th;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
                invoke2(th);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@gib Throwable th) {
                Object obj = this.f95380a.f95342d;
                wsd wsdVar = this.f95380a;
                Throwable th2 = this.f95381b;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                a85.addSuppressed(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    wsdVar.f95344f = th2;
                    wsdVar.f95360v.setValue(EnumC14777e.ShutDown);
                    bth bthVar = bth.f14751a;
                }
            }
        }

        public C14780h() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            dq1 dq1Var;
            dq1 dq1Var2;
            CancellationException CancellationException = y75.CancellationException("Recomposer effect job completed", th);
            Object obj = wsd.this.f95342d;
            wsd wsdVar = wsd.this;
            synchronized (obj) {
                try {
                    jj8 jj8Var = wsdVar.f95343e;
                    dq1Var = null;
                    if (jj8Var != null) {
                        wsdVar.f95360v.setValue(EnumC14777e.ShuttingDown);
                        if (wsdVar.f95357s) {
                            if (wsdVar.f95355q != null) {
                                dq1Var2 = wsdVar.f95355q;
                            }
                            wsdVar.f95355q = null;
                            jj8Var.invokeOnCompletion(new a(wsdVar, th));
                            dq1Var = dq1Var2;
                        } else {
                            jj8Var.cancel(CancellationException);
                        }
                        dq1Var2 = null;
                        wsdVar.f95355q = null;
                        jj8Var.invokeOnCompletion(new a(wsdVar, th));
                        dq1Var = dq1Var2;
                    } else {
                        wsdVar.f95344f = CancellationException;
                        wsdVar.f95360v.setValue(EnumC14777e.ShutDown);
                        bth bthVar = bth.f14751a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (dq1Var != null) {
                v7e.C13927a c13927a = v7e.f90266b;
                dq1Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
            }
        }
    }

    /* JADX INFO: renamed from: wsd$i */
    @ck3(m4009c = "androidx.compose.runtime.Recomposer$join$2", m4010f = "Recomposer.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C14781i extends ugg implements gz6<EnumC14777e, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f95382a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f95383b;

        public C14781i(zy2<? super C14781i> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14781i c14781i = new C14781i(zy2Var);
            c14781i.f95383b = obj;
            return c14781i;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb EnumC14777e enumC14777e, @gib zy2<? super Boolean> zy2Var) {
            return ((C14781i) create(enumC14777e, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f95382a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(((EnumC14777e) this.f95383b) == EnumC14777e.ShutDown);
        }
    }

    /* JADX INFO: renamed from: wsd$j */
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1646:1\n267#2,4:1647\n237#2,7:1651\n248#2,3:1659\n251#2,2:1663\n272#2,2:1665\n254#2,6:1667\n274#2:1673\n1810#3:1658\n1672#3:1662\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n*L\n1203#1:1647,4\n1203#1:1651,7\n1203#1:1659,3\n1203#1:1663,2\n1203#1:1665,2\n1203#1:1667,6\n1203#1:1673\n1203#1:1658\n1203#1:1662\n*E\n"})
    public static final class C14782j extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ u6b<Object> f95384a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ sz2 f95385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14782j(u6b<Object> u6bVar, sz2 sz2Var) {
            super(0);
            this.f95384a = u6bVar;
            this.f95385b = sz2Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u6b<Object> u6bVar = this.f95384a;
            sz2 sz2Var = this.f95385b;
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
                            sz2Var.recordWriteOf(objArr[(i << 3) + i3]);
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
    }

    /* JADX INFO: renamed from: wsd$k */
    public static final class C14783k extends tt8 implements qy6<Object, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sz2 f95386a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14783k(sz2 sz2Var) {
            super(1);
            this.f95386a = sz2Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Object obj) {
            this.f95386a.recordReadOf(obj);
        }
    }

    /* JADX INFO: renamed from: wsd$l */
    @ck3(m4009c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m4010f = "Recomposer.kt", m4011i = {0, 0}, m4012l = {1054}, m4013m = "invokeSuspend", m4014n = {"callingJob", "unregisterApplyObserver"}, m4015s = {"L$0", "L$1"})
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1646:1\n89#2:1647\n89#2:1654\n33#3,6:1648\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n1050#1:1647\n1059#1:1654\n1052#1:1648,6\n*E\n"})
    public static final class C14784l extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f95387a;

        /* JADX INFO: renamed from: b */
        public int f95388b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f95389c;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kz6<x13, rya, zy2<? super bth>, Object> f95391e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ rya f95392f;

        /* JADX INFO: renamed from: wsd$l$a */
        @ck3(m4009c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", m4010f = "Recomposer.kt", m4011i = {}, m4012l = {t6e.f83825a}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f95393a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f95394b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ kz6<x13, rya, zy2<? super bth>, Object> f95395c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ rya f95396d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kz6<? super x13, ? super rya, ? super zy2<? super bth>, ? extends Object> kz6Var, rya ryaVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f95395c = kz6Var;
                this.f95396d = ryaVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f95395c, this.f95396d, zy2Var);
                aVar.f95394b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f95393a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    x13 x13Var = (x13) this.f95394b;
                    kz6<x13, rya, zy2<? super bth>, Object> kz6Var = this.f95395c;
                    rya ryaVar = this.f95396d;
                    this.f95393a = 1;
                    if (kz6Var.invoke(x13Var, ryaVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: wsd$l$b */
        @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1646:1\n89#2:1647\n48#3,3:1648\n53#3:1679\n55#3:1682\n267#4,4:1651\n237#4,7:1655\n248#4,3:1663\n251#4,2:1667\n272#4:1669\n273#4:1671\n254#4,6:1672\n274#4:1678\n1810#5:1662\n1672#5:1666\n50#6:1670\n1855#7,2:1680\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n1027#1:1647\n1030#1:1648,3\n1030#1:1679\n1030#1:1682\n1030#1:1651,4\n1030#1:1655,7\n1030#1:1663,3\n1030#1:1667,2\n1030#1:1669\n1030#1:1671\n1030#1:1672,6\n1030#1:1678\n1030#1:1662\n1030#1:1666\n1033#1:1670\n1030#1:1680,2\n*E\n"})
        public static final class b extends tt8 implements gz6<Set<? extends Object>, ssf, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ wsd f95397a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wsd wsdVar) {
                super(2);
                this.f95397a = wsdVar;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(Set<? extends Object> set, ssf ssfVar) {
                invoke2(set, ssfVar);
                return bth.f14751a;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:4:0x000d, B:6:0x001f, B:8:0x0028, B:11:0x0038, B:13:0x0048, B:15:0x0054, B:17:0x005d, B:19:0x0066, B:27:0x007f, B:24:0x0078, B:31:0x0089, B:41:0x00b4, B:32:0x008c, B:33:0x0092, B:35:0x0098, B:37:0x00a0, B:40:0x00b0), top: B:50:0x000d }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(@p000.yfb java.util.Set<? extends java.lang.Object> r20, @p000.yfb p000.ssf r21) {
                /*
                    Method dump skipped, instruction units count: 203
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.wsd.C14784l.b.invoke2(java.util.Set, ssf):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14784l(kz6<? super x13, ? super rya, ? super zy2<? super bth>, ? extends Object> kz6Var, rya ryaVar, zy2<? super C14784l> zy2Var) {
            super(2, zy2Var);
            this.f95391e = kz6Var;
            this.f95392f = ryaVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14784l c14784l = wsd.this.new C14784l(this.f95391e, this.f95392f, zy2Var);
            c14784l.f95389c = obj;
            return c14784l;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C14784l) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.wsd.C14784l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: wsd$m */
    @ck3(m4009c = "androidx.compose.runtime.Recomposer", m4010f = "Recomposer.kt", m4011i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m4012l = {921, PDF417Common.MAX_CODEWORDS_IN_BARCODE}, m4013m = "runFrameLoop", m4014n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C14785m extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f95398C;

        /* JADX INFO: renamed from: a */
        public Object f95399a;

        /* JADX INFO: renamed from: b */
        public Object f95400b;

        /* JADX INFO: renamed from: c */
        public Object f95401c;

        /* JADX INFO: renamed from: d */
        public Object f95402d;

        /* JADX INFO: renamed from: e */
        public Object f95403e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f95404f;

        public C14785m(zy2<? super C14785m> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f95404f = obj;
            this.f95398C |= Integer.MIN_VALUE;
            return wsd.this.runFrameLoop(null, null, this);
        }
    }

    /* JADX INFO: renamed from: wsd$n */
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1646:1\n46#2,5:1647\n46#2,3:1652\n50#2:1686\n89#3:1655\n89#3:1685\n33#4,6:1656\n33#4,6:1673\n33#4,6:1679\n460#5,11:1662\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n932#1:1647,5\n942#1:1652,3\n942#1:1686\n947#1:1655\n980#1:1685\n948#1:1656,6\n958#1:1673,6\n973#1:1679,6\n950#1:1662,11\n*E\n"})
    public static final class C14786n extends tt8 implements qy6<Long, dq1<? super bth>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<sz2> f95407b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List<sz2> f95408c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ pdd f95409d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14786n(List<sz2> list, List<sz2> list2, pdd pddVar) {
            super(1);
            this.f95407b = list;
            this.f95408c = list2;
            this.f95409d = pddVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ dq1<? super bth> invoke(Long l) {
            return invoke(l.longValue());
        }

        @gib
        public final dq1<bth> invoke(long j) {
            Object objBeginSection;
            int i;
            dq1<bth> dq1VarDeriveStateLocked;
            if (wsd.this.getHasBroadcastFrameClockAwaiters()) {
                wsd wsdVar = wsd.this;
                q5h q5hVar = q5h.f73293a;
                objBeginSection = q5hVar.beginSection("Recomposer:animation");
                try {
                    wsdVar.f95341c.sendFrame(j);
                    ssf.f82790e.sendApplyNotifications();
                    bth bthVar = bth.f14751a;
                    q5hVar.endSection(objBeginSection);
                } finally {
                }
            }
            wsd wsdVar2 = wsd.this;
            List<sz2> list = this.f95407b;
            List<sz2> list2 = this.f95408c;
            pdd pddVar = this.f95409d;
            objBeginSection = q5h.f73293a.beginSection("Recomposer:recompose");
            try {
                wsdVar2.recordComposerModifications();
                synchronized (wsdVar2.f95342d) {
                    try {
                        List list3 = wsdVar2.f95349k;
                        int size = list3.size();
                        i = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            list2.add((sz2) list3.get(i2));
                        }
                        wsdVar2.f95349k.clear();
                        f7b f7bVar = wsdVar2.f95348j;
                        int size2 = f7bVar.getSize();
                        if (size2 > 0) {
                            Object[] content = f7bVar.getContent();
                            int i3 = 0;
                            do {
                                list.add((sz2) content[i3]);
                                i3++;
                            } while (i3 < size2);
                        }
                        wsdVar2.f95348j.clear();
                        pddVar.takeFrameRequestLocked();
                        bth bthVar2 = bth.f14751a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                u6b u6bVar = new u6b(i, 1, null);
                try {
                    int size3 = list.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        sz2 sz2VarPerformRecompose = wsdVar2.performRecompose(list.get(i4), u6bVar);
                        if (sz2VarPerformRecompose != null) {
                            list2.add(sz2VarPerformRecompose);
                        }
                    }
                    list.clear();
                    if (!list2.isEmpty()) {
                        wsdVar2.f95340b = wsdVar2.getChangeCount() + 1;
                    }
                    try {
                        int size4 = list2.size();
                        while (i < size4) {
                            list2.get(i).applyChanges();
                            i++;
                        }
                        list2.clear();
                        synchronized (wsdVar2.f95342d) {
                            dq1VarDeriveStateLocked = wsdVar2.deriveStateLocked();
                        }
                        return dq1VarDeriveStateLocked;
                    } catch (Throwable th2) {
                        list2.clear();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    list.clear();
                    throw th3;
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: wsd$o */
    @ck3(m4009c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m4010f = "Recomposer.kt", m4011i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m4012l = {574, 585}, m4013m = "invokeSuspend", m4014n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1646:1\n89#2:1647\n89#2:1735\n33#3,6:1648\n33#3,6:1736\n267#4,4:1654\n237#4,7:1658\n248#4,3:1666\n251#4,2:1670\n272#4,2:1672\n254#4,6:1674\n274#4:1680\n267#4,4:1681\n237#4,7:1685\n248#4,3:1693\n251#4,2:1697\n272#4,2:1699\n254#4,6:1701\n274#4:1707\n267#4,4:1708\n237#4,7:1712\n248#4,3:1720\n251#4,2:1724\n272#4,2:1726\n254#4,6:1728\n274#4:1734\n1810#5:1665\n1672#5:1669\n1810#5:1692\n1672#5:1696\n1810#5:1719\n1672#5:1723\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n536#1:1647\n567#1:1735\n540#1:1648,6\n568#1:1736,6\n546#1:1654,4\n546#1:1658,7\n546#1:1666,3\n546#1:1670,2\n546#1:1672,2\n546#1:1674,6\n546#1:1680\n552#1:1681,4\n552#1:1685,7\n552#1:1693,3\n552#1:1697,2\n552#1:1699,2\n552#1:1701,6\n552#1:1707\n557#1:1708,4\n557#1:1712,7\n557#1:1720,3\n557#1:1724,2\n557#1:1726,2\n557#1:1728,6\n557#1:1734\n546#1:1665\n546#1:1669\n552#1:1692\n552#1:1696\n557#1:1719\n557#1:1723\n*E\n"})
    public static final class C14787o extends ugg implements kz6<x13, rya, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public Object f95410C;

        /* JADX INFO: renamed from: F */
        public int f95411F;

        /* JADX INFO: renamed from: H */
        public /* synthetic */ Object f95412H;

        /* JADX INFO: renamed from: a */
        public Object f95414a;

        /* JADX INFO: renamed from: b */
        public Object f95415b;

        /* JADX INFO: renamed from: c */
        public Object f95416c;

        /* JADX INFO: renamed from: d */
        public Object f95417d;

        /* JADX INFO: renamed from: e */
        public Object f95418e;

        /* JADX INFO: renamed from: f */
        public Object f95419f;

        /* JADX INFO: renamed from: m */
        public Object f95420m;

        /* JADX INFO: renamed from: wsd$o$a */
        @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1646:1\n46#2,5:1647\n46#2,3:1652\n50#2:1673\n89#3:1655\n89#3:1674\n89#3:1762\n460#4,11:1656\n838#4,15:1681\n33#5,6:1667\n33#5,6:1675\n33#5,6:1696\n33#5,6:1702\n267#6,4:1708\n237#6,7:1712\n248#6,3:1720\n251#6,2:1724\n272#6,2:1726\n254#6,6:1728\n274#6:1734\n267#6,4:1735\n237#6,7:1739\n248#6,3:1747\n251#6,2:1751\n272#6,2:1753\n254#6,6:1755\n274#6:1761\n1810#7:1719\n1672#7:1723\n1810#7:1746\n1672#7:1750\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n*L\n589#1:1647,5\n599#1:1652,3\n599#1:1673\n603#1:1655\n634#1:1674\n725#1:1762\n604#1:1656,11\n647#1:1681,15\n615#1:1667,6\n635#1:1675,6\n681#1:1696,6\n684#1:1702,6\n699#1:1708,4\n699#1:1712,7\n699#1:1720,3\n699#1:1724,2\n699#1:1726,2\n699#1:1728,6\n699#1:1734\n713#1:1735,4\n713#1:1739,7\n713#1:1747,3\n713#1:1751,2\n713#1:1753,2\n713#1:1755,6\n713#1:1761\n699#1:1719\n699#1:1723\n713#1:1746\n713#1:1750\n*E\n"})
        public static final class a extends tt8 implements qy6<Long, bth> {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ u6b<sz2> f95421C;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ Set<Object> f95422F;

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ wsd f95423a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ u6b<Object> f95424b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ u6b<sz2> f95425c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ List<sz2> f95426d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ List<i0b> f95427e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ u6b<sz2> f95428f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ List<sz2> f95429m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wsd wsdVar, u6b<Object> u6bVar, u6b<sz2> u6bVar2, List<sz2> list, List<i0b> list2, u6b<sz2> u6bVar3, List<sz2> list3, u6b<sz2> u6bVar4, Set<? extends Object> set) {
                super(1);
                this.f95423a = wsdVar;
                this.f95424b = u6bVar;
                this.f95425c = u6bVar2;
                this.f95426d = list;
                this.f95427e = list2;
                this.f95428f = u6bVar3;
                this.f95429m = list3;
                this.f95421C = u6bVar4;
                this.f95422F = set;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Long l) throws Throwable {
                invoke(l.longValue());
                return bth.f14751a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:205:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:218:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:222:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x01a2  */
            /* JADX WARN: Type inference failed for: r0v30, types: [q5h] */
            /* JADX WARN: Type inference failed for: r0v64, types: [q5h] */
            /* JADX WARN: Type inference failed for: r1v0, types: [wsd$o$a] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v5 */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [q5h] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v33 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke(long r28) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 893
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.wsd.C14787o.a.invoke(long):void");
            }
        }

        public C14787o(zy2<? super C14787o> zy2Var) {
            super(3, zy2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void invokeSuspend$clearRecompositionState(p000.wsd r23, java.util.List<p000.sz2> r24, java.util.List<p000.i0b> r25, java.util.List<p000.sz2> r26, p000.u6b<p000.sz2> r27, p000.u6b<p000.sz2> r28, p000.u6b<java.lang.Object> r29, p000.u6b<p000.sz2> r30) {
            /*
                Method dump skipped, instruction units count: 326
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.wsd.C14787o.invokeSuspend$clearRecompositionState(wsd, java.util.List, java.util.List, java.util.List, u6b, u6b, u6b, u6b):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$fillToInsert(List<i0b> list, wsd wsdVar) {
            list.clear();
            synchronized (wsdVar.f95342d) {
                try {
                    List list2 = wsdVar.f95350l;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        list.add((i0b) list2.get(i));
                    }
                    wsdVar.f95350l.clear();
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.kz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @yfb rya ryaVar, @gib zy2<? super bth> zy2Var) {
            C14787o c14787o = wsd.this.new C14787o(zy2Var);
            c14787o.f95412H = ryaVar;
            return c14787o.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0139 -> B:23:0x0142). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0151 -> B:24:0x014d). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.wsd.C14787o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: wsd$p */
    @ck3(m4009c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", m4010f = "Recomposer.kt", m4011i = {0, 0, 0, 1}, m4012l = {890, Videoio.CAP_OPENNI_ASUS, 911}, m4013m = "invokeSuspend", m4014n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, m4015s = {"L$0", "L$1", "L$2", "L$0"})
    @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1646:1\n33#2,7:1647\n485#3:1654\n486#3,6:1656\n492#3,2:1666\n495#3:1669\n496#3,7:1682\n89#4:1655\n89#4:1677\n89#4:1689\n33#5,4:1662\n38#5:1668\n460#6,7:1670\n467#6,4:1678\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n880#1:1647,7\n893#1:1654\n893#1:1656,6\n893#1:1666,2\n893#1:1669\n893#1:1682,7\n893#1:1655\n894#1:1677\n906#1:1689\n893#1:1662,4\n893#1:1668\n893#1:1670,7\n893#1:1678,4\n*E\n"})
    public static final class C14788p extends ugg implements kz6<x13, rya, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f95430a;

        /* JADX INFO: renamed from: b */
        public int f95431b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f95432c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f95433d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ e13 f95434e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ wsd f95435f;

        /* JADX INFO: renamed from: wsd$p$a */
        @ck3(m4009c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", m4010f = "Recomposer.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1646:1\n89#2:1647\n1#3:1648\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n*L\n899#1:1647\n*E\n"})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f95436a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ wsd f95437b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ sz2 f95438c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wsd wsdVar, sz2 sz2Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f95437b = wsdVar;
                this.f95438c = sz2Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f95437b, this.f95438c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                dq1 dq1VarDeriveStateLocked;
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f95436a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                sz2 sz2VarPerformRecompose = this.f95437b.performRecompose(this.f95438c, null);
                Object obj2 = this.f95437b.f95342d;
                wsd wsdVar = this.f95437b;
                synchronized (obj2) {
                    if (sz2VarPerformRecompose != null) {
                        try {
                            wsdVar.f95349k.add(sz2VarPerformRecompose);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    wsdVar.f95356r--;
                    dq1VarDeriveStateLocked = wsdVar.deriveStateLocked();
                }
                if (dq1VarDeriveStateLocked != null) {
                    v7e.C13927a c13927a = v7e.f90266b;
                    dq1VarDeriveStateLocked.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
                }
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: wsd$p$b */
        @ck3(m4009c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1", m4010f = "Recomposer.kt", m4011i = {}, m4012l = {888}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f95439a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ wsd f95440b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ rya f95441c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ pdd f95442d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wsd wsdVar, rya ryaVar, pdd pddVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f95440b = wsdVar;
                this.f95441c = ryaVar;
                this.f95442d = pddVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f95440b, this.f95441c, this.f95442d, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f95439a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    wsd wsdVar = this.f95440b;
                    rya ryaVar = this.f95441c;
                    pdd pddVar = this.f95442d;
                    this.f95439a = 1;
                    if (wsdVar.runFrameLoop(ryaVar, pddVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14788p(e13 e13Var, wsd wsdVar, zy2<? super C14788p> zy2Var) {
            super(3, zy2Var);
            this.f95434e = e13Var;
            this.f95435f = wsdVar;
        }

        @Override // p000.kz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @yfb rya ryaVar, @gib zy2<? super bth> zy2Var) {
            C14788p c14788p = new C14788p(this.f95434e, this.f95435f, zy2Var);
            c14788p.f95432c = x13Var;
            c14788p.f95433d = ryaVar;
            return c14788p.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01ba A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bc -> B:12:0x003a). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.wsd.C14788p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: wsd$q */
    public static final class C14789q extends tt8 implements qy6<Object, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sz2 f95443a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ u6b<Object> f95444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14789q(sz2 sz2Var, u6b<Object> u6bVar) {
            super(1);
            this.f95443a = sz2Var;
            this.f95444b = u6bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Object obj) {
            this.f95443a.recordWriteOf(obj);
            u6b<Object> u6bVar = this.f95444b;
            if (u6bVar != null) {
                u6bVar.add(obj);
            }
        }
    }

    public wsd(@yfb e13 e13Var) {
        yd1 yd1Var = new yd1(new C14779g());
        this.f95341c = yd1Var;
        this.f95342d = new Object();
        this.f95345g = new ArrayList();
        this.f95347i = new u6b<>(0, 1, null);
        this.f95348j = new f7b<>(new sz2[16], 0);
        this.f95349k = new ArrayList();
        this.f95350l = new ArrayList();
        this.f95351m = new LinkedHashMap();
        this.f95352n = new LinkedHashMap();
        this.f95360v = n2g.MutableStateFlow(EnumC14777e.Inactive);
        jg2 jg2VarJob = oj8.Job((jj8) e13Var.get(jj8.f50715A));
        jg2VarJob.invokeOnCompletion(new C14780h());
        this.f95361w = jg2VarJob;
        this.f95362x = e13Var.plus(yd1Var).plus(jg2VarJob);
        this.f95363y = new C14776d();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24808a(wsd wsdVar, Exception exc, sz2 sz2Var, boolean z, int i, Object obj) throws Exception {
        if ((i & 2) != 0) {
            sz2Var = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        wsdVar.processCompositionError(exc, sz2Var, z);
    }

    private final void addKnownCompositionLocked(sz2 sz2Var) {
        this.f95345g.add(sz2Var);
        this.f95346h = null;
    }

    private final void applyAndCheck(w6b w6bVar) {
        try {
            if (w6bVar.apply() instanceof usf.C13694a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            w6bVar.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(zy2<? super bth> zy2Var) {
        fq1 fq1Var;
        if (getHasSchedulingWork()) {
            return bth.f14751a;
        }
        fq1 fq1Var2 = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var2.initCancellability();
        synchronized (this.f95342d) {
            if (getHasSchedulingWork()) {
                fq1Var = fq1Var2;
            } else {
                this.f95355q = fq1Var2;
                fq1Var = null;
            }
        }
        if (fq1Var != null) {
            v7e.C13927a c13927a = v7e.f90266b;
            fq1Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
        Object result = fq1Var2.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    private final void clearKnownCompositionsLocked() {
        this.f95345g.clear();
        this.f95346h = l82.emptyList();
    }

    private final <T> T composing(sz2 sz2Var, u6b<Object> u6bVar, ny6<? extends T> ny6Var) {
        w6b w6bVarTakeMutableSnapshot = ssf.f82790e.takeMutableSnapshot(readObserverOf(sz2Var), writeObserverOf(sz2Var, u6bVar));
        try {
            ssf ssfVarMakeCurrent = w6bVarTakeMutableSnapshot.makeCurrent();
            try {
                return ny6Var.invoke();
            } finally {
                o28.finallyStart(1);
                w6bVarTakeMutableSnapshot.restoreCurrent(ssfVarMakeCurrent);
                o28.finallyEnd(1);
            }
        } finally {
            o28.finallyStart(1);
            applyAndCheck(w6bVarTakeMutableSnapshot);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dq1<bth> deriveStateLocked() {
        EnumC14777e enumC14777e;
        int i = 0;
        int i2 = 1;
        jt3 jt3Var = null;
        if (this.f95360v.getValue().compareTo(EnumC14777e.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.f95347i = new u6b<>(i, i2, jt3Var);
            this.f95348j.clear();
            this.f95349k.clear();
            this.f95350l.clear();
            this.f95353o = null;
            dq1<? super bth> dq1Var = this.f95355q;
            if (dq1Var != null) {
                dq1.C4906a.cancel$default(dq1Var, null, 1, null);
            }
            this.f95355q = null;
            this.f95358t = null;
            return null;
        }
        if (this.f95358t != null) {
            enumC14777e = EnumC14777e.Inactive;
        } else if (this.f95343e == null) {
            this.f95347i = new u6b<>(i, i2, jt3Var);
            this.f95348j.clear();
            enumC14777e = getHasBroadcastFrameClockAwaitersLocked() ? EnumC14777e.InactivePendingWork : EnumC14777e.Inactive;
        } else {
            enumC14777e = (this.f95348j.isNotEmpty() || this.f95347i.isNotEmpty() || !this.f95349k.isEmpty() || !this.f95350l.isEmpty() || this.f95356r > 0 || getHasBroadcastFrameClockAwaitersLocked()) ? EnumC14777e.PendingWork : EnumC14777e.Idle;
        }
        this.f95360v.setValue(enumC14777e);
        if (enumC14777e != EnumC14777e.PendingWork) {
            return null;
        }
        dq1 dq1Var2 = this.f95355q;
        this.f95355q = null;
        return dq1Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i;
        List listEmptyList;
        synchronized (this.f95342d) {
            try {
                if (this.f95351m.isEmpty()) {
                    listEmptyList = l82.emptyList();
                } else {
                    List listFlatten = m82.flatten(this.f95351m.values());
                    this.f95351m.clear();
                    listEmptyList = new ArrayList(listFlatten.size());
                    int size = listFlatten.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        i0b i0bVar = (i0b) listFlatten.get(i2);
                        listEmptyList.add(vkh.m24050to(i0bVar, this.f95352n.get(i0bVar)));
                    }
                    this.f95352n.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = listEmptyList.size();
        for (i = 0; i < size2; i++) {
            scc sccVar = (scc) listEmptyList.get(i);
            i0b i0bVar2 = (i0b) sccVar.component1();
            h0b h0bVar = (h0b) sccVar.component2();
            if (h0bVar != null) {
                i0bVar2.getComposition$runtime_release().disposeUnusedMovableContent(h0bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.f95342d) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.f95359u && this.f95341c.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.f95349k.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.f95348j.isNotEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getHasSchedulingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f95342d
            monitor-enter(r0)
            u6b<java.lang.Object> r1 = r2.f95347i     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            f7b<sz2> r1 = r2.f95348j     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            r1 = 0
            goto L1f
        L1c:
            r1 = move-exception
            goto L21
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r0)
            return r1
        L21:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsd.getHasSchedulingWork():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<sz2> getKnownCompositions() {
        List list = this.f95346h;
        List list2 = list;
        if (list == null) {
            List<sz2> list3 = this.f95345g;
            List listEmptyList = list3.isEmpty() ? l82.emptyList() : new ArrayList(list3);
            this.f95346h = listEmptyList;
            list2 = listEmptyList;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.f95342d) {
            z = this.f95357s;
        }
        if (z) {
            Iterator<jj8> it = this.f95361w.getChildren().iterator();
            while (it.hasNext()) {
                if (it.next().isActive()) {
                }
            }
            return false;
        }
        return true;
    }

    @q64(message = "Replaced by currentState as a StateFlow", replaceWith = @i2e(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    private final void performInitialMovableContentInserts(sz2 sz2Var) {
        synchronized (this.f95342d) {
            List<i0b> list = this.f95350l;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (md8.areEqual(list.get(i).getComposition$runtime_release(), sz2Var)) {
                    bth bthVar = bth.f14751a;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, sz2Var);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, sz2Var);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<i0b> list, wsd wsdVar, sz2 sz2Var) {
        list.clear();
        synchronized (wsdVar.f95342d) {
            try {
                Iterator<i0b> it = wsdVar.f95350l.iterator();
                while (it.hasNext()) {
                    i0b next = it.next();
                    if (md8.areEqual(next.getComposition$runtime_release(), sz2Var)) {
                        list.add(next);
                        it.remove();
                    }
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        r1 = r7.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (r6 >= r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r7.get(r6).getSecond() == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (r8 >= r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r9 = r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        if (r9.getSecond() != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        r9 = r9.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r9 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        r6 = r13.f95342d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        p000.q82.addAll(r13.f95350l, r1);
        r1 = p000.bth.f14751a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (r8 >= r6) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        r9 = r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        if (r9.getSecond() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0128, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<p000.sz2> performInsertValues(java.util.List<p000.i0b> r14, p000.u6b<java.lang.Object> r15) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsd.performInsertValues(java.util.List, u6b):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sz2 performRecompose(sz2 sz2Var, u6b<Object> u6bVar) {
        Set<sz2> set;
        if (sz2Var.isComposing() || sz2Var.isDisposed() || ((set = this.f95354p) != null && set.contains(sz2Var))) {
            return null;
        }
        w6b w6bVarTakeMutableSnapshot = ssf.f82790e.takeMutableSnapshot(readObserverOf(sz2Var), writeObserverOf(sz2Var, u6bVar));
        try {
            ssf ssfVarMakeCurrent = w6bVarTakeMutableSnapshot.makeCurrent();
            if (u6bVar != null) {
                try {
                    if (u6bVar.isNotEmpty()) {
                        sz2Var.prepareCompose(new C14782j(u6bVar, sz2Var));
                    }
                } catch (Throwable th) {
                    w6bVarTakeMutableSnapshot.restoreCurrent(ssfVarMakeCurrent);
                    throw th;
                }
            }
            boolean zRecompose = sz2Var.recompose();
            w6bVarTakeMutableSnapshot.restoreCurrent(ssfVarMakeCurrent);
            if (zRecompose) {
                return sz2Var;
            }
            return null;
        } finally {
            applyAndCheck(w6bVarTakeMutableSnapshot);
        }
    }

    private final void processCompositionError(Exception exc, sz2 sz2Var, boolean z) throws Exception {
        int i = 0;
        if (!f95338C.get().booleanValue() || (exc instanceof ql2)) {
            synchronized (this.f95342d) {
                C14775c c14775c = this.f95358t;
                if (c14775c != null) {
                    throw c14775c.getCause();
                }
                this.f95358t = new C14775c(false, exc);
                bth bthVar = bth.f14751a;
            }
            throw exc;
        }
        synchronized (this.f95342d) {
            try {
                C1851be.logError("Error was captured in composition while live edit was enabled.", exc);
                this.f95349k.clear();
                this.f95348j.clear();
                this.f95347i = new u6b<>(i, 1, null);
                this.f95350l.clear();
                this.f95351m.clear();
                this.f95352n.clear();
                this.f95358t = new C14775c(z, exc);
                if (sz2Var != null) {
                    recordFailedCompositionLocked(sz2Var);
                }
                deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final qy6<Object, bth> readObserverOf(sz2 sz2Var) {
        return new C14783k(sz2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(kz6<? super x13, ? super rya, ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super bth> zy2Var) {
        Object objWithContext = dg1.withContext(this.f95341c, new C14784l(kz6Var, sya.getMonotonicFrameClock(zy2Var.getContext()), null), zy2Var);
        return objWithContext == pd8.getCOROUTINE_SUSPENDED() ? objWithContext : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<sz2> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.f95342d) {
            if (this.f95347i.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            Set<? extends Object> setWrapIntoSet = goe.wrapIntoSet(this.f95347i);
            jt3 jt3Var = null;
            int i = 1;
            int i2 = 0;
            this.f95347i = new u6b<>(i2, i, jt3Var);
            synchronized (this.f95342d) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i3 = 0; i3 < size; i3++) {
                    knownCompositions.get(i3).recordModificationsOf(setWrapIntoSet);
                    if (this.f95360v.getValue().compareTo(EnumC14777e.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f95342d) {
                    this.f95347i = new u6b<>(i2, i, jt3Var);
                    bth bthVar = bth.f14751a;
                }
                synchronized (this.f95342d) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.f95342d) {
                    this.f95347i.addAll(setWrapIntoSet);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(sz2 sz2Var) {
        List arrayList = this.f95353o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f95353o = arrayList;
        }
        if (!arrayList.contains(sz2Var)) {
            arrayList.add(sz2Var);
        }
        removeKnownCompositionLocked(sz2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(jj8 jj8Var) {
        synchronized (this.f95342d) {
            Throwable th = this.f95344f;
            if (th != null) {
                throw th;
            }
            if (this.f95360v.getValue().compareTo(EnumC14777e.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.f95343e != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.f95343e = jj8Var;
            deriveStateLocked();
        }
    }

    private final void removeKnownCompositionLocked(sz2 sz2Var) {
        this.f95345g.remove(sz2Var);
        this.f95346h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C14775c resetErrorState() {
        C14775c c14775c;
        synchronized (this.f95342d) {
            c14775c = this.f95358t;
            if (c14775c != null) {
                this.f95358t = null;
                deriveStateLocked();
            }
        }
        return c14775c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<sz2> list;
        int i;
        synchronized (this.f95342d) {
            list = this.f95353o;
            this.f95353o = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                sz2 sz2Var = (sz2) q82.removeLast(list);
                if (sz2Var instanceof hn2) {
                    sz2Var.invalidateAll();
                    sz2Var.setContent(((hn2) sz2Var).getComposable());
                    if (this.f95358t != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.f95342d) {
                        try {
                            int size = list.size();
                            while (i < size) {
                                recordFailedCompositionLocked(list.get(i));
                                i++;
                            }
                            bth bthVar = bth.f14751a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f95342d) {
            try {
                int size2 = list.size();
                while (i < size2) {
                    recordFailedCompositionLocked(list.get(i));
                    i++;
                }
                bth bthVar2 = bth.f14751a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runFrameLoop(p000.rya r8, p000.pdd r9, p000.zy2<? super p000.bth> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p000.wsd.C14785m
            if (r0 == 0) goto L13
            r0 = r10
            wsd$m r0 = (p000.wsd.C14785m) r0
            int r1 = r0.f95398C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95398C = r1
            goto L18
        L13:
            wsd$m r0 = new wsd$m
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f95404f
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f95398C
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.f95403e
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f95402d
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f95401c
            pdd r2 = (p000.pdd) r2
            java.lang.Object r5 = r0.f95400b
            rya r5 = (p000.rya) r5
            java.lang.Object r6 = r0.f95399a
            wsd r6 = (p000.wsd) r6
            p000.y7e.throwOnFailure(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.f95403e
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f95402d
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f95401c
            pdd r2 = (p000.pdd) r2
            java.lang.Object r5 = r0.f95400b
            rya r5 = (p000.rya) r5
            java.lang.Object r6 = r0.f95399a
            wsd r6 = (p000.wsd) r6
            p000.y7e.throwOnFailure(r10)
            goto L8d
        L65:
            p000.y7e.throwOnFailure(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.f95342d
            r0.f95399a = r5
            r0.f95400b = r8
            r0.f95401c = r9
            r0.f95402d = r10
            r0.f95403e = r2
            r0.f95398C = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L88
            return r1
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            wsd$n r10 = new wsd$n
            r10.<init>(r9, r8, r2)
            r0.f95399a = r6
            r0.f95400b = r5
            r0.f95401c = r2
            r0.f95402d = r9
            r0.f95403e = r8
            r0.f95398C = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsd.runFrameLoop(rya, pdd, zy2):java.lang.Object");
    }

    private final qy6<Object, bth> writeObserverOf(sz2 sz2Var, u6b<Object> u6bVar) {
        return new C14789q(sz2Var, u6bVar);
    }

    @yfb
    public final ysd asRecomposerInfo() {
        return this.f95363y;
    }

    @gib
    public final Object awaitIdle(@yfb zy2<? super bth> zy2Var) {
        Object objCollect = c76.collect(c76.takeWhile(getCurrentState(), new C14778f(null)), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    public final void cancel() {
        synchronized (this.f95342d) {
            try {
                if (this.f95360v.getValue().compareTo(EnumC14777e.Idle) >= 0) {
                    this.f95360v.setValue(EnumC14777e.ShuttingDown);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
        jj8.C7916a.cancel$default((jj8) this.f95361w, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.f95361w.complete()) {
            synchronized (this.f95342d) {
                this.f95357s = true;
                bth bthVar = bth.f14751a;
            }
        }
    }

    @Override // p000.dn2
    @ik2(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@yfb sz2 sz2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var) throws Exception {
        boolean zIsComposing = sz2Var.isComposing();
        try {
            ssf.C12771a c12771a = ssf.f82790e;
            w6b w6bVarTakeMutableSnapshot = c12771a.takeMutableSnapshot(readObserverOf(sz2Var), writeObserverOf(sz2Var, null));
            try {
                ssf ssfVarMakeCurrent = w6bVarTakeMutableSnapshot.makeCurrent();
                try {
                    sz2Var.composeContent(gz6Var);
                    bth bthVar = bth.f14751a;
                    if (!zIsComposing) {
                        c12771a.notifyObjectsInitialized();
                    }
                    synchronized (this.f95342d) {
                        if (this.f95360v.getValue().compareTo(EnumC14777e.ShuttingDown) > 0 && !getKnownCompositions().contains(sz2Var)) {
                            addKnownCompositionLocked(sz2Var);
                        }
                    }
                    try {
                        performInitialMovableContentInserts(sz2Var);
                        try {
                            sz2Var.applyChanges();
                            sz2Var.applyLateChanges();
                            if (zIsComposing) {
                                return;
                            }
                            c12771a.notifyObjectsInitialized();
                        } catch (Exception e) {
                            m24808a(this, e, null, false, 6, null);
                        }
                    } catch (Exception e2) {
                        processCompositionError(e2, sz2Var, true);
                    }
                } finally {
                    w6bVarTakeMutableSnapshot.restoreCurrent(ssfVarMakeCurrent);
                }
            } finally {
                applyAndCheck(w6bVarTakeMutableSnapshot);
            }
        } catch (Exception e3) {
            processCompositionError(e3, sz2Var, true);
        }
    }

    @Override // p000.dn2
    public void deletedMovableContent$runtime_release(@yfb i0b i0bVar) {
        synchronized (this.f95342d) {
            zsd.addMultiValue(this.f95351m, i0bVar.getContent$runtime_release(), i0bVar);
        }
    }

    public final long getChangeCount() {
        return this.f95340b;
    }

    @Override // p000.dn2
    public boolean getCollectingCallByInformation$runtime_release() {
        return f95338C.get().booleanValue();
    }

    @Override // p000.dn2
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // p000.dn2
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // p000.dn2
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @yfb
    public final l2g<EnumC14777e> getCurrentState() {
        return this.f95360v;
    }

    @Override // p000.dn2
    @yfb
    public e13 getEffectCoroutineContext() {
        return this.f95362x;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getHasPendingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f95342d
            monitor-enter(r0)
            u6b<java.lang.Object> r1 = r2.f95347i     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L2c
            f7b<sz2> r1 = r2.f95348j     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L2c
            int r1 = r2.f95356r     // Catch: java.lang.Throwable -> L2a
            if (r1 > 0) goto L2c
            java.util.List<sz2> r1 = r2.f95349k     // Catch: java.lang.Throwable -> L2a
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L28
            goto L2c
        L28:
            r1 = 0
            goto L2d
        L2a:
            r1 = move-exception
            goto L2f
        L2c:
            r1 = 1
        L2d:
            monitor-exit(r0)
            return r1
        L2f:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wsd.getHasPendingWork():boolean");
    }

    @Override // p000.dn2
    @yfb
    public e13 getRecomposeCoroutineContext$runtime_release() {
        return a05.f2a;
    }

    @yfb
    public final y56<EnumC14777e> getState() {
        return getCurrentState();
    }

    @Override // p000.dn2
    public void insertMovableContent$runtime_release(@yfb i0b i0bVar) {
        dq1<bth> dq1VarDeriveStateLocked;
        synchronized (this.f95342d) {
            this.f95350l.add(i0bVar);
            dq1VarDeriveStateLocked = deriveStateLocked();
        }
        if (dq1VarDeriveStateLocked != null) {
            v7e.C13927a c13927a = v7e.f90266b;
            dq1VarDeriveStateLocked.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
    }

    @Override // p000.dn2
    public void invalidate$runtime_release(@yfb sz2 sz2Var) {
        dq1<bth> dq1VarDeriveStateLocked;
        synchronized (this.f95342d) {
            if (this.f95348j.contains(sz2Var)) {
                dq1VarDeriveStateLocked = null;
            } else {
                this.f95348j.add(sz2Var);
                dq1VarDeriveStateLocked = deriveStateLocked();
            }
        }
        if (dq1VarDeriveStateLocked != null) {
            v7e.C13927a c13927a = v7e.f90266b;
            dq1VarDeriveStateLocked.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
    }

    @Override // p000.dn2
    public void invalidateScope$runtime_release(@yfb ssd ssdVar) {
        dq1<bth> dq1VarDeriveStateLocked;
        synchronized (this.f95342d) {
            this.f95347i.add(ssdVar);
            dq1VarDeriveStateLocked = deriveStateLocked();
        }
        if (dq1VarDeriveStateLocked != null) {
            v7e.C13927a c13927a = v7e.f90266b;
            dq1VarDeriveStateLocked.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
    }

    @gib
    public final Object join(@yfb zy2<? super bth> zy2Var) {
        Object objFirst = c76.first(getCurrentState(), new C14781i(null), zy2Var);
        return objFirst == pd8.getCOROUTINE_SUSPENDED() ? objFirst : bth.f14751a;
    }

    @Override // p000.dn2
    public void movableContentStateReleased$runtime_release(@yfb i0b i0bVar, @yfb h0b h0bVar) {
        synchronized (this.f95342d) {
            this.f95352n.put(i0bVar, h0bVar);
            bth bthVar = bth.f14751a;
        }
    }

    @Override // p000.dn2
    @gib
    public h0b movableContentStateResolve$runtime_release(@yfb i0b i0bVar) {
        h0b h0bVarRemove;
        synchronized (this.f95342d) {
            h0bVarRemove = this.f95352n.remove(i0bVar);
        }
        return h0bVarRemove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.f95342d) {
            this.f95359u = true;
            bth bthVar = bth.f14751a;
        }
    }

    @Override // p000.dn2
    public void recordInspectionTable$runtime_release(@yfb Set<fn2> set) {
    }

    @Override // p000.dn2
    public void registerComposition$runtime_release(@yfb sz2 sz2Var) {
    }

    @Override // p000.dn2
    public void reportRemovedComposition$runtime_release(@yfb sz2 sz2Var) {
        synchronized (this.f95342d) {
            try {
                Set linkedHashSet = this.f95354p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f95354p = linkedHashSet;
                }
                linkedHashSet.add(sz2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        dq1<bth> dq1VarDeriveStateLocked;
        synchronized (this.f95342d) {
            if (this.f95359u) {
                this.f95359u = false;
                dq1VarDeriveStateLocked = deriveStateLocked();
            } else {
                dq1VarDeriveStateLocked = null;
            }
        }
        if (dq1VarDeriveStateLocked != null) {
            v7e.C13927a c13927a = v7e.f90266b;
            dq1VarDeriveStateLocked.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
    }

    @gib
    public final Object runRecomposeAndApplyChanges(@yfb zy2<? super bth> zy2Var) {
        Object objRecompositionRunner = recompositionRunner(new C14787o(null), zy2Var);
        return objRecompositionRunner == pd8.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : bth.f14751a;
    }

    @gib
    @sg5
    public final Object runRecomposeConcurrentlyAndApplyChanges(@yfb e13 e13Var, @yfb zy2<? super bth> zy2Var) {
        Object objRecompositionRunner = recompositionRunner(new C14788p(e13Var, this, null), zy2Var);
        return objRecompositionRunner == pd8.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : bth.f14751a;
    }

    @Override // p000.dn2
    public void unregisterComposition$runtime_release(@yfb sz2 sz2Var) {
        synchronized (this.f95342d) {
            removeKnownCompositionLocked(sz2Var);
            this.f95348j.remove(sz2Var);
            this.f95349k.remove(sz2Var);
            bth bthVar = bth.f14751a;
        }
    }

    private final void recordComposerModifications(qy6<? super sz2, bth> qy6Var) {
        u6b u6bVar;
        int i;
        synchronized (this.f95342d) {
            int i2 = 1;
            try {
                u6bVar = this.f95347i;
                i = 0;
                if (u6bVar.isNotEmpty()) {
                    this.f95347i = new u6b(i, i2, null);
                }
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        Set<? extends Object> setWrapIntoSet = goe.wrapIntoSet(u6bVar);
        if (!setWrapIntoSet.isEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((sz2) knownCompositions.get(i3)).recordModificationsOf(setWrapIntoSet);
            }
        }
        f7b f7bVar = this.f95348j;
        int size2 = f7bVar.getSize();
        if (size2 > 0) {
            Object[] content = f7bVar.getContent();
            do {
                qy6Var.invoke(content[i]);
                i++;
            } while (i < size2);
        }
        this.f95348j.clear();
        synchronized (this.f95342d) {
            try {
                if (deriveStateLocked() == null) {
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                } else {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                }
            } catch (Throwable th2) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th2;
            }
        }
        o28.finallyEnd(1);
    }
}
