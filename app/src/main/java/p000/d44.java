package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,288:1\n245#1,6:289\n245#1,6:295\n245#1,6:321\n245#1,6:327\n245#1,6:333\n245#1,6:339\n245#1,6:345\n42#2,7:301\n42#2,7:314\n76#3:308\n76#3:310\n76#3:312\n59#4:309\n59#4:311\n59#4:313\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n46#1:289,6\n64#1:295,6\n254#1:321,6\n265#1:327,6\n273#1:333,6\n279#1:339,6\n285#1:345,6\n95#1:301,7\n192#1:314,7\n117#1:308\n173#1:310\n187#1:312\n117#1:309\n173#1:311\n187#1:313\n*E\n"})
@e0g(parameters = 0)
public abstract class d44 extends InterfaceC0701e.d {

    /* JADX INFO: renamed from: Z */
    public static final int f28379Z = 8;

    /* JADX INFO: renamed from: X */
    public final int f28380X = leb.calculateNodeKindSetFrom(this);

    /* JADX INFO: renamed from: Y */
    @gib
    public InterfaceC0701e.d f28381Y;

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }

    private final void updateNodeKindSet(int i, boolean z) {
        InterfaceC0701e.d child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i);
        if (kindSet$ui_release != i) {
            if (w34.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui_release(i);
            }
            if (isAttached()) {
                InterfaceC0701e.d node = getNode();
                InterfaceC0701e.d parent$ui_release = this;
                while (parent$ui_release != null) {
                    i |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setKindSet$ui_release(i);
                    if (parent$ui_release == node) {
                        break;
                    } else {
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                if (z && parent$ui_release == node) {
                    i = leb.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui_release(i);
                }
                int aggregateChildKindSet$ui_release = i | ((parent$ui_release == null || (child$ui_release = parent$ui_release.getChild$ui_release()) == null) ? 0 : child$ui_release.getAggregateChildKindSet$ui_release());
                while (parent$ui_release != null) {
                    aggregateChildKindSet$ui_release |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setAggregateChildKindSet$ui_release(aggregateChildKindSet$ui_release);
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
        }
    }

    private final void validateDelegateKindSet(int i, InterfaceC0701e.d dVar) {
        int kindSet$ui_release = getKindSet$ui_release();
        if ((i & keb.m30687constructorimpl(2)) == 0 || (keb.m30687constructorimpl(2) & kindSet$ui_release) == 0 || (this instanceof ew8)) {
            return;
        }
        g28.throwIllegalStateException("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + dVar);
    }

    @yfb
    /* JADX INFO: renamed from: a */
    public final <T extends v34> T m8877a(@yfb T t) {
        InterfaceC0701e.d node = t.getNode();
        if (node != t) {
            InterfaceC0701e.d dVar = t instanceof InterfaceC0701e.d ? (InterfaceC0701e.d) t : null;
            InterfaceC0701e.d parent$ui_release = dVar != null ? dVar.getParent$ui_release() : null;
            if (node == getNode() && md8.areEqual(parent$ui_release, this)) {
                return t;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.isAttached()) {
            g28.throwIllegalStateException("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int iCalculateNodeKindSetFromIncludingDelegates = leb.calculateNodeKindSetFromIncludingDelegates(node);
        node.setKindSet$ui_release(iCalculateNodeKindSetFromIncludingDelegates);
        validateDelegateKindSet(iCalculateNodeKindSetFromIncludingDelegates, node);
        node.setChild$ui_release(this.f28381Y);
        this.f28381Y = node;
        node.setParent$ui_release(this);
        updateNodeKindSet(getKindSet$ui_release() | iCalculateNodeKindSetFromIncludingDelegates, false);
        if (isAttached()) {
            if ((iCalculateNodeKindSetFromIncludingDelegates & keb.m30687constructorimpl(2)) == 0 || (kindSet$ui_release & keb.m30687constructorimpl(2)) != 0) {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            } else {
                feb nodes$ui_release = w34.requireLayoutNode(this).getNodes$ui_release();
                getNode().updateCoordinator$ui_release(null);
                nodes$ui_release.syncCoordinators();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            leb.autoInvalidateInsertedNode(node);
        }
        return t;
    }

    /* JADX INFO: renamed from: b */
    public final void m8878b(@yfb v34 v34Var) {
        InterfaceC0701e.d dVar = null;
        for (InterfaceC0701e.d child$ui_release = this.f28381Y; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            if (child$ui_release == v34Var) {
                if (child$ui_release.isAttached()) {
                    leb.autoInvalidateRemovedNode(child$ui_release);
                    child$ui_release.runDetachLifecycle$ui_release();
                    child$ui_release.markAsDetached$ui_release();
                }
                child$ui_release.setAsDelegateTo$ui_release(child$ui_release);
                child$ui_release.setAggregateChildKindSet$ui_release(0);
                if (dVar == null) {
                    this.f28381Y = child$ui_release.getChild$ui_release();
                } else {
                    dVar.setChild$ui_release(child$ui_release.getChild$ui_release());
                }
                child$ui_release.setChild$ui_release(null);
                child$ui_release.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int iCalculateNodeKindSetFromIncludingDelegates = leb.calculateNodeKindSetFromIncludingDelegates(this);
                updateNodeKindSet(iCalculateNodeKindSetFromIncludingDelegates, true);
                if (isAttached() && (kindSet$ui_release & keb.m30687constructorimpl(2)) != 0 && (keb.m30687constructorimpl(2) & iCalculateNodeKindSetFromIncludingDelegates) == 0) {
                    feb nodes$ui_release = w34.requireLayoutNode(this).getNodes$ui_release();
                    getNode().updateCoordinator$ui_release(null);
                    nodes$ui_release.syncCoordinators();
                    return;
                }
                return;
            }
            dVar = child$ui_release;
        }
        throw new IllegalStateException(("Could not find delegate: " + v34Var).toString());
    }

    @yfb
    @dpg
    public final <T extends v34> T delegateUnprotected$ui_release(@yfb T t) {
        return (T) m8877a(t);
    }

    public final void forEachImmediateDelegate$ui_release(@yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        for (InterfaceC0701e.d delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            qy6Var.invoke(delegate$ui_release);
        }
    }

    @gib
    public final InterfaceC0701e.d getDelegate$ui_release() {
        return this.f28381Y;
    }

    public final int getSelfKindSet$ui_release() {
        return this.f28380X;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (InterfaceC0701e.d delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!delegate$ui_release.isAttached()) {
                delegate$ui_release.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void markAsDetached$ui_release() {
        for (InterfaceC0701e.d delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void reset$ui_release() {
        super.reset$ui_release();
        for (InterfaceC0701e.d delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.reset$ui_release();
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void runAttachLifecycle$ui_release() {
        for (InterfaceC0701e.d delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (InterfaceC0701e.d delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runDetachLifecycle$ui_release();
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void setAsDelegateTo$ui_release(@yfb InterfaceC0701e.d dVar) {
        super.setAsDelegateTo$ui_release(dVar);
        for (InterfaceC0701e.d delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.setAsDelegateTo$ui_release(dVar);
        }
    }

    public final void setDelegate$ui_release(@gib InterfaceC0701e.d dVar) {
        this.f28381Y = dVar;
    }

    @dpg
    public final void undelegateUnprotected$ui_release(@yfb v34 v34Var) {
        m8878b(v34Var);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void updateCoordinator$ui_release(@gib heb hebVar) {
        super.updateCoordinator$ui_release(hebVar);
        for (InterfaceC0701e.d delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(hebVar);
        }
    }
}
