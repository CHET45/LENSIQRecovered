package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h48 implements g48 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<CharSequence, CharSequence, CharSequence> f42317b;

    /* JADX WARN: Multi-variable type inference failed */
    public h48(@yfb gz6<? super CharSequence, ? super CharSequence, ? extends CharSequence> gz6Var) {
        this.f42317b = gz6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h48 copy$default(h48 h48Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            gz6Var = h48Var.f42317b;
        }
        return h48Var.copy(gz6Var);
    }

    @yfb
    public final gz6<CharSequence, CharSequence, CharSequence> component1() {
        return this.f42317b;
    }

    @yfb
    public final h48 copy(@yfb gz6<? super CharSequence, ? super CharSequence, ? extends CharSequence> gz6Var) {
        return new h48(gz6Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h48) && md8.areEqual(this.f42317b, ((h48) obj).f42317b);
    }

    @yfb
    public final gz6<CharSequence, CharSequence, CharSequence> getTransformation() {
        return this.f42317b;
    }

    public int hashCode() {
        return this.f42317b.hashCode();
    }

    @yfb
    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.f42317b + ')';
    }

    @Override // p000.g48
    public void transformInput(@yfb hrg hrgVar) {
        jrg jrgVarM30102toTextFieldCharSequenceudt6zUU$foundation_release$default = hrg.m30102toTextFieldCharSequenceudt6zUU$foundation_release$default(hrgVar, 0L, null, 3, null);
        CharSequence charSequenceInvoke = this.f42317b.invoke(hrgVar.getOriginalValue$foundation_release(), jrgVarM30102toTextFieldCharSequenceudt6zUU$foundation_release$default);
        if (charSequenceInvoke == jrgVarM30102toTextFieldCharSequenceudt6zUU$foundation_release$default) {
            return;
        }
        if (charSequenceInvoke == hrgVar.getOriginalValue$foundation_release()) {
            hrgVar.revertAllChanges();
        } else {
            hrgVar.setTextIfChanged$foundation_release(charSequenceInvoke);
        }
    }
}
