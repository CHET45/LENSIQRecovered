package p000;

import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;
import java.util.Map;
import p000.a78;
import p000.lw8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1962:1\n42#2,7:1963\n1#3:1970\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n*L\n1769#1:1963,7\n*E\n"})
@e0g(parameters = 0)
public final class qw8 {

    /* JADX INFO: renamed from: v */
    public static final int f75983v = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lw8 f75984a;

    /* JADX INFO: renamed from: b */
    public boolean f75985b;

    /* JADX INFO: renamed from: d */
    public boolean f75987d;

    /* JADX INFO: renamed from: e */
    public boolean f75988e;

    /* JADX INFO: renamed from: f */
    public boolean f75989f;

    /* JADX INFO: renamed from: g */
    public boolean f75990g;

    /* JADX INFO: renamed from: h */
    public boolean f75991h;

    /* JADX INFO: renamed from: i */
    public boolean f75992i;

    /* JADX INFO: renamed from: j */
    public int f75993j;

    /* JADX INFO: renamed from: k */
    public int f75994k;

    /* JADX INFO: renamed from: l */
    public boolean f75995l;

    /* JADX INFO: renamed from: m */
    public boolean f75996m;

    /* JADX INFO: renamed from: n */
    public int f75997n;

    /* JADX INFO: renamed from: o */
    public boolean f75998o;

    /* JADX INFO: renamed from: p */
    public boolean f75999p;

    /* JADX INFO: renamed from: q */
    public int f76000q;

    /* JADX INFO: renamed from: s */
    @gib
    public C11723a f76002s;

    /* JADX INFO: renamed from: c */
    @yfb
    public lw8.EnumC9003e f75986c = lw8.EnumC9003e.Idle;

    /* JADX INFO: renamed from: r */
    @yfb
    public final C11724b f76001r = new C11724b();

