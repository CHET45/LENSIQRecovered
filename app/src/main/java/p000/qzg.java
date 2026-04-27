package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public abstract class qzg {

    /* JADX INFO: renamed from: a */
    public static final qzg f76412a = new C11772a();

    /* JADX INFO: renamed from: qzg$a */
    public class C11772a extends qzg {
        @Override // p000.qzg
        public long read() {
            return System.nanoTime();
        }
    }

    public static qzg systemTicker() {
        return f76412a;
    }

    public abstract long read();
}
