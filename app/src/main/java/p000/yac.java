package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class yac implements vli {

    /* JADX INFO: renamed from: b */
    @yfb
    public final vac f100999b;

    public yac(@yfb vac vacVar) {
        this.f100999b = vacVar;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yac) {
            return md8.areEqual(((yac) obj).f100999b, this.f100999b);
        }
        return false;
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return c64Var.mo27167roundToPx0680j_4(this.f100999b.mo32749calculateBottomPaddingD9Ej5fM());
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return c64Var.mo27167roundToPx0680j_4(this.f100999b.mo32750calculateLeftPaddingu2uoSUM(ov8Var));
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return c64Var.mo27167roundToPx0680j_4(this.f100999b.mo32751calculateRightPaddingu2uoSUM(ov8Var));
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return c64Var.mo27167roundToPx0680j_4(this.f100999b.mo32752calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.f100999b.hashCode();
    }

    @yfb
    public String toString() {
        ov8 ov8Var = ov8.Ltr;
        return "PaddingValues(" + ((Object) kn4.m30716toStringimpl(this.f100999b.mo32750calculateLeftPaddingu2uoSUM(ov8Var))) + ", " + ((Object) kn4.m30716toStringimpl(this.f100999b.mo32752calculateTopPaddingD9Ej5fM())) + ", " + ((Object) kn4.m30716toStringimpl(this.f100999b.mo32751calculateRightPaddingu2uoSUM(ov8Var))) + ", " + ((Object) kn4.m30716toStringimpl(this.f100999b.mo32749calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
