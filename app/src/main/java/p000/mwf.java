package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mwf {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object f62577a;

    /* JADX INFO: renamed from: b */
    public final int f62578b;

    public mwf(@yfb Object obj, int i) {
        this.f62577a = obj;
        this.f62578b = i;
    }

    public static /* synthetic */ mwf copy$default(mwf mwfVar, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = mwfVar.f62577a;
        }
        if ((i2 & 2) != 0) {
            i = mwfVar.f62578b;
        }
        return mwfVar.copy(obj, i);
    }

    @yfb
    public final Object component1() {
        return this.f62577a;
    }

    public final int component2() {
        return this.f62578b;
    }

    @yfb
    public final mwf copy(@yfb Object obj, int i) {
        return new mwf(obj, i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwf)) {
            return false;
        }
        mwf mwfVar = (mwf) obj;
        return md8.areEqual(this.f62577a, mwfVar.f62577a) && this.f62578b == mwfVar.f62578b;
    }

    public final int getIndex() {
        return this.f62578b;
    }

    @yfb
    public final Object getParentIdentity() {
        return this.f62577a;
    }

    public int hashCode() {
        return (this.f62577a.hashCode() * 31) + Integer.hashCode(this.f62578b);
    }

    @yfb
    public String toString() {
        return "SourceInformationSlotTableGroupIdentity(parentIdentity=" + this.f62577a + ", index=" + this.f62578b + ')';
    }
}
