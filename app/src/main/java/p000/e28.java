package p000;

import p000.w27;

/* JADX INFO: loaded from: classes7.dex */
public final class e28 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: e28$a */
    public static final class C5058a<T> implements w27<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lp8<T> f31597a;

        public C5058a(lp8<T> lp8Var) {
            this.f31597a = lp8Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.w27
        public lp8<?>[] childSerializers() {
            return new lp8[]{this.f31597a};
        }

        @Override // p000.t74
        public T deserialize(jl3 jl3Var) {
            md8.checkNotNullParameter(jl3Var, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // p000.lp8, p000.e1f, p000.t74
        public f0f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // p000.e1f
        public void serialize(m15 m15Var, T t) {
            md8.checkNotNullParameter(m15Var, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // p000.w27
        public lp8<?>[] typeParametersSerializers() {
            return w27.C14367a.typeParametersSerializers(this);
        }
    }

    @nb8
    @yfb
    public static final <T> f0f InlinePrimitiveDescriptor(@yfb String str, @yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(lp8Var, "primitiveSerializer");
        return new d28(str, new C5058a(lp8Var));
    }
}
