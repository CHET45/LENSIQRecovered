package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class rih<E> {

    /* JADX INFO: renamed from: c */
    public static final int f78406c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public Object[] f78407a = oih.f67755d.getEMPTY$runtime_release().getBuffer();

    /* JADX INFO: renamed from: b */
    public int f78408b;

    public static /* synthetic */ void reset$default(rih rihVar, Object[] objArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        rihVar.reset(objArr, i);
    }

    public final E currentElement() {
        ec2.m28824assert(hasNextElement());
        return (E) this.f78407a[this.f78408b];
    }

    @yfb
    public final oih<? extends E> currentNode() {
        ec2.m28824assert(hasNextNode());
        Object obj = this.f78407a[this.f78408b];
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (oih) obj;
    }

    public final boolean hasNextCell() {
        return this.f78408b < this.f78407a.length;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.f78407a[this.f78408b] instanceof oih);
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.f78407a[this.f78408b] instanceof oih);
    }

    public final void moveToNextCell() {
        ec2.m28824assert(hasNextCell());
        this.f78408b++;
    }

    public final E nextElement() {
        ec2.m28824assert(hasNextElement());
        Object[] objArr = this.f78407a;
        int i = this.f78408b;
        this.f78408b = i + 1;
        return (E) objArr[i];
    }

    public final void reset(@yfb Object[] objArr, int i) {
        this.f78407a = objArr;
        this.f78408b = i;
    }
}
