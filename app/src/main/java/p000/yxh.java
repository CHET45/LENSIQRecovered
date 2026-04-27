package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class yxh<Data> implements vwa<Uri, Data> {

    /* JADX INFO: renamed from: b */
    public static final Set<String> f103290b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: a */
    public final InterfaceC15877c<Data> f103291a;

    /* JADX INFO: renamed from: yxh$a */
    public static final class C15875a implements wwa<Uri, AssetFileDescriptor>, InterfaceC15877c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f103292a;

        public C15875a(ContentResolver contentResolver) {
            this.f103292a = contentResolver;
        }

        @Override // p000.wwa
        public vwa<Uri, AssetFileDescriptor> build(t2b t2bVar) {
            return new yxh(this);
        }

        @Override // p000.wwa
        public void teardown() {
        }

        @Override // p000.yxh.InterfaceC15877c
        public bg3<AssetFileDescriptor> build(Uri uri) {
            return new y80(this.f103292a, uri);
        }
    }

    /* JADX INFO: renamed from: yxh$b */
    public static class C15876b implements wwa<Uri, ParcelFileDescriptor>, InterfaceC15877c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f103293a;

        public C15876b(ContentResolver contentResolver) {
            this.f103293a = contentResolver;
        }

        @Override // p000.yxh.InterfaceC15877c
        public bg3<ParcelFileDescriptor> build(Uri uri) {
            return new ss5(this.f103293a, uri);
        }

        @Override // p000.wwa
        public void teardown() {
        }

        @Override // p000.wwa
        @efb
        public vwa<Uri, ParcelFileDescriptor> build(t2b t2bVar) {
            return new yxh(this);
        }
    }

    /* JADX INFO: renamed from: yxh$c */
    public interface InterfaceC15877c<Data> {
        bg3<Data> build(Uri uri);
    }

    /* JADX INFO: renamed from: yxh$d */
    public static class C15878d implements wwa<Uri, InputStream>, InterfaceC15877c<InputStream> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f103294a;

        public C15878d(ContentResolver contentResolver) {
            this.f103294a = contentResolver;
        }

        @Override // p000.yxh.InterfaceC15877c
        public bg3<InputStream> build(Uri uri) {
            return new z5g(this.f103294a, uri);
        }

        @Override // p000.wwa
        public void teardown() {
        }

        @Override // p000.wwa
        @efb
        public vwa<Uri, InputStream> build(t2b t2bVar) {
            return new yxh(this);
        }
    }

    public yxh(InterfaceC15877c<Data> interfaceC15877c) {
        this.f103291a = interfaceC15877c;
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(uri), this.f103291a.build(uri));
    }

    @Override // p000.vwa
    public boolean handles(@efb Uri uri) {
        return f103290b.contains(uri.getScheme());
    }
}
