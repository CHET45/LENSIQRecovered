package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n275#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1510#1:1584,6\n*E\n"})
public final class meb extends jh9 implements iz7 {
    @Override // p000.iz7
    @yfb
    public meb getList() {
        return this;
    }

    @yfb
    public final String getString(@yfb String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object next = getNext();
        md8.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        boolean z = true;
        for (lh9 nextNode = (lh9) next; !md8.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof rj8) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(nextNode);
            }
        }
        sb.append("]");
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // p000.iz7
    public boolean isActive() {
        return true;
    }

    @Override // p000.lh9
    @yfb
    public String toString() {
        return super.toString();
    }
}