    /* JADX INFO: renamed from: t */
    public long f76003t = nu2.Constraints$default(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: u */
    @yfb
    public final ny6<bth> f76004u = new C11726d();

    /* JADX INFO: renamed from: qw8$a */
    @dwf({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1962:1\n1207#1:2001\n1208#1,2:2010\n1207#1:2016\n1208#1,2:2025\n1207#1:2090\n1208#1,2:2099\n1187#2,2:1963\n1857#3:1965\n1858#3,6:1974\n1864#3,5:1984\n205#4:1966\n203#4:1989\n203#4:2002\n203#4:2017\n203#4:2031\n203#4:2043\n203#4:2091\n203#4:2105\n203#4:2117\n476#5,7:1967\n483#5,4:1980\n460#5,11:1990\n460#5,7:2003\n467#5,4:2012\n460#5,7:2018\n467#5,4:2027\n460#5,11:2032\n460#5,11:2044\n460#5,7:2092\n467#5,4:2101\n460#5,11:2106\n460#5,11:2118\n42#6,7:2055\n96#6,7:2062\n42#6,7:2069\n96#6,7:2076\n42#6,7:2083\n42#6,7:2129\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n1270#1:2001\n1270#1:2010,2\n1285#1:2016\n1285#1:2025,2\n1670#1:2090\n1670#1:2099,2\n1183#1:1963,2\n1196#1:1965\n1196#1:1974,6\n1196#1:1984,5\n1196#1:1966\n1207#1:1989\n1270#1:2002\n1285#1:2017\n1312#1:2031\n1338#1:2043\n1670#1:2091\n1692#1:2105\n1725#1:2117\n1196#1:1967,7\n1196#1:1980,4\n1207#1:1990,11\n1270#1:2003,7\n1270#1:2012,4\n1285#1:2018,7\n1285#1:2027,4\n1312#1:2032,11\n1338#1:2044,11\n1670#1:2092,7\n1670#1:2101,4\n1692#1:2106,11\n1725#1:2118,11\n1377#1:2055,7\n1404#1:2062,7\n1427#1:2069,7\n1481#1:2076,7\n1651#1:2083,7\n1742#1:2129,7\n*E\n"})
    public final class C11723a extends AbstractC0767t implements rba, InterfaceC12654sm, zza {

        /* JADX INFO: renamed from: L */
        public boolean f76008L;

        /* JADX INFO: renamed from: M */
        public boolean f76009M;

        /* JADX INFO: renamed from: M1 */
        @gib
        public u97 f76010M1;

        /* JADX INFO: renamed from: N */
        public boolean f76011N;

        /* JADX INFO: renamed from: Q */
        @gib
        public ku2 f76012Q;

        /* JADX INFO: renamed from: V1 */
        public boolean f76013V1;

        /* JADX INFO: renamed from: Y */
        public float f76015Y;

        /* JADX INFO: renamed from: Z */
        @gib
        public qy6<? super InterfaceC0736c, bth> f76016Z;

        /* JADX INFO: renamed from: c2 */
        public boolean f76020c2;

        /* JADX INFO: renamed from: f2 */
        public boolean f76023f2;

        /* JADX INFO: renamed from: g2 */
        public boolean f76024g2;

        /* JADX INFO: renamed from: m */
        public boolean f76026m;

        /* JADX INFO: renamed from: C */
        public int f76005C = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: F */
        public int f76006F = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: H */
        @yfb
        public lw8.EnumC9005g f76007H = lw8.EnumC9005g.NotUsed;

        /* JADX INFO: renamed from: X */
        public long f76014X = a78.f545b.m27211getZeronOccac();

        /* JADX INFO: renamed from: Z1 */
        @yfb
        public final AbstractC12150rm f76017Z1 = new jm9(this);

        /* JADX INFO: renamed from: a2 */
        @yfb
        public final f7b<C11723a> f76018a2 = new f7b<>(new C11723a[16], 0);

        /* JADX INFO: renamed from: b2 */
        public boolean f76019b2 = true;

        /* JADX INFO: renamed from: d2 */
        public boolean f76021d2 = true;

        /* JADX INFO: renamed from: e2 */
        @gib
        public Object f76022e2 = getMeasurePassDelegate$ui_release().getParentData();

        /* JADX INFO: renamed from: qw8$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f76027a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f76028b;

            static {
                int[] iArr = new int[lw8.EnumC9003e.values().length];
                try {
                    iArr[lw8.EnumC9003e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lw8.EnumC9003e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lw8.EnumC9003e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[lw8.EnumC9003e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f76027a = iArr;
                int[] iArr2 = new int[lw8.EnumC9005g.values().length];
                try {
                    iArr2[lw8.EnumC9005g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[lw8.EnumC9005g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f76028b = iArr2;
            }
        }

        /* JADX INFO: renamed from: qw8$a$b */
        @dwf({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1962:1\n33#2,6:1963\n33#2,6:1969\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n*L\n1236#1:1963,6\n1243#1:1969,6\n*E\n"})
        public static final class b extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ lm9 f76030b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qw8 f76031c;

            /* JADX INFO: renamed from: qw8$a$b$a */
            public static final class a extends tt8 implements qy6<InterfaceC12654sm, bth> {

                /* JADX INFO: renamed from: a */
                public static final a f76032a = new a();

                public a() {
                    super(1);
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(InterfaceC12654sm interfaceC12654sm) {
                    invoke2(interfaceC12654sm);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb InterfaceC12654sm interfaceC12654sm) {
                    interfaceC12654sm.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                }
            }

            /* JADX INFO: renamed from: qw8$a$b$b, reason: collision with other inner class name */
            public static final class C16508b extends tt8 implements qy6<InterfaceC12654sm, bth> {

                /* JADX INFO: renamed from: a */
                public static final C16508b f76033a = new C16508b();

                public C16508b() {
                    super(1);
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(InterfaceC12654sm interfaceC12654sm) {
                    invoke2(interfaceC12654sm);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb InterfaceC12654sm interfaceC12654sm) {
                    interfaceC12654sm.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(interfaceC12654sm.getAlignmentLines().getUsedDuringParentLayout$ui_release());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(lm9 lm9Var, qw8 qw8Var) {
                super(0);
                this.f76030b = lm9Var;
                this.f76031c = qw8Var;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C11723a.this.clearPlaceOrder();
                C11723a.this.forEachChildAlignmentLinesOwner(a.f76032a);
                lm9 lookaheadDelegate = C11723a.this.getInnerCoordinator().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    boolean zIsPlacingForAlignment$ui_release = lookaheadDelegate.isPlacingForAlignment$ui_release();
                    List<lw8> children$ui_release = this.f76031c.f75984a.getChildren$ui_release();
                    int size = children$ui_release.size();
                    for (int i = 0; i < size; i++) {
                        lm9 lookaheadDelegate2 = children$ui_release.get(i).getOuterCoordinator$ui_release().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            lookaheadDelegate2.setPlacingForAlignment$ui_release(zIsPlacingForAlignment$ui_release);
                        }
                    }
                }
                this.f76030b.getMeasureResult$ui_release().placeChildren();
                lm9 lookaheadDelegate3 = C11723a.this.getInnerCoordinator().getLookaheadDelegate();
                if (lookaheadDelegate3 != null) {
                    lookaheadDelegate3.isPlacingForAlignment$ui_release();
                    List<lw8> children$ui_release2 = this.f76031c.f75984a.getChildren$ui_release();
                    int size2 = children$ui_release2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        lm9 lookaheadDelegate4 = children$ui_release2.get(i2).getOuterCoordinator$ui_release().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.setPlacingForAlignment$ui_release(false);
                        }
                    }
                }
                C11723a.this.checkChildrenPlaceOrderForUpdates();
                C11723a.this.forEachChildAlignmentLinesOwner(C16508b.f76033a);
            }
        }

        /* JADX INFO: renamed from: qw8$a$c */
        public static final class c extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qw8 f76034a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z9c f76035b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f76036c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(qw8 qw8Var, z9c z9cVar, long j) {
                super(0);
                this.f76034a = qw8Var;
                this.f76035b = z9cVar;
                this.f76036c = j;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                lm9 lookaheadDelegate;
                AbstractC0767t.a placementScope = null;
                if (rw8.isOutMostLookaheadRoot(this.f76034a.f75984a)) {
                    heb wrappedBy$ui_release = this.f76034a.getOuterCoordinator().getWrappedBy$ui_release();
                    if (wrappedBy$ui_release != null) {
                        placementScope = wrappedBy$ui_release.getPlacementScope();
                    }
                } else {
                    heb wrappedBy$ui_release2 = this.f76034a.getOuterCoordinator().getWrappedBy$ui_release();
                    if (wrappedBy$ui_release2 != null && (lookaheadDelegate = wrappedBy$ui_release2.getLookaheadDelegate()) != null) {
                        placementScope = lookaheadDelegate.getPlacementScope();
                    }
                }
                if (placementScope == null) {
                    placementScope = this.f76035b.getPlacementScope();
                }
                qw8 qw8Var = this.f76034a;
                long j = this.f76036c;
                lm9 lookaheadDelegate2 = qw8Var.getOuterCoordinator().getLookaheadDelegate();
                md8.checkNotNull(lookaheadDelegate2);
                AbstractC0767t.a.m27711place70tqf50$default(placementScope, lookaheadDelegate2, j, 0.0f, 2, null);
            }
        }

        /* JADX INFO: renamed from: qw8$a$d */
        public static final class d extends tt8 implements qy6<InterfaceC12654sm, bth> {

            /* JADX INFO: renamed from: a */
            public static final d f76037a = new d();

            public d() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(InterfaceC12654sm interfaceC12654sm) {
                invoke2(interfaceC12654sm);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb InterfaceC12654sm interfaceC12654sm) {
                interfaceC12654sm.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
            }
        }

        public C11723a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    C11723a lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    md8.checkNotNull(lookaheadPassDelegate$ui_release);
                    int i2 = lookaheadPassDelegate$ui_release.f76005C;
                    int i3 = lookaheadPassDelegate$ui_release.f76006F;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                    }
                    i++;
                } while (i < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            int i = 0;
            qw8.this.f75993j = 0;
            f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                do {
                    C11723a lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    md8.checkNotNull(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.f76005C = lookaheadPassDelegate$ui_release.f76006F;
                    lookaheadPassDelegate$ui_release.f76006F = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate$ui_release.f76007H == lw8.EnumC9005g.InLayoutBlock) {
                        lookaheadPassDelegate$ui_release.f76007H = lw8.EnumC9005g.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void forEachChildDelegate(qy6<? super C11723a, bth> qy6Var) {
            f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    C11723a lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    md8.checkNotNull(lookaheadPassDelegate$ui_release);
                    qy6Var.invoke(lookaheadPassDelegate$ui_release);
                    i++;
                } while (i < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean zIsPlaced = isPlaced();
            setPlaced(true);
            if (!zIsPlaced && qw8.this.getLookaheadMeasurePending$ui_release()) {
                lw8.requestLookaheadRemeasure$ui_release$default(qw8.this.f75984a, true, false, false, 6, null);
            }
            f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    lw8 lw8Var = content[i];
                    if (lw8Var.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        C11723a lookaheadPassDelegate$ui_release = lw8Var.getLookaheadPassDelegate$ui_release();
                        md8.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                        lw8Var.rescheduleRemeasureOrRelayout$ui_release(lw8Var);
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i = 0;
                setPlaced(false);
                f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
                int size = f7bVar.getSize();
                if (size > 0) {
                    lw8[] content = f7bVar.getContent();
                    do {
                        C11723a lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        md8.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        private final void onBeforeLayoutChildren() {
            lw8 lw8Var = qw8.this.f75984a;
            qw8 qw8Var = qw8.this;
            f7b<lw8> f7bVar = lw8Var.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    lw8 lw8Var2 = content[i];
                    if (lw8Var2.getLookaheadMeasurePending$ui_release() && lw8Var2.getMeasuredByParentInLookahead$ui_release() == lw8.EnumC9005g.InMeasureBlock) {
                        C11723a lookaheadPassDelegate$ui_release = lw8Var2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        md8.checkNotNull(lookaheadPassDelegate$ui_release);
                        ku2 ku2VarM32040getLastLookaheadConstraintsDWUhwKw = lw8Var2.getLayoutDelegate$ui_release().m32040getLastLookaheadConstraintsDWUhwKw();
                        md8.checkNotNull(ku2VarM32040getLastLookaheadConstraintsDWUhwKw);
                        if (lookaheadPassDelegate$ui_release.m32044remeasureBRTryo0(ku2VarM32040getLastLookaheadConstraintsDWUhwKw.m30769unboximpl())) {
                            lw8.requestLookaheadRemeasure$ui_release$default(qw8Var.f75984a, false, false, false, 7, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void onIntrinsicsQueried() {
            lw8.requestLookaheadRemeasure$ui_release$default(qw8.this.f75984a, false, false, false, 7, null);
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            if (parent$ui_release == null || qw8.this.f75984a.getIntrinsicsUsageByParent$ui_release() != lw8.EnumC9005g.NotUsed) {
                return;
            }
            lw8 lw8Var = qw8.this.f75984a;
            int i = a.f76027a[parent$ui_release.getLayoutState$ui_release().ordinal()];
            lw8Var.setIntrinsicsUsageByParent$ui_release(i != 2 ? i != 3 ? parent$ui_release.getIntrinsicsUsageByParent$ui_release() : lw8.EnumC9005g.InLayoutBlock : lw8.EnumC9005g.InMeasureBlock);
        }

        /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
        private final void m32041placeSelfMLgxB_4(long j, float f, qy6<? super InterfaceC0736c, bth> qy6Var, u97 u97Var) {
            if (qw8.this.f75984a.isDeactivated()) {
                g28.throwIllegalArgumentException("place is called on a deactivated node");
            }
            qw8.this.f75986c = lw8.EnumC9003e.LookaheadLayingOut;
            this.f76009M = true;
            this.f76024g2 = false;
            if (!a78.m27200equalsimpl0(j, this.f76014X)) {
                if (qw8.this.getLookaheadCoordinatesAccessedDuringModifierPlacement() || qw8.this.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    qw8.this.f75991h = true;
                }
                notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            z9c z9cVarRequireOwner = pw8.requireOwner(qw8.this.f75984a);
            if (qw8.this.getLookaheadLayoutPending$ui_release() || !isPlaced()) {
                qw8.this.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                bac.observeLayoutModifierSnapshotReads$ui_release$default(z9cVarRequireOwner.getSnapshotObserver(), qw8.this.f75984a, false, new c(qw8.this, z9cVarRequireOwner, j), 2, null);
            } else {
                lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
                md8.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.m30872placeSelfApparentToRealOffsetgyyYBs$ui_release(j);
                onNodePlaced$ui_release();
            }
            this.f76014X = j;
            this.f76015Y = f;
            this.f76016Z = qy6Var;
            this.f76010M1 = u97Var;
            qw8.this.f75986c = lw8.EnumC9003e.Idle;
        }

        private final void trackLookaheadMeasurementByParent(lw8 lw8Var) {
            lw8.EnumC9005g enumC9005g;
            lw8 parent$ui_release = lw8Var.getParent$ui_release();
            if (parent$ui_release == null) {
                this.f76007H = lw8.EnumC9005g.NotUsed;
                return;
            }
            if (!(this.f76007H == lw8.EnumC9005g.NotUsed || lw8Var.getCanMultiMeasure$ui_release())) {
                g28.throwIllegalStateException(rw8.f79933a);
            }
            int i = a.f76027a[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 1 || i == 2) {
                enumC9005g = lw8.EnumC9005g.InMeasureBlock;
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                enumC9005g = lw8.EnumC9005g.InLayoutBlock;
            }
            this.f76007H = enumC9005g;
        }

        @Override // p000.InterfaceC12654sm
        @yfb
        public Map<AbstractC9938nm, Integer> calculateAlignmentLines() {
            if (!this.f76008L) {
                if (qw8.this.getLayoutState$ui_release() == lw8.EnumC9003e.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        qw8.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            lm9 lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            lm9 lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t
        /* JADX INFO: renamed from: d */
        public void mo1210d(long j, float f, @gib qy6<? super InterfaceC0736c, bth> qy6Var) {
            m32041placeSelfMLgxB_4(j, f, qy6Var, null);
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t
        /* JADX INFO: renamed from: e */
        public void mo1211e(long j, float f, @yfb u97 u97Var) {
            m32041placeSelfMLgxB_4(j, f, null, u97Var);
        }

        @Override // p000.InterfaceC12654sm
        public void forEachChildAlignmentLinesOwner(@yfb qy6<? super InterfaceC12654sm, bth> qy6Var) {
            f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    InterfaceC12654sm lookaheadAlignmentLinesOwner$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                    md8.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
                    qy6Var.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i++;
                } while (i < size);
            }
        }

        @Override // p000.aca
        public int get(@yfb AbstractC9938nm abstractC9938nm) {
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == lw8.EnumC9003e.LookaheadMeasuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                lw8 parent$ui_release2 = qw8.this.f75984a.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == lw8.EnumC9003e.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.f76008L = true;
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            int i = lookaheadDelegate.get(abstractC9938nm);
            this.f76008L = false;
            return i;
        }

        @Override // p000.InterfaceC12654sm
        @yfb
        public AbstractC12150rm getAlignmentLines() {
            return this.f76017Z1;
        }

        @yfb
        public final List<C11723a> getChildDelegates$ui_release() {
            qw8.this.f75984a.getChildren$ui_release();
            if (!this.f76019b2) {
                return this.f76018a2.asMutableList();
            }
            lw8 lw8Var = qw8.this.f75984a;
            f7b<C11723a> f7bVar = this.f76018a2;
            f7b<lw8> f7bVar2 = lw8Var.get_children$ui_release();
            int size = f7bVar2.getSize();
            if (size > 0) {
                lw8[] content = f7bVar2.getContent();
                int i = 0;
                do {
                    lw8 lw8Var2 = content[i];
                    if (f7bVar.getSize() <= i) {
                        C11723a lookaheadPassDelegate$ui_release = lw8Var2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        md8.checkNotNull(lookaheadPassDelegate$ui_release);
                        f7bVar.add(lookaheadPassDelegate$ui_release);
                    } else {
                        C11723a lookaheadPassDelegate$ui_release2 = lw8Var2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        md8.checkNotNull(lookaheadPassDelegate$ui_release2);
                        f7bVar.set(i, lookaheadPassDelegate$ui_release2);
                    }
                    i++;
                } while (i < size);
            }
            f7bVar.removeRange(lw8Var.getChildren$ui_release().size(), f7bVar.getSize());
            this.f76019b2 = false;
            return this.f76018a2.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.f76019b2;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.f76008L;
        }

        @Override // p000.InterfaceC12654sm
        @yfb
        public heb getInnerCoordinator() {
            return qw8.this.f75984a.getInnerCoordinator$ui_release();
        }

        @gib
        /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
        public final ku2 m32042getLastConstraintsDWUhwKw() {
            return this.f76012Q;
        }

        @gib
        public final u97 getLastExplicitLayer$ui_release() {
            return this.f76010M1;
        }

        @gib
        public final qy6<InterfaceC0736c, bth> getLastLayerBlock$ui_release() {
            return this.f76016Z;
        }

        /* JADX INFO: renamed from: getLastPosition-nOcc-ac$ui_release, reason: not valid java name */
        public final long m32043getLastPositionnOccac$ui_release() {
            return this.f76014X;
        }

        public final float getLastZIndex$ui_release() {
            return this.f76015Y;
        }

        public final boolean getLayingOutChildren() {
            return this.f76020c2;
        }

        @yfb
        public final C11724b getMeasurePassDelegate$ui_release() {
            return qw8.this.getMeasurePassDelegate$ui_release();
        }

        @yfb
        public final lw8.EnumC9005g getMeasuredByParent$ui_release() {
            return this.f76007H;
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t, p000.aca
        public int getMeasuredHeight() {
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t, p000.aca
        public int getMeasuredWidth() {
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // p000.InterfaceC12654sm
        @gib
        public InterfaceC12654sm getParentAlignmentLinesOwner() {
            qw8 layoutDelegate$ui_release;
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
        }

        @Override // p000.aca, p000.ed8
        @gib
        public Object getParentData() {
            return this.f76022e2;
        }

        public final int getPlaceOrder$ui_release() {
            return this.f76006F;
        }

        public final boolean getPlacedOnce$ui_release() {
            return this.f76009M;
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            lw8 lw8Var;
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            lw8.EnumC9005g intrinsicsUsageByParent$ui_release = qw8.this.f75984a.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release == null || intrinsicsUsageByParent$ui_release == lw8.EnumC9005g.NotUsed) {
                return;
            }
            do {
                lw8Var = parent$ui_release;
                if (lw8Var.getIntrinsicsUsageByParent$ui_release() != intrinsicsUsageByParent$ui_release) {
                    break;
                } else {
                    parent$ui_release = lw8Var.getParent$ui_release();
                }
            } while (parent$ui_release != null);
            int i = a.f76028b[intrinsicsUsageByParent$ui_release.ordinal()];
            if (i == 1) {
                if (lw8Var.getLookaheadRoot$ui_release() != null) {
                    lw8.requestLookaheadRemeasure$ui_release$default(lw8Var, z, false, false, 6, null);
                    return;
                } else {
                    lw8.requestRemeasure$ui_release$default(lw8Var, z, false, false, 6, null);
                    return;
                }
            }
            if (i != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (lw8Var.getLookaheadRoot$ui_release() != null) {
                lw8Var.requestLookaheadRelayout$ui_release(z);
            } else {
                lw8Var.requestRelayout$ui_release(z);
            }
        }

        public final void invalidateParentData() {
            this.f76021d2 = true;
        }

        @Override // p000.InterfaceC12654sm
        public boolean isPlaced() {
            return this.f76013V1;
        }

        @Override // p000.zza
        public boolean isPlacedUnderMotionFrameOfReference() {
            return this.f76023f2;
        }

        @Override // p000.InterfaceC12654sm
        public void layoutChildren() {
            this.f76020c2 = true;
            getAlignmentLines().recalculateQueryOwner();
            if (qw8.this.getLookaheadLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            lm9 lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            if (qw8.this.f75992i || (!this.f76008L && !lookaheadDelegate.isPlacingForAlignment$ui_release() && qw8.this.getLookaheadLayoutPending$ui_release())) {
                qw8.this.f75991h = false;
                lw8.EnumC9003e layoutState$ui_release = qw8.this.getLayoutState$ui_release();
                qw8.this.f75986c = lw8.EnumC9003e.LookaheadLayingOut;
                z9c z9cVarRequireOwner = pw8.requireOwner(qw8.this.f75984a);
                qw8.this.setLookaheadCoordinatesAccessedDuringPlacement(false);
                bac.observeLayoutSnapshotReads$ui_release$default(z9cVarRequireOwner.getSnapshotObserver(), qw8.this.f75984a, false, new b(lookaheadDelegate, qw8.this), 2, null);
                qw8.this.f75986c = layoutState$ui_release;
                if (qw8.this.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui_release()) {
                    requestLayout();
                }
                qw8.this.f75992i = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.f76020c2 = false;
        }

        @Override // p000.ed8
        public int maxIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(i);
        }

        @Override // p000.ed8
        public int maxIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
        @Override // p000.rba
        @p000.yfb
        /* JADX INFO: renamed from: measure-BRTryo0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.compose.p002ui.layout.AbstractC0767t mo27949measureBRTryo0(long r4) {
            /*
                r3 = this;
                qw8 r0 = p000.qw8.this
                lw8 r0 = p000.qw8.access$getLayoutNode$p(r0)
                lw8 r0 = r0.getParent$ui_release()
                r1 = 0
                if (r0 == 0) goto L12
                lw8$e r0 = r0.getLayoutState$ui_release()
                goto L13
            L12:
                r0 = r1
            L13:
                lw8$e r2 = p000.lw8.EnumC9003e.LookaheadMeasuring
                if (r0 == r2) goto L2b
                qw8 r0 = p000.qw8.this
                lw8 r0 = p000.qw8.access$getLayoutNode$p(r0)
                lw8 r0 = r0.getParent$ui_release()
                if (r0 == 0) goto L27
                lw8$e r1 = r0.getLayoutState$ui_release()
            L27:
                lw8$e r0 = p000.lw8.EnumC9003e.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                qw8 r0 = p000.qw8.this
                r1 = 0
                p000.qw8.access$setDetachedFromParentLookaheadPass$p(r0, r1)
            L31:
                qw8 r0 = p000.qw8.this
                lw8 r0 = p000.qw8.access$getLayoutNode$p(r0)
                r3.trackLookaheadMeasurementByParent(r0)
                qw8 r0 = p000.qw8.this
                lw8 r0 = p000.qw8.access$getLayoutNode$p(r0)
                lw8$g r0 = r0.getIntrinsicsUsageByParent$ui_release()
                lw8$g r1 = p000.lw8.EnumC9005g.NotUsed
                if (r0 != r1) goto L51
                qw8 r0 = p000.qw8.this
                lw8 r0 = p000.qw8.access$getLayoutNode$p(r0)
                r0.clearSubtreeIntrinsicsUsage$ui_release()
            L51:
                r3.m32044remeasureBRTryo0(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.qw8.C11723a.mo27949measureBRTryo0(long):androidx.compose.ui.layout.t");
        }

        @Override // p000.ed8
        public int minIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(i);
        }

        @Override // p000.ed8
        public int minIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(i);
        }

        public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
            f7b<lw8> f7bVar;
            int size;
            if (qw8.this.getChildrenAccessingLookaheadCoordinatesDuringPlacement() <= 0 || (size = (f7bVar = qw8.this.f75984a.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                lw8 lw8Var = content[i];
                qw8 layoutDelegate$ui_release = lw8Var.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLookaheadLayoutPending$ui_release()) {
                    lw8.requestLookaheadRelayout$ui_release$default(lw8Var, false, 1, null);
                }
                C11723a lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                if (lookaheadPassDelegate$ui_release != null) {
                    lookaheadPassDelegate$ui_release.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
                }
                i++;
            } while (i < size);
        }

        public final void onNodeDetached() {
            this.f76006F = Integer.MAX_VALUE;
            this.f76005C = Integer.MAX_VALUE;
            setPlaced(false);
        }

        public final void onNodePlaced$ui_release() {
            this.f76024g2 = true;
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            if (!isPlaced()) {
                markNodeAndSubtreeAsPlaced();
                if (this.f76026m && parent$ui_release != null) {
                    lw8.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release == null) {
                this.f76006F = 0;
            } else if (!this.f76026m && (parent$ui_release.getLayoutState$ui_release() == lw8.EnumC9003e.LayingOut || parent$ui_release.getLayoutState$ui_release() == lw8.EnumC9003e.LookaheadLayingOut)) {
                if (!(this.f76006F == Integer.MAX_VALUE)) {
                    g28.throwIllegalStateException("Place was called on a node which was placed already");
                }
                this.f76006F = parent$ui_release.getLayoutDelegate$ui_release().f75993j;
                parent$ui_release.getLayoutDelegate$ui_release().f75993j++;
            }
            layoutChildren();
        }

        /* JADX INFO: renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m32044remeasureBRTryo0(long j) {
            if (qw8.this.f75984a.isDeactivated()) {
                g28.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            qw8.this.f75984a.setCanMultiMeasure$ui_release(qw8.this.f75984a.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
            if (!qw8.this.f75984a.getLookaheadMeasurePending$ui_release()) {
                ku2 ku2Var = this.f76012Q;
                if (ku2Var == null ? false : ku2.m30756equalsimpl0(ku2Var.m30769unboximpl(), j)) {
                    z9c owner$ui_release = qw8.this.f75984a.getOwner$ui_release();
                    if (owner$ui_release != null) {
                        owner$ui_release.forceMeasureTheSubtree(qw8.this.f75984a, true);
                    }
                    qw8.this.f75984a.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
            }
            this.f76012Q = ku2.m30751boximpl(j);
            m1213g(j);
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(d.f76037a);
            long jM1208b = this.f76011N ? m1208b() : s78.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f76011N = true;
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                g28.throwIllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
            }
            qw8.this.m32037performLookaheadMeasureBRTryo0(j);
            m1212f(s78.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
            return (r78.m32087getWidthimpl(jM1208b) == lookaheadDelegate.getWidth() && r78.m32086getHeightimpl(jM1208b) == lookaheadDelegate.getHeight()) ? false : true;
        }

        public final void replace() {
            lw8 parent$ui_release;
            try {
                this.f76026m = true;
                if (!this.f76009M) {
                    g28.throwIllegalStateException("replace() called on item that was not placed");
                }
                this.f76024g2 = false;
                boolean zIsPlaced = isPlaced();
                m32041placeSelfMLgxB_4(this.f76014X, 0.0f, this.f76016Z, this.f76010M1);
                if (zIsPlaced && !this.f76024g2 && (parent$ui_release = qw8.this.f75984a.getParent$ui_release()) != null) {
                    lw8.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
                this.f76026m = false;
            } catch (Throwable th) {
                this.f76026m = false;
                throw th;
            }
        }

        @Override // p000.InterfaceC12654sm
        public void requestLayout() {
            lw8.requestLookaheadRelayout$ui_release$default(qw8.this.f75984a, false, 1, null);
        }

        @Override // p000.InterfaceC12654sm
        public void requestMeasure() {
            lw8.requestLookaheadRemeasure$ui_release$default(qw8.this.f75984a, false, false, false, 7, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.f76019b2 = z;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.f76008L = z;
        }

        public final void setMeasuredByParent$ui_release(@yfb lw8.EnumC9005g enumC9005g) {
            this.f76007H = enumC9005g;
        }

        public final void setPlaceOrder$ui_release(int i) {
            this.f76006F = i;
        }

        public void setPlaced(boolean z) {
            this.f76013V1 = z;
        }

        public final void setPlacedOnce$ui_release(boolean z) {
            this.f76009M = z;
        }

        @Override // p000.zza
        public void setPlacedUnderMotionFrameOfReference(boolean z) {
            lm9 lookaheadDelegate;
            lm9 lookaheadDelegate2 = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            if (!md8.areEqual(Boolean.valueOf(z), lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.isPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate()) != null) {
                lookaheadDelegate.setPlacedUnderMotionFrameOfReference(z);
            }
            this.f76023f2 = z;
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
                md8.checkNotNull(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.f76021d2) {
                return false;
            }
            this.f76021d2 = false;
            lm9 lookaheadDelegate2 = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate2);
            this.f76022e2 = lookaheadDelegate2.getParentData();
            return true;
        }
    }

    /* JADX INFO: renamed from: qw8$b */
    @dwf({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1962:1\n647#1:2008\n648#1,2:2017\n650#1:2023\n647#1:2057\n648#1,2:2066\n650#1:2072\n1187#2,2:1963\n1857#3:1965\n1858#3,6:1974\n1864#3,5:1984\n205#4:1966\n203#4:1989\n1323#4,7:2001\n203#4:2009\n1323#4,7:2024\n203#4:2031\n1311#4,7:2043\n203#4:2058\n203#4:2073\n203#4:2120\n203#4:2132\n203#4:2144\n476#5,7:1967\n483#5,4:1980\n460#5,11:1990\n460#5,7:2010\n467#5,4:2019\n460#5,11:2032\n460#5,7:2059\n467#5,4:2068\n460#5,11:2074\n460#5,11:2121\n460#5,11:2133\n460#5,11:2145\n42#6,7:2050\n96#6,7:2085\n42#6,7:2092\n42#6,7:2099\n96#6,7:2106\n42#6,7:2113\n66#6,9:2156\n66#6,9:2165\n66#6,9:2174\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n505#1:2008\n505#1:2017,2\n505#1:2023\n633#1:2057\n633#1:2066,2\n633#1:2072\n400#1:1963,2\n410#1:1965\n410#1:1974,6\n410#1:1984,5\n410#1:1966\n483#1:1989\n501#1:2001,7\n505#1:2009\n524#1:2024,7\n529#1:2031\n587#1:2043,7\n633#1:2058\n647#1:2073\n980#1:2120\n1006#1:2132\n1042#1:2144\n410#1:1967,7\n410#1:1980,4\n483#1:1990,11\n505#1:2010,7\n505#1:2019,4\n529#1:2032,11\n633#1:2059,7\n633#1:2068,4\n647#1:2074,11\n980#1:2121,11\n1006#1:2133,11\n1042#1:2145,11\n613#1:2050,7\n680#1:2085,7\n719#1:2092,7\n834#1:2099,7\n848#1:2106,7\n887#1:2113,7\n1093#1:2156,9\n1096#1:2165,9\n1114#1:2174,9\n*E\n"})
    public final class C11724b extends AbstractC0767t implements rba, InterfaceC12654sm, zza {

        /* JADX INFO: renamed from: H */
        public boolean f76040H;

        /* JADX INFO: renamed from: L */
        public boolean f76041L;

        /* JADX INFO: renamed from: M1 */
        public boolean f76043M1;

        /* JADX INFO: renamed from: N */
        public boolean f76044N;

        /* JADX INFO: renamed from: Q */
        public long f76045Q;

        /* JADX INFO: renamed from: V1 */
        @gib
        public Object f76046V1;

        /* JADX INFO: renamed from: X */
        @gib
        public qy6<? super InterfaceC0736c, bth> f76047X;

        /* JADX INFO: renamed from: Y */
        @gib
        public u97 f76048Y;

        /* JADX INFO: renamed from: Z */
        public float f76049Z;

        /* JADX INFO: renamed from: Z1 */
        public boolean f76050Z1;

        /* JADX INFO: renamed from: a2 */
        public boolean f76051a2;

        /* JADX INFO: renamed from: b2 */
        @yfb
        public final AbstractC12150rm f76052b2;

        /* JADX INFO: renamed from: c2 */
        @yfb
        public final f7b<C11724b> f76053c2;

        /* JADX INFO: renamed from: d2 */
        public boolean f76054d2;

        /* JADX INFO: renamed from: e2 */
        public boolean f76055e2;

        /* JADX INFO: renamed from: f2 */
        @yfb
        public final ny6<bth> f76056f2;

        /* JADX INFO: renamed from: g2 */
        public float f76057g2;

        /* JADX INFO: renamed from: h2 */
        public boolean f76058h2;

        /* JADX INFO: renamed from: i2 */
        @gib
        public qy6<? super InterfaceC0736c, bth> f76059i2;

        /* JADX INFO: renamed from: j2 */
        @gib
        public u97 f76060j2;

        /* JADX INFO: renamed from: k2 */
        public long f76061k2;

        /* JADX INFO: renamed from: l2 */
        public float f76062l2;

        /* JADX INFO: renamed from: m */
        public boolean f76063m;

        /* JADX INFO: renamed from: m2 */
        @yfb
        public final ny6<bth> f76064m2;

        /* JADX INFO: renamed from: n2 */
        public boolean f76065n2;

        /* JADX INFO: renamed from: o2 */
        public boolean f76066o2;

        /* JADX INFO: renamed from: C */
        public int f76038C = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: F */
        public int f76039F = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: M */
        @yfb
        public lw8.EnumC9005g f76042M = lw8.EnumC9005g.NotUsed;

        /* JADX INFO: renamed from: qw8$b$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f76068a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f76069b;

            static {
                int[] iArr = new int[lw8.EnumC9003e.values().length];
                try {
                    iArr[lw8.EnumC9003e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lw8.EnumC9003e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f76068a = iArr;
                int[] iArr2 = new int[lw8.EnumC9005g.values().length];
                try {
                    iArr2[lw8.EnumC9005g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[lw8.EnumC9005g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f76069b = iArr2;
            }
        }

        /* JADX INFO: renamed from: qw8$b$b */
        public static final class b extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: qw8$b$b$a */
            public static final class a extends tt8 implements qy6<InterfaceC12654sm, bth> {

                /* JADX INFO: renamed from: a */
                public static final a f76071a = new a();

                public a() {
                    super(1);
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(InterfaceC12654sm interfaceC12654sm) {
                    invoke2(interfaceC12654sm);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb InterfaceC12654sm interfaceC12654sm) {
                    interfaceC12654sm.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                }
            }

            /* JADX INFO: renamed from: qw8$b$b$b, reason: collision with other inner class name */
            public static final class C16509b extends tt8 implements qy6<InterfaceC12654sm, bth> {

                /* JADX INFO: renamed from: a */
                public static final C16509b f76072a = new C16509b();

                public C16509b() {
                    super(1);
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(InterfaceC12654sm interfaceC12654sm) {
                    invoke2(interfaceC12654sm);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb InterfaceC12654sm interfaceC12654sm) {
                    interfaceC12654sm.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(interfaceC12654sm.getAlignmentLines().getUsedDuringParentLayout$ui_release());
                }
            }

            public b() {
                super(0);
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C11724b.this.clearPlaceOrder();
                C11724b.this.forEachChildAlignmentLinesOwner(a.f76071a);
                C11724b.this.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
                C11724b.this.checkChildrenPlaceOrderForUpdates();
                C11724b.this.forEachChildAlignmentLinesOwner(C16509b.f76072a);
            }
        }

        /* JADX INFO: renamed from: qw8$b$c */
        public static final class c extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qw8 f76073a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11724b f76074b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(qw8 qw8Var, C11724b c11724b) {
                super(0);
                this.f76073a = qw8Var;
                this.f76074b = c11724b;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AbstractC0767t.a placementScope;
                heb wrappedBy$ui_release = this.f76073a.getOuterCoordinator().getWrappedBy$ui_release();
                if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                    placementScope = pw8.requireOwner(this.f76073a.f75984a).getPlacementScope();
                }
                AbstractC0767t.a aVar = placementScope;
                C11724b c11724b = this.f76074b;
                qw8 qw8Var = this.f76073a;
                qy6<? super InterfaceC0736c, bth> qy6Var = c11724b.f76059i2;
                u97 u97Var = c11724b.f76060j2;
                if (u97Var != null) {
                    aVar.m27726placeWithLayeraW9wM(qw8Var.getOuterCoordinator(), c11724b.f76061k2, u97Var, c11724b.f76062l2);
                } else if (qy6Var == null) {
                    aVar.m27717place70tqf50(qw8Var.getOuterCoordinator(), c11724b.f76061k2, c11724b.f76062l2);
                } else {
                    aVar.m27725placeWithLayeraW9wM(qw8Var.getOuterCoordinator(), c11724b.f76061k2, c11724b.f76062l2, qy6Var);
                }
            }
        }

        /* JADX INFO: renamed from: qw8$b$d */
        public static final class d extends tt8 implements qy6<InterfaceC12654sm, bth> {

            /* JADX INFO: renamed from: a */
            public static final d f76075a = new d();

            public d() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(InterfaceC12654sm interfaceC12654sm) {
                invoke2(interfaceC12654sm);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb InterfaceC12654sm interfaceC12654sm) {
                interfaceC12654sm.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
            }
        }

        public C11724b() {
            a78.C0078a c0078a = a78.f545b;
            this.f76045Q = c0078a.m27211getZeronOccac();
            this.f76043M1 = true;
            this.f76052b2 = new mw8(this);
            this.f76053c2 = new f7b<>(new C11724b[16], 0);
            this.f76054d2 = true;
            this.f76056f2 = new b();
            this.f76061k2 = c0078a.m27211getZeronOccac();
            this.f76064m2 = new c(qw8.this, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            lw8 lw8Var = qw8.this.f75984a;
            f7b<lw8> f7bVar = lw8Var.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    lw8 lw8Var2 = content[i];
                    if (lw8Var2.getMeasurePassDelegate$ui_release().f76038C != lw8Var2.getPlaceOrder$ui_release()) {
                        lw8Var.onZSortedChildrenInvalidated$ui_release();
                        lw8Var.invalidateLayer$ui_release();
                        if (lw8Var2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            lw8Var2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            qw8.this.f75994k = 0;
            f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    C11724b measurePassDelegate$ui_release = content[i].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.f76038C = measurePassDelegate$ui_release.f76039F;
                    measurePassDelegate$ui_release.f76039F = Integer.MAX_VALUE;
                    measurePassDelegate$ui_release.f76051a2 = false;
                    if (measurePassDelegate$ui_release.f76042M == lw8.EnumC9005g.InLayoutBlock) {
                        measurePassDelegate$ui_release.f76042M = lw8.EnumC9005g.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void forEachChildDelegate(qy6<? super C11724b, bth> qy6Var) {
            f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    qy6Var.invoke(content[i].getMeasurePassDelegate$ui_release());
                    i++;
                } while (i < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean zIsPlaced = isPlaced();
            setPlaced$ui_release(true);
            lw8 lw8Var = qw8.this.f75984a;
            if (!zIsPlaced) {
                if (lw8Var.getMeasurePending$ui_release()) {
                    lw8.requestRemeasure$ui_release$default(lw8Var, true, false, false, 6, null);
                } else if (lw8Var.getLookaheadMeasurePending$ui_release()) {
                    lw8.requestLookaheadRemeasure$ui_release$default(lw8Var, true, false, false, 6, null);
                }
            }
            heb wrapped$ui_release = lw8Var.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (heb outerCoordinator$ui_release = lw8Var.getOuterCoordinator$ui_release(); !md8.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            f7b<lw8> f7bVar = lw8Var.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    lw8 lw8Var2 = content[i];
                    if (lw8Var2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        lw8Var2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                        lw8Var.rescheduleRemeasureOrRelayout$ui_release(lw8Var2);
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i = 0;
                setPlaced$ui_release(false);
                lw8 lw8Var = qw8.this.f75984a;
                heb wrapped$ui_release = lw8Var.getInnerCoordinator$ui_release().getWrapped$ui_release();
                for (heb outerCoordinator$ui_release = lw8Var.getOuterCoordinator$ui_release(); !md8.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                    outerCoordinator$ui_release.releaseLayer();
                }
                f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
                int size = f7bVar.getSize();
                if (size > 0) {
                    lw8[] content = f7bVar.getContent();
                    do {
                        content[i].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        private final void onBeforeLayoutChildren() {
            lw8 lw8Var = qw8.this.f75984a;
            qw8 qw8Var = qw8.this;
            f7b<lw8> f7bVar = lw8Var.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    lw8 lw8Var2 = content[i];
                    if (lw8Var2.getMeasurePending$ui_release() && lw8Var2.getMeasuredByParent$ui_release() == lw8.EnumC9005g.InMeasureBlock && lw8.m30904remeasure_Sx5XlM$ui_release$default(lw8Var2, null, 1, null)) {
                        lw8.requestRemeasure$ui_release$default(qw8Var.f75984a, false, false, false, 7, null);
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void onIntrinsicsQueried() {
            lw8.requestRemeasure$ui_release$default(qw8.this.f75984a, false, false, false, 7, null);
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            if (parent$ui_release == null || qw8.this.f75984a.getIntrinsicsUsageByParent$ui_release() != lw8.EnumC9005g.NotUsed) {
                return;
            }
            lw8 lw8Var = qw8.this.f75984a;
            int i = a.f76068a[parent$ui_release.getLayoutState$ui_release().ordinal()];
            lw8Var.setIntrinsicsUsageByParent$ui_release(i != 1 ? i != 2 ? parent$ui_release.getIntrinsicsUsageByParent$ui_release() : lw8.EnumC9005g.InLayoutBlock : lw8.EnumC9005g.InMeasureBlock);
        }

        /* JADX INFO: renamed from: placeOuterCoordinator-MLgxB_4, reason: not valid java name */
        private final void m32045placeOuterCoordinatorMLgxB_4(long j, float f, qy6<? super InterfaceC0736c, bth> qy6Var, u97 u97Var) {
            if (qw8.this.f75984a.isDeactivated()) {
                g28.throwIllegalArgumentException("place is called on a deactivated node");
            }
            qw8.this.f75986c = lw8.EnumC9003e.LayingOut;
            this.f76045Q = j;
            this.f76049Z = f;
            this.f76047X = qy6Var;
            this.f76048Y = u97Var;
            this.f76041L = true;
            this.f76058h2 = false;
            z9c z9cVarRequireOwner = pw8.requireOwner(qw8.this.f75984a);
            if (qw8.this.getLayoutPending$ui_release() || !isPlaced()) {
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                qw8.this.setCoordinatesAccessedDuringModifierPlacement(false);
                this.f76059i2 = qy6Var;
                this.f76061k2 = j;
                this.f76062l2 = f;
                this.f76060j2 = u97Var;
                z9cVarRequireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(qw8.this.f75984a, false, this.f76064m2);
            } else {
                qw8.this.getOuterCoordinator().m30040placeSelfApparentToRealOffsetMLgxB_4(j, f, qy6Var, u97Var);
                onNodePlaced$ui_release();
            }
            qw8.this.f75986c = lw8.EnumC9003e.Idle;
        }

        /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
        private final void m32046placeSelfMLgxB_4(long j, float f, qy6<? super InterfaceC0736c, bth> qy6Var, u97 u97Var) {
            AbstractC0767t.a placementScope;
            this.f76051a2 = true;
            if (!a78.m27200equalsimpl0(j, this.f76045Q) || this.f76065n2) {
                if (qw8.this.getCoordinatesAccessedDuringModifierPlacement() || qw8.this.getCoordinatesAccessedDuringPlacement() || this.f76065n2) {
                    qw8.this.f75988e = true;
                    this.f76065n2 = false;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            if (rw8.isOutMostLookaheadRoot(qw8.this.f75984a)) {
                heb wrappedBy$ui_release = qw8.this.getOuterCoordinator().getWrappedBy$ui_release();
                if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                    placementScope = pw8.requireOwner(qw8.this.f75984a).getPlacementScope();
                }
                AbstractC0767t.a aVar = placementScope;
                qw8 qw8Var = qw8.this;
                C11723a lookaheadPassDelegate$ui_release = qw8Var.getLookaheadPassDelegate$ui_release();
                md8.checkNotNull(lookaheadPassDelegate$ui_release);
                lw8 parent$ui_release = qw8Var.f75984a.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate$ui_release().f75993j = 0;
                }
                lookaheadPassDelegate$ui_release.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                AbstractC0767t.a.place$default(aVar, lookaheadPassDelegate$ui_release, a78.m27201getXimpl(j), a78.m27202getYimpl(j), 0.0f, 4, null);
            }
            C11723a lookaheadPassDelegate$ui_release2 = qw8.this.getLookaheadPassDelegate$ui_release();
            if ((lookaheadPassDelegate$ui_release2 == null || lookaheadPassDelegate$ui_release2.getPlacedOnce$ui_release()) ? false : true) {
                g28.throwIllegalStateException("Error: Placement happened before lookahead.");
            }
            m32045placeOuterCoordinatorMLgxB_4(j, f, qy6Var, u97Var);
        }

        private final void trackMeasurementByParent(lw8 lw8Var) {
            lw8.EnumC9005g enumC9005g;
            lw8 parent$ui_release = lw8Var.getParent$ui_release();
            if (parent$ui_release == null) {
                this.f76042M = lw8.EnumC9005g.NotUsed;
                return;
            }
            if (!(this.f76042M == lw8.EnumC9005g.NotUsed || lw8Var.getCanMultiMeasure$ui_release())) {
                g28.throwIllegalStateException(rw8.f79933a);
            }
            int i = a.f76068a[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 1) {
                enumC9005g = lw8.EnumC9005g.InMeasureBlock;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                enumC9005g = lw8.EnumC9005g.InLayoutBlock;
            }
            this.f76042M = enumC9005g;
        }

        @Override // p000.InterfaceC12654sm
        @yfb
        public Map<AbstractC9938nm, Integer> calculateAlignmentLines() {
            if (!this.f76044N) {
                if (qw8.this.getLayoutState$ui_release() == lw8.EnumC9003e.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        qw8.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t
        /* JADX INFO: renamed from: d */
        public void mo1210d(long j, float f, @gib qy6<? super InterfaceC0736c, bth> qy6Var) {
            m32046placeSelfMLgxB_4(j, f, qy6Var, null);
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t
        /* JADX INFO: renamed from: e */
        public void mo1211e(long j, float f, @yfb u97 u97Var) {
            m32046placeSelfMLgxB_4(j, f, null, u97Var);
        }

        @Override // p000.InterfaceC12654sm
        public void forEachChildAlignmentLinesOwner(@yfb qy6<? super InterfaceC12654sm, bth> qy6Var) {
            f7b<lw8> f7bVar = qw8.this.f75984a.get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    qy6Var.invoke(content[i].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // p000.aca
        public int get(@yfb AbstractC9938nm abstractC9938nm) {
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == lw8.EnumC9003e.Measuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                lw8 parent$ui_release2 = qw8.this.f75984a.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == lw8.EnumC9003e.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.f76044N = true;
            int i = qw8.this.getOuterCoordinator().get(abstractC9938nm);
            this.f76044N = false;
            return i;
        }

        @Override // p000.InterfaceC12654sm
        @yfb
        public AbstractC12150rm getAlignmentLines() {
            return this.f76052b2;
        }

        @yfb
        public final List<C11724b> getChildDelegates$ui_release() {
            qw8.this.f75984a.updateChildrenIfDirty$ui_release();
            if (!this.f76054d2) {
                return this.f76053c2.asMutableList();
            }
            lw8 lw8Var = qw8.this.f75984a;
            f7b<C11724b> f7bVar = this.f76053c2;
            f7b<lw8> f7bVar2 = lw8Var.get_children$ui_release();
            int size = f7bVar2.getSize();
            if (size > 0) {
                lw8[] content = f7bVar2.getContent();
                int i = 0;
                do {
                    lw8 lw8Var2 = content[i];
                    if (f7bVar.getSize() <= i) {
                        f7bVar.add(lw8Var2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                    } else {
                        f7bVar.set(i, lw8Var2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                    }
                    i++;
                } while (i < size);
            }
            f7bVar.removeRange(lw8Var.getChildren$ui_release().size(), f7bVar.getSize());
            this.f76054d2 = false;
            return this.f76053c2.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.f76054d2;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.f76044N;
        }

        @Override // p000.InterfaceC12654sm
        @yfb
        public heb getInnerCoordinator() {
            return qw8.this.f75984a.getInnerCoordinator$ui_release();
        }

        @gib
        /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
        public final ku2 m32047getLastConstraintsDWUhwKw() {
            if (this.f76040H) {
                return ku2.m30751boximpl(m1209c());
            }
            return null;
        }

        public final boolean getLayingOutChildren() {
            return this.f76055e2;
        }

        @yfb
        public final lw8.EnumC9005g getMeasuredByParent$ui_release() {
            return this.f76042M;
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t, p000.aca
        public int getMeasuredHeight() {
            return qw8.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.p002ui.layout.AbstractC0767t, p000.aca
        public int getMeasuredWidth() {
            return qw8.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // p000.InterfaceC12654sm
        @gib
        public InterfaceC12654sm getParentAlignmentLinesOwner() {
            qw8 layoutDelegate$ui_release;
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
        }

        @Override // p000.aca, p000.ed8
        @gib
        public Object getParentData() {
            return this.f76046V1;
        }

        public final int getPlaceOrder$ui_release() {
            return this.f76039F;
        }

        public final int getPreviousPlaceOrder$ui_release() {
            return this.f76038C;
        }

        public final float getZIndex$ui_release() {
            return this.f76057g2;
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            lw8 lw8Var;
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            lw8.EnumC9005g intrinsicsUsageByParent$ui_release = qw8.this.f75984a.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release == null || intrinsicsUsageByParent$ui_release == lw8.EnumC9005g.NotUsed) {
                return;
            }
            do {
                lw8Var = parent$ui_release;
                if (lw8Var.getIntrinsicsUsageByParent$ui_release() != intrinsicsUsageByParent$ui_release) {
                    break;
                } else {
                    parent$ui_release = lw8Var.getParent$ui_release();
                }
            } while (parent$ui_release != null);
            int i = a.f76069b[intrinsicsUsageByParent$ui_release.ordinal()];
            if (i == 1) {
                lw8.requestRemeasure$ui_release$default(lw8Var, z, false, false, 6, null);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                lw8Var.requestRelayout$ui_release(z);
            }
        }

        public final void invalidateParentData() {
            this.f76043M1 = true;
        }

        @Override // p000.InterfaceC12654sm
        public boolean isPlaced() {
            return this.f76050Z1;
        }

        public final boolean isPlacedByParent() {
            return this.f76051a2;
        }

        @Override // p000.zza
        public boolean isPlacedUnderMotionFrameOfReference() {
            return this.f76066o2;
        }

        @Override // p000.InterfaceC12654sm
        public void layoutChildren() {
            this.f76055e2 = true;
            getAlignmentLines().recalculateQueryOwner();
            if (qw8.this.getLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            if (qw8.this.f75989f || (!this.f76044N && !getInnerCoordinator().isPlacingForAlignment$ui_release() && qw8.this.getLayoutPending$ui_release())) {
                qw8.this.f75988e = false;
                lw8.EnumC9003e layoutState$ui_release = qw8.this.getLayoutState$ui_release();
                qw8.this.f75986c = lw8.EnumC9003e.LayingOut;
                qw8.this.setCoordinatesAccessedDuringPlacement(false);
                lw8 lw8Var = qw8.this.f75984a;
                pw8.requireOwner(lw8Var).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(lw8Var, false, this.f76056f2);
                qw8.this.f75986c = layoutState$ui_release;
                if (getInnerCoordinator().isPlacingForAlignment$ui_release() && qw8.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                qw8.this.f75989f = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.f76055e2 = false;
        }

        public final void markDetachedFromParentLookaheadPass$ui_release() {
            qw8.this.f75985b = true;
        }

        @Override // p000.ed8
        public int maxIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            return qw8.this.getOuterCoordinator().maxIntrinsicHeight(i);
        }

        @Override // p000.ed8
        public int maxIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            return qw8.this.getOuterCoordinator().maxIntrinsicWidth(i);
        }

        @Override // p000.rba
        @yfb
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public AbstractC0767t mo27949measureBRTryo0(long j) {
            lw8.EnumC9005g intrinsicsUsageByParent$ui_release = qw8.this.f75984a.getIntrinsicsUsageByParent$ui_release();
            lw8.EnumC9005g enumC9005g = lw8.EnumC9005g.NotUsed;
            if (intrinsicsUsageByParent$ui_release == enumC9005g) {
                qw8.this.f75984a.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if (rw8.isOutMostLookaheadRoot(qw8.this.f75984a)) {
                C11723a lookaheadPassDelegate$ui_release = qw8.this.getLookaheadPassDelegate$ui_release();
                md8.checkNotNull(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(enumC9005g);
                lookaheadPassDelegate$ui_release.mo27949measureBRTryo0(j);
            }
            trackMeasurementByParent(qw8.this.f75984a);
            m32048remeasureBRTryo0(j);
            return this;
        }

        public final void measureBasedOnLookahead() {
            C11723a lookaheadPassDelegate$ui_release = qw8.this.getLookaheadPassDelegate$ui_release();
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            if (parent$ui_release == null) {
                g28.throwIllegalStateExceptionForNullCheck("layoutNode parent is not set");
                throw new us8();
            }
            if (lookaheadPassDelegate$ui_release == null) {
                g28.throwIllegalStateExceptionForNullCheck("invalid lookaheadDelegate");
                throw new us8();
            }
            if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == lw8.EnumC9005g.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == lw8.EnumC9003e.Measuring) {
                ku2 ku2VarM32042getLastConstraintsDWUhwKw = lookaheadPassDelegate$ui_release.m32042getLastConstraintsDWUhwKw();
                md8.checkNotNull(ku2VarM32042getLastConstraintsDWUhwKw);
                mo27949measureBRTryo0(ku2VarM32042getLastConstraintsDWUhwKw.m30769unboximpl());
            } else if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == lw8.EnumC9005g.InLayoutBlock && parent$ui_release.getLayoutState$ui_release() == lw8.EnumC9003e.LayingOut) {
                ku2 ku2VarM32042getLastConstraintsDWUhwKw2 = lookaheadPassDelegate$ui_release.m32042getLastConstraintsDWUhwKw();
                md8.checkNotNull(ku2VarM32042getLastConstraintsDWUhwKw2);
                mo27949measureBRTryo0(ku2VarM32042getLastConstraintsDWUhwKw2.m30769unboximpl());
            }
        }

        @Override // p000.ed8
        public int minIntrinsicHeight(int i) {
            onIntrinsicsQueried();
            return qw8.this.getOuterCoordinator().minIntrinsicHeight(i);
        }

        @Override // p000.ed8
        public int minIntrinsicWidth(int i) {
            onIntrinsicsQueried();
            return qw8.this.getOuterCoordinator().minIntrinsicWidth(i);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            f7b<lw8> f7bVar;
            int size;
            if (qw8.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (f7bVar = qw8.this.f75984a.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                lw8 lw8Var = content[i];
                qw8 layoutDelegate$ui_release = lw8Var.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                    lw8.requestRelayout$ui_release$default(lw8Var, false, 1, null);
                }
                layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                i++;
            } while (i < size);
        }

        public final void onNodeDetached() {
            this.f76039F = Integer.MAX_VALUE;
            this.f76038C = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void onNodePlaced$ui_release() {
            this.f76058h2 = true;
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            lw8 lw8Var = qw8.this.f75984a;
            heb outerCoordinator$ui_release = lw8Var.getOuterCoordinator$ui_release();
            heb innerCoordinator$ui_release = lw8Var.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                md8.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                fw8 fw8Var = (fw8) outerCoordinator$ui_release;
                zIndex += fw8Var.getZIndex();
                outerCoordinator$ui_release = fw8Var.getWrapped$ui_release();
            }
            if (zIndex != this.f76057g2) {
                this.f76057g2 = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!isPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                markNodeAndSubtreeAsPlaced();
                if (this.f76063m && parent$ui_release != null) {
                    lw8.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release == null) {
                this.f76039F = 0;
            } else if (!this.f76063m && parent$ui_release.getLayoutState$ui_release() == lw8.EnumC9003e.LayingOut) {
                if (!(this.f76039F == Integer.MAX_VALUE)) {
                    g28.throwIllegalStateException("Place was called on a node which was placed already");
                }
                this.f76039F = parent$ui_release.getLayoutDelegate$ui_release().f75994k;
                parent$ui_release.getLayoutDelegate$ui_release().f75994k++;
            }
            layoutChildren();
        }

        public final void placeBasedOnLookahead() {
            C11723a lookaheadPassDelegate$ui_release = qw8.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                m32046placeSelfMLgxB_4(lookaheadPassDelegate$ui_release.m32043getLastPositionnOccac$ui_release(), lookaheadPassDelegate$ui_release.getLastZIndex$ui_release(), lookaheadPassDelegate$ui_release.getLastLayerBlock$ui_release(), lookaheadPassDelegate$ui_release.getLastExplicitLayer$ui_release());
            } else {
                g28.throwIllegalStateExceptionForNullCheck("invalid lookaheadDelegate");
                throw new us8();
            }
        }

        /* JADX INFO: renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m32048remeasureBRTryo0(long j) {
            if (qw8.this.f75984a.isDeactivated()) {
                g28.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            z9c z9cVarRequireOwner = pw8.requireOwner(qw8.this.f75984a);
            lw8 parent$ui_release = qw8.this.f75984a.getParent$ui_release();
            boolean z = true;
            qw8.this.f75984a.setCanMultiMeasure$ui_release(qw8.this.f75984a.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
            if (!qw8.this.f75984a.getMeasurePending$ui_release() && ku2.m30756equalsimpl0(m1209c(), j)) {
                z9c.forceMeasureTheSubtree$default(z9cVarRequireOwner, qw8.this.f75984a, false, 2, null);
                qw8.this.f75984a.resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(d.f76075a);
            this.f76040H = true;
            long jMo30031getSizeYbymL2g = qw8.this.getOuterCoordinator().mo30031getSizeYbymL2g();
            m1213g(j);
            qw8.this.m32038performMeasureBRTryo0(j);
            if (r78.m32085equalsimpl0(qw8.this.getOuterCoordinator().mo30031getSizeYbymL2g(), jMo30031getSizeYbymL2g) && qw8.this.getOuterCoordinator().getWidth() == getWidth() && qw8.this.getOuterCoordinator().getHeight() == getHeight()) {
                z = false;
            }
            m1212f(s78.IntSize(qw8.this.getOuterCoordinator().getWidth(), qw8.this.getOuterCoordinator().getHeight()));
            return z;
        }

        public final void replace() {
            lw8 parent$ui_release;
            try {
                this.f76063m = true;
                if (!this.f76041L) {
                    g28.throwIllegalStateException("replace called on unplaced item");
                }
                boolean zIsPlaced = isPlaced();
                m32045placeOuterCoordinatorMLgxB_4(this.f76045Q, this.f76049Z, this.f76047X, this.f76048Y);
                if (zIsPlaced && !this.f76058h2 && (parent$ui_release = qw8.this.f75984a.getParent$ui_release()) != null) {
                    lw8.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
                this.f76063m = false;
            } catch (Throwable th) {
                this.f76063m = false;
                throw th;
            }
        }

        @Override // p000.InterfaceC12654sm
        public void requestLayout() {
            lw8.requestRelayout$ui_release$default(qw8.this.f75984a, false, 1, null);
        }

        @Override // p000.InterfaceC12654sm
        public void requestMeasure() {
            lw8.requestRemeasure$ui_release$default(qw8.this.f75984a, false, false, false, 7, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.f76054d2 = z;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.f76044N = z;
        }

        public final void setMeasuredByParent$ui_release(@yfb lw8.EnumC9005g enumC9005g) {
            this.f76042M = enumC9005g;
        }

        public void setPlaced$ui_release(boolean z) {
            this.f76050Z1 = z;
        }

        public final void setPlacedByParent$ui_release(boolean z) {
            this.f76051a2 = z;
        }

        @Override // p000.zza
        public void setPlacedUnderMotionFrameOfReference(boolean z) {
            boolean zIsPlacedUnderMotionFrameOfReference = qw8.this.getOuterCoordinator().isPlacedUnderMotionFrameOfReference();
            if (z != zIsPlacedUnderMotionFrameOfReference) {
                qw8.this.getOuterCoordinator().setPlacedUnderMotionFrameOfReference(zIsPlacedUnderMotionFrameOfReference);
                this.f76065n2 = true;
            }
            this.f76066o2 = z;
        }

        public final boolean updateParentData() {
            if ((getParentData() == null && qw8.this.getOuterCoordinator().getParentData() == null) || !this.f76043M1) {
                return false;
            }
            this.f76043M1 = false;
            this.f76046V1 = qw8.this.getOuterCoordinator().getParentData();
            return true;
        }
    }

    /* JADX INFO: renamed from: qw8$c */
    public static final class C11725c extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f76077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11725c(long j) {
            super(0);
            this.f76077b = j;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            lm9 lookaheadDelegate = qw8.this.getOuterCoordinator().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            lookaheadDelegate.mo27949measureBRTryo0(this.f76077b);
        }
    }

    /* JADX INFO: renamed from: qw8$d */
    public static final class C11726d extends tt8 implements ny6<bth> {
        public C11726d() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            qw8.this.getOuterCoordinator().mo27949measureBRTryo0(qw8.this.f76003t);
        }
    }

    public qw8(@yfb lw8 lw8Var) {
        this.f75984a = lw8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: performLookaheadMeasure-BRTryo0, reason: not valid java name */
    public final void m32037performLookaheadMeasureBRTryo0(long j) {
        this.f75986c = lw8.EnumC9003e.LookaheadMeasuring;
        this.f75990g = false;
        bac.observeMeasureSnapshotReads$ui_release$default(pw8.requireOwner(this.f75984a).getSnapshotObserver(), this.f75984a, false, new C11725c(j), 2, null);
        markLookaheadLayoutPending$ui_release();
        if (rw8.isOutMostLookaheadRoot(this.f75984a)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.f75986c = lw8.EnumC9003e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: performMeasure-BRTryo0, reason: not valid java name */
    public final void m32038performMeasureBRTryo0(long j) {
        lw8.EnumC9003e enumC9003e = this.f75986c;
        lw8.EnumC9003e enumC9003e2 = lw8.EnumC9003e.Idle;
        if (!(enumC9003e == enumC9003e2)) {
            g28.throwIllegalStateException("layout state is not idle before measure starts");
        }
        lw8.EnumC9003e enumC9003e3 = lw8.EnumC9003e.Measuring;
        this.f75986c = enumC9003e3;
        this.f75987d = false;
        this.f76003t = j;
        pw8.requireOwner(this.f75984a).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.f75984a, false, this.f76004u);
        if (this.f75986c == enumC9003e3) {
            markLayoutPending$ui_release();
            this.f75986c = enumC9003e2;
        }
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.f76002s == null) {
            this.f76002s = new C11723a();
        }
    }

    @yfb
    public final InterfaceC12654sm getAlignmentLinesOwner$ui_release() {
        return this.f76001r;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.f75997n;
    }

    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.f76000q;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.f75996m;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.f75995l;
    }

    public final boolean getDetachedFromParentLookaheadPass$ui_release() {
        return this.f75985b;
    }

    public final int getHeight$ui_release() {
        return this.f76001r.getHeight();
    }

    @gib
    /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final ku2 m32039getLastConstraintsDWUhwKw() {
        return this.f76001r.m32047getLastConstraintsDWUhwKw();
    }

    @gib
    /* JADX INFO: renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final ku2 m32040getLastLookaheadConstraintsDWUhwKw() {
        C11723a c11723a = this.f76002s;
        if (c11723a != null) {
            return c11723a.m32042getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.f75988e;
    }

    @yfb
    public final lw8.EnumC9003e getLayoutState$ui_release() {
        return this.f75986c;
    }

    @gib
    public final InterfaceC12654sm getLookaheadAlignmentLinesOwner$ui_release() {
        return this.f76002s;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.f75999p;
    }

    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.f75998o;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.f75991h;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.f75990g;
    }

    @gib
    public final C11723a getLookaheadPassDelegate$ui_release() {
        return this.f76002s;
    }

    @yfb
    public final C11724b getMeasurePassDelegate$ui_release() {
        return this.f76001r;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.f75987d;
    }

    @yfb
    public final heb getOuterCoordinator() {
        return this.f75984a.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    public final int getWidth$ui_release() {
        return this.f76001r.getWidth();
    }

    public final void invalidateParentData() {
        this.f76001r.invalidateParentData();
        C11723a c11723a = this.f76002s;
        if (c11723a != null) {
            c11723a.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.f76001r.setChildDelegatesDirty$ui_release(true);
        C11723a c11723a = this.f76002s;
        if (c11723a != null) {
            c11723a.setChildDelegatesDirty$ui_release(true);
        }
    }

    public final void markLayoutPending$ui_release() {
        this.f75988e = true;
        this.f75989f = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.f75991h = true;
        this.f75992i = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.f75990g = true;
    }

    public final void markMeasurePending$ui_release() {
        this.f75987d = true;
    }

    public final void onCoordinatesUsed() {
        lw8.EnumC9003e layoutState$ui_release = this.f75984a.getLayoutState$ui_release();
        if (layoutState$ui_release == lw8.EnumC9003e.LayingOut || layoutState$ui_release == lw8.EnumC9003e.LookaheadLayingOut) {
            if (this.f76001r.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == lw8.EnumC9003e.LookaheadLayingOut) {
            C11723a c11723a = this.f76002s;
            if (c11723a == null || !c11723a.getLayingOutChildren()) {
                setLookaheadCoordinatesAccessedDuringModifierPlacement(true);
            } else {
                setLookaheadCoordinatesAccessedDuringPlacement(true);
            }
        }
    }

    public final void resetAlignmentLines() {
        AbstractC12150rm alignmentLines;
        this.f76001r.getAlignmentLines().reset$ui_release();
        C11723a c11723a = this.f76002s;
        if (c11723a == null || (alignmentLines = c11723a.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui_release();
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        int i2 = this.f75997n;
        this.f75997n = i;
        if ((i2 == 0) != (i == 0)) {
            lw8 parent$ui_release = this.f75984a.getParent$ui_release();
            qw8 layoutDelegate$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutDelegate$ui_release() : null;
            if (layoutDelegate$ui_release != null) {
                if (i == 0) {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.f75997n - 1);
                } else {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.f75997n + 1);
                }
            }
        }
    }

    public final void setChildrenAccessingLookaheadCoordinatesDuringPlacement(int i) {
        int i2 = this.f76000q;
        this.f76000q = i;
        if ((i2 == 0) != (i == 0)) {
            lw8 parent$ui_release = this.f75984a.getParent$ui_release();
            qw8 layoutDelegate$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutDelegate$ui_release() : null;
            if (layoutDelegate$ui_release != null) {
                if (i == 0) {
                    layoutDelegate$ui_release.setChildrenAccessingLookaheadCoordinatesDuringPlacement(layoutDelegate$ui_release.f76000q - 1);
                } else {
                    layoutDelegate$ui_release.setChildrenAccessingLookaheadCoordinatesDuringPlacement(layoutDelegate$ui_release.f76000q + 1);
                }
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.f75996m != z) {
            this.f75996m = z;
            if (z && !this.f75995l) {
                setChildrenAccessingCoordinatesDuringPlacement(this.f75997n + 1);
            } else {
                if (z || this.f75995l) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.f75997n - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.f75995l != z) {
            this.f75995l = z;
            if (z && !this.f75996m) {
                setChildrenAccessingCoordinatesDuringPlacement(this.f75997n + 1);
            } else {
                if (z || this.f75996m) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.f75997n - 1);
            }
        }
    }

    public final void setLookaheadCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.f75999p != z) {
            this.f75999p = z;
            if (z && !this.f75998o) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.f76000q + 1);
            } else {
                if (z || this.f75998o) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.f76000q - 1);
            }
        }
    }

    public final void setLookaheadCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.f75998o != z) {
            this.f75998o = z;
            if (z && !this.f75999p) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.f76000q + 1);
            } else {
                if (z || this.f75999p) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.f76000q - 1);
            }
        }
    }

    public final void updateParentData() {
        lw8 parent$ui_release;
        if (this.f76001r.updateParentData() && (parent$ui_release = this.f75984a.getParent$ui_release()) != null) {
            lw8.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 7, null);
        }
        C11723a c11723a = this.f76002s;
        if (c11723a == null || !c11723a.updateParentData()) {
            return;
        }
        if (rw8.isOutMostLookaheadRoot(this.f75984a)) {
            lw8 parent$ui_release2 = this.f75984a.getParent$ui_release();
            if (parent$ui_release2 != null) {
                lw8.requestRemeasure$ui_release$default(parent$ui_release2, false, false, false, 7, null);
                return;
            }
            return;
        }
        lw8 parent$ui_release3 = this.f75984a.getParent$ui_release();
        if (parent$ui_release3 != null) {
            lw8.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, false, 7, null);
        }
    }
}
