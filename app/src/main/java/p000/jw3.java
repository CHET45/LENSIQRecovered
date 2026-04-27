package p000;

import java.util.List;
import p000.i09;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class jw3 implements f19 {

    /* JADX INFO: renamed from: a */
    public final int f52125a;

    /* JADX INFO: renamed from: b */
    public int f52126b;

    /* JADX INFO: renamed from: c */
    @gib
    public i09.InterfaceC7095b f52127c;

    /* JADX INFO: renamed from: d */
    public boolean f52128d;

    public jw3() {
        this(0, 1, null);
    }

    @Override // p000.f19
    public void onNestedPrefetch(@yfb fab fabVar, int i) {
        int i2 = this.f52125a;
        for (int i3 = 0; i3 < i2; i3++) {
            fabVar.schedulePrefetch(i + i3);
        }
    }

    @Override // p000.f19
    public void onScroll(@yfb e19 e19Var, float f, @yfb y09 y09Var) {
        i09.InterfaceC7095b interfaceC7095b;
        i09.InterfaceC7095b interfaceC7095b2;
        i09.InterfaceC7095b interfaceC7095b3;
        if (y09Var.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        int index = z ? ((t09) v82.last((List) y09Var.getVisibleItemsInfo())).getIndex() + 1 : ((t09) v82.first((List) y09Var.getVisibleItemsInfo())).getIndex() - 1;
        if (index < 0 || index >= y09Var.getTotalItemsCount()) {
            return;
        }
        if (index != this.f52126b) {
            if (this.f52128d != z && (interfaceC7095b3 = this.f52127c) != null) {
                interfaceC7095b3.cancel();
            }
            this.f52128d = z;
            this.f52126b = index;
            this.f52127c = e19Var.schedulePrefetch(index);
        }
        if (!z) {
            if (y09Var.getViewportStartOffset() - ((t09) v82.first((List) y09Var.getVisibleItemsInfo())).getOffset() >= f || (interfaceC7095b = this.f52127c) == null) {
                return;
            }
            interfaceC7095b.markAsUrgent();
            return;
        }
        t09 t09Var = (t09) v82.last((List) y09Var.getVisibleItemsInfo());
        if (((t09Var.getOffset() + t09Var.getSize()) + y09Var.getMainAxisItemSpacing()) - y09Var.getViewportEndOffset() >= (-f) || (interfaceC7095b2 = this.f52127c) == null) {
            return;
        }
        interfaceC7095b2.markAsUrgent();
    }

    @Override // p000.f19
    public void onVisibleItemsUpdated(@yfb e19 e19Var, @yfb y09 y09Var) {
        if (this.f52126b == -1 || y09Var.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.f52126b != (this.f52128d ? ((t09) v82.last((List) y09Var.getVisibleItemsInfo())).getIndex() + 1 : ((t09) v82.first((List) y09Var.getVisibleItemsInfo())).getIndex() - 1)) {
            this.f52126b = -1;
            i09.InterfaceC7095b interfaceC7095b = this.f52127c;
            if (interfaceC7095b != null) {
                interfaceC7095b.cancel();
            }
            this.f52127c = null;
        }
    }

    public jw3(int i) {
        this.f52125a = i;
        this.f52126b = -1;
    }

    public /* synthetic */ jw3(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 2 : i);
    }
}
