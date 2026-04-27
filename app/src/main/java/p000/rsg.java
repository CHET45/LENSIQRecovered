package p000;

import com.haibin.calendarview.BuildConfig;
import org.opencv.videoio.Videoio;
import p000.izb;
import p000.jvd;
import p000.rad;
import p000.sdh;
import p000.ssf;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,1542:1\n1409#1,6:1597\n1409#1,6:1603\n1409#1,6:1609\n1409#1,6:1615\n81#2:1543\n107#2,2:1544\n81#2:1546\n107#2,2:1547\n81#2:1549\n107#2,2:1550\n81#2:1552\n107#2,2:1553\n81#2:1555\n107#2,2:1556\n81#2:1558\n107#2,2:1559\n81#2:1561\n107#2,2:1562\n1#3:1564\n602#4,8:1565\n653#5,24:1573\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n1396#1:1597,6\n1397#1:1603,6\n1398#1:1609,6\n1399#1:1615,6\n130#1:1543\n130#1:1544,2\n146#1:1546\n146#1:1547,2\n166#1:1549\n166#1:1550,2\n199#1:1552\n199#1:1553,2\n208#1:1555\n208#1:1556,2\n213#1:1558\n213#1:1559,2\n219#1:1561\n219#1:1562,2\n299#1:1565,8\n545#1:1573,24\n*E\n"})
@e0g(parameters = 0)
public final class rsg {

    /* JADX INFO: renamed from: v */
    public static final int f79225v = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final jeh f79226a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final lug f79227b;

    /* JADX INFO: renamed from: c */
    @yfb
    public c64 f79228c;

    /* JADX INFO: renamed from: d */
    public boolean f79229d;

    /* JADX INFO: renamed from: e */
    public boolean f79230e;

    /* JADX INFO: renamed from: f */
    public boolean f79231f;

    /* JADX INFO: renamed from: g */
    public boolean f79232g;

    /* JADX INFO: renamed from: h */
    @gib
    public lg7 f79233h;

    /* JADX INFO: renamed from: i */
    @gib
    public awg f79234i;

    /* JADX INFO: renamed from: j */
    @gib
    public a52 f79235j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final z6b f79236k = xtf.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: l */
    @gib
    public ny6<? extends isd> f79237l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final z6b f79238m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final z6b f79239n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final z6b f79240o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final z6b f79241p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final z6b f79242q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final z6b f79243r;

    /* JADX INFO: renamed from: s */
    @gib
    public vwe f79244s;

    /* JADX INFO: renamed from: t */
    public int f79245t;

    /* JADX INFO: renamed from: u */
    @gib
    public rad.C11972b f79246u;

    /* JADX INFO: renamed from: rsg$a */
    public enum EnumC12235a {
        None,
        Touch,
        Mouse
    }

    /* JADX INFO: renamed from: rsg$a0 */
    public static final class C12236a0<T> implements t66 {
        public C12236a0() {
        }

        @Override // p000.t66
        public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
            return emit((rud) obj, (zy2<? super bth>) zy2Var);
        }

        @gib
        public final Object emit(@yfb rud rudVar, @yfb zy2<? super bth> zy2Var) {
            if (md8.areEqual(rudVar, rud.f79687e.getZero())) {
                rsg.this.hideTextToolbar();
            } else {
                rsg.this.showTextToolbar(rudVar);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: rsg$b */
    @dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1542:1\n1#2:1543\n*E\n"})
    public final class C12237b implements e0b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final ny6<bth> f79252a;

        /* JADX INFO: renamed from: b */
        public int f79253b = -1;

        /* JADX INFO: renamed from: c */
        public long f79254c = izb.f49009b.m30444getUnspecifiedF1C5BW0();

        /* JADX INFO: renamed from: rsg$b$a */
        public static final class a extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f79256a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j) {
                super(0);
                this.f79256a = j;
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "Mouse.onDrag " + ((Object) izb.m30437toStringimpl(this.f79256a));
            }
        }

        /* JADX INFO: renamed from: rsg$b$b */
        public static final class b extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public static final b f79257a = new b();

