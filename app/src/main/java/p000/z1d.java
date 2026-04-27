package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.jvd;
import p000.shh;
import p000.x1d;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class z1d extends InterfaceC0701e.d implements shh, p2d, mn2 {

    /* JADX INFO: renamed from: V1 */
    public static final int f103668V1 = 8;

    /* JADX INFO: renamed from: M1 */
    public boolean f103669M1;

    /* JADX INFO: renamed from: X */
    @yfb
    public final String f103670X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public a2d f103671Y;

    /* JADX INFO: renamed from: Z */
    public boolean f103672Z;

    /* JADX INFO: renamed from: z1d$a */
    public static final class C15916a extends tt8 implements qy6<z1d, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<z1d> f103673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15916a(jvd.C8121h<z1d> c8121h) {
            super(1);
            this.f103673a = c8121h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb z1d z1dVar) {
            if (this.f103673a.f52110a == null && z1dVar.f103669M1) {
                this.f103673a.f52110a = z1dVar;
            } else if (this.f103673a.f52110a != null && z1dVar.getOverrideDescendants() && z1dVar.f103669M1) {
                this.f103673a.f52110a = z1dVar;
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: z1d$b */
    public static final class C15917b extends tt8 implements qy6<z1d, shh.C12597a.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8114a f103674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15917b(jvd.C8114a c8114a) {
            super(1);
            this.f103674a = c8114a;
        }

        @Override // p000.qy6
        @yfb
        public final shh.C12597a.a invoke(@yfb z1d z1dVar) {
            if (!z1dVar.f103669M1) {
                return shh.C12597a.a.ContinueTraversal;
            }
            this.f103674a.f52103a = false;
            return shh.C12597a.a.CancelTraversal;
        }
    }

    /* JADX INFO: renamed from: z1d$c */
    public static final class C15918c extends tt8 implements qy6<z1d, shh.C12597a.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<z1d> f103675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15918c(jvd.C8121h<z1d> c8121h) {
            super(1);
            this.f103675a = c8121h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        @yfb
        public final shh.C12597a.a invoke(@yfb z1d z1dVar) {
            shh.C12597a.a aVar = shh.C12597a.a.ContinueTraversal;
            if (!z1dVar.f103669M1) {
                return aVar;
            }
            this.f103675a.f52110a = z1dVar;
            return z1dVar.getOverrideDescendants() ? shh.C12597a.a.SkipSubtreeAndContinueTraversal : aVar;
        }
    }

    /* JADX INFO: renamed from: z1d$d */
    public static final class C15919d extends tt8 implements qy6<z1d, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<z1d> f103676a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15919d(jvd.C8121h<z1d> c8121h) {
            super(1);
            this.f103676a = c8121h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb z1d z1dVar) {
            if (z1dVar.getOverrideDescendants() && z1dVar.f103669M1) {
                this.f103676a.f52110a = z1dVar;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ z1d(a2d a2dVar, boolean z, int i, jt3 jt3Var) {
        this(a2dVar, (i & 2) != 0 ? false : z);
    }

    private final void displayDefaultIcon() {
        d2d pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(null);
        }
    }

    private final void displayIcon() {
        a2d a2dVar;
        z1d z1dVarFindOverridingAncestorNode = findOverridingAncestorNode();
        if (z1dVarFindOverridingAncestorNode == null || (a2dVar = z1dVarFindOverridingAncestorNode.f103671Y) == null) {
            a2dVar = this.f103671Y;
        }
        d2d pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(a2dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        bth bthVar;
        jvd.C8121h c8121h = new jvd.C8121h();
        thh.traverseAncestors(this, new C15916a(c8121h));
        z1d z1dVar = (z1d) c8121h.f52110a;
        if (z1dVar != null) {
            z1dVar.displayIcon();
            bthVar = bth.f14751a;
        } else {
            bthVar = null;
        }
        if (bthVar == null) {
            displayDefaultIcon();
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        z1d z1dVarFindDescendantNodeWithCursorInBounds;
        if (this.f103669M1) {
            if (this.f103672Z || (z1dVarFindDescendantNodeWithCursorInBounds = findDescendantNodeWithCursorInBounds()) == null) {
                z1dVarFindDescendantNodeWithCursorInBounds = this;
            }
            z1dVarFindDescendantNodeWithCursorInBounds.displayIcon();
        }
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        jvd.C8114a c8114a = new jvd.C8114a();
        c8114a.f52103a = true;
        if (!this.f103672Z) {
            thh.traverseDescendants(this, new C15917b(c8114a));
        }
        if (c8114a.f52103a) {
            displayIcon();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final z1d findDescendantNodeWithCursorInBounds() {
        jvd.C8121h c8121h = new jvd.C8121h();
        thh.traverseDescendants(this, new C15918c(c8121h));
        return (z1d) c8121h.f52110a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final z1d findOverridingAncestorNode() {
        jvd.C8121h c8121h = new jvd.C8121h();
        thh.traverseAncestors(this, new C15919d(c8121h));
        return (z1d) c8121h.f52110a;
    }

    private final d2d getPointerIconService() {
        return (d2d) nn2.currentValueOf(this, sn2.getLocalPointerIconService());
    }

    private final void onEnter() {
        this.f103669M1 = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.f103669M1) {
            this.f103669M1 = false;
            if (isAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    @yfb
    public final a2d getIcon() {
        return this.f103671Y;
    }

    public final boolean getOverrideDescendants() {
        return this.f103672Z;
    }

    @Override // p000.p2d
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    @Override // p000.p2d
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo27219onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j) {
        if (v1dVar == v1d.Main) {
            int iM32358getType7fucELk = t1dVar.m32358getType7fucELk();
            x1d.C14873a c14873a = x1d.f96025b;
            if (x1d.m33153equalsimpl0(iM32358getType7fucELk, c14873a.m33157getEnter7fucELk())) {
                onEnter();
            } else if (x1d.m33153equalsimpl0(t1dVar.m32358getType7fucELk(), c14873a.m33158getExit7fucELk())) {
                onExit();
            }
        }
    }

    public final void setIcon(@yfb a2d a2dVar) {
        if (md8.areEqual(this.f103671Y, a2dVar)) {
            return;
        }
        this.f103671Y = a2dVar;
        if (this.f103669M1) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final void setOverrideDescendants(boolean z) {
        if (this.f103672Z != z) {
            this.f103672Z = z;
            if (z) {
                if (this.f103669M1) {
                    displayIcon();
                }
            } else if (this.f103669M1) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    public z1d(@yfb a2d a2dVar, boolean z) {
        this.f103670X = "androidx.compose.ui.input.pointer.PointerHoverIcon";
        this.f103671Y = a2dVar;
        this.f103672Z = z;
    }

    @Override // p000.shh
    @yfb
    public String getTraverseKey() {
        return this.f103670X;
    }
}
