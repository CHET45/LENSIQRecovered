package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class cth implements b6e<Bitmap, Bitmap> {

    /* JADX INFO: renamed from: cth$a */
    public static final class C4500a implements t5e<Bitmap> {

        /* JADX INFO: renamed from: a */
        public final Bitmap f27542a;

        public C4500a(@efb Bitmap bitmap) {
            this.f27542a = bitmap;
        }

        @Override // p000.t5e
        @efb
        public Class<Bitmap> getResourceClass() {
            return Bitmap.class;
        }

        @Override // p000.t5e
        public int getSize() {
            return v0i.getBitmapByteSize(this.f27542a);
        }

        @Override // p000.t5e
        public void recycle() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.t5e
        @efb
        public Bitmap get() {
            return this.f27542a;
        }
    }

    @Override // p000.b6e
    public t5e<Bitmap> decode(@efb Bitmap bitmap, int i, int i2, @efb i7c i7cVar) {
        return new C4500a(bitmap);
    }

    @Override // p000.b6e
    public boolean handles(@efb Bitmap bitmap, @efb i7c i7cVar) {
        return true;
    }
}
