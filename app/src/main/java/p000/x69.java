package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
public final class x69 implements Iterator<String>, uo8 {

    /* JADX INFO: renamed from: C */
    @Deprecated
    public static final int f96883C = 1;

    /* JADX INFO: renamed from: F */
    @Deprecated
    public static final int f96884F = 2;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C14940a f96885f = new C14940a(null);

    /* JADX INFO: renamed from: m */
    @Deprecated
    public static final int f96886m = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f96887a;

    /* JADX INFO: renamed from: b */
    public int f96888b;

    /* JADX INFO: renamed from: c */
    public int f96889c;

    /* JADX INFO: renamed from: d */
    public int f96890d;

    /* JADX INFO: renamed from: e */
    public int f96891e;

    /* JADX INFO: renamed from: x69$a */
    public static final class C14940a {
        public /* synthetic */ C14940a(jt3 jt3Var) {
            this();
        }

        private C14940a() {
        }
    }

    public x69(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, ymh.InterfaceC15723b.f102127e);
        this.f96887a = charSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f96888b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f96891e < 0) {
            this.f96888b = 2;
            return false;
        }
        int length = this.f96887a.length();
        int length2 = this.f96887a.length();
        for (int i4 = this.f96889c; i4 < length2; i4++) {
            char cCharAt = this.f96887a.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < this.f96887a.length() && this.f96887a.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f96888b = 1;
                this.f96891e = i;
                this.f96890d = length;
                return true;
            }
        }
        i = -1;
        this.f96888b = 1;
        this.f96891e = i;
        this.f96890d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @yfb
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f96888b = 0;
        int i = this.f96890d;
        int i2 = this.f96889c;
        this.f96889c = this.f96891e + i;
        return this.f96887a.subSequence(i2, i).toString();
    }
}
