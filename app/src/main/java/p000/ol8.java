package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class ol8<T> implements Iterator<T>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final bk8 f68056a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final krd f68057b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final t74<T> f68058c;

    /* JADX WARN: Multi-variable type inference failed */
    public ol8(@yfb bk8 bk8Var, @yfb krd krdVar, @yfb t74<? extends T> t74Var) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(krdVar, "lexer");
        md8.checkNotNullParameter(t74Var, "deserializer");
        this.f68056a = bk8Var;
        this.f68057b = krdVar;
        this.f68058c = t74Var;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68057b.isNotEof();
    }

    @Override // java.util.Iterator
    public T next() {
        return (T) new y6g(this.f68056a, csi.f27316c, this.f68057b, this.f68058c.getDescriptor(), null).decodeSerializableValue(this.f68058c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
