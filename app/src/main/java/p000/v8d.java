package p000;

import androidx.lifecycle.AbstractC1158q;

/* JADX INFO: loaded from: classes3.dex */
@we3
public interface v8d {
    @hib
    @old("SELECT long_value FROM Preference where `key`=:key")
    Long getLongValue(@efb String key);

    @efb
    @old("SELECT long_value FROM Preference where `key`=:key")
    AbstractC1158q<Long> getObservableLongValue(@efb String key);

    @p48(onConflict = 1)
    void insertPreference(@efb u8d preference);
}
