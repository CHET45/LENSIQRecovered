package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n1#2:4152\n*E\n"})
public final class jwf implements Iterator<gn2>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final mrf f52140a;

    /* JADX INFO: renamed from: b */
    public final int f52141b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qb7 f52142c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final kwf f52143d;

    /* JADX INFO: renamed from: e */
    public final int f52144e;

    /* JADX INFO: renamed from: f */
    public int f52145f;

    public jwf(@yfb mrf mrfVar, int i, @yfb qb7 qb7Var, @yfb kwf kwfVar) {
        this.f52140a = mrfVar;
        this.f52141b = i;
        this.f52142c = qb7Var;
        this.f52143d = kwfVar;
        this.f52144e = mrfVar.getVersion$runtime_release();
    }

    @yfb
    public final qb7 getGroup() {
        return this.f52142c;
    }

    public final int getParent() {
        return this.f52141b;
    }

    @yfb
    public final kwf getPath() {
        return this.f52143d;
    }

    @yfb
    public final mrf getTable() {
        return this.f52140a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> groups = this.f52142c.getGroups();
        return groups != null && this.f52145f < groups.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @yfb
    public gn2 next() {
        Object obj;
        ArrayList<Object> groups = this.f52142c.getGroups();
        if (groups != null) {
            int i = this.f52145f;
            this.f52145f = i + 1;
            obj = groups.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof C5897fo) {
            return new nrf(this.f52140a, ((C5897fo) obj).getLocation$runtime_release(), this.f52144e);
        }
        if (obj instanceof qb7) {
            return new lwf(this.f52140a, this.f52141b, (qb7) obj, new vxd(this.f52143d, this.f52145f - 1));
        }
        gm2.composeRuntimeError("Unexpected group information structure");
        throw new us8();
    }
}
