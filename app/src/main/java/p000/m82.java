package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class m82 extends l82 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: m82$a */
    public static final class C9217a<T> implements Iterable<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<Iterator<T>> f60179a;

        /* JADX WARN: Multi-variable type inference failed */
        public C9217a(ny6<? extends Iterator<? extends T>> ny6Var) {
            this.f60179a = ny6Var;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f60179a.invoke();
        }
    }

    @t28
    private static final <T> Iterable<T> Iterable(ny6<? extends Iterator<? extends T>> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "iterator");
        return new C9217a(ny6Var);
    }

    @yjd
    public static <T> int collectionSizeOrDefault(@yfb Iterable<? extends T> iterable, int i) {
        md8.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    @gib
    @yjd
    public static final <T> Integer collectionSizeOrNull(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @yfb
    public static <T> List<T> flatten(@yfb Iterable<? extends Iterable<? extends T>> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            q82.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    @yfb
    public static final <T, R> scc<List<T>, List<R>> unzip(@yfb Iterable<? extends scc<? extends T, ? extends R>> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        int iCollectionSizeOrDefault = collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        ArrayList arrayList2 = new ArrayList(iCollectionSizeOrDefault);
        for (scc<? extends T, ? extends R> sccVar : iterable) {
            arrayList.add(sccVar.getFirst());
            arrayList2.add(sccVar.getSecond());
        }
        return vkh.m24050to(arrayList, arrayList2);
    }
}
