package p000;

import android.view.KeyEvent;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0713b;
import androidx.compose.p002ui.focus.C0723l;
import androidx.compose.p002ui.focus.C0724m;
import androidx.compose.p002ui.input.key.C0743a;
import androidx.compose.p002ui.layout.C0763p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p000.C9041lz;
import p000.gwe;
import p000.izb;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,1073:1\n81#2:1074\n107#2,2:1075\n81#2:1077\n107#2,2:1078\n81#2:1080\n107#2,2:1081\n81#2:1083\n107#2,2:1084\n81#2:1086\n107#2,2:1087\n81#2:1089\n107#2,2:1090\n81#2:1092\n107#2,2:1093\n1#3:1095\n1#3:1146\n256#4,3:1096\n33#4,4:1099\n259#4,2:1103\n38#4:1105\n261#4:1106\n86#4,2:1107\n33#4,6:1109\n88#4:1115\n33#4,6:1116\n101#4,2:1122\n33#4,6:1124\n103#4:1130\n33#4,6:1132\n416#4,3:1138\n33#4,4:1141\n419#4:1145\n420#4:1147\n38#4:1148\n421#4:1149\n69#4,6:1150\n33#4,6:1156\n101#4,2:1162\n33#4,6:1164\n103#4:1170\n1240#5:1131\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n143#1:1074\n143#1:1075,2\n193#1:1077\n193#1:1078,2\n200#1:1080\n200#1:1081,2\n209#1:1083\n209#1:1084,2\n218#1:1086\n218#1:1087,2\n225#1:1089\n225#1:1090,2\n232#1:1092\n232#1:1093,2\n612#1:1146\n419#1:1096,3\n419#1:1099,4\n419#1:1103,2\n419#1:1105\n419#1:1106\n441#1:1107,2\n441#1:1109,6\n441#1:1115\n469#1:1116,6\n528#1:1122,2\n528#1:1124,6\n528#1:1130\n541#1:1132,6\n612#1:1138,3\n612#1:1141,4\n612#1:1145\n612#1:1147\n612#1:1148\n612#1:1149\n862#1:1150,6\n879#1:1156,6\n896#1:1162,2\n896#1:1164,6\n896#1:1170\n540#1:1131\n*E\n"})
@e0g(parameters = 0)
public final class zwe {

    /* JADX INFO: renamed from: t */
    public static final int f106214t = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final fxe f106215a;

    /* JADX INFO: renamed from: e */
    @gib
    public lg7 f106219e;

    /* JADX INFO: renamed from: f */
    @gib
    public a52 f106220f;

    /* JADX INFO: renamed from: g */
    @gib
    public awg f106221g;

    /* JADX INFO: renamed from: j */
    @gib
    public izb f106224j;

    /* JADX INFO: renamed from: k */
    @gib
    public mv8 f106225k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final z6b f106226l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final z6b f106227m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final z6b f106228n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final z6b f106229o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final z6b f106230p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final z6b f106231q;

    /* JADX INFO: renamed from: r */
    @gib
    public vwe f106232r;

    /* JADX INFO: renamed from: s */
    public boolean f106233s;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b<gwe> f106216b = xtf.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b<Boolean> f106217c = xtf.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: d */
    @yfb
    public qy6<? super gwe, bth> f106218d = new C16286q();

    /* JADX INFO: renamed from: h */
    @yfb
    public C0723l f106222h = new C0723l();

    /* JADX INFO: renamed from: i */
    @yfb
    public final z6b f106223i = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: zwe$a */
    public static final class C16270a extends tt8 implements qy6<Long, bth> {
        public C16270a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        public final void invoke(long j) {
            if (zwe.this.f106215a.getSubselections().contains(j)) {
                zwe.this.updateHandleOffsets();
                zwe.this.updateSelectionToolbar();
            }
        }
    }

