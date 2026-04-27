package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.concurrent.CancellationException;
import p000.izb;
import p000.jj8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCursorAnchorInfoController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoController.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
@e0g(parameters = 0)
public final class va3 {

    /* JADX INFO: renamed from: o */
    public static final int f90439o = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final jeh f90440a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final lug f90441b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final hl2 f90442c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final x13 f90443d;

    /* JADX INFO: renamed from: e */
    public boolean f90444e;

    /* JADX INFO: renamed from: f */
    public boolean f90445f;

    /* JADX INFO: renamed from: g */
    @gib
    public jj8 f90446g;

    /* JADX INFO: renamed from: h */
    public boolean f90447h;

    /* JADX INFO: renamed from: i */
    public boolean f90448i;

    /* JADX INFO: renamed from: j */
    public boolean f90449j;

    /* JADX INFO: renamed from: k */
    public boolean f90450k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final CursorAnchorInfo.Builder f90451l = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: m */
    @yfb
    public final float[] f90452m = x3a.m33183constructorimpl$default(null, 1, null);

    /* JADX INFO: renamed from: n */
    @yfb
    public final Matrix f90453n = new Matrix();

    /* JADX INFO: renamed from: va3$a */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", m4010f = "CursorAnchorInfoController.android.kt", m4011i = {}, m4012l = {155}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13961a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f90454a;

        /* JADX INFO: renamed from: va3$a$a */
        public static final class a extends tt8 implements ny6<CursorAnchorInfo> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ va3 f90456a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(va3 va3Var) {
                super(0);
                this.f90456a = va3Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @gib
            public final CursorAnchorInfo invoke() {
                return this.f90456a.calculateCursorAnchorInfo();
            }
        }

        /* JADX INFO: renamed from: va3$a$b */
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ va3 f90457a;

            public b(va3 va3Var) {
                this.f90457a = va3Var;
            }

            @gib
            public final Object emit(@yfb CursorAnchorInfo cursorAnchorInfo, @yfb zy2<? super bth> zy2Var) {
                this.f90457a.f90442c.updateCursorAnchorInfo(cursorAnchorInfo);
                return bth.f14751a;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit((CursorAnchorInfo) obj, (zy2<? super bth>) zy2Var);
            }
        }

        public C13961a(zy2<? super C13961a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return va3.this.new C13961a(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13961a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f90454a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56 y56VarFilterNotNull = c76.filterNotNull(c76.drop(stf.snapshotFlow(new a(va3.this)), 1));
                b bVar = new b(va3.this);
                this.f90454a = 1;
                if (y56VarFilterNotNull.collect(bVar, this) == coroutine_suspended) {
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

    public va3(@yfb jeh jehVar, @yfb lug lugVar, @yfb hl2 hl2Var, @yfb x13 x13Var) {
        this.f90440a = jehVar;
        this.f90441b = lugVar;
        this.f90442c = hl2Var;
        this.f90443d = x13Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo calculateCursorAnchorInfo() {
        mv8 coreNodeCoordinates;
        mv8 decoratorNodeCoordinates;
        hug layoutResult;
        mv8 textLayoutNodeCoordinates = this.f90441b.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (coreNodeCoordinates = this.f90441b.getCoreNodeCoordinates()) != null) {
                if (!coreNodeCoordinates.isAttached()) {
                    coreNodeCoordinates = null;
                }
                if (coreNodeCoordinates != null && (decoratorNodeCoordinates = this.f90441b.getDecoratorNodeCoordinates()) != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates == null || (layoutResult = this.f90441b.getLayoutResult()) == null) {
                        return null;
                    }
                    jrg visualText = this.f90440a.getVisualText();
                    x3a.m33192resetimpl(this.f90452m);
                    textLayoutNodeCoordinates.mo30045transformToScreen58bKbWc(this.f90452m);
                    C12773st.m32333setFromEL8BTi8(this.f90453n, this.f90452m);
                    rud rudVarVisibleBounds = axe.visibleBounds(coreNodeCoordinates);
                    izb.C7673a c7673a = izb.f49009b;
                    return ta3.m32395buildvxqZcH0(this.f90451l, visualText, visualText.m30568getSelectiond9O1mEE(), visualText.m30567getCompositionMzsxiRA(), layoutResult, this.f90453n, rudVarVisibleBounds.m32210translatek4lQ0M(textLayoutNodeCoordinates.mo30034localPositionOfR5De75A(coreNodeCoordinates, c7673a.m30445getZeroF1C5BW0())), axe.visibleBounds(decoratorNodeCoordinates).m32210translatek4lQ0M(textLayoutNodeCoordinates.mo30034localPositionOfR5De75A(decoratorNodeCoordinates, c7673a.m30445getZeroF1C5BW0())), this.f90447h, this.f90448i, this.f90449j, this.f90450k);
                }
            }
        }
        return null;
    }

    private final void startOrStopMonitoring() {
        if (!this.f90444e) {
            jj8 jj8Var = this.f90446g;
            if (jj8Var != null) {
                jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
            }
            this.f90446g = null;
            return;
        }
        jj8 jj8Var2 = this.f90446g;
        if (jj8Var2 == null || !jj8Var2.isActive()) {
            this.f90446g = fg1.launch$default(this.f90443d, null, b23.f12444d, new C13961a(null), 1, null);
        }
    }

    public final void requestUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            boolean z8 = (i & 16) != 0;
            boolean z9 = (i & 8) != 0;
            boolean z10 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z8 || z9 || z10 || z5) {
                z2 = z5;
                z = z10;
                z4 = z9;
                z3 = z8;
            } else if (i2 >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z5;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        requestUpdates(z6, z7, z3, z4, z, z2);
    }

    private final void requestUpdates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f90447h = z3;
        this.f90448i = z4;
        this.f90449j = z5;
        this.f90450k = z6;
        if (z) {
            this.f90445f = true;
            CursorAnchorInfo cursorAnchorInfoCalculateCursorAnchorInfo = calculateCursorAnchorInfo();
            if (cursorAnchorInfoCalculateCursorAnchorInfo != null) {
                this.f90442c.updateCursorAnchorInfo(cursorAnchorInfoCalculateCursorAnchorInfo);
            }
        }
        this.f90444e = z2;
        startOrStopMonitoring();
    }
}
