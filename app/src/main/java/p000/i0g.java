package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class i0g<T> {

    /* JADX INFO: renamed from: b */
    public static final int f45408b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ArrayList<T> f45409a = new ArrayList<>();

    public final void clear() {
        this.f45409a.clear();
    }

    public final int getSize() {
        return this.f45409a.size();
    }

    public final boolean isEmpty() {
        return this.f45409a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final T peek() {
        return this.f45409a.get(getSize() - 1);
    }

    public final T pop() {
        return this.f45409a.remove(getSize() - 1);
    }

    public final boolean push(T t) {
        return this.f45409a.add(t);
    }

    @yfb
    public final T[] toArray() {
        int size = this.f45409a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = this.f45409a.get(i);
        }
        return tArr;
    }

    public final T peek(int i) {
        return this.f45409a.get(i);
    }
}