    /* JADX INFO: renamed from: zwe$b */
    public static final class C16271b extends tt8 implements oz6<Boolean, mv8, izb, mwe, bth> {
        public C16271b() {
            super(4);
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(Boolean bool, mv8 mv8Var, izb izbVar, mwe mweVar) {
            m33561invokeRg1IO4c(bool.booleanValue(), mv8Var, izbVar.m30439unboximpl(), mweVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-Rg1IO4c, reason: not valid java name */
        public final void m33561invokeRg1IO4c(boolean z, @yfb mv8 mv8Var, long j, @yfb mwe mweVar) {
            long jMo30031getSizeYbymL2g = mv8Var.mo30031getSizeYbymL2g();
            rud rudVar = new rud(0.0f, 0.0f, r78.m32087getWidthimpl(jMo30031getSizeYbymL2g), r78.m32086getHeightimpl(jMo30031getSizeYbymL2g));
            if (!axe.m27906containsInclusiveUv8p0NA(rudVar, j)) {
                j = mug.m31049coerceIn3MmeM6k(j, rudVar);
            }
            long jM33545convertToContainerCoordinatesR5De75A = zwe.this.m33545convertToContainerCoordinatesR5De75A(mv8Var, j);
            if (mzb.m31100isSpecifiedk4lQ0M(jM33545convertToContainerCoordinatesR5De75A)) {
                zwe.this.setInTouchMode(z);
                zwe.this.m33552startSelection9KIMszo(jM33545convertToContainerCoordinatesR5De75A, false, mweVar);
                zwe.this.getFocusRequester().requestFocus();
                zwe.this.setShowToolbar$foundation_release(false);
            }
        }
    }

    /* JADX INFO: renamed from: zwe$c */
    public static final class C16272c extends tt8 implements gz6<Boolean, Long, bth> {
        public C16272c() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(Boolean bool, Long l) {
            invoke(bool.booleanValue(), l.longValue());
            return bth.f14751a;
        }

        public final void invoke(boolean z, long j) {
            zwe zweVar = zwe.this;
            scc<gwe, ol9<gwe>> sccVarSelectAllInSelectable$foundation_release = zweVar.selectAllInSelectable$foundation_release(j, zweVar.getSelection());
            gwe gweVarComponent1 = sccVarSelectAllInSelectable$foundation_release.component1();
            ol9<gwe> ol9VarComponent2 = sccVarSelectAllInSelectable$foundation_release.component2();
            if (!md8.areEqual(gweVarComponent1, zwe.this.getSelection())) {
                zwe.this.f106215a.setSubselections(ol9VarComponent2);
                zwe.this.getOnSelectionChange().invoke(gweVarComponent1);
            }
            zwe.this.setInTouchMode(z);
            zwe.this.getFocusRequester().requestFocus();
            zwe.this.setShowToolbar$foundation_release(false);
        }
    }

    /* JADX INFO: renamed from: zwe$d */
    public static final class C16273d extends tt8 implements uz6<Boolean, mv8, izb, izb, Boolean, mwe, Boolean> {
        public C16273d() {
            super(6);
        }

        @Override // p000.uz6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, mv8 mv8Var, izb izbVar, izb izbVar2, Boolean bool2, mwe mweVar) {
            return m33562invokepGV3PM0(bool.booleanValue(), mv8Var, izbVar.m30439unboximpl(), izbVar2.m30439unboximpl(), bool2.booleanValue(), mweVar);
        }

        @yfb
        /* JADX INFO: renamed from: invoke-pGV3PM0, reason: not valid java name */
        public final Boolean m33562invokepGV3PM0(boolean z, @yfb mv8 mv8Var, long j, long j2, boolean z2, @yfb mwe mweVar) {
            long jM33545convertToContainerCoordinatesR5De75A = zwe.this.m33545convertToContainerCoordinatesR5De75A(mv8Var, j);
            long jM33545convertToContainerCoordinatesR5De75A2 = zwe.this.m33545convertToContainerCoordinatesR5De75A(mv8Var, j2);
            zwe.this.setInTouchMode(z);
            return Boolean.valueOf(zwe.this.m33560updateSelectionqNKwrvQ$foundation_release(izb.m30418boximpl(jM33545convertToContainerCoordinatesR5De75A), jM33545convertToContainerCoordinatesR5De75A2, z2, mweVar));
        }
    }

    /* JADX INFO: renamed from: zwe$e */
    public static final class C16274e extends tt8 implements ny6<bth> {
        public C16274e() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zwe.this.setShowToolbar$foundation_release(true);
            zwe.this.setDraggingHandle(null);
            zwe.this.m33547setCurrentDragPosition_kEHs6E(null);
        }
    }

    /* JADX INFO: renamed from: zwe$f */
    public static final class C16275f extends tt8 implements qy6<Long, bth> {
        public C16275f() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        public final void invoke(long j) {
            if (zwe.this.f106215a.getSubselections().contains(j)) {
                zwe.this.onRelease();
                zwe.this.setSelection(null);
            }
        }
    }

    /* JADX INFO: renamed from: zwe$g */
    public static final class C16276g extends tt8 implements qy6<Long, bth> {
        public C16276g() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Long l) {
            invoke(l.longValue());
            return bth.f14751a;
        }

        public final void invoke(long j) {
            gwe.C6633a end;
            gwe.C6633a start;
            gwe selection = zwe.this.getSelection();
            if (selection != null && (start = selection.getStart()) != null && j == start.getSelectableId()) {
                zwe.this.m33551setStartHandlePosition_kEHs6E(null);
            }
            gwe selection2 = zwe.this.getSelection();
            if (selection2 != null && (end = selection2.getEnd()) != null && j == end.getSelectableId()) {
                zwe.this.m33550setEndHandlePosition_kEHs6E(null);
            }
            if (zwe.this.f106215a.getSubselections().contains(j)) {
                zwe.this.updateSelectionToolbar();
            }
        }
    }

