package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class l2d {

    /* JADX INFO: renamed from: f */
    public static final int f56005f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lw8 f56006a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final bk7 f56007b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final i2d f56008c = new i2d();

    /* JADX INFO: renamed from: d */
    @yfb
    public final ck7 f56009d = new ck7();

    /* JADX INFO: renamed from: e */
    public boolean f56010e;

    public l2d(@yfb lw8 lw8Var) {
        this.f56006a = lw8Var;
        this.f56007b = new bk7(lw8Var.getCoordinates());
    }

    /* JADX INFO: renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m30807processBIzXfog$default(l2d l2dVar, j2d j2dVar, b5d b5dVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return l2dVar.m30808processBIzXfog(j2dVar, b5dVar, z);
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.f56007b.clearPreviouslyHitModifierNodeCache();
    }

    @yfb
    public final lw8 getRoot() {
        return this.f56006a;
    }

    /* JADX INFO: renamed from: process-BIzXfog, reason: not valid java name */
    public final int m30808processBIzXfog(@yfb j2d j2dVar, @yfb b5d b5dVar, boolean z) {
        boolean z2;
        if (this.f56010e) {
            return m2d.ProcessResult(false, false);
        }
        boolean z3 = true;
        try {
            this.f56010e = true;
            kb8 kb8VarProduce = this.f56008c.produce(j2dVar, b5dVar);
            int size = kb8VarProduce.getChanges().size();
            for (int i = 0; i < size; i++) {
                h2d h2dVarValueAt = kb8VarProduce.getChanges().valueAt(i);
                if (!h2dVarValueAt.getPressed() && !h2dVarValueAt.getPreviousPressed()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int size2 = kb8VarProduce.getChanges().size();
            for (int i2 = 0; i2 < size2; i2++) {
                h2d h2dVarValueAt2 = kb8VarProduce.getChanges().valueAt(i2);
                if (z2 || u1d.changedToDownIgnoreConsumed(h2dVarValueAt2)) {
                    lw8.m30901hitTestM_7yMNQ$ui_release$default(this.f56006a, h2dVarValueAt2.m29911getPositionF1C5BW0(), this.f56009d, z2d.m33469equalsimpl0(h2dVarValueAt2.m29914getTypeT8wyACA(), z2d.f103875b.m33476getTouchT8wyACA()), false, 8, null);
                    if (!this.f56009d.isEmpty()) {
                        this.f56007b.m28008addHitPathQJqDSyo(h2dVarValueAt2.m29909getIdJ3iCeTQ(), this.f56009d, u1d.changedToDownIgnoreConsumed(h2dVarValueAt2));
                        this.f56009d.clear();
                    }
                }
            }
            this.f56007b.removeDetachedPointerInputNodes();
            boolean zDispatchChanges = this.f56007b.dispatchChanges(kb8VarProduce, z);
            if (kb8VarProduce.getSuppressMovementConsumption()) {
                z3 = false;
            } else {
                int size3 = kb8VarProduce.getChanges().size();
                for (int i3 = 0; i3 < size3; i3++) {
                    h2d h2dVarValueAt3 = kb8VarProduce.getChanges().valueAt(i3);
                    if (u1d.positionChangedIgnoreConsumed(h2dVarValueAt3) && h2dVarValueAt3.isConsumed()) {
                        break;
                    }
                }
                z3 = false;
            }
            int iProcessResult = m2d.ProcessResult(zDispatchChanges, z3);
            this.f56010e = false;
            return iProcessResult;
        } catch (Throwable th) {
            this.f56010e = false;
            throw th;
        }
    }

    public final void processCancel() {
        if (this.f56010e) {
            return;
        }
        this.f56008c.clear();
        this.f56007b.processCancel();
    }
}
