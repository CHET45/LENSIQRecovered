package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class ml8<T> implements Iterator<T>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final bk8 f61404a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final krd f61405b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final t74<T> f61406c;

    /* JADX INFO: renamed from: d */
    public boolean f61407d;

    /* JADX INFO: renamed from: e */
    public boolean f61408e;

    /* JADX WARN: Multi-variable type inference failed */
    public ml8(@yfb bk8 bk8Var, @yfb krd krdVar, @yfb t74<? extends T> t74Var) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(krdVar, "lexer");
        md8.checkNotNullParameter(t74Var, "deserializer");
        this.f61404a = bk8Var;
        this.f61405b = krdVar;
        this.f61406c = t74Var;
        this.f61407d = true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f61408e) {
            return false;
        }
        if (this.f61405b.peekNextToken() != 9) {
            if (this.f61405b.isNotEof() || this.f61408e) {
                return true;
            }
            AbstractC2163c2.fail$kotlinx_serialization_json$default(this.f61405b, (byte) 9, false, 2, null);
            throw new us8();
        }
        this.f61408e = true;
        this.f61405b.consumeNextToken((byte) 9);
        if (this.f61405b.isNotEof()) {
            if (this.f61405b.peekNextToken() == 8) {
                AbstractC2163c2.fail$default(this.f61405b, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                throw new us8();
            }
            this.f61405b.expectEof();
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.f61407d) {
            this.f61407d = false;
        } else {
            this.f61405b.consumeNextToken(C4584d2.f28238g);
        }
        return (T) new y6g(this.f61404a, csi.f27316c, this.f61405b, this.f61406c.getDescriptor(), null).decodeSerializableValue(this.f61406c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
