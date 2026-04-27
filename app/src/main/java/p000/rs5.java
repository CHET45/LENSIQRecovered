package p000;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class rs5 extends wq0 {

    /* JADX INFO: renamed from: m */
    public static final Set<FileDescriptor> f79184m = t6f.newConcurrentHashSet();

    /* JADX INFO: renamed from: f */
    public final FileDescriptor f79185f;

    /* JADX INFO: renamed from: g */
    public final long f79186g;

    /* JADX INFO: renamed from: h */
    public final long f79187h;

    /* JADX INFO: renamed from: i */
    @hib
    public Uri f79188i;

    /* JADX INFO: renamed from: j */
    @hib
    public FileInputStream f79189j;

    /* JADX INFO: renamed from: k */
    public long f79190k;

    /* JADX INFO: renamed from: l */
    public boolean f79191l;

    public rs5(FileDescriptor fileDescriptor, long j, long j2) {
        super(false);
        this.f79185f = (FileDescriptor) v80.checkNotNull(fileDescriptor);
        this.f79186g = j;
        this.f79187h = j2;
    }

    private static void seekFileDescriptor(FileDescriptor fileDescriptor, long j) throws sh3 {
        try {
            Os.lseek(fileDescriptor, j, OsConstants.SEEK_SET);
        } catch (ErrnoException e) {
            throw new sh3(e, 2000);
        }
    }

    @Override // p000.gh3
    public void close() throws sh3 {
        this.f79188i = null;
        f79184m.remove(this.f79185f);
        try {
            try {
                FileInputStream fileInputStream = this.f79189j;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new sh3(e, 2000);
            }
        } finally {
            this.f79189j = null;
            if (this.f79191l) {
                this.f79191l = false;
                m24715c();
            }
        }
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f79188i;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws sh3 {
        try {
            this.f79188i = xh3Var.f97800a;
            m24716d(xh3Var);
            if (!f79184m.add(this.f79185f)) {
                throw new sh3(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j = this.f79187h;
            if (j != -1 && xh3Var.f97806g > j) {
                throw new sh3(2008);
            }
            seekFileDescriptor(this.f79185f, this.f79186g + xh3Var.f97806g);
            FileInputStream fileInputStream = new FileInputStream(this.f79185f);
            this.f79189j = fileInputStream;
            long j2 = this.f79187h;
            if (j2 == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f79190k = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f79190k = jPosition;
                    if (jPosition < 0) {
                        throw new sh3(2008);
                    }
                }
            } else {
                long j3 = j2 - xh3Var.f97806g;
                this.f79190k = j3;
                if (j3 < 0) {
                    throw new sh3(2008);
                }
            }
            long jMin = xh3Var.f97807h;
            if (jMin != -1) {
                long j4 = this.f79190k;
                if (j4 != -1) {
                    jMin = Math.min(j4, jMin);
                }
                this.f79190k = jMin;
            }
            this.f79191l = true;
            m24717e(xh3Var);
            long j5 = xh3Var.f97807h;
            return j5 != -1 ? j5 : this.f79190k;
        } catch (sh3 e) {
            throw e;
        } catch (IOException e2) {
            throw new sh3(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws sh3 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f79190k;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int i3 = ((FileInputStream) t0i.castNonNull(this.f79189j)).read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            long j2 = this.f79190k;
            if (j2 != -1) {
                this.f79190k = j2 - ((long) i3);
            }
            m24714b(i3);
            return i3;
        } catch (IOException e) {
            throw new sh3(e, 2000);
        }
    }
}
