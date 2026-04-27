package p000;

import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.8")
public final class y35<T extends Enum<T>> extends AbstractC7110i2<T> implements v35<T>, Serializable {

    /* JADX INFO: renamed from: a */
    @yfb
    public final T[] f100208a;

    public y35(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "entries");
        this.f100208a = tArr;
    }

    private final Object writeReplace() {
        return new z35(this.f100208a);
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum) obj);
        }
        return false;
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
    public int getSize() {
        return this.f100208a.length;
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum) obj);
        }
        return -1;
    }

    public boolean contains(@yfb T t) {
        md8.checkNotNullParameter(t, "element");
        return ((Enum) e80.getOrNull(this.f100208a, t.ordinal())) == t;
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public T get(int i) {
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f100208a.length);
        return this.f100208a[i];
    }

    public int indexOf(@yfb T t) {
        md8.checkNotNullParameter(t, "element");
        int iOrdinal = t.ordinal();
        if (((Enum) e80.getOrNull(this.f100208a, iOrdinal)) == t) {
            return iOrdinal;
        }
        return -1;
    }

    public int lastIndexOf(@yfb T t) {
        md8.checkNotNullParameter(t, "element");
        return indexOf((Object) t);
    }
}
