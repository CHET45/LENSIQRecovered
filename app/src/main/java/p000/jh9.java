package p000;

/* JADX INFO: loaded from: classes7.dex */
public class jh9 extends lh9 {
    public final void forEach(@yfb qy6<? super lh9, bth> qy6Var) {
        Object next = getNext();
        md8.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        for (lh9 nextNode = (lh9) next; !md8.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            qy6Var.invoke(nextNode);
        }
    }

    @Override // p000.lh9
    public boolean isRemoved() {
        return false;
    }

    @Override // p000.lh9
    /* JADX INFO: renamed from: remove, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo30525remove() {
        return ((Boolean) remove()).booleanValue();
    }

    @yfb
    public final Void remove() {
        throw new IllegalStateException("head cannot be removed");
    }
}
