package p000;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class n82 extends m82 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: n82$a */
    public static final class C9725a<T> implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Enumeration<T> f63482a;

        public C9725a(Enumeration<T> enumeration) {
            this.f63482a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f63482a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f63482a.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @yfb
    public static <T> Iterator<T> iterator(@yfb Enumeration<T> enumeration) {
        md8.checkNotNullParameter(enumeration, "<this>");
        return new C9725a(enumeration);
    }
}
