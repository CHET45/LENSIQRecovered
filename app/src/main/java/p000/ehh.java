package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ehh implements dhh {

    /* JADX INFO: renamed from: a */
    public final Set<q15> f33056a;

    /* JADX INFO: renamed from: b */
    public final chh f33057b;

    /* JADX INFO: renamed from: c */
    public final ihh f33058c;

    public ehh(Set<q15> set, chh chhVar, ihh ihhVar) {
        this.f33056a = set;
        this.f33057b = chhVar;
        this.f33058c = ihhVar;
    }

    @Override // p000.dhh
    public <T> zgh<T> getTransport(String str, Class<T> cls, leh<T, byte[]> lehVar) {
        return getTransport(str, cls, q15.m19986of("proto"), lehVar);
    }

    @Override // p000.dhh
    public <T> zgh<T> getTransport(String str, Class<T> cls, q15 q15Var, leh<T, byte[]> lehVar) {
        if (this.f33056a.contains(q15Var)) {
            return new hhh(this.f33057b, str, q15Var, lehVar, this.f33058c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", q15Var, this.f33056a));
    }
}
