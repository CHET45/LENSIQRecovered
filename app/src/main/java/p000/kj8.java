package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class kj8 extends CancellationException implements h03<kj8> {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final transient jj8 f54265a;

    public kj8(@yfb String str, @gib Throwable th, @yfb jj8 jj8Var) {
        super(str);
        this.f54265a = jj8Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(@gib Object obj) {
        if (obj != this) {
            if (obj instanceof kj8) {
                kj8 kj8Var = (kj8) obj;
                if (!md8.areEqual(kj8Var.getMessage(), getMessage()) || !md8.areEqual(kj8Var.f54265a, this.f54265a) || !md8.areEqual(kj8Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        md8.checkNotNull(message);
        int iHashCode = ((message.hashCode() * 31) + this.f54265a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @yfb
    public String toString() {
        return super.toString() + "; job=" + this.f54265a;
    }

    @Override // p000.h03
    @gib
    public kj8 createCopy() {
        return null;
    }
}
