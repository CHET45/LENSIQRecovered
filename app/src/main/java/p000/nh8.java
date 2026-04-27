package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class nh8 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final hw3 f64519a;

    /* JADX INFO: renamed from: b */
    public rh8 f64520b;

    /* JADX INFO: renamed from: c */
    public Reader f64521c;

    public nh8(Reader reader) {
        this(new lh8(m17957a(reader)));
        this.f64521c = reader;
    }

    /* JADX INFO: renamed from: a */
    public static String m17957a(Reader reader) {
        StringBuilder sb = new StringBuilder();
        try {
            char[] cArr = new char[2048];
            while (true) {
                int i = reader.read(cArr, 0, 2048);
                if (i < 0) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i);
            }
        } catch (Exception e) {
            throw new jh8("read string from reader error", e);
        }
    }

    private void endStructure() {
        int i;
        rh8 rh8Var = this.f64520b.f78316a;
        this.f64520b = rh8Var;
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

    private void readAfter() {
        rh8 rh8Var = this.f64520b;
        int i = rh8Var.f78317b;
        int i2 = 1002;
        switch (i) {
            case 1001:
            case 1003:
                break;
            case 1002:
                i2 = 1003;
                break;
            case 1004:
                i2 = 1005;
                break;
            case 1005:
                i2 = -1;
                break;
            default:
                throw new jh8("illegal state : " + i);
        }
        if (i2 != -1) {
            rh8Var.f78317b = i2;
        }
    }

    private void readBefore() {
        int i = this.f64520b.f78317b;
        switch (i) {
            case 1001:
            case 1004:
                return;
            case 1002:
                this.f64519a.accept(17);
                return;
            case 1003:
            case 1005:
                this.f64519a.accept(16);
                return;
            default:
                throw new jh8("illegal state : " + i);
        }
    }

    private void startStructure() {
        switch (this.f64520b.f78317b) {
            case 1001:
            case 1004:
                return;
            case 1002:
                this.f64519a.accept(17);
                return;
            case 1003:
            case 1005:
                this.f64519a.accept(16);
                return;
            default:
                throw new jh8("illegal state : " + this.f64520b.f78317b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f64519a.f45134e.close();
        Reader reader = this.f64521c;
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                throw new jh8("closed reader error", e);
            }
        }
    }

    public void config(rp5 rp5Var, boolean z) {
        this.f64519a.config(rp5Var, z);
    }

    public void endArray() {
        this.f64519a.accept(15);
        endStructure();
    }

    public void endObject() {
        this.f64519a.accept(13);
        endStructure();
    }

    public boolean hasNext() {
        if (this.f64520b == null) {
            throw new jh8("context is null");
        }
        int i = this.f64519a.f45134e.token();
        int i2 = this.f64520b.f78317b;
        switch (i2) {
            case 1001:
            case 1003:
                return i != 13;
            case 1002:
            default:
                throw new jh8("illegal state : " + i2);
            case 1004:
            case 1005:
                return i != 15;
        }
    }

    public int peek() {
        return this.f64519a.f45134e.token();
    }

    public Integer readInteger() {
        Object obj;
        if (this.f64520b == null) {
            obj = this.f64519a.parse();
        } else {
            readBefore();
            obj = this.f64519a.parse();
            readAfter();
        }
        return qmh.castToInt(obj);
    }

    public Long readLong() {
        Object obj;
        if (this.f64520b == null) {
            obj = this.f64519a.parse();
        } else {
            readBefore();
            obj = this.f64519a.parse();
            readAfter();
        }
        return qmh.castToLong(obj);
    }

    public <T> T readObject(hmh<T> hmhVar) {
        return (T) readObject(hmhVar.f44148a);
    }

    public String readString() {
        Object obj;
        if (this.f64520b == null) {
            obj = this.f64519a.parse();
        } else {
            readBefore();
            obj = this.f64519a.parse();
            readAfter();
        }
        return qmh.castToString(obj);
    }

    public void startArray() {
        if (this.f64520b == null) {
            this.f64520b = new rh8(null, 1004);
        } else {
            startStructure();
            this.f64520b = new rh8(this.f64520b, 1004);
        }
        this.f64519a.accept(14);
    }

    public void startObject() {
        if (this.f64520b == null) {
            this.f64520b = new rh8(null, 1001);
        } else {
            startStructure();
            this.f64520b = new rh8(this.f64520b, 1001);
        }
        this.f64519a.accept(12);
    }

    public <T> T readObject(Type type) {
        if (this.f64520b == null) {
            return (T) this.f64519a.parseObject(type);
        }
        readBefore();
        T t = (T) this.f64519a.parseObject(type);
        readAfter();
        return t;
    }

    public nh8(lh8 lh8Var) {
        this(new hw3(lh8Var));
    }

    public nh8(hw3 hw3Var) {
        this.f64519a = hw3Var;
    }

    public <T> T readObject(Class<T> cls) {
        if (this.f64520b == null) {
            return (T) this.f64519a.parseObject((Class) cls);
        }
        readBefore();
        T t = (T) this.f64519a.parseObject((Class) cls);
        readAfter();
        return t;
    }

    public void readObject(Object obj) {
        if (this.f64520b == null) {
            this.f64519a.parseObject(obj);
            return;
        }
        readBefore();
        this.f64519a.parseObject(obj);
        readAfter();
    }

    public Object readObject() {
        if (this.f64520b == null) {
            return this.f64519a.parse();
        }
        readBefore();
        Object obj = this.f64519a.parse();
        readAfter();
        return obj;
    }

    public Object readObject(Map map) {
        if (this.f64520b == null) {
            return this.f64519a.parseObject(map);
        }
        readBefore();
        Object object = this.f64519a.parseObject(map);
        readAfter();
        return object;
    }
}
