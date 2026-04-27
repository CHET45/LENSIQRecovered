package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface jx7<E> extends List<E>, bx7<E>, uo8 {

    /* JADX INFO: renamed from: jx7$a */
    public static final class C8135a<E> extends AbstractC7110i2<E> implements jx7<E> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final jx7<E> f52175a;

        /* JADX INFO: renamed from: b */
        public final int f52176b;

        /* JADX INFO: renamed from: c */
        public final int f52177c;

        /* JADX INFO: renamed from: d */
        public int f52178d;

        /* JADX WARN: Multi-variable type inference failed */
        public C8135a(@yfb jx7<? extends E> jx7Var, int i, int i2) {
            this.f52175a = jx7Var;
            this.f52176b = i;
            this.f52177c = i2;
            e99.checkRangeIndexes$runtime_release(i, i2, jx7Var.size());
            this.f52178d = i2 - i;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public E get(int i) {
            e99.checkElementIndex$runtime_release(i, this.f52178d);
            return this.f52175a.get(this.f52176b + i);
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f52178d;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        @yfb
        public jx7<E> subList(int i, int i2) {
            e99.checkRangeIndexes$runtime_release(i, i2, this.f52178d);
            jx7<E> jx7Var = this.f52175a;
            int i3 = this.f52176b;
            return new C8135a(jx7Var, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    @yfb
    default jx7<E> subList(int i, int i2) {
        return new C8135a(this, i, i2);
    }
}
