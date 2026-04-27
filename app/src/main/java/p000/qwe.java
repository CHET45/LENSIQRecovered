package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.izb;

/* JADX INFO: loaded from: classes.dex */
public final class qwe {

    /* JADX INFO: renamed from: qwe$a */
    public static final class C11743a implements zqg {

        /* JADX INFO: renamed from: a */
        public long f76208a;

        /* JADX INFO: renamed from: b */
        public long f76209b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ny6<mv8> f76210c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ dxe f76211d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f76212e;

        /* JADX WARN: Multi-variable type inference failed */
        public C11743a(ny6<? extends mv8> ny6Var, dxe dxeVar, long j) {
            this.f76210c = ny6Var;
            this.f76211d = dxeVar;
            this.f76212e = j;
            izb.C7673a c7673a = izb.f49009b;
            this.f76208a = c7673a.m30445getZeroF1C5BW0();
            this.f76209b = c7673a.m30445getZeroF1C5BW0();
        }

        public final long getDragTotalDistance() {
            return this.f76209b;
        }

        public final long getLastPosition() {
            return this.f76208a;
        }

        @Override // p000.zqg
        public void onCancel() {
            if (gxe.hasSelection(this.f76211d, this.f76212e)) {
                this.f76211d.notifySelectionUpdateEnd();
            }
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDown-k-4lQ0M */
        public void mo31651onDownk4lQ0M(long j) {
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onDrag-k-4lQ0M */
        public void mo31652onDragk4lQ0M(long j) {
            mv8 mv8VarInvoke = this.f76210c.invoke();
            if (mv8VarInvoke != null) {
                dxe dxeVar = this.f76211d;
                long j2 = this.f76212e;
                if (mv8VarInvoke.isAttached() && gxe.hasSelection(dxeVar, j2)) {
                    long jM30434plusMKHz9U = izb.m30434plusMKHz9U(this.f76209b, j);
                    this.f76209b = jM30434plusMKHz9U;
                    long jM30434plusMKHz9U2 = izb.m30434plusMKHz9U(this.f76208a, jM30434plusMKHz9U);
                    if (dxeVar.mo28712notifySelectionUpdatenjBpvok(mv8VarInvoke, jM30434plusMKHz9U2, this.f76208a, false, mwe.f62568a.getWord(), true)) {
                        this.f76208a = jM30434plusMKHz9U2;
                        this.f76209b = izb.f49009b.m30445getZeroF1C5BW0();
                    }
                }
            }
        }

        @Override // p000.zqg
        /* JADX INFO: renamed from: onStart-k-4lQ0M */
        public void mo31653onStartk4lQ0M(long j) {
            mv8 mv8VarInvoke = this.f76210c.invoke();
            if (mv8VarInvoke != null) {
                dxe dxeVar = this.f76211d;
                if (!mv8VarInvoke.isAttached()) {
                    return;
                }
                dxeVar.mo28713notifySelectionUpdateStartubNVwUQ(mv8VarInvoke, j, mwe.f62568a.getWord(), true);
                this.f76208a = j;
            }
            if (gxe.hasSelection(this.f76211d, this.f76212e)) {
                this.f76209b = izb.f49009b.m30445getZeroF1C5BW0();
            }
        }

        @Override // p000.zqg
        public void onStop() {
            if (gxe.hasSelection(this.f76211d, this.f76212e)) {
                this.f76211d.notifySelectionUpdateEnd();
            }
        }

        @Override // p000.zqg
        public void onUp() {
        }

        public final void setDragTotalDistance(long j) {
            this.f76209b = j;
        }

        public final void setLastPosition(long j) {
            this.f76208a = j;
        }
    }

    /* JADX INFO: renamed from: qwe$b */
    public static final class C11744b implements e0b {

        /* JADX INFO: renamed from: a */
        public long f76213a = izb.f49009b.m30445getZeroF1C5BW0();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<mv8> f76214b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ dxe f76215c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f76216d;

        /* JADX WARN: Multi-variable type inference failed */
        public C11744b(ny6<? extends mv8> ny6Var, dxe dxeVar, long j) {
            this.f76214b = ny6Var;
            this.f76215c = dxeVar;
            this.f76216d = j;
        }

        public final long getLastPosition() {
            return this.f76213a;
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onDrag-3MmeM6k */
        public boolean mo28715onDrag3MmeM6k(long j, @yfb mwe mweVar) {
            mv8 mv8VarInvoke = this.f76214b.invoke();
            if (mv8VarInvoke == null) {
                return true;
            }
            dxe dxeVar = this.f76215c;
            long j2 = this.f76216d;
            if (!mv8VarInvoke.isAttached() || !gxe.hasSelection(dxeVar, j2)) {
                return false;
            }
            if (!dxeVar.mo28712notifySelectionUpdatenjBpvok(mv8VarInvoke, j, this.f76213a, false, mweVar, false)) {
                return true;
            }
            this.f76213a = j;
            return true;
        }

        @Override // p000.e0b
        public void onDragDone() {
            this.f76215c.notifySelectionUpdateEnd();
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onExtend-k-4lQ0M */
        public boolean mo28716onExtendk4lQ0M(long j) {
            mv8 mv8VarInvoke = this.f76214b.invoke();
            if (mv8VarInvoke == null) {
                return false;
            }
            dxe dxeVar = this.f76215c;
            long j2 = this.f76216d;
            if (!mv8VarInvoke.isAttached()) {
                return false;
            }
            if (dxeVar.mo28712notifySelectionUpdatenjBpvok(mv8VarInvoke, j, this.f76213a, false, mwe.f62568a.getNone(), false)) {
                this.f76213a = j;
            }
            return gxe.hasSelection(dxeVar, j2);
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
        public boolean mo28717onExtendDragk4lQ0M(long j) {
            mv8 mv8VarInvoke = this.f76214b.invoke();
            if (mv8VarInvoke == null) {
                return true;
            }
            dxe dxeVar = this.f76215c;
            long j2 = this.f76216d;
            if (!mv8VarInvoke.isAttached() || !gxe.hasSelection(dxeVar, j2)) {
                return false;
            }
            if (!dxeVar.mo28712notifySelectionUpdatenjBpvok(mv8VarInvoke, j, this.f76213a, false, mwe.f62568a.getNone(), false)) {
                return true;
            }
            this.f76213a = j;
            return true;
        }

        @Override // p000.e0b
        /* JADX INFO: renamed from: onStart-3MmeM6k */
        public boolean mo28718onStart3MmeM6k(long j, @yfb mwe mweVar) {
            mv8 mv8VarInvoke = this.f76214b.invoke();
            if (mv8VarInvoke == null) {
                return false;
            }
            dxe dxeVar = this.f76215c;
            long j2 = this.f76216d;
            if (!mv8VarInvoke.isAttached()) {
                return false;
            }
            dxeVar.mo28713notifySelectionUpdateStartubNVwUQ(mv8VarInvoke, j, mweVar, false);
            this.f76213a = j;
            return gxe.hasSelection(dxeVar, j2);
        }

        public final void setLastPosition(long j) {
            this.f76213a = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0701e makeSelectionModifier(dxe dxeVar, long j, ny6<? extends mv8> ny6Var) {
        C11743a c11743a = new C11743a(ny6Var, dxeVar, j);
        return rwe.selectionGestureInput(InterfaceC0701e.f5158d1, new C11744b(ny6Var, dxeVar, j), c11743a);
    }
}
