package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class gjf<Z> extends gu0<Z> {
    private final int height;
    private final int width;

    public gjf() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.jmg
    public final void getSize(@efb gqf gqfVar) {
        if (v0i.isValidDimensions(this.width, this.height)) {
            gqfVar.onSizeReady(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    @Override // p000.jmg
    public void removeCallback(@efb gqf gqfVar) {
    }

    public gjf(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
