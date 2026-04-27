package p000;

import java.util.List;
import p000.zg4;

/* JADX INFO: loaded from: classes5.dex */
public interface ah4 extends rsa {
    long getBucketCounts(int i);

    int getBucketCountsCount();

    List<Long> getBucketCountsList();

    zg4.C16121b getBucketOptions();

    long getCount();

    zg4.C16124e getExemplars(int i);

    int getExemplarsCount();

    List<zg4.C16124e> getExemplarsList();

    double getMean();

    zg4.C16126g getRange();

    double getSumOfSquaredDeviation();

    boolean hasBucketOptions();

    boolean hasRange();
}
