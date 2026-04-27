package p000;

import java.util.List;
import p000.i09;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nLazyGridPrefetchStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,225:1\n1208#2:226\n1187#2,2:227\n460#3,11:229\n138#3:240\n460#3,11:241\n460#3,11:252\n460#3,11:263\n*S KotlinDebug\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n*L\n139#1:226\n139#1:227,2\n170#1:229,11\n175#1:240\n185#1:241,11\n193#1:252,11\n213#1:263,11\n*E\n"})
public final class iw3 implements oy8 {

    /* JADX INFO: renamed from: a */
    public final int f48645a;

    /* JADX INFO: renamed from: b */
    public int f48646b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final f7b<i09.InterfaceC7095b> f48647c;

    /* JADX INFO: renamed from: d */
    public boolean f48648d;

    public iw3() {
        this(0, 1, null);
    }

    @Override // p000.oy8
    public void onNestedPrefetch(@yfb fab fabVar, int i) {
        int i2 = this.f48645a;
        for (int i3 = 0; i3 < i2; i3++) {
            fabVar.schedulePrefetch(i + i3);
        }
    }

    @Override // p000.oy8
    public void onScroll(@yfb ny8 ny8Var, float f, @yfb fy8 fy8Var) {
        int row;
        int index;
        f7b<i09.InterfaceC7095b> f7bVar;
        int size;
        f7b<i09.InterfaceC7095b> f7bVar2;
        int size2;
        f7b<i09.InterfaceC7095b> f7bVar3;
        int size3;
        if (fy8Var.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        int i = 0;
        boolean z = f < 0.0f;
        if (z) {
            xx8 xx8Var = (xx8) v82.last((List) fy8Var.getVisibleItemsInfo());
            row = (fy8Var.getOrientation() == t7c.Vertical ? xx8Var.getRow() : xx8Var.getColumn()) + 1;
            index = ((xx8) v82.last((List) fy8Var.getVisibleItemsInfo())).getIndex() + 1;
        } else {
            xx8 xx8Var2 = (xx8) v82.first((List) fy8Var.getVisibleItemsInfo());
            row = (fy8Var.getOrientation() == t7c.Vertical ? xx8Var2.getRow() : xx8Var2.getColumn()) - 1;
            index = ((xx8) v82.first((List) fy8Var.getVisibleItemsInfo())).getIndex() - 1;
        }
        if (index < 0 || index >= fy8Var.getTotalItemsCount()) {
            return;
        }
        if (row != this.f48646b) {
            if (this.f48648d != z && (size3 = (f7bVar3 = this.f48647c).getSize()) > 0) {
                i09.InterfaceC7095b[] content = f7bVar3.getContent();
                int i2 = 0;
                do {
                    content[i2].cancel();
                    i2++;
                } while (i2 < size3);
            }
            this.f48648d = z;
            this.f48646b = row;
            this.f48647c.clear();
            f7b<i09.InterfaceC7095b> f7bVar4 = this.f48647c;
            f7bVar4.addAll(f7bVar4.getSize(), (List<? extends i09.InterfaceC7095b>) ny8Var.scheduleLinePrefetch(row));
        }
        if (!z) {
            if (fy8Var.getViewportStartOffset() - wy8.offsetOnMainAxis((xx8) v82.first((List) fy8Var.getVisibleItemsInfo()), fy8Var.getOrientation()) >= f || (size = (f7bVar = this.f48647c).getSize()) <= 0) {
                return;
            }
            i09.InterfaceC7095b[] content2 = f7bVar.getContent();
            do {
                content2[i].markAsUrgent();
                i++;
            } while (i < size);
            return;
        }
        xx8 xx8Var3 = (xx8) v82.last((List) fy8Var.getVisibleItemsInfo());
        if (((wy8.offsetOnMainAxis(xx8Var3, fy8Var.getOrientation()) + wy8.sizeOnMainAxis(xx8Var3, fy8Var.getOrientation())) + fy8Var.getMainAxisItemSpacing()) - fy8Var.getViewportEndOffset() >= (-f) || (size2 = (f7bVar2 = this.f48647c).getSize()) <= 0) {
            return;
        }
        i09.InterfaceC7095b[] content3 = f7bVar2.getContent();
        do {
            content3[i].markAsUrgent();
            i++;
        } while (i < size2);
    }

    @Override // p000.oy8
    public void onVisibleItemsUpdated(@yfb ny8 ny8Var, @yfb fy8 fy8Var) {
        int row;
        if (this.f48646b == -1 || fy8Var.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.f48648d) {
            xx8 xx8Var = (xx8) v82.last((List) fy8Var.getVisibleItemsInfo());
            row = (fy8Var.getOrientation() == t7c.Vertical ? xx8Var.getRow() : xx8Var.getColumn()) + 1;
        } else {
            xx8 xx8Var2 = (xx8) v82.first((List) fy8Var.getVisibleItemsInfo());
            row = (fy8Var.getOrientation() == t7c.Vertical ? xx8Var2.getRow() : xx8Var2.getColumn()) - 1;
        }
        if (this.f48646b != row) {
            this.f48646b = -1;
            f7b<i09.InterfaceC7095b> f7bVar = this.f48647c;
            int size = f7bVar.getSize();
            if (size > 0) {
                i09.InterfaceC7095b[] content = f7bVar.getContent();
                int i = 0;
                do {
                    content[i].cancel();
                    i++;
                } while (i < size);
            }
            this.f48647c.clear();
        }
    }

    public iw3(int i) {
        this.f48645a = i;
        this.f48646b = -1;
        this.f48647c = new f7b<>(new i09.InterfaceC7095b[16], 0);
    }

    public /* synthetic */ iw3(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 2 : i);
    }
}
