package p000;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class dd1 {

    /* JADX INFO: renamed from: a */
    public boolean f29368a;

    /* JADX INFO: renamed from: b */
    public boolean f29369b;

    /* JADX INFO: renamed from: c */
    public boolean f29370c;

    /* JADX INFO: renamed from: d */
    public boolean f29371d;

    /* JADX INFO: renamed from: e */
    public final cn4 f29372e;

    /* JADX INFO: renamed from: f */
    public final bd1 f29373f;

    /* JADX INFO: renamed from: g */
    public final long f29374g;

    public dd1(@efb cn4 cn4Var, @efb bd1 bd1Var, long j) {
        this.f29372e = cn4Var;
        this.f29373f = bd1Var;
        this.f29374g = j;
    }

    public void check() {
        this.f29369b = isFileExistToResume();
        this.f29370c = isInfoRightToResume();
        boolean zIsOutputStreamSupportResume = isOutputStreamSupportResume();
        this.f29371d = zIsOutputStreamSupportResume;
        this.f29368a = (this.f29370c && this.f29369b && zIsOutputStreamSupportResume) ? false : true;
    }

    @efb
    public c8e getCauseOrThrow() {
        if (!this.f29370c) {
            return c8e.INFO_DIRTY;
        }
        if (!this.f29369b) {
            return c8e.FILE_NOT_EXIST;
        }
        if (!this.f29371d) {
            return c8e.OUTPUT_STREAM_NOT_SUPPORT;
        }
        throw new IllegalStateException("No cause find with dirty: " + this.f29368a);
    }

    public boolean isDirty() {
        return this.f29368a;
    }

    public boolean isFileExistToResume() {
        Uri uri = this.f29372e.getUri();
        if (q0i.isUriContentScheme(uri)) {
            return q0i.getSizeFromContentUri(uri) > 0;
        }
        File file = this.f29372e.getFile();
        return file != null && file.exists();
    }

    public boolean isInfoRightToResume() {
        int blockCount = this.f29373f.getBlockCount();
        if (blockCount <= 0 || this.f29373f.isChunked() || this.f29373f.getFile() == null) {
            return false;
        }
        if (!this.f29373f.getFile().equals(this.f29372e.getFile()) || this.f29373f.getFile().length() > this.f29373f.getTotalLength()) {
            return false;
        }
        if (this.f29374g > 0 && this.f29373f.getTotalLength() != this.f29374g) {
            return false;
        }
        for (int i = 0; i < blockCount; i++) {
            if (this.f29373f.getBlock(i).getContentLength() <= 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isOutputStreamSupportResume() {
        if (e0c.with().outputStreamFactory().supportSeek()) {
            return true;
        }
        return this.f29373f.getBlockCount() == 1 && !e0c.with().processFileStrategy().isPreAllocateLength(this.f29372e);
    }

    public String toString() {
        return "fileExist[" + this.f29369b + "] infoRight[" + this.f29370c + "] outputStreamSupport[" + this.f29371d + "] " + super.toString();
    }
}
