package p000;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class hr0<T> {

    /* JADX INFO: renamed from: a */
    @SerializedName(g55.f38796e)
    public int f44617a;

    /* JADX INFO: renamed from: b */
    @SerializedName(g55.f38799h)
    public String f44618b;

    /* JADX INFO: renamed from: c */
    @SerializedName("data")
    public T f44619c;

    public int getCode() {
        return this.f44617a;
    }

    public T getData() {
        return this.f44619c;
    }

    public String getMsg() {
        return this.f44618b;
    }

    public boolean isSuccess() {
        return this.f44617a == 200;
    }

    public void setCode(int i) {
        this.f44617a = i;
    }

    public void setData(T t) {
        this.f44619c = t;
    }

    public void setMsg(String str) {
        this.f44618b = str;
    }

    @efb
    public String toString() {
        return "BaseHttpResult{code=" + this.f44617a + ", msg='" + this.f44618b + "', data=" + this.f44619c + '}';
    }
}