    /* JADX INFO: renamed from: zwe$h */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", m4010f = "SelectionManager.kt", m4011i = {}, m4012l = {739}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C16277h extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f106241a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f106242b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<izb, bth> f106243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16277h(qy6<? super izb, bth> qy6Var, zy2<? super C16277h> zy2Var) {
            super(2, zy2Var);
            this.f106243c = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C16277h c16277h = new C16277h(this.f106243c, zy2Var);
            c16277h.f106242b = obj;
            return c16277h;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C16277h) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f106241a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                gn0 gn0Var = (gn0) this.f106242b;
                this.f106241a = 1;
                obj = dmg.waitForUpOrCancellation$default(gn0Var, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            h2d h2dVar = (h2d) obj;
            if (h2dVar != null) {
                this.f106243c.invoke(izb.m30418boximpl(h2dVar.m29911getPositionF1C5BW0()));
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: zwe$i */
    @dwf({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n1#1,328:1\n866#2:329\n*E\n"})
    public static final class C16278i<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r5b f106244a;

        public C16278i(r5b r5bVar) {
            this.f106244a = r5bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return md2.compareValues(Integer.valueOf(this.f106244a.get(((Number) t).longValue())), Integer.valueOf(this.f106244a.get(((Number) t2).longValue())));
        }
    }

    /* JADX INFO: renamed from: zwe$j */
    public static final class C16279j implements zqg {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f106245a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zwe f106246b;

        public C16279j(boolean z, zwe zweVar) {
            this.f106245a = z;
            this.f106246b = zweVar;
        }

        private final void done() {
            this.f106246b.setShowToolbar$foundation_release(true);
            this.f106246b.setDraggingHandle(null);
            this.f106246b.m33547setCurrentDragPosition_kEHs6E(null);
        }

        @Override // p000.zqg
        public void onCancel() {
            done();
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDown-k-4lQ0M */
        public void mo31651onDownk4lQ0M(long j) {
            mv8 layoutCoordinates;
            izb izbVarM33558getStartHandlePosition_m7T9E = this.f106245a ? this.f106246b.m33558getStartHandlePosition_m7T9E() : this.f106246b.m33557getEndHandlePosition_m7T9E();
            if (izbVarM33558getStartHandlePosition_m7T9E != null) {
                izbVarM33558getStartHandlePosition_m7T9E.m30439unboximpl();
                gwe selection = this.f106246b.getSelection();
                if (selection == null) {
                    return;
                }
                cwe anchorSelectable$foundation_release = this.f106246b.getAnchorSelectable$foundation_release(this.f106245a ? selection.getStart() : selection.getEnd());
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                long jMo28556getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo28556getHandlePositiondBAh8RU(selection, this.f106245a);
                if (mzb.m31102isUnspecifiedk4lQ0M(jMo28556getHandlePositiondBAh8RU)) {
                    return;
                }
                long jM32665getAdjustedCoordinatesk4lQ0M = uwe.m32665getAdjustedCoordinatesk4lQ0M(jMo28556getHandlePositiondBAh8RU);
                zwe zweVar = this.f106246b;
                zweVar.m33547setCurrentDragPosition_kEHs6E(izb.m30418boximpl(zweVar.requireContainerCoordinates$foundation_release().mo30034localPositionOfR5De75A(layoutCoordinates, jM32665getAdjustedCoordinatesk4lQ0M)));
                this.f106246b.setDraggingHandle(this.f106245a ? zd7.SelectionStart : zd7.SelectionEnd);
                this.f106246b.setShowToolbar$foundation_release(false);
            }
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDrag-k-4lQ0M */
        public void mo31652onDragk4lQ0M(long j) {
            if (this.f106246b.getDraggingHandle() == null) {
                return;
            }
            zwe zweVar = this.f106246b;
            zweVar.m33549setDragTotalDistancek4lQ0M(izb.m30434plusMKHz9U(zweVar.m33556getDragTotalDistanceF1C5BW0$foundation_release(), j));
            long jM30434plusMKHz9U = izb.m30434plusMKHz9U(this.f106246b.m33555getDragBeginPositionF1C5BW0$foundation_release(), this.f106246b.m33556getDragTotalDistanceF1C5BW0$foundation_release());
            if (this.f106246b.m33560updateSelectionqNKwrvQ$foundation_release(izb.m30418boximpl(jM30434plusMKHz9U), this.f106246b.m33555getDragBeginPositionF1C5BW0$foundation_release(), this.f106245a, mwe.f62568a.getCharacterWithWordAccelerate())) {
                this.f106246b.m33548setDragBeginPositionk4lQ0M(jM30434plusMKHz9U);
                this.f106246b.m33549setDragTotalDistancek4lQ0M(izb.f49009b.m30445getZeroF1C5BW0());
            }
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onStart-k-4lQ0M */
        public void mo31653onStartk4lQ0M(long j) {
            if (this.f106246b.getDraggingHandle() == null) {
                return;
            }
            gwe selection = this.f106246b.getSelection();
            md8.checkNotNull(selection);
            cwe cweVar = this.f106246b.f106215a.getSelectableMap$foundation_release().get((this.f106245a ? selection.getStart() : selection.getEnd()).getSelectableId());
            if (cweVar == null) {
                throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds");
            }
            cwe cweVar2 = cweVar;
            mv8 layoutCoordinates = cweVar2.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                throw new IllegalStateException("Current selectable should have layout coordinates.");
            }
            long jMo28556getHandlePositiondBAh8RU = cweVar2.mo28556getHandlePositiondBAh8RU(selection, this.f106245a);
            if (mzb.m31102isUnspecifiedk4lQ0M(jMo28556getHandlePositiondBAh8RU)) {
                return;
            }
            long jM32665getAdjustedCoordinatesk4lQ0M = uwe.m32665getAdjustedCoordinatesk4lQ0M(jMo28556getHandlePositiondBAh8RU);
            zwe zweVar = this.f106246b;
            zweVar.m33548setDragBeginPositionk4lQ0M(zweVar.requireContainerCoordinates$foundation_release().mo30034localPositionOfR5De75A(layoutCoordinates, jM32665getAdjustedCoordinatesk4lQ0M));
            this.f106246b.m33549setDragTotalDistancek4lQ0M(izb.f49009b.m30445getZeroF1C5BW0());
        }

        @Override // p000.zqg
        public void onStop() {
            done();
        }

        @Override // p000.zqg
        public void onUp() {
            done();
        }
    }

    /* JADX INFO: renamed from: zwe$k */
    public static final class C16280k extends tt8 implements ny6<bth> {
        public C16280k() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zwe.this.onRelease();
        }
    }

    /* JADX INFO: renamed from: zwe$l */
    public static final class C16281l extends tt8 implements qy6<mv8, bth> {
        public C16281l() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(mv8 mv8Var) {
            invoke2(mv8Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb mv8 mv8Var) {
            zwe.this.setContainerLayoutCoordinates(mv8Var);
        }
    }

    /* JADX INFO: renamed from: zwe$m */
    public static final class C16282m extends tt8 implements qy6<in6, bth> {
        public C16282m() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(in6 in6Var) {
            invoke2(in6Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb in6 in6Var) {
            if (!in6Var.isFocused() && zwe.this.getHasFocus()) {
                zwe.this.onRelease();
            }
            zwe.this.setHasFocus(in6Var.isFocused());
        }
    }

    /* JADX INFO: renamed from: zwe$n */
    public static final class C16283n extends tt8 implements qy6<Boolean, bth> {
        public C16283n() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return bth.f14751a;
        }

        public final void invoke(boolean z) {
            zwe.this.setInTouchMode(z);
        }
    }

    /* JADX INFO: renamed from: zwe$o */
    public static final class C16284o extends tt8 implements qy6<kq8, Boolean> {
        public C16284o() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(kq8 kq8Var) {
            return m33563invokeZmokQxo(kq8Var.m30741unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m33563invokeZmokQxo(@yfb KeyEvent keyEvent) {
            boolean z;
            if (bxe.m28176isCopyKeyEventZmokQxo(keyEvent)) {
                zwe.this.copy$foundation_release();
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: zwe$p */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", m4010f = "SelectionManager.kt", m4011i = {}, m4012l = {746}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C16285p extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f106252a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f106253b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ny6<bth> f106255d;

        /* JADX INFO: renamed from: zwe$p$a */
        public static final class a extends tt8 implements qy6<izb, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ny6<bth> f106256a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ny6<bth> ny6Var) {
                super(1);
                this.f106256a = ny6Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
                m33564invokek4lQ0M(izbVar.m30439unboximpl());
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m33564invokek4lQ0M(long j) {
                this.f106256a.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16285p(ny6<bth> ny6Var, zy2<? super C16285p> zy2Var) {
            super(2, zy2Var);
            this.f106255d = ny6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C16285p c16285p = zwe.this.new C16285p(this.f106255d, zy2Var);
            c16285p.f106253b = obj;
            return c16285p;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((C16285p) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f106252a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f106253b;
                zwe zweVar = zwe.this;
                a aVar = new a(this.f106255d);
                this.f106252a = 1;
                if (zweVar.detectNonConsumingTap(s2dVar, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: zwe$q */
    public static final class C16286q extends tt8 implements qy6<gwe, bth> {
        public C16286q() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(gwe gweVar) {
            invoke2(gweVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib gwe gweVar) {
            zwe.this.setSelection(gweVar);
        }
    }

    /* JADX INFO: renamed from: zwe$r */
    public static final class C16287r extends tt8 implements qy6<gwe, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<gwe, bth> f106259b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16287r(qy6<? super gwe, bth> qy6Var) {
            super(1);
            this.f106259b = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(gwe gweVar) {
            invoke2(gweVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib gwe gweVar) {
            zwe.this.setSelection(gweVar);
            this.f106259b.invoke(gweVar);
        }
    }

    /* JADX INFO: renamed from: zwe$s */
    public /* synthetic */ class C16288s extends n07 implements ny6<bth> {
        public C16288s(Object obj) {
            super(0, obj, zwe.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((zwe) this.receiver).toolbarCopy();
        }
    }

    /* JADX INFO: renamed from: zwe$t */
    public /* synthetic */ class C16289t extends n07 implements ny6<bth> {
        public C16289t(Object obj) {
            super(0, obj, zwe.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((zwe) this.receiver).selectAll$foundation_release();
        }
    }

    public zwe(@yfb fxe fxeVar) {
        this.f106215a = fxeVar;
        izb.C7673a c7673a = izb.f49009b;
        this.f106226l = xtf.mutableStateOf$default(izb.m30418boximpl(c7673a.m30445getZeroF1C5BW0()), null, 2, null);
        this.f106227m = xtf.mutableStateOf$default(izb.m30418boximpl(c7673a.m30445getZeroF1C5BW0()), null, 2, null);
        this.f106228n = xtf.mutableStateOf$default(null, null, 2, null);
        this.f106229o = xtf.mutableStateOf$default(null, null, 2, null);
        this.f106230p = xtf.mutableStateOf$default(null, null, 2, null);
        this.f106231q = xtf.mutableStateOf$default(null, null, 2, null);
        fxeVar.setOnPositionChangeCallback$foundation_release(new C16270a());
        fxeVar.setOnSelectionUpdateStartCallback$foundation_release(new C16271b());
        fxeVar.setOnSelectionUpdateSelectAll$foundation_release(new C16272c());
        fxeVar.setOnSelectionUpdateCallback$foundation_release(new C16273d());
        fxeVar.setOnSelectionUpdateEndCallback$foundation_release(new C16274e());
        fxeVar.setOnSelectableChangeCallback$foundation_release(new C16275f());
        fxeVar.setAfterSelectableUnsubscribe$foundation_release(new C16276g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public final long m33545convertToContainerCoordinatesR5De75A(mv8 mv8Var, long j) {
        mv8 mv8Var2 = this.f106225k;
        return (mv8Var2 == null || !mv8Var2.isAttached()) ? izb.f49009b.m30444getUnspecifiedF1C5BW0() : requireContainerCoordinates$foundation_release().mo30034localPositionOfR5De75A(mv8Var, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(s2d s2dVar, qy6<? super izb, bth> qy6Var, zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C16277h(qy6Var, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }

    private final rud getContentRect() {
        mv8 mv8Var;
        if (getSelection() == null || (mv8Var = this.f106225k) == null || !mv8Var.isAttached()) {
            return null;
        }
        List<cwe> listSort = this.f106215a.sort(requireContainerCoordinates$foundation_release());
        ArrayList arrayList = new ArrayList(listSort.size());
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            cwe cweVar = listSort.get(i);
            gwe gweVar = this.f106215a.getSubselections().get(cweVar.getSelectableId());
            scc sccVarM24050to = gweVar != null ? vkh.m24050to(cweVar, gweVar) : null;
            if (sccVarM24050to != null) {
                arrayList.add(sccVarM24050to);
            }
        }
        List listFirstAndLast = axe.firstAndLast(arrayList);
        if (listFirstAndLast.isEmpty()) {
            return null;
        }
        rud selectedRegionRect = axe.getSelectedRegionRect(listFirstAndLast, mv8Var);
        if (md8.areEqual(selectedRegionRect, axe.f12165a)) {
            return null;
        }
        rud rudVarIntersect = axe.visibleBounds(mv8Var).intersect(selectedRegionRect);
        if (rudVarIntersect.getWidth() < 0.0f || rudVarIntersect.getHeight() < 0.0f) {
            return null;
        }
        rud rudVarM32210translatek4lQ0M = rudVarIntersect.m32210translatek4lQ0M(nv8.positionInRoot(mv8Var));
        return rud.copy$default(rudVarM32210translatek4lQ0M, 0.0f, 0.0f, 0.0f, rudVarM32210translatek4lQ0M.getBottom() + (uwe.getHandleHeight() * 4), 7, null);
    }

    @fdi
    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    /* JADX INFO: renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final vwe m33546getSelectionLayoutWko1d7g(long j, long j2, boolean z) {
        mv8 mv8VarRequireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        List<cwe> listSort = this.f106215a.sort(mv8VarRequireContainerCoordinates$foundation_release);
        r5b r5bVarMutableLongIntMapOf = fl9.mutableLongIntMapOf();
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            r5bVarMutableLongIntMapOf.set(listSort.get(i).getSelectableId(), i);
        }
        wwe wweVar = new wwe(j, j2, mv8VarRequireContainerCoordinates$foundation_release, z, mzb.m31102isUnspecifiedk4lQ0M(j2) ? null : getSelection(), new C16278i(r5bVarMutableLongIntMapOf), null);
        int size2 = listSort.size();
        for (int i2 = 0; i2 < size2; i2++) {
            listSort.get(i2).appendSelectableInfoToBuilder(wweVar);
        }
        return wweVar.build();
    }

    private final boolean getShouldShowMagnifier() {
        return (getDraggingHandle() == null || !isInTouchMode() || isTriviallyCollapsedSelection$foundation_release()) ? false : true;
    }

    private final InterfaceC0701e onClearSelectionRequested(InterfaceC0701e interfaceC0701e, ny6<bth> ny6Var) {
        return getHasFocus() ? vgg.pointerInput(interfaceC0701e, bth.f14751a, new C16285p(ny6Var, null)) : interfaceC0701e;
    }

    private final void selectionChanged(vwe vweVar, gwe gweVar) {
        lg7 lg7Var;
        if (shouldPerformHaptics$foundation_release() && (lg7Var = this.f106219e) != null) {
            lg7Var.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
        }
        this.f106215a.setSubselections(vweVar.createSubSelections(gweVar));
        this.f106218d.invoke(gweVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m33547setCurrentDragPosition_kEHs6E(izb izbVar) {
        this.f106231q.setValue(izbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m33548setDragBeginPositionk4lQ0M(long j) {
        this.f106226l.setValue(izb.m30418boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m33549setDragTotalDistancek4lQ0M(long j) {
        this.f106227m.setValue(izb.m30418boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(zd7 zd7Var) {
        this.f106230p.setValue(zd7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m33550setEndHandlePosition_kEHs6E(izb izbVar) {
        this.f106229o.setValue(izbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m33551setStartHandlePosition_kEHs6E(izb izbVar) {
        this.f106228n.setValue(izbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m33552startSelection9KIMszo(long j, boolean z, mwe mweVar) {
        this.f106232r = null;
        m33559updateSelectionjyLRC_s$foundation_release(j, izb.f49009b.m30444getUnspecifiedF1C5BW0(), z, mweVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateHandleOffsets() {
        /*
            r11 = this;
            gwe r0 = r11.getSelection()
            mv8 r1 = r11.f106225k
            r2 = 0
            if (r0 == 0) goto L14
            gwe$a r3 = r0.getStart()
            if (r3 == 0) goto L14
            cwe r3 = r11.getAnchorSelectable$foundation_release(r3)
            goto L15
        L14:
            r3 = r2
        L15:
            if (r0 == 0) goto L22
            gwe$a r4 = r0.getEnd()
            if (r4 == 0) goto L22
            cwe r4 = r11.getAnchorSelectable$foundation_release(r4)
            goto L23
        L22:
            r4 = r2
        L23:
            if (r3 == 0) goto L2a
            mv8 r5 = r3.getLayoutCoordinates()
            goto L2b
        L2a:
            r5 = r2
        L2b:
            if (r4 == 0) goto L32
            mv8 r6 = r4.getLayoutCoordinates()
            goto L33
        L32:
            r6 = r2
        L33:
            if (r0 == 0) goto La0
            if (r1 == 0) goto La0
            boolean r7 = r1.isAttached()
            if (r7 == 0) goto La0
            if (r5 != 0) goto L42
            if (r6 != 0) goto L42
            goto La0
        L42:
            rud r7 = p000.axe.visibleBounds(r1)
            if (r5 == 0) goto L6f
            r8 = 1
            long r8 = r3.mo28556getHandlePositiondBAh8RU(r0, r8)
            boolean r3 = p000.mzb.m31102isUnspecifiedk4lQ0M(r8)
            if (r3 == 0) goto L54
            goto L6f
        L54:
            long r8 = r1.mo30034localPositionOfR5De75A(r5, r8)
            izb r3 = p000.izb.m30418boximpl(r8)
            long r8 = r3.m30439unboximpl()
            zd7 r5 = r11.getDraggingHandle()
            zd7 r10 = p000.zd7.SelectionStart
            if (r5 == r10) goto L70
            boolean r5 = p000.axe.m27906containsInclusiveUv8p0NA(r7, r8)
            if (r5 == 0) goto L6f
            goto L70
        L6f:
            r3 = r2
        L70:
            r11.m33551setStartHandlePosition_kEHs6E(r3)
            if (r6 == 0) goto L9c
            r3 = 0
            long r3 = r4.mo28556getHandlePositiondBAh8RU(r0, r3)
            boolean r0 = p000.mzb.m31102isUnspecifiedk4lQ0M(r3)
            if (r0 == 0) goto L81
            goto L9c
        L81:
            long r0 = r1.mo30034localPositionOfR5De75A(r6, r3)
            izb r0 = p000.izb.m30418boximpl(r0)
            long r3 = r0.m30439unboximpl()
            zd7 r1 = r11.getDraggingHandle()
            zd7 r5 = p000.zd7.SelectionEnd
            if (r1 == r5) goto L9b
            boolean r1 = p000.axe.m27906containsInclusiveUv8p0NA(r7, r3)
            if (r1 == 0) goto L9c
        L9b:
            r2 = r0
        L9c:
            r11.m33550setEndHandlePosition_kEHs6E(r2)
            return
        La0:
            r11.m33551setStartHandlePosition_kEHs6E(r2)
            r11.m33550setEndHandlePosition_kEHs6E(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zwe.updateHandleOffsets():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbar() {
        awg awgVar;
        if (getHasFocus() && (awgVar = this.f106221g) != null) {
            if (!this.f106233s || !isInTouchMode()) {
                if (awgVar.getStatus() == dwg.Shown) {
                    awgVar.hide();
                }
            } else {
                rud contentRect = getContentRect();
                if (contentRect == null) {
                    return;
                }
                awg.showMenu$default(awgVar, contentRect, isNonEmptySelection$foundation_release() ? new C16288s(this) : null, null, null, isEntireContainerSelected$foundation_release() ? null : new C16289t(this), 12, null);
            }
        }
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m33553contextMenuOpenAdjustmentk4lQ0M(long j) {
        gwe selection = getSelection();
        if (selection != null ? jvg.m30587getCollapsedimpl(selection.m29875toTextRanged9O1mEE()) : true) {
            m33552startSelection9KIMszo(j, true, mwe.f62568a.getWord());
        }
    }

    public final void copy$foundation_release() {
        a52 a52Var;
        C9041lz selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null) {
            if (selectedText$foundation_release.length() <= 0) {
                selectedText$foundation_release = null;
            }
            if (selectedText$foundation_release == null || (a52Var = this.f106220f) == null) {
                return;
            }
            a52Var.setText(selectedText$foundation_release);
        }
    }

    @gib
    public final cwe getAnchorSelectable$foundation_release(@yfb gwe.C6633a c6633a) {
        return this.f106215a.getSelectableMap$foundation_release().get(c6633a.getSelectableId());
    }

    @gib
    public final a52 getClipboardManager() {
        return this.f106220f;
    }

    @gib
    public final mv8 getContainerLayoutCoordinates() {
        return this.f106225k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final izb m33554getCurrentDragPosition_m7T9E() {
        return (izb) this.f106231q.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m33555getDragBeginPositionF1C5BW0$foundation_release() {
        return ((izb) this.f106226l.getValue()).m30439unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m33556getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((izb) this.f106227m.getValue()).m30439unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final zd7 getDraggingHandle() {
        return (zd7) this.f106230p.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    /* JADX INFO: renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final izb m33557getEndHandlePosition_m7T9E() {
        return (izb) this.f106229o.getValue();
    }

    @yfb
    public final C0723l getFocusRequester() {
        return this.f106222h;
    }

    @gib
    public final lg7 getHapticFeedBack() {
        return this.f106219e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.f106223i.getValue()).booleanValue();
    }

    @yfb
    public final InterfaceC0701e getModifier() {
        InterfaceC0701e interfaceC0701eSelectionMagnifier = InterfaceC0701e.f5158d1;
        InterfaceC0701e interfaceC0701eOnKeyEvent = C0743a.onKeyEvent(rwe.updateSelectionTouchMode(FocusableKt.focusable$default(C0713b.onFocusChanged(C0724m.focusRequester(C0763p.onGloballyPositioned(onClearSelectionRequested(interfaceC0701eSelectionMagnifier, new C16280k()), new C16281l()), this.f106222h), new C16282m()), false, null, 3, null), new C16283n()), new C16284o());
        if (getShouldShowMagnifier()) {
            interfaceC0701eSelectionMagnifier = bxe.selectionMagnifier(interfaceC0701eSelectionMagnifier, this);
        }
        return interfaceC0701eOnKeyEvent.then(interfaceC0701eSelectionMagnifier);
    }

    @yfb
    public final qy6<gwe, bth> getOnSelectionChange() {
        return this.f106218d;
    }

    @gib
    public final vwe getPreviousSelectionLayout$foundation_release() {
        return this.f106232r;
    }

    @gib
    public final C9041lz getSelectedText$foundation_release() {
        if (getSelection() == null || this.f106215a.getSubselections().isEmpty()) {
            return null;
        }
        C9041lz.a aVar = new C9041lz.a(0, 1, null);
        List<cwe> listSort = this.f106215a.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            cwe cweVar = listSort.get(i);
            gwe gweVar = this.f106215a.getSubselections().get(cweVar.getSelectableId());
            if (gweVar != null) {
                C9041lz text = cweVar.getText();
                aVar.append(gweVar.getHandlesCrossed() ? text.subSequence(gweVar.getEnd().getOffset(), gweVar.getStart().getOffset()) : text.subSequence(gweVar.getStart().getOffset(), gweVar.getEnd().getOffset()));
            }
        }
        return aVar.toAnnotatedString();
    }

    @gib
    public final gwe getSelection() {
        return this.f106216b.getValue();
    }

    public final boolean getShowToolbar$foundation_release() {
        return this.f106233s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    /* JADX INFO: renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final izb m33558getStartHandlePosition_m7T9E() {
        return (izb) this.f106228n.getValue();
    }

    @gib
    public final awg getTextToolbar() {
        return this.f106221g;
    }

    @yfb
    public final zqg handleDragObserver(boolean z) {
        return new C16279j(z, this);
    }

    public final boolean isEntireContainerSelected$foundation_release() {
        gwe gweVar;
        List<cwe> listSort = this.f106215a.sort(requireContainerCoordinates$foundation_release());
        if (listSort.isEmpty()) {
            return true;
        }
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            cwe cweVar = listSort.get(i);
            C9041lz text = cweVar.getText();
            if (text.length() != 0 && ((gweVar = this.f106215a.getSubselections().get(cweVar.getSelectableId())) == null || Math.abs(gweVar.getStart().getOffset() - gweVar.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInTouchMode() {
        return this.f106217c.getValue().booleanValue();
    }

    public final boolean isNonEmptySelection$foundation_release() {
        gwe selection = getSelection();
        if (selection == null || md8.areEqual(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<cwe> listSort = this.f106215a.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        for (int i = 0; i < size; i++) {
            gwe gweVar = this.f106215a.getSubselections().get(listSort.get(i).getSelectableId());
            if (gweVar != null && gweVar.getStart().getOffset() != gweVar.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        gwe selection = getSelection();
        if (selection == null) {
            return true;
        }
        return md8.areEqual(selection.getStart(), selection.getEnd());
    }

    public final void onRelease() {
        lg7 lg7Var;
        this.f106215a.setSubselections(pl9.emptyLongObjectMap());
        setShowToolbar$foundation_release(false);
        if (getSelection() != null) {
            this.f106218d.invoke(null);
            if (!isInTouchMode() || (lg7Var = this.f106219e) == null) {
                return;
            }
            lg7Var.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
        }
    }

    @yfb
    public final mv8 requireContainerCoordinates$foundation_release() {
        mv8 mv8Var = this.f106225k;
        if (mv8Var == null) {
            throw new IllegalArgumentException("null coordinates");
        }
        if (mv8Var.isAttached()) {
            return mv8Var;
        }
        throw new IllegalArgumentException("unattached coordinates");
    }

    public final void selectAll$foundation_release() {
        List<cwe> listSort = this.f106215a.sort(requireContainerCoordinates$foundation_release());
        if (listSort.isEmpty()) {
            return;
        }
        u5b u5bVarMutableLongObjectMapOf = pl9.mutableLongObjectMapOf();
        int size = listSort.size();
        gwe gweVar = null;
        gwe gweVar2 = null;
        for (int i = 0; i < size; i++) {
            cwe cweVar = listSort.get(i);
            gwe selectAllSelection = cweVar.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (gweVar == null) {
                    gweVar = selectAllSelection;
                }
                u5bVarMutableLongObjectMapOf.put(cweVar.getSelectableId(), selectAllSelection);
                gweVar2 = selectAllSelection;
            }
        }
        if (u5bVarMutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (gweVar != gweVar2) {
            md8.checkNotNull(gweVar);
            gwe.C6633a start = gweVar.getStart();
            md8.checkNotNull(gweVar2);
            gweVar = new gwe(start, gweVar2.getEnd(), false);
        }
        this.f106215a.setSubselections(u5bVarMutableLongObjectMapOf);
        this.f106218d.invoke(gweVar);
        this.f106232r = null;
    }

    @yfb
    public final scc<gwe, ol9<gwe>> selectAllInSelectable$foundation_release(long j, @gib gwe gweVar) {
        lg7 lg7Var;
        u5b u5bVarMutableLongObjectMapOf = pl9.mutableLongObjectMapOf();
        List<cwe> listSort = this.f106215a.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        gwe gweVarMerge = null;
        for (int i = 0; i < size; i++) {
            cwe cweVar = listSort.get(i);
            gwe selectAllSelection = cweVar.getSelectableId() == j ? cweVar.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                u5bVarMutableLongObjectMapOf.set(cweVar.getSelectableId(), selectAllSelection);
            }
            gweVarMerge = axe.merge(gweVarMerge, selectAllSelection);
        }
        if (isInTouchMode() && !md8.areEqual(gweVarMerge, gweVar) && (lg7Var = this.f106219e) != null) {
            lg7Var.mo30866performHapticFeedbackCdsT49E(ng7.f64462b.m31155getTextHandleMove5zf0vsI());
        }
        return new scc<>(gweVarMerge, u5bVarMutableLongObjectMapOf);
    }

    public final void setClipboardManager(@gib a52 a52Var) {
        this.f106220f = a52Var;
    }

    public final void setContainerLayoutCoordinates(@gib mv8 mv8Var) {
        this.f106225k = mv8Var;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        izb izbVarM30418boximpl = mv8Var != null ? izb.m30418boximpl(nv8.positionInWindow(mv8Var)) : null;
        if (md8.areEqual(this.f106224j, izbVarM30418boximpl)) {
            return;
        }
        this.f106224j = izbVarM30418boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    public final void setFocusRequester(@yfb C0723l c0723l) {
        this.f106222h = c0723l;
    }

    public final void setHapticFeedBack(@gib lg7 lg7Var) {
        this.f106219e = lg7Var;
    }

    public final void setHasFocus(boolean z) {
        this.f106223i.setValue(Boolean.valueOf(z));
    }

    public final void setInTouchMode(boolean z) {
        if (this.f106217c.getValue().booleanValue() != z) {
            this.f106217c.setValue(Boolean.valueOf(z));
            updateSelectionToolbar();
        }
    }

    public final void setOnSelectionChange(@yfb qy6<? super gwe, bth> qy6Var) {
        this.f106218d = new C16287r(qy6Var);
    }

    public final void setPreviousSelectionLayout$foundation_release(@gib vwe vweVar) {
        this.f106232r = vweVar;
    }

    public final void setSelection(@gib gwe gweVar) {
        this.f106216b.setValue(gweVar);
        if (gweVar != null) {
            updateHandleOffsets();
        }
    }

    public final void setShowToolbar$foundation_release(boolean z) {
        this.f106233s = z;
        updateSelectionToolbar();
    }

    public final void setTextToolbar(@gib awg awgVar) {
        this.f106221g = awgVar;
    }

    @fdi
    public final boolean shouldPerformHaptics$foundation_release() {
        if (!isInTouchMode()) {
            return false;
        }
        List<cwe> selectables$foundation_release = this.f106215a.getSelectables$foundation_release();
        int size = selectables$foundation_release.size();
        for (int i = 0; i < size; i++) {
            if (selectables$foundation_release.get(i).getText().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: updateSelection-jyLRC_s$foundation_release, reason: not valid java name */
    public final boolean m33559updateSelectionjyLRC_s$foundation_release(long j, long j2, boolean z, @yfb mwe mweVar) {
        setDraggingHandle(z ? zd7.SelectionStart : zd7.SelectionEnd);
        m33547setCurrentDragPosition_kEHs6E(izb.m30418boximpl(j));
        vwe vweVarM33546getSelectionLayoutWko1d7g = m33546getSelectionLayoutWko1d7g(j, j2, z);
        if (!vweVarM33546getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.f106232r)) {
            return false;
        }
        gwe gweVarAdjust = mweVar.adjust(vweVarM33546getSelectionLayoutWko1d7g);
        if (!md8.areEqual(gweVarAdjust, getSelection())) {
            selectionChanged(vweVarM33546getSelectionLayoutWko1d7g, gweVarAdjust);
        }
        this.f106232r = vweVarM33546getSelectionLayoutWko1d7g;
        return true;
    }

    /* JADX INFO: renamed from: updateSelection-qNKwrvQ$foundation_release, reason: not valid java name */
    public final boolean m33560updateSelectionqNKwrvQ$foundation_release(@gib izb izbVar, long j, boolean z, @yfb mwe mweVar) {
        if (izbVar == null) {
            return false;
        }
        return m33559updateSelectionjyLRC_s$foundation_release(izbVar.m30439unboximpl(), j, z, mweVar);
    }
}
