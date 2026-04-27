package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,289:1\n50#2,7:290\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n*L\n206#1:290,7\n*E\n"})
@e0g(parameters = 0)
public abstract class AbstractC14853x<T> implements p40<T> {

    /* JADX INFO: renamed from: d */
    public static final int f95880d = 8;

    /* JADX INFO: renamed from: a */
    public final T f95881a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<T> f95882b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public T f95883c;

    public AbstractC14853x(T t) {
        this.f95881a = t;
        this.f95883c = t;
    }

    /* JADX INFO: renamed from: a */
    public final void m24883a(@yfb List<T> list, int i, int i2, int i3) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List<T> listSubList = list.subList(i, i3 + i);
            List mutableList = v82.toMutableList((Collection) listSubList);
            listSubList.clear();
            list.addAll(i4, mutableList);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2892b();

    /* JADX INFO: renamed from: c */
    public final void m24884c(@yfb List<T> list, int i, int i2) {
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    @Override // p000.p40
    public final void clear() {
        this.f95882b.clear();
        m24885d(this.f95881a);
        mo2892b();
    }

    /* JADX INFO: renamed from: d */
    public void m24885d(T t) {
        this.f95883c = t;
    }

    @Override // p000.p40
    public void down(T t) {
        this.f95882b.add(getCurrent());
        m24885d(t);
    }

    @Override // p000.p40
    public T getCurrent() {
        return this.f95883c;
    }

    public final T getRoot() {
        return this.f95881a;
    }

    @Override // p000.p40
    /* JADX INFO: renamed from: up */
    public void mo14389up() {
        if (this.f95882b.isEmpty()) {
            a8d.throwIllegalStateException("empty stack");
        }
        m24885d(this.f95882b.remove(r0.size() - 1));
    }
}
