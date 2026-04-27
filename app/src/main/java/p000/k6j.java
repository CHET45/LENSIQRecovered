package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class k6j extends s8j {

    /* JADX INFO: renamed from: a */
    public Integer f52697a;

    /* JADX INFO: renamed from: b */
    public Integer f52698b;

    @Override // p000.s8j
    /* JADX INFO: renamed from: a */
    public final s8j mo14559a(int i) {
        this.f52697a = Integer.valueOf(i);
        return this;
    }

    @Override // p000.s8j
    /* JADX INFO: renamed from: b */
    public final s8j mo14560b(int i) {
        this.f52698b = Integer.valueOf(i);
        return this;
    }

    @Override // p000.s8j
    /* JADX INFO: renamed from: c */
    public final qv7 mo14561c() {
        Integer num = this.f52697a;
        if (num != null && this.f52698b != null) {
            return new o7j(num.intValue(), this.f52698b.intValue(), null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f52697a == null) {
            sb.append(" imageFormat");
        }
        if (this.f52698b == null) {
            sb.append(" storageType");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }
}
