package p000;

/* JADX INFO: loaded from: classes8.dex */
public class ef8<T> extends wr0<T> {

    /* JADX INFO: renamed from: a */
    public final String f32806a;

    public ef8() {
        this("ANYTHING");
    }

    @io5
    public static yv9<Object> anything() {
        return new ef8();
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText(this.f32806a);
    }

    @Override // p000.yv9
    public boolean matches(Object obj) {
        return true;
    }

    public ef8(String str) {
        this.f32806a = str;
    }

    @io5
    public static yv9<Object> anything(String str) {
        return new ef8(str);
    }
}
