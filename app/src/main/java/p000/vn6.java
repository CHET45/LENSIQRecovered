package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class vn6 extends InterfaceC0701e.d implements shh, o77 {

    /* JADX INFO: renamed from: M1 */
    @yfb
    public static final C14173a f91776M1 = new C14173a(null);

    /* JADX INFO: renamed from: V1 */
    public static final int f91777V1 = 8;

    /* JADX INFO: renamed from: X */
    public boolean f91778X;

    /* JADX INFO: renamed from: Y */
    public final boolean f91779Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public mv8 f91780Z;

    /* JADX INFO: renamed from: vn6$a */
    public static final class C14173a {
        public /* synthetic */ C14173a(jt3 jt3Var) {
            this();
        }

        private C14173a() {
        }
    }

    private final wn6 getObserver() {
        if (!isAttached()) {
            return null;
        }
        shh shhVarFindNearestAncestor = thh.findNearestAncestor(this, wn6.f94825Z);
        if (shhVarFindNearestAncestor instanceof wn6) {
            return (wn6) shhVarFindNearestAncestor;
        }
        return null;
    }

    private final void notifyObserverWhenAttached() {
        wn6 observer;
        mv8 mv8Var = this.f91780Z;
        if (mv8Var != null) {
            md8.checkNotNull(mv8Var);
            if (!mv8Var.isAttached() || (observer = getObserver()) == null) {
                return;
            }
            observer.onFocusBoundsChanged(this.f91780Z);
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return this.f91779Y;
    }

    @Override // p000.shh
    @yfb
    public Object getTraverseKey() {
        return f91776M1;
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        this.f91780Z = mv8Var;
        if (this.f91778X) {
            if (mv8Var.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            wn6 observer = getObserver();
            if (observer != null) {
                observer.onFocusBoundsChanged(null);
            }
        }
    }

    public final void setFocus(boolean z) {
        if (z == this.f91778X) {
            return;
        }
        if (z) {
            notifyObserverWhenAttached();
        } else {
            wn6 observer = getObserver();
            if (observer != null) {
                observer.onFocusBoundsChanged(null);
            }
        }
        this.f91778X = z;
    }
}
