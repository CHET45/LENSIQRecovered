package p000;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes3.dex */
public interface kra {
    void onCreateMenu(@efb Menu menu, @efb MenuInflater menuInflater);

    default void onMenuClosed(@efb Menu menu) {
    }

    boolean onMenuItemSelected(@efb MenuItem menuItem);

    default void onPrepareMenu(@efb Menu menu) {
    }
}
