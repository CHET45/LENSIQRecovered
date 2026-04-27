package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class orc<E> extends nrc<E> implements Iterator<E>, xo8 {

    /* JADX INFO: renamed from: F */
    public static final int f68388F = 8;

    /* JADX INFO: renamed from: C */
    public int f68389C;

    /* JADX INFO: renamed from: e */
    @yfb
    public final mrc<E> f68390e;

    /* JADX INFO: renamed from: f */
    @gib
    public E f68391f;

    /* JADX INFO: renamed from: m */
    public boolean f68392m;

    public orc(@yfb mrc<E> mrcVar) {
        super(mrcVar.getNode$runtime_release());
        this.f68390e = mrcVar;
        this.f68389C = mrcVar.getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.f68390e.getModCount$runtime_release() != this.f68389C) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.f68392m) {
            throw new IllegalStateException();
        }
    }

    private final boolean isCollision(oih<?> oihVar) {
        return oihVar.getBitmap() == 0;
    }

    private final void resetPath(int i, oih<?> oihVar, E e, int i2) {
        if (isCollision(oihVar)) {
            int iIndexOf = e80.indexOf((E[]) oihVar.getBuffer(), e);
            ec2.m28824assert(iIndexOf != -1);
            m18100b().get(i2).reset(oihVar.getBuffer(), iIndexOf);
            m18102d(i2);
            return;
        }
        int iIndexOfCellAt$runtime_release = oihVar.indexOfCellAt$runtime_release(1 << tih.indexSegment(i, i2 * 5));
        m18100b().get(i2).reset(oihVar.getBuffer(), iIndexOfCellAt$runtime_release);
        Object obj = oihVar.getBuffer()[iIndexOfCellAt$runtime_release];
        if (obj instanceof oih) {
            resetPath(i, (oih) obj, e, i2 + 1);
        } else {
            m18102d(i2);
        }
    }

    @Override // p000.nrc, java.util.Iterator
    public E next() {
        checkForComodification();
        E e = (E) super.next();
        this.f68391f = e;
        this.f68392m = true;
        return e;
    }

    @Override // p000.nrc, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            E eM18099a = m18099a();
            qlh.asMutableCollection(this.f68390e).remove(this.f68391f);
            resetPath(eM18099a != null ? eM18099a.hashCode() : 0, this.f68390e.getNode$runtime_release(), eM18099a, 0);
        } else {
            qlh.asMutableCollection(this.f68390e).remove(this.f68391f);
        }
        this.f68391f = null;
        this.f68392m = false;
        this.f68389C = this.f68390e.getModCount$runtime_release();
    }
}
