package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class y48 {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f100330a = new ArrayList<>();

    public y48 append(@eib Object obj) {
        this.f100330a.add(String.valueOf(obj));
        return this;
    }

    public y48 appendKeyValue(String str, @eib Object obj) {
        this.f100330a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f100330a.toString();
    }
}
