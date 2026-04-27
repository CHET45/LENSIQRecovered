package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,54:1\n460#2,11:55\n523#2:66\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:55,11\n52#1:66\n*E\n"})
@e0g(parameters = 0)
public final class h7b<T> {

    /* JADX INFO: renamed from: c */
    public static final int f42740c = f7b.f35631d;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f7b<T> f42741a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<bth> f42742b;

    public h7b(@yfb f7b<T> f7bVar, @yfb ny6<bth> ny6Var) {
        this.f42741a = f7bVar;
        this.f42742b = ny6Var;
    }

    public final void add(int i, T t) {
        this.f42741a.add(i, t);
        this.f42742b.invoke();
    }

    @yfb
    public final List<T> asList() {
        return this.f42741a.asMutableList();
    }

    public final void clear() {
        this.f42741a.clear();
        this.f42742b.invoke();
    }

    public final void forEach(@yfb qy6<? super T, bth> qy6Var) {
        f7b<T> vector = getVector();
        int size = vector.getSize();
        if (size > 0) {
            T[] content = vector.getContent();
            int i = 0;
            do {
                qy6Var.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final T get(int i) {
        return this.f42741a.getContent()[i];
    }

    @yfb
    public final ny6<bth> getOnVectorMutated() {
        return this.f42742b;
    }

    public final int getSize() {
        return this.f42741a.getSize();
    }

    @yfb
    public final f7b<T> getVector() {
        return this.f42741a;
    }

    public final T removeAt(int i) {
        T tRemoveAt = this.f42741a.removeAt(i);
        this.f42742b.invoke();
        return tRemoveAt;
    }
}
