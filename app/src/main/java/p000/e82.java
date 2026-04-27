package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public abstract class e82<E, C extends Collection<? extends E>, B> extends z72<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e82(@yfb lp8<E> lp8Var) {
        super(lp8Var, null);
        md8.checkNotNullParameter(lp8Var, "element");
    }

    @Override // p000.AbstractC10728p0
    @yfb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Iterator<E> collectionIterator(@yfb C c) {
        md8.checkNotNullParameter(c, "<this>");
        return c.iterator();
    }

    @Override // p000.AbstractC10728p0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int collectionSize(@yfb C c) {
        md8.checkNotNullParameter(c, "<this>");
        return c.size();
    }
}
