package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mv2 extends vq0 {

    /* JADX INFO: renamed from: f */
    public final ContentResolver f62358f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f62359g;

    /* JADX INFO: renamed from: h */
    @hib
    public AssetFileDescriptor f62360h;

    /* JADX INFO: renamed from: i */
    @hib
    public FileInputStream f62361i;

    /* JADX INFO: renamed from: j */
    public long f62362j;

    /* JADX INFO: renamed from: k */
    public boolean f62363k;

    /* JADX INFO: renamed from: mv2$a */
    public static class C9546a extends rh3 {
        @Deprecated
        public C9546a(IOException iOException) {
            this(iOException, 2000);
        }

        public C9546a(@hib IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public mv2(Context context) {
        super(false);
        this.f62358f = context.getContentResolver();
    }

    @Override // p000.ih3, p000.en7
    public void close() throws C9546a {
        this.f62359g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f62361i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f62361i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f62360h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C9546a(e, 2000);
                    }
                } finally {
                    this.f62360h = null;
                    if (this.f62363k) {
                        this.f62363k = false;
                        m24113c();
                    }
                }
            } catch (Throwable th) {
                this.f62361i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f62360h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f62360h = null;
                        if (this.f62363k) {
                            this.f62363k = false;
                            m24113c();
                        }
                        throw th;
                    } finally {
                        this.f62360h = null;
                        if (this.f62363k) {
                            this.f62363k = false;
                            m24113c();
                        }
                    }
                } catch (IOException e2) {
                    throw new C9546a(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C9546a(e3, 2000);
        }
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f62359g;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws C9546a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = yh3Var.f101485a.normalizeScheme();
            this.f62359g = uriNormalizeScheme;
            m24114d(yh3Var);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f62358f.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f62358f.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f62360h = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C9546a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f62361i = fileInputStream;
            if (length != -1 && yh3Var.f101491g > length) {
                throw new C9546a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(yh3Var.f101491g + startOffset) - startOffset;
            if (jSkip != yh3Var.f101491g) {
                throw new C9546a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f62362j = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f62362j = jPosition;
                    if (jPosition < 0) {
                        throw new C9546a(null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f62362j = j;
                if (j < 0) {
                    throw new C9546a(null, 2008);
                }
            }
            long jMin = yh3Var.f101492h;
            if (jMin != -1) {
                long j2 = this.f62362j;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f62362j = jMin;
            }
            this.f62363k = true;
            m24115e(yh3Var);
            long j3 = yh3Var.f101492h;
            return j3 != -1 ? j3 : this.f62362j;
        } catch (C9546a e) {
            throw e;
        } catch (IOException e2) {
            throw new C9546a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws C9546a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f62362j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C9546a(e, 2000);
            }
        }
        int i3 = ((FileInputStream) x0i.castNonNull(this.f62361i)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f62362j;
        if (j2 != -1) {
            this.f62362j = j2 - ((long) i3);
        }
        m24112b(i3);
        return i3;
    }
}