            public b() {
                super(0);
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "Mouse.onDragDone";
            }
        }

        /* JADX INFO: renamed from: rsg$b$c */
        public static final class c extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public static final c f79258a = new c();

            public c() {
                super(0);
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "Mouse.onExtend";
            }
        }

        /* JADX INFO: renamed from: rsg$b$d */
        public static final class d extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public static final d f79259a = new d();

            public d() {
                super(0);
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "Mouse.onExtendDrag";
            }
        }

        /* JADX INFO: renamed from: rsg$b$e */
        public static final class e extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public static final e f79260a = new e();

            public e() {
                super(0);
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "Mouse.onStart";
            }
        }

        public C12237b(@yfb ny6<bth> ny6Var) {
            this.f79252a = ny6Var;
        }

        /* JADX INFO: renamed from: updateSelection-r1Wruf4, reason: not valid java name */
        private final long m32190updateSelectionr1Wruf4(long j, mwe mweVar, boolean z) {
            Integer numValueOf = Integer.valueOf(this.f79253b);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : rsg.this.f79227b.m30896getOffsetForPosition3MmeM6k(this.f79254c, false);
            int iM30896getOffsetForPosition3MmeM6k = rsg.this.f79227b.m30896getOffsetForPosition3MmeM6k(j, false);
            rsg rsgVar = rsg.this;
            long jM32187updateSelectionSsLRf8 = rsgVar.m32187updateSelectionSsLRf8(rsgVar.f79226a.getVisualText(), iIntValue, iM30896getOffsetForPosition3MmeM6k, false, mweVar, false, z);
            if (this.f79253b == -1 && !jvg.m30587getCollapsedimpl(jM32187updateSelectionSsLRf8)) {
                this.f79253b = jvg.m30593getStartimpl(jM32187updateSelectionSsLRf8);
            }
            if (jvg.m30592getReversedimpl(jM32187updateSelectionSsLRf8)) {
                jM32187updateSelectionSsLRf8 = ssg.m32332reverse5zctL8(jM32187updateSelectionSsLRf8);
            }
            rsg.this.f79226a.m30519selectCharsIn5zctL8(jM32187updateSelectionSsLRf8);
            rsg.this.updateTextToolbarState(cwg.Selection);
            return jM32187updateSelectionSsLRf8;
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onDrag-3MmeM6k */
        public boolean mo28715onDrag3MmeM6k(long j, @yfb mwe mweVar) {
            if (!rsg.this.f79229d || rsg.this.f79226a.getVisualText().length() == 0) {
                return false;
            }
            ssg.logDebug(new a(j));
            m32190updateSelectionr1Wruf4(j, mweVar, false);
            return true;
        }

        @Override // p000.e0b
        public void onDragDone() {
            ssg.logDebug(b.f79257a);
            rsg.this.setDirectDragGestureInitiator(EnumC12235a.None);
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onExtend-k-4lQ0M */
        public boolean mo28716onExtendk4lQ0M(long j) {
            ssg.logDebug(c.f79258a);
            return true;
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
        public boolean mo28717onExtendDragk4lQ0M(long j) {
            ssg.logDebug(d.f79259a);
            return true;
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onStart-3MmeM6k */
        public boolean mo28718onStart3MmeM6k(long j, @yfb mwe mweVar) {
            if (!rsg.this.f79229d || rsg.this.f79226a.getVisualText().length() == 0) {
                return false;
            }
            ssg.logDebug(e.f79260a);
            rsg.this.setDirectDragGestureInitiator(EnumC12235a.Mouse);
            this.f79252a.invoke();
            rsg.this.f79245t = -1;
            this.f79253b = -1;
            this.f79254c = j;
            this.f79253b = jvg.m30593getStartimpl(m32190updateSelectionr1Wruf4(j, mweVar, true));
            return true;
        }
    }

    /* JADX INFO: renamed from: rsg$b0 */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12238b0 extends ugg implements gz6<x13, zy2<? super jj8>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79261a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79262b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ s2d f79264d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f79265e;

        /* JADX INFO: renamed from: rsg$b0$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {391}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79266a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rsg f79267b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ s2d f79268c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(rsg rsgVar, s2d s2dVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f79267b = rsgVar;
                this.f79268c = s2dVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f79267b, this.f79268c, zy2Var);
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
                int i = this.f79266a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    rsg rsgVar = this.f79267b;
                    s2d s2dVar = this.f79268c;
                    this.f79266a = 1;
                    if (rsgVar.detectTouchMode(s2dVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: rsg$b0$b */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {394}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79269a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ s2d f79270b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ rsg f79271c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ boolean f79272d;

            /* JADX INFO: renamed from: rsg$b0$b$a */
            public static final class a implements emg {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rsg f79273a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f79274b;

                public a(rsg rsgVar, boolean z) {
                    this.f79273a = rsgVar;
                    this.f79274b = z;
                }

                @Override // p000.emg
                /* JADX INFO: renamed from: onEvent-k-4lQ0M */
                public final void mo28826onEventk4lQ0M(long j) {
                    this.f79273a.markStartContentVisibleOffset();
                    rsg rsgVar = this.f79273a;
                    boolean z = this.f79274b;
                    rsgVar.m32189updateHandleDraggingUv8p0NA(z ? zd7.SelectionStart : zd7.SelectionEnd, uwe.m32665getAdjustedCoordinatesk4lQ0M(rsgVar.m32180getHandlePositiontuRUvjQ(z)));
                }
            }

            /* JADX INFO: renamed from: rsg$b0$b$b, reason: collision with other inner class name */
            public static final class C16519b extends tt8 implements ny6<bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rsg f79275a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16519b(rsg rsgVar) {
                    super(0);
                    this.f79275a = rsgVar;
                }

                @Override // p000.ny6
                public /* bridge */ /* synthetic */ bth invoke() {
                    invoke2();
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f79275a.clearHandleDragging();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s2d s2dVar, rsg rsgVar, boolean z, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f79270b = s2dVar;
                this.f79271c = rsgVar;
                this.f79272d = z;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f79270b, this.f79271c, this.f79272d, zy2Var);
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
                int i = this.f79269a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    s2d s2dVar = this.f79270b;
                    a aVar = new a(this.f79271c, this.f79272d);
                    C16519b c16519b = new C16519b(this.f79271c);
                    this.f79269a = 1;
                    if (oad.detectPressDownGesture(s2dVar, aVar, c16519b, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: rsg$b0$c */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_LED_MODE}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79276a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rsg f79277b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ s2d f79278c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ boolean f79279d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(rsg rsgVar, s2d s2dVar, boolean z, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f79277b = rsgVar;
                this.f79278c = s2dVar;
                this.f79279d = z;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new c(this.f79277b, this.f79278c, this.f79279d, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f79276a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    rsg rsgVar = this.f79277b;
                    s2d s2dVar = this.f79278c;
                    boolean z = this.f79279d;
                    this.f79276a = 1;
                    if (rsgVar.detectSelectionHandleDragGestures(s2dVar, z, this) == coroutine_suspended) {
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
        public C12238b0(s2d s2dVar, boolean z, zy2<? super C12238b0> zy2Var) {
            super(2, zy2Var);
            this.f79264d = s2dVar;
            this.f79265e = z;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12238b0 c12238b0 = rsg.this.new C12238b0(this.f79264d, this.f79265e, zy2Var);
            c12238b0.f79262b = obj;
            return c12238b0;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super jj8> zy2Var) {
            return ((C12238b0) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f79261a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            x13 x13Var = (x13) this.f79262b;
            b23 b23Var = b23.f12444d;
            fg1.launch$default(x13Var, null, b23Var, new a(rsg.this, this.f79264d, null), 1, null);
            fg1.launch$default(x13Var, null, b23Var, new b(this.f79264d, rsg.this, this.f79265e, null), 1, null);
            return fg1.launch$default(x13Var, null, b23Var, new c(rsg.this, this.f79264d, this.f79265e, null), 1, null);
        }
    }

    /* JADX INFO: renamed from: rsg$c */
    @dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1542:1\n1#2:1543\n*E\n"})
    public final class C12239c implements zqg {

        /* JADX INFO: renamed from: a */
        @yfb
        public final ny6<bth> f79280a;

        /* JADX INFO: renamed from: b */
        public int f79281b = -1;

        /* JADX INFO: renamed from: c */
        public long f79282c;

        /* JADX INFO: renamed from: d */
        public long f79283d;

        /* JADX INFO: renamed from: e */
        @yfb
        public zd7 f79284e;

        /* JADX INFO: renamed from: rsg$c$a */
        public static final class a extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f79286a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j) {
                super(0);
                this.f79286a = j;
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "Touch.onDrag at " + ((Object) izb.m30437toStringimpl(this.f79286a));
            }
        }

        /* JADX INFO: renamed from: rsg$c$b */
        public static final class b extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public static final b f79287a = new b();

            public b() {
                super(0);
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "Touch.onDragStop";
            }
        }

        /* JADX INFO: renamed from: rsg$c$c */
        public static final class c extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f79288a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(long j) {
                super(0);
                this.f79288a = j;
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "Touch.onDragStart after longPress at " + ((Object) izb.m30437toStringimpl(this.f79288a));
            }
        }

        public C12239c(@yfb ny6<bth> ny6Var) {
            this.f79280a = ny6Var;
            izb.C7673a c7673a = izb.f49009b;
            this.f79282c = c7673a.m30444getUnspecifiedF1C5BW0();
            this.f79283d = c7673a.m30445getZeroF1C5BW0();
            this.f79284e = zd7.SelectionEnd;
        }

        private final void onDragStop() {
            if (mzb.m31100isSpecifiedk4lQ0M(this.f79282c)) {
                ssg.logDebug(b.f79287a);
                rsg.this.clearHandleDragging();
                this.f79281b = -1;
                izb.C7673a c7673a = izb.f49009b;
                this.f79282c = c7673a.m30444getUnspecifiedF1C5BW0();
                this.f79283d = c7673a.m30445getZeroF1C5BW0();
                rsg.this.f79245t = -1;
                rsg.this.setDirectDragGestureInitiator(EnumC12235a.None);
                this.f79280a.invoke();
            }
        }

        @Override // p000.zqg
        public void onCancel() {
            onDragStop();
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDown-k-4lQ0M */
        public void mo31651onDownk4lQ0M(long j) {
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDrag-k-4lQ0M */
        public void mo31652onDragk4lQ0M(long j) {
            int iIntValue;
            int iM30896getOffsetForPosition3MmeM6k;
            mwe word;
            if (!rsg.this.f79229d || rsg.this.f79226a.getVisualText().length() == 0) {
                return;
            }
            long jM30434plusMKHz9U = izb.m30434plusMKHz9U(this.f79283d, j);
            this.f79283d = jM30434plusMKHz9U;
            long jM30434plusMKHz9U2 = izb.m30434plusMKHz9U(this.f79282c, jM30434plusMKHz9U);
            ssg.logDebug(new a(jM30434plusMKHz9U2));
            if (this.f79281b >= 0 || rsg.this.f79227b.m30897isPositionOnTextk4lQ0M(jM30434plusMKHz9U2)) {
                Integer numValueOf = Integer.valueOf(this.f79281b);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : rsg.this.f79227b.m30896getOffsetForPosition3MmeM6k(this.f79282c, false);
                iM30896getOffsetForPosition3MmeM6k = rsg.this.f79227b.m30896getOffsetForPosition3MmeM6k(jM30434plusMKHz9U2, false);
                if (this.f79281b < 0 && iIntValue == iM30896getOffsetForPosition3MmeM6k) {
                    return;
                }
                word = mwe.f62568a.getWord();
                rsg.this.updateTextToolbarState(cwg.Selection);
            } else {
                iIntValue = lug.m30893getOffsetForPosition3MmeM6k$default(rsg.this.f79227b, this.f79282c, false, 2, null);
                iM30896getOffsetForPosition3MmeM6k = lug.m30893getOffsetForPosition3MmeM6k$default(rsg.this.f79227b, jM30434plusMKHz9U2, false, 2, null);
                word = iIntValue == iM30896getOffsetForPosition3MmeM6k ? mwe.f62568a.getNone() : mwe.f62568a.getWord();
            }
            int i = iIntValue;
            int i2 = iM30896getOffsetForPosition3MmeM6k;
            mwe mweVar = word;
            long jM30568getSelectiond9O1mEE = rsg.this.f79226a.getVisualText().m30568getSelectiond9O1mEE();
            rsg rsgVar = rsg.this;
            long jM21509a = rsg.m21509a(rsgVar, rsgVar.f79226a.getVisualText(), i, i2, false, mweVar, false, false, 64, null);
            if (this.f79281b == -1 && !jvg.m30587getCollapsedimpl(jM21509a)) {
                this.f79281b = jvg.m30593getStartimpl(jM21509a);
            }
            if (jvg.m30592getReversedimpl(jM21509a)) {
                jM21509a = ssg.m32332reverse5zctL8(jM21509a);
            }
            if (!jvg.m30586equalsimpl0(jM21509a, jM30568getSelectiond9O1mEE)) {
                zd7 zd7Var = (jvg.m30593getStartimpl(jM21509a) == jvg.m30593getStartimpl(jM30568getSelectiond9O1mEE) || jvg.m30588getEndimpl(jM21509a) != jvg.m30588getEndimpl(jM30568getSelectiond9O1mEE)) ? ((jvg.m30593getStartimpl(jM21509a) != jvg.m30593getStartimpl(jM30568getSelectiond9O1mEE) || jvg.m30588getEndimpl(jM21509a) == jvg.m30588getEndimpl(jM30568getSelectiond9O1mEE)) && ((float) (jvg.m30593getStartimpl(jM21509a) + jvg.m30588getEndimpl(jM21509a))) / 2.0f <= ((float) (jvg.m30593getStartimpl(jM30568getSelectiond9O1mEE) + jvg.m30588getEndimpl(jM30568getSelectiond9O1mEE))) / 2.0f) ? zd7.SelectionStart : zd7.SelectionEnd : zd7.SelectionStart;
                this.f79284e = zd7Var;
            }
            if (jvg.m30587getCollapsedimpl(jM30568getSelectiond9O1mEE) || !jvg.m30587getCollapsedimpl(jM21509a)) {
                rsg.this.f79226a.m30519selectCharsIn5zctL8(jM21509a);
            }
            rsg.this.m32189updateHandleDraggingUv8p0NA(this.f79284e, jM30434plusMKHz9U2);
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onStart-k-4lQ0M */
        public void mo31653onStartk4lQ0M(long j) {
            if (rsg.this.f79229d) {
                ssg.logDebug(new c(j));
                rsg.this.m32189updateHandleDraggingUv8p0NA(this.f79284e, j);
                rsg.this.setShowCursorHandle(false);
                rsg.this.setDirectDragGestureInitiator(EnumC12235a.Touch);
                this.f79282c = j;
                this.f79283d = izb.f49009b.m30445getZeroF1C5BW0();
                rsg.this.f79245t = -1;
                if (rsg.this.f79227b.m30897isPositionOnTextk4lQ0M(j)) {
                    if (rsg.this.f79226a.getVisualText().length() == 0) {
                        return;
                    }
                    int iM30893getOffsetForPosition3MmeM6k$default = lug.m30893getOffsetForPosition3MmeM6k$default(rsg.this.f79227b, j, false, 2, null);
                    long jM21509a = rsg.m21509a(rsg.this, new jrg(rsg.this.f79226a.getVisualText(), jvg.f52112b.m30598getZerod9O1mEE(), null, null, 12, null), iM30893getOffsetForPosition3MmeM6k$default, iM30893getOffsetForPosition3MmeM6k$default, false, mwe.f62568a.getWord(), false, false, 96, null);
                    rsg.this.f79226a.m30519selectCharsIn5zctL8(jM21509a);
                    rsg.this.updateTextToolbarState(cwg.Selection);
                    this.f79281b = jvg.m30593getStartimpl(jM21509a);
                    return;
                }
                int iM30893getOffsetForPosition3MmeM6k$default2 = lug.m30893getOffsetForPosition3MmeM6k$default(rsg.this.f79227b, j, false, 2, null);
                lg7 lg7Var = rsg.this.f79233h;
                if (lg7Var != null) {
                    lg7Var.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
                }
                rsg.this.f79226a.placeCursorBeforeCharAt(iM30893getOffsetForPosition3MmeM6k$default2);
                rsg.this.setShowCursorHandle(true);
                rsg.this.updateTextToolbarState(cwg.Cursor);
            }
        }

        @Override // p000.zqg
        public void onStop() {
            onDragStop();
        }

        @Override // p000.zqg
        public void onUp() {
        }
    }

    /* JADX INFO: renamed from: rsg$c0 */
    @dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$menuItem$1\n+ 2 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n1#1,1542:1\n1396#2:1543\n*E\n"})
    public static final class C12240c0 extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cwg f79290b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f79291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12240c0(cwg cwgVar, rsg rsgVar) {
            super(0);
            this.f79290b = cwgVar;
            this.f79291c = rsgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            rsg.copy$default(this.f79291c, false, 1, null);
            rsg.this.updateTextToolbarState(this.f79290b);
        }
    }

    /* JADX INFO: renamed from: rsg$d */
    public /* synthetic */ class C12241d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f79292a;

        static {
            int[] iArr = new int[o08.values().length];
            try {
                iArr[o08.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o08.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o08.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o08.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f79292a = iArr;
        }
    }

    /* JADX INFO: renamed from: rsg$d0 */
    @dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$menuItem$1\n+ 2 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n1#1,1542:1\n1397#2:1543\n*E\n"})
    public static final class C12242d0 extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cwg f79294b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f79295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12242d0(cwg cwgVar, rsg rsgVar) {
            super(0);
            this.f79294b = cwgVar;
            this.f79295c = rsgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f79295c.paste();
            rsg.this.updateTextToolbarState(this.f79294b);
        }
    }

    /* JADX INFO: renamed from: rsg$e */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12243e extends ugg implements gz6<x13, zy2<? super jj8>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79296a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79297b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ s2d f79299d;

        /* JADX INFO: renamed from: rsg$e$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {BuildConfig.VERSION_CODE}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79300a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rsg f79301b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ s2d f79302c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(rsg rsgVar, s2d s2dVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f79301b = rsgVar;
                this.f79302c = s2dVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f79301b, this.f79302c, zy2Var);
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
                int i = this.f79300a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    rsg rsgVar = this.f79301b;
                    s2d s2dVar = this.f79302c;
                    this.f79300a = 1;
                    if (rsgVar.detectTouchMode(s2dVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: rsg$e$b */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {371}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79303a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rsg f79304b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ s2d f79305c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(rsg rsgVar, s2d s2dVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f79304b = rsgVar;
                this.f79305c = s2dVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f79304b, this.f79305c, zy2Var);
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
                int i = this.f79303a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    rsg rsgVar = this.f79304b;
                    s2d s2dVar = this.f79305c;
                    this.f79303a = 1;
                    if (rsgVar.detectCursorHandleDragGestures(s2dVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: rsg$e$c */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {374}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79306a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ s2d f79307b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ rsg f79308c;

            /* JADX INFO: renamed from: rsg$e$c$a */
            public static final class a extends tt8 implements qy6<izb, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rsg f79309a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(rsg rsgVar) {
                    super(1);
                    this.f79309a = rsgVar;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
                    m32191invokek4lQ0M(izbVar.m30439unboximpl());
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m32191invokek4lQ0M(long j) {
                    rsg rsgVar = this.f79309a;
                    cwg textToolbarState = rsgVar.getTextToolbarState();
                    cwg cwgVar = cwg.Cursor;
                    if (textToolbarState == cwgVar) {
                        cwgVar = cwg.None;
                    }
                    rsgVar.setTextToolbarState(cwgVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(s2d s2dVar, rsg rsgVar, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f79307b = s2dVar;
                this.f79308c = rsgVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new c(this.f79307b, this.f79308c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f79306a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    s2d s2dVar = this.f79307b;
                    a aVar = new a(this.f79308c);
                    this.f79306a = 1;
                    if (dmg.detectTapGestures$default(s2dVar, null, null, null, aVar, this, 7, null) == coroutine_suspended) {
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
        public C12243e(s2d s2dVar, zy2<? super C12243e> zy2Var) {
            super(2, zy2Var);
            this.f79299d = s2dVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12243e c12243e = rsg.this.new C12243e(this.f79299d, zy2Var);
            c12243e.f79297b = obj;
            return c12243e;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super jj8> zy2Var) {
            return ((C12243e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f79296a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            x13 x13Var = (x13) this.f79297b;
            b23 b23Var = b23.f12444d;
            fg1.launch$default(x13Var, null, b23Var, new a(rsg.this, this.f79299d, null), 1, null);
            fg1.launch$default(x13Var, null, b23Var, new b(rsg.this, this.f79299d, null), 1, null);
            return fg1.launch$default(x13Var, null, b23Var, new c(this.f79299d, rsg.this, null), 1, null);
        }
    }

    /* JADX INFO: renamed from: rsg$e0 */
    @dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$menuItem$1\n+ 2 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n1#1,1542:1\n1398#2:1543\n*E\n"})
    public static final class C12244e0 extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cwg f79311b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f79312c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12244e0(cwg cwgVar, rsg rsgVar) {
            super(0);
            this.f79311b = cwgVar;
            this.f79312c = rsgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f79312c.cut();
            rsg.this.updateTextToolbarState(this.f79311b);
        }
    }

    /* JADX INFO: renamed from: rsg$f */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m4010f = "TextFieldSelectionState.kt", m4011i = {0, 0, 0}, m4012l = {614}, m4013m = "detectCursorHandleDragGestures", m4014n = {"this", "cursorDragStart", "cursorDragDelta"}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C12245f extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f79313a;

        /* JADX INFO: renamed from: b */
        public Object f79314b;

        /* JADX INFO: renamed from: c */
        public Object f79315c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f79316d;

        /* JADX INFO: renamed from: f */
        public int f79318f;

        public C12245f(zy2<? super C12245f> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f79316d = obj;
            this.f79318f |= Integer.MIN_VALUE;
            return rsg.this.detectCursorHandleDragGestures(null, this);
        }
    }

    /* JADX INFO: renamed from: rsg$f0 */
    @dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$menuItem$1\n+ 2 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n1#1,1542:1\n1400#2,2:1543\n*E\n"})
    public static final class C12246f0 extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cwg f79320b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f79321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12246f0(cwg cwgVar, rsg rsgVar) {
            super(0);
            this.f79320b = cwgVar;
            this.f79321c = rsgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f79321c.selectAll();
            rsg.this.updateTextToolbarState(this.f79320b);
        }
    }

    /* JADX INFO: renamed from: rsg$g */
    public static final class C12247g extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8120g f79322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rsg f79323b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8120g f79324c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12247g(jvd.C8120g c8120g, rsg rsgVar, jvd.C8120g c8120g2) {
            super(1);
            this.f79322a = c8120g;
            this.f79323b = rsgVar;
            this.f79324c = c8120g2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m32192invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m32192invokek4lQ0M(long j) {
            this.f79322a.f52109a = uwe.m32665getAdjustedCoordinatesk4lQ0M(this.f79323b.getCursorRect().m32200getBottomCenterF1C5BW0());
            this.f79324c.f52109a = izb.f49009b.m30445getZeroF1C5BW0();
            this.f79323b.setInTouchMode(true);
            this.f79323b.markStartContentVisibleOffset();
            this.f79323b.m32189updateHandleDraggingUv8p0NA(zd7.Cursor, this.f79322a.f52109a);
        }
    }

    /* JADX INFO: renamed from: rsg$h */
    public static final class C12248h extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8120g f79325a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8120g f79326b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f79327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12248h(jvd.C8120g c8120g, jvd.C8120g c8120g2, rsg rsgVar) {
            super(0);
            this.f79325a = c8120g;
            this.f79326b = c8120g2;
            this.f79327c = rsgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            rsg.detectCursorHandleDragGestures$onDragStop(this.f79325a, this.f79326b, this.f79327c);
        }
    }

    /* JADX INFO: renamed from: rsg$i */
    public static final class C12249i extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8120g f79328a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8120g f79329b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rsg f79330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12249i(jvd.C8120g c8120g, jvd.C8120g c8120g2, rsg rsgVar) {
            super(0);
            this.f79328a = c8120g;
            this.f79329b = c8120g2;
            this.f79330c = rsgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            rsg.detectCursorHandleDragGestures$onDragStop(this.f79328a, this.f79329b, this.f79330c);
        }
    }

    /* JADX INFO: renamed from: rsg$j */
    public static final class C12250j extends tt8 implements gz6<h2d, izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8120g f79331a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rsg f79332b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8120g f79333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12250j(jvd.C8120g c8120g, rsg rsgVar, jvd.C8120g c8120g2) {
            super(2);
            this.f79331a = c8120g;
            this.f79332b = rsgVar;
            this.f79333c = c8120g2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar, izb izbVar) {
            m32193invokeUv8p0NA(h2dVar, izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m32193invokeUv8p0NA(@yfb h2d h2dVar, long j) {
            jvd.C8120g c8120g = this.f79331a;
            c8120g.f52109a = izb.m30434plusMKHz9U(c8120g.f52109a, j);
            this.f79332b.m32189updateHandleDraggingUv8p0NA(zd7.Cursor, izb.m30434plusMKHz9U(this.f79333c.f52109a, this.f79331a.f52109a));
            rsg rsgVar = this.f79332b;
            if (rsgVar.m32184placeCursorAtNearestOffsetk4lQ0M(rsgVar.m32188getHandleDragPositionF1C5BW0())) {
                h2dVar.consume();
                lg7 lg7Var = this.f79332b.f79233h;
                if (lg7Var != null) {
                    lg7Var.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
                }
            }
        }
    }

    /* JADX INFO: renamed from: rsg$k */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m4010f = "TextFieldSelectionState.kt", m4011i = {0, 0, 0, 0}, m4012l = {980}, m4013m = "detectSelectionHandleDragGestures", m4014n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, m4015s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C12251k extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f79334a;

        /* JADX INFO: renamed from: b */
        public Object f79335b;

        /* JADX INFO: renamed from: c */
        public Object f79336c;

        /* JADX INFO: renamed from: d */
        public Object f79337d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f79338e;

        /* JADX INFO: renamed from: m */
        public int f79340m;

        public C12251k(zy2<? super C12251k> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f79338e = obj;
            this.f79340m |= Integer.MIN_VALUE;
            return rsg.this.detectSelectionHandleDragGestures(null, false, this);
        }
    }

    /* JADX INFO: renamed from: rsg$l */
    public static final class C12252l extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8120g f79341a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rsg f79342b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f79343c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zd7 f79344d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ jvd.C8120g f79345e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12252l(jvd.C8120g c8120g, rsg rsgVar, boolean z, zd7 zd7Var, jvd.C8120g c8120g2) {
            super(1);
            this.f79341a = c8120g;
            this.f79342b = rsgVar;
            this.f79343c = z;
            this.f79344d = zd7Var;
            this.f79345e = c8120g2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m32194invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m32194invokek4lQ0M(long j) {
            this.f79341a.f52109a = uwe.m32665getAdjustedCoordinatesk4lQ0M(this.f79342b.m32180getHandlePositiontuRUvjQ(this.f79343c));
            this.f79342b.m32189updateHandleDraggingUv8p0NA(this.f79344d, this.f79341a.f52109a);
            this.f79345e.f52109a = izb.f49009b.m30445getZeroF1C5BW0();
            this.f79342b.f79245t = -1;
        }
    }

    /* JADX INFO: renamed from: rsg$m */
    public static final class C12253m extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8120g f79346a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rsg f79347b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8120g f79348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12253m(jvd.C8120g c8120g, rsg rsgVar, jvd.C8120g c8120g2) {
            super(0);
            this.f79346a = c8120g;
            this.f79347b = rsgVar;
            this.f79348c = c8120g2;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            rsg.detectSelectionHandleDragGestures$onDragStop$5(this.f79346a, this.f79347b, this.f79348c);
        }
    }

    /* JADX INFO: renamed from: rsg$n */
    public static final class C12254n extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8120g f79349a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rsg f79350b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8120g f79351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12254n(jvd.C8120g c8120g, rsg rsgVar, jvd.C8120g c8120g2) {
            super(0);
            this.f79349a = c8120g;
            this.f79350b = rsgVar;
            this.f79351c = c8120g2;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            rsg.detectSelectionHandleDragGestures$onDragStop$5(this.f79349a, this.f79350b, this.f79351c);
        }
    }

    /* JADX INFO: renamed from: rsg$o */
    public static final class C12255o extends tt8 implements gz6<h2d, izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8120g f79352a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rsg f79353b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zd7 f79354c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ jvd.C8120g f79355d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f79356e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12255o(jvd.C8120g c8120g, rsg rsgVar, zd7 zd7Var, jvd.C8120g c8120g2, boolean z) {
            super(2);
            this.f79352a = c8120g;
            this.f79353b = rsgVar;
            this.f79354c = zd7Var;
            this.f79355d = c8120g2;
            this.f79356e = z;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(h2d h2dVar, izb izbVar) {
            m32195invokeUv8p0NA(h2dVar, izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final void m32195invokeUv8p0NA(@yfb h2d h2dVar, long j) {
            jvd.C8120g c8120g = this.f79352a;
            c8120g.f52109a = izb.m30434plusMKHz9U(c8120g.f52109a, j);
            hug layoutResult = this.f79353b.f79227b.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            this.f79353b.m32189updateHandleDraggingUv8p0NA(this.f79354c, izb.m30434plusMKHz9U(this.f79355d.f52109a, this.f79352a.f52109a));
            int iM30129getOffsetForPositionk4lQ0M = this.f79356e ? layoutResult.m30129getOffsetForPositionk4lQ0M(this.f79353b.m32188getHandleDragPositionF1C5BW0()) : jvg.m30593getStartimpl(this.f79353b.f79226a.getVisualText().m30568getSelectiond9O1mEE());
            int iM30588getEndimpl = this.f79356e ? jvg.m30588getEndimpl(this.f79353b.f79226a.getVisualText().m30568getSelectiond9O1mEE()) : layoutResult.m30129getOffsetForPositionk4lQ0M(this.f79353b.m32188getHandleDragPositionF1C5BW0());
            long jM30568getSelectiond9O1mEE = this.f79353b.f79226a.getVisualText().m30568getSelectiond9O1mEE();
            rsg rsgVar = this.f79353b;
            long jM21509a = rsg.m21509a(rsgVar, rsgVar.f79226a.getVisualText(), iM30129getOffsetForPositionk4lQ0M, iM30588getEndimpl, this.f79356e, mwe.f62568a.getCharacterWithWordAccelerate(), false, false, 96, null);
            if (jvg.m30587getCollapsedimpl(jM30568getSelectiond9O1mEE) || !jvg.m30587getCollapsedimpl(jM21509a)) {
                this.f79353b.f79226a.m30519selectCharsIn5zctL8(jM21509a);
            }
        }
    }

    /* JADX INFO: renamed from: rsg$p */
    public static final class C12256p extends tt8 implements ny6<String> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zd7 f79358b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12256p(zd7 zd7Var) {
            super(0);
            this.f79358b = zd7Var;
        }

        @Override // p000.ny6
        @yfb
        public final String invoke() {
            return "Selection Handle drag cancelled for draggingHandle: " + rsg.this.getDraggingHandle() + " definedOn: " + this.f79358b;
        }
    }

    /* JADX INFO: renamed from: rsg$q */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_CC_MATRIX_30}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12257q extends ugg implements kz6<pad, izb, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79359a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79360b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ long f79361c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ l5b f79362d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ rsg f79363e;

        /* JADX INFO: renamed from: rsg$q$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {504, 511}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79364a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f79365b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ pad f79366c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ rsg f79367d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ long f79368e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ l5b f79369f;

            /* JADX INFO: renamed from: rsg$q$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", m4010f = "TextFieldSelectionState.kt", m4011i = {1}, m4012l = {496, ymh.InterfaceC15728g.f102250i}, m4013m = "invokeSuspend", m4014n = {"press"}, m4015s = {"L$0"})
            public static final class C16520a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public Object f79370a;

                /* JADX INFO: renamed from: b */
                public int f79371b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ rsg f79372c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f79373d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ l5b f79374e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16520a(rsg rsgVar, long j, l5b l5bVar, zy2<? super C16520a> zy2Var) {
                    super(2, zy2Var);
                    this.f79372c = rsgVar;
                    this.f79373d = j;
                    this.f79374e = l5bVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new C16520a(this.f79372c, this.f79373d, this.f79374e, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((C16520a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
                @Override // p000.tq0
                @p000.gib
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r1 = r7.f79371b
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r4) goto L1f
                        if (r1 != r3) goto L17
                        java.lang.Object r0 = r7.f79370a
                        rad$b r0 = (p000.rad.C11972b) r0
                        p000.y7e.throwOnFailure(r8)
                        goto L5f
                    L17:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1f:
                        java.lang.Object r1 = r7.f79370a
                        rsg r1 = (p000.rsg) r1
                        p000.y7e.throwOnFailure(r8)
                        goto L47
                    L27:
                        p000.y7e.throwOnFailure(r8)
                        rsg r8 = r7.f79372c
                        rad$b r8 = p000.rsg.access$getPressInteraction$p(r8)
                        if (r8 == 0) goto L4a
                        l5b r1 = r7.f79374e
                        rsg r5 = r7.f79372c
                        rad$a r6 = new rad$a
                        r6.<init>(r8)
                        r7.f79370a = r5
                        r7.f79371b = r4
                        java.lang.Object r8 = r1.emit(r6, r7)
                        if (r8 != r0) goto L46
                        return r0
                    L46:
                        r1 = r5
                    L47:
                        p000.rsg.access$setPressInteraction$p(r1, r2)
                    L4a:
                        rad$b r8 = new rad$b
                        long r4 = r7.f79373d
                        r8.<init>(r4, r2)
                        l5b r1 = r7.f79374e
                        r7.f79370a = r8
                        r7.f79371b = r3
                        java.lang.Object r1 = r1.emit(r8, r7)
                        if (r1 != r0) goto L5e
                        return r0
                    L5e:
                        r0 = r8
                    L5f:
                        rsg r8 = r7.f79372c
                        p000.rsg.access$setPressInteraction$p(r8, r0)
                        bth r8 = p000.bth.f14751a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.rsg.C12257q.a.C16520a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(pad padVar, rsg rsgVar, long j, l5b l5bVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f79366c = padVar;
                this.f79367d = rsgVar;
                this.f79368e = j;
                this.f79369f = l5bVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f79366c, this.f79367d, this.f79368e, this.f79369f, zy2Var);
                aVar.f79365b = obj;
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
                int i = this.f79364a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    fg1.launch$default((x13) this.f79365b, null, null, new C16520a(this.f79367d, this.f79368e, this.f79369f, null), 3, null);
                    pad padVar = this.f79366c;
                    this.f79364a = 1;
                    obj = padVar.tryAwaitRelease(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                        this.f79367d.f79246u = null;
                        return bth.f14751a;
                    }
                    y7e.throwOnFailure(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rad.C11972b c11972b = this.f79367d.f79246u;
                if (c11972b != null) {
                    l5b l5bVar = this.f79369f;
                    p98 c11973c = zBooleanValue ? new rad.C11973c(c11972b) : new rad.C11971a(c11972b);
                    this.f79364a = 2;
                    if (l5bVar.emit(c11973c, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f79367d.f79246u = null;
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12257q(l5b l5bVar, rsg rsgVar, zy2<? super C12257q> zy2Var) {
            super(3, zy2Var);
            this.f79362d = l5bVar;
            this.f79363e = rsgVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(pad padVar, izb izbVar, zy2<? super bth> zy2Var) {
            return m32196invoked4ec7I(padVar, izbVar.m30439unboximpl(), zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m32196invoked4ec7I(@yfb pad padVar, long j, @gib zy2<? super bth> zy2Var) {
            C12257q c12257q = new C12257q(this.f79362d, this.f79363e, zy2Var);
            c12257q.f79360b = padVar;
            c12257q.f79361c = j;
            return c12257q.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f79359a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                pad padVar = (pad) this.f79360b;
                long j = this.f79361c;
                l5b l5bVar = this.f79362d;
                if (l5bVar != null) {
                    a aVar = new a(padVar, this.f79363e, j, l5bVar, null);
                    this.f79359a = 1;
                    if (y13.coroutineScope(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: rsg$r */
    public static final class C12258r extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f79375a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rsg f79376b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ny6<bth> f79377c;

        /* JADX INFO: renamed from: rsg$r$a */
        public static final class a extends tt8 implements ny6<String> {

            /* JADX INFO: renamed from: a */
            public static final a f79378a = new a();

            public a() {
                super(0);
            }

            @Override // p000.ny6
            @yfb
            public final String invoke() {
                return "onTapTextField";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12258r(ny6<bth> ny6Var, rsg rsgVar, ny6<bth> ny6Var2) {
            super(1);
            this.f79375a = ny6Var;
            this.f79376b = rsgVar;
            this.f79377c = ny6Var2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m32197invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m32197invokek4lQ0M(long j) {
            ssg.logDebug(a.f79378a);
            this.f79375a.invoke();
            if (this.f79376b.f79229d && this.f79376b.isFocused()) {
                if (!this.f79376b.f79230e) {
                    this.f79377c.invoke();
                    if (this.f79376b.f79226a.getVisualText().length() > 0) {
                        this.f79376b.setShowCursorHandle(true);
                    }
                }
                this.f79376b.updateTextToolbarState(cwg.None);
                long jM30894coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release = this.f79376b.f79227b.m30894coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j);
                rsg rsgVar = this.f79376b;
                rsgVar.m32184placeCursorAtNearestOffsetk4lQ0M(mug.m31050fromDecorationToTextLayoutUv8p0NA(rsgVar.f79227b, jM30894coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release));
            }
        }
    }

    /* JADX INFO: renamed from: rsg$s */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", m4010f = "TextFieldSelectionState.kt", m4011i = {0}, m4012l = {455}, m4013m = "invokeSuspend", m4014n = {"$this$awaitPointerEventScope"}, m4015s = {"L$0"})
    public static final class C12259s extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79379a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79380b;

        public C12259s(zy2<? super C12259s> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12259s c12259s = rsg.this.new C12259s(zy2Var);
            c12259s.f79380b = obj;
            return c12259s;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C12259s) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r4.f79379a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.f79380b
                gn0 r1 = (p000.gn0) r1
                p000.y7e.throwOnFailure(r5)
                goto L30
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                p000.y7e.throwOnFailure(r5)
                java.lang.Object r5 = r4.f79380b
                gn0 r5 = (p000.gn0) r5
                r1 = r5
            L23:
                v1d r5 = p000.v1d.Initial
                r4.f79380b = r1
                r4.f79379a = r2
                java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                if (r5 != r0) goto L30
                return r0
            L30:
                t1d r5 = (p000.t1d) r5
                rsg r3 = p000.rsg.this
                boolean r5 = p000.rwe.isPrecisePointer(r5)
                r5 = r5 ^ r2
                r3.setInTouchMode(r5)
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.rsg.C12259s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: rsg$t */
    @dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$menuItem$1\n*L\n1#1,1542:1\n*E\n"})
    public static final class C12260t extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f79382a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rsg f79383b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cwg f79384c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12260t(ny6<bth> ny6Var, rsg rsgVar, cwg cwgVar) {
            super(0);
            this.f79382a = ny6Var;
            this.f79383b = rsgVar;
            this.f79384c = cwgVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f79382a.invoke();
            this.f79383b.updateTextToolbarState(this.f79384c);
        }
    }

    /* JADX INFO: renamed from: rsg$u */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", m4010f = "TextFieldSelectionState.kt", m4011i = {0}, m4012l = {423}, m4013m = "observeChanges", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C12261u extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f79385a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79386b;

        /* JADX INFO: renamed from: d */
        public int f79388d;

        public C12261u(zy2<? super C12261u> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f79386b = obj;
            this.f79388d |= Integer.MIN_VALUE;
            return rsg.this.observeChanges(this);
        }
    }

    /* JADX INFO: renamed from: rsg$v */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12262v extends ugg implements gz6<x13, zy2<? super jj8>, Object> {

        /* JADX INFO: renamed from: a */
        public int f79389a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f79390b;

        /* JADX INFO: renamed from: rsg$v$a */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$1", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {424}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79392a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rsg f79393b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(rsg rsgVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f79393b = rsgVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f79393b, zy2Var);
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
                int i = this.f79392a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    rsg rsgVar = this.f79393b;
                    this.f79392a = 1;
                    if (rsgVar.observeTextChanges(this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: rsg$v$b */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$2", m4010f = "TextFieldSelectionState.kt", m4011i = {}, m4012l = {ymh.InterfaceC15724c.f102181w}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f79394a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rsg f79395b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(rsg rsgVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f79395b = rsgVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f79395b, zy2Var);
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
                int i = this.f79394a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    rsg rsgVar = this.f79395b;
                    this.f79394a = 1;
                    if (rsgVar.observeTextToolbarVisibility(this) == coroutine_suspended) {
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

        public C12262v(zy2<? super C12262v> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C12262v c12262v = rsg.this.new C12262v(zy2Var);
            c12262v.f79390b = obj;
            return c12262v;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super jj8> zy2Var) {
            return ((C12262v) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f79389a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            x13 x13Var = (x13) this.f79390b;
            fg1.launch$default(x13Var, null, null, new a(rsg.this, null), 3, null);
            return fg1.launch$default(x13Var, null, null, new b(rsg.this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: rsg$w */
    public static final class C12263w extends tt8 implements ny6<jrg> {
        public C12263w() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final jrg invoke() {
            return rsg.this.f79226a.getVisualText();
        }
    }

    /* JADX INFO: renamed from: rsg$x */
    public /* synthetic */ class C12264x extends n07 implements gz6<jrg, CharSequence, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C12264x f79397a = new C12264x();

        public C12264x() {
            super(2, jrg.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // p000.gz6
        @yfb
        public final Boolean invoke(@yfb jrg jrgVar, @yfb CharSequence charSequence) {
            return Boolean.valueOf(jrgVar.contentEquals(charSequence));
        }
    }

    /* JADX INFO: renamed from: rsg$y */
    public static final class C12265y<T> implements t66 {
        public C12265y() {
        }

        @Override // p000.t66
        public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
            return emit((jrg) obj, (zy2<? super bth>) zy2Var);
        }

        @gib
        public final Object emit(@yfb jrg jrgVar, @yfb zy2<? super bth> zy2Var) {
            rsg.this.setShowCursorHandle(false);
            rsg.this.updateTextToolbarState(cwg.None);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: rsg$z */
    @dwf({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$observeTextToolbarVisibility$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1542:1\n1#2:1543\n*E\n"})
    public static final class C12266z extends tt8 implements ny6<rud> {
        public C12266z() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final rud invoke() {
            rud rudVarIntersect;
            boolean zM30587getCollapsedimpl = jvg.m30587getCollapsedimpl(rsg.this.f79226a.getVisualText().m30568getSelectiond9O1mEE());
            if (((!zM30587getCollapsedimpl || rsg.this.getTextToolbarState() != cwg.Cursor) && (zM30587getCollapsedimpl || rsg.this.getTextToolbarState() != cwg.Selection)) || rsg.this.getDraggingHandle() != null || !rsg.this.isInTouchMode()) {
                return rud.f79687e.getZero();
            }
            mv8 textLayoutCoordinates = rsg.this.getTextLayoutCoordinates();
            rud rudVarVisibleBounds = textLayoutCoordinates != null ? axe.visibleBounds(textLayoutCoordinates) : null;
            if (rudVarVisibleBounds == null) {
                return rud.f79687e.getZero();
            }
            mv8 textLayoutCoordinates2 = rsg.this.getTextLayoutCoordinates();
            izb izbVarM30418boximpl = textLayoutCoordinates2 != null ? izb.m30418boximpl(textLayoutCoordinates2.mo30036localToRootMKHz9U(rudVarVisibleBounds.m32208getTopLeftF1C5BW0())) : null;
            md8.checkNotNull(izbVarM30418boximpl);
            rud rudVarM33303Recttz77jQw = xud.m33303Recttz77jQw(izbVarM30418boximpl.m30439unboximpl(), rudVarVisibleBounds.m32206getSizeNHjbRc());
            rud contentRect = rsg.this.getContentRect();
            rud rudVar = rudVarM33303Recttz77jQw.overlaps(contentRect) ? contentRect : null;
            return (rudVar == null || (rudVarIntersect = rudVar.intersect(rudVarM33303Recttz77jQw)) == null) ? rud.f79687e.getZero() : rudVarIntersect;
        }
    }

    public rsg(@yfb jeh jehVar, @yfb lug lugVar, @yfb c64 c64Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f79226a = jehVar;
        this.f79227b = lugVar;
        this.f79228c = c64Var;
        this.f79229d = z;
        this.f79230e = z2;
        this.f79231f = z3;
        this.f79232g = z4;
        izb.C7673a c7673a = izb.f49009b;
        this.f79238m = xtf.mutableStateOf$default(izb.m30418boximpl(c7673a.m30444getUnspecifiedF1C5BW0()), null, 2, null);
        this.f79239n = xtf.mutableStateOf$default(izb.m30418boximpl(c7673a.m30444getUnspecifiedF1C5BW0()), null, 2, null);
        this.f79240o = xtf.mutableStateOf$default(null, null, 2, null);
        this.f79241p = xtf.mutableStateOf$default(EnumC12235a.None, null, 2, null);
        this.f79242q = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f79243r = xtf.mutableStateOf$default(cwg.None, null, 2, null);
        this.f79245t = -1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ long m21509a(rsg rsgVar, jrg jrgVar, int i, int i2, boolean z, mwe mweVar, boolean z2, boolean z3, int i3, Object obj) {
        return rsgVar.m32187updateSelectionSsLRf8(jrgVar, i, i2, z, mweVar, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3);
    }

    public static /* synthetic */ void copy$default(rsg rsgVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        rsgVar.copy(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object detectCursorHandleDragGestures(p000.s2d r10, p000.zy2<? super p000.bth> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p000.rsg.C12245f
            if (r0 == 0) goto L14
            r0 = r11
            rsg$f r0 = (p000.rsg.C12245f) r0
            int r1 = r0.f79318f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f79318f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            rsg$f r0 = new rsg$f
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f79316d
            java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r1 = r6.f79318f
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L39
            java.lang.Object r10 = r6.f79315c
            jvd$g r10 = (p000.jvd.C8120g) r10
            java.lang.Object r0 = r6.f79314b
            jvd$g r0 = (p000.jvd.C8120g) r0
            java.lang.Object r1 = r6.f79313a
            rsg r1 = (p000.rsg) r1
            p000.y7e.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L37
            goto L87
        L37:
            r11 = move-exception
            goto L92
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            p000.y7e.throwOnFailure(r11)
            jvd$g r11 = new jvd$g
            r11.<init>()
            izb$a r1 = p000.izb.f49009b
            long r3 = r1.m30444getUnspecifiedF1C5BW0()
            r11.f52109a = r3
            jvd$g r7 = new jvd$g
            r7.<init>()
            long r3 = r1.m30444getUnspecifiedF1C5BW0()
            r7.f52109a = r3
            rsg$g r3 = new rsg$g     // Catch: java.lang.Throwable -> L8d
            r3.<init>(r11, r9, r7)     // Catch: java.lang.Throwable -> L8d
            rsg$h r4 = new rsg$h     // Catch: java.lang.Throwable -> L8d
            r4.<init>(r11, r7, r9)     // Catch: java.lang.Throwable -> L8d
            rsg$i r5 = new rsg$i     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r11, r7, r9)     // Catch: java.lang.Throwable -> L8d
            rsg$j r8 = new rsg$j     // Catch: java.lang.Throwable -> L8d
            r8.<init>(r7, r9, r11)     // Catch: java.lang.Throwable -> L8d
            r6.f79313a = r9     // Catch: java.lang.Throwable -> L8d
            r6.f79314b = r11     // Catch: java.lang.Throwable -> L8d
            r6.f79315c = r7     // Catch: java.lang.Throwable -> L8d
            r6.f79318f = r2     // Catch: java.lang.Throwable -> L8d
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.lang.Object r10 = p000.ho4.detectDragGestures(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8d
            if (r10 != r0) goto L84
            return r0
        L84:
            r1 = r9
            r0 = r11
            r10 = r7
        L87:
            detectCursorHandleDragGestures$onDragStop(r0, r10, r1)
            bth r10 = p000.bth.f14751a
            return r10
        L8d:
            r10 = move-exception
            r1 = r9
            r0 = r11
            r11 = r10
            r10 = r7
        L92:
            detectCursorHandleDragGestures$onDragStop(r0, r10, r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rsg.detectCursorHandleDragGestures(s2d, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectCursorHandleDragGestures$onDragStop(jvd.C8120g c8120g, jvd.C8120g c8120g2, rsg rsgVar) {
        if (mzb.m31100isSpecifiedk4lQ0M(c8120g.f52109a)) {
            izb.C7673a c7673a = izb.f49009b;
            c8120g.f52109a = c7673a.m30444getUnspecifiedF1C5BW0();
            c8120g2.f52109a = c7673a.m30444getUnspecifiedF1C5BW0();
            rsgVar.clearHandleDragging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object detectSelectionHandleDragGestures(p000.s2d r18, boolean r19, p000.zy2<? super p000.bth> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rsg.detectSelectionHandleDragGestures(s2d, boolean, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectSelectionHandleDragGestures$onDragStop$5(jvd.C8120g c8120g, rsg rsgVar, jvd.C8120g c8120g2) {
        if (mzb.m31100isSpecifiedk4lQ0M(c8120g.f52109a)) {
            rsgVar.clearHandleDragging();
            izb.C7673a c7673a = izb.f49009b;
            c8120g.f52109a = c7673a.m30444getUnspecifiedF1C5BW0();
            c8120g2.f52109a = c7673a.m30445getZeroF1C5BW0();
            rsgVar.f79245t = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rud getContentRect() {
        float fM30430getYimpl;
        rud cursorRect;
        rud cursorRect2;
        jrg visualText = this.f79226a.getVisualText();
        if (jvg.m30587getCollapsedimpl(visualText.m30568getSelectiond9O1mEE())) {
            rud cursorRect3 = getCursorRect();
            mv8 textLayoutCoordinates = getTextLayoutCoordinates();
            return xud.m33303Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo30036localToRootMKHz9U(cursorRect3.m32208getTopLeftF1C5BW0()) : izb.f49009b.m30445getZeroF1C5BW0(), cursorRect3.m32206getSizeNHjbRc());
        }
        mv8 textLayoutCoordinates2 = getTextLayoutCoordinates();
        long jMo30036localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo30036localToRootMKHz9U(m32180getHandlePositiontuRUvjQ(true)) : izb.f49009b.m30445getZeroF1C5BW0();
        mv8 textLayoutCoordinates3 = getTextLayoutCoordinates();
        long jMo30036localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo30036localToRootMKHz9U(m32180getHandlePositiontuRUvjQ(false)) : izb.f49009b.m30445getZeroF1C5BW0();
        mv8 textLayoutCoordinates4 = getTextLayoutCoordinates();
        float fM30430getYimpl2 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            hug layoutResult = this.f79227b.getLayoutResult();
            fM30430getYimpl = izb.m30430getYimpl(textLayoutCoordinates4.mo30036localToRootMKHz9U(mzb.Offset(0.0f, (layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(jvg.m30593getStartimpl(visualText.m30568getSelectiond9O1mEE()))) == null) ? 0.0f : cursorRect2.getTop())));
        } else {
            fM30430getYimpl = 0.0f;
        }
        mv8 textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            hug layoutResult2 = this.f79227b.getLayoutResult();
            fM30430getYimpl2 = izb.m30430getYimpl(textLayoutCoordinates5.mo30036localToRootMKHz9U(mzb.Offset(0.0f, (layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(jvg.m30588getEndimpl(visualText.m30568getSelectiond9O1mEE()))) == null) ? 0.0f : cursorRect.getTop())));
        }
        return new rud(Math.min(izb.m30429getXimpl(jMo30036localToRootMKHz9U), izb.m30429getXimpl(jMo30036localToRootMKHz9U2)), Math.min(fM30430getYimpl, fM30430getYimpl2), Math.max(izb.m30429getXimpl(jMo30036localToRootMKHz9U), izb.m30429getXimpl(jMo30036localToRootMKHz9U2)), Math.max(izb.m30430getYimpl(jMo30036localToRootMKHz9U), izb.m30430getYimpl(jMo30036localToRootMKHz9U2)));
    }

    /* JADX INFO: renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m32179getCurrentTextLayoutPositionInWindowF1C5BW0() {
        mv8 textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? nv8.positionInWindow(textLayoutCoordinates) : izb.f49009b.m30444getUnspecifiedF1C5BW0();
    }

    private final boolean getEditable() {
        return this.f79229d && !this.f79230e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m32180getHandlePositiontuRUvjQ(boolean z) {
        hug layoutResult = this.f79227b.getLayoutResult();
        if (layoutResult == null) {
            return izb.f49009b.m30445getZeroF1C5BW0();
        }
        long jM30568getSelectiond9O1mEE = this.f79226a.getVisualText().m30568getSelectiond9O1mEE();
        return uvg.getSelectionHandleCoordinates(layoutResult, z ? jvg.m30593getStartimpl(jM30568getSelectiond9O1mEE) : jvg.m30588getEndimpl(jM30568getSelectiond9O1mEE), z, jvg.m30592getReversedimpl(jM30568getSelectiond9O1mEE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m32181getRawHandleDragPositionF1C5BW0() {
        return ((izb) this.f79239n.getValue()).m30439unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowCursorHandle() {
        return ((Boolean) this.f79242q.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m32182getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((izb) this.f79238m.getValue()).m30439unboximpl();
    }

    /* JADX INFO: renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m32183getTextFieldSelectionqeG_v_k(int i, int i2, jvg jvgVar, boolean z, mwe mweVar) {
        hug layoutResult = this.f79227b.getLayoutResult();
        if (layoutResult == null) {
            return jvg.f52112b.m30598getZerod9O1mEE();
        }
        if (jvgVar == null && md8.areEqual(mweVar, mwe.f62568a.getCharacter())) {
            return kvg.TextRange(i, i2);
        }
        vwe vweVarM33326getTextFieldSelectionLayoutRcvTLA = xwe.m33326getTextFieldSelectionLayoutRcvTLA(layoutResult, i, i2, this.f79245t, jvgVar != null ? jvgVar.m30597unboximpl() : jvg.f52112b.m30598getZerod9O1mEE(), jvgVar == null, z);
        if (jvgVar != null && !vweVarM33326getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.f79244s)) {
            return jvgVar.m30597unboximpl();
        }
        long jM29875toTextRanged9O1mEE = mweVar.adjust(vweVarM33326getTextFieldSelectionLayoutRcvTLA).m29875toTextRanged9O1mEE();
        this.f79244s = vweVarM33326getTextFieldSelectionLayoutRcvTLA;
        if (!z) {
            i = i2;
        }
        this.f79245t = i;
        return jM29875toTextRanged9O1mEE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mv8 getTextLayoutCoordinates() {
        mv8 textLayoutNodeCoordinates = this.f79227b.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final cwg getTextToolbarState() {
        return (cwg) this.f79243r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTextToolbar() {
        awg awgVar;
        awg awgVar2 = this.f79234i;
        if ((awgVar2 != null ? awgVar2.getStatus() : null) != dwg.Shown || (awgVar = this.f79234i) == null) {
            return;
        }
        awgVar.hide();
    }

    private final boolean isCursorHandleInVisibleBounds() {
        rud rudVarVisibleBounds;
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long jM32200getBottomCenterF1C5BW0 = getCursorRect().m32200getBottomCenterF1C5BW0();
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            mv8 textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates == null || (rudVarVisibleBounds = axe.visibleBounds(textLayoutCoordinates)) == null) {
                return false;
            }
            return axe.m27906containsInclusiveUv8p0NA(rudVarVisibleBounds, jM32200getBottomCenterF1C5BW0);
        } catch (Throwable th) {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        m32186setStartTextLayoutPositionInWindowk4lQ0M(m32179getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    private final ny6<bth> menuItem(boolean z, cwg cwgVar, ny6<bth> ny6Var) {
        if (z) {
            return new C12260t(ny6Var, this, cwgVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextChanges(zy2<? super bth> zy2Var) {
        Object objCollect = c76.drop(c76.distinctUntilChanged(stf.snapshotFlow(new C12263w()), C12264x.f79397a), 1).collect(new C12265y(), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(zy2<? super bth> zy2Var) {
        Object objCollect = stf.snapshotFlow(new C12266z()).collect(new C12236a0(), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    private final void pasteAsPlainText() {
        C9041lz text;
        String text2;
        a52 a52Var = this.f79235j;
        if (a52Var == null || (text = a52Var.getText()) == null || (text2 = text.getText()) == null) {
            return;
        }
        jeh.replaceSelectedText$default(this.f79226a, text2, false, urg.NeverMerge, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public final boolean m32184placeCursorAtNearestOffsetk4lQ0M(long j) {
        int iM30129getOffsetForPositionk4lQ0M;
        int iM30593getStartimpl;
        hug layoutResult = this.f79227b.getLayoutResult();
        if (layoutResult == null || (iM30129getOffsetForPositionk4lQ0M = layoutResult.m30129getOffsetForPositionk4lQ0M(j)) == -1) {
            return false;
        }
        jeh jehVar = this.f79226a;
        long jM30514mapFromTransformedjx7JFs = jehVar.m30514mapFromTransformedjx7JFs(iM30129getOffsetForPositionk4lQ0M);
        long jM30517mapToTransformedGEjPoXI = jehVar.m30517mapToTransformedGEjPoXI(jM30514mapFromTransformedjx7JFs);
        int i = C12241d.f79292a[((jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) && jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? o08.Untransformed : (jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) || jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? (!jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) || jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? o08.Deletion : o08.Insertion : o08.Replacement).ordinal()];
        hxe hxeVar = null;
        if (i == 1 || i == 2) {
            iM30593getStartimpl = jvg.m30593getStartimpl(jM30514mapFromTransformedjx7JFs);
        } else if (i == 3) {
            hxeVar = w3a.m32866findClosestRect9KIMszo(j, layoutResult.getCursorRect(jvg.m30593getStartimpl(jM30517mapToTransformedGEjPoXI)), layoutResult.getCursorRect(jvg.m30588getEndimpl(jM30517mapToTransformedGEjPoXI))) < 0 ? new hxe(hki.Start) : new hxe(hki.End);
            iM30593getStartimpl = jvg.m30593getStartimpl(jM30514mapFromTransformedjx7JFs);
        } else {
            if (i != 4) {
                throw new ceb();
            }
            iM30593getStartimpl = w3a.m32866findClosestRect9KIMszo(j, layoutResult.getCursorRect(jvg.m30593getStartimpl(jM30517mapToTransformedGEjPoXI)), layoutResult.getCursorRect(jvg.m30588getEndimpl(jM30517mapToTransformedGEjPoXI))) < 0 ? jvg.m30593getStartimpl(jM30514mapFromTransformedjx7JFs) : jvg.m30588getEndimpl(jM30514mapFromTransformedjx7JFs);
        }
        long jTextRange = kvg.TextRange(iM30593getStartimpl);
        if (jvg.m30586equalsimpl0(jTextRange, this.f79226a.getUntransformedText().m30568getSelectiond9O1mEE()) && (hxeVar == null || md8.areEqual(hxeVar, this.f79226a.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.f79226a.m30520selectUntransformedCharsIn5zctL8(jTextRange);
        if (hxeVar != null) {
            this.f79226a.setSelectionWedgeAffinity(hxeVar);
        }
        return true;
    }

    /* JADX INFO: renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m32185setRawHandleDragPositionk4lQ0M(long j) {
        this.f79239n.setValue(izb.m30418boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCursorHandle(boolean z) {
        this.f79242q.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m32186setStartTextLayoutPositionInWindowk4lQ0M(long j) {
        this.f79238m.setValue(izb.m30418boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(cwg cwgVar) {
        this.f79243r.setValue(cwgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTextToolbar(rud rudVar) {
        awg awgVar = this.f79234i;
        if (awgVar != null) {
            boolean zCanCopy = canCopy();
            cwg cwgVar = cwg.None;
            awgVar.showMenu(rudVar, !zCanCopy ? null : new C12240c0(cwgVar, this), !canPaste() ? null : new C12242d0(cwgVar, this), !canCut() ? null : new C12244e0(cwgVar, this), !canSelectAll() ? null : new C12246f0(cwg.Selection, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateSelection-SsL-Rf8, reason: not valid java name */
    public final long m32187updateSelectionSsLRf8(jrg jrgVar, int i, int i2, boolean z, mwe mweVar, boolean z2, boolean z3) {
        lg7 lg7Var;
        jvg jvgVarM30581boximpl = jvg.m30581boximpl(jrgVar.m30568getSelectiond9O1mEE());
        long jM30597unboximpl = jvgVarM30581boximpl.m30597unboximpl();
        if (z3 || (!z2 && jvg.m30587getCollapsedimpl(jM30597unboximpl))) {
            jvgVarM30581boximpl = null;
        }
        long jM32183getTextFieldSelectionqeG_v_k = m32183getTextFieldSelectionqeG_v_k(i, i2, jvgVarM30581boximpl, z, mweVar);
        if (jvg.m30586equalsimpl0(jM32183getTextFieldSelectionqeG_v_k, jrgVar.m30568getSelectiond9O1mEE())) {
            return jM32183getTextFieldSelectionqeG_v_k;
        }
        boolean z4 = jvg.m30592getReversedimpl(jM32183getTextFieldSelectionqeG_v_k) != jvg.m30592getReversedimpl(jrgVar.m30568getSelectiond9O1mEE()) && jvg.m30586equalsimpl0(kvg.TextRange(jvg.m30588getEndimpl(jM32183getTextFieldSelectionqeG_v_k), jvg.m30593getStartimpl(jM32183getTextFieldSelectionqeG_v_k)), jrgVar.m30568getSelectiond9O1mEE());
        if (isInTouchMode() && !z4 && (lg7Var = this.f79233h) != null) {
            lg7Var.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
        }
        return jM32183getTextFieldSelectionqeG_v_k;
    }

    public final boolean canCopy() {
        return (jvg.m30587getCollapsedimpl(this.f79226a.getVisualText().m30568getSelectiond9O1mEE()) || this.f79232g) ? false : true;
    }

    public final boolean canCut() {
        return (jvg.m30587getCollapsedimpl(this.f79226a.getVisualText().m30568getSelectiond9O1mEE()) || !getEditable() || this.f79232g) ? false : true;
    }

    public final boolean canPaste() {
        if (!getEditable()) {
            return false;
        }
        a52 a52Var = this.f79235j;
        if (a52Var != null && a52Var.hasText()) {
            return true;
        }
        ny6<? extends isd> ny6Var = this.f79237l;
        if ((ny6Var != null ? ny6Var.invoke() : null) == null) {
            return false;
        }
        a52 a52Var2 = this.f79235j;
        return (a52Var2 != null ? a52Var2.getClip() : null) != null;
    }

    public final boolean canSelectAll() {
        return jvg.m30589getLengthimpl(this.f79226a.getVisualText().m30568getSelectiond9O1mEE()) != this.f79226a.getVisualText().length();
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        izb.C7673a c7673a = izb.f49009b;
        m32185setRawHandleDragPositionk4lQ0M(c7673a.m30444getUnspecifiedF1C5BW0());
        m32186setStartTextLayoutPositionInWindowk4lQ0M(c7673a.m30444getUnspecifiedF1C5BW0());
    }

    public final void copy(boolean z) {
        jrg visualText = this.f79226a.getVisualText();
        if (jvg.m30587getCollapsedimpl(visualText.m30568getSelectiond9O1mEE())) {
            return;
        }
        a52 a52Var = this.f79235j;
        if (a52Var != null) {
            a52Var.setText(new C9041lz(krg.getSelectedText(visualText).toString(), null, null, 6, null));
        }
        if (z) {
            this.f79226a.collapseSelectionToMax();
        }
    }

    @gib
    public final Object cursorHandleGestures(@yfb s2d s2dVar, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C12243e(s2dVar, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    public final void cut() {
        jrg visualText = this.f79226a.getVisualText();
        if (jvg.m30587getCollapsedimpl(visualText.m30568getSelectiond9O1mEE())) {
            return;
        }
        a52 a52Var = this.f79235j;
        if (a52Var != null) {
            a52Var.setText(new C9041lz(krg.getSelectedText(visualText).toString(), null, null, 6, null));
        }
        this.f79226a.deleteSelectedText();
    }

    public final void deselect() {
        if (!jvg.m30587getCollapsedimpl(this.f79226a.getVisualText().m30568getSelectiond9O1mEE())) {
            this.f79226a.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(cwg.None);
    }

    @gib
    public final Object detectTextFieldTapGestures(@yfb s2d s2dVar, @gib l5b l5bVar, @yfb ny6<bth> ny6Var, @yfb ny6<bth> ny6Var2, @yfb zy2<? super bth> zy2Var) {
        Object objDetectTapAndPress = dmg.detectTapAndPress(s2dVar, new C12257q(l5bVar, this, null), new C12258r(ny6Var, this, ny6Var2), zy2Var);
        return objDetectTapAndPress == pd8.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : bth.f14751a;
    }

    @gib
    public final Object detectTouchMode(@yfb s2d s2dVar, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitPointerEventScope = s2dVar.awaitPointerEventScope(new C12259s(null), zy2Var);
        return objAwaitPointerEventScope == pd8.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : bth.f14751a;
    }

    public final void dispose() {
        hideTextToolbar();
        this.f79234i = null;
        this.f79235j = null;
        this.f79233h = null;
    }

    @yfb
    public final xrg getCursorHandleState$foundation_release(boolean z) {
        jrg visualText = this.f79226a.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z2 = getDirectDragGestureInitiator() == EnumC12235a.None;
        zd7 draggingHandle = getDraggingHandle();
        if (showCursorHandle && z2 && jvg.m30587getCollapsedimpl(visualText.m30568getSelectiond9O1mEE()) && visualText.shouldShowSelection() && visualText.length() > 0 && (draggingHandle == zd7.Cursor || isCursorHandleInVisibleBounds())) {
            return new xrg(true, z ? getCursorRect().m32200getBottomCenterF1C5BW0() : izb.f49009b.m30444getUnspecifiedF1C5BW0(), q5e.Ltr, false, null);
        }
        return xrg.f99072e.getHidden();
    }

    @yfb
    public final rud getCursorRect() {
        hug layoutResult = this.f79227b.getLayoutResult();
        if (layoutResult == null) {
            return rud.f79687e.getZero();
        }
        jrg visualText = this.f79226a.getVisualText();
        if (!jvg.m30587getCollapsedimpl(visualText.m30568getSelectiond9O1mEE())) {
            return rud.f79687e.getZero();
        }
        rud cursorRect = layoutResult.getCursorRect(jvg.m30593getStartimpl(visualText.m30568getSelectiond9O1mEE()));
        float fMo27173toPx0680j_4 = this.f79228c.mo27173toPx0680j_4(nrg.getDefaultCursorThickness());
        float left = layoutResult.getLayoutInput().getLayoutDirection() == ov8.Ltr ? cursorRect.getLeft() + (fMo27173toPx0680j_4 / 2) : cursorRect.getRight() - (fMo27173toPx0680j_4 / 2);
        float f = fMo27173toPx0680j_4 / 2;
        float fCoerceAtLeast = kpd.coerceAtLeast(kpd.coerceAtMost(left, r78.m32087getWidthimpl(layoutResult.m30130getSizeYbymL2g()) - f), f);
        return new rud(fCoerceAtLeast - f, cursorRect.getTop(), fCoerceAtLeast + f, cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final EnumC12235a getDirectDragGestureInitiator() {
        return (EnumC12235a) this.f79241p.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final zd7 getDraggingHandle() {
        return (zd7) this.f79240o.getValue();
    }

    /* JADX INFO: renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m32188getHandleDragPositionF1C5BW0() {
        return mzb.m31102isUnspecifiedk4lQ0M(m32181getRawHandleDragPositionF1C5BW0()) ? izb.f49009b.m30444getUnspecifiedF1C5BW0() : mzb.m31102isUnspecifiedk4lQ0M(m32182getStartTextLayoutPositionInWindowF1C5BW0()) ? mug.m31050fromDecorationToTextLayoutUv8p0NA(this.f79227b, m32181getRawHandleDragPositionF1C5BW0()) : izb.m30434plusMKHz9U(m32181getRawHandleDragPositionF1C5BW0(), izb.m30433minusMKHz9U(m32182getStartTextLayoutPositionInWindowF1C5BW0(), m32179getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    @gib
    public final ny6<isd> getReceiveContentConfiguration() {
        return this.f79237l;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.xrg getSelectionHandleState$foundation_release(boolean r14, boolean r15) {
        /*
            r13 = this;
            if (r14 == 0) goto L5
            zd7 r0 = p000.zd7.SelectionStart
            goto L7
        L5:
            zd7 r0 = p000.zd7.SelectionEnd
        L7:
            lug r1 = r13.f79227b
            hug r1 = r1.getLayoutResult()
            if (r1 != 0) goto L16
            xrg$a r14 = p000.xrg.f99072e
            xrg r14 = r14.getHidden()
            return r14
        L16:
            jeh r2 = r13.f79226a
            jrg r2 = r2.getVisualText()
            long r2 = r2.m30568getSelectiond9O1mEE()
            boolean r4 = p000.jvg.m30587getCollapsedimpl(r2)
            if (r4 == 0) goto L2d
            xrg$a r14 = p000.xrg.f99072e
            xrg r14 = r14.getHidden()
            return r14
        L2d:
            long r4 = r13.m32180getHandlePositiontuRUvjQ(r14)
            rsg$a r6 = r13.getDirectDragGestureInitiator()
            rsg$a r7 = p000.rsg.EnumC12235a.None
            r8 = 1
            r9 = 0
            if (r6 != r7) goto L57
            zd7 r6 = r13.getDraggingHandle()
            if (r6 == r0) goto L55
            mv8 r0 = r13.getTextLayoutCoordinates()
            if (r0 == 0) goto L52
            rud r0 = p000.axe.visibleBounds(r0)
            if (r0 == 0) goto L52
            boolean r0 = p000.axe.m27906containsInclusiveUv8p0NA(r0, r4)
            goto L53
        L52:
            r0 = r9
        L53:
            if (r0 == 0) goto L57
        L55:
            r0 = r8
            goto L58
        L57:
            r0 = r9
        L58:
            if (r0 != 0) goto L61
            xrg$a r14 = p000.xrg.f99072e
            xrg r14 = r14.getHidden()
            return r14
        L61:
            jeh r0 = r13.f79226a
            jrg r0 = r0.getVisualText()
            boolean r0 = r0.shouldShowSelection()
            if (r0 != 0) goto L74
            xrg$a r14 = p000.xrg.f99072e
            xrg r14 = r14.getHidden()
            return r14
        L74:
            if (r14 == 0) goto L7b
            int r14 = p000.jvg.m30593getStartimpl(r2)
            goto L84
        L7b:
            int r14 = p000.jvg.m30588getEndimpl(r2)
            int r14 = r14 - r8
            int r14 = java.lang.Math.max(r14, r9)
        L84:
            q5e r10 = r1.getBidiRunDirection(r14)
            boolean r11 = p000.jvg.m30592getReversedimpl(r2)
            if (r15 == 0) goto La0
            mv8 r14 = r13.getTextLayoutCoordinates()
            if (r14 == 0) goto L9e
            rud r14 = p000.axe.visibleBounds(r14)
            if (r14 == 0) goto L9e
            long r4 = p000.mug.m31049coerceIn3MmeM6k(r4, r14)
        L9e:
            r8 = r4
            goto La7
        La0:
            izb$a r14 = p000.izb.f49009b
            long r4 = r14.m30444getUnspecifiedF1C5BW0()
            goto L9e
        La7:
            xrg r14 = new xrg
            r7 = 1
            r12 = 0
            r6 = r14
            r6.<init>(r7, r8, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rsg.getSelectionHandleState$foundation_release(boolean, boolean):xrg");
    }

    public final boolean isFocused() {
        return this.f79231f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.f79236k.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object observeChanges(@p000.yfb p000.zy2<? super p000.bth> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.rsg.C12261u
            if (r0 == 0) goto L13
            r0 = r6
            rsg$u r0 = (p000.rsg.C12261u) r0
            int r1 = r0.f79388d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79388d = r1
            goto L18
        L13:
            rsg$u r0 = new rsg$u
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f79386b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f79388d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f79385a
            rsg r0 = (p000.rsg) r0
            p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L2e:
            r6 = move-exception
            goto L60
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            p000.y7e.throwOnFailure(r6)
            rsg$v r6 = new rsg$v     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            r0.f79385a = r5     // Catch: java.lang.Throwable -> L5e
            r0.f79388d = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = p000.y13.coroutineScope(r6, r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            r0.setShowCursorHandle(r3)
            cwg r6 = r0.getTextToolbarState()
            cwg r1 = p000.cwg.None
            if (r6 == r1) goto L5b
            r0.hideTextToolbar()
        L5b:
            bth r6 = p000.bth.f14751a
            return r6
        L5e:
            r6 = move-exception
            r0 = r5
        L60:
            r0.setShowCursorHandle(r3)
            cwg r1 = r0.getTextToolbarState()
            cwg r2 = p000.cwg.None
            if (r1 == r2) goto L6e
            r0.hideTextToolbar()
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rsg.observeChanges(zy2):java.lang.Object");
    }

    public final void paste() {
        isd isdVarInvoke;
        u42 clip;
        u42 clipEntry;
        String plainText;
        ny6<? extends isd> ny6Var = this.f79237l;
        if (ny6Var == null || (isdVarInvoke = ny6Var.invoke()) == null) {
            pasteAsPlainText();
            return;
        }
        a52 a52Var = this.f79235j;
        if (a52Var == null || (clip = a52Var.getClip()) == null) {
            pasteAsPlainText();
            return;
        }
        sdh sdhVarOnReceive = isdVarInvoke.getReceiveContentListener().onReceive(new sdh(clip, clip.getClipMetadata(), sdh.C12541a.f81504b.m32307getClipboardkB6V9T0(), null, 8, null));
        if (sdhVarOnReceive == null || (clipEntry = sdhVarOnReceive.getClipEntry()) == null || (plainText = tdh.readPlainText(clipEntry)) == null) {
            return;
        }
        jeh.replaceSelectedText$default(this.f79226a, plainText, false, urg.NeverMerge, 2, null);
    }

    public final void selectAll() {
        this.f79226a.selectAll();
    }

    @gib
    public final Object selectionHandleGestures(@yfb s2d s2dVar, boolean z, @yfb zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C12238b0(s2dVar, z, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    public final void setDirectDragGestureInitiator(@yfb EnumC12235a enumC12235a) {
        this.f79241p.setValue(enumC12235a);
    }

    public final void setDraggingHandle(@gib zd7 zd7Var) {
        this.f79240o.setValue(zd7Var);
    }

    public final void setFocused(boolean z) {
        this.f79231f = z;
    }

    public final void setInTouchMode(boolean z) {
        this.f79236k.setValue(Boolean.valueOf(z));
    }

    public final void setReceiveContentConfiguration(@gib ny6<? extends isd> ny6Var) {
        this.f79237l = ny6Var;
    }

    @gib
    public final Object textFieldSelectionGestures(@yfb s2d s2dVar, @yfb ny6<bth> ny6Var, @yfb zy2<? super bth> zy2Var) {
        Object objSelectionGesturePointerInputBtf2 = rwe.selectionGesturePointerInputBtf2(s2dVar, new C12237b(ny6Var), new C12239c(ny6Var), zy2Var);
        return objSelectionGesturePointerInputBtf2 == pd8.getCOROUTINE_SUSPENDED() ? objSelectionGesturePointerInputBtf2 : bth.f14751a;
    }

    public final void update(@yfb lg7 lg7Var, @yfb a52 a52Var, @yfb awg awgVar, @yfb c64 c64Var, boolean z, boolean z2, boolean z3) {
        if (!z) {
            hideTextToolbar();
        }
        this.f79233h = lg7Var;
        this.f79235j = a52Var;
        this.f79234i = awgVar;
        this.f79228c = c64Var;
        this.f79229d = z;
        this.f79230e = z2;
        this.f79232g = z3;
    }

    /* JADX INFO: renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m32189updateHandleDraggingUv8p0NA(@yfb zd7 zd7Var, long j) {
        setDraggingHandle(zd7Var);
        m32185setRawHandleDragPositionk4lQ0M(j);
    }

    public final void updateTextToolbarState(@yfb cwg cwgVar) {
        setTextToolbarState(cwgVar);
    }
}
