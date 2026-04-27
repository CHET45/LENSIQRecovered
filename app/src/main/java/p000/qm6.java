package p000;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0714c;
import androidx.compose.p002ui.focus.C0717f;
import androidx.compose.p002ui.focus.C0723l;
import androidx.compose.p002ui.focus.C0728q;
import androidx.compose.p002ui.focus.FocusTargetNode;
import androidx.compose.p002ui.focus.InterfaceC0720i;
import androidx.compose.p002ui.viewinterop.C0853b;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,240:1\n1#2:241\n1#2:325\n94#3:242\n240#4:243\n193#4,12:244\n205#4,6:263\n241#4:269\n432#4,6:270\n442#4,2:277\n444#4,8:282\n452#4,9:293\n461#4,8:305\n242#4:313\n212#4,3:314\n197#4:317\n42#5,7:256\n264#6:276\n245#7,3:279\n248#7,3:302\n1208#8:290\n1187#8,2:291\n40#9,7:318\n47#9,4:328\n728#10,2:326\n*S KotlinDebug\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n*L\n151#1:325\n125#1:242\n125#1:243\n125#1:244,12\n125#1:263,6\n125#1:269\n125#1:270,6\n125#1:277,2\n125#1:282,8\n125#1:293,9\n125#1:305,8\n125#1:313\n125#1:314,3\n125#1:317\n125#1:256,7\n125#1:276\n125#1:279,3\n125#1:302,3\n125#1:290\n125#1:291,2\n151#1:318,7\n151#1:328,4\n151#1:326,2\n*E\n"})
public final class qm6 extends InterfaceC0701e.d implements an6, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: X */
    @gib
    public View f74916X;

    /* JADX INFO: renamed from: qm6$a */
    public /* synthetic */ class C11554a extends n07 implements qy6<C0714c, C0723l> {
        public C11554a(Object obj) {
            super(1, obj, qm6.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ C0723l invoke(C0714c c0714c) {
            return m31948invoke3ESFkO8(c0714c.m27531unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
        public final C0723l m31948invoke3ESFkO8(int i) {
            return ((qm6) this.receiver).m31946onEnter3ESFkO8(i);
        }
    }

    /* JADX INFO: renamed from: qm6$b */
    public /* synthetic */ class C11555b extends n07 implements qy6<C0714c, C0723l> {
        public C11555b(Object obj) {
            super(1, obj, qm6.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ C0723l invoke(C0714c c0714c) {
            return m31949invoke3ESFkO8(c0714c.m27531unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
        public final C0723l m31949invoke3ESFkO8(int i) {
            return ((qm6) this.receiver).m31947onExit3ESFkO8(i);
        }
    }

    private final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        int iM30687constructorimpl = keb.m30687constructorimpl(1024);
        if (!getNode().isAttached()) {
            g28.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        InterfaceC0701e.d node = getNode();
        if ((node.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
            boolean z = false;
            for (InterfaceC0701e.d child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                    InterfaceC0701e.d dVarPop = child$ui_release;
                    f7b f7bVar = null;
                    while (dVarPop != null) {
                        if (dVarPop instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) dVarPop;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                            int i = 0;
                            for (InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        dVarPop = delegate$ui_release;
                                    } else {
                                        if (f7bVar == null) {
                                            f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                        }
                                        if (dVarPop != null) {
                                            f7bVar.add(dVarPop);
                                            dVarPop = null;
                                        }
                                        f7bVar.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        dVarPop = w34.pop(f7bVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // p000.an6
    public void applyFocusProperties(@yfb InterfaceC0720i interfaceC0720i) {
        interfaceC0720i.setCanFocus(false);
        interfaceC0720i.setEnter(new C11554a(this));
        interfaceC0720i.setExit(new C11555b(this));
    }

    @gib
    public final View getFocusedChild() {
        return this.f74916X;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        super.onAttach();
        C0853b.getView(this).addOnAttachStateChangeListener(this);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        C0853b.getView(this).removeOnAttachStateChangeListener(this);
        this.f74916X = null;
        super.onDetach();
    }

    @yfb
    /* JADX INFO: renamed from: onEnter-3ESFkO8, reason: not valid java name */
    public final C0723l m31946onEnter3ESFkO8(int i) {
        View view = C0853b.getView(this);
        if (view.isFocused() || view.hasFocus()) {
            return C0723l.f5244b.getDefault();
        }
        zm6 focusOwner = w34.requireOwner(this).getFocusOwner();
        Object objRequireOwner = w34.requireOwner(this);
        md8.checkNotNull(objRequireOwner, "null cannot be cast to non-null type android.view.View");
        return C0717f.requestInteropFocus(view, C0717f.m27542toAndroidFocusDirection3ESFkO8(i), C0853b.getCurrentlyFocusedRect(focusOwner, (View) objRequireOwner, view)) ? C0723l.f5244b.getDefault() : C0723l.f5244b.getCancel();
    }

    @yfb
    /* JADX INFO: renamed from: onExit-3ESFkO8, reason: not valid java name */
    public final C0723l m31947onExit3ESFkO8(int i) {
        View view = C0853b.getView(this);
        if (!view.hasFocus()) {
            return C0723l.f5244b.getDefault();
        }
        zm6 focusOwner = w34.requireOwner(this).getFocusOwner();
        Object objRequireOwner = w34.requireOwner(this);
        md8.checkNotNull(objRequireOwner, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) objRequireOwner;
        if (!(view instanceof ViewGroup)) {
            if (view2.requestFocus()) {
                return C0723l.f5244b.getDefault();
            }
            throw new IllegalStateException("host view did not take focus");
        }
        Rect currentlyFocusedRect = C0853b.getCurrentlyFocusedRect(focusOwner, view2, view);
        Integer numM27542toAndroidFocusDirection3ESFkO8 = C0717f.m27542toAndroidFocusDirection3ESFkO8(i);
        int iIntValue = numM27542toAndroidFocusDirection3ESFkO8 != null ? numM27542toAndroidFocusDirection3ESFkO8.intValue() : 130;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view3 = this.f74916X;
        View viewFindNextFocus = view3 != null ? focusFinder.findNextFocus((ViewGroup) view2, view3, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) view2, currentlyFocusedRect, iIntValue);
        if (viewFindNextFocus != null && C0853b.containsDescendant(view, viewFindNextFocus)) {
            viewFindNextFocus.requestFocus(iIntValue, currentlyFocusedRect);
            return C0723l.f5244b.getCancel();
        }
        if (view2.requestFocus()) {
            return C0723l.f5244b.getDefault();
        }
        throw new IllegalStateException("host view did not take focus");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@gib View view, @gib View view2) {
        if (w34.requireLayoutNode(this).getOwner$ui_release() == null) {
            return;
        }
        View view3 = C0853b.getView(this);
        zm6 focusOwner = w34.requireOwner(this).getFocusOwner();
        z9c z9cVarRequireOwner = w34.requireOwner(this);
        boolean z = (view == null || md8.areEqual(view, z9cVarRequireOwner) || !C0853b.containsDescendant(view3, view)) ? false : true;
        boolean z2 = (view2 == null || md8.areEqual(view2, z9cVarRequireOwner) || !C0853b.containsDescendant(view3, view2)) ? false : true;
        if (z && z2) {
            this.f74916X = view2;
            return;
        }
        if (!z2) {
            if (!z) {
                this.f74916X = null;
                return;
            }
            this.f74916X = null;
            if (getFocusTargetOfEmbeddedViewWrapper().getFocusState().isFocused()) {
                focusOwner.mo27515clearFocusI7lrPNg(false, true, false, C0714c.f5215b.m27536getExitdhqQ8s());
                return;
            }
            return;
        }
        this.f74916X = view2;
        FocusTargetNode focusTargetOfEmbeddedViewWrapper = getFocusTargetOfEmbeddedViewWrapper();
        if (focusTargetOfEmbeddedViewWrapper.getFocusState().getHasFocus()) {
            return;
        }
        pn6 focusTransactionManager = focusOwner.getFocusTransactionManager();
        try {
            if (focusTransactionManager.f71488c) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            C0728q.performRequestFocus(focusTargetOfEmbeddedViewWrapper);
            focusTransactionManager.commitTransaction();
        } catch (Throwable th) {
            focusTransactionManager.commitTransaction();
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@yfb View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@yfb View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    public final void setFocusedChild(@gib View view) {
        this.f74916X = view;
    }
}
