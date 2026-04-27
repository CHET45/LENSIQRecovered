package p000;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class nrc<E> implements Iterator<E>, uo8 {

    /* JADX INFO: renamed from: d */
    public static final int f65387d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<rih<E>> f65388a;

    /* JADX INFO: renamed from: b */
    public int f65389b;

    /* JADX INFO: renamed from: c */
    public boolean f65390c;

    public nrc(@yfb oih<E> oihVar) {
        List<rih<E>> listMutableListOf = l82.mutableListOf(new rih());
        this.f65388a = listMutableListOf;
        this.f65390c = true;
        rih.reset$default(listMutableListOf.get(0), oihVar.getBuffer(), 0, 2, null);
        this.f65389b = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (this.f65388a.get(this.f65389b).hasNextElement()) {
            return;
        }
        for (int i = this.f65389b; -1 < i; i--) {
            int iMoveToNextNodeWithData = moveToNextNodeWithData(i);
            if (iMoveToNextNodeWithData == -1 && this.f65388a.get(i).hasNextCell()) {
                this.f65388a.get(i).moveToNextCell();
                iMoveToNextNodeWithData = moveToNextNodeWithData(i);
            }
            if (iMoveToNextNodeWithData != -1) {
                this.f65389b = iMoveToNextNodeWithData;
                return;
            }
            if (i > 0) {
                this.f65388a.get(i - 1).moveToNextCell();
            }
            this.f65388a.get(i).reset(oih.f67755d.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.f65390c = false;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }

    private final int moveToNextNodeWithData(int i) {
        if (this.f65388a.get(i).hasNextElement()) {
            return i;
        }
        if (!this.f65388a.get(i).hasNextNode()) {
            return -1;
        }
        oih<? extends E> oihVarCurrentNode = this.f65388a.get(i).currentNode();
        int i2 = i + 1;
        if (i2 == this.f65388a.size()) {
            this.f65388a.add(new rih<>());
        }
        rih.reset$default(this.f65388a.get(i2), oihVarCurrentNode.getBuffer(), 0, 2, null);
        return moveToNextNodeWithData(i2);
    }

    /* JADX INFO: renamed from: a */
    public final E m18099a() {
        ec2.m28824assert(hasNext());
        return this.f65388a.get(this.f65389b).currentElement();
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final List<rih<E>> m18100b() {
        return this.f65388a;
    }

    /* JADX INFO: renamed from: c */
    public final int m18101c() {
        return this.f65389b;
    }

    /* JADX INFO: renamed from: d */
    public final void m18102d(int i) {
        this.f65389b = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65390c;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.f65390c) {
            throw new NoSuchElementException();
        }
        E eNextElement = this.f65388a.get(this.f65389b).nextElement();
        ensureNextElementIsReady();
        return eNextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
