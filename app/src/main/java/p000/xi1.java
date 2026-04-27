package p000;

import android.util.Log;
import com.bumptech.glide.Priority;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.bg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class xi1 implements vwa<File, ByteBuffer> {

    /* JADX INFO: renamed from: a */
    public static final String f98057a = "ByteBufferFileLoader";

    /* JADX INFO: renamed from: xi1$a */
    public static final class C15138a implements bg3<ByteBuffer> {

        /* JADX INFO: renamed from: a */
        public final File f98058a;

        public C15138a(File file) {
            this.f98058a = file;
        }

        @Override // p000.bg3
        public void cancel() {
        }

        @Override // p000.bg3
        public void cleanup() {
        }

        @Override // p000.bg3
        @efb
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // p000.bg3
        @efb
        public hh3 getDataSource() {
            return hh3.LOCAL;
        }

        @Override // p000.bg3
        public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super ByteBuffer> interfaceC1883a) {
            try {
                interfaceC1883a.onDataReady(ej1.fromFile(this.f98058a));
            } catch (IOException e) {
                Log.isLoggable(xi1.f98057a, 3);
                interfaceC1883a.onLoadFailed(e);
            }
        }
    }

    /* JADX INFO: renamed from: xi1$b */
    public static class C15139b implements wwa<File, ByteBuffer> {
        @Override // p000.wwa
        @efb
        public vwa<File, ByteBuffer> build(@efb t2b t2bVar) {
            return new xi1();
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    @Override // p000.vwa
    public vwa.C14279a<ByteBuffer> buildLoadData(@efb File file, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(file), new C15138a(file));
    }

    @Override // p000.vwa
    public boolean handles(@efb File file) {
        return true;
    }
}
