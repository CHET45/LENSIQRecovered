package p000;

import android.view.KeyEvent;
import android.view.View;
import androidx.compose.p002ui.focus.C0714c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.C0768u;
import p000.do6;
import p000.p7e;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
public interface z9c extends b5d {

    /* JADX INFO: renamed from: S */
    @yfb
    public static final C16042a f104498S = C16042a.f104499a;

    /* JADX INFO: renamed from: z9c$a */
    public static final class C16042a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C16042a f104499a = new C16042a();

        /* JADX INFO: renamed from: b */
        public static boolean f104500b;

        private C16042a() {
        }

        public final boolean getEnableExtraAssertions() {
            return f104500b;
        }

        public final void setEnableExtraAssertions(boolean z) {
            f104500b = z;
        }
    }

    /* JADX INFO: renamed from: z9c$b */
    public interface InterfaceC16043b {
        void onLayoutComplete();
    }

    static /* synthetic */ y9c createLayer$default(z9c z9cVar, gz6 gz6Var, ny6 ny6Var, u97 u97Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i & 4) != 0) {
            u97Var = null;
        }
        return z9cVar.createLayer(gz6Var, ny6Var, u97Var);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(z9c z9cVar, lw8 lw8Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        z9cVar.forceMeasureTheSubtree(lw8Var, z);
    }

    @ug5
    static /* synthetic */ void getAutofill$annotations() {
    }

    @ug5
    static /* synthetic */ void getAutofillTree$annotations() {
    }

    @q64(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @i2e(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    static /* synthetic */ void measureAndLayout$default(z9c z9cVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        z9cVar.measureAndLayout(z);
    }

    static /* synthetic */ void onRequestMeasure$default(z9c z9cVar, lw8 lw8Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        z9cVar.onRequestMeasure(lw8Var, z, z2, z3);
    }

    static /* synthetic */ void onRequestRelayout$default(z9c z9cVar, lw8 lw8Var, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        z9cVar.onRequestRelayout(lw8Var, z, z2);
    }

    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    long mo27739calculateLocalPositionMKHz9U(long j);

    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    long mo27740calculatePositionInWindowMKHz9U(long j);

    @yfb
    y9c createLayer(@yfb gz6<? super vq1, ? super u97, bth> gz6Var, @yfb ny6<bth> ny6Var, @gib u97 u97Var);

    void forceMeasureTheSubtree(@yfb lw8 lw8Var, boolean z);

    @yfb
    InterfaceC6718h6 getAccessibilityManager();

    @gib
    @ug5
    fm0 getAutofill();

    @ug5
    @yfb
    mm0 getAutofillTree();

    @yfb
    a52 getClipboardManager();

    @yfb
    e13 getCoroutineContext();

    @yfb
    c64 getDensity();

    @yfb
    un4 getDragAndDropManager();

    @gib
    /* JADX INFO: renamed from: getFocusDirection-P8AzH3I */
    C0714c mo27741getFocusDirectionP8AzH3I(@yfb KeyEvent keyEvent);

    @yfb
    zm6 getFocusOwner();

    @yfb
    do6.InterfaceC4891b getFontFamilyResolver();

    @yfb
    xn6.InterfaceC15211b getFontLoader();

    @yfb
    s97 getGraphicsContext();

    @yfb
    lg7 getHapticFeedBack();

    @yfb
    a48 getInputModeManager();

    @yfb
    ov8 getLayoutDirection();

    long getMeasureIteration();

    @yfb
    kxa getModifierLocalManager();

    @yfb
    default AbstractC0767t.a getPlacementScope() {
        return C0768u.PlacementScope(this);
    }

    @yfb
    d2d getPointerIconService();

    @yfb
    lw8 getRoot();

    @yfb
    cbe getRootForTest();

    @yfb
    nw8 getSharedDrawScope();

    boolean getShowLayoutBounds();

    @yfb
    bac getSnapshotObserver();

    @yfb
    suf getSoftwareKeyboardController();

    @yfb
    stg getTextInputService();

    @yfb
    awg getTextToolbar();

    @yfb
    u8i getViewConfiguration();

    @yfb
    sli getWindowInfo();

    void measureAndLayout(boolean z);

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    void mo27744measureAndLayout0kLqBqw(@yfb lw8 lw8Var, long j);

    void onAttach(@yfb lw8 lw8Var);

    void onDetach(@yfb lw8 lw8Var);

    void onEndApplyChanges();

    @ia8
    void onInteropViewLayoutChange(@yfb View view);

    void onLayoutChange(@yfb lw8 lw8Var);

    void onRequestMeasure(@yfb lw8 lw8Var, boolean z, boolean z2, boolean z3);

    void onRequestRelayout(@yfb lw8 lw8Var, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(@yfb ny6<bth> ny6Var);

    void registerOnLayoutCompletedListener(@yfb InterfaceC16043b interfaceC16043b);

    boolean requestFocus();

    void requestOnPositionedCallback(@yfb lw8 lw8Var);

    @ka8
    @p7e({p7e.EnumC10826a.f69934a})
    void setShowLayoutBounds(boolean z);

    @gib
    Object textInputSession(@yfb gz6<? super yxc, ? super zy2<?>, ? extends Object> gz6Var, @yfb zy2<?> zy2Var);
}
