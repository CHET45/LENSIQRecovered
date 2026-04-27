package p000;

/* JADX INFO: loaded from: classes6.dex */
public class f40<T> {

    /* JADX INFO: renamed from: a */
    public final int f35010a;

    /* JADX INFO: renamed from: b */
    public final Object[] f35011b;

    /* JADX INFO: renamed from: c */
    public Object[] f35012c;

    /* JADX INFO: renamed from: d */
    public int f35013d;

    /* JADX INFO: renamed from: f40$a */
    public interface InterfaceC5587a<T> extends n8d<T> {
        @Override // p000.n8d
        boolean test(T t);
    }

    public f40(int i) {
        this.f35010a = i;
        Object[] objArr = new Object[i + 1];
        this.f35011b = objArr;
        this.f35012c = objArr;
    }

    /* JADX INFO: renamed from: a */
    public void m10502a(xxd<? super T> xxdVar) {
        int i = this.f35010a;
        for (Object[] objArr = this.f35011b; objArr != null; objArr = (Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                }
                xxdVar.accept(obj);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10503b(T t) {
        int i = this.f35010a;
        int i2 = this.f35013d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f35012c[i] = objArr;
            this.f35012c = objArr;
            i2 = 0;
        }
        this.f35012c[i2] = t;
        this.f35013d = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public void m10504c(InterfaceC5587a<? super T> interfaceC5587a) {
        int i;
        int i2 = this.f35010a;
        for (Object[] objArr = this.f35011b; objArr != null; objArr = (Object[]) objArr[i2]) {
            while (i < i2) {
                Object obj = objArr[i];
                i = (obj == null || interfaceC5587a.test(obj)) ? 0 : i + 1;
            }
        }
    }
}
