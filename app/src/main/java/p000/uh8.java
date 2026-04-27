package p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class uh8 implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public i1f f88013a;

    /* JADX INFO: renamed from: b */
    public ph8 f88014b;

    /* JADX INFO: renamed from: c */
    public rh8 f88015c;

    public uh8(Writer writer) {
        i1f i1fVar = new i1f(writer);
        this.f88013a = i1fVar;
        this.f88014b = new ph8(i1fVar);
    }

    private void afterWriter() {
        int i;
        rh8 rh8Var = this.f88015c;
        if (rh8Var == null) {
            return;
        }
        switch (rh8Var.f78317b) {
            case 1001:
            case 1003:
                i = 1002;
                break;
            case 1002:
                i = 1003;
                break;
            case 1004:
                i = 1005;
                break;
            default:
                i = -1;
                break;
        }
        if (i != -1) {
            rh8Var.f78317b = i;
        }
    }

    private void beforeWrite() {
        rh8 rh8Var = this.f88015c;
        if (rh8Var == null) {
            return;
        }
        int i = rh8Var.f78317b;
        if (i == 1002) {
            this.f88013a.write(58);
        } else if (i == 1003) {
            this.f88013a.write(44);
        } else {
            if (i != 1005) {
                return;
            }
            this.f88013a.write(44);
        }
    }

    private void beginStructure() {
        int i = this.f88015c.f78317b;
        switch (i) {
            case 1001:
            case 1004:
                return;
            case 1002:
                this.f88013a.write(58);
                return;
            case 1003:
            default:
                throw new jh8("illegal state : " + i);
            case 1005:
                this.f88013a.write(44);
                return;
        }
    }

    private void endStructure() {
        rh8 rh8Var = this.f88015c.f78316a;
        this.f88015c = rh8Var;
        if (rh8Var == null) {
            return;
        }
        int i = rh8Var.f78317b;
        int i2 = i != 1001 ? i != 1002 ? i != 1004 ? -1 : 1005 : 1003 : 1002;
        if (i2 != -1) {
            rh8Var.f78317b = i2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f88013a.close();
    }

    public void config(a2f a2fVar, boolean z) {
        this.f88013a.config(a2fVar, z);
    }

    public void endArray() {
        this.f88013a.write(93);
        endStructure();
    }

    public void endObject() {
        this.f88013a.write(125);
        endStructure();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f88013a.flush();
    }

    public void startArray() {
        if (this.f88015c != null) {
            beginStructure();
        }
        this.f88015c = new rh8(this.f88015c, 1004);
        this.f88013a.write(91);
    }

    public void startObject() {
        if (this.f88015c != null) {
            beginStructure();
        }
        this.f88015c = new rh8(this.f88015c, 1001);
        this.f88013a.write(123);
    }

    public void writeKey(String str) {
        writeObject(str);
    }

    public void writeObject(String str) {
        beforeWrite();
        this.f88014b.write(str);
        afterWriter();
    }

    public void writeValue(Object obj) {
        writeObject(obj);
    }

    public void writeObject(Object obj) {
        beforeWrite();
        this.f88014b.write(obj);
        afterWriter();
    }
}
