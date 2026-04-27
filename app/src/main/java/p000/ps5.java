package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class ps5 implements b6e<File, File> {
    @Override // p000.b6e
    public t5e<File> decode(@efb File file, int i, int i2, @efb i7c i7cVar) {
        return new et5(file);
    }

    @Override // p000.b6e
    public boolean handles(@efb File file, @efb i7c i7cVar) {
        return true;
    }
}
