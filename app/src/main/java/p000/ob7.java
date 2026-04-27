package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ob7 implements Iterator<gn2>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final mrf f67056a;

    /* JADX INFO: renamed from: b */
    public final int f67057b;

    /* JADX INFO: renamed from: c */
    public int f67058c;

    /* JADX INFO: renamed from: d */
    public final int f67059d;

    public ob7(@yfb mrf mrfVar, int i, int i2) {
        this.f67056a = mrfVar;
        this.f67057b = i2;
        this.f67058c = i;
        this.f67059d = mrfVar.getVersion$runtime_release();
        if (mrfVar.getWriter$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.f67056a.getVersion$runtime_release() != this.f67059d) {
            throw new ConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.f67057b;
    }

    @yfb
    public final mrf getTable() {
        return this.f67056a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f67058c < this.f67057b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public gn2 next() {
        validateRead();
        int i = this.f67058c;
        this.f67058c = orf.groupSize(this.f67056a.getGroups(), i) + i;
        return new nrf(this.f67056a, i, this.f67059d);
    }
}
