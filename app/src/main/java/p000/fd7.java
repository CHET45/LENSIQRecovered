package p000;

/* JADX INFO: loaded from: classes.dex */
public class fd7 implements eo5, lvd {

    /* JADX INFO: renamed from: a */
    public final f2g f36181a;

    /* JADX INFO: renamed from: b */
    public int f36182b;

    /* JADX INFO: renamed from: c */
    public dd7 f36183c;

    /* JADX INFO: renamed from: d */
    public int f36184d = -1;

    /* JADX INFO: renamed from: e */
    public int f36185e = -1;

    /* JADX INFO: renamed from: f */
    public float f36186f = 0.0f;

    /* JADX INFO: renamed from: g */
    public Object f36187g;

    public fd7(f2g f2gVar) {
        this.f36181a = f2gVar;
    }

    @Override // p000.eo5
    public void apply() {
        this.f36183c.setOrientation(this.f36182b);
        int i = this.f36184d;
        if (i != -1) {
            this.f36183c.setGuideBegin(i);
            return;
        }
        int i2 = this.f36185e;
        if (i2 != -1) {
            this.f36183c.setGuideEnd(i2);
        } else {
            this.f36183c.setGuidePercent(this.f36186f);
        }
    }

    public fd7 end(Object obj) {
        this.f36184d = -1;
        this.f36185e = this.f36181a.convertDimension(obj);
        this.f36186f = 0.0f;
        return this;
    }

    @Override // p000.eo5, p000.lvd
    public iu2 getConstraintWidget() {
        if (this.f36183c == null) {
            this.f36183c = new dd7();
        }
        return this.f36183c;
    }

    @Override // p000.lvd
    public eo5 getFacade() {
        return null;
    }

    @Override // p000.lvd
    public Object getKey() {
        return this.f36187g;
    }

    public int getOrientation() {
        return this.f36182b;
    }

    public fd7 percent(float f) {
        this.f36184d = -1;
        this.f36185e = -1;
        this.f36186f = f;
        return this;
    }

    @Override // p000.lvd
    public void setConstraintWidget(iu2 iu2Var) {
        if (iu2Var instanceof dd7) {
            this.f36183c = (dd7) iu2Var;
        } else {
            this.f36183c = null;
        }
    }

    @Override // p000.lvd
    public void setKey(Object obj) {
        this.f36187g = obj;
    }

    public void setOrientation(int i) {
        this.f36182b = i;
    }

    public fd7 start(Object obj) {
        this.f36184d = this.f36181a.convertDimension(obj);
        this.f36185e = -1;
        this.f36186f = 0.0f;
        return this;
    }
}
