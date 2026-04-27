package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class qy2 implements Iterator<rba>, uo8 {

    /* JADX INFO: renamed from: f */
    public static final int f76293f = 8;

    /* JADX INFO: renamed from: a */
    public final int f76294a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<Integer, a86, List<rba>> f76295b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<rba> f76296c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f76297d;

    /* JADX INFO: renamed from: e */
    public int f76298e;

    /* JADX WARN: Multi-variable type inference failed */
    public qy2(int i, @yfb gz6<? super Integer, ? super a86, ? extends List<? extends rba>> gz6Var) {
        this.f76294a = i;
        this.f76295b = gz6Var;
    }

    public static /* synthetic */ rba getNext$foundation_layout_release$default(qy2 qy2Var, a86 a86Var, int i, Object obj) {
        if ((i & 1) != 0) {
            a86Var = new a86(0, 0, 0.0f, 0.0f, 15, null);
        }
        return qy2Var.getNext$foundation_layout_release(a86Var);
    }

    @yfb
    public final List<rba> getList() {
        return this.f76296c;
    }

    @yfb
    public final rba getNext$foundation_layout_release(@yfb a86 a86Var) {
        if (this.f76298e < getList().size()) {
            rba rbaVar = getList().get(this.f76298e);
            this.f76298e++;
            return rbaVar;
        }
        int i = this.f76297d;
        if (i >= this.f76294a) {
            throw new ArrayIndexOutOfBoundsException("No item returned at index call. Index: " + this.f76297d);
        }
        List<rba> listInvoke = this.f76295b.invoke(Integer.valueOf(i), a86Var);
        this.f76297d++;
        if (listInvoke.isEmpty()) {
            return next();
        }
        rba rbaVar2 = (rba) v82.first((List) listInvoke);
        this.f76296c.addAll(listInvoke);
        this.f76298e++;
        return rbaVar2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76298e < getList().size() || this.f76297d < this.f76294a;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @yfb
    public rba next() {
        return getNext$foundation_layout_release$default(this, null, 1, null);
    }
}
