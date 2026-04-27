package p000;

/* JADX INFO: loaded from: classes7.dex */
public class am2 {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final ab8 f2022a;

    /* JADX INFO: renamed from: b */
    public boolean f2023b;

    public am2(@yfb ab8 ab8Var) {
        md8.checkNotNullParameter(ab8Var, "writer");
        this.f2022a = ab8Var;
        this.f2023b = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m892a(boolean z) {
        this.f2023b = z;
    }

    public final boolean getWritingFirst() {
        return this.f2023b;
    }

    public void indent() {
        this.f2023b = true;
    }

    public void nextItem() {
        this.f2023b = false;
    }

    public void nextItemIfNotFirst() {
        this.f2023b = false;
    }

    public final void print(char c) {
        this.f2022a.writeChar(c);
    }

    public void printQuoted(@yfb String str) {
        md8.checkNotNullParameter(str, "value");
        this.f2022a.writeQuoted(str);
    }

    public void space() {
    }

    public void unIndent() {
    }

    public final void print(@yfb String str) {
        md8.checkNotNullParameter(str, "v");
        this.f2022a.write(str);
    }

    public void print(float f) {
        this.f2022a.write(String.valueOf(f));
    }

    public void print(double d) {
        this.f2022a.write(String.valueOf(d));
    }

    public void print(byte b) {
        this.f2022a.writeLong(b);
    }

    public void print(short s) {
        this.f2022a.writeLong(s);
    }

    public void print(int i) {
        this.f2022a.writeLong(i);
    }

    public void print(long j) {
        this.f2022a.writeLong(j);
    }

    public void print(boolean z) {
        this.f2022a.write(String.valueOf(z));
    }
}
