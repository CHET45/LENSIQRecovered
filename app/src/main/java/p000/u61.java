package p000;

/* JADX INFO: loaded from: classes8.dex */
public class u61 extends t61 {

    /* JADX INFO: renamed from: a */
    public final m61[] f86860a;

    /* JADX INFO: renamed from: b */
    public int f86861b = -1;

    /* JADX INFO: renamed from: c */
    public int f86862c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f86863d = false;

    public u61(m61... m61VarArr) {
        this.f86860a = m61VarArr;
    }

    @Override // p000.t61
    public t61 atColumn(int i) {
        this.f86862c = i;
        return this;
    }

    @Override // p000.t61
    public t61 atIndex(int i) {
        this.f86861b = i;
        return this;
    }

    public m61[] getBlockParsers() {
        return this.f86860a;
    }

    public int getNewColumn() {
        return this.f86862c;
    }

    public int getNewIndex() {
        return this.f86861b;
    }

    public boolean isReplaceActiveBlockParser() {
        return this.f86863d;
    }

    @Override // p000.t61
    public t61 replaceActiveBlockParser() {
        this.f86863d = true;
        return this;
    }
}
