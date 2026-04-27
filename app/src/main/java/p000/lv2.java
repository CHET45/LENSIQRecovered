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
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class lv2 extends wq0 {

    /* JADX INFO: renamed from: f */
    public final ContentResolver f58865f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f58866g;

    /* JADX INFO: renamed from: h */
    @hib
    public AssetFileDescriptor f58867h;

    /* JADX INFO: renamed from: i */
    @hib
    public FileInputStream f58868i;

    /* JADX INFO: renamed from: j */
    public long f58869j;

    /* JADX INFO: renamed from: k */
    public boolean f58870k;

    /* JADX INFO: renamed from: lv2$a */
    public static class C8977a extends sh3 {
        @Deprecated
        public C8977a(IOException iOException) {
            this(iOException, 2000);
        }

        public C8977a(@hib IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public lv2(Context context) {
        super(false);
        this.f58865f = context.getContentResolver();
    }

    @Override // p000.gh3
    public void close() throws C8977a {
        this.f58866g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f58868i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f58868i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f58867h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C8977a(e, 2000);
                    }
                } finally {
                    this.f58867h = null;
                    if (this.f58870k) {
                        this.f58870k = false;
                        m24715c();
                    }
                }
            } catch (Throwable th) {
                this.f58868i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f58867h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f58867h = null;
                        if (this.f58870k) {
                            this.f58870k = false;
                            m24715c();
                        }
                        throw th;
                    } finally {
                        this.f58867h = null;
                        if (this.f58870k) {
                            this.f58870k = false;
                            m24715c();
                        }
                    }
                } catch (IOException e2) {
                    throw new C8977a(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C8977a(e3, 2000);
        }
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f58866g;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws C8977a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = xh3Var.f97800a.normalizeScheme();
            this.f58866g = uriNormalizeScheme;
            m24716d(xh3Var);
            if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f58865f.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f58865f.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f58867h = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C8977a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f58868i = fileInputStream;
            if (length != -1 && xh3Var.f97806g > length) {
                throw new C8977a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(xh3Var.f97806g + startOffset) - startOffset;
            if (jSkip != xh3Var.f97806g) {
                throw new C8977a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f58869j = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f58869j = jPosition;
                    if (jPosition < 0) {
                        throw new C8977a(null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f58869j = j;
                if (j < 0) {
                    throw new C8977a(null, 2008);
                }
            }
            long jMin = xh3Var.f97807h;
            if (jMin != -1) {
                long j2 = this.f58869j;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f58869j = jMin;
            }
            this.f58870k = true;
            m24717e(xh3Var);
            long j3 = xh3Var.f97807h;
            return j3 != -1 ? j3 : this.f58869j;
        } catch (C8977a e) {
            throw e;
        } catch (IOException e2) {
            throw new C8977a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws C8977a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f58869j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C8977a(e, 2000);
            }
        }
        int i3 = ((FileInputStream) t0i.castNonNull(this.f58868i)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f58869j;
        if (j2 != -1) {
            this.f58869j = j2 - ((long) i3);
        }
        m24714b(i3);
        return i3;
    }
}
