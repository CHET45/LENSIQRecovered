package p000;

/* JADX INFO: loaded from: classes5.dex */
@c15
public final class e5f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final b75 f31859a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final n5f f31860b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final k40 f31861c;

    public e5f(@yfb b75 b75Var, @yfb n5f n5fVar, @yfb k40 k40Var) {
        md8.checkNotNullParameter(b75Var, "eventType");
        md8.checkNotNullParameter(n5fVar, "sessionData");
        md8.checkNotNullParameter(k40Var, "applicationInfo");
        this.f31859a = b75Var;
        this.f31860b = n5fVar;
        this.f31861c = k40Var;
    }

    public static /* synthetic */ e5f copy$default(e5f e5fVar, b75 b75Var, n5f n5fVar, k40 k40Var, int i, Object obj) {
        if ((i & 1) != 0) {
            b75Var = e5fVar.f31859a;
        }
        if ((i & 2) != 0) {
            n5fVar = e5fVar.f31860b;
        }
        if ((i & 4) != 0) {
            k40Var = e5fVar.f31861c;
        }
        return e5fVar.copy(b75Var, n5fVar, k40Var);
    }

    @yfb
    public final b75 component1() {
        return this.f31859a;
    }

    @yfb
    public final n5f component2() {
        return this.f31860b;
    }

    @yfb
    public final k40 component3() {
        return this.f31861c;
    }

    @yfb
    public final e5f copy(@yfb b75 b75Var, @yfb n5f n5fVar, @yfb k40 k40Var) {
        md8.checkNotNullParameter(b75Var, "eventType");
        md8.checkNotNullParameter(n5fVar, "sessionData");
        md8.checkNotNullParameter(k40Var, "applicationInfo");
        return new e5f(b75Var, n5fVar, k40Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5f)) {
            return false;
        }
        e5f e5fVar = (e5f) obj;
        return this.f31859a == e5fVar.f31859a && md8.areEqual(this.f31860b, e5fVar.f31860b) && md8.areEqual(this.f31861c, e5fVar.f31861c);
    }

    @yfb
    public final k40 getApplicationInfo() {
        return this.f31861c;
    }

    @yfb
    public final b75 getEventType() {
        return this.f31859a;
    }

    @yfb
    public final n5f getSessionData() {
        return this.f31860b;
    }

    public int hashCode() {
        return (((this.f31859a.hashCode() * 31) + this.f31860b.hashCode()) * 31) + this.f31861c.hashCode();
    }

    @yfb
    public String toString() {
        return "SessionEvent(eventType=" + this.f31859a + ", sessionData=" + this.f31860b + ", applicationInfo=" + this.f31861c + ')';
    }
}
