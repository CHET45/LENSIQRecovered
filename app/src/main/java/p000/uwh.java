package p000;

import p000.e13;

/* JADX INFO: loaded from: classes3.dex */
public final class uwh implements e13.InterfaceC5040b {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C13751a f89296c = new C13751a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f89297d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a */
    @gib
    public final uwh f89298a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fi3<?> f89299b;

    /* JADX INFO: renamed from: uwh$a */
    public static final class C13751a {

        /* JADX INFO: renamed from: uwh$a$a */
        public static final class a implements e13.InterfaceC5041c<uwh> {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final a f89300a = new a();

            private a() {
            }
        }

        public /* synthetic */ C13751a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return uwh.f89297d;
        }

        private C13751a() {
        }
    }

    public uwh(@gib uwh uwhVar, @yfb fi3<?> fi3Var) {
        md8.checkNotNullParameter(fi3Var, "instance");
        this.f89298a = uwhVar;
        this.f89299b = fi3Var;
    }

    public final void checkNotUpdating(@yfb ai3<?> ai3Var) {
        md8.checkNotNullParameter(ai3Var, "candidate");
        if (this.f89299b == ai3Var) {
            throw new IllegalStateException(f89297d.toString());
        }
        uwh uwhVar = this.f89298a;
        if (uwhVar != null) {
            uwhVar.checkNotUpdating(ai3Var);
        }
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) e13.InterfaceC5040b.a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) e13.InterfaceC5040b.a.get(this, interfaceC5041c);
    }

    @Override // p000.e13.InterfaceC5040b
    @yfb
    public e13.InterfaceC5041c<?> getKey() {
        return C13751a.a.f89300a;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return e13.InterfaceC5040b.a.minusKey(this, interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return e13.InterfaceC5040b.a.plus(this, e13Var);
    }
}
